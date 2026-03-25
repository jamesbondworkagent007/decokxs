package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.home.bean.WalletAddressActivityDetails;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C11600cUg;
import o.C33129mqd;
import o.C56390yDp;
import o.eWM;
import o.eWY;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileActivitiesViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final StateFlow<Pair<Boolean, List<eWM>>> AYXKKw;
    public final MutableSharedFlow<String> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableStateFlow<Pair<Boolean, List<eWM>>> OLrzqt;
    public final eWY copydefault;
    public final SharedFlow<String> djBIcL;
    public final SharedFlow<String> gEmmrt;
    public final SharedFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Boolean, List<eWM>>> copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public AddressProfileActivitiesViewModel(@NotNull eWY ewy) {
        Intrinsics.checkNotNullParameter(ewy, "");
        this.copydefault = ewy;
        MutableStateFlow<Pair<Boolean, List<eWM>>> MutableStateFlow = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt(Boolean.FALSE, null));
        this.OLrzqt = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, String str3, Integer num, String str4, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileActivitiesViewModel$getAddressProfileActivitiesList$1(this, str, str2, str3, num, str4, bool, z, null), 2, null);
    }

    public final eWM copydefault(WalletAddressActivityDetails walletAddressActivityDetails) {
        String strDbNXlk = walletAddressActivityDetails.DbNXlk();
        String str = strDbNXlk == null ? "" : strDbNXlk;
        String strIsConnected = walletAddressActivityDetails.isConnected();
        String str2 = strIsConnected == null ? "" : strIsConnected;
        String strAkhnZx = walletAddressActivityDetails.AkhnZx();
        String str3 = strAkhnZx == null ? "" : strAkhnZx;
        String strKWHzl = walletAddressActivityDetails.KWHzl();
        String str4 = strKWHzl == null ? "" : strKWHzl;
        String strFIwbmz = walletAddressActivityDetails.fIwbmz();
        String str5 = strFIwbmz == null ? "" : strFIwbmz;
        long jCopydefault = C11600cUg.copydefault(walletAddressActivityDetails.AEQbTJ());
        long jCopydefault2 = C11600cUg.copydefault(walletAddressActivityDetails.OLrzqt());
        String strEZpvd = walletAddressActivityDetails.EZpvd();
        String str6 = strEZpvd == null ? "" : strEZpvd;
        int iCopydefault = C11600cUg.copydefault(walletAddressActivityDetails.fJNWhG());
        String strCopydefault = walletAddressActivityDetails.copydefault();
        String str7 = strCopydefault == null ? "" : strCopydefault;
        String strGEmmrt = walletAddressActivityDetails.gEmmrt();
        String str8 = strGEmmrt == null ? "" : strGEmmrt;
        String strEjfBZ = walletAddressActivityDetails.ejfBZ();
        String str9 = strEjfBZ == null ? "" : strEjfBZ;
        String strValues = walletAddressActivityDetails.values();
        String str10 = strValues == null ? "" : strValues;
        String strDjBIcL = walletAddressActivityDetails.djBIcL();
        String str11 = strDjBIcL == null ? "" : strDjBIcL;
        String strValueOf = walletAddressActivityDetails.valueOf();
        String str12 = strValueOf == null ? "" : strValueOf;
        String strAYXKKw = walletAddressActivityDetails.AYXKKw();
        String str13 = strAYXKKw == null ? "" : strAYXKKw;
        String strAhwBna = walletAddressActivityDetails.AhwBna();
        return new eWM(str, str2, str3, str4, str5, jCopydefault, jCopydefault2, str6, iCopydefault, str7, str8, str9, str10, str11, str12, str13, strAhwBna == null ? "" : strAhwBna, null, C33129mqd.copydefault((Object) walletAddressActivityDetails.fetchVPNInfo(), (Object) 4), 131072, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileActivitiesViewModel$updateTypeFilters$1(this, str, null), 2, null);
    }
}
