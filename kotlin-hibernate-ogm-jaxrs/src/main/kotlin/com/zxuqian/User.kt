package com.zxuqian

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User : Serializable {
    @Id
    @GeneratedValue
    val _id = 0
}