package o;

/* JADX INFO: renamed from: o.ypp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class InterpolatorC57832ypp implements android.view.animation.Interpolator {
    public double KWHzl;
    public double OLrzqt;

    public InterpolatorC57832ypp(double d, double d2) {
        this.OLrzqt = d;
        this.KWHzl = d2;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return (float) ((java.lang.Math.pow(2.718281828459045d, ((double) (-f)) / this.OLrzqt) * (-1.0d) * java.lang.Math.cos(this.KWHzl * ((double) f))) + 1.0d);
    }
}
