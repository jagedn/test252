package test
import grails.test.mixin.TestFor
import grails.test.spock.IntegrationSpec

@TestFor(TestController)
class TestIntegrationSpec extends IntegrationSpec {

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
	params.offset = 'caca'
        controller.index()

        then:
        true
    }

}
