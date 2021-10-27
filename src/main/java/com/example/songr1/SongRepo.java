package com.example.songr1;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepo extends CrudRepository<Song,Integer> {

}
