package com.restfulmusicvideo.restfulmusicvideo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulmusicvideo.restfulmusicvideo.entity.Song;
import com.restfulmusicvideo.restfulmusicvideo.service.SongServices;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/songs")
public class SongsController {

	@Autowired
	private SongServices songServices;

	@GetMapping
	public List<Song> getAllSongs() {
		return this.songServices.getAllSongs();

	}

	@PostMapping(path = "/add")
	public String CreateSong(@RequestBody Song song) {
		return this.songServices.CreateSong(song);
	}

}
