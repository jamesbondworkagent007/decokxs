package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19604gIn {
    public static final void KWHzl(@NotNull android.widget.TextView textView, int i, @androidx.annotation.DrawableRes int i2, @androidx.annotation.DrawableRes int i3, @androidx.annotation.DrawableRes int i4, @androidx.annotation.DrawableRes int i5) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3;
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        android.graphics.drawable.Drawable drawable4 = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = ContextCompat.getDrawable(textView.getContext(), numValueOf.intValue());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(i, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(i, context2));
        }
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i3);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            drawable2 = ContextCompat.getDrawable(textView.getContext(), numValueOf2.intValue());
        } else {
            drawable2 = null;
        }
        if (drawable2 != null) {
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(i, context3);
            android.content.Context context4 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            drawable2.setBounds(0, 0, iOLrzqt2, C55298xhM.OLrzqt(i, context4));
        }
        java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i4);
        if (numValueOf3.intValue() == 0) {
            numValueOf3 = null;
        }
        if (numValueOf3 != null) {
            drawable3 = ContextCompat.getDrawable(textView.getContext(), numValueOf3.intValue());
        } else {
            drawable3 = null;
        }
        if (drawable3 != null) {
            android.content.Context context5 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            int iOLrzqt3 = C55298xhM.OLrzqt(i, context5);
            android.content.Context context6 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            drawable3.setBounds(0, 0, iOLrzqt3, C55298xhM.OLrzqt(i, context6));
        }
        java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i5);
        if (numValueOf4.intValue() == 0) {
            numValueOf4 = null;
        }
        if (numValueOf4 != null) {
            drawable4 = ContextCompat.getDrawable(textView.getContext(), numValueOf4.intValue());
        }
        if (drawable4 != null) {
            android.content.Context context7 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            int iOLrzqt4 = C55298xhM.OLrzqt(i, context7);
            android.content.Context context8 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            drawable4.setBounds(0, 0, iOLrzqt4, C55298xhM.OLrzqt(i, context8));
        }
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
