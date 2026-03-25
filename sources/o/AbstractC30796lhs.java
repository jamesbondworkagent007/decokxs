package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.BaseAdvancedOrderStrategy$observeTradeChanges$1;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.strategy.BaseAdvancedOrderStrategy$observeTradeChanges$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30796lhs implements InterfaceC30792lho {
    public final C19700gMb OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30792lho
    public java.lang.Object EZpvd(@NotNull C21668hHx c21668hHx, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, c21668hHx, continuation);
    }

    @Override // o.InterfaceC30792lho
    public void OLrzqt() {
    }

    public AbstractC30796lhs(@NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.OLrzqt = c19700gMb;
    }

    public static /* synthetic */ java.lang.Object EZpvd(AbstractC30796lhs abstractC30796lhs, C21668hHx c21668hHx, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC30792lho
    public Flow<C30626leh> copydefault(@NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow, @NotNull MutableStateFlow<DexMultiTokenInfoBean> mutableStateFlow2, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow3, @NotNull StateFlow<java.lang.String> stateFlow, @NotNull MutableStateFlow<C30805liA> mutableStateFlow4, @NotNull Flow<? extends java.util.List<java.lang.String>> flow, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow5, @NotNull MutableStateFlow<java.lang.Boolean> mutableStateFlow6, @NotNull MutableStateFlow<java.lang.String> mutableStateFlow7) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow2, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow3, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow4, "");
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow5, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow6, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow7, "");
        return FlowKt.combine(FlowKt.combine(mutableStateFlow, mutableStateFlow2, mutableStateFlow3, stateFlow, mutableStateFlow4, new BaseAdvancedOrderStrategy$observeTradeChanges$1(null)), flow, mutableStateFlow6, mutableStateFlow7, new BaseAdvancedOrderStrategy$observeTradeChanges$2(null));
    }

    public final boolean copydefault() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.OLrzqt.KWHzl();
        return interfaceC9738bbJKWHzl == null || interfaceC9738bbJKWHzl.zsXlph();
    }
}
