package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46810teG extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public int AYXKKw;
    public Function1<? super java.lang.Integer, Unit> AhwBna;
    public C42942rft KWHzl;
    public boolean OLrzqt = true;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.teL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46810teG.copydefault(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.teI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46810teG.EZpvd(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.teG$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.teG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C46810teG AEQbTJ(int i, boolean z, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C46810teG c46810teG = new C46810teG();
            c46810teG.AYXKKw = i;
            c46810teG.OLrzqt = z;
            c46810teG.AhwBna = function1;
            return c46810teG;
        }
    }

    private final C59534zip KWHzl() {
        return (C59534zip) this.AEQbTJ.getValue();
    }

    public static final C59534zip copydefault(final C46810teG c46810teG) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C46900tfr.class, new C46903tfu());
        c59534zip.register(C46904tfv.class, new C46808teE(c46810teG.AYXKKw, new Function1() { // from class: o.teM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46810teG.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }));
        return c59534zip;
    }

    public static final Unit copydefault(C46810teG c46810teG, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c46810teG.AhwBna;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        c46810teG.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final java.util.ArrayList<java.lang.Object> EZpvd() {
        return (java.util.ArrayList) this.copydefault.getValue();
    }

    public static final java.util.ArrayList EZpvd(C46810teG c46810teG) {
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(new C46900tfr(C33070mpX.AYXKKw(qZH.PendingIntent.RckOJh), 0), new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOKBmQNaCIdOM), 5), new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOKBmQN), 1), new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.fDu), 2), new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.xxhdY), 3), new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.ilfrrN), 4));
        if (c46810teG.OLrzqt && C27563jxZ.OLrzqt.DbNXlk()) {
            arrayListCopydefault.add(new C46900tfr(C33070mpX.AYXKKw(qZH.PendingIntent.fQQVvf), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
            arrayListCopydefault.add(new C46904tfv(C33070mpX.AYXKKw(qZH.PendingIntent.OJuSTm), 6));
        }
        return arrayListCopydefault;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42942rft c42942rftKWHzl = C42942rft.KWHzl(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        c42942rftKWHzl.OLrzqt.setAdapter(KWHzl());
        this.KWHzl = c42942rftKWHzl;
        KWHzl().setItems(EZpvd());
        KWHzl().notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
