package o;

import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOK implements gOU {
    public final V6BaseQuoteResponse AEQbTJ;

    @Override // o.InterfaceC19786gPg
    public java.lang.String valueOf() {
        return null;
    }

    public gOK(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        this.AEQbTJ = v6BaseQuoteResponse;
    }

    @Override // o.InterfaceC19784gPe
    public boolean values() {
        return this.AEQbTJ.isQuoteAmountNotEmpty();
    }

    @Override // o.InterfaceC19784gPe
    public boolean AkhnZx() {
        return this.AEQbTJ.isSingle();
    }

    @Override // o.InterfaceC19784gPe
    public boolean ejfBZ() {
        return this.AEQbTJ.showValueDiffWarn();
    }

    @Override // o.InterfaceC19784gPe
    public java.lang.String OLrzqt() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getCode();
        }
        return null;
    }

    @Override // o.InterfaceC19784gPe
    public java.lang.String AhwBna() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getErrorMsg();
        }
        return null;
    }

    @Override // o.InterfaceC19788gPi
    public DexMultiTokenInfoBean AYXKKw() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getFromToken();
        }
        return null;
    }

    @Override // o.InterfaceC19788gPi
    public DexMultiTokenInfoBean djBIcL() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getToToken();
        }
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public boolean isConnected() {
        return this.AEQbTJ.isOkxDexNotAvailableAnymore();
    }

    @Override // o.InterfaceC19786gPg
    public boolean fetchVPNInfo() {
        return this.AEQbTJ.isOKXPlatform();
    }

    @Override // o.InterfaceC19786gPg
    public java.lang.String EZpvd() {
        DefiPlatformInfo selectedDeFiPlatform = this.AEQbTJ.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            return selectedDeFiPlatform.getDiffPercent();
        }
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public java.lang.String AEQbTJ() {
        java.lang.String strKWHzl = KWHzl();
        java.lang.String strCopydefault = copydefault();
        if (strKWHzl == null || strCopydefault == null) {
            return null;
        }
        return C23313hvq.subCheckS$default(strKWHzl, strCopydefault, null, null, null, 14, null);
    }

    public java.lang.String KWHzl() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getFromTokenValue();
        }
        return null;
    }

    public java.lang.String copydefault() {
        DefiPlatformInfo selectedDeFiPlatform = this.AEQbTJ.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            return selectedDeFiPlatform.getToTokenValue();
        }
        return null;
    }

    @Override // o.InterfaceC19786gPg
    public java.lang.String DbNXlk() {
        CommonDexInfo commonDexInfo = this.AEQbTJ.getCommonDexInfo();
        if (commonDexInfo != null) {
            return commonDexInfo.getTradeTaxes();
        }
        return null;
    }
}
