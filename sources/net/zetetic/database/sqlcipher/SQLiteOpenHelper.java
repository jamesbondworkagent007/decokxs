package net.zetetic.database.sqlcipher;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public boolean AEQbTJ;
    public final int AYXKKw;
    public final String AhwBna;
    public byte[] AkhnZx;
    public final SQLiteDatabaseHook EZpvd;
    public SQLiteDatabase KWHzl;
    public final DatabaseErrorHandler OLrzqt;
    public final Context copydefault;
    public final SQLiteDatabase.CursorFactory djBIcL;
    public final int gEmmrt;
    public boolean valueOf;

    public void EZpvd(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void KWHzl(SQLiteDatabase sQLiteDatabase);

    public void OLrzqt(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void OLrzqt(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void copydefault(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.AhwBna;
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i, i2, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(context, str, copydefault(str2), cursorFactory, i, i2, databaseErrorHandler, sQLiteDatabaseHook, z);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        if (i < 1) {
            throw new IllegalArgumentException("Version must be >= 1, was " + i);
        }
        this.copydefault = context;
        this.AhwBna = str;
        this.AkhnZx = bArr;
        this.djBIcL = cursorFactory;
        this.gEmmrt = i;
        this.OLrzqt = databaseErrorHandler;
        this.EZpvd = sQLiteDatabaseHook;
        this.AEQbTJ = z;
        this.AYXKKw = Math.max(0, i2);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.AEQbTJ != z) {
                SQLiteDatabase sQLiteDatabase = this.KWHzl;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.KWHzl.isReadOnly()) {
                    if (z) {
                        this.KWHzl.enableWriteAheadLogging();
                    } else {
                        this.KWHzl.disableWriteAheadLogging();
                    }
                }
                this.AEQbTJ = z;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase; */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabaseCopydefault;
        synchronized (this) {
            sQLiteDatabaseCopydefault = copydefault(true);
        }
        return sQLiteDatabaseCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: getReadableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase; */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabaseCopydefault;
        synchronized (this) {
            sQLiteDatabaseCopydefault = copydefault(false);
        }
        return sQLiteDatabaseCopydefault;
    }

    public final SQLiteDatabase copydefault(boolean z) {
        SQLiteDatabase sQLiteDatabase = this.KWHzl;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.KWHzl = null;
            } else if (!z || !this.KWHzl.isReadOnly()) {
                return this.KWHzl;
            }
        }
        if (this.valueOf) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseCopydefault = this.KWHzl;
        try {
            this.valueOf = true;
            if (sQLiteDatabaseCopydefault == null) {
                String path = this.AhwBna;
                if (path == null) {
                    sQLiteDatabaseCopydefault = SQLiteDatabase.AEQbTJ((SQLiteDatabase.CursorFactory) null);
                } else {
                    try {
                        if (!path.startsWith("file:")) {
                            path = this.copydefault.getDatabasePath(path).getPath();
                        }
                        String str = path;
                        File file = new File(new File(str).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabaseCopydefault = SQLiteDatabase.copydefault(str, this.AkhnZx, this.djBIcL, this.AEQbTJ ? C.ENCODING_PCM_32BIT : 268435456, this.OLrzqt, this.EZpvd);
                    } catch (SQLiteException e) {
                        if (z) {
                            throw e;
                        }
                        sQLiteDatabaseCopydefault = SQLiteDatabase.copydefault(this.copydefault.getDatabasePath(this.AhwBna).getPath(), this.AkhnZx, this.djBIcL, 1, this.OLrzqt, this.EZpvd);
                    }
                }
            } else if (z && sQLiteDatabaseCopydefault.isReadOnly()) {
                sQLiteDatabaseCopydefault.isConnected();
            }
            OLrzqt(sQLiteDatabaseCopydefault);
            int version = sQLiteDatabaseCopydefault.getVersion();
            if (version != this.gEmmrt) {
                if (sQLiteDatabaseCopydefault.isReadOnly()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseCopydefault.getVersion() + " to " + this.gEmmrt + ": " + this.AhwBna);
                }
                if (version > 0 && version < this.AYXKKw) {
                    File file2 = new File(sQLiteDatabaseCopydefault.getPath());
                    copydefault(sQLiteDatabaseCopydefault);
                    sQLiteDatabaseCopydefault.close();
                    if (SQLiteDatabase.KWHzl(file2)) {
                        this.valueOf = false;
                        SQLiteDatabase sQLiteDatabaseCopydefault2 = copydefault(z);
                        this.valueOf = false;
                        if (sQLiteDatabaseCopydefault != this.KWHzl) {
                            sQLiteDatabaseCopydefault.close();
                        }
                        return sQLiteDatabaseCopydefault2;
                    }
                    throw new IllegalStateException("Unable to delete obsolete database " + this.AhwBna + " with version " + version);
                }
                sQLiteDatabaseCopydefault.beginTransaction();
                try {
                    if (version == 0) {
                        KWHzl(sQLiteDatabaseCopydefault);
                    } else {
                        int i = this.gEmmrt;
                        if (version > i) {
                            copydefault(sQLiteDatabaseCopydefault, version, i);
                        } else {
                            OLrzqt(sQLiteDatabaseCopydefault, version, i);
                        }
                    }
                    sQLiteDatabaseCopydefault.setVersion(this.gEmmrt);
                    sQLiteDatabaseCopydefault.setTransactionSuccessful();
                    sQLiteDatabaseCopydefault.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabaseCopydefault.endTransaction();
                    throw th;
                }
            }
            EZpvd(sQLiteDatabaseCopydefault);
            sQLiteDatabaseCopydefault.isReadOnly();
            this.KWHzl = sQLiteDatabaseCopydefault;
            this.valueOf = false;
            return sQLiteDatabaseCopydefault;
        } catch (Throwable th2) {
            this.valueOf = false;
            if (sQLiteDatabaseCopydefault != null && sQLiteDatabaseCopydefault != this.KWHzl) {
                sQLiteDatabaseCopydefault.close();
            }
            throw th2;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.valueOf) {
                throw new IllegalStateException("Closed during initialization");
            }
            SQLiteDatabase sQLiteDatabase = this.KWHzl;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.KWHzl.close();
                this.KWHzl = null;
            }
        }
    }

    public void copydefault(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public static byte[] copydefault(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        ByteBuffer byteBufferEncode = Charset.forName(C.UTF8_NAME).encode(CharBuffer.wrap(str));
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.get(bArr);
        return bArr;
    }
}
