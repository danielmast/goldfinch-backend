package nl.danielmast.goldfinchbackend.profile

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfileController(private val profileService: ProfileService) {

    @GetMapping("/profiles/{id}")
    fun getProfile(@PathVariable id: Long) = profileService.getProfileById(id)
}