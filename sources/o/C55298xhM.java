package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55298xhM {
    public static final int EZpvd(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(i / context.getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ int px2dp$default(int i, android.content.Context context, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return EZpvd(i, context);
    }

    public static final int copydefault(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(i / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static /* synthetic */ int px2sp$default(int i, android.content.Context context, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return copydefault(i, context);
    }

    public static final int AhwBna(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(f / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static /* synthetic */ int px2sp$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return AhwBna(f, context);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yIH.KWHzl(float):int */
    public static final int AEQbTJ(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(f / context.getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ int px2dp$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return AEQbTJ(f, context);
    }

    public static final int copydefault(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static /* synthetic */ int dp2px$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return copydefault(f, context);
    }

    public static final int djBIcL(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(android.util.TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics()));
    }

    public static /* synthetic */ int sp2px$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return djBIcL(f, context);
    }

    public static final float gEmmrt(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return android.util.TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float sp2pxFloat$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return gEmmrt(f, context);
    }

    public static final float EZpvd(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float dp2pxFloat$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return EZpvd(f, context);
    }

    public static final float AEQbTJ(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float dp$default(int i, android.content.Context context, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return AEQbTJ(i, context);
    }

    public static final int OLrzqt(int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(android.util.TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    public static /* synthetic */ int dpInt$default(int i, android.content.Context context, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return OLrzqt(i, context);
    }

    public static final float OLrzqt(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float dp$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return OLrzqt(f, context);
    }

    public static final int KWHzl(float f, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return yII.EZpvd(android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static /* synthetic */ int dpInt$default(float f, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = C52762wXk.AEQbTJ();
        }
        return KWHzl(f, context);
    }
}
