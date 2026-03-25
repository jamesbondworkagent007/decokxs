package o;

import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10353bmp {
    public static final C10353bmp OLrzqt = new C10353bmp();

    private C10353bmp() {
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.KWHzl(imageView).EZpvd(str).AEQbTJ(ContextCompat.getDrawable(imageView.getContext(), i)).EZpvd(imageView);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0 || !C59449zhJ.valueOf(str, ".svg", true)) {
            return str;
        }
        return "SVG:" + str;
    }

    public final C5448Sc KWHzl(@NotNull java.lang.String str) {
        C5448Sc c5448Sc;
        Intrinsics.checkNotNullParameter(str, "");
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        if (!C59449zhJ.valueOf(str, ".svg", true)) {
            return StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) ".gif", true) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
        }
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

    public final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str, @androidx.annotation.DrawableRes int i, C5448Sc c5448Sc, C5448Sc c5448Sc2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c5448Sc2 != null) {
                c5335NtOLrzqt = c5335NtOLrzqt.OLrzqt((RX<?>) c5448Sc2);
            }
            c5335NtOLrzqt.EZpvd(imageView);
            return;
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
        if (c5448Sc != null) {
            c5335NtEZpvd = c5335NtEZpvd.OLrzqt((RX<?>) c5448Sc);
        }
        c5335NtEZpvd.AEQbTJ(i).copydefault(i).KWHzl(i).EZpvd(imageView);
    }

    public final java.lang.String AEQbTJ(long j) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
        if (c10854bwMCopydefault == null) {
            return "";
        }
        return C54870xYj.EZpvd(java.lang.String.valueOf(j), c10854bwMCopydefault.valueOf(), c10854bwMCopydefault.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public static /* synthetic */ android.graphics.drawable.Drawable generateSolidBackground$default(C10353bmp c10353bmp, android.content.Context context, int i, java.lang.Integer num, float f, java.lang.Integer num2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        java.lang.Integer num3 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            f = 0.0f;
        }
        return c10353bmp.AEQbTJ(context, i3, num3, f, (i2 & 16) != 0 ? null : num2);
    }

    public final android.graphics.drawable.Drawable AEQbTJ(@NotNull android.content.Context context, int i, @androidx.annotation.ColorRes java.lang.Integer num, float f, @androidx.annotation.ColorRes java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (num != null) {
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, num.intValue())));
        }
        if (f > 0.0f && num2 != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, num2.intValue()));
        }
        return gradientDrawable;
    }
}
