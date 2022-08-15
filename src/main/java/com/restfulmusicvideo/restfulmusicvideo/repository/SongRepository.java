package com.restfulmusicvideo.restfulmusicvideo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restfulmusicvideo.restfulmusicvideo.entity.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

}
