package o;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14571dnv extends C33003moJ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public AbstractC16591emn AEQbTJ;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super java.lang.Integer, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.dnv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dnv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C14571dnv OLrzqt() {
            return new C14571dnv();
        }
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.gEmmrt);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AEQbTJ = (AbstractC16591emn) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.YqksP, viewGroup, false);
        EZpvd();
        AbstractC16591emn abstractC16591emn = this.AEQbTJ;
        if (abstractC16591emn == null) {
            Intrinsics.gEmmrt("");
            abstractC16591emn = null;
        }
        android.view.View root = abstractC16591emn.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final void EZpvd() {
        AbstractC16591emn abstractC16591emn = this.AEQbTJ;
        AbstractC16591emn abstractC16591emn2 = null;
        if (abstractC16591emn == null) {
            Intrinsics.gEmmrt("");
            abstractC16591emn = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16591emn.OLrzqt);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.dns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14571dnv.KWHzl(this.AEQbTJ, obj);
            }
        });
        AbstractC16591emn abstractC16591emn3 = this.AEQbTJ;
        if (abstractC16591emn3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16591emn3 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(abstractC16591emn3.AEQbTJ).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.dnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14571dnv.EZpvd(this.copydefault, obj);
            }
        });
        AbstractC16591emn abstractC16591emn4 = this.AEQbTJ;
        if (abstractC16591emn4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16591emn2 = abstractC16591emn4;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst3 = C8003auW.copydefault(abstractC16591emn2.copydefault).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst3, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst3, this).subscribe(new InterfaceC58227yxM() { // from class: o.dnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14571dnv.valueOf(this.copydefault, obj);
            }
        });
    }

    public static final void KWHzl(C14571dnv c14571dnv, java.lang.Object obj) {
        c14571dnv.dismiss();
    }

    public static final void EZpvd(C14571dnv c14571dnv, java.lang.Object obj) {
        Function1<? super java.lang.Integer, Unit> function1 = c14571dnv.OLrzqt;
        if (function1 != null) {
            function1.invoke(1);
        }
        c14571dnv.dismiss();
    }

    public static final void valueOf(C14571dnv c14571dnv, java.lang.Object obj) {
        Function1<? super java.lang.Integer, Unit> function1 = c14571dnv.OLrzqt;
        if (function1 != null) {
            function1.invoke(2);
        }
        c14571dnv.dismiss();
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        copydefault();
    }

    public final void copydefault() {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity, "");
            ((AbstractActivityC33041mov) fragmentActivityRequireActivity).dismissLoading();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
