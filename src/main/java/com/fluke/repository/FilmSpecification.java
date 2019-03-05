package com.fluke.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.fluke.entity.Film;

import ch.qos.logback.core.pattern.SpacePadder;

@Repository
public class FilmSpecification {

	
	@Autowired FilmRepository filmRepos;
	
	public Page<Film> findByRating(Pageable pageable, String rating, String releaseYear){
		
		
		Specification<Film> spec = Specification.where(null);
		if(!StringUtils.containsWhitespace(rating)) {
			
			String value = rating.toLowerCase();
			value = StringUtils.trimAllWhitespace(value);
			
			final String param = value;
			
			// AND LOWER(rating) = :rating
			Specification<Film> specRating = (Specification<Film>) (root, query, builder)
					-> builder.equal(builder.function("LOWER", String.class, root.get("rating")), param);
					
					spec = Specification.where(specRating);
		}
		
		if(null != releaseYear && !StringUtils.containsWhitespace(releaseYear)) {
			
			String value = releaseYear.toLowerCase();
			value = StringUtils.trimAllWhitespace(value);
			
			final String param = value;
			
			// AND release_year = :releaseYear
			Specification<Film> specReleaseYear = (Specification<Film>) (root, query, builder)
					-> builder.equal(root.get("releaseYear"), param);
					
					spec = Specification.where(specReleaseYear);
		}
		
		
		Page<Film> result = filmRepos.findAll(spec, pageable);
		
		return result;
	}
	public List<Film> searchFilm(String title,String description,String releaseYear,String length,String rating){
		Specification<Film> spec = null;
		if(!StringUtils.isEmpty(title)) {
			String value = title.toLowerCase();
			System.out.print("spec title **********> "+value+" <*********");
			final String param = value;
			Specification<Film> specTitle = (Specification<Film>) (root, query, builder)
					-> builder.like(builder.function("LOWER", String.class,root.get("title")), "%"+param+"%");
//			builder.equal(builder.function("LOWER", String.class, root.get("title")), param);
					
					spec = Specification.where(specTitle);
		}
		if(!StringUtils.isEmpty(description)) {
			String value = description.toLowerCase();
			System.out.print("spec descip **********> "+value+" <*********");
			final String param = value;
			Specification<Film> specDescription = (Specification<Film>) (root, query, builder)
					-> builder.like(builder.function("LOWER", String.class,root.get("description")), "%"+param+"%");
//			builder.equal(builder.function("LOWER", String.class, root.get("title")), param);
					
					if(null != spec) {
						spec = spec.and(specDescription);
					}else {
						spec = Specification.where(specDescription);
					}
					
		}
		if(!StringUtils.isEmpty(releaseYear)) {
			Integer value = Integer.parseInt(releaseYear);
			System.out.print("spec descip **********> "+value+" <*********");
			final Integer param = value;
			Specification<Film> specReleaseYear = (Specification<Film>) (root, query, builder)
					-> builder.lessThan(root.get("releaseYear"), param);
//			builder.equal(builder.function("LOWER", String.class, root.get("title")), param);
					
					if(null != spec) {
						spec = spec.and(specReleaseYear);
					}else {
						spec = Specification.where(specReleaseYear);
					}
					
		}
		if(!StringUtils.isEmpty(length)) {
			Integer value = Integer.parseInt(length);
			System.out.print("spec descip **********> "+value+" <*********");
			final Integer param = value;
			Specification<Film> specLength = (Specification<Film>) (root, query, builder)
					-> builder.lessThan(root.get("length"), param);
//			builder.equal(builder.function("LOWER", String.class, root.get("title")), param);
					
					if(null != spec) {
						spec = spec.and(specLength);
					}else {
						spec = Specification.where(specLength);
					}
					
		}
		if(!StringUtils.isEmpty(rating)) {
			String value = rating;
			System.out.print("spec descip **********> "+value+" <*********");
			final String param = value;
			Specification<Film> specRating = (Specification<Film>) (root, query, builder)
					-> builder.equal(builder.function("LOWER", String.class, root.get("rating")), param);
//			builder.equal(builder.function("LOWER", String.class, root.get("title")), param);
					
					if(null != spec) {
						spec = spec.and(specRating);
					}else {
						spec = Specification.where(specRating);
					}
					
		}

		List<Film> result = filmRepos.findAll(spec);
		return result;
	}

}
