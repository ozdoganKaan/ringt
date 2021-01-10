package com.swe.service;

import java.util.ArrayList;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.swe.entity.Ringtone;
import com.swe.repository.RingtoneRepository;

@Service
@Transactional
public class RingtoneService {

	@Autowired
	private RingtoneRepository ringtoneRepository;
	
	public Long create(Ringtone ringtone) {
		return ringtoneRepository.insert(ringtone);
}
	public void remove(Ringtone ringtone) {
		 ringtoneRepository.delete(ringtone);
}
	/*
	public ArrayList<Ringtone> bringList() {
		
		 return ringtoneRepository.getAll();
}
*/
}
	