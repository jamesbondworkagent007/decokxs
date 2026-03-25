package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.aiF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7350aiF {
    public float OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(float f) {
        this.copydefault = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float EZpvd() {
        return this.OLrzqt;
    }

    public final boolean EZpvd(float f) {
        return f == Float.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.OLrzqt = f;
    }

    public final boolean OLrzqt(float f) {
        return f == 2.8E-45f;
    }

    public C7350aiF() {
    }

    public C7350aiF(float f, float f2) {
        this.copydefault = f;
        this.OLrzqt = f2;
    }

    public void KWHzl(@androidx.annotation.NonNull C7350aiF c7350aiF) {
        this.copydefault = c7350aiF.copydefault;
        this.OLrzqt = c7350aiF.OLrzqt;
    }

    public int copydefault() {
        if (EZpvd(this.copydefault)) {
            return -1;
        }
        if (OLrzqt(this.copydefault)) {
            return -2;
        }
        return C7865arr.copydefault(this.copydefault);
    }

    public int AEQbTJ() {
        if (EZpvd(this.OLrzqt)) {
            return -1;
        }
        if (OLrzqt(this.OLrzqt)) {
            return -2;
        }
        return C7865arr.copydefault(this.OLrzqt);
    }

    public java.lang.String toString() {
        return "Size{width=" + this.copydefault + ", height=" + this.OLrzqt + AbstractJsonLexerKt.END_OBJ;
    }
}
