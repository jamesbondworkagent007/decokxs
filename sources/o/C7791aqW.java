package o;

/* JADX INFO: renamed from: o.aqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7791aqW implements InterfaceC7790aqV {
    public android.content.Context AEQbTJ;
    public java.io.File AYXKKw;
    public InterfaceC7790aqV AhwBna;
    public boolean AkhnZx = false;
    public java.lang.String EZpvd;
    public java.io.File KWHzl;
    public java.io.File OLrzqt;
    public InterfaceC7792aqX copydefault;
    public java.lang.String djBIcL;
    public java.io.File fetchVPNInfo;
    public InterfaceC43015rhM gEmmrt;
    public java.io.File valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.File AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.File AYXKKw() {
        return this.fetchVPNInfo;
    }

    public InterfaceC7790aqV AhwBna() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return (this.AEQbTJ == null || this.AYXKKw == null || this.OLrzqt == null || this.KWHzl == null || this.EZpvd == null || this.AhwBna == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.File KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC7792aqX copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.File djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC43015rhM gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.io.File valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.AkhnZx;
    }

    public boolean fetchVPNInfo() {
        java.lang.String str = this.djBIcL;
        return (str == null || str.isEmpty()) ? false : true;
    }

    @Override // o.InterfaceC7790aqV
    public java.lang.String AEQbTJ(android.content.Context context, java.lang.String str) {
        if (this.AkhnZx && !android.text.TextUtils.isEmpty(str)) {
            java.io.File file = new java.io.File(C7324ahg.copydefault(), java.io.File.separator + str);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
        }
        if (!fetchVPNInfo()) {
            return this.AhwBna.AEQbTJ(context, str);
        }
        java.io.File file2 = this.fetchVPNInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.djBIcL);
        java.lang.String str2 = java.io.File.separator;
        sb.append(str2);
        sb.append("oklua.bundle");
        sb.append(str2);
        sb.append(str);
        java.io.File file3 = new java.io.File(file2, sb.toString());
        if (file3.exists()) {
            return file3.getAbsolutePath();
        }
        java.io.File file4 = new java.io.File(this.AYXKKw.getAbsolutePath() + str2 + this.djBIcL + str2 + "oklua.bundle" + str2 + str);
        if (file4.exists()) {
            return file4.getAbsolutePath();
        }
        return AEQbTJ(str);
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        return "file://android_asset/oklua.bundle/" + str;
    }

    public static java.lang.String OLrzqt() {
        return C33486mxP.EZpvd(C32979mnm.EZpvd.OLrzqt(), "oklua.bundle/info.json");
    }
}
