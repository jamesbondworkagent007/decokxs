package com.okinc.web3.security.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class TextViewsKt {
    public static final void setCompoundDrawablesRelativeWithSize(@NotNull TextView textView, int i, @DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, @DrawableRes int i5) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Intrinsics.checkNotNullParameter(textView, "");
        Integer numValueOf = Integer.valueOf(i2);
        Drawable drawable4 = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = ContextCompat.getDrawable(textView.getContext(), numValueOf.intValue());
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(i, context);
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(i, context2));
        }
        Integer numValueOf2 = Integer.valueOf(i3);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            drawable2 = ContextCompat.getDrawable(textView.getContext(), numValueOf2.intValue());
        } else {
            drawable2 = null;
        }
        if (drawable2 != null) {
            Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(i, context3);
            Context context4 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            drawable2.setBounds(0, 0, iOLrzqt2, C55298xhM.OLrzqt(i, context4));
        }
        Integer numValueOf3 = Integer.valueOf(i4);
        if (numValueOf3.intValue() == 0) {
            numValueOf3 = null;
        }
        if (numValueOf3 != null) {
            drawable3 = ContextCompat.getDrawable(textView.getContext(), numValueOf3.intValue());
        } else {
            drawable3 = null;
        }
        if (drawable3 != null) {
            Context context5 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            int iOLrzqt3 = C55298xhM.OLrzqt(i, context5);
            Context context6 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            drawable3.setBounds(0, 0, iOLrzqt3, C55298xhM.OLrzqt(i, context6));
        }
        Integer numValueOf4 = Integer.valueOf(i5);
        if (numValueOf4.intValue() == 0) {
            numValueOf4 = null;
        }
        if (numValueOf4 != null) {
            drawable4 = ContextCompat.getDrawable(textView.getContext(), numValueOf4.intValue());
        }
        if (drawable4 != null) {
            Context context7 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            int iOLrzqt4 = C55298xhM.OLrzqt(i, context7);
            Context context8 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            drawable4.setBounds(0, 0, iOLrzqt4, C55298xhM.OLrzqt(i, context8));
        }
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
