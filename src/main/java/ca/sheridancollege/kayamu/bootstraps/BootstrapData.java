package ca.sheridancollege.kayamu.bootstraps;


import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.kayamu.beans.Appointment;
import ca.sheridancollege.kayamu.repositories.AppointmentRepository;

@Component
public class BootstrapData implements CommandLineRunner {
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	//TODO - This method add data o production data
	public void run(String... args) throws Exception {
//		appointmentRepository.save(new Appointment(null,"Visit", LocalDateTime.parse("2022-11-01T01:00:00"), "Matthew Kaya"));
//		appointmentRepository.save(new Appointment(null,"Consulting", LocalDateTime.parse("2022-10-01T01:00:00"), "Jeffrey Hogan"));
//		appointmentRepository.save(new Appointment(null,"Dinner", LocalDateTime.parse("2022-09-01T01:00:00"), "Matthew Kaya"));
//		appointmentRepository.save(new Appointment(null,"Visit", LocalDateTime.parse("2022-08-01T01:00:00"),"Simon Hood"));
	}
	
}
