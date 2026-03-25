package o;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.auk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8016auk {
    public final java.lang.String AEQbTJ;
    public java.util.HashMap<java.lang.String, java.lang.String> KWHzl;
    public java.util.Map<java.lang.String, C8015auj> OLrzqt;
    public C8015auj copydefault;
    public final java.lang.String djBIcL;
    public int EZpvd = 0;
    public AtomicInteger AhwBna = new AtomicInteger(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8015auj AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.EZpvd = i | this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(C8015auj c8015auj) {
        this.copydefault = c8015auj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        int i = this.EZpvd & 7;
        return i != 1 ? i != 2 ? i != 4 ? "" : "assets" : "file" : "network";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.OLrzqt != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.HashMap<java.lang.String, java.lang.String> gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String valueOf() {
        return this.djBIcL;
    }

    public java.lang.String KWHzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.EZpvd & 32) == 32) {
            sb.append("download");
        }
        if ((this.EZpvd & 64) == 64) {
            sb.append("unzip");
        }
        return sb.toString();
    }

    public C8016auk(java.lang.String str, java.lang.String str2) {
        this.AEQbTJ = str2;
        this.djBIcL = str;
    }

    public int AYXKKw() {
        java.util.Map<java.lang.String, C8015auj> map = this.OLrzqt;
        if (map != null) {
            return map.size();
        }
        return 0;
    }

    public C8015auj AEQbTJ(java.lang.String str) {
        java.util.Map<java.lang.String, C8015auj> map = this.OLrzqt;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public java.lang.String EZpvd() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("type: ");
        sb.append(OLrzqt());
        sb.append("\taction: ");
        sb.append(KWHzl());
        sb.append("\tpreload: ");
        sb.append((this.EZpvd & 128) == 128);
        return sb.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScriptBundle{url='");
        sb.append(this.djBIcL);
        sb.append('\'');
        sb.append(", basePath='");
        sb.append(this.AEQbTJ);
        sb.append('\'');
        sb.append(", main=");
        sb.append(this.copydefault);
        sb.append(", children=");
        java.util.Map<java.lang.String, C8015auj> map = this.OLrzqt;
        sb.append(map != null ? map.keySet() : AbstractJsonLexerKt.NULL);
        sb.append(", flag=");
        sb.append(EZpvd());
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
