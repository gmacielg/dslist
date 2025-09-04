package com.intensivojava.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivojava.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	

}
