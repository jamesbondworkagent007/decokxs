package com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiUnifiedRewardsParams implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DeFiUnifiedRewardsParams> CREATOR = new Creator();
    private final List<UnifiedRewardInfoByInvestment> allRewards;
    private final long analysisPlatformId;

    public static final class Creator implements Parcelable.Creator<DeFiUnifiedRewardsParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiUnifiedRewardsParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UnifiedRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            return new DeFiUnifiedRewardsParams(j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiUnifiedRewardsParams[] newArray(int i) {
            return new DeFiUnifiedRewardsParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeFiUnifiedRewardsParams copy$default(DeFiUnifiedRewardsParams deFiUnifiedRewardsParams, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = deFiUnifiedRewardsParams.analysisPlatformId;
        }
        if ((i & 2) != 0) {
            list = deFiUnifiedRewardsParams.allRewards;
        }
        return deFiUnifiedRewardsParams.copy(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnifiedRewardInfoByInvestment> component2() {
        return this.allRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiUnifiedRewardsParams copy(long j, @NotNull List<UnifiedRewardInfoByInvestment> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DeFiUnifiedRewardsParams(j, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeFiUnifiedRewardsParams)) {
            return false;
        }
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParams = (DeFiUnifiedRewardsParams) obj;
        return this.analysisPlatformId == deFiUnifiedRewardsParams.analysisPlatformId && Intrinsics.EZpvd(this.allRewards, deFiUnifiedRewardsParams.allRewards);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnifiedRewardInfoByInvestment> getAllRewards() {
        return this.allRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.analysisPlatformId) * 31) + this.allRewards.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiUnifiedRewardsParams(analysisPlatformId=" + this.analysisPlatformId + ", allRewards=" + this.allRewards + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.analysisPlatformId);
        List<UnifiedRewardInfoByInvestment> list = this.allRewards;
        parcel.writeInt(list.size());
        Iterator<UnifiedRewardInfoByInvestment> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public DeFiUnifiedRewardsParams(long j, @NotNull List<UnifiedRewardInfoByInvestment> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.analysisPlatformId = j;
        this.allRewards = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:270)) : (r3v0 java.util.List))
 A[MD:(long, java.util.List<com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment>):void (m)] (LINE:267) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsParams.<init>(long, java.util.List):void type: THIS */
    public /* synthetic */ DeFiUnifiedRewardsParams(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
