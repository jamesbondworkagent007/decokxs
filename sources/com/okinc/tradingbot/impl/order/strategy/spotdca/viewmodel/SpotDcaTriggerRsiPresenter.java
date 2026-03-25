package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C54507xKz;
import o.C56111xwe;
import o.C56190xyD;
import o.C56402yEa;
import o.C56403yEb;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaTriggerRsiPresenter extends AbsPresenter {
    public final C56111xwe<DcaTriggerParam> AEQbTJ;
    public final C56190xyD EZpvd;
    public final C56111xwe<RsiTrigger> KWHzl;
    public DcaTriggerParam OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<RsiTrigger> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DcaTriggerParam dcaTriggerParam) {
        this.OLrzqt = dcaTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTriggerParam EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<DcaTriggerParam> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaTriggerRsiPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C56190xyD();
        this.KWHzl = new C56111xwe<>();
        this.AEQbTJ = new C56111xwe<>();
    }

    public final void AEQbTJ(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        C56190xyD c56190xyD = this.EZpvd;
        DcaTriggerParam dcaTriggerParam = this.OLrzqt;
        String timeframe = dcaTriggerParam != null ? dcaTriggerParam.getTimeframe() : null;
        DcaTriggerParam dcaTriggerParam2 = this.OLrzqt;
        C56190xyD.setParams$default(c56190xyD, str2, str, timeframe, dcaTriggerParam2 != null ? dcaTriggerParam2.getTimePeriod() : null, null, 16, null);
        c56190xyD.djBIcL();
        c56190xyD.OLrzqt(this.KWHzl, new C54507xKz());
        xKK.Activity.execute$default(c56190xyD, 0L, 1, null);
    }

    public final List<TradeMenuItemBean> KWHzl() {
        String klinePeriod;
        List<String> listSplit$default;
        DcaTriggerParam dcaTriggerParam = this.OLrzqt;
        if (dcaTriggerParam == null || (klinePeriod = dcaTriggerParam.getKlinePeriod()) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) klinePeriod, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return yDY.AhwBna();
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        for (String str : listSplit$default) {
            String strCopydefault = TimeFrame.Companion.copydefault(str);
            DcaTriggerParam dcaTriggerParam2 = this.OLrzqt;
            arrayList.add(new TradeMenuItemBean(strCopydefault, Intrinsics.EZpvd((Object) str, (Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTimeframe() : null)), str, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }
}
