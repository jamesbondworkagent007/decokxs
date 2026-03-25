package com.okinc.unify_trade.bot.presenter;

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.Transformations;
import com.okinc.biz.StrategyType;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.ContractGridRelatedPosPresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54295xDc;
import o.C54308xDp;
import o.C54536xML;
import o.C54571xNh;
import o.C54589xNz;
import o.C55804xqp;
import o.C55893xsY;
import o.C55941xtT;
import o.C55969xtv;
import o.C56111xwe;
import o.C56215xyc;
import o.C56283xzr;
import o.C59449zhJ;
import o.InterfaceC54581xNr;
import o.xCZ;
import o.xKK;
import o.xMR;
import o.xMS;
import o.xMV;
import o.xUW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ContractGridRelatedPosPresenter extends AbsPresenter {
    public final C56215xyc AEQbTJ;
    public final LiveData<ArrayList<DetailsData>> AYXKKw;
    public final TradeLiveData<C55804xqp<List<StrategyPositionResponse>>> AhwBna;
    public final TradeLiveData<Pair<String, Integer>> AkhnZx;
    public final C56111xwe<List<ContractGridClosePositionData>> EZpvd;
    public final C56111xwe<List<ContractGridClosePositionData>> KWHzl;
    public StrategyDetailsResponse OLrzqt;
    public final C56283xzr copydefault;
    public final TradeLiveData<ArrayList<TransDetailsData>> djBIcL;
    public final C54295xDc gEmmrt;
    public final C54308xDp isConnected;
    public final xCZ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55804xqp<List<StrategyPositionResponse>>> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56283xzr AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Pair<String, Integer>> AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ContractGridClosePositionData>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<ContractGridClosePositionData>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyDetailsResponse OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        this.OLrzqt = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56215xyc copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ArrayList<DetailsData>> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCZ fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54295xDc gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ArrayList<TransDetailsData>> valueOf() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridRelatedPosPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.OLrzqt = new StrategyDetailsResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (ArrayList) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (ExtendedBusinessInfo) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, (TacticsVoucherInfo) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (Long) null, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnParam) null, (ArbitrageTotalPnlInfo) null, (Float) null, (String) null, false, (List) null, (String) null, (String) null, (GridProfitAutoReinvestResponse) null, (List) null, (StrategyProfitResponse) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (ProfitDetailResponse) null, (BalanceDetailInfoDto) null, (String) null, (BotVo) null, (StrategyDcaEditResp) null, (String) null, (String) null, (String) null, -1, -1, -1, -1, -1, -1, -1, 131071, (DefaultConstructorMarker) null);
        this.isConnected = new C54308xDp();
        this.AkhnZx = new TradeLiveData<>();
        this.copydefault = new C56283xzr();
        this.KWHzl = new C56111xwe<>();
        this.valueOf = new xCZ();
        this.djBIcL = new TradeLiveData<>();
        this.gEmmrt = new C54295xDc();
        TradeLiveData<C55804xqp<List<StrategyPositionResponse>>> tradeLiveData = new TradeLiveData<>();
        this.AhwBna = tradeLiveData;
        this.AYXKKw = Transformations.map(tradeLiveData, new Function1() { // from class: o.xur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractGridRelatedPosPresenter.KWHzl(this.OLrzqt, (C55804xqp) obj);
            }
        });
        this.AEQbTJ = new C56215xyc();
        this.EZpvd = new C56111xwe<>();
    }

    public final void values() {
        C54308xDp c54308xDp = this.isConnected;
        c54308xDp.OLrzqt(this.AkhnZx, new C55941xtT());
        c54308xDp.KWHzl(this.OLrzqt.getInstId());
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final void KWHzl(@NotNull ContractGridClosePositionReq contractGridClosePositionReq) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionReq, "");
        C56283xzr c56283xzr = this.copydefault;
        c56283xzr.AEQbTJ(this.KWHzl);
        c56283xzr.copydefault(contractGridClosePositionReq);
        xKK.Activity.execute$default(c56283xzr, 0L, 1, null);
    }

    public final void DbNXlk() {
        xCZ xcz = this.valueOf;
        xcz.OLrzqt(this.djBIcL, new C55893xsY());
        xcz.KWHzl(true);
        xcz.OLrzqt(new StrategyOrderBillDetailsReq(this.OLrzqt.getAlgoId(), "0", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.OLrzqt.getOrderType(), (String) null, 764, (DefaultConstructorMarker) null));
        xKK.Activity.execute$default(xcz, 0L, 1, null);
    }

    public static final ArrayList KWHzl(ContractGridRelatedPosPresenter contractGridRelatedPosPresenter, C55804xqp c55804xqp) {
        C55969xtv c55969xtv = new C55969xtv();
        c55969xtv.OLrzqt(contractGridRelatedPosPresenter.OLrzqt);
        Intrinsics.copydefault(c55804xqp);
        return c55969xtv.copydefault((C55804xqp<List<StrategyPositionResponse>>) c55804xqp);
    }

    public final void isConnected() {
        C54295xDc c54295xDc = this.gEmmrt;
        c54295xDc.AEQbTJ(this.AhwBna);
        c54295xDc.KWHzl(this.OLrzqt.getAlgoId());
        c54295xDc.EZpvd(this.OLrzqt.getOrderType());
        xKK.Activity.execute$default(c54295xDc, 0L, 1, null);
    }

    public final void AEQbTJ() {
        this.gEmmrt.AYXKKw();
    }

    public final void KWHzl(@NotNull ContractGridClosePositionData contractGridClosePositionData) {
        Intrinsics.checkNotNullParameter(contractGridClosePositionData, "");
        C56215xyc c56215xyc = this.AEQbTJ;
        c56215xyc.AEQbTJ(this.EZpvd);
        c56215xyc.copydefault(contractGridClosePositionData);
        xKK.Activity.execute$default(c56215xyc, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.isConnected, this.gEmmrt, this.AEQbTJ, this.valueOf, this.copydefault);
    }

    public final String KWHzl(StrategyPositionResponse strategyPositionResponse, @NotNull StrategyType strategyType, @NotNull String str, @NotNull String str2, @NotNull String str3) {
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
        String str5 = (strategyType != StrategyType.LIMIT ? (value = this.AkhnZx.getValue()) == null || (first = value.getFirst()) == null : abstractC54531xLwOLrzqt == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) == null || (first = xmsGEmmrt.valueOf(str)) == null) ? "" : first;
        if (str2.length() != 0 ? !(abstractC54531xLwOLrzqt == null || (c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null)) == null || (c54571xNhAhwBna = c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str5)) == null || (strEZpvd = c54571xNhAhwBna.EZpvd(str2)) == null) : (strEZpvd = KWHzl(strategyPositionResponse, str3)) != null) {
            str4 = strEZpvd;
        }
        String str6 = str4;
        if (str5.length() == 0 || Intrinsics.EZpvd((Object) str5, (Object) "0")) {
            return "--";
        }
        if (C33129mqd.OLrzqt((Object) str2, (Object) 0) && C33129mqd.OLrzqt((Object) str3, (Object) 0)) {
            return "--";
        }
        String strOLrzqt = OLrzqt(strategyPositionResponse.getPosSide(), strategyPositionResponse.getPos());
        if (Intrinsics.EZpvd((Object) strCopydefault, (Object) "linear") && Intrinsics.EZpvd((Object) strOLrzqt, (Object) "buy")) {
            strMulS$default = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getFutureContractVal(), str6, null, null, null, 14, null), suggestedInstrument$default.getFutureMult(), null, null, null, 14, null), C33129mqd.subS$default(str5, strategyPositionResponse.getAvgPx(), null, null, null, 14, null), null, null, null, 14, null);
        } else if (Intrinsics.EZpvd((Object) strCopydefault, (Object) "linear") && Intrinsics.EZpvd((Object) strOLrzqt, (Object) "sell")) {
            strMulS$default = C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getFutureContractVal(), str6, null, null, null, 14, null), suggestedInstrument$default.getFutureMult(), null, null, null, 14, null), C33129mqd.subS$default(strategyPositionResponse.getAvgPx(), str5, null, null, null, 14, null), null, null, null, 14, null);
        }
        return OLrzqt(strMulS$default, strategyPositionResponse);
    }

    public final String OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return Intrinsics.EZpvd((Object) str, (Object) "net") ? C33129mqd.AEQbTJ(str2) > AudioStats.AUDIO_AMPLITUDE_NONE ? "buy" : "sell" : str;
    }

    public final String OLrzqt(String str, StrategyPositionResponse strategyPositionResponse) {
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

    public final String KWHzl(StrategyPositionResponse strategyPositionResponse, String str) {
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
}
