package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32726miy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mjr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32772mjr extends wXX {
    public Function0<Unit> EZpvd;
    public C32676miA OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mjr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mjr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mjr$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C32772mjr newInstance$default(ActionBar actionBar, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return actionBar.EZpvd(function0);
        }

        public final C32772mjr EZpvd(Function0<Unit> function0) {
            C32772mjr c32772mjr = new C32772mjr();
            c32772mjr.EZpvd = function0;
            return c32772mjr;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(2);
        c52781wYc.setBackgroundResource(C32726miy.StateListAnimator.KWHzl);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        setDynamicFullScreen(true);
        C32676miA c32676miACopydefault = C32676miA.copydefault(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        this.OLrzqt = c32676miACopydefault;
        C32676miA c32676miA = null;
        if (c32676miACopydefault == null) {
            Intrinsics.gEmmrt("");
            c32676miACopydefault = null;
        }
        wYF wyf = c32676miACopydefault.EZpvd;
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        wyf.copydefault();
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
        C32676miA c32676miA2 = this.OLrzqt;
        if (c32676miA2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c32676miA = c32676miA2;
        }
        constraintLayout.addView(c32676miA.getRoot());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.mjr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C32772mjr OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C32772mjr c32772mjr) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c32772mjr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
