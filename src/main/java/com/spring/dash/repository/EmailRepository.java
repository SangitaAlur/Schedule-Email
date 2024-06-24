package com.spring.dash.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.dash.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
