package com.okinc.okex.center.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C33070mpX;
import o.C47315tni;
import o.C47538trw;
import o.C55298xhM;
import o.C55302xhQ;
import o.C56392yDr;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransformableFloatingUnReadMsgActionButton extends FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AnimatorSet AEQbTJ;
    public final Runnable AYXKKw;
    public final int AhwBna;
    public boolean AkhnZx;
    public String DbNXlk;
    public final int EZpvd;
    public final int KWHzl;
    public C47538trw copydefault;
    public ScrolledState djBIcL;
    public final Runnable fetchVPNInfo;
    public final int gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformableFloatingUnReadMsgActionButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransformableFloatingUnReadMsgActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollapseStatus(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentAnimator(AnimatorSet animatorSet) {
        this.AEQbTJ = animatorSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ TransformableFloatingUnReadMsgActionButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableFloatingUnReadMsgActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = C55298xhM.OLrzqt(56, context);
        this.EZpvd = C55298xhM.OLrzqt(48, context);
        this.gEmmrt = C55298xhM.OLrzqt(24, context);
        this.KWHzl = C55298xhM.OLrzqt(20, context);
        this.djBIcL = ScrolledState.Up;
        C47538trw c47538trwKWHzl = C47538trw.KWHzl(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c47538trwKWHzl, "");
        this.copydefault = c47538trwKWHzl;
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.skQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(TransformableFloatingUnReadMsgActionButton.EZpvd(this.OLrzqt));
            }
        });
        this.DbNXlk = C33070mpX.AYXKKw(C47315tni.PendingIntent.hUfVAv);
        this.valueOf = true;
        this.fetchVPNInfo = new Runnable() { // from class: o.skP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TransformableFloatingUnReadMsgActionButton.valueOf(this.KWHzl);
            }
        };
        this.AYXKKw = new Runnable() { // from class: o.skR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TransformableFloatingUnReadMsgActionButton.KWHzl(this.OLrzqt);
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final TextView valueOf() {
        TextView textView = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final ImageView AEQbTJ() {
        ImageView imageView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    public final int KWHzl() {
        return ((Number) this.isConnected.getValue()).intValue();
    }

    public static final int EZpvd(TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton) {
        return transformableFloatingUnReadMsgActionButton.AYXKKw();
    }

    public static final void valueOf(TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton) {
        transformableFloatingUnReadMsgActionButton.OLrzqt();
    }

    public static final void KWHzl(TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton) {
        transformableFloatingUnReadMsgActionButton.copydefault();
    }

    public final void AEQbTJ(boolean z) {
        if (this.AkhnZx == z) {
            return;
        }
        this.AkhnZx = z;
        removeCallbacks(this.fetchVPNInfo);
        removeCallbacks(this.AYXKKw);
        if (this.valueOf) {
            postDelayed(this.AkhnZx ? this.fetchVPNInfo : this.AYXKKw, 1000L);
        } else {
            gEmmrt();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.fetchVPNInfo);
        removeCallbacks(this.AYXKKw);
        AnimatorSet animatorSet = this.AEQbTJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        clearAnimation();
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            TransformableFloatingUnReadMsgActionButton.this.djBIcL();
        }
    }

    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity(TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            TransformableFloatingUnReadMsgActionButton.this.setCollapseStatus(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            TransformableFloatingUnReadMsgActionButton.this.setCollapseStatus(false);
            TransformableFloatingUnReadMsgActionButton.this.gEmmrt();
        }
    }

    public static final class Application implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            TransformableFloatingUnReadMsgActionButton.this.setCollapseStatus(true);
            TransformableFloatingUnReadMsgActionButton.this.djBIcL();
        }
    }

    public static final class TaskDescription implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            TransformableFloatingUnReadMsgActionButton.this.djBIcL();
        }
    }

    public final void gEmmrt() {
        valueOf().setVisibility(0);
        if (this.AkhnZx) {
            valueOf().setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.DGOPHZDGOPHZ));
            AEQbTJ().setImageResource(C47315tni.Application.valueOf);
        } else {
            AEQbTJ().setImageResource(C47315tni.Application.AhwBna);
            valueOf().setText(this.DbNXlk);
        }
    }

    public final void djBIcL() {
        valueOf().setVisibility(this.AkhnZx ? 0 : 8);
        if (this.AkhnZx) {
            valueOf().setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.hCLrkq));
            AEQbTJ().setImageResource(C47315tni.Application.valueOf);
        } else {
            AEQbTJ().setImageResource(C47315tni.Application.AhwBna);
        }
    }

    public final void OLrzqt() {
        if (isAttachedToWindow()) {
            AnimatorSet animatorSet = this.AEQbTJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            clearAnimation();
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new ViewWrapper(this), "width", C55298xhM.dp2px$default(56.0f, null, 1, null), KWHzl());
            Intrinsics.copydefault(objectAnimatorOfInt);
            objectAnimatorOfInt.addListener(new ActionBar());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(valueOf(), "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(400L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.playTogether(objectAnimatorOfInt, objectAnimatorOfFloat);
            animatorSet2.start();
            this.AEQbTJ = animatorSet2;
        }
    }

    public final void copydefault() {
        if (isAttachedToWindow()) {
            AnimatorSet animatorSet = this.AEQbTJ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            clearAnimation();
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new ViewWrapper(this), "width", KWHzl(), C55298xhM.dp2px$default(56.0f, null, 1, null));
            Intrinsics.copydefault(objectAnimatorOfInt);
            objectAnimatorOfInt.addListener(new TaskDescription());
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(valueOf(), "alpha", 1.0f, 0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(400L);
            animatorSet2.setInterpolator(new LinearInterpolator());
            animatorSet2.playTogether(objectAnimatorOfInt, objectAnimatorOfFloat);
            animatorSet2.start();
            this.AEQbTJ = animatorSet2;
        }
    }

    public final void KWHzl(@NotNull View view) {
        int iDp2px$default;
        Intrinsics.checkNotNullParameter(view, "");
        ScrolledState scrolledState = this.djBIcL;
        ScrolledState scrolledState2 = ScrolledState.Down;
        if (scrolledState == scrolledState2 || !isAttachedToWindow()) {
            return;
        }
        AnimatorSet animatorSet = this.AEQbTJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        clearAnimation();
        this.djBIcL = scrolledState2;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new ViewWrapper(this), "height", this.AhwBna, this.EZpvd);
        if (this.AkhnZx) {
            iDp2px$default = KWHzl();
        } else {
            iDp2px$default = C55298xhM.dp2px$default(56.0f, null, 1, null);
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(new ViewWrapper(this), "width", iDp2px$default, (width - i) - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0));
        Intrinsics.copydefault(objectAnimatorOfInt2);
        objectAnimatorOfInt2.addListener(new Activity(this));
        ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(new ViewWrapper(AEQbTJ()), "size", this.gEmmrt, this.KWHzl);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(valueOf(), "alpha", this.AkhnZx ? 1.0f : 0.0f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(150L);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2, objectAnimatorOfInt3, objectAnimatorOfFloat);
        animatorSet2.start();
        this.AEQbTJ = animatorSet2;
    }

    public final void EZpvd() {
        int iDp2px$default;
        ScrolledState scrolledState = this.djBIcL;
        ScrolledState scrolledState2 = ScrolledState.Up;
        if (scrolledState == scrolledState2 || !isAttachedToWindow()) {
            return;
        }
        AnimatorSet animatorSet = this.AEQbTJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        clearAnimation();
        this.djBIcL = scrolledState2;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new ViewWrapper(this), "height", this.EZpvd, this.AhwBna);
        if (this.AkhnZx) {
            iDp2px$default = KWHzl();
        } else {
            iDp2px$default = C55298xhM.dp2px$default(56.0f, null, 1, null);
        }
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(new ViewWrapper(this), "width", getWidth(), iDp2px$default);
        Intrinsics.copydefault(objectAnimatorOfInt2);
        objectAnimatorOfInt2.addListener(new Application());
        ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(new ViewWrapper(AEQbTJ()), "size", this.KWHzl, this.gEmmrt);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(valueOf(), "alpha", 1.0f, this.AkhnZx ? 1.0f : 0.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(150L);
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2, objectAnimatorOfInt3, objectAnimatorOfFloat);
        animatorSet2.start();
        this.AEQbTJ = animatorSet2;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class ViewWrapper implements Serializable {
        public static final int $stable = 8;
        private final View target;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View getTarget() {
            return this.target;
        }

        public ViewWrapper(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.target = view;
        }

        public final int getHeight() {
            return this.target.getLayoutParams().height;
        }

        public final void setHeight(int i) {
            this.target.getLayoutParams().height = C56548yJl.copydefault(i, 0);
            this.target.requestLayout();
        }

        public final int getWidth() {
            return this.target.getLayoutParams().width;
        }

        public final void setWidth(int i) {
            this.target.getLayoutParams().width = C56548yJl.copydefault(i, 0);
            this.target.requestLayout();
        }

        public final int getSize() {
            return this.target.getLayoutParams().width;
        }

        public final void setSize(int i) {
            this.target.getLayoutParams().width = C56548yJl.copydefault(i, 0);
            this.target.getLayoutParams().height = C56548yJl.copydefault(i, 0);
            this.target.requestLayout();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ScrolledState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ScrolledState[] $VALUES;
        public static final ScrolledState Up = new ScrolledState("Up", 0);
        public static final ScrolledState Down = new ScrolledState("Down", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ScrolledState[] $values() {
            return new ScrolledState[]{Up, Down};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ScrolledState> getEntries() {
            return $ENTRIES;
        }

        private ScrolledState(String str, int i) {
        }

        static {
            ScrolledState[] scrolledStateArr$values = $values();
            $VALUES = scrolledStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(scrolledStateArr$values);
        }

        public static ScrolledState valueOf(String str) {
            return (ScrolledState) Enum.valueOf(ScrolledState.class, str);
        }

        public static ScrolledState[] values() {
            return (ScrolledState[]) $VALUES.clone();
        }
    }

    public final int AYXKKw() {
        float fMeasureText;
        Resources resources = C32979mnm.EZpvd.OLrzqt().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        float fEZpvd = C55302xhQ.EZpvd(resources);
        float fDp2px$default = C55298xhM.dp2px$default(56.0f, null, 1, null);
        try {
            fMeasureText = new TextPaint(valueOf().getPaint()).measureText(C33070mpX.AYXKKw(C47315tni.PendingIntent.DGOPHZDGOPHZ)) + C55298xhM.dp2px$default(64.0f, null, 1, null);
        } catch (Exception unused) {
            fMeasureText = fDp2px$default;
        }
        return (int) C56548yJl.KWHzl(fMeasureText, fDp2px$default, fEZpvd * 0.62f);
    }
}
