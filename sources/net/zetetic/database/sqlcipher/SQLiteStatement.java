package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteStatement extends SQLiteProgram implements SupportSQLiteStatement {
    public SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        OLrzqt();
        try {
            try {
                djBIcL().KWHzl(valueOf(), copydefault(), AYXKKw(), (CancellationSignal) null);
            } catch (SQLiteDatabaseCorruptException e) {
                gEmmrt();
                throw e;
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        OLrzqt();
        try {
            try {
                return djBIcL().copydefault(valueOf(), copydefault(), AYXKKw(), null);
            } catch (SQLiteDatabaseCorruptException e) {
                gEmmrt();
                throw e;
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        OLrzqt();
        try {
            try {
                return djBIcL().EZpvd(valueOf(), copydefault(), AYXKKw(), (CancellationSignal) null);
            } catch (SQLiteDatabaseCorruptException e) {
                gEmmrt();
                throw e;
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        OLrzqt();
        try {
            try {
                return djBIcL().OLrzqt(valueOf(), copydefault(), AYXKKw(), (CancellationSignal) null);
            } catch (SQLiteDatabaseCorruptException e) {
                gEmmrt();
                throw e;
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        OLrzqt();
        try {
            try {
                return djBIcL().AEQbTJ(valueOf(), copydefault(), AYXKKw(), null);
            } catch (SQLiteDatabaseCorruptException e) {
                gEmmrt();
                throw e;
            }
        } finally {
            KWHzl();
        }
    }

    public String toString() {
        return "SQLiteProgram: " + valueOf();
    }
}
