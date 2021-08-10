package br.com.guilherme.comissiondeal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Comission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comissionId;

    @Positive
    @NotNull
    private Double comissionPercent;

    public Long getComissionId() {
        return comissionId;
    }

    public void setComissionId(Long comissionId) {
        this.comissionId = comissionId;
    }

    public Double getComissionPercent() {
        return comissionPercent;
    }

    public void setComissionPercent(Double comissionPercent) {
        this.comissionPercent = comissionPercent;
    }
}
