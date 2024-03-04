package com.test.login_register.entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.JoinColumn;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles = new ArrayList<>();
    
    
    
    public Long getId() {
    	return this.id;
    }
    
    public void setId( Long id2 ) {
    	this.id= id2;
    }

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setName(String string) {
		this.name= string;
		
	}

	public void setEmail(String email2) {
		this.email= email2;
		
	}

	public void setPassword(String encode) {
		this.password= encode;
		
	}

	public void setRoles(List<Role> asList) {
		this.roles= asList;
		
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	public java.util.Collection<Role> getRoles() {
		// TODO Auto-generated method stub
		return this.roles;
	}

	
	

	
    
    

}