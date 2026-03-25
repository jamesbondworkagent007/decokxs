package o;

import com.immomo.mls.utils.UrlParams;

/* JADX INFO: renamed from: o.arW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7844arW {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public UrlParams copydefault;
    public java.lang.String djBIcL;
    public byte gEmmrt = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UrlParams copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return (this.gEmmrt & 8) == 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return (this.gEmmrt & 4) == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return (this.gEmmrt & 16) == 16;
    }

    public C7844arW(@androidx.annotation.NonNull java.lang.String str) {
        copydefault(str);
    }

    public void copydefault(@androidx.annotation.NonNull java.lang.String str) {
        java.lang.String strSubstring;
        this.gEmmrt = (byte) 0;
        this.EZpvd = str;
        UrlParams urlParams = new UrlParams(str);
        this.copydefault = urlParams;
        java.lang.String urlWithoutParams = urlParams.getUrlWithoutParams();
        this.djBIcL = urlWithoutParams;
        if (android.webkit.URLUtil.isNetworkUrl(urlWithoutParams)) {
            this.gEmmrt = (byte) (this.gEmmrt | 4);
        } else if (AhwBna()) {
            this.gEmmrt = (byte) (this.gEmmrt | 8);
        } else if (DbNXlk()) {
            this.gEmmrt = (byte) (this.gEmmrt | 16);
        }
        if (C7839arR.OLrzqt(this.djBIcL)) {
            this.gEmmrt = (byte) (this.gEmmrt | 1);
        }
        if (C7839arR.copydefault(this.djBIcL)) {
            this.gEmmrt = (byte) (this.gEmmrt | 2);
        }
        int iLastIndexOf = this.djBIcL.lastIndexOf(47);
        this.KWHzl = iLastIndexOf >= 0 ? this.djBIcL.substring(iLastIndexOf + 1) : this.djBIcL;
        int iLastIndexOf2 = this.KWHzl.lastIndexOf(46);
        if (iLastIndexOf2 >= 0) {
            this.AEQbTJ = this.KWHzl.substring(iLastIndexOf2 + 1);
            strSubstring = this.KWHzl.substring(0, iLastIndexOf2);
        } else {
            strSubstring = this.KWHzl;
            this.AEQbTJ = strSubstring;
        }
        this.OLrzqt = strSubstring;
    }

    public java.lang.String gEmmrt() {
        if (djBIcL()) {
            return KWHzl();
        }
        return valueOf() ? AEQbTJ() : this.djBIcL;
    }

    public boolean AhwBna() {
        return (fetchVPNInfo() || valueOf() || (!djBIcL() && !this.djBIcL.startsWith("file://android_asset/"))) ? false : true;
    }

    public boolean DbNXlk() {
        if (fetchVPNInfo() || djBIcL()) {
            return false;
        }
        if (valueOf()) {
            return true;
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        return !android.text.TextUtils.isEmpty(strAEQbTJ) && C7864arq.OLrzqt(strAEQbTJ);
    }

    public java.lang.String KWHzl() {
        return !this.djBIcL.startsWith("file://android_asset/") ? this.djBIcL : this.djBIcL.substring(21);
    }

    public java.lang.String AEQbTJ() {
        java.lang.String strOLrzqt = this.djBIcL;
        if (C7872ary.gEmmrt(strOLrzqt)) {
            strOLrzqt = C7872ary.OLrzqt(strOLrzqt);
        }
        if (strOLrzqt.startsWith("/")) {
            return strOLrzqt;
        }
        return null;
    }

    public java.lang.String OLrzqt() {
        java.lang.String entryFile = this.copydefault.getEntryFile();
        if (!android.text.TextUtils.isEmpty(entryFile)) {
            return entryFile;
        }
        return this.OLrzqt + ".lua";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return copydefault(this.EZpvd, ((C7844arW) obj).EZpvd);
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static boolean copydefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
