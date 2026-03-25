package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52812wZg;
import o.kTV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25333iuj extends LinearLayoutCompat {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public int OLrzqt;
    public C52812wZg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25333iuj(@NotNull android.content.Context context) {
        this(context, null, false, false, false, 30, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25333iuj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, false, false, false, 28, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPendingOrderCount(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (wrap:android.util.AttributeSet:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r8v0 android.util.AttributeSet))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(android.content.Context, android.util.AttributeSet, boolean, boolean, boolean):void (m)] (LINE:24) call: o.iuj.<init>(android.content.Context, android.util.AttributeSet, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C25333iuj(android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25333iuj(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = z2;
        this.AEQbTJ = z3;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25333iuj.KWHzl(context, this);
            }
        });
        setPendingOrderCount(0);
        setGravity(16);
        android.view.View view = KWHzl().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility((C22416heu.fIwbmz() && z && kTV.Companion.AhwBna() && !z3) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hBN KWHzl() {
        return (hBN) this.KWHzl.getValue();
    }

    public static final hBN KWHzl(android.content.Context context, C25333iuj c25333iuj) {
        return hBN.copydefault(android.view.LayoutInflater.from(context), c25333iuj);
    }

    public final void KWHzl(boolean z) {
        AppCompatImageView appCompatImageView = KWHzl().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
    }

    public final void setOnKlineIconClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        AppCompatImageView appCompatImageView = KWHzl().copydefault;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, function0));
    }

    public final void setOnMoreIconClick(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        android.widget.FrameLayout frameLayout = KWHzl().EZpvd;
        frameLayout.setOnClickListener(new ActionBar(frameLayout, 1000L, function1, this));
    }

    public final void AEQbTJ() {
        android.view.View view = KWHzl().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        kTV.Companion.copydefault();
    }

    public final void setContainerViewMoreVisible(boolean z) {
        android.widget.FrameLayout frameLayout = KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
    }

    public final void EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!C22416heu.fIwbmz() || this.EZpvd || this.AEQbTJ) {
            return;
        }
        kTV.StateListAnimator stateListAnimator = kTV.Companion;
        if (!stateListAnimator.EZpvd() && stateListAnimator.AEQbTJ()) {
            C52812wZg c52812wZg = this.copydefault;
            if (c52812wZg != null) {
                c52812wZg.KWHzl();
            }
            postDelayed(new StateListAnimator(activity), 300L);
        }
    }

    /* JADX INFO: renamed from: o.iuj$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            kTV.Companion.OLrzqt();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C52812wZg c52812wZg = this.copydefault;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.iuj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ C25333iuj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, C25333iuj c25333iuj) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function1;
            this.OLrzqt = c25333iuj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke(java.lang.Integer.valueOf(this.OLrzqt.OLrzqt));
                this.OLrzqt.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.iuj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.iuj$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ android.app.Activity OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.app.Activity activity) {
            this.OLrzqt = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C25333iuj c25333iuj = C25333iuj.this;
            C52812wZg c52812wZg = new C52812wZg(this.OLrzqt);
            android.widget.FrameLayout frameLayout = C25333iuj.this.KWHzl().EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(frameLayout);
            stateListAnimator.EZpvd(1);
            stateListAnimator.OLrzqt(c52812wZg.djBIcL().getString(C23274hvD.Fragment.zpGcln));
            stateListAnimator.copydefault(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
            stateListAnimator.KWHzl(C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null));
            stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
            stateListAnimator.OLrzqt(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null));
            c52812wZg.AEQbTJ(stateListAnimator);
            c52812wZg.OLrzqt(3);
            c52812wZg.KWHzl(false);
            android.widget.TextView textViewValues = c52812wZg.values();
            if (textViewValues != null) {
                textViewValues.setVisibility(8);
            }
            C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
            if (c52794wYpIsConnected != null) {
                c52794wYpIsConnected.setText(c52812wZg.djBIcL().getString(C23274hvD.Fragment.buildRccMetadata));
            }
            c52812wZg.AEQbTJ(TaskDescription.EZpvd);
            c52812wZg.fARcdN();
            c25333iuj.copydefault = c52812wZg;
        }
    }
}
