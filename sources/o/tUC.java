package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tUC extends ConstraintLayout {
    public int AEQbTJ;
    public boolean OLrzqt;
    public final Flow copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.tUC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Flow flow = new Flow(context);
        this.copydefault = flow;
        this.AEQbTJ = 1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.KWHzl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AEQbTJ = typedArrayObtainStyledAttributes.getInt(C47501trL.FragmentManager.AEQbTJ, 1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.OLrzqt, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C47501trL.FragmentManager.EZpvd, 0);
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.copydefault, false);
        typedArrayObtainStyledAttributes.recycle();
        EZpvd();
        flow.setOrientation(0);
        flow.setWrapMode(1);
        flow.setVerticalStyle(2);
        flow.setHorizontalStyle(2);
        flow.setVerticalBias(0.0f);
        flow.setHorizontalAlign(0);
        flow.setVerticalAlign(0);
        flow.setHorizontalGap(dimensionPixelSize);
        flow.setVerticalGap(dimensionPixelSize2);
        flow.setMaxElementsWrap(this.AEQbTJ);
        int[] iArrDjBIcL = new int[0];
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getId() == -1) {
                childAt.setId(android.view.View.generateViewId());
            }
            iArrDjBIcL = yDT.djBIcL(iArrDjBIcL, childAt.getId());
        }
        if (!(iArrDjBIcL.length == 0)) {
            this.copydefault.setReferencedIds(iArrDjBIcL);
            this.copydefault.requestLayout();
        }
        OLrzqt();
    }

    public static /* synthetic */ void removeAndAddViews$default(tUC tuc, java.util.List list, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        tuc.KWHzl(list, i, i2, i3);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000d */
    public final void KWHzl(@NotNull java.util.List<? extends android.view.View> list, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = i;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(childCount);
            if (childAt == null || childAt.getId() != this.copydefault.getId()) {
                removeView(childAt);
            }
        }
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(java.lang.Integer.valueOf(android.view.View.generateViewId()));
        }
        this.copydefault.setMaxElementsWrap(i);
        this.copydefault.setHorizontalGap(i2);
        this.copydefault.setVerticalGap(i3);
        this.copydefault.setReferencedIds(CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        for (java.lang.Object obj : list) {
            if (i4 < 0) {
                yDY.AYXKKw();
            }
            android.view.View view = (android.view.View) obj;
            view.setId(((java.lang.Number) arrayList.get(i4)).intValue());
            addView(view, AEQbTJ());
            i4++;
        }
        OLrzqt();
    }

    private final ConstraintLayout.LayoutParams AEQbTJ() {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.constrainedHeight = true;
        return layoutParams;
    }

    public final void EZpvd() {
        android.view.View view = this.copydefault;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.startToStart = 0;
        Unit unit = Unit.INSTANCE;
        addView(view, layoutParams);
    }

    public final void OLrzqt() {
        if (this.OLrzqt) {
            int iCeil = (int) java.lang.Math.ceil(this.copydefault.getReferencedIds().length / this.AEQbTJ);
            int i = this.AEQbTJ;
            int length = this.copydefault.getReferencedIds().length;
            for (int i2 = 0; i2 < (iCeil * i) - length; i2++) {
                android.widget.Space space = new android.widget.Space(getContext());
                space.setId(android.view.View.generateViewId());
                addView(space, AEQbTJ());
                this.copydefault.addView(space);
            }
        }
    }
}
