package fenner.cuentas.service;

import fenner.cuentas.model.Account;
import fenner.cuentas.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccount(Integer id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public void store(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void destroy(Account account) {
        accountRepository.delete(account);
    }
}
