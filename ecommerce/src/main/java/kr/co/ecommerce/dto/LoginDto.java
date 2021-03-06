package kr.co.ecommerce.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@EqualsAndHashCode
public class LoginDto {
	private String account;
	private String password;

	@Builder
	public LoginDto(String account, String password) {
		this.account = account;
		this.password = password;
	}

}
