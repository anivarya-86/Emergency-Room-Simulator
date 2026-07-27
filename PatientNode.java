package EmergencyRoomSimulator;

public class  PatientNode implements Comparable<PatientNode>{

     String PatientName;
    int age;
    int severityLevel;

    public PatientNode(String patientName, int age , int severityLevel) {
        PatientName = patientName;
        this.age = age;
        this.severityLevel = severityLevel;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    @Override
    public int compareTo(PatientNode o) {
        return Integer.compare(o.severityLevel , severityLevel);
    }

    @Override
    public String toString() {
        return "PatientNode{" +
                "PatientName='" + PatientName + '\'' +
                ", age=" + age +
                ", severityLevel=" + severityLevel +
                '}';
    }
}
