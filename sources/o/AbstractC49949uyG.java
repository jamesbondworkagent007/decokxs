package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.uyG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49949uyG extends AbstractC49947uyE<C55008xbo> {
    public static /* synthetic */ void setUpStrategyInput$default(AbstractC49949uyG abstractC49949uyG, C55008xbo c55008xbo, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUpStrategyInput");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        abstractC49949uyG.EZpvd(c55008xbo, i, i2);
    }

    public final void EZpvd(C55008xbo c55008xbo, @androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2) {
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            EZpvd(textViewFJNWhG, i, i2);
        }
        EZpvd(c55008xbo);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            EZpvd(c55001xbhAkhnZx);
        }
    }

    public final void EZpvd(C55001xbh c55001xbh) {
        c55001xbh.setGravity(TextAlign.RIGHT);
        ViewGroup.LayoutParams layoutParams = c55001xbh.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(c55001xbh.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT));
            android.content.Context context = c55001xbh.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(4, context));
            c55001xbh.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void EZpvd(C55008xbo c55008xbo) {
        android.widget.TextView textView = new android.widget.TextView(c55008xbo.getContext());
        textView.setText("%");
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.copydefault((android.view.View) textView, (java.lang.Integer) 0);
        }
    }

    public final void EZpvd(android.widget.TextView textView, int i, int i2) {
        android.graphics.drawable.Drawable drawable;
        textView.setVisibility(0);
        textView.setGravity(16);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QkdxfA));
        textView.setText(i);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        if (i2 == 0 || (drawable = ContextCompat.getDrawable(textView.getContext(), i2)) == null) {
            drawable = null;
        } else {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(20, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(20, context2));
        }
        TextViewCompat.setCompoundDrawablesRelative(textView, drawable, null, null, null);
        TextViewCompat.setCompoundDrawableTintList(textView, ContextCompat.getColorStateList(textView.getContext(), C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
    }
}
