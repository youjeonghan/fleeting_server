package com.example.fleetingserver.core.domain.port.output

import com.example.fleetingserver.core.domain.model.user.User

interface UserQueryPort {
    fun find(id: Long): User?
}
