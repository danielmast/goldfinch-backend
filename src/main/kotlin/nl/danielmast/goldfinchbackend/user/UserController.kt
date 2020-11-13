package nl.danielmast.goldfinchbackend.user

import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id: Long) = userService.getUserById(id)

    @GetMapping("/users")
    fun getUsers() = userService.getUsers()
}