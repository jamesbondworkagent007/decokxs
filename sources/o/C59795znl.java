package o;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;

/* JADX INFO: renamed from: o.znl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59795znl extends java.io.InputStream {
    public boolean AEQbTJ;
    public InterfaceC59518ziZ[] AYXKKw;
    public final InterfaceC59758znA AhwBna;
    public boolean EZpvd;
    public final org.apache.http.util.CharArrayBuffer KWHzl;
    public long OLrzqt;
    public final C59549zjD copydefault;
    public int djBIcL;
    public long gEmmrt;

    public C59795znl(InterfaceC59758znA interfaceC59758znA, C59549zjD c59549zjD) {
        this.AEQbTJ = false;
        this.EZpvd = false;
        this.AYXKKw = new InterfaceC59518ziZ[0];
        this.AhwBna = (InterfaceC59758znA) C59851zoo.AEQbTJ(interfaceC59758znA, "Session input buffer");
        this.gEmmrt = 0L;
        this.KWHzl = new org.apache.http.util.CharArrayBuffer(16);
        this.copydefault = c59549zjD == null ? C59549zjD.OLrzqt : c59549zjD;
        this.djBIcL = 1;
    }

    public C59795znl(InterfaceC59758znA interfaceC59758znA) {
        this(interfaceC59758znA, null);
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        if (this.AhwBna instanceof InterfaceC59801znr) {
            return (int) java.lang.Math.min(((InterfaceC59801znr) r0).valueOf(), this.OLrzqt - this.gEmmrt);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.EZpvd) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        if (this.AEQbTJ) {
            return -1;
        }
        if (this.djBIcL != 2) {
            KWHzl();
            if (this.AEQbTJ) {
                return -1;
            }
        }
        int iKWHzl = this.AhwBna.KWHzl();
        if (iKWHzl != -1) {
            long j = this.gEmmrt + 1;
            this.gEmmrt = j;
            if (j >= this.OLrzqt) {
                this.djBIcL = 3;
            }
        }
        return iKWHzl;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.EZpvd) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        if (this.AEQbTJ) {
            return -1;
        }
        if (this.djBIcL != 2) {
            KWHzl();
            if (this.AEQbTJ) {
                return -1;
            }
        }
        int iEZpvd = this.AhwBna.EZpvd(bArr, i, (int) java.lang.Math.min(i2, this.OLrzqt - this.gEmmrt));
        if (iEZpvd != -1) {
            long j = this.gEmmrt + ((long) iEZpvd);
            this.gEmmrt = j;
            if (j >= this.OLrzqt) {
                this.djBIcL = 3;
            }
            return iEZpvd;
        }
        this.AEQbTJ = true;
        throw new TruncatedChunkException("Truncated chunk ( expected size: " + this.OLrzqt + "; actual size: " + this.gEmmrt + ")");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    public final void KWHzl() throws java.io.IOException {
        if (this.djBIcL == Integer.MAX_VALUE) {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
        try {
            long jAEQbTJ = AEQbTJ();
            this.OLrzqt = jAEQbTJ;
            if (jAEQbTJ < 0) {
                throw new MalformedChunkCodingException("Negative chunk size");
            }
            this.djBIcL = 2;
            this.gEmmrt = 0L;
            if (jAEQbTJ == 0) {
                this.AEQbTJ = true;
                copydefault();
            }
        } catch (MalformedChunkCodingException e) {
            this.djBIcL = Integer.MAX_VALUE;
            throw e;
        }
    }

    public final long AEQbTJ() throws java.io.IOException {
        int i = this.djBIcL;
        if (i != 1) {
            if (i == 3) {
                this.KWHzl.clear();
                if (this.AhwBna.EZpvd(this.KWHzl) == -1) {
                    throw new MalformedChunkCodingException("CRLF expected at end of chunk");
                }
                if (!this.KWHzl.isEmpty()) {
                    throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
                }
                this.djBIcL = 1;
            } else {
                throw new java.lang.IllegalStateException("Inconsistent codec state");
            }
        }
        this.KWHzl.clear();
        if (this.AhwBna.EZpvd(this.KWHzl) == -1) {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
        int iIndexOf = this.KWHzl.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = this.KWHzl.length();
        }
        java.lang.String strSubstringTrimmed = this.KWHzl.substringTrimmed(0, iIndexOf);
        try {
            return java.lang.Long.parseLong(strSubstringTrimmed, 16);
        } catch (java.lang.NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header: " + strSubstringTrimmed);
        }
    }

    public final void copydefault() throws java.io.IOException {
        try {
            this.AYXKKw = AbstractC59790zng.AEQbTJ(this.AhwBna, this.copydefault.OLrzqt(), this.copydefault.AEQbTJ(), null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            malformedChunkCodingException.initCause(e);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.EZpvd) {
            return;
        }
        try {
            if (!this.AEQbTJ && this.djBIcL != Integer.MAX_VALUE) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.AEQbTJ = true;
            this.EZpvd = true;
        }
    }
}
