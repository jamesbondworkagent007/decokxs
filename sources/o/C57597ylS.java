package o;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;

/* JADX INFO: renamed from: o.ylS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57597ylS extends C33537myN {
    public C57597ylS(android.content.Context context) {
        super(context);
        if (context != null) {
            OLrzqt(context);
        }
    }

    public C57597ylS(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            OLrzqt(context);
        }
    }

    public C57597ylS(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context != null) {
            OLrzqt(context);
        }
    }

    public final void OLrzqt(android.content.Context context) {
        ViewGroup.LayoutParams layoutParams = getBackImage().getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        getBackImage().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        android.view.View viewFindViewById = findViewById(C32113mPz.FragmentManager.gwTjWJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C33133mqh.AEQbTJ((android.widget.TextView) viewFindViewById, true);
    }
}
