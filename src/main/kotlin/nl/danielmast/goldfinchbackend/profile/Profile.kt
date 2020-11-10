package nl.danielmast.goldfinchbackend.profile

import nl.danielmast.goldfinchbackend.user.User

data class Profile(val user: User, var gender: Gender, var orientation: Orientation, var text: String) {
}