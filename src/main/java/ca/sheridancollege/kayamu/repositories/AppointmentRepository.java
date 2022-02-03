package ca.sheridancollege.kayamu.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ca.sheridancollege.kayamu.beans.Appointment;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {

}
