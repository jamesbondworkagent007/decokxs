package o;

import android.animation.Animator;
import android.graphics.Outline;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.transition.Transition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.lIE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lIE extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final AbstractC31517lvX AEQbTJ;
    public boolean AYXKKw;
    public C31437ltx AhwBna;
    public mHV AkhnZx;
    public boolean EZpvd;
    public mHV KWHzl;
    public Function0<Unit> OLrzqt;
    public boolean djBIcL;
    public C31437ltx fetchVPNInfo;
    public boolean gEmmrt;
    public final java.lang.Runnable isConnected;
    public boolean valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lIE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lIE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwapAnimationEnabled(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.lIE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ lIE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lIE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC31517lvX abstractC31517lvXOLrzqt = AbstractC31517lvX.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC31517lvXOLrzqt, "");
        this.AEQbTJ = abstractC31517lvXOLrzqt;
        this.isConnected = new java.lang.Runnable() { // from class: o.lIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                lIE.AhwBna(this.EZpvd);
            }
        };
        android.widget.FrameLayout root = abstractC31517lvXOLrzqt.AYXKKw.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        this.AkhnZx = C31899mIa.applyTouchFeedback$default((android.view.View) root, (android.view.View) null, false, 1, 3, (java.lang.Object) null);
        android.widget.FrameLayout root2 = abstractC31517lvXOLrzqt.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        this.KWHzl = C31899mIa.applyTouchFeedback$default((android.view.View) root2, (android.view.View) null, false, 1, 3, (java.lang.Object) null);
    }

    public static final void AhwBna(lIE lie) {
        lie.djBIcL = false;
        lie.fetchVPNInfo = null;
        C31437ltx c31437ltx = lie.AhwBna;
        if (c31437ltx != null) {
            applyRowConfig$default(lie, c31437ltx, false, 2, null);
        }
        lie.values = false;
    }

    public final void EZpvd() {
        C31513lvT c31513lvT = this.AEQbTJ.AEQbTJ;
        c31513lvT.AhwBna.setVisibility(0);
        c31513lvT.AEQbTJ.setVisibility(4);
        this.AYXKKw = true;
        c31513lvT.getRoot().setClickable(false);
        android.widget.FrameLayout root = c31513lvT.getRoot();
        root.setOnClickListener(new Fragment(root, 1000L));
    }

    public static /* synthetic */ void showPaymentSelectorContent$default(lIE lie, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        lie.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        C31513lvT c31513lvT = this.AEQbTJ.AEQbTJ;
        c31513lvT.AhwBna.setVisibility(8);
        c31513lvT.AEQbTJ.setVisibility(0);
        this.AYXKKw = false;
        if (z) {
            c31513lvT.getRoot().setClickable(true);
            android.widget.FrameLayout root = c31513lvT.getRoot();
            root.setOnClickListener(new Dialog(root, 1000L, this));
        } else {
            c31513lvT.getRoot().setClickable(false);
            android.widget.FrameLayout root2 = c31513lvT.getRoot();
            root2.setOnClickListener(new LoaderManager(root2, 1000L));
        }
    }

    public final void KWHzl(@NotNull final C31437ltx c31437ltx) {
        Intrinsics.checkNotNullParameter(c31437ltx, "");
        if (!this.gEmmrt || !this.djBIcL) {
            applyRowConfig$default(this, c31437ltx, false, 2, null);
        } else {
            if (this.valueOf) {
                this.fetchVPNInfo = c31437ltx;
                return;
            }
            AEQbTJ(c31437ltx);
        }
        C31513lvT c31513lvT = this.AEQbTJ.AYXKKw;
        c31513lvT.AhwBna.setVisibility(8);
        c31513lvT.AEQbTJ.setVisibility(0);
        if (c31437ltx.AEQbTJ() != null) {
            android.widget.FrameLayout frameLayout = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            this.AEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lID
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lIE.copydefault(this.AEQbTJ, c31437ltx, view);
                }
            });
            return;
        }
        android.widget.FrameLayout frameLayout2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        frameLayout2.setVisibility(8);
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ lIE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, lIE lie) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = lie;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j) {
            this.EZpvd = view;
            this.copydefault = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.copydefault = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ lIE OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, boolean z, lIE lie, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = z;
            this.OLrzqt = lie;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.EZpvd && this.OLrzqt.AYXKKw) {
                    return;
                }
                this.KWHzl.invoke();
            }
        }
    }

    public static final void copydefault(final lIE lie, C31437ltx c31437ltx, android.view.View view) {
        if (lie.djBIcL) {
            return;
        }
        if (lie.gEmmrt) {
            lie.djBIcL = true;
            lie.KWHzl();
            lie.AEQbTJ();
            lie.OLrzqt(new Function0() { // from class: o.lIF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lIE.AYXKKw(this.copydefault);
                }
            });
        }
        c31437ltx.AEQbTJ().OLrzqt().invoke();
    }

    public static final Unit AYXKKw(lIE lie) {
        lie.valueOf = false;
        C31437ltx c31437ltx = lie.fetchVPNInfo;
        if (c31437ltx != null) {
            lie.AEQbTJ(c31437ltx);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        java.lang.CharSequence text = this.AEQbTJ.AYXKKw.djBIcL.getText();
        AbstractC31517lvX abstractC31517lvX = this.AEQbTJ;
        abstractC31517lvX.AYXKKw.djBIcL.setText(abstractC31517lvX.AEQbTJ.djBIcL.getText());
        this.AEQbTJ.AEQbTJ.djBIcL.setText(text);
    }

    public final void AEQbTJ() {
        C31513lvT c31513lvT = this.AEQbTJ.AYXKKw;
        android.widget.TextView textView = c31513lvT.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        copydefault(textView);
        android.widget.TextView textView2 = c31513lvT.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        copydefault(textView2);
        android.widget.ImageView imageView = c31513lvT.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        copydefault(imageView);
        C31513lvT c31513lvT2 = this.AEQbTJ.AEQbTJ;
        android.widget.TextView textView3 = c31513lvT2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        copydefault(textView3);
        android.widget.TextView textView4 = c31513lvT2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        copydefault(textView4);
        android.widget.ImageView imageView2 = c31513lvT2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        copydefault(imageView2);
    }

    public final void AEQbTJ(C31437ltx c31437ltx) {
        if (!OLrzqt(c31437ltx)) {
            if (this.values) {
                return;
            }
            this.values = true;
            postDelayed(this.isConnected, 2000L);
            return;
        }
        removeCallbacks(this.isConnected);
        this.values = false;
        KWHzl(c31437ltx, true);
        this.djBIcL = false;
        this.fetchVPNInfo = null;
    }

    public final boolean OLrzqt(C31437ltx c31437ltx) {
        C31437ltx c31437ltx2 = this.AhwBna;
        return !((c31437ltx2 == null || (Intrinsics.EZpvd((java.lang.Object) c31437ltx2.copydefault().isConnected(), (java.lang.Object) c31437ltx.copydefault().isConnected()) ^ true)) ? false : true);
    }

    public final void OLrzqt(Function0<Unit> function0) {
        int id;
        int id2;
        this.valueOf = true;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.AEQbTJ.copydefault);
        if (this.EZpvd) {
            id = this.AEQbTJ.AEQbTJ.getRoot().getId();
        } else {
            id = this.AEQbTJ.AYXKKw.getRoot().getId();
        }
        if (this.EZpvd) {
            id2 = this.AEQbTJ.AYXKKw.getRoot().getId();
        } else {
            id2 = this.AEQbTJ.AEQbTJ.getRoot().getId();
        }
        int id3 = this.AEQbTJ.EZpvd.getId();
        constraintSet.clear(id, 3);
        constraintSet.clear(id, 4);
        constraintSet.connect(id, 3, id3, 4);
        constraintSet.connect(id, 4, 0, 4);
        constraintSet.clear(id2, 3);
        constraintSet.clear(id2, 4);
        constraintSet.connect(id2, 4, id3, 3);
        constraintSet.connect(id2, 3, 0, 3);
        PendingIntent pendingIntent = new PendingIntent(function0);
        androidx.transition.AutoTransition autoTransition = new androidx.transition.AutoTransition();
        autoTransition.addListener((Transition.TransitionListener) pendingIntent);
        androidx.transition.TransitionManager.beginDelayedTransition(this.AEQbTJ.copydefault, autoTransition);
        constraintSet.applyTo(this.AEQbTJ.copydefault);
    }

    public static final class PendingIntent implements Transition.TransitionListener {
        public final /* synthetic */ Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
        }

        public PendingIntent(Function0<Unit> function0) {
            this.OLrzqt = function0;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(androidx.transition.Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
            lIE.this.EZpvd = !r5.EZpvd;
            lIE lie = lIE.this;
            final Function0<Unit> function0 = this.OLrzqt;
            lie.postDelayed(new java.lang.Runnable() { // from class: o.lII
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    lIE.PendingIntent.EZpvd(function0);
                }
            }, 200L);
        }

        public static final void EZpvd(Function0 function0) {
            function0.invoke();
        }
    }

    public static final class ActionBar implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public ActionBar(android.view.View view) {
            this.copydefault = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.setVisibility(0);
            this.copydefault.setAlpha(1.0f);
        }
    }

    public static final class StateListAnimator implements Animator.AnimatorListener {
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public StateListAnimator(android.view.View view) {
            this.OLrzqt = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setVisibility(8);
            this.OLrzqt.setAlpha(1.0f);
        }
    }

    public static /* synthetic */ void applyRowConfig$default(lIE lie, C31437ltx c31437ltx, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lie.KWHzl(c31437ltx, z);
    }

    public final void KWHzl(C31437ltx c31437ltx, boolean z) {
        java.lang.String strIsConnected;
        java.lang.String strIsConnected2;
        C31513lvT c31513lvT;
        C31513lvT c31513lvT2;
        this.AhwBna = c31437ltx;
        C31392ltE c31392ltEOLrzqt = c31437ltx.OLrzqt();
        C31392ltE c31392ltECopydefault = c31437ltx.copydefault();
        this.OLrzqt = c31392ltECopydefault.KWHzl();
        boolean z2 = (c31392ltEOLrzqt.djBIcL() || c31392ltECopydefault.djBIcL()) && !((c31392ltEOLrzqt.djBIcL() && ((strIsConnected2 = c31392ltEOLrzqt.isConnected()) == null || strIsConnected2.length() == 0)) || (c31392ltECopydefault.djBIcL() && ((strIsConnected = c31392ltECopydefault.isConnected()) == null || strIsConnected.length() == 0)));
        if (this.EZpvd) {
            c31513lvT = this.AEQbTJ.AEQbTJ;
        } else {
            c31513lvT = this.AEQbTJ.AYXKKw;
        }
        C31513lvT c31513lvT3 = c31513lvT;
        Intrinsics.copydefault(c31513lvT3);
        EZpvd(c31513lvT3, false, c31392ltEOLrzqt.OLrzqt((1535 & 1) != 0 ? c31392ltEOLrzqt.EZpvd : null, (1535 & 2) != 0 ? c31392ltEOLrzqt.gEmmrt : null, (1535 & 4) != 0 ? c31392ltEOLrzqt.djBIcL : false, (1535 & 8) != 0 ? c31392ltEOLrzqt.AhwBna : false, (1535 & 16) != 0 ? c31392ltEOLrzqt.AEQbTJ : null, (1535 & 32) != 0 ? c31392ltEOLrzqt.OLrzqt : null, (1535 & 64) != 0 ? c31392ltEOLrzqt.fetchVPNInfo : null, (1535 & 128) != 0 ? c31392ltEOLrzqt.valueOf : null, (1535 & 256) != 0 ? c31392ltEOLrzqt.copydefault : null, (1535 & 512) != 0 ? c31392ltEOLrzqt.AYXKKw : null, (1535 & 1024) != 0 ? c31392ltEOLrzqt.KWHzl : null), z2, z);
        if (this.EZpvd) {
            c31513lvT2 = this.AEQbTJ.AYXKKw;
        } else {
            c31513lvT2 = this.AEQbTJ.AEQbTJ;
        }
        C31513lvT c31513lvT4 = c31513lvT2;
        Intrinsics.copydefault(c31513lvT4);
        java.lang.String strValueOf = c31392ltECopydefault.valueOf();
        java.lang.String strIsConnected3 = (strValueOf == null || strValueOf.length() == 0) ? c31392ltECopydefault.isConnected() : "";
        java.lang.String strValueOf2 = c31392ltECopydefault.valueOf();
        EZpvd(c31513lvT4, true, c31392ltECopydefault.OLrzqt((1535 & 1) != 0 ? c31392ltECopydefault.EZpvd : null, (1535 & 2) != 0 ? c31392ltECopydefault.gEmmrt : null, (1535 & 4) != 0 ? c31392ltECopydefault.djBIcL : false, (1535 & 8) != 0 ? c31392ltECopydefault.AhwBna : false, (1535 & 16) != 0 ? c31392ltECopydefault.AEQbTJ : null, (1535 & 32) != 0 ? c31392ltECopydefault.OLrzqt : null, (1535 & 64) != 0 ? c31392ltECopydefault.fetchVPNInfo : strIsConnected3, (1535 & 128) != 0 ? c31392ltECopydefault.valueOf : (strValueOf2 == null || strValueOf2.length() == 0) ? c31392ltECopydefault.AYXKKw() : "", (1535 & 256) != 0 ? c31392ltECopydefault.copydefault : null, (1535 & 512) != 0 ? c31392ltECopydefault.AYXKKw : null, (1535 & 1024) != 0 ? c31392ltECopydefault.KWHzl : null), z2, z);
        if (this.EZpvd) {
            mHV mhv = this.AkhnZx;
            if (mhv != null) {
                mhv.EZpvd(c31392ltECopydefault.djBIcL());
            }
            mHV mhv2 = this.KWHzl;
            if (mhv2 != null) {
                mhv2.EZpvd(c31392ltEOLrzqt.djBIcL());
                return;
            }
            return;
        }
        mHV mhv3 = this.AkhnZx;
        if (mhv3 != null) {
            mhv3.EZpvd(c31392ltEOLrzqt.djBIcL());
        }
        mHV mhv4 = this.KWHzl;
        if (mhv4 != null) {
            mhv4.EZpvd(c31392ltECopydefault.djBIcL());
        }
    }

    public static /* synthetic */ void applyRowConfig$default(lIE lie, C31513lvT c31513lvT, boolean z, C31392ltE c31392ltE, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        lie.EZpvd(c31513lvT, z, c31392ltE, z2, z3);
    }

    public final void EZpvd(C31513lvT c31513lvT, boolean z, C31392ltE c31392ltE, boolean z2, boolean z3) {
        java.lang.CharSequence charSequenceOLrzqt;
        android.widget.ImageView imageView = c31513lvT.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        KWHzl(imageView);
        java.lang.String strAEQbTJ = c31392ltE.AEQbTJ();
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            android.widget.ImageView imageView2 = c31513lvT.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            if (z && c31392ltE.AhwBna()) {
                android.widget.ImageView imageView3 = c31513lvT.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                EZpvd(imageView3);
            } else {
                android.widget.ImageView imageView4 = c31513lvT.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                C33054mpH.EZpvd(imageView4, c31392ltE.AEQbTJ(), C52761wXj.TaskDescription.aHXSQp);
            }
        }
        java.lang.String strGEmmrt = c31392ltE.gEmmrt();
        if (strGEmmrt == null || strGEmmrt.length() == 0) {
            android.widget.ImageView imageView5 = c31513lvT.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
        } else {
            android.widget.ImageView imageView6 = c31513lvT.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView6, "");
            imageView6.setVisibility(0);
            android.widget.ImageView imageView7 = c31513lvT.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView7, "");
            C33054mpH.EZpvd(imageView7, c31392ltE.gEmmrt(), C52761wXj.TaskDescription.aHXSQp);
        }
        c31513lvT.djBIcL.setText(c31392ltE.copydefault());
        android.widget.TextView textView = c31513lvT.gEmmrt;
        java.lang.String strValueOf = c31392ltE.valueOf();
        if (strValueOf == null || strValueOf.length() == 0) {
            java.lang.String strEZpvd = c31392ltE.EZpvd();
            if (strEZpvd == null || strEZpvd.length() == 0 || Intrinsics.EZpvd((java.lang.Object) c31392ltE.EZpvd(), (java.lang.Object) "0")) {
                charSequenceOLrzqt = c31392ltE.OLrzqt();
            } else {
                charSequenceOLrzqt = KWHzl(c31392ltE.OLrzqt(), c31392ltE.EZpvd());
            }
        } else {
            charSequenceOLrzqt = c31392ltE.valueOf();
        }
        textView.setText(charSequenceOLrzqt);
        java.lang.String strIsConnected = c31392ltE.isConnected();
        if (strIsConnected == null || strIsConnected.length() == 0) {
            android.widget.TextView textView2 = c31513lvT.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = c31513lvT.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        } else {
            c31513lvT.EZpvd.setText(c31392ltE.isConnected());
            if (z3) {
                android.widget.TextView textView4 = c31513lvT.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                AEQbTJ(textView4);
            } else {
                android.widget.TextView textView5 = c31513lvT.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(0);
            }
            java.lang.String strAYXKKw = c31392ltE.AYXKKw();
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                android.widget.TextView textView6 = c31513lvT.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                textView6.setVisibility(8);
            } else {
                c31513lvT.OLrzqt.setText(c31392ltE.AYXKKw());
                if (z3) {
                    android.widget.TextView textView7 = c31513lvT.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView7, "");
                    AEQbTJ(textView7);
                } else {
                    android.widget.TextView textView8 = c31513lvT.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(textView8, "");
                    textView8.setVisibility(0);
                }
            }
        }
        Function0<Unit> function0KWHzl = c31392ltE.KWHzl();
        if (c31392ltE.djBIcL() && function0KWHzl != null) {
            if (z3) {
                android.widget.ImageView imageView8 = c31513lvT.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView8, "");
                AEQbTJ(imageView8);
            } else {
                android.widget.ImageView imageView9 = c31513lvT.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView9, "");
                imageView9.setVisibility(0);
            }
            android.widget.FrameLayout root = c31513lvT.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, z, this, function0KWHzl));
            return;
        }
        if (z2) {
            c31513lvT.KWHzl.setVisibility(4);
        } else {
            android.widget.ImageView imageView10 = c31513lvT.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView10, "");
            imageView10.setVisibility(8);
        }
        c31513lvT.getRoot().setOnClickListener(null);
    }

    public final android.text.SpannableString KWHzl(java.lang.String str, java.lang.String str2) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str + " · " + C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.hdpuIA), C56423yEv.EZpvd(C56390yDp.OLrzqt("usdgRate", pTB.formatICUPercent$default(C33129mqd.copydefault(str2), null, C38307pTy.Companion.AEQbTJ(2), null, null, null, 29, null)))));
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), str.length() + 2, spannableString.length(), 33);
        return spannableString;
    }

    public final void EZpvd(android.widget.ImageView imageView) {
        imageView.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN));
        int i = (int) (4 * imageView.getResources().getDisplayMetrics().density);
        imageView.setPadding(i, i, i, i);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gHZMYf);
        if (drawableKWHzl != null) {
            int i2 = (int) (12 * imageView.getResources().getDisplayMetrics().density);
            drawableKWHzl.setBounds(0, 0, i2, i2);
        } else {
            drawableKWHzl = null;
        }
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new Application(imageView));
    }

    public static final class Application extends android.view.ViewOutlineProvider {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;

        public Application(android.widget.ImageView imageView) {
            this.AEQbTJ = imageView;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            int i = (int) (32 * this.AEQbTJ.getResources().getDisplayMetrics().density);
            outline.setRoundRect(0, 0, i, i, i / 2.0f);
        }
    }

    public final void KWHzl(android.widget.ImageView imageView) {
        imageView.setImageDrawable(null);
        imageView.setImageBitmap(null);
        imageView.setImageResource(0);
        imageView.setVisibility(8);
        imageView.setBackground(null);
        imageView.setPadding(0, 0, 0, 0);
        imageView.setImageTintList(null);
        imageView.setClipToOutline(false);
        imageView.setOutlineProvider(null);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(android.view.View view) {
        if (view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(250L).setListener(new ActionBar(view)).start();
    }

    public final void copydefault(android.view.View view) {
        if (view.getVisibility() == 0) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(250L).setListener(new StateListAnimator(view)).start();
        }
    }
}
