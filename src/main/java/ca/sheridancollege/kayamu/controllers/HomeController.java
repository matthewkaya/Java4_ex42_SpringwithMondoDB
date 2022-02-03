package ca.sheridancollege.kayamu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.kayamu.beans.Appointment;
import ca.sheridancollege.kayamu.repositories.AppointmentRepository;

@Controller
public class HomeController {
	
	@Autowired
	private	AppointmentRepository appointmentRepository;
	
	

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("appointmentList", appointmentRepository.findAll());
		model.addAttribute("appointment", new Appointment());
        return "index";
	}
	
	@PostMapping("/sendInfo")
	public String sendStudent (Model model, @ModelAttribute Appointment appointment)
	{
		appointment.setId(null);
		appointmentRepository.save(appointment);

		return "redirect:/";
	}

}
