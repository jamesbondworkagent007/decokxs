package com.okinc.tradingbot.impl.strategy.viewmodel;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.GridStopInfoDto;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyStopReq;
import com.okinc.unify_trade.biz.StrategyStopResponse;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C54215xAd;
import o.C54507xKz;
import o.C56235xyw;
import o.C56251xzL;
import o.C56252xzM;
import o.C56402yEa;
import o.xKK;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotStopActionPresenter extends AbsPresenter {
    public final C56251xzL AEQbTJ;
    public final TradeLiveData<List<GridStopInfoDto>> AhwBna;
    public final TradeLiveData<StrategyConfigInfo> EZpvd;
    public final C56235xyw KWHzl;
    public StrategyConfigInfo OLrzqt;
    public final C56252xzM copydefault;
    public final C54215xAd djBIcL;
    public final TradeLiveData<List<StrategyStopResponse>> gEmmrt;
    public final List<String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyStopResponse>> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<GridStopInfoDto>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StrategyConfigInfo strategyConfigInfo) {
        this.OLrzqt = strategyConfigInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public BotStopActionPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = new C54215xAd();
        this.gEmmrt = new TradeLiveData<>();
        C56251xzL c56251xzL = new C56251xzL();
        this.AEQbTJ = c56251xzL;
        C56252xzM c56252xzM = new C56252xzM();
        this.copydefault = c56252xzM;
        this.AhwBna = new TradeLiveData<>();
        this.valueOf = yDY.gEmmrt(c56251xzL.bB_(), c56252xzM.bB_());
        this.KWHzl = new C56235xyw();
        this.EZpvd = new TradeLiveData<>();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56251xzL c56251xzL = this.AEQbTJ;
        c56251xzL.AEQbTJ(this.AhwBna);
        c56251xzL.copydefault(str);
        xKK.Activity.execute$default(c56251xzL, 0L, 1, null);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56252xzM c56252xzM = this.copydefault;
        c56252xzM.AEQbTJ(this.AhwBna);
        c56252xzM.OLrzqt(str);
        xKK.Activity.execute$default(c56252xzM, 0L, 1, null);
    }

    public final void copydefault(@NotNull StrategyStopReq strategyStopReq) {
        Intrinsics.checkNotNullParameter(strategyStopReq, "");
        C54215xAd c54215xAd = this.djBIcL;
        c54215xAd.AEQbTJ(this.gEmmrt);
        c54215xAd.copydefault(C56402yEa.EZpvd(strategyStopReq));
        xKK.Activity.execute$default(c54215xAd, 0L, 1, null);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56235xyw c56235xyw = this.KWHzl;
        c56235xyw.KWHzl("contract_grid");
        c56235xyw.AEQbTJ(str);
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.EZpvd, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.djBIcL, this.AEQbTJ, this.KWHzl);
    }
}
