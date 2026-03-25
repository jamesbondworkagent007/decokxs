package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteSession {
    public SQLiteConnection AEQbTJ;
    public int EZpvd;
    public final SQLiteConnectionPool KWHzl;
    public int OLrzqt;
    public Transaction copydefault;
    public Transaction valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.valueOf != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AEQbTJ != null;
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.KWHzl = sQLiteConnectionPool;
    }

    public boolean EZpvd() {
        Transaction transaction = this.valueOf;
        return (transaction == null || transaction.OLrzqt == null) ? false : true;
    }

    public void EZpvd(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        djBIcL();
        KWHzl(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    /* JADX DEBUG: Incorrect finally slice size: {[IGET, IPUT] complete}, expected: {[IGET] complete} */
    /* JADX WARN: Finally extract failed */
    public final void KWHzl(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.valueOf == null) {
            AEQbTJ(null, i2, cancellationSignal);
        }
        try {
            if (this.valueOf == null) {
                if (i == 1) {
                    this.AEQbTJ.OLrzqt("BEGIN IMMEDIATE;", null, cancellationSignal);
                } else if (i == 2) {
                    this.AEQbTJ.OLrzqt("BEGIN EXCLUSIVE;", null, cancellationSignal);
                } else {
                    this.AEQbTJ.OLrzqt("BEGIN;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.KWHzl();
                } catch (RuntimeException e) {
                    if (this.valueOf == null) {
                        this.AEQbTJ.OLrzqt("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e;
                }
            }
            Transaction transactionOLrzqt = OLrzqt(i, sQLiteTransactionListener);
            transactionOLrzqt.OLrzqt = this.valueOf;
            this.valueOf = transactionOLrzqt;
        } catch (Throwable th) {
            if (this.valueOf == null) {
                AEQbTJ();
            }
            throw th;
        }
    }

    public void OLrzqt() {
        valueOf();
        djBIcL();
        this.valueOf.EZpvd = true;
    }

    public void AEQbTJ(CancellationSignal cancellationSignal) {
        valueOf();
        KWHzl(cancellationSignal, false);
    }

    public final void KWHzl(CancellationSignal cancellationSignal, boolean z) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.valueOf;
        boolean z2 = false;
        boolean z3 = (transaction.EZpvd || z) && !transaction.copydefault;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.KWHzl;
        if (sQLiteTransactionListener != null) {
            try {
                if (z3) {
                    sQLiteTransactionListener.AEQbTJ();
                } else {
                    sQLiteTransactionListener.copydefault();
                }
                z2 = z3;
                e = null;
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            z2 = z3;
            e = null;
        }
        this.valueOf = transaction.OLrzqt;
        AEQbTJ(transaction);
        Transaction transaction2 = this.valueOf;
        if (transaction2 == null) {
            try {
                if (z2) {
                    this.AEQbTJ.OLrzqt("COMMIT;", null, cancellationSignal);
                } else {
                    this.AEQbTJ.OLrzqt("ROLLBACK;", null, cancellationSignal);
                }
            } finally {
                AEQbTJ();
            }
        } else if (!z2) {
            transaction2.copydefault = true;
        }
        if (e != null) {
            throw e;
        }
    }

    public boolean copydefault(long j, boolean z, CancellationSignal cancellationSignal) {
        if (z) {
            valueOf();
            djBIcL();
            gEmmrt();
        } else {
            Transaction transaction = this.valueOf;
            if (transaction == null || transaction.EZpvd || transaction.OLrzqt != null) {
                return false;
            }
        }
        if (this.valueOf.copydefault) {
            return false;
        }
        return copydefault(j, cancellationSignal);
    }

    public final boolean copydefault(long j, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.KWHzl.copydefault(this.AEQbTJ, this.EZpvd)) {
            return false;
        }
        Transaction transaction = this.valueOf;
        int i = transaction.AEQbTJ;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.KWHzl;
        int i2 = this.EZpvd;
        KWHzl(cancellationSignal, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        KWHzl(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    public void OLrzqt(String str, int i, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            this.AEQbTJ.AEQbTJ(str, sQLiteStatementInfo);
        } finally {
            AEQbTJ();
        }
    }

    public void KWHzl(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (AhwBna(str, objArr, i, cancellationSignal)) {
            return;
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            this.AEQbTJ.OLrzqt(str, objArr, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public long OLrzqt(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (AhwBna(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            return this.AEQbTJ.AEQbTJ(str, objArr, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public String AEQbTJ(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (AhwBna(str, objArr, i, cancellationSignal)) {
            return null;
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            return this.AEQbTJ.copydefault(str, objArr, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public int copydefault(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (AhwBna(str, objArr, i, cancellationSignal)) {
            return 0;
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            return this.AEQbTJ.KWHzl(str, objArr, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public long EZpvd(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (AhwBna(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        AEQbTJ(str, i, cancellationSignal);
        try {
            return this.AEQbTJ.EZpvd(str, objArr, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public int KWHzl(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (AhwBna(str, objArr, i3, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        AEQbTJ(str, i3, cancellationSignal);
        try {
            return this.AEQbTJ.EZpvd(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
        } finally {
            AEQbTJ();
        }
    }

    public final boolean AhwBna(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            EZpvd(2, (SQLiteTransactionListener) null, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            OLrzqt();
            AEQbTJ(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        AEQbTJ(cancellationSignal);
        return true;
    }

    public final void AEQbTJ(String str, int i, CancellationSignal cancellationSignal) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = this.KWHzl.EZpvd(str, i, cancellationSignal);
            this.EZpvd = i;
        }
        this.OLrzqt++;
    }

    public final void AEQbTJ() {
        int i = this.OLrzqt - 1;
        this.OLrzqt = i;
        if (i == 0) {
            try {
                this.KWHzl.AEQbTJ(this.AEQbTJ);
            } finally {
                this.AEQbTJ = null;
            }
        }
    }

    public final void valueOf() {
        if (this.valueOf == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    public final void djBIcL() {
        Transaction transaction = this.valueOf;
        if (transaction != null && transaction.EZpvd) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    public final void gEmmrt() {
        if (EZpvd()) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    public final Transaction OLrzqt(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.copydefault;
        if (transaction != null) {
            this.copydefault = transaction.OLrzqt;
            transaction.OLrzqt = null;
            transaction.EZpvd = false;
            transaction.copydefault = false;
        } else {
            transaction = new Transaction();
        }
        transaction.AEQbTJ = i;
        transaction.KWHzl = sQLiteTransactionListener;
        return transaction;
    }

    public final void AEQbTJ(Transaction transaction) {
        transaction.OLrzqt = this.copydefault;
        transaction.KWHzl = null;
        this.copydefault = transaction;
    }

    public static final class Transaction {
        public int AEQbTJ;
        public boolean EZpvd;
        public SQLiteTransactionListener KWHzl;
        public Transaction OLrzqt;
        public boolean copydefault;

        private Transaction() {
        }
    }
}
