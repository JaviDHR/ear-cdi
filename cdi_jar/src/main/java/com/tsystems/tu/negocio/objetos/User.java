package com.tsystems.tu.negocio.objetos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="username")
	@Size(max=30)
	@NotNull
	private String username;
	
	public User(long id, @Size(max = 30) @NotNull String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	public User() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
