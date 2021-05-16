package com.ltts.dao;

import org.springframework.data.repository.CrudRepository;

import com.ltts.model.MovieWebsite;

public interface BookingDao extends CrudRepository<MovieWebsite,String>{

}
