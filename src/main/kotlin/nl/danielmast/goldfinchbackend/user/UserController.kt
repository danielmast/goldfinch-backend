package nl.danielmast.goldfinchbackend.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id: Long) = userService.getUserById(id)

    @GetMapping("/users")
    fun getUsers() = userService.getUsers()
}