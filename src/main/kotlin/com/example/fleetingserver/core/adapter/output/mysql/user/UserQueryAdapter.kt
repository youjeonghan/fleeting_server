package com.example.fleetingserver.core.adapter.output.mysql.user

import com.example.fleetingserver.DevDescription
import com.example.fleetingserver.DevUp
import com.example.fleetingserver.core.domain.model.user.User
import com.example.fleetingserver.core.domain.port.output.UserQueryPort
import org.springframework.stereotype.Component

@Component
@DevDescription(DevUp.`port, adapter 구분하는 이유`)
class UserQueryAdapter(
    private val userRepository: UserRepository,
) : UserQueryPort {
    @DevDescription(DevUp.`get find 구분하기`)
    override fun find(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }
}
