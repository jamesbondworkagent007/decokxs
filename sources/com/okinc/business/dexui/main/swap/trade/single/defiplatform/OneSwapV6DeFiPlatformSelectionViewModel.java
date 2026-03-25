package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C22380heK;
import o.C22692hkE;
import o.C23237huT;
import o.C24695iig;
import o.C24994ioO;
import o.C56424yEw;
import o.InterfaceC22693hkF;
import o.InterfaceC24993ioN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class OneSwapV6DeFiPlatformSelectionViewModel extends ViewModel {
    public final StateFlow<Map<String, ApproveStatusGroup>> AEQbTJ;
    public final C23237huT EZpvd;
    public final C24994ioO KWHzl;
    public final MutableStateFlow<InterfaceC24993ioN> OLrzqt;
    public final MutableStateFlow<Map<String, ApproveStatusGroup>> copydefault;
    public final StateFlow<InterfaceC24993ioN> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24993ioN> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Map<String, ApproveStatusGroup>> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public OneSwapV6DeFiPlatformSelectionViewModel(@NotNull C24994ioO c24994ioO, @NotNull C23237huT c23237huT) {
        Intrinsics.checkNotNullParameter(c24994ioO, "");
        Intrinsics.checkNotNullParameter(c23237huT, "");
        this.KWHzl = c24994ioO;
        this.EZpvd = c23237huT;
        MutableStateFlow<InterfaceC24993ioN> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC24993ioN.TaskDescription.KWHzl);
        this.OLrzqt = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Map<String, ApproveStatusGroup>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(C56424yEw.KWHzl());
        this.copydefault = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void AEQbTJ(@NotNull String str, boolean z, @NotNull V6QuoteRequestWrapper v6QuoteRequestWrapper) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(v6QuoteRequestWrapper, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OneSwapV6DeFiPlatformSelectionViewModel$startDelayedPolling$1(this, str, z, v6QuoteRequestWrapper, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (!this.copydefault.getValue().isEmpty()) {
            return;
        }
        InterfaceC22693hkF interfaceC22693hkFDbNXlk = C22380heK.OLrzqt.copydefault(str).DbNXlk();
        Intrinsics.copydefault(interfaceC22693hkFDbNXlk, "");
        List<ApproveStatusGroup> listKWHzl = ((C22692hkE) interfaceC22693hkFDbNXlk).KWHzl();
        ArrayList<ApproveStatusGroup> arrayList = new ArrayList();
        for (Object obj : listKWHzl) {
            if (Intrinsics.EZpvd((Object) ((ApproveStatusGroup) obj).getUniqueKeyForProviderList(), (Object) C22692hkE.Companion.EZpvd(str4, str5, str6))) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ApproveStatusGroup approveStatusGroup : arrayList) {
            linkedHashMap.put(approveStatusGroup.getDeFiPlatformId(), approveStatusGroup);
        }
        this.copydefault.setValue(linkedHashMap);
        if (!this.copydefault.getValue().isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OneSwapV6DeFiPlatformSelectionViewModel$fetchTokenApprovalForAllDeFiPlatforms$2(this, str3, str4, str5, str6, dexMultiTokenInfoBean, str2, null), 3, null);
    }

    public final boolean OLrzqt(String str, String str2) {
        return Intrinsics.EZpvd((Object) str2, (Object) "11") && C24695iig.AEQbTJ(str, true).OLrzqt() != DexSwapLiquiditySource.All;
    }
}
