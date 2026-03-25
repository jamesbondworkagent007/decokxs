package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.AdvancedStrategyManager$handleInputFields$1;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.AdvancedStrategyManager$initUI$1;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.AdvancedStrategyManager$validateTokens$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C30798lhu {
    public final CoroutineScope AEQbTJ;
    public final C30790lhm AYXKKw;
    public final SharedFlow<Unit> AhwBna;
    public final MutableStateFlow<InterfaceC30792lho> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final StateFlow<InterfaceC30792lho> OLrzqt;
    public C21668hHx copydefault;
    public final C28189kSe gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC30792lho> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public C30798lhu(@NotNull C30790lhm c30790lhm, @NotNull C28189kSe c28189kSe) {
        Intrinsics.checkNotNullParameter(c30790lhm, "");
        Intrinsics.checkNotNullParameter(c28189kSe, "");
        this.AYXKKw = c30790lhm;
        this.gEmmrt = c28189kSe;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
        MutableStateFlow<InterfaceC30792lho> MutableStateFlow = StateFlowKt.MutableStateFlow(c30790lhm.OLrzqt(AdvancedOrderType.MARKET));
        this.EZpvd = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void copydefault(@NotNull AdvancedOrderType advancedOrderType) {
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        AEQbTJ();
        this.EZpvd.setValue(this.AYXKKw.OLrzqt(advancedOrderType));
    }

    public final void KWHzl(@NotNull C21668hHx c21668hHx) {
        Intrinsics.checkNotNullParameter(c21668hHx, "");
        this.copydefault = c21668hHx;
        C25389ivm.safeLaunch$default(this.AEQbTJ, null, null, new AdvancedStrategyManager$initUI$1(this, c21668hHx, null), 3, null);
    }

    public final void copydefault(InterfaceC30595leC interfaceC30595leC) {
        if (this.copydefault == null) {
            return;
        }
        C25389ivm.safeLaunch$default(this.AEQbTJ, null, null, new AdvancedStrategyManager$handleInputFields$1(this, interfaceC30595leC, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull ValidateTokensRequest validateTokensRequest, @NotNull Continuation<? super Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) {
        AdvancedStrategyManager$validateTokens$1 advancedStrategyManager$validateTokens$1;
        if (continuation instanceof AdvancedStrategyManager$validateTokens$1) {
            advancedStrategyManager$validateTokens$1 = (AdvancedStrategyManager$validateTokens$1) continuation;
            int i = advancedStrategyManager$validateTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedStrategyManager$validateTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedStrategyManager$validateTokens$1 = new AdvancedStrategyManager$validateTokens$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedStrategyManager$validateTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedStrategyManager$validateTokens$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C28189kSe c28189kSe = this.gEmmrt;
        advancedStrategyManager$validateTokens$1.label = 1;
        java.lang.Object objCopydefault2 = c28189kSe.copydefault(validateTokensRequest, advancedStrategyManager$validateTokens$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public final boolean EZpvd(@NotNull C30626leh c30626leh) {
        Intrinsics.checkNotNullParameter(c30626leh, "");
        return this.EZpvd.getValue().OLrzqt(c30626leh);
    }

    public final Flow<C30626leh> AEQbTJ(@NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow, @NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow2, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow3, @NotNull StateFlow<java.lang.String> stateFlow, @NotNull MutableStateFlow<C30805liA> mutableStateFlow4, @NotNull Flow<? extends java.util.List<java.lang.String>> flow, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow5, @NotNull MutableStateFlow<java.lang.Boolean> mutableStateFlow6, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow7) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow2, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow3, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow4, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow5, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow6, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow7, "");
        return this.EZpvd.getValue().copydefault(mutableStateFlow, mutableStateFlow2, mutableStateFlow3, stateFlow, mutableStateFlow4, flow, mutableStateFlow5, mutableStateFlow6, mutableStateFlow7);
    }

    public final void AEQbTJ() {
        this.EZpvd.getValue().OLrzqt();
        this.copydefault = null;
    }
}
