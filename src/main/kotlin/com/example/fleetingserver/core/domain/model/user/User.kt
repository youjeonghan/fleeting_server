package com.example.fleetingserver.core.domain.model.user

import com.example.fleetingserver.DevDescription
import com.example.fleetingserver.DevUp
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@DevDescription(DevUp.`entity에 class 사용하기 data class는 왜??`)
@Entity
@Table(name = "user")
class User(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "name")
    val 이름: String,
) {
    override fun toString(): String {
        return "User(id=$id, 이름='$이름')"
    }
}
