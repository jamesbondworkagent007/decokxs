package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.util.LruCache;
import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.text.DateFormat;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteConnection implements CancellationSignal.OnCancelListener {
    public static final String[] AEQbTJ = new String[0];
    public static final byte[] EZpvd = new byte[0];
    public final boolean AYXKKw;
    public long AhwBna;
    public final OperationLog AkhnZx;
    public final SQLiteConnectionPool DbNXlk;
    public final CloseGuard KWHzl;
    public int OLrzqt;
    public final SQLiteDatabaseConfiguration copydefault;
    public final boolean djBIcL;
    public final PreparedStatementCache fetchVPNInfo;
    public boolean gEmmrt;
    public final int valueOf;
    public PreparedStatement values;

    public static boolean KWHzl(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForBlobFileDescriptor(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, CursorWindow cursorWindow, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeExecuteRaw(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j, long j2);

    private static native int nativeKey(long j, byte[] bArr);

    private static native long nativeOpen(String str, int i, String str2, boolean z, boolean z2);

    private static native long nativePrepareStatement(long j, String str);

    private static native int nativeReKey(long j, byte[] bArr);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatementAndClearBindings(long j, long j2);

    public final void EZpvd(PreparedStatement preparedStatement) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.gEmmrt = z;
    }

    public static boolean KWHzl() {
        return nativeHasCodec();
    }

    public SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        CloseGuard closeGuardEZpvd = CloseGuard.EZpvd();
        this.KWHzl = closeGuardEZpvd;
        this.AkhnZx = new OperationLog();
        this.DbNXlk = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.copydefault = sQLiteDatabaseConfiguration2;
        this.valueOf = i;
        this.djBIcL = z;
        this.AYXKKw = (sQLiteDatabaseConfiguration.gEmmrt & 1) != 0;
        this.fetchVPNInfo = new PreparedStatementCache(sQLiteDatabaseConfiguration2.AhwBna);
        closeGuardEZpvd.KWHzl(EopTrackEvent.CLOSE);
    }

    public void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.DbNXlk;
            if (sQLiteConnectionPool != null && this.AhwBna != 0) {
                sQLiteConnectionPool.EZpvd();
            }
            KWHzl(true);
        } finally {
            super.finalize();
        }
    }

    public static SQLiteConnection EZpvd(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z);
        try {
            sQLiteConnection.AhwBna();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            sQLiteConnection.KWHzl(false);
            throw e;
        }
    }

    public void OLrzqt() {
        KWHzl(false);
    }

    public void EZpvd(byte[] bArr) {
        int iNativeReKey = nativeReKey(this.AhwBna, bArr);
        String.format("Database rekey operation returned:%s", Integer.valueOf(iNativeReKey));
        if (iNativeReKey != 0) {
            throw new SQLiteException(String.format("Failed to rekey database, result code:%s", Integer.valueOf(iNativeReKey)));
        }
    }

    public final void AhwBna() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
        this.AhwBna = nativeOpen(sQLiteDatabaseConfiguration.AYXKKw, sQLiteDatabaseConfiguration.gEmmrt, sQLiteDatabaseConfiguration.AEQbTJ, SQLiteDebug.copydefault, SQLiteDebug.OLrzqt);
        SQLiteDatabaseHook sQLiteDatabaseHook = this.copydefault.copydefault;
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.KWHzl(this);
        }
        byte[] bArr = this.copydefault.djBIcL;
        if (bArr != null && bArr.length > 0) {
            String.format("Database keying operation returned:%s", Integer.valueOf(nativeKey(this.AhwBna, bArr)));
        }
        SQLiteDatabaseHook sQLiteDatabaseHook2 = this.copydefault.copydefault;
        if (sQLiteDatabaseHook2 != null) {
            sQLiteDatabaseHook2.AEQbTJ(this);
        }
        byte[] bArr2 = this.copydefault.djBIcL;
        if (bArr2 != null && bArr2.length > 0) {
            AEQbTJ("SELECT COUNT(*) FROM sqlite_schema;", null, null);
        }
        fetchVPNInfo();
        gEmmrt();
        valueOf();
        AYXKKw();
        values();
        if (!nativeHasCodec()) {
            djBIcL();
        }
        int size = this.copydefault.KWHzl.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.AhwBna, this.copydefault.KWHzl.get(i));
        }
    }

    public final void KWHzl(boolean z) {
        CloseGuard closeGuard = this.KWHzl;
        if (closeGuard != null) {
            if (z) {
                closeGuard.AEQbTJ();
            }
            this.KWHzl.copydefault();
        }
        if (this.AhwBna != 0) {
            int iCopydefault = this.AkhnZx.copydefault(EopTrackEvent.CLOSE, null, null);
            try {
                this.fetchVPNInfo.evictAll();
                nativeClose(this.AhwBna);
                this.AhwBna = 0L;
            } finally {
                this.AkhnZx.copydefault(iCopydefault);
            }
        }
    }

    public final void fetchVPNInfo() {
        if (this.copydefault.OLrzqt() || this.AYXKKw || SQLiteDatabase.AEQbTJ()) {
            return;
        }
        long jKWHzl = SQLiteGlobal.KWHzl();
        if (AEQbTJ("PRAGMA page_size", null, null) != jKWHzl) {
            OLrzqt("PRAGMA page_size=" + jKWHzl, null, null);
        }
    }

    public final void AYXKKw() {
        if (this.copydefault.OLrzqt() || this.AYXKKw) {
            return;
        }
        long jAEQbTJ = SQLiteGlobal.AEQbTJ();
        if (AEQbTJ("PRAGMA wal_autocheckpoint", null, null) != jAEQbTJ) {
            AEQbTJ("PRAGMA wal_autocheckpoint=" + jAEQbTJ, null, null);
        }
    }

    public final void valueOf() {
        if (this.copydefault.OLrzqt() || this.AYXKKw) {
            return;
        }
        long jEZpvd = SQLiteGlobal.EZpvd();
        if (AEQbTJ("PRAGMA journal_size_limit", null, null) != jEZpvd) {
            AEQbTJ("PRAGMA journal_size_limit=" + jEZpvd, null, null);
        }
    }

    public final void gEmmrt() {
        if (this.AYXKKw) {
            return;
        }
        long j = this.copydefault.EZpvd ? 1L : 0L;
        if (AEQbTJ("PRAGMA foreign_keys", null, null) != j) {
            OLrzqt("PRAGMA foreign_keys=" + j, null, null);
        }
    }

    public final void values() {
        if (this.copydefault.OLrzqt() || this.AYXKKw) {
            return;
        }
        if ((this.copydefault.gEmmrt & 536870912) != 0) {
            AYXKKw("WAL");
            AhwBna(SQLiteGlobal.AhwBna());
        } else {
            AYXKKw(SQLiteGlobal.copydefault());
            AhwBna(SQLiteGlobal.OLrzqt());
        }
    }

    public final void AhwBna(String str) {
        if (AEQbTJ(copydefault("PRAGMA synchronous", null, null)).equalsIgnoreCase(AEQbTJ(str))) {
            return;
        }
        OLrzqt("PRAGMA synchronous=" + str, null, null);
    }

    public static String AEQbTJ(String str) {
        return str.equals("0") ? "OFF" : str.equals("1") ? "NORMAL" : str.equals("2") ? "FULL" : str;
    }

    public final void AYXKKw(String str) {
        if (copydefault("PRAGMA journal_mode", null, null).equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (copydefault("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteDatabaseLockedException unused) {
        }
        String str2 = this.copydefault.AEQbTJ;
    }

    public final void djBIcL() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.copydefault;
        if ((sQLiteDatabaseConfiguration.gEmmrt & 16) != 0) {
            return;
        }
        String string = sQLiteDatabaseConfiguration.valueOf.toString();
        nativeRegisterLocalizedCollators(this.AhwBna, string);
        if (this.AYXKKw) {
            return;
        }
        try {
            OLrzqt("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String strCopydefault = copydefault("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (strCopydefault == null || !strCopydefault.equals(string)) {
                OLrzqt("BEGIN", null, null);
                try {
                    OLrzqt("DELETE FROM android_metadata", null, null);
                    OLrzqt("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{string}, null);
                    OLrzqt("REINDEX LOCALIZED", null, null);
                    OLrzqt("COMMIT", null, null);
                } catch (Throwable th) {
                    OLrzqt("ROLLBACK", null, null);
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            throw new SQLiteException("Failed to change locale for db '" + this.copydefault.AEQbTJ + "' to '" + string + "'.", e);
        }
    }

    public void AEQbTJ(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.gEmmrt = false;
        int size = sQLiteDatabaseConfiguration.KWHzl.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.KWHzl.get(i);
            if (!this.copydefault.KWHzl.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.AhwBna, sQLiteCustomFunction);
            }
        }
        boolean z = sQLiteDatabaseConfiguration.EZpvd;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.copydefault;
        boolean z2 = z != sQLiteDatabaseConfiguration2.EZpvd;
        boolean z3 = ((sQLiteDatabaseConfiguration.gEmmrt ^ sQLiteDatabaseConfiguration2.gEmmrt) & 536870912) != 0;
        boolean zEquals = sQLiteDatabaseConfiguration.valueOf.equals(sQLiteDatabaseConfiguration2.valueOf);
        this.copydefault.copydefault(sQLiteDatabaseConfiguration);
        if (z2) {
            gEmmrt();
        }
        if (z3) {
            values();
        }
        if (!zEquals) {
            djBIcL();
        }
    }

    public boolean copydefault(String str) {
        return this.fetchVPNInfo.get(str) != null;
    }

    public void AEQbTJ(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("prepare", str, null);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.OLrzqt = preparedStatementOLrzqt.AEQbTJ;
                        sQLiteStatementInfo.EZpvd = preparedStatementOLrzqt.KWHzl;
                        int iNativeGetColumnCount = nativeGetColumnCount(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                        if (iNativeGetColumnCount == 0) {
                            sQLiteStatementInfo.copydefault = AEQbTJ;
                        } else {
                            sQLiteStatementInfo.copydefault = new String[iNativeGetColumnCount];
                            for (int i = 0; i < iNativeGetColumnCount; i++) {
                                sQLiteStatementInfo.copydefault[i] = nativeGetColumnName(this.AhwBna, preparedStatementOLrzqt.djBIcL, i);
                            }
                        }
                    } finally {
                        KWHzl(preparedStatementOLrzqt);
                    }
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } finally {
            this.AkhnZx.copydefault(iCopydefault);
        }
    }

    public void OLrzqt(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("execute", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                try {
                    copydefault(preparedStatementOLrzqt);
                    EZpvd(preparedStatementOLrzqt, objArr);
                    EZpvd(preparedStatementOLrzqt);
                    EZpvd(cancellationSignal);
                    try {
                        nativeExecute(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                    } finally {
                        copydefault(cancellationSignal);
                    }
                } finally {
                    KWHzl(preparedStatementOLrzqt);
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } finally {
            this.AkhnZx.copydefault(iCopydefault);
        }
    }

    public long AEQbTJ(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                try {
                    copydefault(preparedStatementOLrzqt);
                    EZpvd(preparedStatementOLrzqt, objArr);
                    EZpvd(preparedStatementOLrzqt);
                    EZpvd(cancellationSignal);
                    try {
                        return nativeExecuteForLong(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                    } finally {
                        copydefault(cancellationSignal);
                    }
                } finally {
                    KWHzl(preparedStatementOLrzqt);
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } finally {
            this.AkhnZx.copydefault(iCopydefault);
        }
    }

    public String copydefault(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("executeForString", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                try {
                    copydefault(preparedStatementOLrzqt);
                    EZpvd(preparedStatementOLrzqt, objArr);
                    EZpvd(preparedStatementOLrzqt);
                    EZpvd(cancellationSignal);
                    try {
                        return nativeExecuteForString(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                    } finally {
                        copydefault(cancellationSignal);
                    }
                } finally {
                    KWHzl(preparedStatementOLrzqt);
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } finally {
            this.AkhnZx.copydefault(iCopydefault);
        }
    }

    public int KWHzl(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                try {
                    copydefault(preparedStatementOLrzqt);
                    EZpvd(preparedStatementOLrzqt, objArr);
                    EZpvd(preparedStatementOLrzqt);
                    EZpvd(cancellationSignal);
                    try {
                        int iNativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                        if (this.AkhnZx.OLrzqt(iCopydefault)) {
                            this.AkhnZx.AEQbTJ(iCopydefault, "changedRows=" + iNativeExecuteForChangedRowCount);
                        }
                        return iNativeExecuteForChangedRowCount;
                    } finally {
                        copydefault(cancellationSignal);
                    }
                } finally {
                    KWHzl(preparedStatementOLrzqt);
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } catch (Throwable th) {
            if (this.AkhnZx.OLrzqt(iCopydefault)) {
                this.AkhnZx.AEQbTJ(iCopydefault, "changedRows=0");
            }
            throw th;
        }
    }

    public long EZpvd(String str, Object[] objArr, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int iCopydefault = this.AkhnZx.copydefault("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                try {
                    copydefault(preparedStatementOLrzqt);
                    EZpvd(preparedStatementOLrzqt, objArr);
                    EZpvd(preparedStatementOLrzqt);
                    EZpvd(cancellationSignal);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.AhwBna, preparedStatementOLrzqt.djBIcL);
                    } finally {
                        copydefault(cancellationSignal);
                    }
                } finally {
                    KWHzl(preparedStatementOLrzqt);
                }
            } catch (RuntimeException e) {
                this.AkhnZx.AEQbTJ(iCopydefault, e);
                throw e;
            }
        } finally {
            this.AkhnZx.copydefault(iCopydefault);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0110 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0125 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [net.zetetic.database.sqlcipher.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r11v3, types: [net.zetetic.database.sqlcipher.SQLiteConnection$OperationLog] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public int EZpvd(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, CancellationSignal cancellationSignal) {
        String str2;
        int i3;
        ?? r14;
        ?? r7;
        Throwable th;
        int i4;
        ?? r2;
        ?? r4;
        int i5;
        PreparedStatement preparedStatement;
        int i6;
        Object[] objArr2 = objArr;
        String str3 = ", filledRows=";
        String str4 = ", actualPos=";
        String str5 = "', startPos=";
        String str6 = "window='";
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.acquireReference();
        try {
            int iCopydefault = this.AkhnZx.copydefault("executeForCursorWindow", str, objArr2);
            int i7 = -1;
            try {
                try {
                    PreparedStatement preparedStatementOLrzqt = OLrzqt(str);
                    try {
                        copydefault(preparedStatementOLrzqt);
                        EZpvd(preparedStatementOLrzqt, objArr2);
                        EZpvd(preparedStatementOLrzqt);
                        EZpvd(cancellationSignal);
                        try {
                            preparedStatement = preparedStatementOLrzqt;
                            i5 = iCopydefault;
                            str4 = "window='";
                        } catch (Throwable th2) {
                            th = th2;
                            preparedStatement = preparedStatementOLrzqt;
                            i6 = iCopydefault;
                        }
                        try {
                            long jNativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.AhwBna, preparedStatementOLrzqt.djBIcL, cursorWindow, i, i2, z);
                            int i8 = (int) (jNativeExecuteForCursorWindow >> 32);
                            int i9 = (int) jNativeExecuteForCursorWindow;
                            try {
                                int numRows = cursorWindow.getNumRows();
                                try {
                                    cursorWindow.setStartPosition(i8);
                                    try {
                                        copydefault(cancellationSignal);
                                        try {
                                            KWHzl(preparedStatement);
                                            if (this.AkhnZx.OLrzqt(i5)) {
                                                this.AkhnZx.AEQbTJ(i5, str4 + cursorWindow + "', startPos=" + i + ", actualPos=" + i8 + ", filledRows=" + numRows + ", countedRows=" + i9);
                                            }
                                            return i9;
                                        } catch (RuntimeException e) {
                                            e = e;
                                            this.AkhnZx.AEQbTJ(i5, e);
                                            throw e;
                                        } catch (Throwable th3) {
                                            i3 = i;
                                            str2 = "', startPos=";
                                            str5 = ", countedRows=";
                                            str6 = ", filledRows=";
                                            r7 = ", actualPos=";
                                            th = th3;
                                            i4 = i9;
                                            r2 = numRows;
                                            r4 = i8;
                                            r14 = i5;
                                            if (this.AkhnZx.OLrzqt(r14)) {
                                                this.AkhnZx.AEQbTJ(r14, str4 + cursorWindow + str2 + i3 + r7 + r4 + str6 + r2 + str5 + i4);
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            KWHzl(preparedStatement);
                                            throw th;
                                        } catch (RuntimeException e2) {
                                            e = e2;
                                            this.AkhnZx.AEQbTJ(i5, e);
                                            throw e;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i7 = numRows;
                                    i5 = i5;
                                    try {
                                        copydefault(cancellationSignal);
                                        throw th;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        KWHzl(preparedStatement);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            i6 = i5;
                            i5 = i6;
                            copydefault(cancellationSignal);
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        preparedStatement = preparedStatementOLrzqt;
                        i5 = iCopydefault;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    i5 = iCopydefault;
                } catch (Throwable th10) {
                    str2 = "', startPos=";
                    i3 = i;
                    str5 = ", countedRows=";
                    r14 = iCopydefault;
                    r7 = ", actualPos=";
                    str4 = "window='";
                    str6 = ", filledRows=";
                    th = th10;
                    i4 = -1;
                    r2 = -1;
                    r4 = -1;
                }
            } catch (Throwable th11) {
                th = th11;
                i4 = -1;
                r4 = "executeForCursorWindow";
                r2 = objArr2;
                r7 = iCopydefault;
                r14 = str3;
            }
        } finally {
            cursorWindow.releaseReference();
        }
    }

    public final PreparedStatement OLrzqt(String str) {
        boolean z;
        PreparedStatement preparedStatementKWHzl = this.fetchVPNInfo.get(str);
        if (preparedStatementKWHzl == null) {
            z = false;
        } else {
            if (!preparedStatementKWHzl.EZpvd) {
                return preparedStatementKWHzl;
            }
            z = true;
        }
        long jNativePrepareStatement = nativePrepareStatement(this.AhwBna, str);
        try {
            int iNativeGetParameterCount = nativeGetParameterCount(this.AhwBna, jNativePrepareStatement);
            int iEZpvd = DatabaseUtils.EZpvd(str);
            preparedStatementKWHzl = KWHzl(str, jNativePrepareStatement, iNativeGetParameterCount, iEZpvd, nativeIsReadOnly(this.AhwBna, jNativePrepareStatement));
            if (!z && KWHzl(iEZpvd)) {
                this.fetchVPNInfo.put(str, preparedStatementKWHzl);
                preparedStatementKWHzl.copydefault = true;
            }
            preparedStatementKWHzl.EZpvd = true;
            return preparedStatementKWHzl;
        } catch (RuntimeException e) {
            if (preparedStatementKWHzl == null || !preparedStatementKWHzl.copydefault) {
                nativeFinalizeStatement(this.AhwBna, jNativePrepareStatement);
            }
            throw e;
        }
    }

    public final void KWHzl(PreparedStatement preparedStatement) {
        preparedStatement.EZpvd = false;
        if (preparedStatement.copydefault) {
            try {
                nativeResetStatementAndClearBindings(this.AhwBna, preparedStatement.djBIcL);
                return;
            } catch (SQLiteException unused) {
                this.fetchVPNInfo.remove(preparedStatement.gEmmrt);
                return;
            }
        }
        AEQbTJ(preparedStatement);
    }

    public final void AEQbTJ(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.AhwBna, preparedStatement.djBIcL);
        OLrzqt(preparedStatement);
    }

    public final void EZpvd(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
            int i = this.OLrzqt + 1;
            this.OLrzqt = i;
            if (i == 1) {
                nativeResetCancel(this.AhwBna, true);
                cancellationSignal.setOnCancelListener(this);
            }
        }
    }

    public final void copydefault(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            int i = this.OLrzqt - 1;
            this.OLrzqt = i;
            if (i == 0) {
                cancellationSignal.setOnCancelListener(null);
                nativeResetCancel(this.AhwBna, false);
            }
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        nativeCancel(this.AhwBna);
    }

    public final void EZpvd(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.AEQbTJ) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + preparedStatement.AEQbTJ + " bind arguments but " + length + " were provided.");
        }
        if (length == 0) {
            return;
        }
        long j = preparedStatement.djBIcL;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            int iAEQbTJ = DatabaseUtils.AEQbTJ(obj);
            if (iAEQbTJ == 0) {
                nativeBindNull(this.AhwBna, j, i + 1);
            } else if (iAEQbTJ == 1) {
                nativeBindLong(this.AhwBna, j, i + 1, ((Number) obj).longValue());
            } else if (iAEQbTJ == 2) {
                nativeBindDouble(this.AhwBna, j, i + 1, ((Number) obj).doubleValue());
            } else if (iAEQbTJ == 4) {
                nativeBindBlob(this.AhwBna, j, i + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.AhwBna, j, i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.AhwBna, j, i + 1, obj.toString());
            }
        }
    }

    public final void copydefault(PreparedStatement preparedStatement) {
        if (this.gEmmrt && !preparedStatement.KWHzl) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    public String AEQbTJ() {
        return this.AkhnZx.EZpvd();
    }

    public String toString() {
        return "SQLiteConnection: " + this.copydefault.AYXKKw + " (" + this.valueOf + ")";
    }

    public final PreparedStatement KWHzl(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.values;
        if (preparedStatement != null) {
            this.values = preparedStatement.OLrzqt;
            preparedStatement.OLrzqt = null;
            preparedStatement.copydefault = false;
        } else {
            preparedStatement = new PreparedStatement();
        }
        preparedStatement.gEmmrt = str;
        preparedStatement.djBIcL = j;
        preparedStatement.AEQbTJ = i;
        preparedStatement.AhwBna = i2;
        preparedStatement.KWHzl = z;
        return preparedStatement;
    }

    public final void OLrzqt(PreparedStatement preparedStatement) {
        preparedStatement.gEmmrt = null;
        preparedStatement.OLrzqt = this.values;
        this.values = preparedStatement;
    }

    public static String KWHzl(String str) {
        return str.replaceAll("[\\s]*\\n+[\\s]*", " ");
    }

    public static final class PreparedStatement {
        public int AEQbTJ;
        public int AhwBna;
        public boolean EZpvd;
        public boolean KWHzl;
        public PreparedStatement OLrzqt;
        public boolean copydefault;
        public long djBIcL;
        public String gEmmrt;

        private PreparedStatement() {
        }
    }

    public final class PreparedStatementCache extends LruCache<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        /* JADX DEBUG: Method merged with bridge method: entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.copydefault = false;
            if (preparedStatement.EZpvd) {
                return;
            }
            SQLiteConnection.this.AEQbTJ(preparedStatement);
        }
    }

    public static final class OperationLog {
        public int EZpvd;
        public final Operation[] KWHzl;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl(int i) {
            int i2 = this.EZpvd;
            this.EZpvd = i2 + 1;
            return i | (i2 << 8);
        }

        private OperationLog() {
            this.KWHzl = new Operation[20];
        }

        public int copydefault(String str, String str2, Object[] objArr) {
            int iKWHzl;
            synchronized (this.KWHzl) {
                int i = (this.copydefault + 1) % 20;
                Operation operation = this.KWHzl[i];
                if (operation == null) {
                    operation = new Operation();
                    this.KWHzl[i] = operation;
                } else {
                    operation.KWHzl = false;
                    operation.OLrzqt = null;
                    ArrayList<Object> arrayList = operation.copydefault;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
                operation.AhwBna = System.currentTimeMillis();
                operation.djBIcL = SystemClock.uptimeMillis();
                operation.valueOf = str;
                operation.AYXKKw = str2;
                if (objArr != null) {
                    ArrayList<Object> arrayList2 = operation.copydefault;
                    if (arrayList2 == null) {
                        operation.copydefault = new ArrayList<>();
                    } else {
                        arrayList2.clear();
                    }
                    for (Object obj : objArr) {
                        if (obj != null && (obj instanceof byte[])) {
                            operation.copydefault.add(SQLiteConnection.EZpvd);
                        } else {
                            operation.copydefault.add(obj);
                        }
                    }
                }
                iKWHzl = KWHzl(i);
                operation.EZpvd = iKWHzl;
                this.copydefault = i;
            }
            return iKWHzl;
        }

        public void AEQbTJ(int i, Exception exc) {
            synchronized (this.KWHzl) {
                Operation operationAEQbTJ = AEQbTJ(i);
                if (operationAEQbTJ != null) {
                    operationAEQbTJ.OLrzqt = exc;
                }
            }
        }

        public void copydefault(int i) {
            synchronized (this.KWHzl) {
                if (EZpvd(i)) {
                    EZpvd(i, null);
                }
            }
        }

        public boolean OLrzqt(int i) {
            boolean zEZpvd;
            synchronized (this.KWHzl) {
                zEZpvd = EZpvd(i);
            }
            return zEZpvd;
        }

        public void AEQbTJ(int i, String str) {
            synchronized (this.KWHzl) {
                EZpvd(i, str);
            }
        }

        public final boolean EZpvd(int i) {
            Operation operationAEQbTJ = AEQbTJ(i);
            if (operationAEQbTJ == null) {
                return false;
            }
            operationAEQbTJ.AEQbTJ = SystemClock.uptimeMillis();
            operationAEQbTJ.KWHzl = true;
            return false;
        }

        public final void EZpvd(int i, String str) {
            Operation operationAEQbTJ = AEQbTJ(i);
            StringBuilder sb = new StringBuilder();
            operationAEQbTJ.KWHzl(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
        }

        public final Operation AEQbTJ(int i) {
            Operation operation = this.KWHzl[i & 255];
            if (operation.EZpvd == i) {
                return operation;
            }
            return null;
        }

        public String EZpvd() {
            synchronized (this.KWHzl) {
                Operation operation = this.KWHzl[this.copydefault];
                if (operation == null || operation.KWHzl) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                operation.KWHzl(sb, false);
                return sb.toString();
            }
        }
    }

    public static final class Operation {
        public long AEQbTJ;
        public String AYXKKw;
        public long AhwBna;
        public int EZpvd;
        public boolean KWHzl;
        public Exception OLrzqt;
        public ArrayList<Object> copydefault;
        public long djBIcL;
        public String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return !this.KWHzl ? "running" : this.OLrzqt != null ? EopTrackEvent.KEY_RESULT_FAILED : "succeeded";
        }

        private Operation() {
        }

        public void KWHzl(StringBuilder sb, boolean z) {
            ArrayList<Object> arrayList;
            sb.append(this.valueOf);
            if (this.KWHzl) {
                sb.append(" took ");
                sb.append(this.AEQbTJ - this.djBIcL);
                sb.append(DateFormat.MINUTE_SECOND);
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.AhwBna);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(EZpvd());
            if (this.AYXKKw != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.KWHzl(this.AYXKKw));
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            if (z && (arrayList = this.copydefault) != null && arrayList.size() != 0) {
                sb.append(", bindArgs=[");
                int size = this.copydefault.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.copydefault.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append(AbstractJsonLexerKt.NULL);
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                        sb.append((String) obj);
                        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append("]");
            }
            if (this.OLrzqt != null) {
                sb.append(", exception=\"");
                sb.append(this.OLrzqt.getMessage());
                sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
        }
    }
}
