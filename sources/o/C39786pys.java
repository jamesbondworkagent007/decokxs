package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39786pys extends android.widget.LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39786pys(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AEQbTJ();
    }

    public final void AEQbTJ() {
        setOrientation(0);
        setGravity(16);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = C33052mpF.EZpvd(16.0f, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPadding(iEZpvd, 0, C33052mpF.EZpvd(16.0f, context2), 0);
    }

    public final void setData(@NotNull java.util.List<java.lang.String> list, int i, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        int i2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        removeAllViews();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C33052mpF.EZpvd(20.0f, context));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        for (final java.lang.String str : list) {
            final android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText(str);
            textView.setTextAppearance(C52761wXj.LoaderManager.QSBOWP);
            textView.setGravity(17);
            textView.setBackgroundResource(C35964oKf.Activity.UeEOUB);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdwsGQ));
            textView.setSelected(false);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.pyu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39786pys.setData$lambda$2$lambda$1$lambda$0(this.EZpvd, textView, function1, str, view);
                }
            });
            addView(textView, layoutParams);
            addView(new android.view.View(getContext()), layoutParams2);
        }
        if (getChildCount() <= 0 || (i2 = i * 2) >= getChildCount()) {
            return;
        }
        getChildAt(i2).setSelected(true);
        removeView(getChildAt(getChildCount() - 1));
    }

    public static final void setData$lambda$2$lambda$1$lambda$0(C39786pys c39786pys, android.widget.TextView textView, Function1 function1, java.lang.String str, android.view.View view) {
        int childCount = c39786pys.getChildCount();
        for (int i = 0; i < childCount; i++) {
            c39786pys.getChildAt(i).setSelected(false);
        }
        textView.setSelected(true);
        function1.invoke(str);
    }
}
