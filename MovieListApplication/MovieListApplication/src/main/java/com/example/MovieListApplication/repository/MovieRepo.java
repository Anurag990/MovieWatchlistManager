package com.example.MovieListApplication.repository;import com.example.MovieListApplication.entity.Movie;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;@Repositorypublic interface MovieRepo extends JpaRepository<Movie,Integer> {}