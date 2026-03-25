package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbiStopConfirmPresenter;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo;
import com.okinc.unify_trade.biz.CostVo;
import com.okinc.unify_trade.biz.EstimatedClosePnlVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C54215xAd;
import o.C54223xAl;
import o.C54507xKz;
import o.C56111xwe;
import o.C56392yDr;
import o.C56402yEa;
import o.InterfaceC56387yDm;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbiStopConfirmPresenter extends AbsPresenter {
    public final InterfaceC56387yDm AEQbTJ;
    public final C54215xAd AhwBna;
    public final TradeLiveData<List<StrategyStopResponse>> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final C56111xwe<ArbitrageInfoResponse> OLrzqt;
    public final C54223xAl copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyStopResponse>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54215xAd KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ArbitrageInfoResponse> copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbiStopConfirmPresenter(@NotNull Application application, @NotNull final SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbiStopConfirmPresenter.EZpvd(savedStateHandle);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbiStopConfirmPresenter.AEQbTJ(this.EZpvd);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbiStopConfirmPresenter.copydefault(this.EZpvd);
            }
        });
        this.copydefault = new C54223xAl();
        this.OLrzqt = new C56111xwe<>();
        this.AhwBna = new C54215xAd();
        this.EZpvd = new TradeLiveData<>();
    }

    public static final TacticsData EZpvd(SavedStateHandle savedStateHandle) {
        TacticsData tacticsData = (TacticsData) savedStateHandle.get("DATA_PARAM");
        return tacticsData == null ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
    }

    public final TacticsData EZpvd() {
        return (TacticsData) this.KWHzl.getValue();
    }

    public static final String AEQbTJ(SmartArbiStopConfirmPresenter smartArbiStopConfirmPresenter) {
        String instFamily = smartArbiStopConfirmPresenter.EZpvd().getInstFamily();
        return instFamily == null ? "" : instFamily;
    }

    private final String OLrzqt() {
        return (String) this.AEQbTJ.getValue();
    }

    public static final String copydefault(SmartArbiStopConfirmPresenter smartArbiStopConfirmPresenter) {
        String totalAmt = smartArbiStopConfirmPresenter.EZpvd().getTotalAmt();
        return totalAmt == null ? "" : totalAmt;
    }

    private final String valueOf() {
        return (String) this.valueOf.getValue();
    }

    private final boolean OLrzqt(String str) {
        return str == null || str.length() == 0 || (C33129mqd.copydefault(C33129mqd.mulS$default(str, 100, null, null, null, 14, null), "-10") && C33129mqd.valueOf(C33129mqd.mulS$default(str, 100, null, null, null, 14, null), "10"));
    }

    public final void KWHzl(String str, String str2) {
        if (OLrzqt().length() == 0 || !OLrzqt(str)) {
            this.OLrzqt.postValue(new ArbitrageInfoResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArbitrageTotalPnlInfo) null, (String) null, (List) null, (String) null, (String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (String) null, (String) null, (String) null, (List) null, (CostVo) null, (EstimatedClosePnlVo) null, (CostVo) null, (CostVo) null, (String) null, (String) null, false, 16777215, (DefaultConstructorMarker) null));
            return;
        }
        C54223xAl c54223xAl = this.copydefault;
        c54223xAl.AEQbTJ(OLrzqt());
        c54223xAl.KWHzl("simpleFundingFee");
        c54223xAl.gEmmrt(valueOf());
        c54223xAl.OLrzqt(EZpvd().getLeverPrincipal());
        c54223xAl.EZpvd((str == null || str.length() == 0) ? null : str);
        c54223xAl.OLrzqt(EZpvd().getAlgoId());
        c54223xAl.copydefault(EopTrackEvent.CLOSE);
        c54223xAl.djBIcL(str2);
        c54223xAl.KWHzl(EZpvd().isSmartArbitrageWithStaking() ? SubArbitrageType4Remote.STAKE : SubArbitrageType4Remote.EMPTY);
        c54223xAl.OLrzqt(this.OLrzqt, new C54507xKz());
        c54223xAl.OLrzqt(300L);
    }

    public final void AEQbTJ(@NotNull StrategyStopReq strategyStopReq) {
        Intrinsics.checkNotNullParameter(strategyStopReq, "");
        C54215xAd c54215xAd = this.AhwBna;
        c54215xAd.AEQbTJ(this.EZpvd);
        c54215xAd.copydefault(C56402yEa.EZpvd(strategyStopReq));
        xKK.Activity.execute$default(c54215xAd, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AhwBna, this.copydefault);
    }
}
