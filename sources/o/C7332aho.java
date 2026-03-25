package o;

/* JADX INFO: renamed from: o.aho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7332aho implements InterfaceC60050zuZ {
    public java.lang.String AEQbTJ;
    public C7844arW EZpvd;
    public final java.lang.StringBuilder KWHzl = new java.lang.StringBuilder();
    public java.lang.String OLrzqt;

    @Override // o.InterfaceC60050zuZ
    public void KWHzl(java.lang.String str) {
    }

    public C7332aho(C7844arW c7844arW) {
        this.EZpvd = c7844arW;
        this.OLrzqt = C7836arO.KWHzl(c7844arW.gEmmrt());
        java.lang.String str = this.OLrzqt;
        java.lang.String str2 = java.io.File.separator;
        if (!str.endsWith(str2)) {
            this.OLrzqt += str2;
        }
        if (c7844arW.AhwBna()) {
            java.lang.String strKWHzl = c7844arW.KWHzl();
            this.AEQbTJ = strKWHzl;
            int iLastIndexOf = strKWHzl.lastIndexOf(str2);
            if (iLastIndexOf >= 0) {
                int i = iLastIndexOf + 1;
                if (this.AEQbTJ.substring(i).indexOf(46) > 0) {
                    this.AEQbTJ = this.AEQbTJ.substring(0, i);
                }
            }
        }
    }

    public byte[] EZpvd(java.lang.String str) {
        java.lang.Throwable th;
        java.io.InputStream inputStreamOpen;
        if (this.AEQbTJ == null) {
            java.lang.StringBuilder sb = this.KWHzl;
            sb.append("\tAnd ");
            sb.append("assetsPath is null.");
            return null;
        }
        try {
            inputStreamOpen = C7326ahi.OLrzqt().getAssets().open(C7864arq.KWHzl(this.AEQbTJ, str));
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
                java.lang.StringBuilder sb2 = this.KWHzl;
                sb2.append("\tAnd ");
                sb2.append(th.toString());
            } finally {
                C7866ars.AEQbTJ((java.io.Closeable) inputStreamOpen);
            }
        }
        return null;
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
        java.lang.String str2 = this.OLrzqt + str;
        if (new java.io.File(str2).exists()) {
            return str2;
        }
        java.lang.StringBuilder sb = this.KWHzl;
        sb.append("file ");
        sb.append(str2);
        sb.append(" not exists.");
        return null;
    }

    @Override // o.InterfaceC60050zuZ
    public byte[] OLrzqt(java.lang.String str) {
        return EZpvd(str);
    }

    @Override // o.InterfaceC60050zuZ
    public java.lang.String copydefault() {
        if (this.KWHzl.length() == 0) {
            return null;
        }
        return "MLSRF: " + this.KWHzl.toString();
    }
}
