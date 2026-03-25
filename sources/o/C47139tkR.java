package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47139tkR {
    public static final C47139tkR OLrzqt = new C47139tkR();

    private C47139tkR() {
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().density);
    }

    public final java.lang.String copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().densityDpi);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().scaledDensity);
    }

    public final java.lang.String djBIcL(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().widthPixels);
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().heightPixels);
    }

    public final java.lang.String gEmmrt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().xdpi);
    }

    public final java.lang.String AhwBna(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getDisplayMetrics().ydpi);
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return java.lang.String.valueOf(context.getResources().getConfiguration().orientation);
    }
}
