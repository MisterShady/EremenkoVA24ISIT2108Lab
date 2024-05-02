package tech.reliab.course.eremenkova.bank.service;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.User;

import java.time.LocalDate;
import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {
    /**
     * Create user.
     *
     * @param id        the id
     * @param fullName  the full name
     * @param birthDate the birth date
     * @param workplace the workplace
     * @param usedBanks the used banks
     * @return the user
     */
    User createUser(Long id, String fullName, LocalDate birthDate, String workplace, List<Bank> usedBanks);

    /**
     * Read user.
     *
     * @param id the id
     * @return the user
     */
    User readUser(Long id);

    /**
     * Update user.
     *
     * @param id the id
     */
    void updateUser(Long id);

    /**
     * Delete user.
     *
     * @param id the id
     */
    void deleteUser(Long id);
}
