package br.com.guilherme.comissiondeal.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;


    @Size(min = 15, max = 200)
    @NotBlank
    private String userName;

    @CPF
    private String userCpf;

    @Email
    private String userEmail;

//    @Past
//    @Size(min = 10, max = 10)
//    private LocalDate userBirthDate;

    @Size(max = 40)
    @NotBlank
    private String userGender;

    @ManyToOne
    private Account accountId;

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String nomeUsuario) {
        this.userName = nomeUsuario;
    }

    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String cpfUsuario) {
        this.userCpf = cpfUsuario;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String emailUsuario) {
        this.userEmail = emailUsuario;
    }

//    public LocalDate getUserBirthDate() {
//        return userBirthDate;
//    }
//
//    public void setUserBirthDate(LocalDate dataNascUsuario) {
//        this.userBirthDate = dataNascUsuario;
//    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String generoUsuario) {
        this.userGender = generoUsuario;
    }
}
