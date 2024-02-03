package com.mewtow.cardProcessor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.opencsv.bean.CsvBindByPosition;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name ="tb_transaction")
public class Transaction {
	
	@Id
	@CsvBindByPosition(position = 1)
	private Long id;

	@ManyToOne
	@JsonIgnoreProperties("transaction")
	private Person person_id;

	@NotNull
	@CsvBindByPosition(position = 2)
	private String transaction_date;

	@NotNull
	@CsvBindByPosition(position = 6)
	private int amount;
	
}
