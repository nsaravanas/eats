package com.eats.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Track {

	@Id
	private Long trackId;

	@OneToMany
	private List<TimeCoorinate> timeCoorinates;

}
