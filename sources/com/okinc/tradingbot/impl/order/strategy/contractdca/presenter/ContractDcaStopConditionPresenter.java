package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EditContractDcaReq;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C54507xKz;
import o.C54589xNz;
import o.C56152xxS;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC54581xNr;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ContractDcaStopConditionPresenter extends AbsPresenter {
    public TacticsData AEQbTJ;
    public String EZpvd;
    public final TradeLiveData<StrategyResponse> KWHzl;
    public String OLrzqt;
    public final C56152xxS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56152xxS KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(TacticsData tacticsData) {
        this.AEQbTJ = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaStopConditionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56152xxS();
        this.KWHzl = new TradeLiveData<>();
    }

    public final BizInstrument AEQbTJ() {
        String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        TacticsData tacticsData = this.AEQbTJ;
        if (tacticsData == null || (instType = tacticsData.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsData2 = this.AEQbTJ;
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, tacticsData2 != null ? tacticsData2.getInstId() : null, null, null, 12, null);
    }

    public final List<TradeMenuItemBean> copydefault() {
        List<TriggerCond> listGEmmrt = yDY.gEmmrt(TriggerCond.CROSS_UP, TriggerCond.CROSS_DOWN);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (TriggerCond triggerCond : listGEmmrt) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(triggerCond.getDesc()), Intrinsics.EZpvd((Object) triggerCond.getMode(), (Object) this.EZpvd), triggerCond.getMode(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56152xxS c56152xxS = this.copydefault;
        TacticsData tacticsData = this.AEQbTJ;
        c56152xxS.copydefault(new EditContractDcaReq(tacticsData != null ? tacticsData.getAlgoId() : null, C56402yEa.EZpvd(copydefault(str)), null, null, null, null, null, null, null, null, null, false, null, 8188, null));
        c56152xxS.djBIcL();
        c56152xxS.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56152xxS, 0L, 1, null);
    }

    public final DcaTriggerParam copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = this.OLrzqt;
        ContractDcaStopConditionType contractDcaStopConditionType = ContractDcaStopConditionType.PRICE;
        String str3 = Intrinsics.EZpvd((Object) str2, (Object) contractDcaStopConditionType.getMode()) ? this.EZpvd : "";
        String str4 = Intrinsics.EZpvd((Object) this.OLrzqt, (Object) contractDcaStopConditionType.getMode()) ? str : "";
        TacticsData tacticsData = this.AEQbTJ;
        return new DcaTriggerParam("stop", str2, str3, str4, (String) null, (String) null, (String) null, (String) null, tacticsData != null ? tacticsData.getCycleId() : null, (String) null, 752, (DefaultConstructorMarker) null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}
