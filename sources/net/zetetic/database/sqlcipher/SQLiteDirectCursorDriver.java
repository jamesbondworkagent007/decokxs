package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import android.os.CancellationSignal;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
    public final String AEQbTJ;
    public final CancellationSignal EZpvd;
    public final SQLiteDatabase KWHzl;
    public SQLiteQuery OLrzqt;
    public final String copydefault;

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void EZpvd() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void OLrzqt() {
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public void copydefault(Cursor cursor) {
    }

    public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
        this.KWHzl = sQLiteDatabase;
        this.AEQbTJ = str2;
        this.copydefault = str;
        this.EZpvd = cancellationSignal;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteCursorDriver
    public Cursor AEQbTJ(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr) {
        Cursor cursorEZpvd;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.KWHzl, this.copydefault, this.EZpvd);
        try {
            sQLiteQuery.copydefault(strArr);
            if (cursorFactory == null) {
                cursorEZpvd = new SQLiteCursor(this, this.AEQbTJ, sQLiteQuery);
            } else {
                cursorEZpvd = cursorFactory.EZpvd(this.KWHzl, this, this.AEQbTJ, sQLiteQuery);
            }
            this.OLrzqt = sQLiteQuery;
            return cursorEZpvd;
        } catch (RuntimeException e) {
            sQLiteQuery.close();
            throw e;
        }
    }

    public Cursor copydefault(SQLiteDatabase.CursorFactory cursorFactory, Object... objArr) {
        Cursor cursorEZpvd;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this.KWHzl, this.copydefault, this.EZpvd);
        try {
            sQLiteQuery.KWHzl(objArr);
            if (cursorFactory == null) {
                cursorEZpvd = new SQLiteCursor(this, this.AEQbTJ, sQLiteQuery);
            } else {
                cursorEZpvd = cursorFactory.EZpvd(this.KWHzl, this, this.AEQbTJ, sQLiteQuery);
            }
            this.OLrzqt = sQLiteQuery;
            return cursorEZpvd;
        } catch (RuntimeException e) {
            sQLiteQuery.close();
            throw e;
        }
    }

    public String toString() {
        return "SQLiteDirectCursorDriver: " + this.copydefault;
    }
}
