package net.zetetic.database.sqlcipher;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes13.dex */
public class SupportHelper implements SupportSQLiteOpenHelper {
    public SQLiteOpenHelper OLrzqt;

    public SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(configuration, bArr, sQLiteDatabaseHook, z, 0);
    }

    public SupportHelper(final SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.OLrzqt = new SQLiteOpenHelper(configuration.context, configuration.name, bArr, null, configuration.callback.version, i, null, sQLiteDatabaseHook, z) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void KWHzl(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onCreate(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void OLrzqt(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onUpgrade(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void copydefault(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onDowngrade(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void EZpvd(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onOpen(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void OLrzqt(SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onConfigure(sQLiteDatabase);
            }
        };
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.OLrzqt.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.OLrzqt.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.OLrzqt.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return this.OLrzqt.getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.OLrzqt.close();
    }
}
