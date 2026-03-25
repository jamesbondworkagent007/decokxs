package com.okinc.unify_trade.bot.contract_grid.viewModel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C54507xKz;
import o.C56190xyD;
import o.C56402yEa;
import o.xKK;
import o.xVA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ContractGridRsiPresenter extends AbsPresenter {
    public AdvancedTriggerSign AEQbTJ;
    public final TradeLiveData<RsiTrigger> EZpvd;
    public boolean KWHzl;
    public String OLrzqt;
    public final C56190xyD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AdvancedTriggerSign advancedTriggerSign) {
        Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
        this.AEQbTJ = advancedTriggerSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<RsiTrigger> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractGridRsiPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = new C56190xyD();
        this.EZpvd = new TradeLiveData<>();
    }

    public final AdvancedTriggerSign valueOf() {
        AdvancedTriggerSign advancedTriggerSign = this.AEQbTJ;
        if (advancedTriggerSign != null) {
            return advancedTriggerSign;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String AEQbTJ() {
        String str = this.OLrzqt;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl(Bundle bundle) {
        String string;
        AdvancedTriggerSign advancedTriggerSign;
        AdvancedTriggerSign advancedTriggerSign2;
        if (bundle == null || (string = bundle.getString("bot_inst_id")) == null) {
            string = "";
        }
        EZpvd(string);
        if (bundle == null || (advancedTriggerSign2 = (AdvancedTriggerSign) bundle.getParcelable("trigger_sign")) == null || (advancedTriggerSign = (AdvancedTriggerSign) xVA.EZpvd(advancedTriggerSign2)) == null) {
            advancedTriggerSign = new AdvancedTriggerSign((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }
        AEQbTJ(advancedTriggerSign);
    }

    public final void AhwBna() {
        C56190xyD c56190xyD = this.copydefault;
        c56190xyD.OLrzqt(AEQbTJ(), valueOf().getOversoldThold(), valueOf().getTimeframe(), valueOf().getTimePeriod(), valueOf().getTriggerCond());
        c56190xyD.djBIcL();
        c56190xyD.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56190xyD, 0L, 1, null);
    }

    public final List<TradeMenuItemBean> KWHzl() {
        TriggerCond[] triggerCondArrValues = TriggerCond.values();
        ArrayList arrayList = new ArrayList(triggerCondArrValues.length);
        for (TriggerCond triggerCond : triggerCondArrValues) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(triggerCond.getDesc()), Intrinsics.EZpvd((Object) triggerCond.getMode(), (Object) valueOf().getTriggerCond()), triggerCond, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final List<TradeMenuItemBean> copydefault() {
        TimeFrame[] timeFrameArrValues = TimeFrame.values();
        ArrayList arrayList = new ArrayList(timeFrameArrValues.length);
        for (TimeFrame timeFrame : timeFrameArrValues) {
            arrayList.add(new TradeMenuItemBean(TimeFrame.Companion.copydefault(timeFrame.getFrame()), Intrinsics.EZpvd((Object) timeFrame.getFrame(), (Object) valueOf().getTimeframe()), timeFrame, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.copydefault);
    }
}
