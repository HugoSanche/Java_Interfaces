package service;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface AccountService {
    public void withdraw(String id, BigDecimal amount);
    public void deposit(String id, BigDecimal amount);
}