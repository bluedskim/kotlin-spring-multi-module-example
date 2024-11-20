package com.kshired.boilerplate.infra.infra.example

import com.kshired.boilerplate.domain.user.SomeInterface

@Component
class SomeClasss: SomeInterface {
    override fun someFunction(): String {
        return "someFunction"
    }
}
