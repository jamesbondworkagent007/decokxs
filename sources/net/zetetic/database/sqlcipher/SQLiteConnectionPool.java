package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import com.okinc.liveness.lca.EopTrackEvent;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteConnectionPool implements Closeable {
    public SQLiteConnection AEQbTJ;
    public ConnectionWaiter AYXKKw;
    public int AkhnZx;
    public final SQLiteDatabaseConfiguration EZpvd;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public ConnectionWaiter valueOf;
    public final CloseGuard OLrzqt = CloseGuard.EZpvd();
    public final Object djBIcL = new Object();
    public final AtomicBoolean AhwBna = new AtomicBoolean();
    public final ArrayList<SQLiteConnection> copydefault = new ArrayList<>();
    public final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> KWHzl = new WeakHashMap<>();

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static int EZpvd(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    public SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.EZpvd = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        AhwBna();
    }

    public void finalize() throws Throwable {
        try {
            copydefault(true);
        } finally {
            super.finalize();
        }
    }

    public static SQLiteConnectionPool EZpvd(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.AYXKKw();
        return sQLiteConnectionPool;
    }

    public final void AYXKKw() {
        this.AEQbTJ = OLrzqt(this.EZpvd, true);
        this.gEmmrt = true;
        this.OLrzqt.KWHzl(EopTrackEvent.CLOSE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        copydefault(false);
    }

    public final void copydefault(boolean z) {
        CloseGuard closeGuard = this.OLrzqt;
        if (closeGuard != null) {
            if (z) {
                closeGuard.AEQbTJ();
            }
            this.OLrzqt.copydefault();
        }
        if (z) {
            return;
        }
        synchronized (this.djBIcL) {
            gEmmrt();
            this.gEmmrt = false;
            AEQbTJ();
            if (this.KWHzl.size() != 0) {
                String str = this.EZpvd.AEQbTJ;
            }
            valueOf();
        }
    }

    public void AEQbTJ(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.djBIcL) {
            gEmmrt();
            boolean z = ((sQLiteDatabaseConfiguration.gEmmrt ^ this.EZpvd.gEmmrt) & 536870912) != 0;
            if (z) {
                if (!this.KWHzl.isEmpty()) {
                    throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                copydefault();
            }
            if (sQLiteDatabaseConfiguration.EZpvd != this.EZpvd.EZpvd && !this.KWHzl.isEmpty()) {
                throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
            }
            if (!Arrays.equals(sQLiteDatabaseConfiguration.djBIcL, this.EZpvd.djBIcL)) {
                this.AEQbTJ.EZpvd(sQLiteDatabaseConfiguration.djBIcL);
                this.EZpvd.copydefault(sQLiteDatabaseConfiguration);
                copydefault();
                djBIcL();
            }
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.EZpvd;
            if (sQLiteDatabaseConfiguration2.gEmmrt != sQLiteDatabaseConfiguration.gEmmrt) {
                if (z) {
                    AEQbTJ();
                }
                SQLiteConnection sQLiteConnectionOLrzqt = OLrzqt(sQLiteDatabaseConfiguration, true);
                AEQbTJ();
                KWHzl();
                this.AEQbTJ = sQLiteConnectionOLrzqt;
                this.EZpvd.copydefault(sQLiteDatabaseConfiguration);
                AhwBna();
            } else {
                sQLiteDatabaseConfiguration2.copydefault(sQLiteDatabaseConfiguration);
                AhwBna();
                OLrzqt();
                djBIcL();
            }
            valueOf();
        }
    }

    public SQLiteConnection EZpvd(String str, int i, CancellationSignal cancellationSignal) {
        return AEQbTJ(str, i, cancellationSignal);
    }

    public void AEQbTJ(SQLiteConnection sQLiteConnection) {
        synchronized (this.djBIcL) {
            AcquiredConnectionStatus acquiredConnectionStatusRemove = this.KWHzl.remove(sQLiteConnection);
            if (acquiredConnectionStatusRemove == null) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.gEmmrt) {
                OLrzqt(sQLiteConnection);
            } else if (sQLiteConnection.EZpvd()) {
                if (KWHzl(sQLiteConnection, acquiredConnectionStatusRemove)) {
                    this.AEQbTJ = sQLiteConnection;
                }
                valueOf();
            } else if (this.copydefault.size() >= this.fetchVPNInfo - 1) {
                OLrzqt(sQLiteConnection);
            } else {
                if (KWHzl(sQLiteConnection, acquiredConnectionStatusRemove)) {
                    this.copydefault.add(sQLiteConnection);
                }
                valueOf();
            }
        }
    }

    public final boolean KWHzl(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.AEQbTJ(this.EZpvd);
            } catch (RuntimeException unused) {
                Objects.toString(sQLiteConnection);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        OLrzqt(sQLiteConnection);
        return false;
    }

    public boolean copydefault(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.djBIcL) {
            if (!this.KWHzl.containsKey(sQLiteConnection)) {
                throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
            }
            if (!this.gEmmrt) {
                return false;
            }
            return OLrzqt(sQLiteConnection.EZpvd(), i);
        }
    }

    public final SQLiteConnection OLrzqt(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.AkhnZx;
        this.AkhnZx = i + 1;
        return SQLiteConnection.EZpvd(this, sQLiteDatabaseConfiguration, i, z);
    }

    public void EZpvd() {
        String str = this.EZpvd.AEQbTJ;
        this.AhwBna.set(true);
    }

    public final void AEQbTJ() {
        copydefault();
        SQLiteConnection sQLiteConnection = this.AEQbTJ;
        if (sQLiteConnection != null) {
            OLrzqt(sQLiteConnection);
            this.AEQbTJ = null;
        }
    }

    public final void copydefault() {
        int size = this.copydefault.size();
        for (int i = 0; i < size; i++) {
            OLrzqt(this.copydefault.get(i));
        }
        this.copydefault.clear();
    }

    public final void OLrzqt() {
        int size = this.copydefault.size();
        while (true) {
            int i = size - 1;
            if (size <= this.fetchVPNInfo - 1) {
                return;
            }
            OLrzqt(this.copydefault.remove(i));
            size = i;
        }
    }

    public final void OLrzqt(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.OLrzqt();
        } catch (RuntimeException unused) {
            Objects.toString(sQLiteConnection);
        }
    }

    public final void KWHzl() {
        AEQbTJ(AcquiredConnectionStatus.DISCARD);
    }

    public final void djBIcL() {
        SQLiteConnection sQLiteConnection = this.AEQbTJ;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.AEQbTJ(this.EZpvd);
            } catch (RuntimeException unused) {
                Objects.toString(this.AEQbTJ);
                OLrzqt(this.AEQbTJ);
                this.AEQbTJ = null;
            }
        }
        int size = this.copydefault.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.copydefault.get(i);
            try {
                sQLiteConnection2.AEQbTJ(this.EZpvd);
            } catch (RuntimeException unused2) {
                Objects.toString(sQLiteConnection2);
                OLrzqt(sQLiteConnection2);
                this.copydefault.remove(i);
                size--;
                i--;
            }
            i++;
        }
        AEQbTJ(AcquiredConnectionStatus.RECONFIGURE);
    }

    public final void AEQbTJ(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.KWHzl.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.KWHzl.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.KWHzl.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.KWHzl.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SQLiteConnection AEQbTJ(String str, int i, CancellationSignal cancellationSignal) {
        SQLiteConnection sQLiteConnection;
        RuntimeException runtimeException;
        long j;
        boolean z = (i & 2) != 0;
        synchronized (this.djBIcL) {
            gEmmrt();
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            SQLiteConnection sQLiteConnectionAEQbTJ = !z ? AEQbTJ(str, i) : null;
            if (sQLiteConnectionAEQbTJ == null) {
                sQLiteConnectionAEQbTJ = KWHzl(i);
            }
            if (sQLiteConnectionAEQbTJ != null) {
                return sQLiteConnectionAEQbTJ;
            }
            int iEZpvd = EZpvd(i);
            final ConnectionWaiter connectionWaiterKWHzl = KWHzl(Thread.currentThread(), SystemClock.uptimeMillis(), iEZpvd, z, str, i);
            ConnectionWaiter connectionWaiter = this.AYXKKw;
            ConnectionWaiter connectionWaiter2 = null;
            while (true) {
                if (connectionWaiter == null) {
                    break;
                }
                if (iEZpvd > connectionWaiter.AYXKKw) {
                    connectionWaiterKWHzl.AEQbTJ = connectionWaiter;
                    break;
                }
                connectionWaiter2 = connectionWaiter;
                connectionWaiter = connectionWaiter.AEQbTJ;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.AEQbTJ = connectionWaiterKWHzl;
            } else {
                this.AYXKKw = connectionWaiterKWHzl;
            }
            final int i2 = connectionWaiterKWHzl.copydefault;
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: net.zetetic.database.sqlcipher.SQLiteConnectionPool.1
                    @Override // android.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        synchronized (SQLiteConnectionPool.this.djBIcL) {
                            ConnectionWaiter connectionWaiter3 = connectionWaiterKWHzl;
                            if (connectionWaiter3.copydefault == i2) {
                                SQLiteConnectionPool.this.OLrzqt(connectionWaiter3);
                            }
                        }
                    }
                });
            }
            try {
                long j2 = connectionWaiterKWHzl.gEmmrt + 30000;
                long j3 = 30000;
                while (true) {
                    if (this.AhwBna.compareAndSet(true, false)) {
                        synchronized (this.djBIcL) {
                            valueOf();
                        }
                    }
                    LockSupport.parkNanos(this, j3 * 1000000);
                    Thread.interrupted();
                    synchronized (this.djBIcL) {
                        gEmmrt();
                        sQLiteConnection = connectionWaiterKWHzl.OLrzqt;
                        runtimeException = connectionWaiterKWHzl.EZpvd;
                        if (sQLiteConnection != null || runtimeException != null) {
                            break;
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (jUptimeMillis < j2) {
                            j = jUptimeMillis - j2;
                        } else {
                            OLrzqt(jUptimeMillis - connectionWaiterKWHzl.gEmmrt, i);
                            j2 = jUptimeMillis + 30000;
                            j = 30000;
                        }
                    }
                    return sQLiteConnection;
                    j3 = j;
                }
                EZpvd(connectionWaiterKWHzl);
                if (sQLiteConnection != null) {
                    return sQLiteConnection;
                }
                throw runtimeException;
            } finally {
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(null);
                }
            }
        }
    }

    public final void OLrzqt(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.OLrzqt == null && connectionWaiter.EZpvd == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.AYXKKw; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.AEQbTJ) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.AEQbTJ = connectionWaiter.AEQbTJ;
            } else {
                this.AYXKKw = connectionWaiter.AEQbTJ;
            }
            connectionWaiter.EZpvd = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.valueOf);
            valueOf();
        }
    }

    public final void OLrzqt(long j, int i) {
        Thread threadCurrentThread = Thread.currentThread();
        String str = this.EZpvd.AEQbTJ;
        threadCurrentThread.getId();
        threadCurrentThread.getName();
        Integer.toHexString(i);
        ArrayList<String> arrayList = new ArrayList();
        if (!this.KWHzl.isEmpty()) {
            Iterator<SQLiteConnection> it = this.KWHzl.keySet().iterator();
            while (it.hasNext()) {
                String strAEQbTJ = it.next().AEQbTJ();
                if (strAEQbTJ != null) {
                    arrayList.add(strAEQbTJ);
                }
            }
        }
        this.copydefault.size();
        if (arrayList.isEmpty()) {
            return;
        }
        for (String str2 : arrayList) {
        }
    }

    public final void valueOf() {
        SQLiteConnection sQLiteConnectionKWHzl;
        ConnectionWaiter connectionWaiter = this.AYXKKw;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.gEmmrt) {
                try {
                    if (connectionWaiter.djBIcL || z) {
                        sQLiteConnectionKWHzl = null;
                    } else {
                        sQLiteConnectionKWHzl = AEQbTJ(connectionWaiter.AhwBna, connectionWaiter.KWHzl);
                        if (sQLiteConnectionKWHzl == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnectionKWHzl == null && !z2 && (sQLiteConnectionKWHzl = KWHzl(connectionWaiter.KWHzl)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnectionKWHzl != null) {
                        connectionWaiter.OLrzqt = sQLiteConnectionKWHzl;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.EZpvd = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.AEQbTJ;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.AEQbTJ = connectionWaiter3;
                } else {
                    this.AYXKKw = connectionWaiter3;
                }
                connectionWaiter.AEQbTJ = null;
                LockSupport.unpark(connectionWaiter.valueOf);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public final SQLiteConnection KWHzl(int i) {
        SQLiteConnection sQLiteConnection = this.AEQbTJ;
        if (sQLiteConnection != null) {
            this.AEQbTJ = null;
            OLrzqt(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.KWHzl.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().EZpvd()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionOLrzqt = OLrzqt(this.EZpvd, true);
        OLrzqt(sQLiteConnectionOLrzqt, i);
        return sQLiteConnectionOLrzqt;
    }

    public final SQLiteConnection AEQbTJ(String str, int i) {
        int size = this.copydefault.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.copydefault.get(i2);
                if (sQLiteConnection.copydefault(str)) {
                    this.copydefault.remove(i2);
                    OLrzqt(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.copydefault.remove(size - 1);
            OLrzqt(sQLiteConnectionRemove, i);
            return sQLiteConnectionRemove;
        }
        int size2 = this.KWHzl.size();
        if (this.AEQbTJ != null) {
            size2++;
        }
        if (size2 >= this.fetchVPNInfo) {
            return null;
        }
        SQLiteConnection sQLiteConnectionOLrzqt = OLrzqt(this.EZpvd, false);
        OLrzqt(sQLiteConnectionOLrzqt, i);
        return sQLiteConnectionOLrzqt;
    }

    public final void OLrzqt(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.copydefault((i & 1) != 0);
            this.KWHzl.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Objects.toString(sQLiteConnection);
            OLrzqt(sQLiteConnection);
            throw e;
        }
    }

    public final boolean OLrzqt(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.AYXKKw;
        if (connectionWaiter == null) {
            return false;
        }
        int iEZpvd = EZpvd(i);
        while (iEZpvd <= connectionWaiter.AYXKKw) {
            if (z || !connectionWaiter.djBIcL) {
                return true;
            }
            connectionWaiter = connectionWaiter.AEQbTJ;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    public final void AhwBna() {
        this.fetchVPNInfo = (this.EZpvd.gEmmrt & 536870912) != 0 ? SQLiteGlobal.djBIcL() : 1;
    }

    public final void gEmmrt() {
        if (!this.gEmmrt) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    public final ConnectionWaiter KWHzl(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.valueOf;
        if (connectionWaiter != null) {
            this.valueOf = connectionWaiter.AEQbTJ;
            connectionWaiter.AEQbTJ = null;
        } else {
            connectionWaiter = new ConnectionWaiter();
        }
        connectionWaiter.valueOf = thread;
        connectionWaiter.gEmmrt = j;
        connectionWaiter.AYXKKw = i;
        connectionWaiter.djBIcL = z;
        connectionWaiter.AhwBna = str;
        connectionWaiter.KWHzl = i2;
        return connectionWaiter;
    }

    public final void EZpvd(ConnectionWaiter connectionWaiter) {
        connectionWaiter.AEQbTJ = this.valueOf;
        connectionWaiter.valueOf = null;
        connectionWaiter.AhwBna = null;
        connectionWaiter.OLrzqt = null;
        connectionWaiter.EZpvd = null;
        connectionWaiter.copydefault++;
        this.valueOf = connectionWaiter;
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.EZpvd.AYXKKw;
    }

    public static final class ConnectionWaiter {
        public ConnectionWaiter AEQbTJ;
        public int AYXKKw;
        public String AhwBna;
        public RuntimeException EZpvd;
        public int KWHzl;
        public SQLiteConnection OLrzqt;
        public int copydefault;
        public boolean djBIcL;
        public long gEmmrt;
        public Thread valueOf;

        private ConnectionWaiter() {
        }
    }
}
