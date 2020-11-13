package nl.danielmast.goldfinchbackend.user

import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : Neo4jRepository<User, Long> {
    fun findUserById(id: Long): User?
}