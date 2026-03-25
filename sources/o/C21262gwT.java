package o;

import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21262gwT extends android.widget.LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21262gwT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21262gwT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21262gwT(@NotNull android.content.Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final android.view.View EZpvd() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (getChildAt(i).getVisibility() == 0) {
                return childAt;
            }
        }
        return null;
    }

    private final int KWHzl() {
        return C59467zhb.uzCIH(C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), new Function1() { // from class: o.gwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C21262gwT.AEQbTJ((android.view.View) obj));
            }
        }));
    }

    public static final boolean AEQbTJ(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        android.view.View viewEZpvd = EZpvd();
        if (viewEZpvd == null) {
            return;
        }
        int iKWHzl = KWHzl();
        if (iKWHzl <= 4) {
            measuredWidth = (getMeasuredWidth() - (viewEZpvd.getMeasuredWidth() * 4)) / 3;
        } else {
            measuredWidth = (getMeasuredWidth() - (viewEZpvd.getMeasuredWidth() * iKWHzl)) / (iKWHzl - 1);
        }
        if (C55296xhK.AEQbTJ(this)) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = getChildAt(i6);
                if (childAt.getVisibility() == 0) {
                    int measuredWidth2 = getMeasuredWidth() - ((childAt.getMeasuredWidth() + measuredWidth) * i5);
                    i5++;
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    Intrinsics.copydefault(childAt);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    childAt.layout(measuredWidth2 - measuredWidth3, marginLayoutParams != null ? marginLayoutParams.topMargin : 0, measuredWidth2, childAt.getMeasuredHeight());
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount2; i8++) {
            android.view.View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() == 0) {
                int measuredWidth4 = (childAt2.getMeasuredWidth() + measuredWidth) * i7;
                i7++;
                Intrinsics.copydefault(childAt2);
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                childAt2.layout(measuredWidth4, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0, childAt2.getMeasuredWidth() + measuredWidth4, childAt2.getMeasuredHeight());
            }
        }
    }
}
