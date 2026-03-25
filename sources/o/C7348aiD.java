package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.aiD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7348aiD {
    public float AEQbTJ;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(float f) {
        this.AEQbTJ = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.copydefault = f;
    }

    public C7348aiD() {
    }

    public C7348aiD(float f, float f2) {
        this.copydefault = f;
        this.AEQbTJ = f2;
    }

    public void KWHzl(@androidx.annotation.NonNull C7348aiD c7348aiD) {
        this.copydefault = c7348aiD.copydefault;
        this.AEQbTJ = c7348aiD.AEQbTJ;
    }

    public float copydefault() {
        return C7865arr.copydefault(this.copydefault);
    }

    public float OLrzqt() {
        return C7865arr.copydefault(this.AEQbTJ);
    }

    public java.lang.String toString() {
        return "Point{x=" + this.copydefault + ", y=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
    }
}
