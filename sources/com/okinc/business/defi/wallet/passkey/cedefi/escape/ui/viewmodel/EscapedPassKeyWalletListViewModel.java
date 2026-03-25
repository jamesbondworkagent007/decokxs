package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeSingleBean;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletItemUIData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletListUIData;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletLoadUIData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56403yEb;
import o.InterfaceC49371unL;
import o.fJS;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapedPassKeyWalletListViewModel extends ViewModel {
    public StateFlow<? extends InterfaceC49371unL<Boolean>> EZpvd;
    public final MutableStateFlow<InterfaceC49371unL<EscapedWalletLoadUIData>> KWHzl;
    public final MutableStateFlow<InterfaceC49371unL<Boolean>> OLrzqt;
    public final fJS copydefault;
    public String gEmmrt;
    public StateFlow<? extends InterfaceC49371unL<EscapedWalletLoadUIData>> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<java.lang.Boolean>>, kotlinx.coroutines.flow.StateFlow<o.unL<java.lang.Boolean>> */
    public final StateFlow<InterfaceC49371unL<Boolean>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlinx.coroutines.flow.StateFlow<? extends o.unL<com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletLoadUIData>>, kotlinx.coroutines.flow.StateFlow<o.unL<com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletLoadUIData>> */
    public final StateFlow<InterfaceC49371unL<EscapedWalletLoadUIData>> EZpvd() {
        return this.valueOf;
    }

    @yCM
    public EscapedPassKeyWalletListViewModel(@NotNull fJS fjs) {
        Intrinsics.checkNotNullParameter(fjs, "");
        this.copydefault = fjs;
        MutableStateFlow<InterfaceC49371unL<EscapedWalletLoadUIData>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC49371unL<Boolean>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new InterfaceC49371unL.StateListAnimator(null, 1, null));
        this.OLrzqt = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
        this.gEmmrt = MultiTransferSignData.DEFAULT_INTERVAL;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapedPassKeyWalletListViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void EZpvd(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapedPassKeyWalletListViewModel$getEscapedWalletListData$1(z, this, z2, null), 3, null);
    }

    public final EscapedWalletListUIData OLrzqt(EscapeListDataResp escapeListDataResp) {
        String simpleDate$default;
        List<EscapeSingleBean> escapeList = escapeListDataResp.getEscapeList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(escapeList, 10));
        for (EscapeSingleBean escapeSingleBean : escapeList) {
            String walletName = escapeSingleBean.getWalletName();
            Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(escapeSingleBean.getTimestamp());
            if (fieldNames == null || (simpleDate$default = pTA.formatSimpleDate$default(new Date(fieldNames.longValue() * ((long) 1000)), null, 1, null)) == null) {
                simpleDate$default = "";
            }
            arrayList.add(new EscapedWalletItemUIData(walletName, simpleDate$default, escapeSingleBean.getAccountId()));
        }
        return new EscapedWalletListUIData(escapeListDataResp.getNextCursor(), arrayList);
    }
}
