package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

//import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteDatabase;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.exception.ExpenseManagerException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;

/**
 * Created by Yasiru on 12/3/2015.
 */
public class PersistentExpenseManager extends ExpenseManager {

    private SQLiteDatabase mydatabase;

    public PersistentExpenseManager() throws ExpenseManagerException{
        setup();
    }

    public PersistentExpenseManager(SQLiteDatabase database) throws ExpenseManagerException{
        this.mydatabase = database;
        setup();
    }

    @Override
    public void setup() throws ExpenseManagerException {
        TransactionDAO persistenceTransactionDAO = new PersistentTransactionDAO(mydatabase);
        setTransactionsDAO(persistenceTransactionDAO);

//        TransactionDAO persistenceTransactionDAO = new PersistentTransactionDAO();
//        setTransactionsDAO(persistenceTransactionDAO);

        AccountDAO persistenceAccountDAO = new PersistentAccountDAO(mydatabase);
        setAccountsDAO(persistenceAccountDAO);

//        AccountDAO persistenceAccountDAO = new PersistentAccountDAO();
//        setAccountsDAO(persistenceAccountDAO);

    }
}
