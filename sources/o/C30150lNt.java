package o;

import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C30150lNt extends lMT {
    public static final int AEQbTJ = com.okinc.okpaymentapi.data.remote.model.management.Channel.$stable;
    public final boolean KWHzl;
    public final com.okinc.okpaymentapi.data.remote.model.management.Channel OLrzqt;

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
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.KWHzl;
    }

    public C30150lNt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        Intrinsics.checkNotNullParameter(channel, "");
        this.OLrzqt = channel;
        this.KWHzl = z;
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
            rangeForDisplay = pTB.formatLocalized$default(fARcdN().getMinLimitAmount(), null, 1, null) + " " + fARcdN().getBaseCurrency() + " - " + pTB.formatLocalized$default(fARcdN().getMaxLimitAmount(), null, 1, null) + " " + fARcdN().getBaseCurrency();
        }
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.gmHjFq), C56423yEv.EZpvd(C56390yDp.OLrzqt("range", rangeForDisplay)));
    }

    public java.lang.String fIwbmz() {
        Localization localization = fARcdN().getLocalization();
        if (localization != null) {
            return localization.getFeeRateForDisplay();
        }
        return null;
    }

    public java.lang.String hDKMBd() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DGOPHZDGOPHZ);
    }

    @Override // o.InterfaceC30133lNc
    public java.util.List<AbstractC30156lNz> AuCTel() {
        return yDY.AhwBna();
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean gEmmrt() {
        if (!this.KWHzl) {
            double dAEQbTJ = C33129mqd.AEQbTJ(fARcdN().getBaseAmount());
            if (C33129mqd.AEQbTJ(fARcdN().getMinLimitAmount()) > dAEQbTJ || dAEQbTJ > C33129mqd.AEQbTJ(fARcdN().getMaxLimitAmount())) {
                return false;
            }
        }
        return true;
    }

    @Override // o.lMT
    public java.lang.String KWHzl() {
        if (gEmmrt()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fIwbmz())) {
                return hDKMBd() + "•" + fIwbmz();
            }
            return hDKMBd();
        }
        return iwGUEr();
    }
}
