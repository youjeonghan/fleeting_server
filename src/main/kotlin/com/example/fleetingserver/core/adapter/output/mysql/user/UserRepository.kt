package com.example.fleetingserver.core.adapter.output.mysql.user

import com.example.fleetingserver.core.domain.model.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>
