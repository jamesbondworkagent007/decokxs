package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.planet.biz_content.leaderboard.viewmodel.TopTradersActivityViewModel$loadData$1;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47672tuY extends ViewModel {
    public final MutableLiveData<C47655tuH> AEQbTJ;
    public final SharedFlow<java.util.List<Rank>> AhwBna;
    public final MutableSharedFlow<java.util.List<Rank>> EZpvd;
    public int KWHzl;
    public java.lang.String OLrzqt;
    public final C47668tuU copydefault;
    public boolean djBIcL;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47672tuY() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C47655tuH> AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tuU:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tuU:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:26) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.RXzakW():o.tuU A[MD:():o.tuU (m), WRAPPED] (LINE:26)) : (r1v0 o.tuU))
 A[MD:(o.tuU):void (m)] (LINE:25) call: o.tuY.<init>(o.tuU):void type: THIS */
    public /* synthetic */ C47672tuY(C47668tuU c47668tuU, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.RXzakW() : c47668tuU);
    }

    public C47672tuY(@NotNull C47668tuU c47668tuU) {
        Intrinsics.checkNotNullParameter(c47668tuU, "");
        this.copydefault = c47668tuU;
        MutableSharedFlow<java.util.List<Rank>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.AEQbTJ = new MutableLiveData<>();
        this.valueOf = 10;
        this.KWHzl = 1;
    }

    public static /* synthetic */ void loadData$default(C47672tuY c47672tuY, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c47672tuY.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        if (z) {
            this.AEQbTJ.setValue(new C47655tuH(StatefulView.Status.Loading, yDY.AhwBna(), false, true, null));
            this.djBIcL = false;
            this.KWHzl = 1;
            this.OLrzqt = null;
        } else if (this.djBIcL) {
            this.KWHzl++;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TopTradersActivityViewModel$loadData$1(this, z, null), 3, null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C46386tSk.copydefault.KWHzl(C46388tSm.Companion.KWHzl().copydefault(), str);
    }

    public final java.lang.String EZpvd() {
        return C46386tSk.copydefault.EZpvd(C46388tSm.Companion.KWHzl().copydefault());
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strEZpvd = C46386tSk.copydefault.EZpvd(C46388tSm.Companion.KWHzl().copydefault());
        TopTraderFilterBottomSheet.SelectionPNL selectionPNL = TopTraderFilterBottomSheet.SelectionPNL.PNL_VALUE;
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) selectionPNL.getValue())) {
            return selectionPNL.getDesc();
        }
        TopTraderFilterBottomSheet.SelectionPNL selectionPNL2 = TopTraderFilterBottomSheet.SelectionPNL.PNL_PERCENTAGE;
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) selectionPNL2.getValue())) {
            return selectionPNL2.getDesc();
        }
        return selectionPNL2.getDesc();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C46386tSk.copydefault.copydefault(C46388tSm.Companion.KWHzl().copydefault(), str);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strAEQbTJ = C46386tSk.copydefault.AEQbTJ(C46388tSm.Companion.KWHzl().copydefault());
        return Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) strAEQbTJ) ? TopTraderFilterBottomSheet.SelectionDays.DAY_30.getValue() : strAEQbTJ;
    }

    public final java.lang.String copydefault() {
        java.lang.String strAEQbTJ = C46386tSk.copydefault.AEQbTJ(C46388tSm.Companion.KWHzl().copydefault());
        TopTraderFilterBottomSheet.SelectionDays selectionDays = TopTraderFilterBottomSheet.SelectionDays.DAY_7;
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) selectionDays.getValue())) {
            return selectionDays.getDesc();
        }
        TopTraderFilterBottomSheet.SelectionDays selectionDays2 = TopTraderFilterBottomSheet.SelectionDays.DAY_30;
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) selectionDays2.getValue())) {
            return selectionDays2.getDesc();
        }
        TopTraderFilterBottomSheet.SelectionDays selectionDays3 = TopTraderFilterBottomSheet.SelectionDays.DAY_90;
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) selectionDays3.getValue())) {
            return selectionDays3.getDesc();
        }
        TopTraderFilterBottomSheet.SelectionDays selectionDays4 = TopTraderFilterBottomSheet.SelectionDays.YEAR_1;
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) selectionDays4.getValue())) {
            return selectionDays4.getDesc();
        }
        return selectionDays2.getDesc();
    }
}
