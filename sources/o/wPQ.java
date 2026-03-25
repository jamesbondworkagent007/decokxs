package o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPQ {
    public static final void AEQbTJ(@NotNull android.view.View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setPaddingRelative(i, 0, i2, 0);
    }

    public static final void OLrzqt(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setPaddingRelative(i, 0, i, 0);
    }

    public static final void EZpvd(@NotNull android.view.View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i2);
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void KWHzl(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OLrzqt(view, C56071xvr.gEmmrt.fIwbmz());
    }

    public static final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl(view, C56071xvr.gEmmrt.DbNXlk());
    }

    public static final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        view.setPaddingRelative(c56071xvr.fIwbmz(), c56071xvr.isConnected(), c56071xvr.fIwbmz(), c56071xvr.isConnected());
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, @androidx.annotation.ColorRes int i, @androidx.annotation.ColorRes int i2) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.text.TextPaint paint = textView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        paint.setShader(new LinearGradient(0.0f, 0.0f, paint.measureText(textView.getText().toString()), textView.getTextSize(), new int[]{ContextCompat.getColor(textView.getContext(), i), ContextCompat.getColor(textView.getContext(), i2)}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public static /* synthetic */ void setDrawableWithSize$default(android.widget.TextView textView, int i, float f, float f2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        copydefault(textView, i, f, f2, i2);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @androidx.annotation.DrawableRes int i, float f, float f2, int i2) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i);
        android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setBounds(0, 0, C55298xhM.dp2px$default(f, null, 1, null), C55298xhM.dp2px$default(f2, null, 1, null));
        }
        if (i2 == 0) {
            textView.setCompoundDrawablesRelative(drawableMutate, null, null, null);
            return;
        }
        if (i2 == 1) {
            textView.setCompoundDrawablesRelative(null, drawableMutate, null, null);
        } else if (i2 == 2) {
            textView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        } else {
            if (i2 != 3) {
                return;
            }
            textView.setCompoundDrawablesRelative(null, null, null, drawableMutate);
        }
    }

    public static /* synthetic */ void setTextWithDrawable$default(android.widget.TextView textView, java.lang.String str, int i, float f, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        copydefault(textView, str, i, f, i2);
    }

    public static final void copydefault(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, float f, int i2) {
        android.text.SpannableString spannableString;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(i);
        if (drawableKWHzl == null) {
            return;
        }
        int iDp2px$default = C55298xhM.dp2px$default(f, null, 1, null);
        drawableKWHzl.setBounds(0, 0, iDp2px$default, iDp2px$default);
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawableKWHzl, 2);
        if (i2 == 0) {
            spannableString = new android.text.SpannableString("  " + str);
            spannableString.setSpan(imageSpan, 0, 1, 33);
        } else {
            spannableString = new android.text.SpannableString(str + "  ");
            spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
        }
        textView.setText(spannableString);
    }
}
