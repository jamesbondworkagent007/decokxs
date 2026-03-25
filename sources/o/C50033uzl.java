package o;

import android.graphics.drawable.GradientDrawable;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50033uzl {
    public static /* synthetic */ void loadImageWithBorder$default(android.widget.ImageView imageView, java.lang.String str, C50030uzi c50030uzi, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c50030uzi = new C50030uzi(null, null, 0.0f, 0, 15, null);
        }
        EZpvd(imageView, str, c50030uzi);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull C50030uzi c50030uzi) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c50030uzi, "");
        if (copydefault(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), c50030uzi.AEQbTJ(), c50030uzi.OLrzqt(), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().EZpvd(c50030uzi.copydefault()).OLrzqt(c50030uzi.copydefault()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c50030uzi.KWHzl() != null) {
                c5335NtOLrzqt.AEQbTJ(c50030uzi.KWHzl());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c50030uzi.copydefault());
    }

    public static /* synthetic */ void loadSquareImage$default(android.widget.ImageView imageView, java.lang.String str, int i, C50030uzi c50030uzi, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            c50030uzi = new C50030uzi(null, null, 0.0f, 0, 15, null);
        }
        OLrzqt(imageView, str, i, c50030uzi);
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, @NotNull C50030uzi c50030uzi) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c50030uzi, "");
        if (copydefault(imageView.getContext())) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(new C5405Ql(), new C5417Qx(i))).OLrzqt((RX<?>) new C5448Sc().EZpvd(c50030uzi.copydefault()).OLrzqt(c50030uzi.copydefault()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c50030uzi.KWHzl() != null) {
                c5335NtOLrzqt.AEQbTJ(c50030uzi.KWHzl()).EZpvd(imageView);
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c50030uzi.copydefault());
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv);
        if (copydefault(imageView.getContext())) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(new C5405Ql(), new C33484mxN(imageView.getContext()))).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawableKWHzl).OLrzqt(drawableKWHzl));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(drawableKWHzl);
    }

    public static /* synthetic */ void loadBlockiesIconWithBorder$default(android.widget.ImageView imageView, wXL wxl, C50030uzi c50030uzi, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c50030uzi = new C50030uzi(null, null, 0.0f, 0, 15, null);
        }
        KWHzl(imageView, wxl, c50030uzi);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull wXL wxl, @NotNull C50030uzi c50030uzi) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(wxl, "");
        Intrinsics.checkNotNullParameter(c50030uzi, "");
        if (copydefault(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).KWHzl(wxl).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null))).OLrzqt((RX<?>) new C5448Sc().EZpvd(c50030uzi.copydefault()).OLrzqt(c50030uzi.copydefault()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c50030uzi.KWHzl() != null) {
                c5335NtOLrzqt.AEQbTJ(c50030uzi.KWHzl());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c50030uzi.copydefault());
    }

    public static /* synthetic */ android.graphics.drawable.Drawable generateSolidBackground$default(int i, java.lang.Integer num, float f, java.lang.Integer num2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return OLrzqt(i, num, f, num2);
    }

    public static final android.graphics.drawable.Drawable OLrzqt(int i, @androidx.annotation.ColorInt java.lang.Integer num, float f, @androidx.annotation.ColorInt java.lang.Integer num2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (num != null) {
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(num.intValue()));
        }
        if (f > 0.0f && num2 != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), num2.intValue());
        }
        return gradientDrawable;
    }

    public static final boolean copydefault(android.content.Context context) {
        if (context != null) {
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (activity.isDestroyed() || activity.isFinishing()) {
                }
            }
            return true;
        }
        return false;
    }
}
