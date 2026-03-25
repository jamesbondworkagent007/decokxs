package o;

import com.okinc.business.invest_biz.data.bean.RewardType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25540iye {
    public static final boolean copydefault(@NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        return AEQbTJ(rewardType) || EZpvd(rewardType);
    }

    public static final boolean EZpvd(@NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        return rewardType == RewardType.MERKL_BONUS;
    }

    public static final boolean AEQbTJ(@NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        return rewardType == RewardType.OKX_BONUS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [116=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RewardType AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return RewardType.COMMON;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return RewardType.AVAILABLE_REWARD;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return RewardType.AIRDROP;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    return RewardType.OKX_BONUS;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    return RewardType.MERKL_BONUS;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    return RewardType.MARKET;
                }
                break;
        }
        return RewardType.COMMON;
    }
}
