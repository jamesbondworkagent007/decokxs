package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zjy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59596zjy {
    public static final java.lang.String EZpvd = null;
    public static final C59596zjy KWHzl = new C59596zjy(null, -1, null, null);
    public static final java.lang.String OLrzqt = null;
    public static final java.lang.String copydefault = null;
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String djBIcL;
    public final HttpHost valueOf;

    public C59596zjy(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.AEQbTJ = str == null ? copydefault : str.toLowerCase(java.util.Locale.ROOT);
        this.AYXKKw = i < 0 ? -1 : i;
        this.AhwBna = str2 == null ? EZpvd : str2;
        this.djBIcL = str3 == null ? OLrzqt : str3.toUpperCase(java.util.Locale.ROOT);
        this.valueOf = null;
    }

    public C59596zjy(HttpHost httpHost, java.lang.String str, java.lang.String str2) {
        C59851zoo.AEQbTJ(httpHost, "Host");
        java.lang.String hostName = httpHost.getHostName();
        java.util.Locale locale = java.util.Locale.ROOT;
        this.AEQbTJ = hostName.toLowerCase(locale);
        this.AYXKKw = httpHost.getPort() < 0 ? -1 : httpHost.getPort();
        this.AhwBna = str == null ? EZpvd : str;
        this.djBIcL = str2 == null ? OLrzqt : str2.toUpperCase(locale);
        this.valueOf = httpHost;
    }

    public int EZpvd(C59596zjy c59596zjy) {
        int i;
        if (C59852zop.OLrzqt(this.djBIcL, c59596zjy.djBIcL)) {
            i = 1;
        } else {
            java.lang.String str = this.djBIcL;
            java.lang.String str2 = OLrzqt;
            if (str != str2 && c59596zjy.djBIcL != str2) {
                return -1;
            }
            i = 0;
        }
        if (C59852zop.OLrzqt(this.AhwBna, c59596zjy.AhwBna)) {
            i += 2;
        } else {
            java.lang.String str3 = this.AhwBna;
            java.lang.String str4 = EZpvd;
            if (str3 != str4 && c59596zjy.AhwBna != str4) {
                return -1;
            }
        }
        int i2 = this.AYXKKw;
        int i3 = c59596zjy.AYXKKw;
        if (i2 == i3) {
            i += 4;
        } else if (i2 != -1 && i3 != -1) {
            return -1;
        }
        if (C59852zop.OLrzqt(this.AEQbTJ, c59596zjy.AEQbTJ)) {
            return i + 8;
        }
        java.lang.String str5 = this.AEQbTJ;
        java.lang.String str6 = copydefault;
        if (str5 == str6 || c59596zjy.AEQbTJ == str6) {
            return i;
        }
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59596zjy)) {
            return super.equals(obj);
        }
        C59596zjy c59596zjy = (C59596zjy) obj;
        return C59852zop.OLrzqt(this.AEQbTJ, c59596zjy.AEQbTJ) && this.AYXKKw == c59596zjy.AYXKKw && C59852zop.OLrzqt(this.AhwBna, c59596zjy.AhwBna) && C59852zop.OLrzqt(this.djBIcL, c59596zjy.djBIcL);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.djBIcL;
        if (str != null) {
            sb.append(str.toUpperCase(java.util.Locale.ROOT));
            sb.append(' ');
        }
        if (this.AhwBna != null) {
            sb.append('\'');
            sb.append(this.AhwBna);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.AEQbTJ != null) {
            sb.append('@');
            sb.append(this.AEQbTJ);
            if (this.AYXKKw >= 0) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(this.AYXKKw);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return C59852zop.EZpvd(C59852zop.EZpvd(C59852zop.EZpvd(C59852zop.EZpvd(17, this.AEQbTJ), this.AYXKKw), this.AhwBna), this.djBIcL);
    }
}
