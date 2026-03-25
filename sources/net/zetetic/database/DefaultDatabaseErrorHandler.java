package net.zetetic.database;

import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    @Override // net.zetetic.database.DatabaseErrorHandler
    public void copydefault(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getPath();
        if (SQLiteDatabase.AEQbTJ()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            AEQbTJ(sQLiteDatabase.getPath());
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } finally {
                if (attachedDbs != null) {
                    Iterator<Pair<String, String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        AEQbTJ((String) it.next().second);
                    }
                } else {
                    AEQbTJ(sQLiteDatabase.getPath());
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            sQLiteDatabase.close();
        } catch (SQLiteException unused2) {
        }
    }

    public final void AEQbTJ(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.KWHzl(new File(str));
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
