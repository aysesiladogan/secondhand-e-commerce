package com.example.secondhand.user.model

import java.time.LocalDateTime

data class BaseEntity(val createdDate: LocalDateTime? = null,
                      val updatedDate: LocalDateTime? = null){

}
