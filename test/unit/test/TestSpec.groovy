package test

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification
import grails.test.mixin.TestFor
/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@TestFor(TestController)
class TestSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {

	when:
	controller.index()

	then:
	true
    }

    void "test params"() {

        when:
	params.kk = 'caca'
        controller.index()

        then:
        true
    }

}
