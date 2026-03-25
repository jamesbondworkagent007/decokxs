package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22349hdg extends android.widget.LinearLayout {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22349hdg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22349hdg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.hdg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C22349hdg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22349hdg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setChildrenDrawingOrderEnabled(true);
        if (ViewCompat.isAttachedToWindow(this)) {
            setTag("sticky_layout");
        } else {
            addOnAttachStateChangeListener(new StateListAnimator(this, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMinimumHeight();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public final void setMinimumHeight() {
        int measuredHeight;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                measuredHeight = 0;
                break;
            }
            android.view.View childAt = getChildAt(childCount);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            if (((Application) layoutParams).KWHzl()) {
                Intrinsics.copydefault(childAt);
                if (childAt.getVisibility() == 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                    break;
                }
            }
        }
        setMinimumHeight(measuredHeight);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "");
        return layoutParams instanceof Application;
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Application generateDefaultLayoutParams() {
        return new Application(-1, -1);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application generateLayoutParams(@NotNull android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new Application(context, attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams; */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application generateLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "");
        return new Application(layoutParams);
    }

    /* JADX INFO: renamed from: o.hdg$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application extends LinearLayout.LayoutParams {
        public boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "");
            int[] iArr = C23274hvD.LoaderManager.UeEOUB;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(C23274hvD.LoaderManager.djSkpj, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        public Application(int i, int i2) {
            super(i, i2);
        }

        public Application(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: renamed from: o.hdg$StateListAnimator */
    public static final class StateListAnimator implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C22349hdg OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public StateListAnimator(android.view.View view, C22349hdg c22349hdg) {
            this.KWHzl = view;
            this.OLrzqt = c22349hdg;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            this.OLrzqt.setTag("sticky_layout");
        }
    }
}
