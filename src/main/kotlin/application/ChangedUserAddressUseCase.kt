package application

import data.ChangedUserAddress
import repository.UserRepository

class ChangedUserAddressUseCase(
    private val userRepository: UserRepository
) {

    fun execute(request: ChangedUserAddress) {
        val user = userRepository.findByIdOrNull(request.userEmail) ?: throw IllegalArgumentException("등록되지 않은 사용자 이메일입니다.")

        user.changeAddress(
            mainAddress = request.mainAddress,
            subAddress = request.subAddress
        )

        userRepository.save(user)
    }
}
