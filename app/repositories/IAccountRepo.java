package repositories;

import domains.Account;
import domains.Customer;

import java.util.List;

public interface IAccountRepo {
    boolean addAccount(Account newAccount);
    Account getAccountByEmail(String email);
    Account getAccountById(Long id);
    List<Account> getAllAccounts();
    boolean deleteAccount(Account account);
}
