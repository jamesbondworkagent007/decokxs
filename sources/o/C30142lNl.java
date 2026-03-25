package o;

import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C30142lNl extends lMT {
    public static final int KWHzl = com.okinc.okpaymentapi.data.remote.model.management.Channel.$stable;
    public final boolean AEQbTJ;
    public final com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.InterfaceC30133lNc
    public boolean ejfBZ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30133lNc
    public com.okinc.okpaymentapi.data.remote.model.management.Channel fARcdN() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.AEQbTJ;
    }

    public C30142lNl(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        Intrinsics.checkNotNullParameter(channel, "");
        this.EZpvd = channel;
        this.AEQbTJ = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String iwGUEr() {
        java.lang.String rangeForDisplay;
        Localization localization = fARcdN().getLocalization();
        if (localization != null) {
            rangeForDisplay = localization.getRangeForDisplay();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) rangeForDisplay)) {
                rangeForDisplay = null;
            }
            if (rangeForDisplay == null) {
                rangeForDisplay = localization.getLimitForDisplay();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) rangeForDisplay)) {
                    rangeForDisplay = null;
                }
            }
            if (rangeForDisplay == null) {
                rangeForDisplay = "";
            }
        }
        if (rangeForDisplay.length() == 0) {
            rangeForDisplay = pTB.formatLocalized$default(fARcdN().getMinLimitAmount(), null, 1, null) + " " + fARcdN().getQuoteCurrency() + " - " + pTB.formatLocalized$default(fARcdN().getMaxLimitAmount(), null, 1, null) + " " + fARcdN().getQuoteCurrency();
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.hlkKmr), C56423yEv.EZpvd(C56390yDp.OLrzqt("range", rangeForDisplay)));
    }

    public java.lang.String fIwbmz() {
        Localization localization = fARcdN().getLocalization();
        if (localization != null) {
            return localization.getFeeRateForDisplay();
        }
        return null;
    }

    public java.lang.String getNewProxyInstance() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DBxZfM);
    }

    @Override // o.InterfaceC30133lNc
    public java.util.List<AbstractC30156lNz> AuCTel() {
        return yDY.AhwBna();
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean gEmmrt() {
        if (!this.AEQbTJ) {
            double dAEQbTJ = C33129mqd.AEQbTJ(fARcdN().getQuoteAmount());
            if (C33129mqd.AEQbTJ(fARcdN().getMinLimitAmount()) > dAEQbTJ || dAEQbTJ > C33129mqd.AEQbTJ(fARcdN().getMaxLimitAmount())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    @Override // o.lMT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl() {
        java.lang.Object objKWHzl;
        if (gEmmrt()) {
            java.util.List listAhwBna = yDY.AhwBna(getNewProxyInstance());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fIwbmz())) {
                java.lang.String strFIwbmz = fIwbmz();
                Intrinsics.copydefault((java.lang.Object) strFIwbmz);
                listAhwBna.add(strFIwbmz);
            }
            if (fARcdN().getCategoryCode() == ChannelCategoryCode.NATIVE) {
                TradeLimit tradeLimit = fARcdN().getTradeLimit();
                if (tradeLimit == null || (objKWHzl = tradeLimit.getMaxChannelLimit()) == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) C33129mqd.gEmmrt(objKWHzl)))) {
                    objKWHzl = null;
                }
            } else if (fARcdN().getCategoryCode() != ChannelCategoryCode.BALANCE) {
                objKWHzl = C46876tfT.KWHzl(fARcdN());
            }
            if (objKWHzl != null) {
                listAhwBna.add(C33069mpW.copydefault(C31351lsQ.Activity.gUEfcq, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.prependFiatSymbol$default(C33129mqd.gEmmrt(objKWHzl), fARcdN().getQuoteCurrency(), fARcdN().getCurrencySymbol(), C38307pTy.Companion.AEQbTJ(2), null, false, 24, null)))));
            }
            return CollectionsKt___CollectionsKt.joinToString$default(listAhwBna, " • ", null, null, 0, null, null, 62, null);
        }
        return iwGUEr();
    }
}
