package com.devfun.vo;

import java.util.Objects;

public class MovieVO {
	private int movie_id;
	private String movie_name;
	private String director;
	private String types;

    public MovieVO(int movie_id, String movie_name, String director, String types) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.director = director;
        this.types = types;
    }
	
	public void setMovieId(int movie_id) {
		this.movie_id = movie_id;
	}

	public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setTypes(String types) {
		this.types = types;
	}
	
	public int getMovieId() {
		return this.movie_id;
	}
	
	public String getMovieName() {
		return this.movie_name;
	}

	public String getDirector() {
		return this.director;
	}
	
	public String getTypes() {
		return this.types;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieVO MovieVO = (MovieVO) o;
        return Objects.equals(movie_id, MovieVO.movie_id);
    }

	@Override
    public int hashCode() {
        return Objects.hash(movie_id);
    }
	

}
