package o;

/* JADX INFO: renamed from: o.zuS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60043zuS implements InterfaceC60050zuZ {
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    @Override // o.InterfaceC60050zuZ
    public void KWHzl(java.lang.String str) {
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(java.lang.String str) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C60043zuS(java.lang.String str) {
        this.copydefault = str;
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String AEQbTJ(java.lang.String str) {
        if (str.endsWith(".lua")) {
            str = str.substring(0, str.length() - 4);
        }
        if (!str.contains("..")) {
            return C60048zuX.OLrzqt(str, '.', java.io.File.separatorChar) + ".lua";
        }
        return str + ".lua";
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault(java.lang.String str) {
        this.OLrzqt = null;
        java.io.File file = new java.io.File(this.copydefault, str);
        if (file.isFile()) {
            return file.getAbsolutePath();
        }
        this.OLrzqt = "PRF: " + file.getAbsolutePath() + " not a file";
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.copydefault.equals(((C60043zuS) obj).copydefault);
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }
}
