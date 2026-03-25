package o;

/* JADX INFO: loaded from: classes2.dex */
public class SG extends java.io.FilterInputStream {
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt(long j) {
        int i = this.OLrzqt;
        if (i == 0) {
            return -1L;
        }
        if (i == Integer.MIN_VALUE) {
            return j;
        }
        long j2 = i;
        return j > j2 ? j2 : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(long j) {
        int i = this.OLrzqt;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.OLrzqt = (int) (((long) i) - j);
    }

    public SG(@androidx.annotation.NonNull java.io.InputStream inputStream) {
        super(inputStream);
        this.OLrzqt = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            super.mark(i);
            this.OLrzqt = i;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        if (OLrzqt(1L) == -1) {
            return -1;
        }
        int i = super.read();
        copydefault(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@androidx.annotation.NonNull byte[] bArr, int i, int i2) throws java.io.IOException {
        int iOLrzqt = (int) OLrzqt(i2);
        if (iOLrzqt == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iOLrzqt);
        copydefault(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            super.reset();
            this.OLrzqt = Integer.MIN_VALUE;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long jOLrzqt = OLrzqt(j);
        if (jOLrzqt == -1) {
            return 0L;
        }
        long jSkip = super.skip(jOLrzqt);
        copydefault(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        int i = this.OLrzqt;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return java.lang.Math.min(i, super.available());
    }
}
