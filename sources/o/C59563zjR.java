package o;

/* JADX INFO: renamed from: o.zjR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59563zjR extends java.io.InputStream implements InterfaceC59556zjK {
    public boolean EZpvd;
    public java.io.InputStream KWHzl;
    public final InterfaceC59561zjP OLrzqt;

    public C59563zjR(java.io.InputStream inputStream, InterfaceC59561zjP interfaceC59561zjP) {
        C59851zoo.AEQbTJ(inputStream, "Wrapped stream");
        this.KWHzl = inputStream;
        this.EZpvd = false;
        this.OLrzqt = interfaceC59561zjP;
    }

    public boolean copydefault() throws java.io.IOException {
        if (this.EZpvd) {
            throw new java.io.IOException("Attempted read on closed stream.");
        }
        return this.KWHzl != null;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (!copydefault()) {
            return -1;
        }
        try {
            int i = this.KWHzl.read();
            copydefault(i);
            return i;
        } catch (java.io.IOException e) {
            OLrzqt();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!copydefault()) {
            return -1;
        }
        try {
            int i3 = this.KWHzl.read(bArr, i, i2);
            copydefault(i3);
            return i3;
        } catch (java.io.IOException e) {
            OLrzqt();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
        if (!copydefault()) {
            return 0;
        }
        try {
            return this.KWHzl.available();
        } catch (java.io.IOException e) {
            OLrzqt();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.EZpvd = true;
        KWHzl();
    }

    public void copydefault(int i) throws java.io.IOException {
        java.io.InputStream inputStream = this.KWHzl;
        if (inputStream == null || i >= 0) {
            return;
        }
        try {
            InterfaceC59561zjP interfaceC59561zjP = this.OLrzqt;
            if (interfaceC59561zjP == null || interfaceC59561zjP.AEQbTJ(inputStream)) {
                inputStream.close();
            }
        } finally {
            this.KWHzl = null;
        }
    }

    public void KWHzl() throws java.io.IOException {
        java.io.InputStream inputStream = this.KWHzl;
        if (inputStream != null) {
            try {
                InterfaceC59561zjP interfaceC59561zjP = this.OLrzqt;
                if (interfaceC59561zjP == null || interfaceC59561zjP.copydefault(inputStream)) {
                    inputStream.close();
                }
            } finally {
                this.KWHzl = null;
            }
        }
    }

    public void OLrzqt() throws java.io.IOException {
        java.io.InputStream inputStream = this.KWHzl;
        if (inputStream != null) {
            try {
                InterfaceC59561zjP interfaceC59561zjP = this.OLrzqt;
                if (interfaceC59561zjP == null || interfaceC59561zjP.EZpvd(inputStream)) {
                    inputStream.close();
                }
            } finally {
                this.KWHzl = null;
            }
        }
    }

    @Override // o.InterfaceC59556zjK
    public void ca_() throws java.io.IOException {
        close();
    }

    @Override // o.InterfaceC59556zjK
    public void bZ_() throws java.io.IOException {
        this.EZpvd = true;
        OLrzqt();
    }
}
