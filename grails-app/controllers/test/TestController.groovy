package test

class TestController {

    def index() { 

	println params
	params.kk = 'kk'
	println params
    }
}
