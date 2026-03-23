package persistence;

import entity.Appointment;
import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository {

    private static AppointmentRepository instance;

    private AppointmentRepository() {
    }

    public static AppointmentRepository getInstance() {
        if (instance == null) {
            instance = new AppointmentRepository();
        }
        return instance;
    }

    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        try (Connection connection = DatabaseConnection.openConnection()) {
            // tạo sql
            String sql = "SELECT * FROM appointments";
            // tạo statement
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Appointment appointment = new Appointment(
                        rs.getInt("id"),
                        rs.getString("patient_name"),
                        rs.getDate("appointment_date"),
                        rs.getString("doctor_name"),
                        rs.getString("status")
                );
                appointments.add(appointment);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return appointments;
    }

//    public boolean addAppointment(Appointment appointment) {
//        try (Connection connection = DatabaseConnection.openConnection()) {
//
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//        }
//    }
}
