package o;

import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: renamed from: o.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5448Sc extends RX<C5448Sc> {
    public static C5448Sc AEQbTJ;
    public static C5448Sc copydefault;

    public static C5448Sc OLrzqt(@androidx.annotation.NonNull AbstractC5360Os abstractC5360Os) {
        return new C5448Sc().copydefault(abstractC5360Os);
    }

    public static C5448Sc AhwBna(@androidx.annotation.DrawableRes int i) {
        return new C5448Sc().KWHzl(i);
    }

    public static C5448Sc OLrzqt(boolean z) {
        if (z) {
            if (AEQbTJ == null) {
                AEQbTJ = new C5448Sc().copydefault(true).AhwBna();
            }
            return AEQbTJ;
        }
        if (copydefault == null) {
            copydefault = new C5448Sc().copydefault(false).AhwBna();
        }
        return copydefault;
    }

    public static C5448Sc KWHzl(@androidx.annotation.NonNull NH nh) {
        return new C5448Sc().AEQbTJ(nh);
    }

    public static C5448Sc KWHzl(@androidx.annotation.NonNull NN<android.graphics.Bitmap> nn) {
        return new C5448Sc().EZpvd(nn);
    }

    public static C5448Sc KWHzl(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        return new C5448Sc().AEQbTJ(cls);
    }

    public static C5448Sc OLrzqt(@androidx.annotation.NonNull DownsampleStrategy downsampleStrategy) {
        return new C5448Sc().EZpvd(downsampleStrategy);
    }

    @Override // o.RX
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C5448Sc) && super.equals(obj);
    }

    @Override // o.RX
    public int hashCode() {
        return super.hashCode();
    }
}
