package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;

/**
 * Created by Yasiru on 12/3/2015.
 */
public class PersistentAccountDAO implements AccountDAO {

//    private final Map<String, Account> accounts;
    private SQLiteDatabase sqLiteDatabase;

    public PersistentAccountDAO(SQLiteDatabase database) {
//        this.accounts = new HashMap<>();
        this.sqLiteDatabase = database;
    }

    public PersistentAccountDAO() {
//        this.accounts = new HashMap<>();
    }

    @Override
    public List<String> getAccountNumbersList() {
        return null;
    }

    @Override
    public List<Account> getAccountsList() {
        return null;
    }

    @Override
    public Account getAccount(String accountNo) throws InvalidAccountException {
        return null;
    }

    @Override
    public void addAccount(Account account) {
        ContentValues values = new ContentValues();

        values.put("accountHolderName", account.getAccountHolderName());
        values.put("accountNo", account.getAccountNo());
        values.put("balance", account.getBalance());
        values.put("bankName", account.getBankName());

        sqLiteDatabase.insert("account", null, values);
    }

    @Override
    public void removeAccount(String accountNo) throws InvalidAccountException {

    }

    @Override
    public void updateBalance(String accountNo, ExpenseType expenseType, double amount) throws InvalidAccountException {

    }
}
