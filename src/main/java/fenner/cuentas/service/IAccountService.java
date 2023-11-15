package fenner.cuentas.service;

import fenner.cuentas.model.Account;

import java.util.List;

public interface IAccountService {
    public List<Account> getAccounts();
    public Account getAccount(Integer id);
    public void store(Account account);
    public void destroy(Account account);
}
