package br.com.guilherme.comissiondeal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Positive
    @NotNull
    private Double acumulatedValue;

    public Long getAccountId() {
        return accountId;
    }

    public Double getAcumulatedValue() {
        return acumulatedValue;
    }
}
