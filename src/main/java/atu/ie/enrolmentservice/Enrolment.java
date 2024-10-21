package atu.ie.enrolmentservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enrolment {
    private long enrolmentId;
    private long studentId;
    private String studentName;
    private String courseCode;
    private String enrollmentDate;
}
