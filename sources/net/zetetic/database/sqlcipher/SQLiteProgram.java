package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements SupportSQLiteProgram {
    public static final String[] KWHzl = new String[0];
    public final String[] AEQbTJ;
    public final Object[] OLrzqt;
    public final SQLiteDatabase copydefault;
    public final String djBIcL;
    public final boolean gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String[] AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SQLiteDatabase AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object[] copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String valueOf() {
        return this.djBIcL;
    }

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
        this.copydefault = sQLiteDatabase;
        String strTrim = str.trim();
        this.djBIcL = strTrim;
        int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.gEmmrt = false;
            this.AEQbTJ = KWHzl;
            this.valueOf = 0;
        } else {
            boolean z = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.djBIcL().OLrzqt(strTrim, sQLiteDatabase.copydefault(z), cancellationSignal, sQLiteStatementInfo);
            this.gEmmrt = sQLiteStatementInfo.EZpvd;
            this.AEQbTJ = sQLiteStatementInfo.copydefault;
            this.valueOf = sQLiteStatementInfo.OLrzqt;
        }
        if (objArr != null && objArr.length > this.valueOf) {
            throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.valueOf + " arguments.");
        }
        int i = this.valueOf;
        if (i == 0) {
            this.OLrzqt = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.OLrzqt = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    public final SQLiteSession djBIcL() {
        return this.copydefault.djBIcL();
    }

    public final int AYXKKw() {
        return this.copydefault.copydefault(this.gEmmrt);
    }

    public final void gEmmrt() {
        this.copydefault.AYXKKw();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        copydefault(i, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        copydefault(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        copydefault(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        }
        copydefault(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        }
        copydefault(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Object[] objArr = this.OLrzqt;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public void copydefault(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    public void KWHzl(Object... objArr) {
        if (objArr != null) {
            for (int length = objArr.length; length != 0; length--) {
                copydefault(length, objArr[length - 1]);
            }
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public void EZpvd() {
        clearBindings();
    }

    public final void copydefault(int i, Object obj) {
        if (i < 1 || i > this.valueOf) {
            throw new IllegalArgumentException("Cannot bind argument at index " + i + " because the index is out of range.  The statement has " + this.valueOf + " parameters.");
        }
        this.OLrzqt[i - 1] = obj;
    }
}
