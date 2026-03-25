package com.okinc.buysell.ui.paymentmethod.buy;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.Icon;
import com.okinc.buysell.ui.paymentmethod.buy.BuyPaymentMethodViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C31351lsQ;
import o.C31434ltu;
import o.C31661lzi;
import o.C32866mlf;
import o.C32868mlh;
import o.C32989mnw;
import o.C33129mqd;
import o.C34754niS;
import o.C56390yDp;
import o.C56423yEv;
import o.lKH;
import o.lKU;
import o.lyM;
import o.lyX;
import o.mHA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyPaymentMethodViewModel extends lKH {
    public BannerFlowType dvKsVJ;
    public String flVtFt;
    public TradeType gGvvIC;
    public final lyM gasjUx;
    public final lyX giSNqX;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public BannerFlowType copydefault() {
        return this.dvKsVJ;
    }

    @Override // o.lKH
    public void hUfVAv() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public BuyPaymentMethodViewModel(@NotNull lyX lyx, @NotNull lyM lym) {
        super(lyx, lym);
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.giSNqX = lyx;
        this.gasjUx = lym;
        this.gGvvIC = TradeType.BUY;
        this.flVtFt = BannerPageNames.BUY_SELL_CHANNEL_SELECTION.getPageName();
        this.dvKsVJ = BannerFlowType.BUY;
    }

    private final boolean EZpvd(String str, String str2) {
        return C33129mqd.copydefault((Object) C33129mqd.subS$default(str2, str, null, null, null, 14, null), (Object) 0);
    }

    public final void OqFWZa() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("EnterAmount_Balance_Next_Status", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuyPaymentMethodViewModel.AEQbTJ(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(BuyPaymentMethodViewModel buyPaymentMethodViewModel, EventParamsList eventParamsList) {
        String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "flow", "buy", false, 4, null);
        EventParamsList.put$default(eventParamsList, "token", buyPaymentMethodViewModel.AubY(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", buyPaymentMethodViewModel.AwvSrB(), false, 4, null);
        eventParamsList.put(OtcExtraKeys.MODE, C34754niS.AEQbTJ.KWHzl(), true);
        if (C33129mqd.AEQbTJ(buyPaymentMethodViewModel.fJNWhG()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            str = buyPaymentMethodViewModel.EZpvd(buyPaymentMethodViewModel.QbewEr(), buyPaymentMethodViewModel.fJNWhG()) ? "sufficient" : "insufficient";
        } else {
            str = "no_balance";
        }
        EventParamsList.put$default(eventParamsList, "balance_status", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.lKH
    public TradeType UeEOUB() {
        return TradeType.BUY;
    }

    public void OLrzqt(@NotNull lKU lku) {
        Intrinsics.checkNotNullParameter(lku, "");
        lku.OLrzqt(DbNXlk(C31351lsQ.Activity.UrRBLY));
        lKU.updateEndIcon$default(lku, Icon.NO_ICON, null, 2, null);
        lku.AEQbTJ(Icon.BACK, new Function0() { // from class: o.lLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BuyPaymentMethodViewModel.valueOf(this.copydefault);
            }
        });
    }

    public static final Unit valueOf(BuyPaymentMethodViewModel buyPaymentMethodViewModel) {
        mHA.OLrzqt.OLrzqt(buyPaymentMethodViewModel.gasjUx(), Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // o.lKH
    public void isConnected() {
        mHA.OLrzqt.OLrzqt(finit(), new C31434ltu(AwvSrB(), AubY(), TradeType.BUY, aKErDB(), zsXlph(), AuCTelauCTel(), QOLQEE(), zLjUOn(), sSMYrx(), OcIXYQ(), DTwDnp(), QKVWgx()));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    @Override // o.lKH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull String str, String str2) {
        Map<String, ? extends Object> mapEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<String>> mutableLiveDataFZBcTu = fZBcTu();
        int i = C31351lsQ.Activity.call;
        if (str2 != null) {
            mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.copydefault(str2, false) + " " + str));
            if (mapEZpvd == null) {
                mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "-- " + str));
            }
        }
        mha.OLrzqt(mutableLiveDataFZBcTu, KWHzl(i, mapEZpvd));
    }

    @Override // o.lKH
    public void RcXXUw() {
        mHA.OLrzqt.OLrzqt(dxcTrN(), Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1(this, null), 3, null);
    }
}
