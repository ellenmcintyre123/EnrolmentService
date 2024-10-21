package atu.ie.enrolmentservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestBody("/details")
public class NotificationController {
    @PostMapping("/Confirm-details")
    public String someDetails(@RequestBody Enrolment enrolment){
        return("Recided details for student id"+ enrolment.getStudentId());
    }
}
