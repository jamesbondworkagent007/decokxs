package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public interface AssetBottomSheetData extends Parcelable {

    public static final class BonusBottomSheetData implements AssetBottomSheetData {
        public static final Parcelable.Creator<BonusBottomSheetData> CREATOR = new Creator();
        public final List<InvestUserRewardInfoByInvestment> OLrzqt;

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<BonusBottomSheetData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BonusBottomSheetData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                return new BonusBottomSheetData(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BonusBottomSheetData[] newArray(int i) {
                return new BonusBottomSheetData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BonusBottomSheetData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData$BonusBottomSheetData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BonusBottomSheetData copy$default(BonusBottomSheetData bonusBottomSheetData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bonusBottomSheetData.OLrzqt;
            }
            return bonusBottomSheetData.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BonusBottomSheetData AEQbTJ(@NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new BonusBottomSheetData(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardInfoByInvestment> EZpvd() {
            return this.OLrzqt;
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
            return (obj instanceof BonusBottomSheetData) && Intrinsics.EZpvd(this.OLrzqt, ((BonusBottomSheetData) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BonusBottomSheetData(rewards=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<InvestUserRewardInfoByInvestment> list = this.OLrzqt;
            parcel.writeInt(list.size());
            Iterator<InvestUserRewardInfoByInvestment> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public BonusBottomSheetData(@NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:95)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>):void (m)] (LINE:94) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData.BonusBottomSheetData.<init>(java.util.List):void type: THIS */
        public /* synthetic */ BonusBottomSheetData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class RewardBottomSheetData implements AssetBottomSheetData {
        public static final Parcelable.Creator<RewardBottomSheetData> CREATOR = new Creator();
        public final List<InvestUserRewardInfoByInvestment> copydefault;

        public static final class Creator implements Parcelable.Creator<RewardBottomSheetData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RewardBottomSheetData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                return new RewardBottomSheetData(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RewardBottomSheetData[] newArray(int i) {
                return new RewardBottomSheetData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RewardBottomSheetData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData$RewardBottomSheetData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RewardBottomSheetData copy$default(RewardBottomSheetData rewardBottomSheetData, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rewardBottomSheetData.copydefault;
            }
            return rewardBottomSheetData.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RewardBottomSheetData AEQbTJ(@NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new RewardBottomSheetData(list);
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
            return (obj instanceof RewardBottomSheetData) && Intrinsics.EZpvd(this.copydefault, ((RewardBottomSheetData) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RewardBottomSheetData(rewards=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<InvestUserRewardInfoByInvestment> list = this.copydefault;
            parcel.writeInt(list.size());
            Iterator<InvestUserRewardInfoByInvestment> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }

        public RewardBottomSheetData(@NotNull List<InvestUserRewardInfoByInvestment> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:100)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>):void (m)] (LINE:99) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData.RewardBottomSheetData.<init>(java.util.List):void type: THIS */
        public /* synthetic */ RewardBottomSheetData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }
    }

    public static final class PositionBottomSheetData implements AssetBottomSheetData {
        public static final Parcelable.Creator<PositionBottomSheetData> CREATOR = new Creator();
        public final List<InvestBaseDefiTokenInfo> KWHzl;
        public final List<InvestUserRewardInfoByInvestment> OLrzqt;
        public final List<InvestUserRewardInfoByInvestment> copydefault;

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<PositionBottomSheetData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionBottomSheetData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                return new PositionBottomSheetData(arrayList, arrayList2, arrayList3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionBottomSheetData[] newArray(int i) {
                return new PositionBottomSheetData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PositionBottomSheetData() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData$PositionBottomSheetData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PositionBottomSheetData copy$default(PositionBottomSheetData positionBottomSheetData, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = positionBottomSheetData.KWHzl;
            }
            if ((i & 2) != 0) {
                list2 = positionBottomSheetData.OLrzqt;
            }
            if ((i & 4) != 0) {
                list3 = positionBottomSheetData.copydefault;
            }
            return positionBottomSheetData.copydefault(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardInfoByInvestment> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestUserRewardInfoByInvestment> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PositionBottomSheetData copydefault(@NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestUserRewardInfoByInvestment> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            return new PositionBottomSheetData(list, list2, list3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestBaseDefiTokenInfo> copydefault() {
            return this.KWHzl;
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
            if (!(obj instanceof PositionBottomSheetData)) {
                return false;
            }
            PositionBottomSheetData positionBottomSheetData = (PositionBottomSheetData) obj;
            return Intrinsics.EZpvd(this.KWHzl, positionBottomSheetData.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, positionBottomSheetData.OLrzqt) && Intrinsics.EZpvd(this.copydefault, positionBottomSheetData.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PositionBottomSheetData(supplied=" + this.KWHzl + ", rewards=" + this.OLrzqt + ", unclaimedFeeRewards=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<InvestBaseDefiTokenInfo> list = this.KWHzl;
            parcel.writeInt(list.size());
            Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            List<InvestUserRewardInfoByInvestment> list2 = this.OLrzqt;
            parcel.writeInt(list2.size());
            Iterator<InvestUserRewardInfoByInvestment> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            List<InvestUserRewardInfoByInvestment> list3 = this.copydefault;
            parcel.writeInt(list3.size());
            Iterator<InvestUserRewardInfoByInvestment> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }

        public PositionBottomSheetData(@NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestUserRewardInfoByInvestment> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            this.KWHzl = list;
            this.OLrzqt = list2;
            this.copydefault = list3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:105)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:106)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:107)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>):void (m)] (LINE:104) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData.PositionBottomSheetData.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ PositionBottomSheetData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
        }
    }
}
