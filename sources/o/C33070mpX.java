package o;

import android.graphics.Color;
import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33070mpX {
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mpV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33070mpX.OLrzqt();
        }
    });

    public static final android.app.Application EZpvd() {
        return (android.app.Application) copydefault.getValue();
    }

    public static final android.app.Application OLrzqt() {
        return C43246rlf.OLrzqt.valueOf();
    }

    public static final java.lang.String AYXKKw(@androidx.annotation.StringRes int i) {
        java.lang.String string = EZpvd().getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String OLrzqt(@androidx.annotation.StringRes int i, @NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        java.lang.String string = EZpvd().getResources().getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String EZpvd(@androidx.annotation.PluralsRes int i, int i2) {
        java.lang.String quantityString = copydefault((android.content.Context) null).getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "");
        return quantityString;
    }

    public static final android.graphics.drawable.Drawable KWHzl(@androidx.annotation.DrawableRes int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = EZpvd();
        }
        return ContextCompat.getDrawable(contextAEQbTJ, i);
    }

    public static final android.graphics.drawable.Drawable EZpvd(@androidx.annotation.DrawableRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getDrawable(context, i);
    }

    public static final int copydefault(@androidx.annotation.ColorRes int i) {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = EZpvd();
        }
        return ContextCompat.getColor(contextAEQbTJ, i);
    }

    public static final int OLrzqt(@androidx.annotation.ColorRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, i);
    }

    public static final android.content.res.ColorStateList AEQbTJ(@androidx.annotation.ColorRes int i) {
        android.content.res.ColorStateList colorStateList = copydefault((android.content.Context) null).getColorStateList(i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "");
        return colorStateList;
    }

    public static final android.content.res.ColorStateList copydefault(@androidx.annotation.ColorRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColorStateList(context, i);
    }

    public static final float EZpvd(@androidx.annotation.DimenRes int i) {
        return copydefault((android.content.Context) null).getDimension(i);
    }

    public static final int OLrzqt(@androidx.annotation.DimenRes int i) {
        return copydefault((android.content.Context) null).getDimensionPixelSize(i);
    }

    public static final int AhwBna(@androidx.annotation.IntegerRes int i) {
        return copydefault((android.content.Context) null).getInteger(i);
    }

    public static final android.content.res.Resources copydefault(android.content.Context context) {
        if (context == null && (context = C54819xWm.KWHzl().AEQbTJ()) == null) {
            context = EZpvd();
        }
        android.content.res.Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return resources;
    }

    public static final int EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            return i;
        }
    }
}
