package com.eats.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Track {

	@Id
	private Long trackId;

	@OneToMany(mappedBy = "track")
	private List<TimeCoorinate> timeCoorinates;

	public Long getTrackId() {
		return trackId;
	}

	public void setTrackId(Long trackId) {
		this.trackId = trackId;
	}

	public List<TimeCoorinate> getTimeCoorinates() {
		return timeCoorinates;
	}

	public void setTimeCoorinates(List<TimeCoorinate> timeCoorinates) {
		this.timeCoorinates = timeCoorinates;
	}

}
