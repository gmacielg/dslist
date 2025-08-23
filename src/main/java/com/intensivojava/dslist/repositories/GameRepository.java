package com.intensivojava.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivojava.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	

}
