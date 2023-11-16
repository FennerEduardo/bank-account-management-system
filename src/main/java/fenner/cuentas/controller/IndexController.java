package fenner.cuentas.controller;

import fenner.cuentas.model.Account;
import fenner.cuentas.service.AccountService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Data
@ViewScoped
public class IndexController {

    @Autowired
    AccountService accountService;
    private List<Account> accounts;
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @PostConstruct
    public void init(){
        loadData();
    }

    public void loadData(){
        this.accounts = accountService.getAccounts();
        accounts.forEach((account) -> logger.info(account.toString()));
    }

}
