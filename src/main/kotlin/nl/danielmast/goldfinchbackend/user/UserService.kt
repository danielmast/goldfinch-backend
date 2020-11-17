package nl.danielmast.goldfinchbackend.user

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUserById(id: Long): User? = userRepository.findUserById(id)

    fun getUserByUsername(username: String): User? = userRepository.findUserByUsername(username)

    fun getUsers(): Iterable<User> = userRepository.findAll()

    @PostConstruct
    fun populateDatabase() {
        userRepository.deleteAll()
        val john = User(null, "john", "John", Gender.MALE, Orientation.STRAIGHT, "Hi, I'm cool John")
        val mary = User(null, "mary", "Mary", Gender.FEMALE, Orientation.STRAIGHT, "Always happy")
        val leo = User(null, "leo", "Leo", Gender.MALE, Orientation.GAY, "Leo the lion!")
        val julia = User(null, "julia", "Julia", Gender.FEMALE, Orientation.BI, "I like everyone!")
        setOf(john, mary, leo, julia).forEach { userRepository.save(it) }
    }
}