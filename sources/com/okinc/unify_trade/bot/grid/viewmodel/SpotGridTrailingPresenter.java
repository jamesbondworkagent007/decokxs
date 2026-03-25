package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54589xNz;
import o.C54782xVc;
import o.C55765xqC;
import o.C55887xsS;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMJ;
import o.xMR;
import o.xMS;
import o.xVA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SpotGridTrailingPresenter extends AbsPresenter {
    public boolean AEQbTJ;
    public TrailingPxResp AYXKKw;
    public boolean AhwBna;
    public C55887xsS EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public GridReq copydefault;
    public boolean djBIcL;
    public String gEmmrt;
    public TpSlTriggerParam valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.copydefault = gridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.EZpvd = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrailingPxResp values() {
        return this.AYXKKw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridTrailingPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        String strAYXKKw;
        super(application, savedStateHandle);
        String str = "";
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (value != null && (strAYXKKw = value.AYXKKw()) != null) {
            str = strAYXKKw;
        }
        this.gEmmrt = str;
    }

    public final GridReq valueOf() {
        GridReq gridReq = this.copydefault;
        if (gridReq != null) {
            return gridReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS djBIcL() {
        C55887xsS c55887xsS = this.EZpvd;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(Bundle bundle) {
        GridReq gridReq;
        boolean z;
        GridReq gridReq2;
        if (bundle == null || (gridReq2 = (GridReq) bundle.getParcelable("bot_grid_req")) == null || (gridReq = (GridReq) xVA.EZpvd(gridReq2)) == null) {
            gridReq = new GridReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        OLrzqt(gridReq);
        TrailingConfig trailingUpConfig = valueOf().getTrailingUpConfig();
        this.OLrzqt = trailingUpConfig != null ? trailingUpConfig.getStopPx() : null;
        TrailingConfig trailingDownConfig = valueOf().getTrailingDownConfig();
        this.KWHzl = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        this.AYXKKw = bundle != null ? (TrailingPxResp) bundle.getParcelable("trailing_default_px") : null;
        if (bundle != null) {
            z = bundle.getBoolean("disable_trailing_up");
        }
        this.AhwBna = z;
        OLrzqt(new C55887xsS(valueOf().getInstType(), valueOf().getInstId()));
        TpSlTriggerParamReqResp tpslTriggerParamReq = valueOf().getTpslTriggerParamReq();
        this.valueOf = tpslTriggerParamReq != null ? C55765xqC.OLrzqt(tpslTriggerParamReq) : null;
    }

    public final TrailingConfig EZpvd() {
        String stopTrailingUpPx;
        TrailingConfig trailingUpConfig = valueOf().getTrailingUpConfig();
        if (C33129mqd.AEQbTJ(trailingUpConfig != null ? trailingUpConfig.getStopPx() : null, 0)) {
            TrailingConfig trailingUpConfig2 = valueOf().getTrailingUpConfig();
            Intrinsics.copydefault(trailingUpConfig2);
            return trailingUpConfig2;
        }
        if (C33129mqd.AEQbTJ(this.OLrzqt, 0)) {
            stopTrailingUpPx = this.OLrzqt;
        } else {
            TrailingPxResp trailingPxResp = this.AYXKKw;
            if (trailingPxResp == null || (stopTrailingUpPx = trailingPxResp.getStopTrailingUpPx()) == null) {
                stopTrailingUpPx = "0";
            }
        }
        return new TrailingConfig(true, stopTrailingUpPx);
    }

    public final TrailingConfig KWHzl() {
        String stopTrailingDownPx;
        TrailingConfig trailingDownConfig = valueOf().getTrailingDownConfig();
        if (C33129mqd.AEQbTJ(trailingDownConfig != null ? trailingDownConfig.getStopPx() : null, 0)) {
            TrailingConfig trailingDownConfig2 = valueOf().getTrailingDownConfig();
            Intrinsics.copydefault(trailingDownConfig2);
            return trailingDownConfig2;
        }
        if (C33129mqd.AEQbTJ(this.KWHzl, 0)) {
            stopTrailingDownPx = this.KWHzl;
        } else {
            TrailingPxResp trailingPxResp = this.AYXKKw;
            if (trailingPxResp == null || (stopTrailingDownPx = trailingPxResp.getStopTrailingDownPx()) == null) {
                stopTrailingDownPx = "0";
            }
        }
        return new TrailingConfig(true, stopTrailingDownPx);
    }

    public final String AEQbTJ() {
        return djBIcL().AYXKKw();
    }

    public final String fetchVPNInfo() {
        xMS xmsGEmmrt;
        String strAkhnZx;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(djBIcL().djBIcL())) == null) {
            xmsGEmmrt = null;
        } else {
            String strValueOf = djBIcL().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strValueOf);
        }
        return (xmsGEmmrt == null || (strAkhnZx = xmsGEmmrt.AkhnZx(this.gEmmrt)) == null) ? "--" : strAkhnZx;
    }

    public final String AhwBna() {
        xMR xmr = xMR.copydefault;
        return xmr.copydefault(valueOf().getMinPx()) + " - " + xmr.copydefault(valueOf().getMaxPx()) + " " + AEQbTJ();
    }

    public final String isConnected() {
        TpSLTriggerItem tp;
        TpSLTriggerItem tp2;
        TpSLTriggerItem tp3;
        TpSlTriggerParam tpSlTriggerParam = this.valueOf;
        String value = null;
        String value2 = (tpSlTriggerParam == null || (tp3 = tpSlTriggerParam.getTp()) == null) ? null : tp3.getValue();
        if (value2 != null && !StringsKt__StringsKt.fARcdN((CharSequence) value2)) {
            TpSlTriggerParam tpSlTriggerParam2 = this.valueOf;
            if (Intrinsics.EZpvd((Object) ((tpSlTriggerParam2 == null || (tp2 = tpSlTriggerParam2.getTp()) == null) ? null : tp2.getIndicator()), (Object) SpotTpSlTypeConfigData.PRICE.getType())) {
                xMR xmr = xMR.copydefault;
                TpSlTriggerParam tpSlTriggerParam3 = this.valueOf;
                if (tpSlTriggerParam3 != null && (tp = tpSlTriggerParam3.getTp()) != null) {
                    value = tp.getValue();
                }
                Intrinsics.copydefault((Object) value);
                return xmr.copydefault(value) + " " + AEQbTJ();
            }
        }
        return null;
    }

    public final String AYXKKw() {
        TpSLTriggerItem sl;
        TpSLTriggerItem sl2;
        TpSLTriggerItem sl3;
        TpSlTriggerParam tpSlTriggerParam = this.valueOf;
        String value = null;
        String value2 = (tpSlTriggerParam == null || (sl3 = tpSlTriggerParam.getSl()) == null) ? null : sl3.getValue();
        if (value2 != null && !StringsKt__StringsKt.fARcdN((CharSequence) value2)) {
            TpSlTriggerParam tpSlTriggerParam2 = this.valueOf;
            if (Intrinsics.EZpvd((Object) ((tpSlTriggerParam2 == null || (sl2 = tpSlTriggerParam2.getSl()) == null) ? null : sl2.getIndicator()), (Object) SpotTpSlTypeConfigData.PRICE.getType())) {
                xMR xmr = xMR.copydefault;
                TpSlTriggerParam tpSlTriggerParam3 = this.valueOf;
                if (tpSlTriggerParam3 != null && (sl = tpSlTriggerParam3.getSl()) != null) {
                    value = sl.getValue();
                }
                Intrinsics.copydefault((Object) value);
                return xmr.copydefault(value) + " " + AEQbTJ();
            }
        }
        return null;
    }

    public final String AkhnZx() {
        String maxTrailingUpPx;
        StringBuilder sb;
        String maxPx = valueOf().getMaxPx();
        TrailingPxResp trailingPxResp = this.AYXKKw;
        if (trailingPxResp == null || (maxTrailingUpPx = trailingPxResp.getMaxTrailingUpPx()) == null) {
            maxTrailingUpPx = "";
        }
        xMR xmr = xMR.copydefault;
        String strCopydefault = xmr.copydefault(maxPx);
        String strCopydefault2 = xmr.copydefault(maxTrailingUpPx);
        if (C33129mqd.AEQbTJ(maxTrailingUpPx, maxPx)) {
            sb = new StringBuilder();
            sb.append(strCopydefault);
            sb.append("-");
            sb.append(strCopydefault2);
        } else {
            sb = new StringBuilder();
            sb.append(">");
            sb.append(strCopydefault);
        }
        return sb.toString();
    }

    public final String DbNXlk() {
        String minTrailingDownPx;
        StringBuilder sb;
        String str;
        TrailingPxResp trailingPxResp = this.AYXKKw;
        if (trailingPxResp == null || (minTrailingDownPx = trailingPxResp.getMinTrailingDownPx()) == null) {
            minTrailingDownPx = "0";
        }
        String minPx = valueOf().getMinPx();
        xMR xmr = xMR.copydefault;
        String strCopydefault = xmr.copydefault(minTrailingDownPx);
        String strCopydefault2 = xmr.copydefault(minPx);
        if (C33129mqd.gEmmrt(minTrailingDownPx, minPx)) {
            sb = new StringBuilder();
            sb.append(strCopydefault);
            str = "-";
        } else {
            sb = new StringBuilder();
            str = "<";
        }
        sb.append(str);
        sb.append(strCopydefault2);
        return sb.toString();
    }

    public final int gEmmrt() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String strFIwbmz;
        BizInstrument bizInstrumentAhwBna = djBIcL().AhwBna();
        if (bizInstrumentAhwBna != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            Integer numValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentAhwBna.getInstType())) == null || (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(bizInstrumentAhwBna.getInstFamily())) == null) ? null : Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 8;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
