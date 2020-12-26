package com.pralay.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pralay.constants.AppConstants;
import com.pralay.entity.Contact;
import com.pralay.props.AppProperties;
import com.pralay.service.ContactService;


@Controller
public class ContactController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/loadForm")
	public String loadForm(Model model) {
		logger.debug("********loadForm() execution started*********");
		model.addAttribute("contact",new Contact());
		logger.debug("*******loadForm() execution completed********");
		logger.info("******loadForm() executed successfully....******");
		return AppConstants.INDEX_VIEW;
	}
	
	@PostMapping("/saveContact")
	public String handleSaveContactBtn(Contact contact, RedirectAttributes attributes) {
		logger.debug("********saveContact execution started*********");
		Map<String, String> messages = appProps.getMessages();
		String msgTxt= null;
		
		if(contact.getContactId()==null) {
			msgTxt = messages.get(AppConstants.SUCCESS_MSG);
		}else {
			msgTxt = messages.get(AppConstants.UPDATE_SUCCESS);
		}
		
		boolean isSaved = contactService.saveContact(contact);
		
		if(isSaved) {
			logger.info("****Contact Saved Successfully******");
			attributes.addFlashAttribute(AppConstants.SUCCESS_MSG, msgTxt);
		}else {
			logger.info("******Contact Save Failed******");
			attributes.addFlashAttribute(AppConstants.ERROR_MSG, messages.get(AppConstants.SAVE_FAIL));
		}
		logger.debug("********saveContact execution ended*********");
		return "redirect:/loadForm";
	}
	
	@GetMapping("/viewContacts")
	public String handleViewContactsHyperlink(Model model) {
		logger.debug("********viewContacts execution started*********");
		List<Contact> contactsList = contactService.getAllContacts();
		if(contactsList.isEmpty()) {
			logger.info("******Contact Are Not Available in DB******");
		}
//		System.out.println("-----------------------------"+contactsList.toString());
		model.addAttribute("contacts", contactsList);
		logger.debug("********viewContacts execution ended*********");
		logger.info("********viewContacts execution completed successfully*********");
		return "viewContacts";
	}
	
	@GetMapping("/edit")
	public String handleEditClick(@RequestParam("cid") Integer cid, Model model) {
		logger.debug("*******execution started for edit click********");
		Contact contactObj = contactService.getContactById(cid);
		
		model.addAttribute("contact", contactObj);
		logger.debug("*******execution completed for edit click********");
		logger.debug("*******execution completed successfully for edit click********");
		return AppConstants.INDEX_VIEW;
	}
	
	@GetMapping("/delete")
	public String handleDeleteClick(@RequestParam("cid") Integer cid) {
		logger.debug("******Execution started for deleting contact******");
		contactService.deleteContactById(cid);
		logger.debug("******Execution completed for deleting contact******");
		logger.info("******contact deleted successfully******");
		return "redirect:/viewContacts";
	}
	
}
