package com.astar.auth.payload.request;

import lombok.Data;
import javax.validation.constraints.*;
@Data
public class LoginRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;
}
