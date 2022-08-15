package com.restfulmusicvideo.restfulmusicvideo.entity;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String songName;
	private String songArtist;
	private String songImage;
	private String songSource;

	
	public Song() {
		super();
	}

	public Song(long id, String songName, String songArtist, String songImage, String songSource) {
		super();
		this.id = id;
		this.songName = songName;
		this.songArtist = songArtist;
		this.songImage = songImage;
		this.songSource = songSource;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongArtist() {
		return songArtist;
	}

	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}

	public String getSongImage() {
		return songImage;
	}

	public void setSongImage(String songImage) {
		this.songImage = songImage;
	}

	public String getSongSource() {
		return songSource;
	}

	public void setSongSource(String songSource) {
		this.songSource = songSource;
	}

}
