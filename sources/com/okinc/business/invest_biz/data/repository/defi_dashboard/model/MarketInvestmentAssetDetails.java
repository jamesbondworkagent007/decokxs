package com.okinc.business.invest_biz.data.repository.defi_dashboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketInvestmentAssetDetails implements Parcelable {
    public final List<MarketInvestmentItem> EZpvd;
    public final int OLrzqt;
    public final List<InvestUserRewardInfoByInvestment> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final Parcelable.Creator<MarketInvestmentAssetDetails> CREATOR = new Creator();
    public static final MarketInvestmentAssetDetails KWHzl = new MarketInvestmentAssetDetails(null, 0, null, 7, null);

    public static final class Creator implements Parcelable.Creator<MarketInvestmentAssetDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInvestmentAssetDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MarketInvestmentItem.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            return new MarketInvestmentAssetDetails(arrayList, i3, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketInvestmentAssetDetails[] newArray(int i) {
            return new MarketInvestmentAssetDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketInvestmentAssetDetails() {
        this(null, 0, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketInvestmentAssetDetails copy$default(MarketInvestmentAssetDetails marketInvestmentAssetDetails, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = marketInvestmentAssetDetails.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = marketInvestmentAssetDetails.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            list2 = marketInvestmentAssetDetails.copydefault;
        }
        return marketInvestmentAssetDetails.OLrzqt(list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInvestmentAssetDetails OLrzqt(@NotNull List<MarketInvestmentItem> list, int i, @NotNull List<InvestUserRewardInfoByInvestment> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new MarketInvestmentAssetDetails(list, i, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketInvestmentItem> OLrzqt() {
        return this.EZpvd;
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
        if (!(obj instanceof MarketInvestmentAssetDetails)) {
            return false;
        }
        MarketInvestmentAssetDetails marketInvestmentAssetDetails = (MarketInvestmentAssetDetails) obj;
        return Intrinsics.EZpvd(this.EZpvd, marketInvestmentAssetDetails.EZpvd) && this.OLrzqt == marketInvestmentAssetDetails.OLrzqt && Intrinsics.EZpvd(this.copydefault, marketInvestmentAssetDetails.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketInvestmentAssetDetails(marketInvestmentItems=" + this.EZpvd + ", investmentCategory=" + this.OLrzqt + ", singleMarketRewards=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<MarketInvestmentItem> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<MarketInvestmentItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.OLrzqt);
        List<InvestUserRewardInfoByInvestment> list2 = this.copydefault;
        parcel.writeInt(list2.size());
        Iterator<InvestUserRewardInfoByInvestment> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public MarketInvestmentAssetDetails(@NotNull List<MarketInvestmentItem> list, int i, @NotNull List<InvestUserRewardInfoByInvestment> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.OLrzqt = i;
        this.copydefault = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:161)) : (r1v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:163)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentItem>, int, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>):void (m)] (LINE:160) call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails.<init>(java.util.List, int, java.util.List):void type: THIS */
    public /* synthetic */ MarketInvestmentAssetDetails(List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final MarketInvestmentAssetDetails OLrzqt() {
            return MarketInvestmentAssetDetails.KWHzl;
        }
    }
}
