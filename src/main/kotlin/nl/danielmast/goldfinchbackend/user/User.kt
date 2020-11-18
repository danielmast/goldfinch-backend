package nl.danielmast.goldfinchbackend.user

import com.fasterxml.jackson.annotation.JsonIgnore
import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id
import org.neo4j.ogm.annotation.NodeEntity
import org.neo4j.ogm.annotation.Relationship

@NodeEntity
data class User(
        @Id @GeneratedValue var id: Long?,
        var username: String?,
        var name: String?,
        var gender: Gender?,
        var orientation: Orientation?,
        var text: String?
) {
    constructor() : this(null, null, null, null, null, null)

    @JsonIgnore
    @Relationship(type = "REVIEW") val reviews: MutableSet<Review> = mutableSetOf()
}