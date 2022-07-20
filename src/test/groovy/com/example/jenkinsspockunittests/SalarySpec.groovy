package com.example.jenkinsspockunittests

import spock.lang.Specification

class SalarySpec extends Specification {

    def "Maximum of #a and #b is #c"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }
}
