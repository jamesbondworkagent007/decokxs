package o;

import android.graphics.drawable.GradientDrawable;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mUL {
    public static /* synthetic */ void loadImageWithBorder$default(android.widget.ImageView imageView, java.lang.String str, mUJ muj, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            muj = new mUJ(null, null, 0.0f, 0, 15, null);
        }
        EZpvd(imageView, str, muj);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull mUJ muj) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(muj, "");
        if (OLrzqt(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), muj.OLrzqt(), muj.EZpvd(), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().EZpvd(muj.copydefault()).OLrzqt(muj.copydefault()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (muj.AEQbTJ() != null) {
                c5335NtOLrzqt.AEQbTJ(muj.AEQbTJ());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(muj.copydefault());
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv);
        if (OLrzqt(imageView.getContext())) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(new C5405Ql(), new C33484mxN(imageView.getContext()))).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawableKWHzl).OLrzqt(drawableKWHzl));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(drawableKWHzl);
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
        return KWHzl(i, num, f, num2);
    }

    public static final android.graphics.drawable.Drawable KWHzl(int i, @androidx.annotation.ColorInt java.lang.Integer num, float f, @androidx.annotation.ColorInt java.lang.Integer num2) {
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

    public static final boolean OLrzqt(android.content.Context context) {
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
