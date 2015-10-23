package com.musephoria.entity;
// Generated Oct 19, 2015 11:46:19 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cd generated by hbm2java
 */
@Entity
@Table(name = "cd", catalog = "musephoria")
@SuppressWarnings("serial")
public class Cd implements java.io.Serializable {

	private Integer cdId;
	private String name;
	private String description;
	private float price;
	private Integer quantity;
	private String genre;
	private String artist;
	private Date year;
	private String rating;
	private String review;
	private String language;
	private int numberOfTrack;
	private byte[] albumArt;
	private boolean isCdActive;
	private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);
	private Set<Track> tracks = new HashSet<Track>(0);
	private Set<Cartitem> cartitems = new HashSet<Cartitem>(0);

	public Cd() {
	}

	public Cd(String name, float price, String genre, String artist, Date year, int numberOfTrack, boolean isCdActive) {
		this.name = name;
		this.price = price;
		this.genre = genre;
		this.artist = artist;
		this.year = year;
		this.numberOfTrack = numberOfTrack;
		this.isCdActive = isCdActive;
	}

	public Cd(String name, String description, float price, Integer quantity, String genre, String artist, Date year,
			String rating, String review, String language, int numberOfTrack, byte[] albumArt, boolean isCdActive,
			Set<Orderitem> orderitems, Set<Track> tracks, Set<Cartitem> cartitems) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.genre = genre;
		this.artist = artist;
		this.year = year;
		this.rating = rating;
		this.review = review;
		this.language = language;
		this.numberOfTrack = numberOfTrack;
		this.albumArt = albumArt;
		this.isCdActive = isCdActive;
		this.orderitems = orderitems;
		this.tracks = tracks;
		this.cartitems = cartitems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CdId", unique = true, nullable = false)
	public Integer getCdId() {
		return this.cdId;
	}

	public void setCdId(Integer cdId) {
		this.cdId = cdId;
	}

	@Column(name = "Name", nullable = false, length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Price", nullable = false, precision = 12, scale = 0)
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Column(name = "Quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "Genre", nullable = false, length = 10)
	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Column(name = "Artist", nullable = false, length = 25)
	public String getArtist() {
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Year", nullable = false, length = 0)
	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	@Column(name = "Rating", length = 25)
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "Review", length = 10000)
	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Column(name = "Language", length = 25)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "NumberOfTrack", nullable = false)
	public int getNumberOfTrack() {
		return this.numberOfTrack;
	}

	public void setNumberOfTrack(int numberOfTrack) {
		this.numberOfTrack = numberOfTrack;
	}

	@Column(name = "AlbumArt")
	public byte[] getAlbumArt() {
		return this.albumArt;
	}

	public void setAlbumArt(byte[] albumArt) {
		this.albumArt = albumArt;
	}

	@Column(name = "IsCdActive", nullable = false)
	public boolean isIsCdActive() {
		return this.isCdActive;
	}

	public void setIsCdActive(boolean isCdActive) {
		this.isCdActive = isCdActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cd")
	public Set<Orderitem> getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cd")
	public Set<Track> getTracks() {
		return this.tracks;
	}

	public void setTracks(Set<Track> tracks) {
		this.tracks = tracks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cd")
	public Set<Cartitem> getCartitems() {
		return this.cartitems;
	}

	public void setCartitems(Set<Cartitem> cartitems) {
		this.cartitems = cartitems;
	}

}
