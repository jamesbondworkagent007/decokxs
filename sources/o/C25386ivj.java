package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25386ivj {
    public static /* synthetic */ void loadImageWithBorder$default(android.widget.ImageView imageView, java.lang.String str, C25385ivi c25385ivi, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c25385ivi = new C25385ivi(null, null, 0.0f, 0, 15, null);
        }
        KWHzl(imageView, str, c25385ivi);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull C25385ivi c25385ivi) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25385ivi, "");
        if (OLrzqt(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), c25385ivi.AEQbTJ(), c25385ivi.OLrzqt(), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().EZpvd(c25385ivi.EZpvd()).OLrzqt(c25385ivi.EZpvd()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c25385ivi.copydefault() != null) {
                c5335NtOLrzqt.AEQbTJ(c25385ivi.copydefault());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c25385ivi.EZpvd());
    }

    public static /* synthetic */ void loadSquareImage$default(android.widget.ImageView imageView, java.lang.String str, int i, C25385ivi c25385ivi, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            c25385ivi = new C25385ivi(null, null, 0.0f, 0, 15, null);
        }
        KWHzl(imageView, str, i, c25385ivi);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, @NotNull C25385ivi c25385ivi) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25385ivi, "");
        if (OLrzqt(imageView.getContext())) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(new C5405Ql(), new C5417Qx(i))).OLrzqt((RX<?>) new C5448Sc().EZpvd(c25385ivi.EZpvd()).OLrzqt(c25385ivi.EZpvd()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c25385ivi.copydefault() != null) {
                c5335NtOLrzqt.AEQbTJ(c25385ivi.copydefault()).EZpvd(imageView);
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c25385ivi.EZpvd());
    }

    public static /* synthetic */ void loadCircleImage$default(android.widget.ImageView imageView, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        AEQbTJ(imageView, str, z);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv);
        if (OLrzqt(imageView.getContext())) {
            AbstractC5396Qc[] abstractC5396QcArr = z ? new AbstractC5396Qc[]{new C5405Ql(), new C33484mxN(imageView.getContext())} : new C33484mxN[]{new C33484mxN(imageView.getContext())};
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(abstractC5396QcArr, abstractC5396QcArr.length))).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawableKWHzl).OLrzqt(drawableKWHzl));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(drawableKWHzl);
    }

    public static /* synthetic */ void loadBlockiesIconWithBorder$default(android.widget.ImageView imageView, wXL wxl, C25385ivi c25385ivi, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c25385ivi = new C25385ivi(null, null, 0.0f, 0, 15, null);
        }
        if ((i & 4) != 0) {
            f = 4.0f;
        }
        EZpvd(imageView, wxl, c25385ivi, f);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull wXL wxl, @NotNull C25385ivi c25385ivi, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(wxl, "");
        Intrinsics.checkNotNullParameter(c25385ivi, "");
        if (OLrzqt(imageView.getContext())) {
            C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).KWHzl(wxl).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(f, null, 1, null))).OLrzqt((RX<?>) new C5448Sc().EZpvd(c25385ivi.EZpvd()).OLrzqt(c25385ivi.EZpvd()));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c25385ivi.copydefault() != null) {
                c5335NtOLrzqt.AEQbTJ(c25385ivi.copydefault());
            }
            Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(imageView));
            return;
        }
        imageView.setImageDrawable(c25385ivi.EZpvd());
    }

    public static final android.graphics.Bitmap OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        float f = i;
        paint.setTextSize(0.8f * f);
        paint.setTextAlign(Paint.Align.CENTER);
        android.graphics.Rect rect = new android.graphics.Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float f2 = f / 2.0f;
        canvas.drawText(str, f2, f2 - rect.exactCenterY(), paint);
        return bitmapCreateBitmap;
    }

    public static final void AEQbTJ(@NotNull final android.widget.ImageView imageView, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        imageView.post(new java.lang.Runnable() { // from class: o.ivk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25386ivj.OLrzqt(imageView, str);
            }
        });
    }

    public static final void OLrzqt(android.widget.ImageView imageView, java.lang.String str) {
        int iValueOf = C56548yJl.valueOf(imageView.getWidth(), imageView.getHeight());
        if (iValueOf <= 0) {
            return;
        }
        imageView.setImageBitmap(OLrzqt(str, iValueOf));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public static /* synthetic */ void loadWalletProfileImage$default(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = 4.0f;
        }
        KWHzl(imageView, str, str2, str3, f);
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && str != null) {
            AEQbTJ(imageView, str);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && str2 != null) {
            loadSquareImage$default(imageView, str2, C55298xhM.dp2px$default(f, null, 1, null), null, 4, null);
        } else {
            loadBlockiesIconWithBorder$default(imageView, new wXL(str3, 0, 2, null), null, f, 2, null);
        }
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(imageView.getContext())) {
            Glide.KWHzl(imageView).EZpvd(str).EZpvd(imageView);
        }
    }

    public static final void KWHzl(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.AEQbTJ(imageView.getContext()).EZpvd(str);
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C31220lps(context, 0.5f, ContextCompat.getColor(imageView.getContext(), C52761wXj.Activity.ORxRYg))).copydefault(AbstractC5360Os.copydefault).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp)).EZpvd(imageView);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i, @androidx.annotation.DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(imageView.getContext())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C33129mqd.djBIcL(java.lang.Integer.valueOf(i)));
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(0));
            imageView.setBackground(gradientDrawable);
            imageView.setClipToOutline(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
            C5448Sc c5448Sc = new C5448Sc();
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C5448Sc c5448ScEZpvd = c5448Sc.EZpvd(C33070mpX.EZpvd(i2, context));
            android.content.Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c5335NtEZpvd.OLrzqt((RX<?>) c5448ScEZpvd.OLrzqt(C33070mpX.EZpvd(i2, context2))).EZpvd(imageView);
        }
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

    public static /* synthetic */ void loadRemoteDrawable$default(android.content.Context context, java.lang.String str, android.graphics.drawable.Drawable drawable, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        OLrzqt(context, str, drawable, function1, function0);
    }

    public static final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, android.graphics.drawable.Drawable drawable, @NotNull Function1<? super android.graphics.drawable.Drawable, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Glide.AEQbTJ(context).AEQbTJ().copydefault(str).AEQbTJ(drawable).OLrzqt(new TaskDescription(function1, function0));
    }

    /* JADX INFO: renamed from: o.ivj$TaskDescription */
    public static final class TaskDescription extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> OLrzqt;
        public final /* synthetic */ Function0<Unit> copydefault;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super android.graphics.drawable.Drawable, Unit> function1, Function0<Unit> function0) {
            this.OLrzqt = function1;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.OLrzqt.invoke(drawable);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) {
            Function0<Unit> function0 = this.copydefault;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static /* synthetic */ void loadImageBase64$default(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, C25385ivi c25385ivi, float f, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c25385ivi = new C25385ivi(null, null, 0.0f, 0, 15, null);
        }
        if ((i & 8) != 0) {
            f = 6.0f;
        }
        AEQbTJ(imageView, str, str2, c25385ivi, f);
    }

    public static final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C25385ivi c25385ivi, float f) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(c25385ivi, "");
        if (!OLrzqt(imageView.getContext())) {
            imageView.setImageDrawable(c25385ivi.EZpvd());
            return;
        }
        if (C59449zhJ.startsWith$default(str, "data:image", false, 2, null)) {
            try {
                java.lang.String strSubstring = str.substring(StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, ",", 0, false, 6, (java.lang.Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                byte[] bArrDecode = android.util.Base64.decode(strSubstring, 0);
                Intrinsics.copydefault(Glide.AEQbTJ(imageView.getContext()).copydefault(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length)).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(new C5405Ql(), new C5417Qx(C55298xhM.dp2px$default(f, null, 1, null))).EZpvd(c25385ivi.EZpvd()).OLrzqt(c25385ivi.EZpvd())).EZpvd(imageView));
                return;
            } catch (java.lang.Exception unused) {
                KWHzl(imageView, str2, C55298xhM.dp2px$default(f, null, 1, null), c25385ivi);
                Unit unit = Unit.INSTANCE;
                return;
            }
        }
        KWHzl(imageView, str, C55298xhM.dp2px$default(f, null, 1, null), c25385ivi);
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(imageView.getContext())) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
            C5448Sc c5448Sc = new C5448Sc();
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C5448Sc c5448ScEZpvd = c5448Sc.EZpvd(C33070mpX.EZpvd(i, context));
            android.content.Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c5335NtEZpvd.OLrzqt((RX<?>) c5448ScEZpvd.OLrzqt(C33070mpX.EZpvd(i, context2))).EZpvd(imageView);
        }
    }
}
