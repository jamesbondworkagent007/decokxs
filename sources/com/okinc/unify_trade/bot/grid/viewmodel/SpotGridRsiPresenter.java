package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33070mpX;
import o.C33129mqd;
import o.C54507xKz;
import o.C56190xyD;
import o.C56402yEa;
import o.C56403yEb;
import o.xKK;
import o.xVA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotGridRsiPresenter extends AbsPresenter {
    public final TradeLiveData<RsiTrigger> AEQbTJ;
    public StrategyConfigInfo EZpvd;
    public final C56190xyD KWHzl;
    public String OLrzqt;
    public boolean copydefault;
    public AdvancedTriggerSign valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<RsiTrigger> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AdvancedTriggerSign advancedTriggerSign) {
        Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
        this.valueOf = advancedTriggerSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridRsiPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = new C56190xyD();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public final AdvancedTriggerSign KWHzl() {
        AdvancedTriggerSign advancedTriggerSign = this.valueOf;
        if (advancedTriggerSign != null) {
            return advancedTriggerSign;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void EZpvd(Bundle bundle) {
        AdvancedTriggerSign advancedTriggerSign;
        AdvancedTriggerSign advancedTriggerSign2;
        if (bundle == null || (advancedTriggerSign2 = (AdvancedTriggerSign) bundle.getParcelable("trigger_sign")) == null || (advancedTriggerSign = (AdvancedTriggerSign) xVA.EZpvd(advancedTriggerSign2)) == null) {
            advancedTriggerSign = new AdvancedTriggerSign((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        }
        EZpvd(advancedTriggerSign);
        this.EZpvd = bundle != null ? (StrategyConfigInfo) bundle.getParcelable("bot_config") : null;
        this.OLrzqt = bundle != null ? bundle.getString("bot_ord_type") : null;
    }

    public final void gEmmrt() {
        C56190xyD c56190xyD = this.KWHzl;
        StrategyConfigInfo strategyConfigInfo = this.EZpvd;
        c56190xyD.OLrzqt(strategyConfigInfo != null ? strategyConfigInfo.getInstId() : null, KWHzl().getOversoldThold(), KWHzl().getTimeframe(), KWHzl().getTimePeriod(), KWHzl().getTriggerCond());
        c56190xyD.djBIcL();
        c56190xyD.OLrzqt(this.AEQbTJ, new C54507xKz());
        xKK.Activity.execute$default(c56190xyD, 0L, 1, null);
    }

    public final List<TradeMenuItemBean> OLrzqt() {
        TriggerCond[] triggerCondArrValues = TriggerCond.values();
        ArrayList arrayList = new ArrayList(triggerCondArrValues.length);
        for (TriggerCond triggerCond : triggerCondArrValues) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(triggerCond.getDesc()), Intrinsics.EZpvd((Object) triggerCond.getMode(), (Object) KWHzl().getTriggerCond()), triggerCond, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    private final List<String> AhwBna() {
        String klinePeriod;
        StrategyConfigInfo strategyConfigInfo = this.EZpvd;
        List<String> listSplit$default = (strategyConfigInfo == null || (klinePeriod = strategyConfigInfo.getKlinePeriod()) == null) ? null : StringsKt__StringsKt.split$default((CharSequence) klinePeriod, new String[]{","}, false, 0, 6, (Object) null);
        if (C33129mqd.KWHzl((Collection) listSplit$default)) {
            Intrinsics.copydefault(listSplit$default);
            return listSplit$default;
        }
        TimeFrame[] timeFrameArrValues = TimeFrame.values();
        ArrayList arrayList = new ArrayList(timeFrameArrValues.length);
        for (TimeFrame timeFrame : timeFrameArrValues) {
            arrayList.add(timeFrame.getFrame());
        }
        return arrayList;
    }

    public final List<TradeMenuItemBean> copydefault() {
        List<String> listAhwBna = AhwBna();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (String str : listAhwBna) {
            arrayList.add(new TradeMenuItemBean(TimeFrame.Companion.copydefault(str), Intrinsics.EZpvd((Object) str, (Object) KWHzl().getTimeframe()), str, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.KWHzl);
    }
}
