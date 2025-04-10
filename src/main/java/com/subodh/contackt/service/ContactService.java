package com.subodh.contackt.service;

import com.subodh.contackt.model.Contact;
import com.subodh.contackt.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact contact) {
        if (contactRepository.existsById(id)) {
            contact.setId(id);
            return contactRepository.save(contact);
        }
        return null;
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
