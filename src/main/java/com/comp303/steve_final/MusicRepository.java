package com.comp303.steve_final;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("mysql")
public interface MusicRepository extends JpaRepository<MusicRecord,Long> {

}
