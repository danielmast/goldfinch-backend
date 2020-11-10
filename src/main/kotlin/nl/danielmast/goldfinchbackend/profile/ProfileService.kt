package nl.danielmast.goldfinchbackend.profile

import org.springframework.stereotype.Service

@Service
class ProfileService(private val profileRepository: ProfileRepository) {
    fun getProfileById(id: Long): Profile? = profileRepository.getProfileById(id)
}