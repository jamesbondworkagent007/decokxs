package com.okinc.business.invest_biz.ui.screens.network_fee.view_model;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.ui.screens.network_fee.model.InvestNetworkFeeItem;
import com.okinc.business.invest_biz.ui.screens.network_fee.view_model.InvestNetworkFeeSelectionViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C26486jdI;
import o.C27493jwI;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestNetworkFeeSelectionViewModel extends ViewModel {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final SavedStateHandle KWHzl;
    public final MutableStateFlow<C26486jdI> OLrzqt;
    public final StateFlow<C26486jdI> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C26486jdI> copydefault() {
        return this.copydefault;
    }

    @yCM
    public InvestNetworkFeeSelectionViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = savedStateHandle;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestNetworkFeeSelectionViewModel.AhwBna(this.EZpvd);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.jdK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InvestNetworkFeeSelectionViewModel.valueOf(this.EZpvd);
            }
        });
        MutableStateFlow<C26486jdI> MutableStateFlow = StateFlowKt.MutableStateFlow(new C26486jdI(true, null, null, 6, null));
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final NetworkFee OLrzqt() {
        return (NetworkFee) this.AEQbTJ.getValue();
    }

    public static final NetworkFee AhwBna(InvestNetworkFeeSelectionViewModel investNetworkFeeSelectionViewModel) {
        NetworkFee networkFee = (NetworkFee) investNetworkFeeSelectionViewModel.KWHzl.get("key.networkFee");
        if (networkFee != null) {
            return networkFee;
        }
        throw new IllegalArgumentException("NetworkFee cannot be null for Network Fee Bottom Sheet");
    }

    public final InvestNetworkFeeItem AEQbTJ() {
        return (InvestNetworkFeeItem) this.EZpvd.getValue();
    }

    public static final InvestNetworkFeeItem valueOf(InvestNetworkFeeSelectionViewModel investNetworkFeeSelectionViewModel) {
        return (InvestNetworkFeeItem) investNetworkFeeSelectionViewModel.KWHzl.get("key.selectedNetworkFee");
    }

    public final void EZpvd() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestNetworkFeeSelectionViewModel$initNetworkFeeContent$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull InvestNetworkFeeItem investNetworkFeeItem, boolean z) {
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        List<InvestNetworkFeeItem> listAEQbTJ = this.copydefault.getValue().AEQbTJ();
        Iterator<InvestNetworkFeeItem> it = listAEQbTJ.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd(it.next().getTitle(), investNetworkFeeItem.getTitle())) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i;
        if (i2 < 0 || i2 >= listAEQbTJ.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (InvestNetworkFeeItem investNetworkFeeItem2 : listAEQbTJ) {
            arrayList.add(investNetworkFeeItem2.copy((6143 & 1) != 0 ? investNetworkFeeItem2.title : null, (6143 & 2) != 0 ? investNetworkFeeItem2.iconRes : 0, (6143 & 4) != 0 ? investNetworkFeeItem2.isCustom : false, (6143 & 8) != 0 ? investNetworkFeeItem2.calculateGasPrice : null, (6143 & 16) != 0 ? investNetworkFeeItem2.estimatedTime : null, (6143 & 32) != 0 ? investNetworkFeeItem2.gasPrice : null, (6143 & 64) != 0 ? investNetworkFeeItem2.priorityFee : null, (6143 & 128) != 0 ? investNetworkFeeItem2.gasPriceUnit : null, (6143 & 256) != 0 ? investNetworkFeeItem2.minGasPrice : null, (6143 & 512) != 0 ? investNetworkFeeItem2.maxGasPrice : null, (6143 & 1024) != 0 ? investNetworkFeeItem2.isExpand : false, (6143 & 2048) != 0 ? investNetworkFeeItem2.selected : false, (6143 & 4096) != 0 ? investNetworkFeeItem2.customGasPrice : null));
        }
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
        if (z) {
            EZpvd((InvestNetworkFeeItem) listFJNWhG.get(i2));
        }
        InvestNetworkFeeItem investNetworkFeeItem3 = (InvestNetworkFeeItem) listFJNWhG.get(i2);
        listFJNWhG.set(i2, investNetworkFeeItem3.copy((6143 & 1) != 0 ? investNetworkFeeItem3.title : null, (6143 & 2) != 0 ? investNetworkFeeItem3.iconRes : 0, (6143 & 4) != 0 ? investNetworkFeeItem3.isCustom : false, (6143 & 8) != 0 ? investNetworkFeeItem3.calculateGasPrice : null, (6143 & 16) != 0 ? investNetworkFeeItem3.estimatedTime : null, (6143 & 32) != 0 ? investNetworkFeeItem3.gasPrice : null, (6143 & 64) != 0 ? investNetworkFeeItem3.priorityFee : null, (6143 & 128) != 0 ? investNetworkFeeItem3.gasPriceUnit : null, (6143 & 256) != 0 ? investNetworkFeeItem3.minGasPrice : null, (6143 & 512) != 0 ? investNetworkFeeItem3.maxGasPrice : null, (6143 & 1024) != 0 ? investNetworkFeeItem3.isExpand : ((InvestNetworkFeeItem) listFJNWhG.get(i2)).isCustom() && z, (6143 & 2048) != 0 ? investNetworkFeeItem3.selected : z, (6143 & 4096) != 0 ? investNetworkFeeItem3.customGasPrice : null));
        MutableStateFlow<C26486jdI> mutableStateFlow = this.OLrzqt;
        mutableStateFlow.setValue(C26486jdI.copy$default(mutableStateFlow.getValue(), false, null, listFJNWhG, 3, null));
    }

    public final void EZpvd(@NotNull InvestNetworkFeeItem investNetworkFeeItem) {
        Intrinsics.checkNotNullParameter(investNetworkFeeItem, "");
        this.KWHzl.set("key.selectedNetworkFee", investNetworkFeeItem);
    }

    public final InvestNetworkFeeItem KWHzl() {
        return (InvestNetworkFeeItem) this.KWHzl.get("key.selectedNetworkFee");
    }
}
