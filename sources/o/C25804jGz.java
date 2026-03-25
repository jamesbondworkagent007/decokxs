package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25804jGz extends wXX {
    public C22329hdM EZpvd;
    public Function1<? super C55276xgr, Unit> KWHzl;
    public java.util.List<C55276xgr> OLrzqt;
    public java.lang.Boolean copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(Intrinsics.EZpvd(this.copydefault, java.lang.Boolean.TRUE) ? 4 : 0);
        wxq.setTitle(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AYXKKw));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C22329hdM.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView.Adapter jgf;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        C22329hdM c22329hdM = this.EZpvd;
        if (c22329hdM != null) {
            if (Intrinsics.EZpvd(this.copydefault, java.lang.Boolean.FALSE)) {
                java.util.List<C55276xgr> listAhwBna = this.OLrzqt;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                jgf = new C25799jGu(listAhwBna, new Function1() { // from class: o.jGB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25804jGz.KWHzl(this.EZpvd, (C55276xgr) obj);
                    }
                });
            } else {
                java.util.List<C55276xgr> listAhwBna2 = this.OLrzqt;
                if (listAhwBna2 == null) {
                    listAhwBna2 = yDY.AhwBna();
                }
                jgf = new jGF(listAhwBna2, new Function1() { // from class: o.jGC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C25804jGz.EZpvd(this.OLrzqt, (C55276xgr) obj);
                    }
                });
            }
            c22329hdM.OLrzqt.setAdapter(jgf);
        }
    }

    public static final Unit KWHzl(C25804jGz c25804jGz, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Function1<? super C55276xgr, Unit> function1 = c25804jGz.KWHzl;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        c25804jGz.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C25804jGz c25804jGz, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        Function1<? super C55276xgr, Unit> function1 = c25804jGz.KWHzl;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        c25804jGz.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    /* JADX INFO: renamed from: o.jGz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jGz$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C25804jGz newInstance$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return stateListAnimator.EZpvd(list, z, function1);
        }

        public final C25804jGz EZpvd(@NotNull java.util.List<C55276xgr> list, boolean z, Function1<? super C55276xgr, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            C25804jGz c25804jGz = new C25804jGz();
            c25804jGz.OLrzqt = list;
            c25804jGz.copydefault = java.lang.Boolean.valueOf(z);
            c25804jGz.KWHzl = function1;
            return c25804jGz;
        }
    }

    private final void AEQbTJ() {
        C32866mlf.onEvent$default("DEXMarket_Token_Alert_Type_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
