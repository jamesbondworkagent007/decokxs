package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SQLiteClosable implements Closeable {
    public int EZpvd = 1;

    public abstract void EZpvd();

    public void OLrzqt() {
        synchronized (this) {
            int i = this.EZpvd;
            if (i <= 0) {
                throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
            }
            this.EZpvd = i + 1;
        }
    }

    public void KWHzl() {
        boolean z;
        synchronized (this) {
            int i = this.EZpvd - 1;
            this.EZpvd = i;
            z = i == 0;
        }
        if (z) {
            EZpvd();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        KWHzl();
    }
}
