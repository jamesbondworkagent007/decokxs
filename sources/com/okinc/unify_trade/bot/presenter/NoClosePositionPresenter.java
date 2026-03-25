package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.biz.StrategyType;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.biz.subscribe.TradeHisPostionData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54308xDp;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55941xtT;
import o.C56111xwe;
import o.C56215xyc;
import o.C56283xzr;
import o.C59449zhJ;
import o.InterfaceC54581xNr;
import o.xCR;
import o.xCW;
import o.xKK;
import o.xMR;
import o.xMS;
import o.xMV;
import o.xUW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class NoClosePositionPresenter extends AbsPresenter {
    public final C56215xyc AEQbTJ;
    public final TradeLiveData<List<StrategyOrderBillDetailsResponse>> AYXKKw;
    public final TradeLiveData<Pair<String, Integer>> AhwBna;
    public final xCR EZpvd;
    public StrategyDetailsResponse KWHzl;
    public final C56111xwe<List<ContractGridClosePositionData>> OLrzqt;
    public final TradeLiveData<List<TradeHisPostionData>> copydefault;
    public final xCW djBIcL;
    public final C56283xzr gEmmrt;
    public final C54308xDp valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyOrderBillDetailsResponse>> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56215xyc EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.KWHzl = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ContractGridClosePositionData>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<TradeHisPostionData>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCR copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCW djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, Integer>> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56283xzr valueOf() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoClosePositionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.valueOf = new C54308xDp();
        this.AhwBna = new TradeLiveData<>();
        this.djBIcL = new xCW();
        this.AYXKKw = new TradeLiveData<>();
        this.gEmmrt = new C56283xzr();
        this.AEQbTJ = new C56215xyc();
        this.EZpvd = new xCR();
        this.copydefault = new TradeLiveData<>();
        this.OLrzqt = new C56111xwe<>();
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        xCR xcr = this.EZpvd;
        xcr.AEQbTJ(str);
        xcr.KWHzl(str2);
        xcr.copydefault(str3);
        xcr.AEQbTJ(this.copydefault);
        xKK.Activity.execute$default(xcr, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull ContractGridClosePositionData contractGridClosePositionData, boolean z) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionData, "");
        C56215xyc c56215xyc = this.AEQbTJ;
        c56215xyc.EZpvd(z);
        c56215xyc.AEQbTJ(this.OLrzqt);
        c56215xyc.copydefault(contractGridClosePositionData);
        xKK.Activity.execute$default(c56215xyc, 0L, 1, null);
    }

    public final void AhwBna() {
        xCW xcw = this.djBIcL;
        xcw.AEQbTJ(this.AYXKKw);
        xcw.EZpvd(this.KWHzl.getAlgoId());
        xKK.Activity.execute$default(xcw, 0L, 1, null);
    }

    public final void DbNXlk() {
        C54308xDp c54308xDp = this.valueOf;
        c54308xDp.OLrzqt(this.AhwBna, new C55941xtT());
        c54308xDp.KWHzl(this.KWHzl.getInstId());
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final String EZpvd(StrategyPositionResponse strategyPositionResponse, @NotNull StrategyType strategyType, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        String instFamily;
        Pair<String, Integer> value;
        String first;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        C54571xNh c54571xNhAhwBna;
        String strEZpvd;
        xMS xmsGEmmrt;
        String str4 = "";
        Intrinsics.checkNotNullParameter(strategyType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String strMulS$default = "--";
        if (strategyPositionResponse == null) {
            return "--";
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(strategyPositionResponse.getInstType()) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), null, null, 12, null) : null;
        String strCopydefault = (suggestedInstrument$default == null || abstractC54531xLwOLrzqt == null) ? null : abstractC54531xLwOLrzqt.copydefault(suggestedInstrument$default);
        if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        String str5 = (strategyType != StrategyType.LIMIT ? (value = this.AhwBna.getValue()) == null || (first = value.getFirst()) == null : abstractC54531xLwOLrzqt == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) == null || (first = xmsGEmmrt.valueOf(str)) == null) ? "" : first;
        if (str2.length() != 0 ? !(abstractC54531xLwOLrzqt == null || (c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null)) == null || (c54571xNhAhwBna = c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str5)) == null || (strEZpvd = c54571xNhAhwBna.EZpvd(str2)) == null) : (strEZpvd = AEQbTJ(strategyPositionResponse, str3)) != null) {
            str4 = strEZpvd;
        }
        String str6 = str4;
        if (str5.length() == 0 || Intrinsics.EZpvd((Object) str5, (Object) "0")) {
            return "--";
        }
        if (C33129mqd.OLrzqt((Object) str2, (Object) 0) && C33129mqd.OLrzqt((Object) str3, (Object) 0)) {
            return "--";
        }
        String strEZpvd2 = EZpvd(strategyPositionResponse.getPosSide(), strategyPositionResponse.getPos());
        if (Intrinsics.EZpvd((Object) strCopydefault, (Object) "linear") && Intrinsics.EZpvd((Object) strEZpvd2, (Object) "buy")) {
            strMulS$default = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getFutureContractVal(), str6, null, null, null, 14, null), suggestedInstrument$default.getFutureMult(), null, null, null, 14, null), C33129mqd.subS$default(str5, strategyPositionResponse.getAvgPx(), null, null, null, 14, null), null, null, null, 14, null);
        } else if (Intrinsics.EZpvd((Object) strCopydefault, (Object) "linear") && Intrinsics.EZpvd((Object) strEZpvd2, (Object) "sell")) {
            strMulS$default = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getFutureContractVal(), str6, null, null, null, 14, null), suggestedInstrument$default.getFutureMult(), null, null, null, 14, null), C33129mqd.subS$default(strategyPositionResponse.getAvgPx(), str5, null, null, null, 14, null), null, null, null, 14, null);
        }
        return KWHzl(strMulS$default, strategyPositionResponse);
    }

    public final String EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return Intrinsics.EZpvd((Object) str, (Object) "net") ? C33129mqd.AEQbTJ(str2) > AudioStats.AUDIO_AMPLITUDE_NONE ? "buy" : "sell" : str;
    }

    private final String KWHzl(String str, StrategyPositionResponse strategyPositionResponse) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMV xmvCreateProfitConverterWithIndex$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        String safeString$default;
        if (str.length() == 0 || strategyPositionResponse == null) {
            return "--" + (strategyPositionResponse != null ? strategyPositionResponse.getCcy() : null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        String strAEQbTJ = xUW.KWHzl.AEQbTJ(strategyPositionResponse.getInstId());
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strategyPositionResponse.getInstType())) != null && (xmvCreateProfitConverterWithIndex$default = AbstractC54531xLw.createProfitConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null)) != null && (c54536xMLCopydefault = xmvCreateProfitConverterWithIndex$default.copydefault(str)) != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null && (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
            return safeString$default;
        }
        return "--" + strategyPositionResponse.getCcy();
    }

    public final String AEQbTJ(StrategyPositionResponse strategyPositionResponse, String str) {
        String str2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String strGEmmrt = null;
        if (strategyPositionResponse == null) {
            return null;
        }
        String strReplaceFirst$default = C59449zhJ.replaceFirst$default(strategyPositionResponse.getPos(), "-", "", false, 4, (Object) null);
        String strMulS$default = C33129mqd.mulS$default(str, strReplaceFirst$default, null, null, null, 14, null);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), null, null, 12, null) : null;
        if (C33129mqd.AEQbTJ(strMulS$default) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(strategyPositionResponse.getInstType())) != null) {
                strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(suggestedInstrument$default);
            }
            if (Intrinsics.EZpvd((Object) strGEmmrt, (Object) "1")) {
                if (C33129mqd.AhwBna(strategyPositionResponse.getPos()) == 0) {
                    strReplaceFirst$default = "0";
                } else if (suggestedInstrument$default == null || (strReplaceFirst$default = suggestedInstrument$default.getLotSize()) == null) {
                    strReplaceFirst$default = "1";
                }
            }
            str2 = strReplaceFirst$default;
        } else {
            str2 = strMulS$default;
        }
        return xMR.formatContractAmount$default(xMR.copydefault, str2, suggestedInstrument$default, false, null, 12, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AEQbTJ, this.djBIcL, this.valueOf, this.gEmmrt, this.EZpvd);
    }
}
