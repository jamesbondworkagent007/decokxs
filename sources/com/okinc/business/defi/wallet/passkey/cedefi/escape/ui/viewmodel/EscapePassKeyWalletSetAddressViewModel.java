package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAddressBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C56403yEb;
import o.InterfaceC49371unL;
import o.fJP;
import o.fLJ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletSetAddressViewModel extends AbstractC33073mpa {
    public StateFlow<? extends InterfaceC49371unL<? extends List<fLJ>>> AEQbTJ;
    public ArrayList<fLJ> EZpvd;
    public final fJP KWHzl;
    public final MutableStateFlow<InterfaceC49371unL<List<fLJ>>> OLrzqt;
    public List<PasskeyWalletAddressBean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<? extends java.util.List<o.fLJ>>>, kotlinx.coroutines.flow.StateFlow<o.unL<java.util.List<o.fLJ>>> */
    public final StateFlow<InterfaceC49371unL<List<fLJ>>> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public EscapePassKeyWalletSetAddressViewModel(@NotNull fJP fjp) {
        Intrinsics.checkNotNullParameter(fjp, "");
        this.KWHzl = fjp;
        MutableStateFlow<InterfaceC49371unL<List<fLJ>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = new ArrayList<>();
        this.copydefault = yDY.AhwBna();
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyWalletSetAddressViewModel$getEscapeAddressNetworkInfo$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String KWHzl(int i, List<PasskeyWalletAddressBean> list) {
        return i != 1 ? i != 501 ? ((PasskeyWalletAddressBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getChainName() : "SVM" : "EVM";
    }

    public final void KWHzl(@NotNull fLJ flj, int i) {
        Intrinsics.checkNotNullParameter(flj, "");
        if (i < 0 || i >= this.EZpvd.size()) {
            return;
        }
        this.EZpvd.set(i, flj);
    }

    public final ArrayList<EscapeSignAddressData> EZpvd() {
        Object next;
        String strEZpvd;
        List<PasskeyWalletAddressBean> list = this.copydefault;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PasskeyWalletAddressBean passkeyWalletAddressBean : list) {
            Iterator<T> it = this.EZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (passkeyWalletAddressBean.getChainType() == ((fLJ) next).copydefault()) {
                    break;
                }
            }
            fLJ flj = (fLJ) next;
            String chainLogo = passkeyWalletAddressBean.getChainLogo();
            String chainName = passkeyWalletAddressBean.getChainName();
            long chainIndex = passkeyWalletAddressBean.getChainIndex();
            if (flj == null || (strEZpvd = flj.EZpvd()) == null) {
                strEZpvd = "";
            }
            arrayList.add(new EscapeSignAddressData(chainLogo, chainName, chainIndex, strEZpvd, null, null, 16, null));
        }
        return (ArrayList) CollectionsKt___CollectionsKt.OLrzqt(arrayList, new ArrayList());
    }
}
