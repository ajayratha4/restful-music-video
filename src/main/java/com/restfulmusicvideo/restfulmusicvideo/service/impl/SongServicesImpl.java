package com.restfulmusicvideo.restfulmusicvideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulmusicvideo.restfulmusicvideo.entity.Song;
import com.restfulmusicvideo.restfulmusicvideo.repository.SongRepository;
import com.restfulmusicvideo.restfulmusicvideo.service.SongServices;

@Service
public class SongServicesImpl implements SongServices {

	@Autowired
	private SongRepository songRepository;

	@Override
	public List<Song> getAllSongs() {
		return (List<Song>) this.songRepository.findAll();
	}

	@Override
	public String CreateSong(Song song) {
		this.songRepository.save(song);
		return "done";
	}

}
