package io.minpro.contactapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.minpro.contactapi.domain.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {  // String coz our id is String

    Optional<Contact> findById(String id); // trying to find user by id and it is possible that id may not be avalible so OPtional
}
