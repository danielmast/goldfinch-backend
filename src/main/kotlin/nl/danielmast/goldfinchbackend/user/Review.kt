package nl.danielmast.goldfinchbackend.user

import org.neo4j.ogm.annotation.*

@RelationshipEntity(type = "REVIEW")
data class Review(
        @Id @GeneratedValue val id: Long?,
        @StartNode val reviewer: User,
        @EndNode val reviewee: User,
        @Property val positive: Boolean
)