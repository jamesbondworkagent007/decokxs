package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.math.RoundingMode;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54507xKz;
import o.C54536xML;
import o.C54589xNz;
import o.C54782xVc;
import o.C56045xvR;
import o.C56111xwe;
import o.C56185xxz;
import o.C56235xyw;
import o.InterfaceC54581xNr;
import o.pUU;
import o.vDY;
import o.xBG;
import o.xKK;
import o.xMJ;
import o.xMV;
import o.xOW;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ContractDcaBasePresenter extends BaseBotOrderPresenter {
    public final C56111xwe<StrategyResponse> AEQbTJ;
    public final C56185xxz AhwBna;
    public final TradeLiveData<ContractDcaAdvancedParams> EZpvd;
    public final TradeLiveData<String> KWHzl;
    public TradeLiveData<LimitPriceData> OLrzqt;
    public final C56235xyw copydefault;
    public final xBG djBIcL;
    public final TradeLiveData<StrategyConfigInfo> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<LimitPriceData> AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56185xxz AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractDcaAdvancedParams> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBG djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<StrategyResponse> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> valueOf() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaBasePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AhwBna = new C56185xxz();
        this.AEQbTJ = new C56111xwe<>();
        this.copydefault = new C56235xyw();
        this.gEmmrt = new TradeLiveData<>();
        this.djBIcL = new xBG();
        this.OLrzqt = new TradeLiveData<>();
        this.KWHzl = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
    }

    private final String DbNXlk() {
        ContractDcaAdvancedParams value = this.EZpvd.getValue();
        DcaTriggerParam dcaTriggerParamEZpvd = value != null ? value.EZpvd() : null;
        return Intrinsics.EZpvd((Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.PRICE.getMode()) ? dcaTriggerParamEZpvd.getTriggerPx() : "";
    }

    public final void EZpvd(@NotNull final DcaOrderReq dcaOrderReq, @NotNull FragmentManager fragmentManager) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            vDY.Companion.AEQbTJ(dcaOrderReq, fragmentManager, new Function0() { // from class: o.vBZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ContractDcaBasePresenter.OLrzqt(this.copydefault, dcaOrderReq);
                }
            });
        } else {
            pUU.KWHzl("BotOrder", "二次确认功能关闭 ContractDca Start Order");
            OLrzqt(dcaOrderReq);
        }
    }

    public static final Unit OLrzqt(ContractDcaBasePresenter contractDcaBasePresenter, DcaOrderReq dcaOrderReq) {
        pUU.KWHzl("BotOrder", "二次确认功能开启 ContractDca Start Order");
        contractDcaBasePresenter.OLrzqt(dcaOrderReq);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(DcaOrderReq dcaOrderReq) {
        C56185xxz c56185xxz = this.AhwBna;
        c56185xxz.copydefault(dcaOrderReq);
        c56185xxz.djBIcL();
        c56185xxz.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56185xxz, 0L, 1, null);
    }

    public final void AEQbTJ() {
        C56235xyw c56235xyw = this.copydefault;
        c56235xyw.KWHzl("contract_dca");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.gEmmrt, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void EZpvd() {
        xBG xbg = this.djBIcL;
        xbg.copydefault(fvQaOB().gEmmrt());
        xbg.AEQbTJ(this.OLrzqt);
        xKK.Activity.execute$default(xbg, 0L, 1, null);
    }

    public static /* synthetic */ String handlePrecisionAmt$default(ContractDcaBasePresenter contractDcaBasePresenter, String str, RoundingMode roundingMode, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePrecisionAmt");
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return contractDcaBasePresenter.EZpvd(str, roundingMode);
    }

    public final String EZpvd(String str, @NotNull RoundingMode roundingMode) {
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLAuCTel;
        String safeString$default;
        C54536xML c54536xMLCopydefault;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        xMV xmvKWHzl = fvQaOB().KWHzl();
        if (xmvKWHzl != null) {
            if (str == null) {
                str = "";
            }
            c54536xMLOLrzqt = xmvKWHzl.OLrzqt(str);
        } else {
            c54536xMLOLrzqt = null;
        }
        if (roundingMode == RoundingMode.DOWN) {
            if (c54536xMLOLrzqt == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) {
                return "";
            }
        } else if (c54536xMLOLrzqt == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
            return "";
        }
        return safeString$default;
    }

    public final String AEQbTJ(@NotNull DcaOrderReq dcaOrderReq) {
        String strDivS$default;
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        String strKWHzl = KWHzl(dcaOrderReq.getLever(), dcaOrderReq.getDirection());
        String strKWHzl2 = KWHzl(dcaOrderReq.getPxSteps(), dcaOrderReq.getPxStepsMult(), dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult(), dcaOrderReq.getLever(), dcaOrderReq.getDirection());
        if (C33129mqd.valueOf(strKWHzl, 0) || C33129mqd.valueOf(strKWHzl2, 0)) {
            return "";
        }
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        String strAEQbTJ = c56045xvR.AEQbTJ(dcaOrderReq.getInitOrdPct(), dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult());
        if (C33129mqd.gEmmrt(C33129mqd.divS$default(strKWHzl2, strKWHzl, null, null, null, 14, null), strAEQbTJ)) {
            strDivS$default = strKWHzl;
            strKWHzl2 = C33129mqd.mulS$default(strDivS$default, strAEQbTJ, null, null, null, 14, null);
        } else {
            strDivS$default = C33129mqd.divS$default(strKWHzl2, strAEQbTJ, null, null, null, 14, null);
        }
        return C33129mqd.addS$default(strDivS$default, c56045xvR.copydefault(strKWHzl2, dcaOrderReq.getMaxSafetyOrds(), dcaOrderReq.getVolMult()), null, null, null, 14, null);
    }

    public final ArrayList<ExplainItemModel> OLrzqt(@NotNull Context context, @NotNull ArrayList<Integer> arrayList, @NotNull ArrayList<Integer> arrayList2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        ArrayList<ExplainItemModel> arrayList3 = new ArrayList<>();
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i < arrayList2.size()) {
                String string = context.getString(iIntValue);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Integer num = arrayList2.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "");
                String string2 = context.getString(num.intValue());
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList3.add(new ExplainItemModel(string, string2));
            }
            i++;
        }
        return arrayList3;
    }

    public static /* synthetic */ String calculateMinInitOrder$default(ContractDcaBasePresenter contractDcaBasePresenter, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateMinInitOrder");
        }
        if ((i & 2) != 0) {
            str2 = contractDcaBasePresenter.KWHzl.getValue();
        }
        return contractDcaBasePresenter.KWHzl(str, str2);
    }

    public final String KWHzl(String str, String str2) {
        LimitPriceData value = this.OLrzqt.getValue();
        String buyLmt = value != null ? value.getBuyLmt() : null;
        LimitPriceData value2 = this.OLrzqt.getValue();
        String sellLmt = value2 != null ? value2.getSellLmt() : null;
        xMJ.Application value3 = C54782xVc.AEQbTJ.AhwBna().getValue();
        String strOLrzqt = value3 != null ? value3.OLrzqt() : null;
        if (!Intrinsics.EZpvd((Object) str2, (Object) "long")) {
            buyLmt = C33129mqd.gEmmrt(Double.valueOf(Math.max(C33129mqd.AEQbTJ(sellLmt), C33129mqd.AEQbTJ(strOLrzqt))));
        }
        if (C33129mqd.AEQbTJ(DbNXlk(), 0)) {
            buyLmt = DbNXlk();
        }
        return EZpvd(buyLmt, str);
    }

    public final String KWHzl(String str, String str2, String str3, String str4, String str5, String str6) {
        BotRangeConfig maxSafetyOrds;
        int iAhwBna = C33129mqd.AhwBna(str3);
        StrategyConfigInfo value = this.gEmmrt.getValue();
        String strAYXKKw = null;
        String max = (value == null || (maxSafetyOrds = value.getMaxSafetyOrds()) == null) ? null : maxSafetyOrds.getMax();
        if (max == null || max.length() == 0) {
            max = "2147483647";
        }
        int iMin = Math.min(iAhwBna, C33129mqd.AhwBna(max));
        if (C33129mqd.AEQbTJ(DbNXlk(), 0)) {
            strAYXKKw = DbNXlk();
        } else {
            xMJ.Application value2 = C54782xVc.AEQbTJ.AhwBna().getValue();
            if (value2 != null) {
                strAYXKKw = value2.AYXKKw();
            }
        }
        String strMulS$default = strAYXKKw;
        if (!Intrinsics.EZpvd((Object) str6, (Object) "long") && !C33129mqd.valueOf(str, 0) && !C33129mqd.valueOf(str2, 0) && !C33129mqd.valueOf(Integer.valueOf(iMin), 0)) {
            strMulS$default = C33129mqd.mulS$default(strMulS$default, C33129mqd.addS$default(1, C56045xvR.KWHzl.EZpvd(str, C33129mqd.gEmmrt(Integer.valueOf(iMin)), str2), null, null, null, 14, null), null, null, null, 14, null);
        }
        String strEZpvd = EZpvd(strMulS$default, str5);
        return C33129mqd.gEmmrt(Double.valueOf(Math.max(C33129mqd.AEQbTJ(strEZpvd), C33129mqd.AEQbTJ(C33129mqd.divS$default(strEZpvd, Double.valueOf(Math.pow(C33129mqd.AEQbTJ(str4), iMin - 1)), null, null, null, 14, null)))));
    }

    public final String EZpvd(String str, String str2) {
        BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
        SwapInstrument swapInstrument = bizInstrumentAhwBna instanceof SwapInstrument ? (SwapInstrument) bizInstrumentAhwBna : null;
        if (swapInstrument == null) {
            return "";
        }
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        String minSize = swapInstrument.getMinSize();
        String ctVal = swapInstrument.getCtVal();
        StrategyConfigInfo value = this.gEmmrt.getValue();
        return c56045xvR.AEQbTJ(minSize, ctVal, str, str2, value != null ? value.getMarginBuffer() : null);
    }
}
