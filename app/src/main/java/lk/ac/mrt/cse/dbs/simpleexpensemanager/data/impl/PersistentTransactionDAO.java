package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.database.sqlite.SQLiteDatabase;

import java.sql.DatabaseMetaData;
import java.util.Date;
import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Transaction;

/**
 * Created by Yasiru on 12/3/2015.
 */
public class PersistentTransactionDAO implements TransactionDAO {

    SQLiteDatabase sqLiteDatabase;

    public PersistentTransactionDAO() {

    }

    public PersistentTransactionDAO(SQLiteDatabase database) {
        this.sqLiteDatabase = database;
    }

    @Override
    public void logTransaction(Date date, String accountNo, ExpenseType expenseType, double amount) {

    }

    @Override
    public List<Transaction> getAllTransactionLogs() {
        return null;
    }

    @Override
    public List<Transaction> getPaginatedTransactionLogs(int limit) {
        return null;
    }
}
