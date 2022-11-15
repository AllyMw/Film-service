package ru.mitrofan.Filmservice.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "film")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class FilmEntity {
    @Id
    @Column(name = "imdb_id")
    private String imdbID;

    @Column(name = "title")
    private String title;

    @Column(name = "year_of_release")
    private String year;

    @Column(name = "rated")
    private String ageRate;

    @Column(name = "released")
    private String releaseYear;

    @Column(name = "runtime")
    private String filmTime;

    @Column(name = "genre")
    private String genres;

    @Column(name = "director")
    private String director;

    @Column(name = "writer")
    private String writers;

    @Column(name = "actor")
    private String actors;

    @Column(name = "plot")
    private String plot;

    @Column(name = "language_of")
    private String language;

    @Column(name = "country")
    private String country;

    @Column(name = "award")
    private String awards;

    @Column(name = "poster")
    private String posterUrl;

    @Column(name = "metascore")
    private String metascore;

    @Column(name = "imdb_rating")
    private String imdbRating;

    @Column(name = "imdb_vote")
    private String imdbVotes;

    @Column(name = "type")
    private String type;

    @Column(name = "dvd")
    private String dvd;

    @Column(name = "box_office")
    private String boxOffice;

    @Column(name = "production")
    private String production;

    @Column(name = "website")
    private String website;
}