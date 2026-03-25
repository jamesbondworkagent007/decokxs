package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C19878gSr;
import o.C25389ivm;
import o.C55276xgr;
import o.C56403yEb;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingTokenSelectionViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<List<C55276xgr>> AEQbTJ;
    public List<DexMultiTokenInfoBean> KWHzl;
    public final StateFlow<List<C55276xgr>> OLrzqt;
    public final C19878gSr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C55276xgr>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public CopyTradingTokenSelectionViewModel(@NotNull C19878gSr c19878gSr) {
        Intrinsics.checkNotNullParameter(c19878gSr, "");
        this.copydefault = c19878gSr;
        MutableStateFlow<List<C55276xgr>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = yDY.AhwBna();
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ(str2, list);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new CopyTradingTokenSelectionViewModel$getAndUpdateCurrencyList$1(this, str, str2, null), 3, null);
    }

    public final void AEQbTJ(String str, List<DexMultiTokenInfoBean> list) {
        this.KWHzl = list;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DexMultiTokenInfoBean dexMultiTokenInfoBean : list) {
            arrayList.add(new C55276xgr(dexMultiTokenInfoBean.getTokenSymbol(), dexMultiTokenInfoBean, dexMultiTokenInfoBean.getTokenName(), Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getTokenContractAddress(), (Object) str), false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        MutableStateFlow<List<C55276xgr>> mutableStateFlow = this.AEQbTJ;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), arrayList)) {
        }
    }
}
