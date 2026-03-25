package o;

import android.support.v4.media.session.PlaybackStateCompat;
import org.apache.http.ConnectionClosedException;

/* JADX INFO: renamed from: o.znj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59793znj extends java.io.InputStream {
    public InterfaceC59758znA KWHzl;
    public final long OLrzqt;
    public long EZpvd = 0;
    public boolean AEQbTJ = false;

    public C59793znj(InterfaceC59758znA interfaceC59758znA, long j) {
        this.KWHzl = null;
        this.KWHzl = (InterfaceC59758znA) C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
        this.OLrzqt = C59851zoo.KWHzl(j, "Content length");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.AEQbTJ) {
            return;
        }
        try {
            if (this.EZpvd < this.OLrzqt) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.AEQbTJ = true;
        }
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        InterfaceC59758znA interfaceC59758znA = this.KWHzl;
        if (interfaceC59758znA instanceof InterfaceC59801znr) {
            return java.lang.Math.min(((InterfaceC59801znr) interfaceC59758znA).valueOf(), (int) (this.OLrzqt - this.EZpvd));
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        if (this.EZpvd >= this.OLrzqt) {
            return -1;
        }
        int iKWHzl = this.KWHzl.KWHzl();
        if (iKWHzl != -1) {
            this.EZpvd++;
        } else if (this.EZpvd < this.OLrzqt) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.OLrzqt + "; received: " + this.EZpvd);
        }
        return iKWHzl;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.AEQbTJ) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        long j = this.EZpvd;
        long j2 = this.OLrzqt;
        if (j >= j2) {
            return -1;
        }
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        int iEZpvd = this.KWHzl.EZpvd(bArr, i, i2);
        if (iEZpvd != -1 || this.EZpvd >= this.OLrzqt) {
            if (iEZpvd > 0) {
                this.EZpvd += (long) iEZpvd;
            }
            return iEZpvd;
        }
        throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: " + this.OLrzqt + "; received: " + this.EZpvd);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long jMin = java.lang.Math.min(j, this.OLrzqt - this.EZpvd);
        long j2 = 0;
        while (jMin > 0 && (i = read(bArr, 0, (int) java.lang.Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, jMin))) != -1) {
            long j3 = i;
            j2 += j3;
            jMin -= j3;
        }
        return j2;
    }
}
