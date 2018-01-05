package at.fh.ima.swengs.angularfighter.api.model;

import java.util.Calendar;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="FireFighter")
public class FireFighter {
	
	
	@Id
	@Column(name = "FireFighterID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 30)
	private String title;
	
	@Column(nullable = false, length = 30)
	private String surname;
	
	@Column(nullable = false, length = 30)
    private String name;
    
	@ManyToOne
	private Rank rank;
    
    @ManyToOne
	private FireBrigade fireBrigade;
    
    @ManyToOne
	private FireFighterStatus fireFighterStatus;
     
	@Column(name = "streetName", nullable = false, length = 45)
    private String streetName;
    
	@Column(name = "postalCode", nullable = false, length = 8)
    private String postalCode; 

	@Column(name = "postTown", nullable = false, length = 45)
    private String postTown;
    
	@Column(name = "gender", nullable = false, length = 1)
    private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dayOfBirth", nullable = false)
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Calendar dayOfBirth;   
	
	@OneToOne(cascade = CascadeType.ALL)
    
    @Version
	long version;
    

    public FireFighter() {
    }

	public FireFighter(String title, String surname, String name, Rank rank,
					   FireBrigade fireBrigade, FireFighterStatus fireFighterStatus, String streetName, String postalCode, String postTown, String gender,
					   Calendar dayOfBirth) {
		super();
		this.title = title;
		this.surname = surname;
		this.name = name;
		this.rank = rank;
		this.fireBrigade = fireBrigade;
		this.fireFighterStatus = fireFighterStatus;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.postTown = postTown;
		this.gender = gender;
		this.dayOfBirth = dayOfBirth;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Rank getRank() {
		return rank;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public FireBrigade getFireBrigade() {
		return fireBrigade;
	}

	public void setFireBrigade(FireBrigade fireBrigade) {
		this.fireBrigade=fireBrigade;
	}
	
	public FireFighterStatus getFireFighterStatus() {
		return fireFighterStatus;
	}

	public void setFireFighterStatus(FireFighterStatus fireFighterStatus) {
		this.fireFighterStatus=fireFighterStatus;
	}
	
	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostTown() {
		return postTown;
	}


	public void setPostTown(String postTown) {
		this.postTown = postTown;
	}

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public Calendar getDayOfBirth() {
		return dayOfBirth;
	}


	public void setDayOfBirth(Calendar dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}


	@Override
	public String toString() {
		return "FireFighter [id=" + id + ", title=" + title + ", surname=" + surname + ", name=" + name + ", rank="
				+ rank + ", fireBrigade=" + fireBrigade + ", fireFighterStatus=" + fireFighterStatus + ", streetName="
				+ streetName + ", postalCode=" + postalCode + ", postTown=" + postTown + ", gender=" + gender
				+ ", dayOfBirth=" + dayOfBirth + "]";
	}
	
	
	
	
	
	
}
