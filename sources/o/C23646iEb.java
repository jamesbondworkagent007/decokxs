package o;

import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23646iEb {

    /* JADX INFO: renamed from: o.iEb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RewardType.values().length];
            try {
                iArr[RewardType.OKX_BONUS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RewardType.MERKL_BONUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardType.COMMON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final InvestAction EZpvd(@NotNull RewardType rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        int i = TaskDescription.AEQbTJ[rewardType.ordinal()];
        if (i == 1) {
            return InvestAction.Bonus;
        }
        if (i == 2) {
            return InvestAction.MerklBonus;
        }
        if (i == 3) {
            return InvestAction.Claim;
        }
        return InvestAction.Claim;
    }
}
