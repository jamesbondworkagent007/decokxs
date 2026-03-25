package o;

import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28884kjG {
    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.DrawableRes int i4, int i5, @androidx.annotation.ColorInt java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (EZpvd(imageView.getContext())) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int width = layoutParams != null ? layoutParams.width : imageView.getWidth();
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int height = layoutParams2 != null ? layoutParams2.height : imageView.getHeight();
            C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(new C5405Ql(), new C5401Qh()).AEQbTJ(i4).copydefault(i4);
            Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
            C5448Sc c5448ScCopydefault2 = c5448ScCopydefault;
            if (width > 0 && height > 0) {
                c5448ScCopydefault2 = c5448ScCopydefault2.copydefault(width, height);
            }
            Intrinsics.copydefault(Glide.KWHzl(imageView).EZpvd(str).OLrzqt((RX<?>) c5448ScCopydefault2).OLrzqt(new ActionBar(num, i, i2, i3, i5, imageView, i4)));
            return;
        }
        imageView.setImageResource(i4);
    }

    /* JADX INFO: renamed from: o.kjG$ActionBar */
    public static final class ActionBar extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ java.lang.Integer AEQbTJ;
        public final /* synthetic */ int AYXKKw;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;
        public final /* synthetic */ android.widget.ImageView djBIcL;
        public final /* synthetic */ int valueOf;

        public ActionBar(java.lang.Integer num, int i, int i2, int i3, int i4, android.widget.ImageView imageView, int i5) {
            this.AEQbTJ = num;
            this.KWHzl = i;
            this.copydefault = i2;
            this.OLrzqt = i3;
            this.valueOf = i4;
            this.djBIcL = imageView;
            this.AYXKKw = i5;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            java.lang.Integer num = this.AEQbTJ;
            C28885kjH c28885kjH = num != null ? new C28885kjH(num.intValue()) : null;
            C28887kjJ c28887kjJ = new C28887kjJ(this.KWHzl, this.copydefault, this.OLrzqt);
            LayerDrawable layerDrawable = new LayerDrawable(c28885kjH != null ? new android.graphics.drawable.Drawable[]{c28885kjH, drawable, c28887kjJ} : new android.graphics.drawable.Drawable[]{drawable, c28887kjJ});
            int i = this.KWHzl + this.valueOf;
            layerDrawable.setLayerInset(c28885kjH != null ? 1 : 0, i, i, i, i);
            this.djBIcL.setImageDrawable(layerDrawable);
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            this.djBIcL.setImageResource(this.AYXKKw);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            this.djBIcL.setImageResource(this.AYXKKw);
        }
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, float f, float f2, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4) {
        Intrinsics.checkNotNullParameter(imageView, "");
        imageView.setImageDrawable(new C28886kjI(C55298xhM.dp2px$default(f2, null, 1, null), C55298xhM.dp2px$default(f, null, 1, null), i, i2, i3, i4));
    }

    public static final int KWHzl(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, float f) {
        float fKWHzl = C56548yJl.KWHzl(f, 0.0f, 1.0f);
        float f2 = 1.0f - fKWHzl;
        return ((int) (((i & 255) * f2) + ((i2 & 255) * fKWHzl))) | (((int) ((((i >> 24) & 255) * f2) + (((i2 >> 24) & 255) * fKWHzl))) << 24) | (((int) ((((i >> 16) & 255) * f2) + (((i2 >> 16) & 255) * fKWHzl))) << 16) | (((int) ((((i >> 8) & 255) * f2) + (((i2 >> 8) & 255) * fKWHzl))) << 8);
    }

    public static final boolean EZpvd(android.content.Context context) {
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

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, float f, float f2, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, float f3, boolean z, long j, long j2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2, float f4) {
        C28881kjD c28881kjD;
        Intrinsics.checkNotNullParameter(imageView, "");
        if (num == null || num2 == null) {
            c28881kjD = null;
        } else {
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            float fEZpvd = C55298xhM.EZpvd(f, context);
            Intrinsics.copydefault(num);
            int iIntValue = num.intValue();
            Intrinsics.copydefault(num2);
            c28881kjD = new C28881kjD(fEZpvd, iIntValue, num2.intValue(), f4);
        }
        C28881kjD c28881kjD2 = c28881kjD;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fEZpvd2 = C55298xhM.EZpvd(f2, context2);
        android.content.Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        C28882kjE c28882kjE = new C28882kjE(fEZpvd2, C55298xhM.EZpvd(f, context3), i, i2, f3);
        imageView.setImageDrawable(c28881kjD2 != null ? new LayerDrawable(new android.graphics.drawable.Drawable[]{c28881kjD2, c28882kjE}) : c28882kjE);
        if (z && f3 > 0.0f) {
            c28882kjE.AEQbTJ(j, j2);
        } else {
            c28882kjE.KWHzl(f3);
        }
    }
}
