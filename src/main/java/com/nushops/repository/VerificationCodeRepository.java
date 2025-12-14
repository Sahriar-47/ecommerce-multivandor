package com.nushops.repository;

import com.nushops.model.User;
import com.nushops.model.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeRepository extends JpaRepository<VerificationCode, Long> {
    VerificationCode findByEmail(String email);

    String user(User user);
}
