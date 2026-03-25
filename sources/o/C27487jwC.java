package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27487jwC {
    public static final C27487jwC KWHzl = new C27487jwC();

    /* JADX INFO: renamed from: o.jwC$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HealthRateLevel.values().length];
            try {
                iArr[HealthRateLevel.Green.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HealthRateLevel.Red.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthRateLevel.Yellow.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private C27487jwC() {
    }

    public final void EZpvd(@NotNull C27212jqt c27212jqt, @NotNull java.util.List<java.lang.String> list, java.lang.Float f, float f2, @androidx.annotation.ColorInt java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(c27212jqt, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        c27212jqt.removeAllViews();
        for (java.lang.String str : list) {
            iHX ihxAEQbTJ = iHX.AEQbTJ(android.view.LayoutInflater.from(c27212jqt.getContext()), c27212jqt, false);
            Intrinsics.checkNotNullExpressionValue(ihxAEQbTJ, "");
            if (f != null) {
                android.widget.ImageView root = ihxAEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C55298xhM.dpInt$default(f.floatValue(), (android.content.Context) null, 1, (java.lang.Object) null);
                    layoutParams.height = C55298xhM.dpInt$default(f.floatValue(), (android.content.Context) null, 1, (java.lang.Object) null);
                    root.setLayoutParams(layoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.widget.ImageView imageView = ihxAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c27569jxf.OLrzqt(imageView, str, f2, num, drawable);
            c27212jqt.addView(ihxAEQbTJ.getRoot());
        }
        c27212jqt.requestLayout();
    }

    public static /* synthetic */ void loadFromUrl$default(C27487jwC c27487jwC, android.widget.ImageView imageView, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        c27487jwC.EZpvd(imageView, str, num);
    }

    public final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
        if (num != null) {
            num.intValue();
            C5335Nt<android.graphics.drawable.Drawable> c5335Nt = (C5335Nt) c5335NtEZpvd.AEQbTJ(ContextCompat.getDrawable(imageView.getContext(), num.intValue()));
            if (c5335Nt != null) {
                c5335NtEZpvd = c5335Nt;
            }
        }
        c5335NtEZpvd.EZpvd(imageView);
    }

    public static /* synthetic */ void loadCircularIcon$default(C27487jwC c27487jwC, android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = C27569jxf.OLrzqt.EZpvd();
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = C52761wXj.Activity.zuBGHE;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = 0.0f;
        }
        c27487jwC.copydefault(imageView, str, i4, i5, f);
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ;
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(imageView.getContext(), i);
        if (str == null || str.length() == 0) {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).AEQbTJ(drawable);
        } else {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).EZpvd(str);
        }
        Intrinsics.copydefault(c5335NtAEQbTJ);
        if (f > 0.0f) {
            c5335NtAEQbTJ = (C5335Nt) c5335NtAEQbTJ.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, C33070mpX.copydefault(i2), false));
        }
        c5335NtAEQbTJ.OLrzqt((RX<?>) new C5448Sc().EZpvd(drawable).OLrzqt(drawable)).EZpvd(imageView);
    }

    public final int OLrzqt(@NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        int i = TaskDescription.KWHzl[healthRateLevel.ordinal()];
        if (i == 1) {
            return C52761wXj.TaskDescription.hQkvHM;
        }
        if (i != 2) {
        }
        return C52761wXj.TaskDescription.ZqidTP;
    }
}
