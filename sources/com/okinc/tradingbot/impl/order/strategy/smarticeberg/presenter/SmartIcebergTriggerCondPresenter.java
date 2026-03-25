package com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C55887xsS;
import o.xKK;
import o.xVA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartIcebergTriggerCondPresenter extends AbsPresenter {
    public StrategyConfigInfo EZpvd;
    public IceBergReq OLrzqt;
    public C55887xsS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        this.OLrzqt = iceBergReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.copydefault = c55887xsS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartIcebergTriggerCondPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
    }

    public final IceBergReq AEQbTJ() {
        IceBergReq iceBergReq = this.OLrzqt;
        if (iceBergReq != null) {
            return iceBergReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS OLrzqt() {
        C55887xsS c55887xsS = this.copydefault;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(Bundle bundle) {
        IceBergReq iceBergReq;
        String string;
        String string2;
        IceBergReq iceBergReq2;
        if (bundle == null || (iceBergReq2 = (IceBergReq) bundle.getParcelable("bot_grid_req")) == null || (iceBergReq = (IceBergReq) xVA.EZpvd(iceBergReq2)) == null) {
            GridStartTriggerType gridStartTriggerType = GridStartTriggerType.INSTANT;
            iceBergReq = new IceBergReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, gridStartTriggerType.getMode(), gridStartTriggerType.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4088, (DefaultConstructorMarker) null)), (Boolean) null, (String) null, (String) null, (String) null, 3967, (DefaultConstructorMarker) null);
        }
        AEQbTJ(iceBergReq);
        this.EZpvd = bundle != null ? (StrategyConfigInfo) bundle.getParcelable("bot_config") : null;
        String str = "";
        if (bundle == null || (string = bundle.getString("bot_inst_type")) == null) {
            string = "";
        }
        if (bundle != null && (string2 = bundle.getString("bot_inst_id")) != null) {
            str = string2;
        }
        AEQbTJ(new C55887xsS(string, str));
    }

    public final void AEQbTJ(Bundle bundle) {
        AdvancedTriggerSign advancedTriggerSign = bundle != null ? (AdvancedTriggerSign) bundle.getParcelable("trigger_sign") : null;
        if (Intrinsics.EZpvd((Object) (advancedTriggerSign != null ? advancedTriggerSign.getTriggerAction() : null), (Object) TtmlNode.START)) {
            ArrayList<AdvancedTriggerSign> triggerParams = AEQbTJ().getTriggerParams();
            if (C33129mqd.AEQbTJ(triggerParams != null ? Integer.valueOf(triggerParams.size()) : null, 0)) {
                ArrayList<AdvancedTriggerSign> triggerParams2 = AEQbTJ().getTriggerParams();
                Intrinsics.copydefault(triggerParams2);
                triggerParams2.set(0, advancedTriggerSign);
            }
        }
    }

    public final AdvancedTriggerSign copydefault() {
        ArrayList<AdvancedTriggerSign> triggerParams = AEQbTJ().getTriggerParams();
        if (triggerParams != null) {
            return (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(triggerParams);
        }
        return null;
    }

    public final void AEQbTJ(String str, TradeType tradeType) {
        AdvancedTriggerSign advancedTriggerSign;
        String frame;
        if (Intrinsics.EZpvd((Object) str, (Object) GridStartTriggerType.RSI_14.getMode())) {
            StrategyConfigInfo strategyConfigInfo = this.EZpvd;
            if (strategyConfigInfo == null || (frame = strategyConfigInfo.getDefaultKlineTimeframe()) == null) {
                frame = TimeFrame.THIRTY_M.getFrame();
            }
            advancedTriggerSign = advancedTriggerSign;
            AdvancedTriggerSign advancedTriggerSign2 = new AdvancedTriggerSign(TtmlNode.START, str, str, (String) null, (String) null, "14", frame, (String) null, (String) null, (String) null, (String) null, (String) null, 3992, (DefaultConstructorMarker) null);
            if (tradeType == TradeType.SELL_CLOSE) {
                advancedTriggerSign.setTriggerCond(TriggerCond.ABOVE.getMode());
                advancedTriggerSign.setOversoldThold("70");
            } else {
                advancedTriggerSign.setTriggerCond(TriggerCond.BELOW.getMode());
                advancedTriggerSign.setOversoldThold("30");
            }
        } else {
            advancedTriggerSign = new AdvancedTriggerSign(TtmlNode.START, str, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4088, (DefaultConstructorMarker) null);
        }
        AdvancedTriggerSign advancedTriggerSign3 = advancedTriggerSign;
        ArrayList<AdvancedTriggerSign> triggerParams = AEQbTJ().getTriggerParams();
        if (triggerParams == null || triggerParams.size() <= 0) {
            return;
        }
        triggerParams.set(0, advancedTriggerSign3);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public final String KWHzl() {
        AdvancedTriggerSign advancedTriggerSign;
        ArrayList<AdvancedTriggerSign> triggerParams = AEQbTJ().getTriggerParams();
        return (triggerParams == null || (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(triggerParams)) == null || !Intrinsics.EZpvd((Object) advancedTriggerSign.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode()) || !C33129mqd.valueOf(advancedTriggerSign.getTriggerPx(), 0)) ? "" : C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImpl);
    }
}
