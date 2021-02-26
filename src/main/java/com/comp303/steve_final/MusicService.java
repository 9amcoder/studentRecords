package com.comp303.steve_final;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MusicService {

    @Qualifier("mysql")
    @Autowired
    private MusicRepository repository;

    public List<MusicRecord> listAll() {
        return repository.findAll();
    }

    public void save(MusicRecord musicRecord) {
        repository.save(musicRecord);
    }

    public MusicRecord get(long id) {
        return repository.findById(id).get();
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
