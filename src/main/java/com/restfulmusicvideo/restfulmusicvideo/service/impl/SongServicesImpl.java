package com.restfulmusicvideo.restfulmusicvideo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.restfulmusicvideo.restfulmusicvideo.common.Response;
import com.restfulmusicvideo.restfulmusicvideo.entity.Song;
import com.restfulmusicvideo.restfulmusicvideo.repository.SongRepository;
import com.restfulmusicvideo.restfulmusicvideo.service.SongServices;

@Service
public class SongServicesImpl implements SongServices {

	@Autowired
	private SongRepository songRepository;
	@Autowired
	Response response;

	@Override
	public Response getAllSongs() {
		List<Song> data = (List<Song>) this.songRepository.findAll();
		response.setData(data);
		response.setStatus(HttpStatus.OK.value());
		return response;

	}

	@Override
	public String CreateSong(Song song) {
		this.songRepository.save(song);
		return "done";
	}

}
