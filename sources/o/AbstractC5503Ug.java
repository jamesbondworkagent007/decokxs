package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.ContentReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5503Ug {
    public int AEQbTJ;
    public int KWHzl;

    public abstract AbstractC5503Ug AEQbTJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.KWHzl >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DbNXlk() {
        int i = this.AEQbTJ;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl + 1;
    }

    public java.lang.Object KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        int i = this.KWHzl;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract java.lang.String copydefault();

    public void copydefault(java.lang.Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AEQbTJ == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AEQbTJ == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AEQbTJ == 1;
    }

    public AbstractC5503Ug() {
    }

    public AbstractC5503Ug(AbstractC5503Ug abstractC5503Ug) {
        this.AEQbTJ = abstractC5503Ug.AEQbTJ;
        this.KWHzl = abstractC5503Ug.KWHzl;
    }

    public AbstractC5503Ug(int i, int i2) {
        this.AEQbTJ = i;
        this.KWHzl = i2;
    }

    public boolean AYXKKw() {
        int i = this.AEQbTJ;
        if (i == 2) {
            return gEmmrt();
        }
        if (i == 1) {
            return AhwBna();
        }
        return false;
    }

    public boolean gEmmrt() {
        return copydefault() != null;
    }

    public JsonLocation OLrzqt(ContentReference contentReference) {
        return JsonLocation.NA;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        int i = this.AEQbTJ;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(OLrzqt());
            sb.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            java.lang.String strCopydefault = copydefault();
            if (strCopydefault != null) {
                sb.append('\"');
                C5521Ux.OLrzqt(sb, strCopydefault);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
        }
        return sb.toString();
    }
}
