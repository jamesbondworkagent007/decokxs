package com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54219xAh;
import o.C54571xNh;
import o.C54589xNz;
import o.C55887xsS;
import o.C56111xwe;
import o.C56402yEa;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xKK;
import o.xMS;
import o.xOW;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SmartIcebergPresenter extends BaseBotOrderPresenter {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = C56111xwe.AEQbTJ | C54219xAh.AEQbTJ;
    public final C56111xwe<List<StrategyResponse>> KWHzl;
    public final C54219xAh copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergPresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartIcebergPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C54219xAh();
        this.KWHzl = new C56111xwe<>();
    }

    public final void KWHzl(BizInstrument bizInstrument, @NotNull IceBergReq iceBergReq, @NotNull String str, String str2, Boolean bool, @NotNull yHO<? super String, ? super String, ? super String, Unit> yho, String str3, String str4, @NotNull Function2<? super StrategyReqGroup, ? super yHO<? super String, ? super String, ? super String, Unit>, Unit> function2) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (bizInstrument == null) {
            return;
        }
        StrategyReqGroup strategyReqGroup = new StrategyReqGroup(createBasePlaceOrderBean$default(this, bizInstrument, "smart_iceberg", str, str2, bool, null, str4, str3, null, 288, null), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null);
        strategyReqGroup.setIceBergReq(iceBergReq);
        if (copydefault()) {
            function2.invoke(strategyReqGroup, yho);
            yho.invoke("state_second_confirm", "smart_iceberg", "");
        } else {
            pUU.KWHzl("BotOrder", "二次确认功能关闭 SmartIceberg Start Order");
            copydefault(strategyReqGroup);
        }
    }

    public final void copydefault(@NotNull StrategyReqGroup strategyReqGroup) {
        String pxSpread;
        String strValueOf;
        String strKWHzl;
        AdvancedTriggerSign advancedTriggerSign;
        String strValueOf2;
        xMS xmsCopydefault;
        String strKWHzl2;
        String str = "";
        Intrinsics.checkNotNullParameter(strategyReqGroup, "");
        C54219xAh c54219xAh = this.copydefault;
        c54219xAh.EZpvd(strategyReqGroup.getBaseReq());
        IceBergReq iceBergReq = strategyReqGroup.getIceBergReq();
        if (iceBergReq != null) {
            String pxSpread2 = iceBergReq.getPxSpread();
            if (pxSpread2 == null || pxSpread2.length() == 0) {
                pxSpread = iceBergReq.getPxSpread();
            } else {
                xMS xmsCopydefault2 = fvQaOB().copydefault();
                if (xmsCopydefault2 != null) {
                    String pxSpread3 = iceBergReq.getPxSpread();
                    Intrinsics.copydefault((Object) pxSpread3);
                    pxSpread = xmsCopydefault2.valueOf(pxSpread3);
                } else {
                    pxSpread = null;
                }
            }
            iceBergReq.setPxSpread(pxSpread);
            xMS xmsCopydefault3 = fvQaOB().copydefault();
            if (xmsCopydefault3 == null || (strValueOf = xmsCopydefault3.valueOf(iceBergReq.getPxLimit())) == null) {
                strValueOf = "";
            }
            iceBergReq.setPxLimit(strValueOf);
            C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(fvQaOB(), null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default == null || (strKWHzl = c54571xNhCreateAmtConvert$default.KWHzl(iceBergReq.getSzLimit())) == null) {
                strKWHzl = "";
            }
            iceBergReq.setSzLimit(strKWHzl);
            C54571xNh c54571xNhCreateAmtConvert$default2 = C55887xsS.createAmtConvert$default(fvQaOB(), null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default2 != null && (strKWHzl2 = c54571xNhCreateAmtConvert$default2.KWHzl(iceBergReq.getSz())) != null) {
                str = strKWHzl2;
            }
            iceBergReq.setSz(str);
            ArrayList<AdvancedTriggerSign> triggerParams = iceBergReq.getTriggerParams();
            if (triggerParams != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(triggerParams)) != null) {
                if (!C33129mqd.AEQbTJ(advancedTriggerSign.getTriggerPx(), 0) || (xmsCopydefault = fvQaOB().copydefault()) == null) {
                    strValueOf2 = null;
                } else {
                    String triggerPx = advancedTriggerSign.getTriggerPx();
                    Intrinsics.copydefault((Object) triggerPx);
                    strValueOf2 = xmsCopydefault.valueOf(triggerPx);
                }
                advancedTriggerSign.setTriggerPx(strValueOf2);
            }
            iceBergReq.setTradeQuoteCcy(fvQaOB().AEQbTJ(strategyReqGroup.getBaseReq().getOrdType()));
            c54219xAh.EZpvd(iceBergReq);
        }
        c54219xAh.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public static /* synthetic */ StrategyBaseReq createBasePlaceOrderBean$default(SmartIcebergPresenter smartIcebergPresenter, BizInstrument bizInstrument, String str, String str2, String str3, Boolean bool, TradeType tradeType, String str4, String str5, Boolean bool2, int i, Object obj) {
        return smartIcebergPresenter.copydefault(bizInstrument, str, str2, str3, bool, (i & 32) != 0 ? null : tradeType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    public final StrategyBaseReq copydefault(BizInstrument bizInstrument, String str, String str2, String str3, Boolean bool, TradeType tradeType, String str4, String str5, Boolean bool2) {
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (TradeType) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        strategyBaseReq.setInstId(bizInstrument.getInstId());
        strategyBaseReq.setInstType(bizInstrument.getInstType());
        strategyBaseReq.setOrdType(str);
        strategyBaseReq.setTdMode(str4 == null ? "" : str4);
        strategyBaseReq.setSide(str2);
        strategyBaseReq.setPosSide(str3);
        strategyBaseReq.setCcy(str5);
        strategyBaseReq.setReduceOnly(bool);
        strategyBaseReq.setTradeType(tradeType);
        strategyBaseReq.setCxlOnClosePos(bool2);
        return strategyBaseReq;
    }

    public final boolean copydefault() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}
