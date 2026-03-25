package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34932nll extends qXZ {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34932nll(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34932nll(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterceptTouchEvent$OKMarket_market_impl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.nll.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34932nll(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34932nll(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(Companion.EZpvd(context), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C34932nll.AEQbTJ(context));
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.nlo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C34932nll.copydefault(this.EZpvd));
            }
        });
        this.KWHzl = true;
        this.AEQbTJ = true;
        setMinimumHeight(AEQbTJ());
        pUU.EZpvd("AutoSizingPreviewLayout", "previewContentHeight: " + AEQbTJ() + ", ratio: " + KWHzl());
    }

    /* JADX INFO: renamed from: o.nll$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nll.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Context EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
            configuration.uiMode = 32;
            android.content.Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            Intrinsics.copydefault(contextCreateConfigurationContext);
            return contextCreateConfigurationContext;
        }
    }

    private final int AEQbTJ() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int AEQbTJ(android.content.Context context) {
        return (C33570myu.EZpvd() - C33570myu.OLrzqt()) - C33570myu.KWHzl(context);
    }

    private final float KWHzl() {
        return ((java.lang.Number) this.OLrzqt.getValue()).floatValue();
    }

    public static final float copydefault(C34932nll c34932nll) {
        return (C33570myu.AEQbTJ() * 1.0f) / (C33570myu.EZpvd() - c34932nll.AEQbTJ());
    }

    public final void setFixedSize$OKMarket_market_impl(boolean z) {
        this.KWHzl = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.AEQbTJ);
        }
        getContext();
        return this.AEQbTJ;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        int paddingBottom;
        super.onMeasure(i, i2);
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int i3 = getContext().getApplicationInfo().targetSdkVersion;
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (i3 >= 23) {
            paddingLeft = getPaddingLeft() + getPaddingRight() + layoutParams2.leftMargin + layoutParams2.rightMargin;
            paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams2.topMargin;
            paddingBottom = layoutParams2.bottomMargin;
        } else {
            paddingLeft = getPaddingLeft() + getPaddingRight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i4 = paddingTop + paddingBottom;
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i, paddingLeft, layoutParams2.width);
        if (this.KWHzl) {
            childAt.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(AEQbTJ(), 1073741824));
            setMeasuredDimension(getMeasuredWidth(), AEQbTJ() + i4);
            return;
        }
        childAt.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(C55298xhM.dp2px$default(1500.0f, null, 1, null), Integer.MIN_VALUE));
        int measuredHeight = childAt.getMeasuredHeight();
        pUU.KWHzl("qjf", "onMeasure--child.measuredHeight----" + measuredHeight);
        if (measuredHeight < C33570myu.AEQbTJ()) {
            measuredHeight = C33570myu.AEQbTJ();
        }
        pUU.KWHzl("qjf", "onMeasure--child.expectHeight----" + measuredHeight + " ,ScreenWidth = " + C33570myu.AEQbTJ() + " ,heightPadding = " + i4);
        setMeasuredDimension(getMeasuredWidth(), measuredHeight + i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        float fAEQbTJ = (C33570myu.AEQbTJ() - (C55298xhM.dp2px$default(26.0f, null, 1, null) * 2)) / C33570myu.AEQbTJ();
        java.lang.Object parent = getParent();
        Intrinsics.copydefault(parent, "");
        pUU.KWHzl("qjf", "------parentWidth = " + ((android.view.View) parent).getWidth() + ",ScreenWidth = " + C33570myu.AEQbTJ() + ",width = " + getWidth());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("------scaleFactor = ");
        sb.append(fAEQbTJ);
        pUU.KWHzl("qjf", sb.toString());
        pUU.KWHzl("qjf", "------translationY = " + ((((float) childAt.getMeasuredHeight()) * (fAEQbTJ - ((float) 1))) / ((float) 2)));
    }

    /* JADX INFO: renamed from: o.nll$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public StateListAnimator() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.View childAt = C34932nll.this.getChildAt(0);
            pUU.KWHzl("qjf", "child.measuredHeight========" + childAt.getMeasuredHeight() + " ,maxHeight = " + C55298xhM.dp2px$default(1500.0f, null, 1, null));
            if (childAt instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
                android.view.View childAt2 = constraintLayout.getChildAt(1);
                int measuredHeight = childAt2.getMeasuredHeight();
                pUU.KWHzl("qjf", "==========footViewHeight = " + childAt2.getMeasuredHeight());
                if (constraintLayout.getMeasuredHeight() >= C55298xhM.dp2px$default(1500.0f, null, 1, null)) {
                    android.view.View viewInflate = android.view.LayoutInflater.from(C34932nll.this.getContext()).inflate(qZH.ActionBar.EZpvd, (android.view.ViewGroup) null, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    layoutParams.bottomMargin = measuredHeight;
                    layoutParams.setMarginStart(C55298xhM.dp2px$default(1.0f, null, 1, null));
                    layoutParams.setMarginEnd(C55298xhM.dp2px$default(1.0f, null, 1, null));
                    viewInflate.setLayoutParams(layoutParams);
                    C34932nll.this.addView(viewInflate);
                    if (C34932nll.this.getViewTreeObserver().isAlive()) {
                        C34932nll.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator());
    }
}
