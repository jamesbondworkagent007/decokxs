package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53021wdd extends android.widget.RelativeLayout {
    public int KWHzl;
    public final uSQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53021wdd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53021wdd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.wdd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53021wdd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53021wdd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        final uSQ usqOLrzqt = uSQ.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(usqOLrzqt, "");
        this.copydefault = usqOLrzqt;
        usqOLrzqt.values.setOnClickListener(new View.OnClickListener() { // from class: o.wdi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53021wdd.OLrzqt(this.EZpvd, usqOLrzqt, view);
            }
        });
    }

    public static final void OLrzqt(C53021wdd c53021wdd, uSQ usq, android.view.View view) {
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(c53021wdd.KWHzl), (java.lang.Object) 0)) {
            LinearLayoutCompat linearLayoutCompat = usq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            usq.AEQbTJ.measure(View.MeasureSpec.makeMeasureSpec(c53021wdd.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            c53021wdd.KWHzl = usq.AEQbTJ.getMeasuredHeight();
            LinearLayoutCompat linearLayoutCompat2 = usq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(8);
        }
        LinearLayoutCompat linearLayoutCompat3 = usq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        c53021wdd.OLrzqt(usq, !(linearLayoutCompat3.getVisibility() == 0));
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_DropDown_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void OLrzqt(final uSQ usq, boolean z) {
        final android.animation.ValueAnimator valueAnimatorOfInt;
        if (z) {
            valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(1, this.KWHzl);
            Intrinsics.copydefault(valueAnimatorOfInt);
            valueAnimatorOfInt.addListener(new TaskDescription(usq));
        } else {
            valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(this.KWHzl, 1);
            Intrinsics.copydefault(valueAnimatorOfInt);
            valueAnimatorOfInt.addListener(new ActionBar(usq));
        }
        valueAnimatorOfInt.setDuration(240L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.wdf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C53021wdd.OLrzqt(usq, valueAnimatorOfInt, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        usq.KWHzl.setImageResource(z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
    }

    public static final void OLrzqt(uSQ usq, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        LinearLayoutCompat linearLayoutCompat = usq.AEQbTJ;
        Intrinsics.copydefault(linearLayoutCompat);
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams != null) {
            java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
            java.lang.Integer num = animatedValue instanceof java.lang.Integer ? (java.lang.Integer) animatedValue : null;
            if (num != null) {
                layoutParams.height = num.intValue();
            }
            linearLayoutCompat.setLayoutParams(layoutParams);
            linearLayoutCompat.requestLayout();
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void AEQbTJ(boolean z, @NotNull java.lang.String str) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        uSQ usq = this.copydefault;
        usq.djBIcL.setText("--");
        usq.AYXKKw.setText("--");
        usq.AhwBna.setText("--");
        usq.fetchVPNInfo.setText("--");
        LinearLayoutCompat linearLayoutCompat = usq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        usq.OLrzqt.setText(C33069mpW.copydefault(C48033uCm.Fragment.DcMfJKsfEqpH, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", str))));
        usq.copydefault.setText("--");
        android.widget.TextView textView = usq.valueOf;
        if (z) {
            strAYXKKw = C33069mpW.copydefault(C48033uCm.Fragment.GcnicV, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", str)));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.GQzpsZsQwTVT);
        }
        textView.setText(strAYXKKw);
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.copydefault.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.copydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.copydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.copydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    /* JADX INFO: renamed from: o.wdd$ActionBar */
    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ uSQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(uSQ usq) {
            this.OLrzqt = usq;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            LinearLayoutCompat linearLayoutCompat = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.wdd$TaskDescription */
    public static final class TaskDescription implements Animator.AnimatorListener {
        public final /* synthetic */ uSQ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription(uSQ usq) {
            this.OLrzqt = usq;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            LinearLayoutCompat linearLayoutCompat = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
        }
    }
}
