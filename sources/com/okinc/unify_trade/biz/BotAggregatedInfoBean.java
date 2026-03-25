package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.StgyParam;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BotAggregatedInfoBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotAggregatedInfoBean> CREATOR = new Creator();
    private final StgyParam botParam;
    private final List<String> eligibleInstIds;
    private final GridStatistics strategyStatistics;
    private final LossInsuranceBean voucherInformation;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotAggregatedInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAggregatedInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotAggregatedInfoBean(parcel.readInt() == 0 ? null : StgyParam.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GridStatistics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LossInsuranceBean.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAggregatedInfoBean[] newArray(int i) {
            return new BotAggregatedInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotAggregatedInfoBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotAggregatedInfoBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotAggregatedInfoBean copy$default(BotAggregatedInfoBean botAggregatedInfoBean, StgyParam stgyParam, GridStatistics gridStatistics, LossInsuranceBean lossInsuranceBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stgyParam = botAggregatedInfoBean.botParam;
        }
        if ((i & 2) != 0) {
            gridStatistics = botAggregatedInfoBean.strategyStatistics;
        }
        if ((i & 4) != 0) {
            lossInsuranceBean = botAggregatedInfoBean.voucherInformation;
        }
        if ((i & 8) != 0) {
            list = botAggregatedInfoBean.eligibleInstIds;
        }
        return botAggregatedInfoBean.copy(stgyParam, gridStatistics, lossInsuranceBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgyParam component1() {
        return this.botParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridStatistics component2() {
        return this.strategyStatistics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceBean component3() {
        return this.voucherInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.eligibleInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAggregatedInfoBean copy(StgyParam stgyParam, GridStatistics gridStatistics, LossInsuranceBean lossInsuranceBean, List<String> list) {
        return new BotAggregatedInfoBean(stgyParam, gridStatistics, lossInsuranceBean, list);
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
        if (!(obj instanceof BotAggregatedInfoBean)) {
            return false;
        }
        BotAggregatedInfoBean botAggregatedInfoBean = (BotAggregatedInfoBean) obj;
        return Intrinsics.EZpvd(this.botParam, botAggregatedInfoBean.botParam) && Intrinsics.EZpvd(this.strategyStatistics, botAggregatedInfoBean.strategyStatistics) && Intrinsics.EZpvd(this.voucherInformation, botAggregatedInfoBean.voucherInformation) && Intrinsics.EZpvd(this.eligibleInstIds, botAggregatedInfoBean.eligibleInstIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgyParam getBotParam() {
        return this.botParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEligibleInstIds() {
        return this.eligibleInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridStatistics getStrategyStatistics() {
        return this.strategyStatistics;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceBean getVoucherInformation() {
        return this.voucherInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        StgyParam stgyParam = this.botParam;
        int iHashCode = stgyParam == null ? 0 : stgyParam.hashCode();
        GridStatistics gridStatistics = this.strategyStatistics;
        int iHashCode2 = gridStatistics == null ? 0 : gridStatistics.hashCode();
        LossInsuranceBean lossInsuranceBean = this.voucherInformation;
        int iHashCode3 = lossInsuranceBean == null ? 0 : lossInsuranceBean.hashCode();
        List<String> list = this.eligibleInstIds;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAggregatedInfoBean(botParam=" + this.botParam + ", strategyStatistics=" + this.strategyStatistics + ", voucherInformation=" + this.voucherInformation + ", eligibleInstIds=" + this.eligibleInstIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        StgyParam stgyParam = this.botParam;
        if (stgyParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stgyParam.writeToParcel(parcel, i);
        }
        GridStatistics gridStatistics = this.strategyStatistics;
        if (gridStatistics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gridStatistics.writeToParcel(parcel, i);
        }
        LossInsuranceBean lossInsuranceBean = this.voucherInformation;
        if (lossInsuranceBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lossInsuranceBean.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.eligibleInstIds);
    }

    public BotAggregatedInfoBean(StgyParam stgyParam, GridStatistics gridStatistics, LossInsuranceBean lossInsuranceBean, List<String> list) {
        this.botParam = stgyParam;
        this.strategyStatistics = gridStatistics;
        this.voucherInformation = lossInsuranceBean;
        this.eligibleInstIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.bot.StgyParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.StgyParam) : (r2v0 com.okinc.unify_trade.biz.bot.StgyParam))
  (wrap:com.okinc.unify_trade.biz.GridStatistics:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.GridStatistics) : (r3v0 com.okinc.unify_trade.biz.GridStatistics))
  (wrap:com.okinc.unify_trade.biz.LossInsuranceBean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.LossInsuranceBean) : (r4v0 com.okinc.unify_trade.biz.LossInsuranceBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(com.okinc.unify_trade.biz.bot.StgyParam, com.okinc.unify_trade.biz.GridStatistics, com.okinc.unify_trade.biz.LossInsuranceBean, java.util.List<java.lang.String>):void (m)] (LINE:4432) call: com.okinc.unify_trade.biz.BotAggregatedInfoBean.<init>(com.okinc.unify_trade.biz.bot.StgyParam, com.okinc.unify_trade.biz.GridStatistics, com.okinc.unify_trade.biz.LossInsuranceBean, java.util.List):void type: THIS */
    public /* synthetic */ BotAggregatedInfoBean(StgyParam stgyParam, GridStatistics gridStatistics, LossInsuranceBean lossInsuranceBean, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stgyParam, (i & 2) != 0 ? null : gridStatistics, (i & 4) != 0 ? null : lossInsuranceBean, (i & 8) != 0 ? null : list);
    }
}
