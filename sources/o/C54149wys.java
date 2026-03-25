package o;

import android.view.View;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54149wys {
    public static final C54149wys AEQbTJ = new C54149wys();

    private C54149wys() {
    }

    public final void EZpvd(@NotNull java.util.List<java.lang.Object> list, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<AutoEarnStakingConfig> autoEarn = autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null;
        if (autoEarn == null) {
            autoEarn = yDY.AhwBna();
        }
        java.util.List<AutoEarnStakingConfig> list2 = autoEarn;
        java.util.List<AutoEarnStakingConfig> autoStaking = autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null;
        java.lang.String vipLevel = autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getVipLevel() : null;
        list.add(new AutoVipProfitInfo((java.util.List) list2, (java.util.List) autoStaking, vipLevel == null ? "" : vipLevel, false, false, 24, (DefaultConstructorMarker) null));
    }

    public final void copydefault(@NotNull java.util.List<java.lang.Object> list, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<AutoEarnStakingConfig> autoEarn = strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null;
        if (autoEarn == null) {
            autoEarn = yDY.AhwBna();
        }
        java.util.List<AutoEarnStakingConfig> list2 = autoEarn;
        java.util.List<AutoEarnStakingConfig> autoStaking = strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null;
        java.lang.String vipLevel = strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null;
        list.add(new AutoVipProfitInfo((java.util.List) list2, (java.util.List) autoStaking, vipLevel == null ? "" : vipLevel, false, false, 24, (DefaultConstructorMarker) null));
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.Object> list, AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new AutoVipProfitInfo((java.util.List) (autoVipProfitInfo != null ? autoVipProfitInfo.getAutoEarn() : null), (java.util.List) (autoVipProfitInfo != null ? autoVipProfitInfo.getAutoStake() : null), autoVipProfitInfo != null ? autoVipProfitInfo.getVipLevel() : null, false, false, 24, (DefaultConstructorMarker) null));
    }

    public final void copydefault(@NotNull C54154wyx c54154wyx, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(c54154wyx, "");
        if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null))) {
            if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null))) {
                c54154wyx.setVisibility(8);
                return;
            }
        }
        c54154wyx.OLrzqt(new AutoVipProfitInfo((java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null), (java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null), strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null, false, true, 8, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : true, (250 & 4) != 0 ? false : false, (250 & 8) != 0 ? false : false, (250 & 16) != 0 ? false : false, (250 & 32) == 0 ? false : false, (250 & 64) != 0 ? "" : null, (250 & 128) != 0 ? null : null);
    }

    public final void KWHzl(@NotNull C54154wyx c54154wyx, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        Intrinsics.checkNotNullParameter(c54154wyx, "");
        if (!C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null))) {
            if (!C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null))) {
                c54154wyx.setVisibility(8);
                return;
            }
        }
        c54154wyx.OLrzqt(new AutoVipProfitInfo((java.util.List) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null), (java.util.List) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null), autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getVipLevel() : null, false, true, 8, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : false, (250 & 4) != 0 ? false : true, (250 & 8) != 0 ? false : false, (250 & 16) != 0 ? false : false, (250 & 32) == 0 ? false : false, (250 & 64) != 0 ? "" : null, (250 & 128) != 0 ? null : null);
    }

    public final void EZpvd(@NotNull C54154wyx c54154wyx, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(c54154wyx, "");
        if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null))) {
            if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null))) {
                c54154wyx.setVisibility(8);
                return;
            }
        }
        c54154wyx.OLrzqt(new AutoVipProfitInfo((java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null), (java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null), strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null, false, true, 8, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : false, (250 & 4) != 0 ? false : true, (250 & 8) != 0 ? false : false, (250 & 16) != 0 ? false : false, (250 & 32) == 0 ? false : false, (250 & 64) != 0 ? "" : null, (250 & 128) != 0 ? null : null);
    }

    public final void OLrzqt(@NotNull C54154wyx c54154wyx, StrategyConfigInfo strategyConfigInfo, boolean z, boolean z2, java.lang.String str, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(c54154wyx, "");
        if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null))) {
            if (!C33129mqd.KWHzl((java.util.Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null))) {
                c54154wyx.setVisibility(8);
                return;
            }
        }
        c54154wyx.OLrzqt(new AutoVipProfitInfo((java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null), (java.util.List) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null), strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null, true, false, 16, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : true, (250 & 4) != 0 ? false : z, (250 & 8) != 0 ? false : false, (250 & 16) != 0 ? false : z, (250 & 32) == 0 ? z2 : false, (250 & 64) != 0 ? "" : str, (250 & 128) != 0 ? null : onClickListener);
    }

    public final AutoVipProfitInfo EZpvd(StrategyConfigInfo strategyConfigInfo) {
        java.util.List<AutoEarnStakingConfig> autoEarn = strategyConfigInfo != null ? strategyConfigInfo.getAutoEarn() : null;
        if (autoEarn == null) {
            autoEarn = yDY.AhwBna();
        }
        java.util.List<AutoEarnStakingConfig> list = autoEarn;
        java.util.List<AutoEarnStakingConfig> autoStaking = strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null;
        java.lang.String vipLevel = strategyConfigInfo != null ? strategyConfigInfo.getVipLevel() : null;
        return new AutoVipProfitInfo((java.util.List) list, (java.util.List) autoStaking, vipLevel == null ? "" : vipLevel, false, false, 24, (DefaultConstructorMarker) null);
    }

    public final void copydefault(@NotNull C54154wyx c54154wyx, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        Intrinsics.checkNotNullParameter(c54154wyx, "");
        if (!C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null))) {
            if (!C33129mqd.KWHzl((java.util.Collection) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null))) {
                c54154wyx.setVisibility(8);
                return;
            }
        }
        c54154wyx.OLrzqt(new AutoVipProfitInfo((java.util.List) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoEarn() : null), (java.util.List) (autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getAutoStaking() : null), autoEarnStakingQueryConfig != null ? autoEarnStakingQueryConfig.getVipLevel() : null, true, false, 16, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : true, (250 & 4) != 0 ? false : false, (250 & 8) != 0 ? false : false, (250 & 16) != 0 ? false : false, (250 & 32) == 0 ? false : false, (250 & 64) != 0 ? "" : null, (250 & 128) != 0 ? null : null);
    }
}
