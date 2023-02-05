import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.CheckingService;
import service.CreditService;
public class Inicio {
    public static void main(String[] args) {
        AccountRepository repository = new AccountRepository();
        CheckingService checkingService =new CheckingService(repository);
        CreditService creditService =new CreditService(repository); 

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Checking("A1534B", new BigDecimal("0.50")),
            new Checking("G4567H", new BigDecimal("200.00"))
        );
        accounts.forEach(account -> {
                //repository.createAccount(account)
                if (account instanceof Checking){
                    checkingService.createAccount((Checking)account);
                }else{
                    creditService.createAccount((Credit)account);
                }
            });
      // Account resultado= repository.retrieveAccount("G4567H");
       
       Checking checking= (Checking)repository.retrieveAccount("A1534B");
      checking.setBalance(checking.getBalance().add(new BigDecimal("100.00")));
      repository.updateAccount(checking);
      repository.deleteAccount("I5678J");
     System.out.println();
    }
}