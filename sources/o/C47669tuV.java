package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_content.leaderboard.bean.TopOrbiter;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetTopOrbitersViewModel$followUser$1;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetTopOrbitersViewModel$loadRecommendOrbiters$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47669tuV extends ViewModel {
    public final MutableSharedFlow<java.util.List<TopOrbiter>> AEQbTJ;
    public final SharedFlow<java.util.List<TopOrbiter>> KWHzl;
    public final C47660tuM OLrzqt;
    public final C46203tLq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47669tuV() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<TopOrbiter>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tuM:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tuM:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:26) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.RVsVBY():o.tuM A[MD:():o.tuM (m), WRAPPED] (LINE:26)) : (r1v0 o.tuM))
  (wrap:o.tLq:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tLq:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:27) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.UrRBLY():o.tLq A[MD:():o.tLq (m), WRAPPED] (LINE:27)) : (r2v0 o.tLq))
 A[MD:(o.tuM, o.tLq):void (m)] (LINE:25) call: o.tuV.<init>(o.tuM, o.tLq):void type: THIS */
    public /* synthetic */ C47669tuV(C47660tuM c47660tuM, C46203tLq c46203tLq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.RVsVBY() : c47660tuM, (i & 2) != 0 ? tPF.copydefault.UrRBLY() : c46203tLq);
    }

    public C47669tuV(@NotNull C47660tuM c47660tuM, @NotNull C46203tLq c46203tLq) {
        Intrinsics.checkNotNullParameter(c47660tuM, "");
        Intrinsics.checkNotNullParameter(c46203tLq, "");
        this.OLrzqt = c47660tuM;
        this.copydefault = c46203tLq;
        MutableSharedFlow<java.util.List<TopOrbiter>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static /* synthetic */ void loadRecommendOrbiters$default(C47669tuV c47669tuV, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c47669tuV.OLrzqt(str);
    }

    public final void OLrzqt(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetTopOrbitersViewModel$loadRecommendOrbiters$1(this, str, null), 3, null);
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super OKServerException, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetTopOrbitersViewModel$followUser$1(this, z, str, function2, null), 3, null);
    }
}
