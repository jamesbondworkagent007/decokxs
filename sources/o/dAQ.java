package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dAQ extends NestedScrollView {
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxHeight(int i) {
        this.copydefault = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dAQ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dAQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dAQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = -1;
    }

    public final void setMaxHeightDensity(int i) {
        this.copydefault = (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.copydefault;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
