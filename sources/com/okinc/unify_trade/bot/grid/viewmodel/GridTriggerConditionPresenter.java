package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.C33129mqd;
import o.C54589xNz;
import o.C55697xoo;
import o.C55886xsR;
import o.C55887xsS;
import o.C56042xvO;
import o.C56049xvV;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.xKK;
import o.xVA;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GridTriggerConditionPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public StrategyConfigInfo AEQbTJ;
    public boolean AYXKKw;
    public C55887xsS KWHzl;
    public GridReq OLrzqt;
    public String copydefault;
    public final String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.KWHzl = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.OLrzqt = gridReq;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.grid.viewmodel.GridTriggerConditionPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridTriggerConditionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = "";
        this.valueOf = "first_show_reserve_warn " + C55697xoo.OLrzqt.gEmmrt();
        this.AYXKKw = true;
    }

    public final GridReq djBIcL() {
        GridReq gridReq = this.OLrzqt;
        if (gridReq != null) {
            return gridReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C55887xsS valueOf() {
        C55887xsS c55887xsS = this.KWHzl;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl(Bundle bundle) {
        String string;
        GridReq gridReq;
        GridReq gridReq2;
        if (bundle == null || (string = bundle.getString("bot_condition_type")) == null) {
            string = TtmlNode.START;
        }
        this.copydefault = string;
        if (bundle == null || (gridReq2 = (GridReq) bundle.getParcelable("bot_grid_req")) == null || (gridReq = (GridReq) xVA.EZpvd(gridReq2)) == null) {
            gridReq = new GridReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -1, 15, (DefaultConstructorMarker) null);
        }
        copydefault(gridReq);
        this.AEQbTJ = bundle != null ? (StrategyConfigInfo) bundle.getParcelable("bot_config") : null;
        EZpvd(new C55887xsS(djBIcL().getInstType(), djBIcL().getInstId()));
    }

    public final void EZpvd(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) bundle.getParcelable("trigger_sign");
        String triggerAction = advancedTriggerSign != null ? advancedTriggerSign.getTriggerAction() : null;
        if (Intrinsics.EZpvd((Object) triggerAction, (Object) TtmlNode.START)) {
            djBIcL().getSignParams().set(0, advancedTriggerSign);
        } else if (Intrinsics.EZpvd((Object) triggerAction, (Object) "stop")) {
            djBIcL().getSignParams().set(1, advancedTriggerSign);
        }
    }

    public final AdvancedTriggerSign gEmmrt() {
        return (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AuCTelauCTel(djBIcL().getSignParams());
    }

    public final AdvancedTriggerSign isConnected() {
        return (AdvancedTriggerSign) CollectionsKt___CollectionsKt.AubY(djBIcL().getSignParams());
    }

    public final void KWHzl(@NotNull String str) {
        AdvancedTriggerSign advancedTriggerSign;
        BotRangeConfig rsiOversoldThold;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<AdvancedTriggerSign> signParams = djBIcL().getSignParams();
        if (Intrinsics.EZpvd((Object) str, (Object) GridStartTriggerType.RSI_14.getMode())) {
            StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
            String str2 = (strategyConfigInfo == null || (rsiOversoldThold = strategyConfigInfo.getRsiOversoldThold()) == null) ? null : rsiOversoldThold.getDefault();
            String str3 = (String) CollectionsKt___CollectionsKt.AuCTelauCTel(OLrzqt());
            String mode = TriggerCond.BELOW.getMode();
            if (str2 == null || str2.length() == 0) {
                str2 = "30";
            }
            advancedTriggerSign = new AdvancedTriggerSign(TtmlNode.START, str, (String) null, (String) null, (String) null, "14", str3, mode, str2, (String) null, (String) null, (String) null, 3612, (DefaultConstructorMarker) null);
        } else {
            advancedTriggerSign = new AdvancedTriggerSign(TtmlNode.START, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4092, (DefaultConstructorMarker) null);
        }
        signParams.set(0, advancedTriggerSign);
    }

    public final void AEQbTJ(@NotNull String str) {
        AdvancedTriggerSign advancedTriggerSign;
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<AdvancedTriggerSign> signParams = djBIcL().getSignParams();
        if (Intrinsics.EZpvd((Object) str, (Object) GridStopTriggerType.RSI_14.getMode())) {
            advancedTriggerSign = new AdvancedTriggerSign("stop", str, (String) null, (String) null, (String) null, "14", (String) CollectionsKt___CollectionsKt.AuCTelauCTel(OLrzqt()), TriggerCond.ABOVE.getMode(), "70", (String) null, "1", (String) null, 2588, (DefaultConstructorMarker) null);
        } else {
            advancedTriggerSign = new AdvancedTriggerSign("stop", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", (String) null, 3068, (DefaultConstructorMarker) null);
        }
        signParams.set(1, advancedTriggerSign);
    }

    public final List<String> OLrzqt() {
        String klinePeriod;
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        List<String> listSplit$default = (strategyConfigInfo == null || (klinePeriod = strategyConfigInfo.getKlinePeriod()) == null) ? null : StringsKt__StringsKt.split$default((CharSequence) klinePeriod, new String[]{","}, false, 0, 6, (Object) null);
        if (C33129mqd.KWHzl((Collection) listSplit$default)) {
            Intrinsics.copydefault(listSplit$default);
            return listSplit$default;
        }
        TimeFrame[] timeFrameArrValues = TimeFrame.values();
        ArrayList arrayList = new ArrayList(timeFrameArrValues.length);
        for (TimeFrame timeFrame : timeFrameArrValues) {
            arrayList.add(timeFrame.getMode());
        }
        return arrayList;
    }

    public final String AEQbTJ() {
        String strAYXKKw = valueOf().AYXKKw();
        return strAYXKKw == null ? "" : strAYXKKw;
    }

    public final boolean DbNXlk() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        return interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(valueOf().fetchVPNInfo(), "grid");
    }

    public final int AhwBna() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String strFIwbmz;
        BizInstrument bizInstrumentAhwBna = valueOf().AhwBna();
        if (bizInstrumentAhwBna != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            Integer numValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrumentAhwBna.getInstType())) == null || (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(bizInstrumentAhwBna.getInstFamily())) == null) ? null : Integer.valueOf(C33129mqd.AhwBna(strFIwbmz));
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 8;
    }

    public final String EZpvd() {
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        String strategyType = strategyConfigInfo != null ? strategyConfigInfo.getStrategyType() : null;
        return Intrinsics.EZpvd((Object) strategyType, (Object) "grid") ? C56042xvO.OLrzqt(djBIcL()) : Intrinsics.EZpvd((Object) strategyType, (Object) "infinite_grid") ? C56049xvV.OLrzqt(djBIcL()) : "";
    }

    public final boolean OLrzqt(@NotNull String str) {
        TrailingConfig trailingDownConfig;
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = SPUtils.getBoolean(this.valueOf, true);
        String indicator = gEmmrt().getIndicator();
        GridStartTriggerType gridStartTriggerType = GridStartTriggerType.INSTANT;
        boolean z = Intrinsics.EZpvd((Object) indicator, (Object) gridStartTriggerType.getMode()) && !Intrinsics.EZpvd((Object) str, (Object) gridStartTriggerType.getMode());
        if (this.AYXKKw) {
            StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
            if (Intrinsics.EZpvd((Object) (strategyConfigInfo != null ? strategyConfigInfo.getStrategyType() : null), (Object) "grid") && Intrinsics.EZpvd((Object) this.copydefault, (Object) TtmlNode.START) && (trailingDownConfig = djBIcL().getTrailingDownConfig()) != null && trailingDownConfig.getEnabled() && Intrinsics.EZpvd(djBIcL().getReserveFunds(), Boolean.TRUE) && z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }
}
