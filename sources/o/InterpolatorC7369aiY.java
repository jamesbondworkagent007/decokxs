package o;

/* JADX INFO: renamed from: o.aiY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class InterpolatorC7369aiY implements android.view.animation.Interpolator {
    public final float AEQbTJ;
    public final float EZpvd;
    public final float KWHzl;

    public InterpolatorC7369aiY() {
        this(1.0f, 100.0f, 10.0f);
    }

    public InterpolatorC7369aiY(float f, float f2, float f3) {
        this.AEQbTJ = f;
        this.EZpvd = f2;
        this.KWHzl = f3;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float fCos;
        float f2;
        double dSin;
        float f3;
        float f4 = this.KWHzl / (2.0f * this.AEQbTJ);
        float fSqrt = (float) java.lang.Math.sqrt(this.EZpvd / r1);
        float f5 = fSqrt * fSqrt;
        float f6 = f4 * f4;
        float fSqrt2 = (float) java.lang.Math.sqrt(f5 - f6);
        float fSqrt3 = (float) java.lang.Math.sqrt(f6 - f5);
        float fExp = (float) java.lang.Math.exp((-f4) * f);
        if (f4 < fSqrt) {
            double d = f * fSqrt2;
            fCos = ((float) java.lang.Math.cos(d)) * (-1.0f);
            f2 = ((f4 * (-1.0f)) + 0.0f) / fSqrt2;
            dSin = java.lang.Math.sin(d);
        } else {
            if (f4 == fSqrt) {
                f3 = fExp * ((((f4 * (-1.0f)) + 0.0f) * f) - 1.0f);
                return f3 + 1.0f;
            }
            double d2 = f * fSqrt3;
            fCos = ((float) java.lang.Math.cos(d2)) * (-1.0f);
            f2 = ((f4 * (-1.0f)) + 0.0f) / fSqrt3;
            dSin = java.lang.Math.sin(d2);
        }
        f3 = fExp * (fCos + (f2 * ((float) dSin)));
        return f3 + 1.0f;
    }
}
