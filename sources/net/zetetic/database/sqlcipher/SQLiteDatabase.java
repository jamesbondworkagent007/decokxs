package net.zetetic.database.sqlcipher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.search.bean.SearchResultContentPo;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteDatabase extends SQLiteClosable implements SupportSQLiteDatabase {
    public static WeakHashMap<SQLiteDatabase, Object> AEQbTJ = new WeakHashMap<>();
    public static final String[] OLrzqt = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public SQLiteConnectionPool AhwBna;
    public final SQLiteDatabaseConfiguration copydefault;
    public boolean djBIcL;
    public final CursorFactory gEmmrt;
    public final DatabaseErrorHandler valueOf;
    public final ThreadLocal<SQLiteSession> AkhnZx = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public SQLiteSession initialValue() {
            return SQLiteDatabase.this.AhwBna();
        }
    };
    public final Object AYXKKw = new Object();
    public final CloseGuard KWHzl = CloseGuard.EZpvd();

    public interface CursorFactory {
        Cursor EZpvd(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface CustomFunction {
        void OLrzqt(String[] strArr);
    }

    public SQLiteDatabase(String str, byte[] bArr, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.gEmmrt = cursorFactory;
        this.valueOf = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.copydefault = new SQLiteDatabaseConfiguration(str, i, bArr, sQLiteDatabaseHook);
    }

    public void finalize() throws Throwable {
        try {
            OLrzqt(true);
        } finally {
            super.finalize();
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public void EZpvd() {
        OLrzqt(false);
    }

    public final void OLrzqt(boolean z) {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.AYXKKw) {
            CloseGuard closeGuard = this.KWHzl;
            if (closeGuard != null) {
                if (z) {
                    closeGuard.AEQbTJ();
                }
                this.KWHzl.copydefault();
            }
            sQLiteConnectionPool = this.AhwBna;
            this.AhwBna = null;
        }
        if (z) {
            return;
        }
        synchronized (AEQbTJ) {
            AEQbTJ.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.close();
        }
    }

    public String valueOf() {
        String str;
        synchronized (this.AYXKKw) {
            str = this.copydefault.AEQbTJ;
        }
        return str;
    }

    public void AYXKKw() {
        EventLog.writeEvent(75004, valueOf());
        this.valueOf.copydefault(this);
    }

    public SQLiteSession djBIcL() {
        return this.AkhnZx.get();
    }

    public SQLiteSession AhwBna() {
        SQLiteConnectionPool sQLiteConnectionPool;
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            sQLiteConnectionPool = this.AhwBna;
        }
        return new SQLiteSession(sQLiteConnectionPool);
    }

    public int copydefault(boolean z) {
        int i = z ? 1 : 2;
        return copydefault() ? i | 4 : i;
    }

    public static boolean copydefault() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null && looperMyLooper == Looper.getMainLooper();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        copydefault(null, true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        copydefault(null, false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        copydefault(new SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.2
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void KWHzl() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void AEQbTJ() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void copydefault() {
                sQLiteTransactionListener.onRollback();
            }
        }, true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(final android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        KWHzl(new SQLiteTransactionListener() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.3
            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void KWHzl() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void AEQbTJ() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteTransactionListener
            public void copydefault() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public void KWHzl(SQLiteTransactionListener sQLiteTransactionListener) {
        copydefault(sQLiteTransactionListener, false);
    }

    public final void copydefault(SQLiteTransactionListener sQLiteTransactionListener, boolean z) {
        OLrzqt();
        try {
            djBIcL().EZpvd(z ? 2 : 1, sQLiteTransactionListener, copydefault(false), (CancellationSignal) null);
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        OLrzqt();
        try {
            djBIcL().AEQbTJ((CancellationSignal) null);
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        OLrzqt();
        try {
            djBIcL().OLrzqt();
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        OLrzqt();
        try {
            return djBIcL().KWHzl();
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        OLrzqt();
        try {
            return djBIcL().copydefault();
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return KWHzl(true, -1L);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j) {
        return KWHzl(true, j);
    }

    public final boolean KWHzl(boolean z, long j) {
        OLrzqt();
        try {
            return djBIcL().copydefault(j, z, null);
        } finally {
            KWHzl();
        }
    }

    public static SQLiteDatabase AEQbTJ(String str, CursorFactory cursorFactory, int i) {
        return AEQbTJ(str, cursorFactory, i, null);
    }

    public static SQLiteDatabase AEQbTJ(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        return copydefault(str, new byte[0], cursorFactory, i, databaseErrorHandler, null);
    }

    public static SQLiteDatabase copydefault(String str, byte[] bArr, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, bArr, i, cursorFactory, databaseErrorHandler, sQLiteDatabaseHook);
        sQLiteDatabase.values();
        return sQLiteDatabase;
    }

    public static boolean KWHzl(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file must not be null");
        }
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    public void isConnected() {
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            if (gEmmrt()) {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
                int i = sQLiteDatabaseConfiguration.gEmmrt;
                sQLiteDatabaseConfiguration.gEmmrt = i & (-2);
                try {
                    this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e) {
                    this.copydefault.gEmmrt = i;
                    throw e;
                }
            }
        }
    }

    public final void values() {
        try {
            try {
                AkhnZx();
            } catch (SQLiteDatabaseCorruptException unused) {
                AYXKKw();
                AkhnZx();
            }
        } catch (SQLiteException e) {
            valueOf();
            close();
            throw e;
        }
    }

    public final void AkhnZx() {
        synchronized (this.AYXKKw) {
            this.AhwBna = SQLiteConnectionPool.EZpvd(this.copydefault);
            this.KWHzl.KWHzl(EopTrackEvent.CLOSE);
        }
        synchronized (AEQbTJ) {
            AEQbTJ.put(this, null);
        }
    }

    public static SQLiteDatabase AEQbTJ(CursorFactory cursorFactory) {
        return AEQbTJ(":memory:", cursorFactory, 268435456);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return Long.valueOf(DatabaseUtils.KWHzl(this, "PRAGMA user_version;", null)).intValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return DatabaseUtils.KWHzl(this, "PRAGMA max_page_count;", null) * getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j) {
        long pageSize = getPageSize();
        long j2 = j / pageSize;
        if (j % pageSize != 0) {
            j2++;
        }
        return DatabaseUtils.KWHzl(this, "PRAGMA max_page_count = " + j2, null) * pageSize;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return DatabaseUtils.KWHzl(this, "PRAGMA page_size;", null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String str) {
        return KWHzl(str, new Object[0]);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(String str, Object[] objArr) {
        return KWHzl(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        return query(supportSQLiteQuery, (CancellationSignal) null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        OLrzqt();
        try {
            String sql = supportSQLiteQuery.getSql();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, sql, "", cancellationSignal);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, sql, cancellationSignal);
            supportSQLiteQuery.bindTo(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return copydefault(str, null, contentValues, i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(String str, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return KWHzl(str, str2, strArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            strArr[i2] = objArr[i2].toString();
        }
        return OLrzqt(str, contentValues, str2, strArr, i);
    }

    /* JADX DEBUG: Method merged with bridge method: compileStatement(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement; */
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public SQLiteStatement compileStatement(String str) throws SQLException {
        OLrzqt();
        try {
            return new SQLiteStatement(this, str, null);
        } finally {
            KWHzl();
        }
    }

    public Cursor KWHzl(String str, String[] strArr) {
        return AEQbTJ(null, str, strArr, null, null);
    }

    public Cursor KWHzl(String str, Object... objArr) {
        OLrzqt();
        try {
            return new SQLiteDirectCursorDriver(this, str, null, null).copydefault(this.gEmmrt, objArr);
        } finally {
            KWHzl();
        }
    }

    public Cursor AEQbTJ(CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        OLrzqt();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2, cancellationSignal);
            if (cursorFactory == null) {
                cursorFactory = this.gEmmrt;
            }
            return sQLiteDirectCursorDriver.AEQbTJ(cursorFactory, strArr);
        } finally {
            KWHzl();
        }
    }

    public long copydefault(String str, String str2, ContentValues contentValues, int i) {
        Object[] objArr;
        OLrzqt();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(OLrzqt[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            int i2 = 0;
            int size = (contentValues == null || contentValues.size() <= 0) ? 0 : contentValues.size();
            if (size > 0) {
                objArr = new Object[size];
                int i3 = 0;
                for (String str3 : contentValues.keySet()) {
                    sb.append(i3 > 0 ? "," : "");
                    sb.append(str3);
                    objArr[i3] = contentValues.get(str3);
                    i3++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                while (i2 < size) {
                    sb.append(i2 > 0 ? ",?" : "?");
                    i2++;
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
                objArr = null;
            }
            sb.append(')');
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            try {
                return sQLiteStatement.executeInsert();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            KWHzl();
        }
    }

    public int KWHzl(String str, String str2, String[] strArr) {
        String str3;
        OLrzqt();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ");
            sb.append(str);
            if (TextUtils.isEmpty(str2)) {
                str3 = "";
            } else {
                str3 = " WHERE " + str2;
            }
            sb.append(str3);
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), strArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            KWHzl();
        }
    }

    public int OLrzqt(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        OLrzqt();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            sb.append(OLrzqt[i]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            int length = strArr == null ? size : strArr.length + size;
            Object[] objArr = new Object[length];
            int i2 = 0;
            for (String str3 : contentValues.keySet()) {
                sb.append(i2 > 0 ? "," : "");
                sb.append(str3);
                objArr[i2] = contentValues.get(str3);
                sb.append("=?");
                i2++;
            }
            if (strArr != null) {
                for (int i3 = size; i3 < length; i3++) {
                    objArr[i3] = strArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb.toString(), objArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String str) throws SQLException {
        AEQbTJ(str, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(String str, Object[] objArr) throws SQLException {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        AEQbTJ(str, objArr);
    }

    public final int AEQbTJ(String str, Object[] objArr) throws SQLException {
        boolean z;
        OLrzqt();
        try {
            if (DatabaseUtils.EZpvd(str) == 3) {
                synchronized (this.AYXKKw) {
                    if (this.djBIcL) {
                        z = false;
                    } else {
                        z = true;
                        this.djBIcL = true;
                    }
                }
                if (z) {
                    disableWriteAheadLogging();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr);
            try {
                return sQLiteStatement.executeUpdateDelete();
            } finally {
                sQLiteStatement.close();
            }
        } finally {
            KWHzl();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        boolean zGEmmrt;
        synchronized (this.AYXKKw) {
            zGEmmrt = gEmmrt();
        }
        return zGEmmrt;
    }

    public final boolean gEmmrt() {
        return (this.copydefault.gEmmrt & 1) == 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        boolean z;
        synchronized (this.AYXKKw) {
            z = this.AhwBna != null;
        }
        return z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final String getPath() {
        String str;
        synchronized (this.AYXKKw) {
            str = this.copydefault.AYXKKw;
        }
        return str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        if (locale == null) {
            throw new IllegalArgumentException("locale must not be null.");
        }
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
            Locale locale2 = sQLiteDatabaseConfiguration.valueOf;
            sQLiteDatabaseConfiguration.valueOf = locale;
            try {
                this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                this.copydefault.valueOf = locale2;
                throw e;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i) {
        if (i > 100 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 100");
        }
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
            int i2 = sQLiteDatabaseConfiguration.AhwBna;
            sQLiteDatabaseConfiguration.AhwBna = i;
            try {
                this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                this.copydefault.AhwBna = i2;
                throw e;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z) {
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
            if (sQLiteDatabaseConfiguration.EZpvd == z) {
                return;
            }
            sQLiteDatabaseConfiguration.EZpvd = z;
            try {
                this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                this.copydefault.EZpvd = !z;
                throw e;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            if ((this.copydefault.gEmmrt & 536870912) != 0) {
                return true;
            }
            if (gEmmrt()) {
                return false;
            }
            if (this.copydefault.OLrzqt()) {
                return false;
            }
            if (this.djBIcL) {
                if (Log.isLoggable("SQLiteDatabase", 3)) {
                    String str = this.copydefault.AEQbTJ;
                }
                return false;
            }
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
            sQLiteDatabaseConfiguration.gEmmrt = 536870912 | sQLiteDatabaseConfiguration.gEmmrt;
            try {
                this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
                return true;
            } catch (RuntimeException e) {
                this.copydefault.gEmmrt &= -536870913;
                throw e;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
            int i = sQLiteDatabaseConfiguration.gEmmrt;
            if ((i & 536870912) == 0) {
                return;
            }
            sQLiteDatabaseConfiguration.gEmmrt = i & (-536870913);
            try {
                this.AhwBna.AEQbTJ(sQLiteDatabaseConfiguration);
            } catch (RuntimeException e) {
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.copydefault;
                sQLiteDatabaseConfiguration2.gEmmrt = 536870912 | sQLiteDatabaseConfiguration2.gEmmrt;
                throw e;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        boolean z;
        synchronized (this.AYXKKw) {
            fetchVPNInfo();
            z = (this.copydefault.gEmmrt & 536870912) != 0;
        }
        return z;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.AYXKKw) {
            Cursor cursorKWHzl = null;
            if (this.AhwBna == null) {
                return null;
            }
            if (!this.djBIcL) {
                arrayList.add(new Pair("main", this.copydefault.AYXKKw));
                return arrayList;
            }
            OLrzqt();
            try {
                try {
                    cursorKWHzl = KWHzl("pragma database_list;", (String[]) null);
                    while (cursorKWHzl.moveToNext()) {
                        arrayList.add(new Pair(cursorKWHzl.getString(1), cursorKWHzl.getString(2)));
                    }
                    cursorKWHzl.close();
                    return arrayList;
                } catch (Throwable th) {
                    if (cursorKWHzl != null) {
                        cursorKWHzl.close();
                    }
                    throw th;
                }
            } finally {
                KWHzl();
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        List<Pair<String, String>> arrayList;
        OLrzqt();
        try {
            try {
                arrayList = getAttachedDbs();
            } catch (SQLiteException unused) {
                arrayList = new ArrayList<>();
                arrayList.add(new Pair<>("main", getPath()));
            }
            if (arrayList == null) {
                throw new IllegalStateException("databaselist for: " + getPath() + " couldn't be retrieved. probably because the database is closed");
            }
            for (int i = 0; i < arrayList.size(); i++) {
                Pair<String, String> pair = arrayList.get(i);
                SQLiteStatement sQLiteStatementCompileStatement = null;
                try {
                    sQLiteStatementCompileStatement = compileStatement("PRAGMA " + ((String) pair.first) + ".integrity_check(1);");
                    if (!sQLiteStatementCompileStatement.simpleQueryForString().equalsIgnoreCase(SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX)) {
                        sQLiteStatementCompileStatement.close();
                        return false;
                    }
                    sQLiteStatementCompileStatement.close();
                } catch (Throwable th) {
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                    throw th;
                }
            }
            KWHzl();
            return true;
        } finally {
            KWHzl();
        }
    }

    public String toString() {
        return "SQLiteDatabase: " + getPath();
    }

    public final void fetchVPNInfo() {
        if (this.AhwBna != null) {
            return;
        }
        throw new IllegalStateException("The database '" + this.copydefault.AEQbTJ + "' is not open.");
    }

    public static boolean AEQbTJ() {
        return SQLiteConnection.KWHzl();
    }
}
