package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47820txN extends C46472tVp {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47820txN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C47820txN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterceptTouchEvent$OKPlanet_ok_feature_planet_impl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.txN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C47820txN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47820txN(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(Companion.OLrzqt(context), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.txK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C47820txN.EZpvd(context));
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.txP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(C47820txN.copydefault(this.OLrzqt));
            }
        });
        this.copydefault = true;
        this.AEQbTJ = true;
        setMinimumHeight(copydefault());
        pUU.EZpvd("AutoSizingPreviewLayout", "previewContentHeight: " + copydefault() + ", ratio: " + OLrzqt());
    }

    /* JADX INFO: renamed from: o.txN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Context OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
            configuration.uiMode = 32;
            android.content.Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            Intrinsics.copydefault(contextCreateConfigurationContext);
            return contextCreateConfigurationContext;
        }
    }

    private final int copydefault() {
        return ((java.lang.Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int EZpvd(android.content.Context context) {
        return (C33570myu.EZpvd() - C33570myu.OLrzqt()) - C33570myu.KWHzl(context);
    }

    private final float OLrzqt() {
        return ((java.lang.Number) this.KWHzl.getValue()).floatValue();
    }

    public static final float copydefault(C47820txN c47820txN) {
        return (C33570myu.AEQbTJ() * 1.0f) / (C33570myu.EZpvd() - c47820txN.copydefault());
    }

    public final void setFixedSize$OKPlanet_ok_feature_planet_impl(boolean z) {
        this.copydefault = z;
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
        if (this.copydefault) {
            childAt.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(copydefault(), 1073741824));
            setMeasuredDimension(getMeasuredWidth(), copydefault() + i4);
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

    /* JADX INFO: renamed from: o.txN$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.View childAt = C47820txN.this.getChildAt(0);
            pUU.KWHzl("qjf", "child.measuredHeight========" + childAt.getMeasuredHeight() + " ,maxHeight = " + C55298xhM.dp2px$default(1500.0f, null, 1, null));
            if (childAt instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
                android.view.View childAt2 = constraintLayout.getChildAt(1);
                int measuredHeight = childAt2.getMeasuredHeight();
                pUU.KWHzl("qjf", "==========footViewHeight = " + childAt2.getMeasuredHeight());
                if (constraintLayout.getMeasuredHeight() >= C55298xhM.dp2px$default(1500.0f, null, 1, null)) {
                    android.view.View viewInflate = android.view.LayoutInflater.from(C47820txN.this.getContext()).inflate(C47501trL.Application.gGvvIC, (android.view.ViewGroup) null, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    layoutParams.bottomMargin = measuredHeight;
                    layoutParams.setMarginStart(C55298xhM.dp2px$default(1.0f, null, 1, null));
                    layoutParams.setMarginEnd(C55298xhM.dp2px$default(1.0f, null, 1, null));
                    viewInflate.setLayoutParams(layoutParams);
                    C47820txN.this.addView(viewInflate);
                    if (C47820txN.this.getViewTreeObserver().isAlive()) {
                        C47820txN.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(new Application());
    }
}
