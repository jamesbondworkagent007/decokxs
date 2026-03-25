package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57261yfA extends android.view.View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57261yfA(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57261yfA(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57261yfA(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        super.onMeasure(i, i2);
        if (isInEditMode()) {
            return;
        }
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup instanceof android.widget.LinearLayout) {
            layoutParams = new LinearLayout.LayoutParams(-1, C33570myu.OLrzqt());
        } else if (viewGroup instanceof android.widget.RelativeLayout) {
            layoutParams = new RelativeLayout.LayoutParams(-1, C33570myu.OLrzqt());
        } else if (viewGroup instanceof ConstraintLayout) {
            layoutParams = new ConstraintLayout.LayoutParams(-1, C33570myu.OLrzqt());
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, C33570myu.OLrzqt());
        }
        setLayoutParams(layoutParams);
    }
}
