package o;

import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20992grO extends AbstractC57671ymn {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public boolean EZpvd;
    public AbstractC16454ekI KWHzl;
    public java.lang.Float copydefault;
    public java.lang.Integer gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public android.view.View EZpvd(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57671ymn
    public boolean isConnected() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.grO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20992grO copydefault() {
            return new C20992grO();
        }
    }

    @Override // o.AbstractC57671ymn
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16454ekI abstractC16454ekI = (AbstractC16454ekI) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.Ufzxmz, viewGroup, false);
        this.KWHzl = abstractC16454ekI;
        if (abstractC16454ekI == null) {
            Intrinsics.gEmmrt("");
            abstractC16454ekI = null;
        }
        return abstractC16454ekI.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC16454ekI abstractC16454ekI = this.KWHzl;
        AbstractC16454ekI abstractC16454ekI2 = null;
        if (abstractC16454ekI == null) {
            Intrinsics.gEmmrt("");
            abstractC16454ekI = null;
        }
        abstractC16454ekI.AEQbTJ.setText(dZP.OLrzqt.AhwBna());
        AbstractC16454ekI abstractC16454ekI3 = this.KWHzl;
        if (abstractC16454ekI3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16454ekI3 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16454ekI3.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.grN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20992grO.EZpvd(this.copydefault, obj);
            }
        });
        AbstractC16454ekI abstractC16454ekI4 = this.KWHzl;
        if (abstractC16454ekI4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16454ekI2 = abstractC16454ekI4;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(abstractC16454ekI2.copydefault).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.grM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20992grO.OLrzqt(this.AEQbTJ, obj);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.grU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20992grO.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(C20992grO c20992grO, java.lang.Object obj) {
        c20992grO.KWHzl((java.lang.Integer) 3);
    }

    public static final void OLrzqt(C20992grO c20992grO, java.lang.Object obj) {
        c20992grO.KWHzl((java.lang.Integer) 1);
    }

    public static final void AEQbTJ(C20992grO c20992grO) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20992grO, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        show(fragmentManager, C20992grO.class.getName());
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function1<? super java.lang.Integer, Unit> function1;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        java.lang.Integer num = this.gEmmrt;
        if (num != null || (function1 = this.AEQbTJ) == null) {
            return;
        }
        function1.invoke(num);
    }

    private final void KWHzl(java.lang.Integer num) {
        this.gEmmrt = num;
        dismissAllowingStateLoss();
        Function1<? super java.lang.Integer, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            function1.invoke(num);
        }
    }
}
