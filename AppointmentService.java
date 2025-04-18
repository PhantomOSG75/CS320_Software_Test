package Appointment;


import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments;
    
    public AppointmentService() {
        appointments = new ArrayList<>();
    }
    
    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment must not be null");
        }
        
        for (Appointment existingAppointment : appointments) {
            if (existingAppointment.getapptId().equals(appointment.getapptId())) {
                throw new IllegalArgumentException("Appointment ID must be unique");
            }
        }
        
        appointments.add(appointment);
    }
    
    public void deleteAppointment(String appointmentId) {
        if (appointmentId == null) {
            throw new IllegalArgumentException("Appointment ID must not be null");
        }
        
        for (Appointment appointment : appointments) {
            if (appointment.getapptId().equals(appointmentId)) {
                appointments.remove(appointment);
                return;
            }
        }
        
        throw new IllegalArgumentException("Appointment not found");
    }
    
    public List<Appointment> getAppointments() {
        return appointments;
    }

}