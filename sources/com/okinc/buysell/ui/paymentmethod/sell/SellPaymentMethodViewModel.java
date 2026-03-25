package com.okinc.buysell.ui.paymentmethod.sell;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.buysell.data.BannerFlowType;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.data.Icon;
import com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodViewModel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C31351lsQ;
import o.C31354lsT;
import o.C31434ltu;
import o.C31661lzi;
import o.C32989mnw;
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
public final class SellPaymentMethodViewModel extends lKH {
    public BannerFlowType dvKsVJ;
    public final lyM flVtFt;
    public String fvQaOB;
    public TradeType gGvvIC;
    public final lyX gasjUx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzT
    public String KWHzl() {
        return this.fvQaOB;
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
    public SellPaymentMethodViewModel(@NotNull lyX lyx, @NotNull lyM lym) {
        super(lyx, lym);
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.gasjUx = lyx;
        this.flVtFt = lym;
        this.gGvvIC = TradeType.SELL;
        this.fvQaOB = BannerPageNames.BUY_SELL_CHANNEL_SELECTION.getPageName();
        this.dvKsVJ = BannerFlowType.SELL;
    }

    public void KWHzl(@NotNull lKU lku) {
        Intrinsics.checkNotNullParameter(lku, "");
        lku.OLrzqt(DbNXlk(C31351lsQ.Activity.DcMfJKDGTeJD));
        lKU.updateEndIcon$default(lku, Icon.NO_ICON, null, 2, null);
        lku.AEQbTJ(Icon.BACK, new Function0() { // from class: o.lOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SellPaymentMethodViewModel.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final Unit AhwBna(SellPaymentMethodViewModel sellPaymentMethodViewModel) {
        mHA.OLrzqt.OLrzqt(sellPaymentMethodViewModel.gasjUx(), Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // o.lKH
    public void isConnected() {
        mHA.OLrzqt.OLrzqt(finit(), new C31434ltu(AwvSrB(), AubY(), TradeType.SELL, aKErDB(), zsXlph(), AuCTelauCTel(), QOLQEE(), zLjUOn(), sSMYrx(), OcIXYQ(), DTwDnp(), QKVWgx()));
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
        int i = C31351lsQ.Activity.DMb;
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
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SellPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1(this, null), 3, null);
    }

    @Override // o.lKH
    public TradeType UeEOUB() {
        return TradeType.SELL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(String str, String str2, String str3) {
        C31354lsT.KWHzl.KWHzl(TradeType.SELL, AubY(), AwvSrB(), ejfBZ(), C34754niS.AEQbTJ.KWHzl(), "fail", str2, str, str3);
    }
}
