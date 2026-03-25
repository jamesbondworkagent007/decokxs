package o;

import android.graphics.PorterDuff;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bumptech.glide.load.DecodeFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57491yjS {
    public static final C57491yjS OLrzqt = new C57491yjS();

    private C57491yjS() {
    }

    public final android.graphics.drawable.Drawable copydefault(android.content.Context context, int i, int i2) {
        android.graphics.drawable.Drawable drawable;
        if (context == null || (drawable = ContextCompat.getDrawable(context, i)) == null) {
            return null;
        }
        android.graphics.drawable.Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
        int color = ContextCompat.getColor(context, i2);
        DrawableCompat.setTintMode(drawableMutate, PorterDuff.Mode.SRC_IN);
        DrawableCompat.setTint(drawableMutate, color);
        return drawableMutate;
    }

    public final C5448Sc OLrzqt(@NotNull java.lang.String str) {
        C5448Sc c5448Sc;
        Intrinsics.checkNotNullParameter(str, "");
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }
}
