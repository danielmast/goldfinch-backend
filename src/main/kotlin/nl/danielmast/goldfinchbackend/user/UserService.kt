package nl.danielmast.goldfinchbackend.user

import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUserById(id: Long): User? = userRepository.getUserById(id)

    fun getUsers(): Collection<User> = userRepository.getUsers()
}