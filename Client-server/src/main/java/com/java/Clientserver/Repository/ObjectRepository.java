package com.java.Clientserver.Repository;

import com.java.Clientserver.Model.Object;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
@Async
public interface ObjectRepository extends JpaRepository<Object,Long> {

}
