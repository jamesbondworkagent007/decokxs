package o;

/* JADX INFO: renamed from: o.aiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7352aiH {
    public final C7348aiD AEQbTJ;
    public final C7350aiF KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7350aiF EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7348aiD copydefault() {
        return this.AEQbTJ;
    }

    public C7352aiH() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public C7352aiH(float f, float f2, float f3, float f4) {
        this.KWHzl = new C7350aiF(f3, f4);
        this.AEQbTJ = new C7348aiD(f, f2);
    }

    public void AEQbTJ(float f) {
        this.AEQbTJ.KWHzl(f);
    }

    public float KWHzl() {
        return this.AEQbTJ.KWHzl();
    }

    public void OLrzqt(float f) {
        this.AEQbTJ.AEQbTJ(f);
    }

    public float djBIcL() {
        return this.AEQbTJ.EZpvd();
    }

    public void EZpvd(float f) {
        if (f == -1.0f) {
            f = Float.MIN_VALUE;
        }
        if (f == -2.0f) {
            f = 2.8E-45f;
        }
        this.KWHzl.AEQbTJ(f);
    }

    public float AEQbTJ() {
        return this.KWHzl.KWHzl();
    }

    public void KWHzl(float f) {
        if (f == -1.0f) {
            f = Float.MIN_VALUE;
        }
        if (f == -2.0f) {
            f = 2.8E-45f;
        }
        this.KWHzl.KWHzl(f);
    }

    public float OLrzqt() {
        return (int) this.KWHzl.EZpvd();
    }

    public void OLrzqt(@androidx.annotation.NonNull C7348aiD c7348aiD) {
        this.AEQbTJ.KWHzl(c7348aiD);
    }

    public void EZpvd(@androidx.annotation.NonNull C7350aiF c7350aiF) {
        this.KWHzl.KWHzl(c7350aiF);
    }

    public java.lang.String toString() {
        return this.KWHzl.toString() + " " + this.AEQbTJ.toString();
    }
}
