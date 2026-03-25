package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.github.mmin18.widget.RealtimeBlurView;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35922oIr extends android.widget.FrameLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final android.animation.ValueAnimator AEQbTJ;
    public android.view.View AYXKKw;
    public float AhwBna;
    public final C34039nPd EZpvd;
    public android.view.View KWHzl;
    public android.view.View OLrzqt;
    public final android.view.LayoutInflater djBIcL;
    public Function0<Unit> gEmmrt;
    public float valueOf;

    /* JADX INFO: renamed from: o.oIr$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InHouseIMContentType.values().length];
            try {
                iArr[InHouseIMContentType.GroupInvitation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageBySender.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageByAdmin.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageBySenderServer.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[InHouseIMContentType.RecallMessageByAdminServer.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[InHouseIMContentType.SystemMessage.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[InHouseIMContentType.Share.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[InHouseIMContentType.Unknown.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35922oIr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35922oIr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDismissListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.oIr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35922oIr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35922oIr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        this.djBIcL = layoutInflaterFrom;
        C34039nPd c34039nPdAEQbTJ = C34039nPd.AEQbTJ(layoutInflaterFrom, this, true);
        Intrinsics.checkNotNullExpressionValue(c34039nPdAEQbTJ, "");
        this.EZpvd = c34039nPdAEQbTJ;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 80.0f);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C35922oIr.OLrzqt(this.KWHzl, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Activity());
        this.AEQbTJ = valueAnimatorOfFloat;
        c34039nPdAEQbTJ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.oIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35922oIr.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final void OLrzqt(C35922oIr c35922oIr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        RealtimeBlurView realtimeBlurView = c35922oIr.EZpvd.KWHzl;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        realtimeBlurView.setBlurRadius(((java.lang.Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: o.oIr$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator, boolean z) {
            Function0 function0;
            Intrinsics.checkNotNullParameter(animator, "");
            super.onAnimationEnd(animator, z);
            if (!z || (function0 = C35922oIr.this.gEmmrt) == null) {
                return;
            }
            function0.invoke();
        }
    }

    public static final void KWHzl(C35922oIr c35922oIr, android.view.View view) {
        c35922oIr.OLrzqt();
    }

    public final void KWHzl(@androidx.annotation.ColorInt int i, @NotNull android.view.View view, @NotNull InterfaceC35924oIt interfaceC35924oIt, ActionBar actionBar, @NotNull OKMessage oKMessage, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC35924oIt, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        KWHzl();
        this.EZpvd.KWHzl.setOverlayColor(i);
        interfaceC35924oIt.copydefault(this.gEmmrt);
        android.view.View viewCopydefault = interfaceC35924oIt.copydefault(view);
        android.view.View viewEZpvd = EZpvd(interfaceC35924oIt, viewCopydefault, oKMessage);
        android.view.View viewAEQbTJ = (z && copydefault(oKMessage)) ? interfaceC35924oIt.AEQbTJ() : null;
        this.AYXKKw = viewCopydefault;
        this.OLrzqt = viewEZpvd;
        this.KWHzl = viewAEQbTJ;
        this.EZpvd.EZpvd.setClipChildren(false);
        this.EZpvd.EZpvd.setClipToPadding(false);
        this.EZpvd.copydefault.setClipChildren(false);
        this.EZpvd.copydefault.setClipToPadding(false);
        viewCopydefault.measure(-2, -2);
        if (viewEZpvd != null) {
            viewEZpvd.measure(-2, -2);
        }
        if (viewAEQbTJ != null) {
            viewAEQbTJ.measure(-2, -2);
        }
        for (android.view.View view2 : yDY.valueOf(viewAEQbTJ, viewCopydefault, viewEZpvd)) {
            this.EZpvd.copydefault.addView(view2);
            if (actionBar != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    java.lang.Integer numOLrzqt = actionBar.OLrzqt();
                    layoutParams2.topMargin = numOLrzqt != null ? numOLrzqt.intValue() : 0;
                    java.lang.Integer numEZpvd = actionBar.EZpvd();
                    layoutParams2.leftMargin = numEZpvd != null ? numEZpvd.intValue() : 0;
                    java.lang.Integer numKWHzl = actionBar.KWHzl();
                    layoutParams2.rightMargin = numKWHzl != null ? numKWHzl.intValue() : 0;
                    java.lang.Integer numCopydefault = actionBar.copydefault();
                    layoutParams2.gravity = numCopydefault != null ? numCopydefault.intValue() : 8388611;
                    view2.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams4.topMargin = C55298xhM.OLrzqt(8, context);
                    view2.setLayoutParams(layoutParams4);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            }
        }
        if (viewAEQbTJ != null) {
            viewAEQbTJ.setScaleX(0.98f);
            viewAEQbTJ.setScaleY(0.98f);
        }
        if (viewEZpvd != null) {
            viewEZpvd.setScaleX(0.98f);
            viewEZpvd.setScaleY(0.98f);
        }
        android.view.View view3 = viewAEQbTJ;
        OLrzqt(this.EZpvd, view, view3, viewCopydefault, viewEZpvd, oKMessage.getMessageDirection() == OKMessage.MessageDirection.RECEIVE);
        this.EZpvd.copydefault.getViewTreeObserver().addOnGlobalLayoutListener(new Dialog(viewCopydefault, view3, viewEZpvd, view));
    }

    /* JADX INFO: renamed from: o.oIr$Dialog */
    public static final class Dialog implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public Dialog(android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4) {
            this.AEQbTJ = view;
            this.KWHzl = view2;
            this.copydefault = view3;
            this.EZpvd = view4;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C35922oIr.this.EZpvd.copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C35922oIr.this.AEQbTJ.start();
            this.EZpvd.getLocationInWindow(new int[2]);
            C35922oIr.this.EZpvd.copydefault.getLocationInWindow(new int[2]);
            int left = this.AEQbTJ.getLeft();
            int top = this.AEQbTJ.getTop();
            C35922oIr.this.valueOf = r1[0] - (r0[0] + left);
            C35922oIr.this.AhwBna = r1[1] - (r0[1] + top);
            this.AEQbTJ.setHasTransientState(true);
            C35922oIr.this.EZpvd.EZpvd.setClipChildren(false);
            C35922oIr.this.EZpvd.EZpvd.setClipToPadding(false);
            C35922oIr.this.EZpvd.copydefault.setClipChildren(false);
            C35922oIr.this.EZpvd.copydefault.setClipToPadding(false);
            this.AEQbTJ.setTranslationX(C35922oIr.this.valueOf);
            this.AEQbTJ.setTranslationY(C35922oIr.this.AhwBna);
            this.AEQbTJ.animate().translationX(0.0f).translationY(0.0f).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).start();
            java.util.Iterator it = yDY.valueOf(this.KWHzl, this.copydefault).iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).animate().scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).start();
            }
        }
    }

    public final boolean copydefault(OKMessage oKMessage) {
        OKMessageContent content;
        InHouseIMContentType contentType;
        if ((oKMessage.getContent() instanceof OKContractAddressMessage) || !sEI.KWHzl.EZpvd() || (content = oKMessage.getContent()) == null || (contentType = content.getContentType()) == null) {
            return false;
        }
        return KWHzl(contentType);
    }

    public final boolean KWHzl(InHouseIMContentType inHouseIMContentType) {
        switch (TaskDescription.EZpvd[inHouseIMContentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            default:
                return true;
        }
    }

    public final void OLrzqt(C34039nPd c34039nPd, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, boolean z) {
        int iCopydefault;
        int iOLrzqt;
        int iOLrzqt2;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iAEQbTJ = C55302xhQ.AEQbTJ(context);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        StateListAnimator stateListAnimatorCopydefault = copydefault();
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(c34039nPd.getRoot());
        Insets insets = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars()) : null;
        int i = insets != null ? insets.top : 0;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(16, context2);
        if (stateListAnimatorCopydefault.EZpvd()) {
            iAEQbTJ -= stateListAnimatorCopydefault.copydefault();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            iCopydefault = C55298xhM.OLrzqt(24, context3);
        } else {
            iCopydefault = stateListAnimatorCopydefault.copydefault();
        }
        int i2 = iAEQbTJ - iCopydefault;
        if (view2 == null) {
            iOLrzqt = 0;
        } else {
            int measuredHeight = view2.getMeasuredHeight();
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            iOLrzqt = measuredHeight + C55298xhM.OLrzqt(8, context4);
        }
        int measuredHeight2 = view3.getMeasuredHeight();
        android.content.Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iOLrzqt4 = C55298xhM.OLrzqt(8, context5);
        if (view4 == null) {
            iOLrzqt2 = 0;
        } else {
            view4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight3 = view4.getMeasuredHeight();
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            iOLrzqt2 = measuredHeight3 + C55298xhM.OLrzqt(8, context6);
        }
        android.content.Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        int iOLrzqt5 = C55298xhM.OLrzqt(32, context7);
        android.widget.LinearLayout linearLayout = c34039nPd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        int i3 = 0;
        for (android.view.View view5 : ViewGroupKt.getChildren(linearLayout)) {
            int measuredHeight4 = view5.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i3 += measuredHeight4 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        int i4 = iArr[1];
        android.widget.LinearLayout linearLayout2 = c34039nPd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i5 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        android.content.Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        int iOLrzqt6 = ((i4 - i5) - iOLrzqt) - C55298xhM.OLrzqt(4, context8);
        android.widget.LinearLayout linearLayout3 = c34039nPd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        ViewGroup.LayoutParams layoutParams3 = linearLayout3.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i6 = marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0;
        boolean z2 = (((measuredHeight2 + iOLrzqt4) + iOLrzqt) + iOLrzqt2) + iOLrzqt5 > i2;
        int i7 = z ? 8388611 : 8388613;
        if (z2 && view4 != null) {
            EZpvd(c34039nPd, view2, view3, view4, i2, i7);
        } else {
            copydefault(c34039nPd, iOLrzqt6, i6 + i3 + iOLrzqt6, i + iOLrzqt3, i2);
        }
    }

    public final void EZpvd(C34039nPd c34039nPd, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        c34039nPd.copydefault.removeAllViews();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(80, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(52, context2);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(8, context3);
        view3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view3.getMeasuredHeight();
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iMax = java.lang.Math.max(C55298xhM.OLrzqt(100, context4), i - ((measuredHeight + iOLrzqt3) + iOLrzqt2));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, iMax, i2));
        frameLayout.addView(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.gravity = i2 | 80;
            view2.setLayoutParams(layoutParams2);
            if (view != null) {
                frameLayout.addView(view);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = -2;
                    layoutParams4.height = -2;
                    layoutParams4.topMargin = iOLrzqt;
                    layoutParams4.gravity = i2 | 48;
                    view.setLayoutParams(layoutParams4);
                    Intrinsics.checkNotNullExpressionValue(getContext(), "");
                    view.setElevation(C55298xhM.OLrzqt(16, r6));
                    Intrinsics.checkNotNullExpressionValue(getContext(), "");
                    view.setTranslationZ(C55298xhM.OLrzqt(16, r6));
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            if (view2.getMeasuredHeight() > iMax) {
                valueOf(view2);
            }
            c34039nPd.copydefault.addView(frameLayout);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            if (layoutParams5 != null) {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = 0;
                frameLayout.setLayoutParams(layoutParams6);
                c34039nPd.copydefault.addView(view3);
                view3.setClipToOutline(false);
                c34039nPd.copydefault.setClipChildren(false);
                c34039nPd.copydefault.setClipToPadding(false);
                c34039nPd.copydefault.setGravity(i2);
                ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
                if (layoutParams7 != null) {
                    LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                    layoutParams8.topMargin = iOLrzqt3;
                    layoutParams8.height = measuredHeight;
                    layoutParams8.width = -2;
                    view3.setLayoutParams(layoutParams8);
                    int i3 = iMax + iOLrzqt3 + measuredHeight + iOLrzqt2;
                    if (i3 > i) {
                        android.widget.LinearLayout linearLayout = c34039nPd.copydefault;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                        ViewGroup.LayoutParams layoutParams9 = linearLayout.getLayoutParams();
                        if (layoutParams9 != null) {
                            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams9;
                            layoutParams10.height = -2;
                            android.widget.LinearLayout linearLayout2 = c34039nPd.copydefault;
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                            ViewGroup.LayoutParams layoutParams11 = linearLayout2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                            layoutParams10.topMargin = java.lang.Math.max(0, (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) - (i3 - i));
                            linearLayout.setLayoutParams(layoutParams10);
                            return;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    android.widget.LinearLayout linearLayout3 = c34039nPd.copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                    ViewGroup.LayoutParams layoutParams12 = linearLayout3.getLayoutParams();
                    if (layoutParams12 != null) {
                        FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) layoutParams12;
                        layoutParams13.height = -2;
                        linearLayout3.setLayoutParams(layoutParams13);
                        return;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private final StateListAnimator copydefault() {
        int dimensionPixelSize;
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this);
        if (rootWindowInsets != null) {
            Insets insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets, "");
            Insets insets2 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insets2, "");
            int iMax = java.lang.Math.max(insets.bottom, insets2.bottom);
            if (iMax > 0) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                return new StateListAnimator(iMax, true, iMax >= C55298xhM.OLrzqt(48, context));
            }
        }
        int identifier = getContext().getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0 && (dimensionPixelSize = getContext().getResources().getDimensionPixelSize(identifier)) > 0) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return new StateListAnimator(dimensionPixelSize, true, dimensionPixelSize >= C55298xhM.OLrzqt(48, context2));
        }
        return new StateListAnimator(0, false, false);
    }

    /* JADX INFO: renamed from: o.oIr$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                z2 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(i, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(int i, boolean z, boolean z2) {
            return new StateListAnimator(i, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.OLrzqt == stateListAnimator.OLrzqt && this.AEQbTJ == stateListAnimator.AEQbTJ && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigationBarInfo(height=" + this.OLrzqt + ", hasNavigationBar=" + this.AEQbTJ + ", isButtonNavigation=" + this.KWHzl + ")";
        }

        public StateListAnimator(int i, boolean z, boolean z2) {
            this.OLrzqt = i;
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }

    public final void valueOf(final android.view.View view) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setVerticalScrollBarEnabled(true);
            textView.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
            view.post(new java.lang.Runnable() { // from class: o.oIA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35922oIr.AYXKKw(view);
                }
            });
            return;
        }
        if (view instanceof android.widget.ScrollView) {
            ((android.widget.ScrollView) view).setVerticalScrollBarEnabled(true);
            view.post(new java.lang.Runnable() { // from class: o.oIB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35922oIr.djBIcL(view);
                }
            });
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).setVerticalScrollBarEnabled(true);
            view.post(new java.lang.Runnable() { // from class: o.oID
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35922oIr.AhwBna(view);
                }
            });
        }
    }

    public static final void AYXKKw(android.view.View view) {
        int lineTop;
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Layout layout = textView.getLayout();
        if (layout == null || (lineTop = layout.getLineTop(layout.getLineCount()) - textView.getHeight()) <= 0) {
            return;
        }
        view.scrollTo(0, lineTop);
    }

    public static final void djBIcL(android.view.View view) {
        ((android.widget.ScrollView) view).fullScroll(130);
    }

    public static final void AhwBna(android.view.View view) {
        ((NestedScrollView) view).fullScroll(130);
    }

    public final void copydefault(C34039nPd c34039nPd, int i, int i2, int i3, int i4) {
        android.view.View next;
        copydefault();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(16, context);
        android.widget.LinearLayout linearLayout = c34039nPd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            android.view.View view = next;
            if ((view instanceof android.widget.LinearLayout) && ((android.widget.LinearLayout) view).getBackground() != null) {
                break;
            }
        }
        final android.view.View view2 = next;
        if (i2 > i4) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            i = java.lang.Math.max(i3, i - (((i2 - i4) + iOLrzqt) + C55298xhM.OLrzqt(8, context2)));
        } else if (i <= 0) {
            android.widget.LinearLayout linearLayout2 = c34039nPd.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        }
        int iMax = java.lang.Math.max(i3, i);
        android.widget.LinearLayout linearLayout3 = c34039nPd.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        android.view.View view3 = (android.view.View) C59467zhb.AubY(ViewGroupKt.getChildren(linearLayout3));
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = iMax;
            view3.setLayoutParams(marginLayoutParams2);
            android.widget.LinearLayout linearLayout4 = c34039nPd.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            ViewGroup.LayoutParams layoutParams3 = linearLayout4.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = iOLrzqt;
                linearLayout4.setLayoutParams(layoutParams4);
                c34039nPd.copydefault.setClipChildren(false);
                c34039nPd.copydefault.setClipToPadding(false);
                if (view2 != null) {
                    view2.post(new java.lang.Runnable() { // from class: o.oIu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C35922oIr.copydefault(view2);
                        }
                    });
                    return;
                }
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void copydefault(android.view.View view) {
        view.getLocationInWindow(new int[2]);
    }

    public final android.view.View EZpvd(InterfaceC35924oIt interfaceC35924oIt, final android.view.View view, final OKMessage oKMessage) {
        java.util.List<MenuActionBase> listCopydefault = interfaceC35924oIt.copydefault();
        if (listCopydefault.isEmpty()) {
            return null;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.topMargin = C55298xhM.OLrzqt(20, context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(ContextCompat.getDrawable(linearLayout.getContext(), C35399nuc.ActionBar.flVtFt));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        int measuredHeight = 0;
        for (final MenuActionBase menuActionBase : listCopydefault) {
            nNC nncCopydefault = nNC.copydefault(this.djBIcL, linearLayout, true);
            android.widget.TextView textView = nncCopydefault.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setText(menuActionBase.OLrzqt(context2));
            android.widget.ImageView imageView = nncCopydefault.copydefault;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            imageView.setImageDrawable(menuActionBase.copydefault(context3));
            nncCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.oIC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C35922oIr.AEQbTJ(menuActionBase, view, oKMessage, this, view2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(nncCopydefault, "");
            nncCopydefault.getRoot().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += nncCopydefault.getRoot().getMeasuredHeight();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, measuredHeight);
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        layoutParams2.topMargin = C55298xhM.OLrzqt(8, context4);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        return linearLayout;
    }

    public static final void AEQbTJ(MenuActionBase menuActionBase, android.view.View view, OKMessage oKMessage, C35922oIr c35922oIr, android.view.View view2) {
        menuActionBase.AEQbTJ(view, oKMessage);
        if (menuActionBase instanceof MenuReplyAction) {
            c35922oIr.EZpvd();
        }
        Function0<Unit> function0 = c35922oIr.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void OLrzqt() {
        android.view.View view = this.AYXKKw;
        android.view.View view2 = this.KWHzl;
        android.view.View view3 = this.OLrzqt;
        this.EZpvd.EZpvd.setClipChildren(false);
        this.EZpvd.EZpvd.setClipToPadding(false);
        this.EZpvd.copydefault.setClipChildren(false);
        this.EZpvd.copydefault.setClipToPadding(false);
        this.AEQbTJ.reverse();
        this.EZpvd.KWHzl.animate().alpha(0.0f).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).start();
        if (view == null && view2 == null && view3 == null) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        if (view != null) {
            intRef.element++;
        }
        if (view2 != null) {
            intRef.element++;
        }
        if (view3 != null) {
            intRef.element++;
        }
        if (view != null) {
            view.setHasTransientState(true);
            view.animate().translationX(this.valueOf).translationY(this.AhwBna).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).withEndAction(new java.lang.Runnable() { // from class: o.oIx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35922oIr.copydefault(intRef, this);
                }
            }).start();
        }
        for (android.view.View view4 : yDY.valueOf(view2, view3)) {
            view4.setHasTransientState(true);
            view4.animate().alpha(0.0f).setDuration(300L).setInterpolator(new FastOutSlowInInterpolator()).withEndAction(new java.lang.Runnable() { // from class: o.oIw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C35922oIr.AEQbTJ(intRef, this);
                }
            }).start();
        }
    }

    public static final void KWHzl(Ref.IntRef intRef, C35922oIr c35922oIr) {
        int i = intRef.element - 1;
        intRef.element = i;
        if (i <= 0) {
            c35922oIr.EZpvd.copydefault.removeAllViews();
        }
    }

    public static final void copydefault(Ref.IntRef intRef, C35922oIr c35922oIr) {
        KWHzl(intRef, c35922oIr);
    }

    public static final void AEQbTJ(Ref.IntRef intRef, C35922oIr c35922oIr) {
        KWHzl(intRef, c35922oIr);
    }

    public final void EZpvd() {
        final android.view.View currentFocus;
        java.lang.Object systemService = getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        final android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        android.content.Context context = getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            currentFocus = this;
        }
        currentFocus.post(new java.lang.Runnable() { // from class: o.oIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35922oIr.AEQbTJ(currentFocus, inputMethodManager);
            }
        });
    }

    public static final void AEQbTJ(android.view.View view, android.view.inputmethod.InputMethodManager inputMethodManager) {
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 1);
    }

    public final void KWHzl() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: o.oIr$ActionBar */
    public static final class ActionBar {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final java.lang.Integer KWHzl;
        public final java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                num2 = actionBar.OLrzqt;
            }
            if ((i & 4) != 0) {
                num3 = actionBar.KWHzl;
            }
            if ((i & 8) != 0) {
                num4 = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(num, num2, num3, num4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
            return new ActionBar(num, num2, num3, num4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Integer num = this.EZpvd;
            int iHashCode = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.OLrzqt;
            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
            java.lang.Integer num3 = this.KWHzl;
            int iHashCode3 = num3 == null ? 0 : num3.hashCode();
            java.lang.Integer num4 = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LayoutParamsConfig(topMargin=" + this.EZpvd + ", startMargin=" + this.OLrzqt + ", endMargin=" + this.KWHzl + ", gravity=" + this.AEQbTJ + ")";
        }

        public ActionBar(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
            this.EZpvd = num;
            this.OLrzqt = num2;
            this.KWHzl = num3;
            this.AEQbTJ = num4;
        }
    }

    /* JADX INFO: renamed from: o.oIr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
