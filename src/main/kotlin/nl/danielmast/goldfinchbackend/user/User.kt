package nl.danielmast.goldfinchbackend.user

data class User(val id: Long, var name: String, var gender: Gender, var orientation: Orientation, var text: String) {
}