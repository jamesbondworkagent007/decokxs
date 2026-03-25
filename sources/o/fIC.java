package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fIC extends androidx.fragment.app.Fragment {
    public AbstractC16570emS EZpvd;
    public int OLrzqt;
    public int copydefault;
    public Function0<Unit> AEQbTJ = new Function0() { // from class: o.fIF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fIC.KWHzl();
        }
    };
    public Function0<Unit> KWHzl = new Function0() { // from class: o.fIE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fIC.OLrzqt();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16570emS abstractC16570emSKWHzl = AbstractC16570emS.KWHzl(layoutInflater, viewGroup, false);
        this.EZpvd = abstractC16570emSKWHzl;
        if (abstractC16570emSKWHzl != null) {
            abstractC16570emSKWHzl.AEQbTJ.setAnimation(C13754dXa.Fragment.AkhnZx);
            abstractC16570emSKWHzl.AEQbTJ.playAnimation();
            abstractC16570emSKWHzl.KWHzl.setVisibility(this.copydefault);
            abstractC16570emSKWHzl.EZpvd.setVisibility(this.OLrzqt);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16570emSKWHzl.EZpvd);
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fIB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    fIC.copydefault(this.AEQbTJ, obj);
                }
            });
            C8003auW.copydefault(abstractC16570emSKWHzl.KWHzl).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fIJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    fIC.AEQbTJ(this.KWHzl, obj);
                }
            });
        }
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS != null) {
            return abstractC16570emS.getRoot();
        }
        return null;
    }

    public static final void copydefault(fIC fic, java.lang.Object obj) {
        fic.AEQbTJ.invoke();
    }

    public static final void AEQbTJ(fIC fic, java.lang.Object obj) {
        fic.KWHzl.invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fIC.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(fIC fic) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fic, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault(int i) {
        C52794wYp c52794wYp;
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS != null && (c52794wYp = abstractC16570emS.EZpvd) != null) {
            c52794wYp.setVisibility(i);
        }
        this.OLrzqt = i;
    }

    public final void AEQbTJ(int i) {
        C52794wYp c52794wYp;
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS != null && (c52794wYp = abstractC16570emS.KWHzl) != null) {
            c52794wYp.setVisibility(i);
        }
        this.copydefault = i;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS == null || (c52794wYp = abstractC16570emS.KWHzl) == null) {
            return;
        }
        c52794wYp.setText(str);
    }

    public final void AEQbTJ(@NotNull java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(charSequence, "");
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS == null || (textView = abstractC16570emS.OLrzqt) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC16570emS abstractC16570emS = this.EZpvd;
        if (abstractC16570emS == null || (textView = abstractC16570emS.copydefault) == null) {
            return;
        }
        textView.setText(str);
    }
}
