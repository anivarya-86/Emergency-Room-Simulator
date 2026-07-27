package EmergencyRoomSimulator;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom  {

    PriorityQueue<PatientNode> patientNodes1 = new PriorityQueue<>();

    public void addPatient(PatientNode patientNode2){
        patientNodes1.add(patientNode2);
        System.out.println("✅" + patientNode2.getPatientName()
                  +"Patient Added");
    }
    public void treatNextPatient(){
       if (patientNodes1.isEmpty() ){
            System.out.println("❌ No patients in waiting room! Doctor can rest.");
       }

       else {
           PatientNode ptNode = patientNodes1.poll();
           System.out.println("🩺 Currently Treating: " + ptNode.getPatientName() +
                   " (Age: " + ptNode.getAge() + ", Severity: " + ptNode.getSeverityLevel() + ")");
       }
    }
    public void DisplayAllPatient(){
        if (patientNodes1.isEmpty()){
            System.out.println("No Patient");
        }
        else {
            for (PatientNode p : patientNodes1){
                System.out.println(p);
            }
        }
    }

}
