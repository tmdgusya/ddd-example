package repository

import domain.User

class UserRepository {

    private val repositroy = HashMap<String, User>()

    fun findByIdOrNull(id: String): User? {
        return repositroy[id]
    }

    fun save(user: User) {
        repositroy[user.email!!] = user
    }
}
