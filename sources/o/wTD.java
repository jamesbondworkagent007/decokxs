package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.strategy.viewmodel.ContractDCAViewModel$editReinvestment$1;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTD extends AbstractC33073mpa {
    public final SharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ;
    public final MutableSharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault() {
        return this.AEQbTJ;
    }

    public wTD() {
        MutableSharedFlow<kotlin.Pair<java.lang.Boolean, java.lang.String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull BizApiService bizApiService) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(bizApiService, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new ContractDCAViewModel$editReinvestment$1(z, z2, this, bizApiService, str, null), 2, null);
    }
}
