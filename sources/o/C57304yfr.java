package o;

import android.graphics.PorterDuff;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57304yfr {
    public static final C57304yfr copydefault = new C57304yfr();

    private C57304yfr() {
    }

    public final java.lang.CharSequence EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (i == 0) {
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW)), 0, spannableStringBuilder.length(), 33);
        } else if (i == 1) {
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm)), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), str.length(), spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm)), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), str.length(), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final android.graphics.drawable.Drawable OLrzqt(android.content.Context context, int i, @androidx.annotation.ColorRes int i2) {
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

    public final android.graphics.drawable.Drawable EZpvd(android.content.Context context, int i, @androidx.annotation.AttrRes int i2) {
        android.graphics.drawable.Drawable drawable;
        if (context == null || (drawable = ContextCompat.getDrawable(context, i)) == null) {
            return null;
        }
        android.graphics.drawable.Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "");
        int iKWHzl = C55366xib.KWHzl(i2, context);
        DrawableCompat.setTintMode(drawableMutate, PorterDuff.Mode.SRC_IN);
        DrawableCompat.setTint(drawableMutate, iKWHzl);
        return drawableMutate;
    }

    public final void copydefault(@NotNull final android.view.View view, final int i, final int i2, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object parent = view.getParent();
        Intrinsics.copydefault(parent, "");
        final android.view.View view2 = (android.view.View) parent;
        view2.post(new java.lang.Runnable() { // from class: o.yfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57304yfr.copydefault(view, i, i2, i3, i4, view2);
            }
        });
    }

    public static final void copydefault(android.view.View view, int i, int i2, int i3, int i4, android.view.View view2) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }

    public final boolean AEQbTJ(@NotNull android.view.View view, @NotNull android.view.View view2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.measure(0, 0);
        view.getLocationOnScreen(iArr);
        view2.measure(0, 0);
        view2.getLocationOnScreen(iArr2);
        return iArr[0] < iArr2[0] + view2.getMeasuredWidth() && iArr[0] + view.getMeasuredWidth() > iArr2[0] && iArr[1] < iArr2[1] + view2.getMeasuredHeight() && iArr[1] + view.getMeasuredHeight() > iArr2[1];
    }
}
