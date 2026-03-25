package o;

import java.util.Queue;

/* JADX INFO: renamed from: o.Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5470Sy extends java.io.InputStream {
    public static final Queue<C5470Sy> OLrzqt = SI.copydefault(0);
    public java.io.InputStream AEQbTJ;
    public java.io.IOException copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.NonNull java.io.InputStream inputStream) {
        this.AEQbTJ = inputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.IOException copydefault() {
        return this.copydefault;
    }

    public static C5470Sy OLrzqt(@androidx.annotation.NonNull java.io.InputStream inputStream) {
        C5470Sy c5470SyPoll;
        Queue<C5470Sy> queue = OLrzqt;
        synchronized (queue) {
            c5470SyPoll = queue.poll();
        }
        if (c5470SyPoll == null) {
            c5470SyPoll = new C5470Sy();
        }
        c5470SyPoll.AEQbTJ(inputStream);
        return c5470SyPoll;
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        return this.AEQbTJ.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.AEQbTJ.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.AEQbTJ.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.AEQbTJ.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        try {
            return this.AEQbTJ.read();
        } catch (java.io.IOException e) {
            this.copydefault = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        try {
            return this.AEQbTJ.read(bArr);
        } catch (java.io.IOException e) {
            this.copydefault = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            return this.AEQbTJ.read(bArr, i, i2);
        } catch (java.io.IOException e) {
            this.copydefault = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            this.AEQbTJ.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        try {
            return this.AEQbTJ.skip(j);
        } catch (java.io.IOException e) {
            this.copydefault = e;
            throw e;
        }
    }

    public void KWHzl() {
        this.copydefault = null;
        this.AEQbTJ = null;
        Queue<C5470Sy> queue = OLrzqt;
        synchronized (queue) {
            queue.offer(this);
        }
    }
}
