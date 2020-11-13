package nl.danielmast.goldfinchbackend.user

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class UserService(private val userRepository: UserRepository) {
    fun getUserById(id: Long): User? = userRepository.findUserById(id)

    fun getUsers(): Iterable<User> = userRepository.findAll()

    @PostConstruct
    fun populateDatabase() {
        userRepository.deleteAll()
        var john = User(null, "John", Gender.MALE, Orientation.STRAIGHT, "Hi, I'm cool John")
        var mary = User(null, "Mary", Gender.FEMALE, Orientation.STRAIGHT, "Always happy")
        var leo = User(null, "Leo", Gender.MALE, Orientation.GAY, "Leo the lion!")
        var julia = User(null, "Julia", Gender.FEMALE, Orientation.BI, "I like everyone!")
        setOf(john, mary, leo, julia).forEach { userRepository.save(it) }
    }
}