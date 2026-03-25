package o;

import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57659ymb {
    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        android.content.Context context = imageView.getContext();
        int i2 = C32113mPz.ActionBar.fJNWhG;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.5f, C33070mpX.OLrzqt(i2, context2), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i).copydefault(i)).EZpvd(imageView);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, int i, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
        android.content.Context context = imageView.getContext();
        int i2 = C32113mPz.ActionBar.fJNWhG;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtOLrzqt.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, f, C33070mpX.OLrzqt(i2, context2), false, 8, null)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadBorderImage$default(android.widget.ImageView imageView, int i, float f, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            int i4 = C32113mPz.ActionBar.fJNWhG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i2 = C33070mpX.OLrzqt(i4, context);
        }
        EZpvd(imageView, i, f, i2);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, int i, float f, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, i2, false, 8, null)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadBorderImage$default(android.widget.ImageView imageView, java.lang.String str, int i, float f, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            int i4 = C32113mPz.ActionBar.fJNWhG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i2 = C33070mpX.OLrzqt(i4, context);
        }
        KWHzl(imageView, str, i, f, i2);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, float f, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, i2, false, 8, null)).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i).copydefault(i)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadBorderImage$default(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            int i3 = C32113mPz.ActionBar.fJNWhG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C33070mpX.OLrzqt(i3, context);
        }
        EZpvd(imageView, str, drawable, f, i);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull android.graphics.drawable.Drawable drawable, float f, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, i, false, 8, null)).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawable).OLrzqt(drawable)).EZpvd(imageView);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.KWHzl(imageView).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i).copydefault(i)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadFixSizeBorderImage$default(android.widget.ImageView imageView, java.lang.String str, int i, float f, float f2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        if ((i2 & 8) != 0) {
            f2 = 36.0f;
        }
        copydefault(imageView, str, i, f, f2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mpF.dp2px$default(float, android.content.Context, int, java.lang.Object):int */
    public static final void copydefault(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, float f, float f2) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt;
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (f2 != 0.0f && layoutParams.width != (iDp2px$default = C33052mpF.dp2px$default(f2, null, 1, null))) {
            layoutParams.height = iDp2px$default;
            layoutParams.width = iDp2px$default;
        }
        if (str == null || str.length() == 0) {
            c5335NtOLrzqt = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
        } else {
            c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str);
        }
        Intrinsics.copydefault(c5335NtOLrzqt);
        android.content.Context context = imageView.getContext();
        int i2 = C32113mPz.ActionBar.fJNWhG;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C57660ymc c57660ymc = new C57660ymc(context, f, C33070mpX.OLrzqt(i2, context2), false, 8, null);
        c5335NtOLrzqt.EZpvd((NN<android.graphics.Bitmap>) c57660ymc).AEQbTJ(c57660ymc).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i)).copydefault((RY) new StateListAnimator(imageView, i)).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.ymb$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.widget.ImageView OLrzqt;

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            return false;
        }

        public StateListAnimator(android.widget.ImageView imageView, int i) {
            this.OLrzqt = imageView;
            this.AEQbTJ = i;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.OLrzqt.setImageResource(this.AEQbTJ);
            return true;
        }
    }
}
