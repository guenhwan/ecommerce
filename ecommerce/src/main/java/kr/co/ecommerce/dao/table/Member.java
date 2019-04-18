package kr.co.ecommerce.dao.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "member")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(exclude = { "createDate", "updateDate" })
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_Id")
	private Long userId;

	@Column
	private String account;

	@Column
	private String password;

	@Column
	private String name;

	@Column(name = "birth_year")
	private int birthYear;

	@Column(name = "birth_month")
	private int birthMonth;

	@Column(name = "birth_day")
	private int birthDay;

	@Column
	private String email;

	@Column
	private String address;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Builder
	public Member(String account, String password, String name, int birthYear, int birthMonth, int birthDay,
			String email, String address, Date createDate, Date updateDate) {
		this.account = account;
		this.password = password;
		this.name = name;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.email = email;
		this.address = address;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

}
