package o;

import com.huawei.hms.framework.common.ContainerUtils;

/* JADX INFO: renamed from: o.zpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59896zpp {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String gEmmrt() {
        return this.KWHzl;
    }

    public C59896zpp(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.KWHzl = str;
        this.OLrzqt = i;
        java.lang.String str3 = ContainerUtils.FIELD_DELIMITER + str + ";";
        if (str2 != null) {
            this.EZpvd = str2;
        } else {
            this.EZpvd = str3;
        }
        this.AEQbTJ = z ? java.lang.String.valueOf((char) i) : str3;
        this.copydefault = z;
    }

    public java.lang.String KWHzl(boolean z) {
        return z ? KWHzl() : AEQbTJ();
    }

    public java.lang.String EZpvd() {
        return "&#" + this.OLrzqt + ";";
    }

    public java.lang.String OLrzqt() {
        return "&#x" + java.lang.Integer.toHexString(this.OLrzqt) + ";";
    }

    public java.lang.String copydefault() {
        return ContainerUtils.FIELD_DELIMITER + this.KWHzl + ";";
    }
}
