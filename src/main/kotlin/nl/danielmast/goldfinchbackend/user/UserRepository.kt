package nl.danielmast.goldfinchbackend.user

import org.springframework.data.neo4j.annotation.Query
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : Neo4jRepository<User, Long> {
    fun findUserById(id: Long): User?

    fun findUserByUsername(username: String): User?

    @Query("""MATCH (u1:User)<-[:REVIEW {positive: true}]-(u2:User),
(u2:User)<-[:REVIEW {positive: true}]-(u1:User)
WHERE ID(u1)=$0
RETURN u2""")
    fun findMatchesOfUserById(userId: Long): Collection<User>
}