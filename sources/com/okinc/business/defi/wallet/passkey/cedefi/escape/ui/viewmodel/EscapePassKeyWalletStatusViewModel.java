package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeChainBean;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedAddressData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedAddressTabItem;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedDetailStatus;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C13934dbu;
import o.C17654fNi;
import o.InterfaceC49371unL;
import o.fJR;
import o.pTA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletStatusViewModel extends ViewModel {
    public final String AEQbTJ;
    public final fJR EZpvd;
    public StateFlow<? extends InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>> KWHzl;
    public final MutableStateFlow<InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>> OLrzqt;
    public List<Long> copydefault;
    public final Flow<Result<EscapedStatusUIData>> djBIcL;
    public final C13934dbu valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<kotlin.Pair<java.lang.Boolean, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData>>>, kotlinx.coroutines.flow.StateFlow<o.unL<kotlin.Pair<java.lang.Boolean, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData>>> */
    public final StateFlow<InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Result<EscapedStatusUIData>> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public EscapePassKeyWalletStatusViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C13934dbu c13934dbu, @NotNull C17654fNi c17654fNi, @NotNull fJR fjr) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c17654fNi, "");
        Intrinsics.checkNotNullParameter(fjr, "");
        this.valueOf = c13934dbu;
        this.EZpvd = fjr;
        MutableStateFlow<InterfaceC49371unL<Pair<Boolean, EscapedStatusUIData>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = yDY.AhwBna();
        EscapeStatusInput escapeStatusInput = (EscapeStatusInput) savedStateHandle.get("escape_status_input");
        this.AEQbTJ = escapeStatusInput != null ? escapeStatusInput.getAccountId() : null;
        this.djBIcL = FlowKt.transformLatest(c17654fNi.OLrzqt(), new EscapePassKeyWalletStatusViewModel$special$$inlined$flatMapLatest$1(null, this));
    }

    public final void AEQbTJ(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletStatusViewModel$getEscapeDetailStatusInfo$1(this, z, null), 3, null);
    }

    public final Object AEQbTJ(Continuation<? super Flow<Result<EscapedStatusUIData>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new EscapePassKeyWalletStatusViewModel$createEscapeDetailFlow$2(this, null), continuation);
    }

    public final EscapedStatusUIData EZpvd(EscapeDetailDataResp escapeDetailDataResp) {
        String simpleDate$default;
        Long fieldNames;
        String chainName;
        EscapedDetailStatus escapedDetailStatusEZpvd = EscapedDetailStatus.Companion.EZpvd(escapeDetailDataResp.getStatus());
        List<EscapeChainBean> escapeChainList = escapeDetailDataResp.getEscapeChainList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : escapeChainList) {
            Integer numValueOf = Integer.valueOf(((EscapeChainBean) obj).getChainType());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<EscapeChainBean> list = (List) entry.getValue();
            if (list.size() > 1) {
                chainName = KWHzl(iIntValue, list);
            } else {
                EscapeChainBean escapeChainBean = (EscapeChainBean) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (escapeChainBean == null || (chainName = escapeChainBean.getChainName()) == null) {
                    chainName = "Other";
                }
            }
            String str = chainName;
            EscapeChainBean escapeChainBean2 = (EscapeChainBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            arrayList2.add(EZpvd(escapeChainBean2.copy((223 & 1) != 0 ? escapeChainBean2.chainType : 0, (223 & 2) != 0 ? escapeChainBean2.chainIndex : null, (223 & 4) != 0 ? escapeChainBean2.escapeStatus : 0, (223 & 8) != 0 ? escapeChainBean2.escapeAddress : null, (223 & 16) != 0 ? escapeChainBean2.address : null, (223 & 32) != 0 ? escapeChainBean2.chainName : str, (223 & 64) != 0 ? escapeChainBean2.orderId : 0L, (223 & 128) != 0 ? escapeChainBean2.saAddress : null)));
        }
        String escapeTimestamp = escapeDetailDataResp.getEscapeTimestamp();
        if (escapeTimestamp == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(escapeTimestamp)) == null || (simpleDate$default = pTA.formatSimpleDate$default(new Date(fieldNames.longValue() * ((long) 1000)), null, 1, null)) == null) {
            simpleDate$default = "";
        }
        return new EscapedStatusUIData(escapedDetailStatusEZpvd, arrayList2, simpleDate$default, escapeDetailDataResp.getBoundWeb3Wallet());
    }

    public final EscapedAddressTabItem EZpvd(EscapeChainBean escapeChainBean) {
        String chainName = escapeChainBean.getChainName();
        if (chainName == null) {
            chainName = "";
        }
        String chainName2 = escapeChainBean.getChainName();
        if (chainName2 == null) {
            chainName2 = "";
        }
        String escapeAddress = escapeChainBean.getEscapeAddress();
        String address = escapeChainBean.getAddress();
        String saAddress = escapeChainBean.getSaAddress();
        return new EscapedAddressTabItem(chainName, chainName2, new EscapedAddressData(escapeAddress, address, saAddress != null ? saAddress : ""));
    }

    public final String KWHzl(int i, List<EscapeChainBean> list) {
        if (i == 1) {
            return "EVM";
        }
        if (i == 501) {
            return "SVM";
        }
        String chainName = ((EscapeChainBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getChainName();
        return chainName == null ? "Other" : chainName;
    }
}
