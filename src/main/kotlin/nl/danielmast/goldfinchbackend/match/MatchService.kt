package nl.danielmast.goldfinchbackend.match

import nl.danielmast.goldfinchbackend.user.UserService
import org.springframework.stereotype.Service

@Service
class MatchService(private val userService: UserService, private val matchRepository: MatchRepository) {
//    fun getUserById(id: Long): User? = userRepository.getUserById(id)
}