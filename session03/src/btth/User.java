package btth;

import java.time.LocalDate;

public class User {
    private String id;
    private String email;
    private String password;
    private Boolean verified;
    private LocalDate createdAt;

    public User() {
    }

    public User(String id, String email, String password, Boolean verified, LocalDate createdAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.verified = verified;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getVerified() {
        return verified;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", verified=" + verified +
                ", createdAt=" + createdAt +
                '}';
    }
}
