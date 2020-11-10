package nl.danielmast.goldfinchbackend.user

import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    fun getUserById(id: Long): User? = users[id]

    fun getUsers(): Collection<User> = users.values

    companion object {
        private val users = mapOf(
                1L to User(1L, "John", Gender.MALE, Orientation.STRAIGHT, "Hi, I'm cool John"),
                2L to User(2L, "Mary", Gender.FEMALE, Orientation.STRAIGHT, "Always happy"),
                3L to User(3L, "Leo", Gender.MALE, Orientation.GAY, "Leo the lion!"),
                4L to User(4L, "Julia", Gender.FEMALE, Orientation.BI, "I like everyone!")
        )
    }
}