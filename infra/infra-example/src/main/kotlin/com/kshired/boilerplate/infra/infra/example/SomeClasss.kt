package com.kshired.boilerplate.infra.infra.example

import com.kshired.boilerplate.domain.user.SomeInterface
import org.springframework.stereotype.Component

@Component
class SomeClass: SomeInterface {
    override fun someFunction(): String {
        return "someFunction"
    }
}
