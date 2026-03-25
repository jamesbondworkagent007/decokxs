package o;

/* JADX INFO: renamed from: o.atZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7953atZ implements InterfaceC60050zuZ {
    public java.lang.String EZpvd;
    public final android.content.Context KWHzl;

    @Override // o.InterfaceC60050zuZ
    public void KWHzl(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault(java.lang.String str) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C7953atZ(android.content.Context context) {
        this.KWHzl = context.getApplicationContext();
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String AEQbTJ(java.lang.String str) {
        if (str.endsWith(".lua")) {
            str = str.substring(0, str.length() - 4);
        }
        if (!str.contains("..")) {
            return C60048zuX.OLrzqt(str, '.', java.io.File.separatorChar) + ".lua";
        }
        return C7864arq.KWHzl("", str + ".lua");
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(java.lang.String str) {
        java.lang.Throwable th;
        java.io.InputStream inputStreamOpen;
        this.EZpvd = null;
        try {
            inputStreamOpen = this.KWHzl.getAssets().open(str);
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
        try {
            int iAvailable = inputStreamOpen.available();
            byte[] bArr = new byte[iAvailable];
            if (inputStreamOpen.read(bArr) == iAvailable) {
                return bArr;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                this.EZpvd = "ARF: " + th.toString();
            } finally {
                C7866ars.AEQbTJ((java.io.Closeable) inputStreamOpen);
            }
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }
}
