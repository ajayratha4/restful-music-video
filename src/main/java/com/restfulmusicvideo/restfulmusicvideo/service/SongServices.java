package com.restfulmusicvideo.restfulmusicvideo.service;

import com.restfulmusicvideo.restfulmusicvideo.common.Response;
import com.restfulmusicvideo.restfulmusicvideo.entity.Song;

public interface SongServices {

	public Response getAllSongs();

	public String CreateSong(Song song);
}
