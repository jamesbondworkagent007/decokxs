package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45965tCv extends AbstractC52792wYn {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final boolean KWHzl;
    public Function1<? super FutureCustomizeType, Unit> gEmmrt;
    public final boolean EZpvd = true;
    public FutureCustomizeType OLrzqt = FutureCustomizeType.Future_Customize_PnlPercent;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tCz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45965tCv.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.tCv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tCv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tCv$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C45965tCv show$default(StateListAnimator stateListAnimator, androidx.fragment.app.FragmentManager fragmentManager, FutureCustomizeType futureCustomizeType, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                futureCustomizeType = FutureCustomizeType.Future_Customize_PnlPercent;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return stateListAnimator.copydefault(fragmentManager, futureCustomizeType, function1);
        }

        public final C45965tCv copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, FutureCustomizeType futureCustomizeType, Function1<? super FutureCustomizeType, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("displayType", futureCustomizeType);
            C45965tCv c45965tCv = new C45965tCv();
            c45965tCv.gEmmrt = function1;
            c45965tCv.setArguments(bundle);
            c45965tCv.show(fragmentManager, C45965tCv.class.getSimpleName());
            return c45965tCv;
        }
    }

    public final FutureCustomizeType OLrzqt() {
        return (FutureCustomizeType) this.AEQbTJ.getValue();
    }

    public static final FutureCustomizeType EZpvd(C45965tCv c45965tCv) {
        android.os.Bundle arguments = c45965tCv.getArguments();
        if (arguments == null) {
            arguments = BundleKt.bundleOf();
        }
        FutureCustomizeType futureCustomizeType = (FutureCustomizeType) BundleCompat.getParcelable(arguments, "displayType", FutureCustomizeType.class);
        return futureCustomizeType == null ? FutureCustomizeType.Future_Customize_PnlPercent : futureCustomizeType;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C47501trL.Fragment.RuDPQV));
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C47501trL.Fragment.fJNWhG));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 1000L, this));
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.OLrzqt = OLrzqt();
        InterfaceC56445yFq<FutureCustomizeType> entries = FutureCustomizeType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        java.util.Iterator<FutureCustomizeType> it = entries.iterator();
        while (it.hasNext()) {
            FutureCustomizeType next = it.next();
            arrayList.add(new C55276xgr(next.getTitle(), next, null, OLrzqt() == next, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.tCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45965tCv.OLrzqt(this.EZpvd, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(C45965tCv c45965tCv, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        c45965tCv.OLrzqt = (FutureCustomizeType) objOLrzqt;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.tCv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45965tCv OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C45965tCv c45965tCv) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c45965tCv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt.gEmmrt;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt.OLrzqt);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
