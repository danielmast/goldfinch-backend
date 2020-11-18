package nl.danielmast.goldfinchbackend.user

import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable id: Long) = userService.getUserById(id)

    @GetMapping("/users/username/{username}")
    fun getUserByUsername(@PathVariable username: String) = userService.getUserByUsername(username)

    @GetMapping("/users/{id}/matches")
    fun getMatchesOfUserById(@PathVariable id: Long) = userService.getMatchesOfUserById(id)

    @GetMapping("/users")
    fun getUsers() = userService.getUsers()
}