package com.okinc.business.invest_biz.ui.page.dialog;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.wallet.api.bean.AddressType;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23916iOb;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.iVJ;
import o.xWO;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRewardingAddressViewModel extends ViewModel {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final StateFlow<iVJ> AYXKKw;
    public final MutableStateFlow<iVJ> EZpvd;
    public String KWHzl;
    public final InterfaceC23916iOb OLrzqt;
    public String copydefault;
    public final xWO djBIcL;
    public final Set<Integer> gEmmrt;
    public final SharedFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<iVJ> KWHzl() {
        return this.AYXKKw;
    }

    @yCM
    public InvestRewardingAddressViewModel(@NotNull xWO xwo, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(xwo, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.djBIcL = xwo;
        this.OLrzqt = interfaceC23916iOb;
        this.gEmmrt = yEE.AhwBna(Integer.valueOf(AddressType.Legacy.getValue()), Integer.valueOf(AddressType.P2SHCommonType.getValue()));
        MutableStateFlow<iVJ> MutableStateFlow = StateFlowKt.MutableStateFlow(new iVJ(null, false, false, false, 15, null));
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = MutableStateFlow;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = mutableSharedFlowMutableSharedFlow$default;
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestRewardingAddressViewModel$setInitialAddress$1(this, str, null), 3, null);
    }

    public final String AEQbTJ() {
        Long lOLrzqt;
        String strCopydefault = this.EZpvd.getValue().copydefault();
        if (strCopydefault != null && (lOLrzqt = OLrzqt()) != null) {
            long jLongValue = lOLrzqt.longValue();
            int iEZpvd = this.djBIcL.EZpvd(jLongValue, strCopydefault);
            if (this.OLrzqt.AhwBna().AEQbTJ(strCopydefault, jLongValue) && this.gEmmrt.contains(Integer.valueOf(iEZpvd))) {
                return strCopydefault;
            }
            MutableStateFlow<iVJ> mutableStateFlow = this.EZpvd;
            mutableStateFlow.setValue(iVJ.copy$default(mutableStateFlow.getValue(), null, false, false, true, 7, null));
        }
        return null;
    }

    public final void copydefault() {
        if (!C33129mqd.OLrzqt((CharSequence) this.KWHzl)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestRewardingAddressViewModel$pickConnectedBtcAddress$1(this, null), 3, null);
        } else {
            EZpvd(this.KWHzl, true);
        }
    }

    public static /* synthetic */ void onInputChange$default(InvestRewardingAddressViewModel investRewardingAddressViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        investRewardingAddressViewModel.EZpvd(str, z);
    }

    public final void EZpvd(String str, boolean z) {
        this.EZpvd.setValue(new iVJ(str, z, Intrinsics.EZpvd((Object) str, (Object) this.KWHzl), false));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super String> continuation) throws Throwable {
        InvestRewardingAddressViewModel$getConnectedBtcAddress$1 investRewardingAddressViewModel$getConnectedBtcAddress$1;
        long j;
        if (continuation instanceof InvestRewardingAddressViewModel$getConnectedBtcAddress$1) {
            investRewardingAddressViewModel$getConnectedBtcAddress$1 = (InvestRewardingAddressViewModel$getConnectedBtcAddress$1) continuation;
            int i = investRewardingAddressViewModel$getConnectedBtcAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investRewardingAddressViewModel$getConnectedBtcAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                investRewardingAddressViewModel$getConnectedBtcAddress$1 = new InvestRewardingAddressViewModel$getConnectedBtcAddress$1(this, continuation);
            }
        }
        Object objAwait = investRewardingAddressViewModel$getConnectedBtcAddress$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = investRewardingAddressViewModel$getConnectedBtcAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            Long lOLrzqt = OLrzqt();
            if (lOLrzqt != null) {
                long jLongValue = lOLrzqt.longValue();
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.OLrzqt.gEmmrt().KWHzl();
                investRewardingAddressViewModel$getConnectedBtcAddress$1.J$0 = jLongValue;
                investRewardingAddressViewModel$getConnectedBtcAddress$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, investRewardingAddressViewModel$getConnectedBtcAddress$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                j = jLongValue;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = investRewardingAddressViewModel$getConnectedBtcAddress$1.J$0;
        C56391yDq.AEQbTJ(objAwait);
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objAwait;
        for (Object obj : yDY.valueOf(interfaceC9738bbJ.copydefault(j, AddressType.Legacy.getValue()), interfaceC9738bbJ.copydefault(j, AddressType.P2SHCommonType.getValue()), interfaceC9738bbJ.copydefault(j, AddressType.P2SHType.getValue()))) {
            if (((String) obj).length() > 0) {
                return obj;
            }
        }
        return null;
    }

    public final Long OLrzqt() {
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.OLrzqt.copydefault().copydefault();
        if (interfaceC9731bbCCopydefault != null) {
            return Long.valueOf(interfaceC9731bbCCopydefault.fetchVPNInfo());
        }
        return null;
    }
}
