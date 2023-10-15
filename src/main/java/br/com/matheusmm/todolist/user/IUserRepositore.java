package br.com.matheusmm.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepositore extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}
