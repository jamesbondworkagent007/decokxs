package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle;
import com.okinc.planet.biz_content.leaderboard.viewmodel.PlanetSpotlightViewModel$loadData$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tuS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47666tuS extends ViewModel {
    public final InterfaceC47658tuK AEQbTJ;
    public final StateFlow<java.lang.Long> EZpvd;
    public final SharedFlow<java.util.List<SpotlightArticle>> KWHzl;
    public final MutableSharedFlow<java.util.List<SpotlightArticle>> OLrzqt;
    public final MutableStateFlow<java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47666tuS() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Long> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.util.List<SpotlightArticle>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.tuK:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tuK:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:19) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.ULRxlR():o.tuN A[MD:():o.tuN (m), WRAPPED] (LINE:19)) : (r1v0 o.tuK))
 A[MD:(o.tuK):void (m)] (LINE:18) call: o.tuS.<init>(o.tuK):void type: THIS */
    public /* synthetic */ C47666tuS(InterfaceC47658tuK interfaceC47658tuK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.ULRxlR() : interfaceC47658tuK);
    }

    public C47666tuS(@NotNull InterfaceC47658tuK interfaceC47658tuK) {
        Intrinsics.checkNotNullParameter(interfaceC47658tuK, "");
        this.AEQbTJ = interfaceC47658tuK;
        MutableSharedFlow<java.util.List<SpotlightArticle>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.KWHzl = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<java.lang.Long> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static /* synthetic */ void loadData$default(C47666tuS c47666tuS, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c47666tuS.copydefault(num);
    }

    public final void copydefault(java.lang.Integer num) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetSpotlightViewModel$loadData$1(this, num, null), 3, null);
    }
}
