package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.planet.biz_plugin.spot.data.SpotCustomizeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tDU extends AbstractC52792wYn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final boolean OLrzqt;
    public Function1<? super SpotCustomizeType, Unit> djBIcL;
    public final boolean AEQbTJ = true;
    public SpotCustomizeType KWHzl = SpotCustomizeType.Spot_Customize_PnlPercent;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tDT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return tDU.KWHzl(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tDU$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ tDU show$default(ActionBar actionBar, androidx.fragment.app.FragmentManager fragmentManager, SpotCustomizeType spotCustomizeType, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                spotCustomizeType = SpotCustomizeType.Spot_Customize_PnlPercent;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return actionBar.AEQbTJ(fragmentManager, spotCustomizeType, function1);
        }

        public final tDU AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, SpotCustomizeType spotCustomizeType, Function1<? super SpotCustomizeType, Unit> function1) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("displayType", spotCustomizeType);
            tDU tdu = new tDU();
            tdu.djBIcL = function1;
            tdu.setArguments(bundle);
            tdu.show(fragmentManager, tDU.class.getSimpleName());
            return tdu;
        }
    }

    public final SpotCustomizeType AEQbTJ() {
        return (SpotCustomizeType) this.copydefault.getValue();
    }

    public static final SpotCustomizeType KWHzl(tDU tdu) {
        android.os.Bundle arguments = tdu.getArguments();
        if (arguments == null) {
            arguments = BundleKt.bundleOf();
        }
        SpotCustomizeType spotCustomizeType = (SpotCustomizeType) BundleCompat.getParcelable(arguments, "displayType", SpotCustomizeType.class);
        return spotCustomizeType == null ? SpotCustomizeType.Spot_Customize_PnlPercent : spotCustomizeType;
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
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.KWHzl = AEQbTJ();
        InterfaceC56445yFq<SpotCustomizeType> entries = SpotCustomizeType.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
        java.util.Iterator<SpotCustomizeType> it = entries.iterator();
        while (it.hasNext()) {
            SpotCustomizeType next = it.next();
            arrayList.add(new C55276xgr(next.getTitle(), next, null, AEQbTJ() == next, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        }
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.tDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return tDU.OLrzqt(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit OLrzqt(tDU tdu, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        tdu.KWHzl = (SpotCustomizeType) objOLrzqt;
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ tDU KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, tDU tdu) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = tdu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.djBIcL;
                if (function1 != null) {
                    function1.invoke(this.KWHzl.KWHzl);
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
