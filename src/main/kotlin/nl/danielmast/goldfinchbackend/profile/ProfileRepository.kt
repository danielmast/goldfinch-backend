package nl.danielmast.goldfinchbackend.profile

import nl.danielmast.goldfinchbackend.user.User
import org.springframework.stereotype.Repository

@Repository
class ProfileRepository {
    fun getProfileById(id: Long): Profile? = profiles[id]

    companion object {
        private val profiles = mapOf(
                1L to Profile(User(1L, "John"), Gender.MALE, Orientation.STRAIGHT, "Hi, I'm cool John"),
                2L to Profile(User(2L, "Mary"), Gender.FEMALE, Orientation.STRAIGHT, "Always happy"),
                3L to Profile(User(3L, "Leo"), Gender.MALE, Orientation.GAY, "Leo the lion!"),
                4L to Profile(User(4L, "Julia"), Gender.FEMALE, Orientation.BI, "I like everyone!")
        )
    }
}