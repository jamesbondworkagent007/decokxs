package o;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kLW {
    public static final void copydefault(@NotNull android.widget.FrameLayout frameLayout, @NotNull java.util.List<java.lang.String> list, @NotNull C25385ivi c25385ivi, float f, float f2, android.view.View view) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(frameLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c25385ivi, "");
        frameLayout.removeAllViews();
        if (view != null) {
            float f3 = 1.0f + f;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C55298xhM.dp2px$default(f3, null, 1, null));
            layoutParams.gravity = 8388613;
            view.setMinimumWidth(C55298xhM.dp2px$default(f3, null, 1, null));
            view.setLayoutParams(layoutParams);
            frameLayout.addView(view);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            iDp2px$default = (view.getMeasuredWidth() - C55298xhM.dp2px$default(f, null, 1, null)) + C55298xhM.dp2px$default(f2, null, 1, null);
        } else {
            iDp2px$default = 0;
        }
        int i = 0;
        for (java.lang.Object obj : C31187lpL.OLrzqt(list)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            android.widget.ImageView imageView = new android.widget.ImageView(frameLayout.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C55298xhM.dp2px$default(f, null, 1, null), C55298xhM.dp2px$default(f, null, 1, null));
            layoutParams2.gravity = 8388613;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C55296xhK.OLrzqt(context)) {
                layoutParams2.leftMargin = iDp2px$default;
            } else {
                layoutParams2.rightMargin = iDp2px$default;
            }
            imageView.setLayoutParams(layoutParams2);
            C25386ivj.KWHzl(imageView, str, c25385ivi);
            iDp2px$default += C55298xhM.dp2px$default(f2, null, 1, null);
            frameLayout.addView(imageView, 0);
            i++;
        }
    }
}
