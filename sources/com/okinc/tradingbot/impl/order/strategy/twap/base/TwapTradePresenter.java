package com.okinc.tradingbot.impl.order.strategy.twap.base;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.biz.TradeType;
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
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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

/* JADX INFO: loaded from: classes19.dex */
public final class TwapTradePresenter extends BaseBotOrderPresenter {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = C56111xwe.AEQbTJ | C54219xAh.AEQbTJ;
    public final C54219xAh AEQbTJ;
    public final C56111xwe<List<StrategyResponse>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<StrategyResponse>> OLrzqt() {
        return this.OLrzqt;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.twap.base.TwapTradePresenter.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapTradePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AEQbTJ = new C54219xAh();
        this.OLrzqt = new C56111xwe<>();
    }

    public final void AEQbTJ(BizInstrument bizInstrument, @NotNull TwapReq twapReq, @NotNull String str, String str2, Boolean bool, String str3, String str4, @NotNull yHO<? super String, ? super String, ? super String, Unit> yho, @NotNull Function2<? super StrategyReqGroup, ? super yHO<? super String, ? super String, ? super String, Unit>, Unit> function2) {
        Intrinsics.checkNotNullParameter(twapReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (bizInstrument == null) {
            return;
        }
        StrategyReqGroup strategyReqGroup = new StrategyReqGroup(createBasePlaceOrderBean$default(this, bizInstrument, "twap", str, str2, bool, null, str4, str3, null, 288, null), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32766, (DefaultConstructorMarker) null);
        strategyReqGroup.setTwapReq(twapReq);
        if (copydefault()) {
            function2.invoke(strategyReqGroup, yho);
            yho.invoke("state_second_confirm", "twap", "");
        } else {
            pUU.KWHzl("BotOrder", "二次确认功能关闭 TwapTrade Start Order");
            OLrzqt(strategyReqGroup);
        }
    }

    public final void OLrzqt(@NotNull StrategyReqGroup strategyReqGroup) {
        String pxSpread;
        String strValueOf;
        String strKWHzl;
        String strKWHzl2;
        String str = "";
        Intrinsics.checkNotNullParameter(strategyReqGroup, "");
        C54219xAh c54219xAh = this.AEQbTJ;
        c54219xAh.EZpvd(strategyReqGroup.getBaseReq());
        TwapReq twapReq = strategyReqGroup.getTwapReq();
        if (twapReq != null) {
            String pxSpread2 = twapReq.getPxSpread();
            if (pxSpread2 == null || pxSpread2.length() == 0) {
                pxSpread = twapReq.getPxSpread();
            } else {
                xMS xmsCopydefault = fvQaOB().copydefault();
                if (xmsCopydefault != null) {
                    String pxSpread3 = twapReq.getPxSpread();
                    Intrinsics.copydefault((Object) pxSpread3);
                    pxSpread = xmsCopydefault.valueOf(pxSpread3);
                } else {
                    pxSpread = null;
                }
            }
            twapReq.setPxSpread(pxSpread);
            xMS xmsCopydefault2 = fvQaOB().copydefault();
            if (xmsCopydefault2 == null || (strValueOf = xmsCopydefault2.valueOf(twapReq.getPxLimit())) == null) {
                strValueOf = "";
            }
            twapReq.setPxLimit(strValueOf);
            C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(fvQaOB(), null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default == null || (strKWHzl = c54571xNhCreateAmtConvert$default.KWHzl(twapReq.getSzLimit())) == null) {
                strKWHzl = "";
            }
            twapReq.setSzLimit(strKWHzl);
            C54571xNh c54571xNhCreateAmtConvert$default2 = C55887xsS.createAmtConvert$default(fvQaOB(), null, false, 3, null);
            if (c54571xNhCreateAmtConvert$default2 != null && (strKWHzl2 = c54571xNhCreateAmtConvert$default2.KWHzl(twapReq.getSz())) != null) {
                str = strKWHzl2;
            }
            twapReq.setSz(str);
            twapReq.setTradeQuoteCcy(fvQaOB().AEQbTJ(strategyReqGroup.getBaseReq().getOrdType()));
            c54219xAh.copydefault(twapReq);
        }
        c54219xAh.AEQbTJ(this.OLrzqt);
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public static /* synthetic */ StrategyBaseReq createBasePlaceOrderBean$default(TwapTradePresenter twapTradePresenter, BizInstrument bizInstrument, String str, String str2, String str3, Boolean bool, TradeType tradeType, String str4, String str5, Boolean bool2, int i, Object obj) {
        return twapTradePresenter.AEQbTJ(bizInstrument, str, str2, str3, bool, (i & 32) != 0 ? null : tradeType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    private final StrategyBaseReq AEQbTJ(BizInstrument bizInstrument, String str, String str2, String str3, Boolean bool, TradeType tradeType, String str4, String str5, Boolean bool2) {
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

    private final boolean copydefault() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AEQbTJ);
    }
}
