package jko.kotlincompilerplugins

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class UserEntity(

    @Id
    private val id: Long
)
