//Aqui onde ficam as requisições http.

package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/user"): Mapeia url do controlador. Acessa pela 8080/user
//Indica que se trata de um controlador rest, retorna status e json. Usado em API
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	//Quando houver uma requisição Get na rota user, chama meu metodo abaixo
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	//Não pode ter dois get no mesmo endereço. Preciso passar uma outra url para diferenciar. 
	@GetMapping(value="/1")
	public String hello1() {
		return "Hello User1";
	}
}
