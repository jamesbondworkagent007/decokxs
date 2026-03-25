package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54308xDp;
import o.C54507xKz;
import o.C54589xNz;
import o.C55688xof;
import o.C55941xtT;
import o.C56152xxS;
import o.C56235xyw;
import o.C56390yDp;
import o.C56402yEa;
import o.C56424yEw;
import o.InterfaceC54581xNr;
import o.xKK;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractDcaStartConditionPresenter extends AbsPresenter {
    public final TradeLiveData<StrategyConfigInfo> AEQbTJ;
    public final C54308xDp AYXKKw;
    public final C56152xxS EZpvd;
    public TacticsData KWHzl;
    public final TradeLiveData<StrategyResponse> OLrzqt;
    public final C56235xyw copydefault;
    public final TradeLiveData<Pair<String, Integer>> djBIcL;
    public DcaTriggerParam gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(DcaTriggerParam dcaTriggerParam) {
        this.gEmmrt = dcaTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56152xxS copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TacticsData tacticsData) {
        this.KWHzl = tacticsData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaStartConditionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56235xyw();
        this.AEQbTJ = new TradeLiveData<>();
        this.AYXKKw = new C54308xDp();
        this.djBIcL = new TradeLiveData<>();
        this.EZpvd = new C56152xxS();
        this.OLrzqt = new TradeLiveData<>();
    }

    public final DcaTriggerParam djBIcL() {
        List<DcaTriggerParam> triggerParams;
        DcaTriggerParam dcaTriggerParam = this.gEmmrt;
        if (dcaTriggerParam != null) {
            return dcaTriggerParam;
        }
        TacticsData tacticsData = this.KWHzl;
        Object obj = null;
        if (tacticsData == null || (triggerParams = tacticsData.getTriggerParams()) == null) {
            return null;
        }
        Iterator<T> it = triggerParams.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
            if (Intrinsics.EZpvd((Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (Object) TtmlNode.START)) {
                obj = next;
                break;
            }
        }
        return (DcaTriggerParam) obj;
    }

    public final String EZpvd() {
        TacticsData tacticsData = this.KWHzl;
        if (tacticsData != null) {
            return tacticsData.getDirection();
        }
        return null;
    }

    public final BizInstrument KWHzl() {
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        TacticsData tacticsData = this.KWHzl;
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.KWHzl;
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
    }

    public final int AhwBna() {
        String instType;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsData = this.KWHzl;
            String str = "";
            if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentKWHzl = KWHzl();
                if (bizInstrumentKWHzl != null && (instFamily = bizInstrumentKWHzl.getInstFamily()) != null) {
                    str = instFamily;
                }
                String strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                if (strFIwbmz != null) {
                    return C33129mqd.AhwBna(strFIwbmz);
                }
            }
        }
        return 8;
    }

    public final DcaTriggerParam AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DcaTriggerParam dcaTriggerParamDjBIcL = djBIcL();
        String triggerStrategy = dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerStrategy() : null;
        DcaTriggerParam dcaTriggerParamDjBIcL2 = djBIcL();
        String str2 = Intrinsics.EZpvd((Object) (dcaTriggerParamDjBIcL2 != null ? dcaTriggerParamDjBIcL2.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.PRICE.getMode()) ? str : "";
        DcaTriggerParam dcaTriggerParamDjBIcL3 = djBIcL();
        String strEZpvd = EZpvd(dcaTriggerParamDjBIcL3 != null ? dcaTriggerParamDjBIcL3.getThold() : null);
        DcaTriggerParam dcaTriggerParamDjBIcL4 = djBIcL();
        String strEZpvd2 = EZpvd(dcaTriggerParamDjBIcL4 != null ? dcaTriggerParamDjBIcL4.getTimePeriod() : null);
        DcaTriggerParam dcaTriggerParamDjBIcL5 = djBIcL();
        String strEZpvd3 = EZpvd(dcaTriggerParamDjBIcL5 != null ? dcaTriggerParamDjBIcL5.getTimeframe() : null);
        DcaTriggerParam dcaTriggerParamDjBIcL6 = djBIcL();
        return new DcaTriggerParam(TtmlNode.START, triggerStrategy, EZpvd(dcaTriggerParamDjBIcL6 != null ? dcaTriggerParamDjBIcL6.getTriggerCond() : null), str2, strEZpvd, (String) null, strEZpvd2, strEZpvd3, (String) null, (String) null, 800, (DefaultConstructorMarker) null);
    }

    public final String EZpvd(String str) {
        DcaTriggerParam dcaTriggerParamDjBIcL = djBIcL();
        return Intrinsics.EZpvd((Object) (dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.RSI.getMode()) ? str : "";
    }

    public final void OLrzqt() {
        String instId;
        C56235xyw c56235xyw = this.copydefault;
        c56235xyw.KWHzl("contract_dca");
        TacticsData tacticsData = this.KWHzl;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            instId = "";
        }
        c56235xyw.AEQbTJ(instId);
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void valueOf() {
        String instId;
        C54308xDp c54308xDp = this.AYXKKw;
        TacticsData tacticsData = this.KWHzl;
        if (tacticsData == null || (instId = tacticsData.getInstId()) == null) {
            instId = "";
        }
        c54308xDp.KWHzl(instId);
        c54308xDp.OLrzqt(this.djBIcL, new C55941xtT());
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56152xxS c56152xxS = this.EZpvd;
        TacticsData tacticsData = this.KWHzl;
        c56152xxS.copydefault(new EditContractDcaReq(tacticsData != null ? tacticsData.getAlgoId() : null, C56402yEa.EZpvd(AEQbTJ(str)), null, null, null, null, null, null, null, null, null, false, null, 8188, null));
        c56152xxS.djBIcL();
        c56152xxS.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56152xxS, 0L, 1, null);
    }

    public final Pair<Boolean, String> copydefault(@NotNull String str) {
        String quoteSymbol;
        String priceTriggerMult;
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        StrategyConfigInfo value = this.AEQbTJ.getValue();
        if (value != null && (priceTriggerMult = value.getPriceTriggerMult()) != null) {
            Pair<String, Integer> value2 = this.djBIcL.getValue();
            strMulS$default = C33129mqd.mulS$default(priceTriggerMult, value2 != null ? value2.getFirst() : null, null, null, null, 14, null);
        }
        String s$default = C33129mqd.formatS$default(strMulS$default, Integer.valueOf(AhwBna()), null, RoundingMode.DOWN, 2, null);
        Pair pairOLrzqt = C33129mqd.valueOf(str, 0) ? C56390yDp.OLrzqt(Integer.valueOf(C55688xof.Application.ActivityResultContractsPickVisualMedia), "0") : C56390yDp.OLrzqt(Integer.valueOf(C55688xof.Application.isGmsPickerAvailableactivity_release), s$default);
        boolean z = C33129mqd.AEQbTJ(str, 0) && (C33129mqd.valueOf(s$default, 0) || C33129mqd.gEmmrt(str, s$default));
        int iIntValue = ((Number) pairOLrzqt.getFirst()).intValue();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActionBar));
        pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault((String) pairOLrzqt.getSecond()));
        BizInstrument bizInstrumentKWHzl = KWHzl();
        if (bizInstrumentKWHzl != null && (quoteSymbol = bizInstrumentKWHzl.getQuoteSymbol()) != null) {
            str2 = quoteSymbol;
        }
        pairArr[2] = C56390yDp.OLrzqt("unit", str2);
        return C56390yDp.OLrzqt(Boolean.valueOf(z), C33069mpW.copydefault(iIntValue, C56424yEw.gEmmrt(pairArr)));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.copydefault, this.AYXKKw, this.EZpvd);
    }
}
