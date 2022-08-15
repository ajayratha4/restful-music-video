package com.restfulmusicvideo.restfulmusicvideo.service;

import java.util.List;

import com.restfulmusicvideo.restfulmusicvideo.entity.Song;

public interface SongServices {

	public List<Song> getAllSongs();

	public String CreateSong(Song song);
}
