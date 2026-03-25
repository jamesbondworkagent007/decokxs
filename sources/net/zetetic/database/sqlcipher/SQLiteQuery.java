package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteQuery extends SQLiteProgram {
    public final CancellationSignal AYXKKw;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.AYXKKw = cancellationSignal;
    }

    public int OLrzqt(CursorWindow cursorWindow, int i, int i2, boolean z) {
        OLrzqt();
        try {
            cursorWindow.acquireReference();
            try {
                try {
                    return djBIcL().KWHzl(valueOf(), copydefault(), cursorWindow, i, i2, z, AYXKKw(), this.AYXKKw);
                } catch (SQLiteDatabaseCorruptException e) {
                    gEmmrt();
                    throw e;
                } catch (SQLiteException e2) {
                    e2.getMessage();
                    valueOf();
                    throw e2;
                }
            } finally {
                cursorWindow.releaseReference();
            }
        } finally {
            KWHzl();
        }
    }

    public String toString() {
        return "SQLiteQuery: " + valueOf();
    }
}
