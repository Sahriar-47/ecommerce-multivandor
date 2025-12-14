package com.nushops.service;

import com.nushops.domain.USER_ROLE;
import com.nushops.response.AuthResponse;
import com.nushops.request.LoginRequest;
import com.nushops.response.SignupRequest;

public interface AuthService {
    String createUser(SignupRequest req) throws Exception;
    void sentLoginOtp(String email, USER_ROLE role) throws Exception;
    AuthResponse signing (LoginRequest req);
}
