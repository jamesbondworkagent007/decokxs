package o;

import com.immomo.mls.fun.ud.UDPath;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zkD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59602zkD {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C59602zkD(java.lang.String str, int i, java.lang.String str2, boolean z) {
        C59851zoo.copydefault(str, "Host");
        C59851zoo.KWHzl(i, "Port");
        C59851zoo.AEQbTJ(str2, UDPath.LUA_CLASS_NAME);
        this.AEQbTJ = str.toLowerCase(java.util.Locale.ROOT);
        this.KWHzl = i;
        if (C59853zoq.OLrzqt(str2)) {
            this.copydefault = "/";
        } else {
            this.copydefault = str2;
        }
        this.EZpvd = z;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (this.EZpvd) {
            sb.append("(secure)");
        }
        sb.append(this.AEQbTJ);
        sb.append(AbstractJsonLexerKt.COLON);
        sb.append(java.lang.Integer.toString(this.KWHzl));
        sb.append(this.copydefault);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
