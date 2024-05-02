package tech.reliab.course.eremenkova.bank.service.impl;

import tech.reliab.course.eremenkova.bank.entity.Bank;
import tech.reliab.course.eremenkova.bank.entity.User;
import tech.reliab.course.eremenkova.bank.service.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserServiceImpl implements UserService {
    /**
     * Creates a user object with the specified parameters.
     *
     * @param id        the unique identifier of the user
     * @param fullName  the full name of the user
     * @param birthDate the birth date of the user
     * @param workplace the workplace of the user
     * @param usedBanks the list of banks used by the user
     * @return the created user object
     */

    @Override
    public User createUser(Long id, String fullName, LocalDate birthDate, String workplace, List<Bank> usedBanks) {
        Random random = new Random();
        User user = new User();
        user.setId(id);
        user.setFullName(fullName);
        user.setBirthDate(birthDate);
        user.setWorkplace(workplace);
        user.setMonthlyIncome(Math.round(random.nextDouble(10000) * 100.0) / 100.0);
        user.setUsedBanks(usedBanks);
        user.setCreditAccounts(new ArrayList<>());
        user.setPaymentAccounts(new ArrayList<>());
        user.setCreditRating(switch ((int) (user.getMonthlyIncome() / 1000)) {
            case 2 -> 200;
            case 3 -> 300;
            case 4 -> 400;
            case 5 -> 500;
            case 6 -> 600;
            case 7 -> 700;
            case 8 -> 800;
            case 9 -> 900;
            case 10 -> 1000;
            default -> 100;
        });
        return user;
    }

    @Override
    public User readUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(Long id) {
    }

    @Override
    public void deleteUser(Long id) {
    }
}
