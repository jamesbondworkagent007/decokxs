package com.okinc.buysell.ui.buysellconvert.transaction.buysell;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.model.SupportService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C31943mJr;
import o.C32989mnw;
import o.C3679AqW;
import o.C3682AqZ;
import o.C3722ArM;
import o.C3738Arc;
import o.C3760Ary;
import o.InterfaceC3712ArC;
import o.lzE;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellOrderDetailContentStateVariant;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderDetailViewModelV2 extends C31943mJr {
    public final MutableStateFlow<C3679AqW> AEQbTJ;
    public final StateFlow<C3679AqW> EZpvd;
    public final C3738Arc KWHzl;
    public final MutableLiveData<C32989mnw<Pair<SupportService, C3682AqZ>>> OLrzqt;
    public final Activity copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C3679AqW> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<SupportService, C3682AqZ>>> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public BuySellOrderDetailViewModelV2(@NotNull C3738Arc c3738Arc, @NotNull lzE lze) {
        Intrinsics.checkNotNullParameter(c3738Arc, "");
        Intrinsics.checkNotNullParameter(lze, "");
        this.KWHzl = c3738Arc;
        MutableStateFlow<C3679AqW> MutableStateFlow = StateFlowKt.MutableStateFlow(new C3679AqW(BuySellOrderDetailContentStateVariant.IDLE, null, ""));
        this.AEQbTJ = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        Activity activity = new Activity();
        this.copydefault = activity;
        this.OLrzqt = new MutableLiveData<>();
        C3722ArM.registerFormatter(lze);
        c3738Arc.EZpvd(activity);
    }

    public static final class Activity implements InterfaceC3712ArC {
        public Activity() {
        }

        @Override // o.InterfaceC3712ArC
        public void EZpvd(C3760Ary c3760Ary) {
            Intrinsics.checkNotNullParameter(c3760Ary, "");
            BuySellOrderDetailViewModelV2.this.AEQbTJ.setValue(c3760Ary.KWHzl());
        }
    }

    public final void OLrzqt(@NotNull String str, @NotNull BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        this.KWHzl.copydefault(str, buySellTradeType);
    }

    public final void OLrzqt() {
        this.KWHzl.KWHzl();
    }

    public final void AEQbTJ() {
        this.KWHzl.copydefault();
    }

    public final void copydefault() {
        this.KWHzl.OLrzqt();
    }

    public final void copydefault(@NotNull C3682AqZ c3682AqZ) {
        Intrinsics.checkNotNullParameter(c3682AqZ, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellOrderDetailViewModelV2$initSupportService$1(c3682AqZ, this, null), 3, null);
    }
}
