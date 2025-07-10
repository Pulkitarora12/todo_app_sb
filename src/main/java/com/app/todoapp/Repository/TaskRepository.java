package com.app.todoapp.Repository;

import com.app.todoapp.Modules.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
