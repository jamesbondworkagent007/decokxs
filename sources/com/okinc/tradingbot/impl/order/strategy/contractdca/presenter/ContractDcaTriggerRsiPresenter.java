package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54507xKz;
import o.C55688xof;
import o.C56190xyD;
import o.C56390yDp;
import o.C56402yEa;
import o.C56424yEw;
import o.xKK;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ContractDcaTriggerRsiPresenter extends AbsPresenter {
    public DcaTriggerParam AEQbTJ;
    public final C56190xyD EZpvd;
    public String KWHzl;
    public String OLrzqt;
    public final TradeLiveData<RsiTrigger> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTriggerParam EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<RsiTrigger> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56190xyD OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(DcaTriggerParam dcaTriggerParam) {
        this.AEQbTJ = dcaTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.KWHzl = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaTriggerRsiPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56190xyD();
        this.copydefault = new TradeLiveData<>();
    }

    public final void djBIcL() {
        C56190xyD c56190xyD = this.EZpvd;
        String str = this.KWHzl;
        DcaTriggerParam dcaTriggerParam = this.AEQbTJ;
        String thold = dcaTriggerParam != null ? dcaTriggerParam.getThold() : null;
        DcaTriggerParam dcaTriggerParam2 = this.AEQbTJ;
        String timeframe = dcaTriggerParam2 != null ? dcaTriggerParam2.getTimeframe() : null;
        DcaTriggerParam dcaTriggerParam3 = this.AEQbTJ;
        String timePeriod = dcaTriggerParam3 != null ? dcaTriggerParam3.getTimePeriod() : null;
        DcaTriggerParam dcaTriggerParam4 = this.AEQbTJ;
        c56190xyD.OLrzqt(str, thold, timeframe, timePeriod, dcaTriggerParam4 != null ? dcaTriggerParam4.getTriggerCond() : null);
        c56190xyD.djBIcL();
        c56190xyD.OLrzqt(this.copydefault, new C54507xKz());
        xKK.Activity.execute$default(c56190xyD, 0L, 1, null);
    }

    public final List<TradeMenuItemBean> gEmmrt() {
        TriggerCond[] triggerCondArrValues = TriggerCond.values();
        ArrayList arrayList = new ArrayList(triggerCondArrValues.length);
        for (TriggerCond triggerCond : triggerCondArrValues) {
            String strAYXKKw = C33070mpX.AYXKKw(triggerCond.getDesc());
            String mode = triggerCond.getMode();
            DcaTriggerParam dcaTriggerParam = this.AEQbTJ;
            arrayList.add(new TradeMenuItemBean(strAYXKKw, Intrinsics.EZpvd((Object) mode, (Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null)), triggerCond, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final List<TradeMenuItemBean> copydefault() {
        TimeFrame[] timeFrameArrValues = TimeFrame.values();
        ArrayList arrayList = new ArrayList(timeFrameArrValues.length);
        for (TimeFrame timeFrame : timeFrameArrValues) {
            String strCopydefault = TimeFrame.Companion.copydefault(timeFrame.getFrame());
            String frame = timeFrame.getFrame();
            DcaTriggerParam dcaTriggerParam = this.AEQbTJ;
            arrayList.add(new TradeMenuItemBean(strCopydefault, Intrinsics.EZpvd((Object) frame, (Object) (dcaTriggerParam != null ? dcaTriggerParam.getTimeframe() : null)), timeFrame, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final String EZpvd(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str, Integer.valueOf(i2))) {
            return C33069mpW.copydefault(C55688xof.Application.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", str2), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(String.valueOf(i2))), C56390yDp.OLrzqt("unit", "")));
        }
        return C33129mqd.gEmmrt(str, Integer.valueOf(i)) ? C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", str2), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(String.valueOf(i))), C56390yDp.OLrzqt("unit", ""))) : "";
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
