package o;

/* JADX INFO: renamed from: o.aiV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7366aiV {
    public static android.view.animation.Interpolator AEQbTJ;
    public static android.view.animation.Interpolator EZpvd;
    public static android.view.animation.Interpolator KWHzl;
    public static android.view.animation.Interpolator OLrzqt;
    public static android.view.animation.Interpolator copydefault;
    public static final android.view.animation.Interpolator gEmmrt = new android.view.animation.LinearInterpolator();
    public static android.view.animation.Interpolator valueOf;

    public static android.view.animation.Interpolator OLrzqt(int i) {
        switch (i) {
            case 1:
            case 7:
                if (EZpvd == null) {
                    EZpvd = new android.view.animation.AccelerateInterpolator();
                }
                return EZpvd;
            case 2:
            case 8:
                if (AEQbTJ == null) {
                    AEQbTJ = new android.view.animation.DecelerateInterpolator();
                }
                return AEQbTJ;
            case 3:
            case 9:
                if (copydefault == null) {
                    copydefault = new android.view.animation.AccelerateDecelerateInterpolator();
                }
                return copydefault;
            case 4:
                if (OLrzqt == null) {
                    OLrzqt = new android.view.animation.OvershootInterpolator();
                }
                return OLrzqt;
            case 5:
                if (KWHzl == null) {
                    KWHzl = new android.view.animation.BounceInterpolator();
                }
                return KWHzl;
            case 6:
                if (valueOf == null) {
                    valueOf = new InterpolatorC7369aiY();
                }
                return valueOf;
            default:
                return gEmmrt;
        }
    }
}
