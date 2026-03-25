package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.leaderboard.TopTraderFilterBottomSheet;
import com.okinc.planet.biz_content.leaderboard.bean.Rank;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetTopTradersViewModel$loadData$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47673tuZ extends ViewModel {
    public final C47668tuU AEQbTJ;
    public final SharedFlow<java.util.List<Rank>> EZpvd;
    public final MutableSharedFlow<java.util.List<Rank>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47673tuZ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<Rank>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tuU:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tuU:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:18) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.RXzakW():o.tuU A[MD:():o.tuU (m), WRAPPED] (LINE:18)) : (r1v0 o.tuU))
 A[MD:(o.tuU):void (m)] (LINE:17) call: o.tuZ.<init>(o.tuU):void type: THIS */
    public /* synthetic */ C47673tuZ(C47668tuU c47668tuU, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.RXzakW() : c47668tuU);
    }

    public C47673tuZ(@NotNull C47668tuU c47668tuU) {
        Intrinsics.checkNotNullParameter(c47668tuU, "");
        this.AEQbTJ = c47668tuU;
        MutableSharedFlow<java.util.List<Rank>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.EZpvd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void loadData$default(C47673tuZ c47673tuZ, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c47673tuZ.EZpvd(str);
    }

    public final void EZpvd(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetTopTradersViewModel$loadData$1(this, str, null), 3, null);
    }

    public final java.lang.String copydefault() {
        return C46386tSk.copydefault.EZpvd(C46388tSm.Companion.KWHzl().copydefault());
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strAEQbTJ = C46386tSk.copydefault.AEQbTJ(C46388tSm.Companion.KWHzl().copydefault());
        return Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) strAEQbTJ) ? TopTraderFilterBottomSheet.SelectionDays.DAY_30.getValue() : strAEQbTJ;
    }
}
