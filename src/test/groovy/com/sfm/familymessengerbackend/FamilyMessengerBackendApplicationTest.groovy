package com.sfm.familymessengerbackend

import spock.lang.Specification
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FamilyMessengerBackendApplicationTest extends Specification {
    def "context loads successfully"() {
        expect:
        true
    }
}
