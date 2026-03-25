package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56235xyw;
import o.C56402yEa;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AutoEarnPresenter extends AbsPresenter {
    public String AEQbTJ;
    public boolean AYXKKw;
    public final C56235xyw AhwBna;
    public final MutableLiveData<String> EZpvd;
    public AutoVipProfitInfo KWHzl;
    public final MutableLiveData<AutoEarnStakingQueryConfig> OLrzqt;
    public final MutableLiveData<StrategyConfigInfo> copydefault;
    public String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<StrategyConfigInfo> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoVipProfitInfo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AutoEarnStakingQueryConfig> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(autoVipProfitInfo, "");
        this.KWHzl = autoVipProfitInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AhwBna = new C56235xyw();
        this.copydefault = new MutableLiveData<>();
        this.OLrzqt = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.AEQbTJ = "smart_arbitrage";
        this.gEmmrt = "";
        this.KWHzl = new AutoVipProfitInfo((List) null, (List) null, (String) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    public final void copydefault(@NotNull final TacticsVipProfitData tacticsVipProfitData) {
        Intrinsics.checkNotNullParameter(tacticsVipProfitData, "");
        String strEZpvd = tacticsVipProfitData.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return;
        }
        C56235xyw c56235xyw = this.AhwBna;
        String strEZpvd2 = tacticsVipProfitData.EZpvd();
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        c56235xyw.KWHzl(strEZpvd2);
        String strCopydefault = tacticsVipProfitData.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        c56235xyw.AEQbTJ(strCopydefault);
        c56235xyw.OLrzqt(tacticsVipProfitData.OLrzqt());
        String strAEQbTJ = tacticsVipProfitData.AEQbTJ();
        c56235xyw.EZpvd(strAEQbTJ != null ? strAEQbTJ : "");
        c56235xyw.KWHzl(new Function1() { // from class: o.wyv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AutoEarnPresenter.KWHzl(this.AEQbTJ, tacticsVipProfitData, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final List<EducationTabType> KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 1262237383) {
            if (iHashCode != 1555345608) {
                if (iHashCode == 1568717304 && str.equals("auto_earn_and_staking")) {
                    return yDY.gEmmrt(EducationTabType.AUTO_EARN, EducationTabType.AUTO_STAKE);
                }
            } else if (str.equals("auto_education_single_earn")) {
                return yDY.gEmmrt(EducationTabType.AUTO_EARN_BENEFIT, EducationTabType.AUTO_EARN_FAQ);
            }
        } else if (str.equals("auto_education_single_staking")) {
            return yDY.gEmmrt(EducationTabType.AUTO_STAKING_BENEFIT, EducationTabType.AUTO_STAKING_FAQ);
        }
        return yDY.AhwBna();
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.AhwBna);
    }

    public static final Unit KWHzl(AutoEarnPresenter autoEarnPresenter, TacticsVipProfitData tacticsVipProfitData, ResponseData responseData) {
        List list;
        StrategyConfigInfo strategyConfigInfo;
        List<AutoEarnStakingConfig> autoEarn;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (List) responseData.getData()) != null && (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
            autoEarnPresenter.copydefault.setValue(strategyConfigInfo);
            MutableLiveData<AutoEarnStakingQueryConfig> mutableLiveData = autoEarnPresenter.OLrzqt;
            List<AutoEarnStakingConfig> autoStaking = null;
            if (Intrinsics.EZpvd((Object) tacticsVipProfitData.EZpvd(), (Object) "smart_portfolio")) {
                SmartPortfolioConfig smartPortfolioConfig = strategyConfigInfo.getSmartPortfolioConfig();
                autoEarn = smartPortfolioConfig != null ? smartPortfolioConfig.getAutoEarn() : null;
            } else {
                autoEarn = strategyConfigInfo.getAutoEarn();
            }
            if (Intrinsics.EZpvd((Object) tacticsVipProfitData.EZpvd(), (Object) "smart_portfolio")) {
                SmartPortfolioConfig smartPortfolioConfig2 = strategyConfigInfo.getSmartPortfolioConfig();
                if (smartPortfolioConfig2 != null) {
                    autoStaking = smartPortfolioConfig2.getAutoStaking();
                }
            } else {
                autoStaking = strategyConfigInfo.getAutoStaking();
            }
            mutableLiveData.setValue(new AutoEarnStakingQueryConfig(autoEarn, autoStaking, strategyConfigInfo.getVipLevel()));
        }
        return Unit.INSTANCE;
    }
}
