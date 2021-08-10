package br.com.guilherme.comissiondeal.model;

import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.data.annotation.Reference;

import javax.persistence.*;

@Entity
public class ComissionUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User comissionedUserId;

    @ManyToOne
    private User userId;

    @ManyToOne
    private Comission comissionId;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public User getComissionedUserId() {
        return comissionedUserId;
    }

    public void setComissionedUserId(User comissionedUserId) {
        this.comissionedUserId = comissionedUserId;
    }

    public User getBuyerUser() {
        return userId;
    }

    public void setBuyerUser(User userId) {
        this.userId = userId;
    }

    public Comission getComissionId() {
        return comissionId;
    }

    public void setComissionId(Comission comissionId) {
        this.comissionId = comissionId;
    }
}
