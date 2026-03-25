package com.okinc.business.invest_biz.data.repository.defi_dashboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData;
import com.okinc.business.invest_biz.data.bean.response.PositionInfo;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestmentAssetDetails implements Parcelable {
    public final List<PositionInfo> AYXKKw;
    public final List<InvestUserRewardInfoByInvestment> AhwBna;
    public final Map<RewardType, List<InvestUserRewardInfoByInvestment>> EZpvd;
    public final AssetRawData KWHzl;
    public final List<InvestBaseDefiTokenInfo> copydefault;
    public final List<InvestUserRewardInfoByInvestment> djBIcL;
    public final List<InvestBaseDefiTokenInfo> gEmmrt;
    public final List<InvestExtraAssetData> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<InvestmentAssetDetails> CREATOR = new Creator();
    public static final InvestmentAssetDetails AEQbTJ = new InvestmentAssetDetails(null, null, null, null, null, null, null, null, 255, null);

    public static final class Creator implements Parcelable.Creator<InvestmentAssetDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentAssetDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                RewardType rewardTypeValueOf = RewardType.valueOf(parcel.readString());
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList4.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap.put(rewardTypeValueOf, arrayList4);
            }
            int i11 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList5.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList6.add(PositionInfo.CREATOR.createFromParcel(parcel));
            }
            AssetRawData assetRawDataCreateFromParcel = parcel.readInt() == 0 ? null : AssetRawData.CREATOR.createFromParcel(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList7.add(InvestExtraAssetData.CREATOR.createFromParcel(parcel));
            }
            return new InvestmentAssetDetails(arrayList, arrayList2, arrayList3, linkedHashMap, arrayList5, arrayList6, assetRawDataCreateFromParcel, arrayList7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestmentAssetDetails[] newArray(int i) {
            return new InvestmentAssetDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentAssetDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionInfo> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestExtraAssetData> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentAssetDetails KWHzl(@NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, @NotNull Map<RewardType, ? extends List<InvestUserRewardInfoByInvestment>> map, @NotNull List<InvestUserRewardInfoByInvestment> list4, @NotNull List<PositionInfo> list5, AssetRawData assetRawData, @NotNull List<InvestExtraAssetData> list6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        return new InvestmentAssetDetails(list, list2, list3, map, list4, list5, assetRawData, list6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRawData OLrzqt() {
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
        if (!(obj instanceof InvestmentAssetDetails)) {
            return false;
        }
        InvestmentAssetDetails investmentAssetDetails = (InvestmentAssetDetails) obj;
        return Intrinsics.EZpvd(this.gEmmrt, investmentAssetDetails.gEmmrt) && Intrinsics.EZpvd(this.copydefault, investmentAssetDetails.copydefault) && Intrinsics.EZpvd(this.djBIcL, investmentAssetDetails.djBIcL) && Intrinsics.EZpvd(this.EZpvd, investmentAssetDetails.EZpvd) && Intrinsics.EZpvd(this.AhwBna, investmentAssetDetails.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, investmentAssetDetails.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, investmentAssetDetails.KWHzl) && Intrinsics.EZpvd(this.valueOf, investmentAssetDetails.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        AssetRawData assetRawData = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (assetRawData == null ? 0 : assetRawData.hashCode())) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentAssetDetails(investedAssets=" + this.gEmmrt + ", borrowedAssets=" + this.copydefault + ", claimableRewards=" + this.djBIcL + ", claimableBonus=" + this.EZpvd + ", unclaimedFeeRewards=" + this.AhwBna + ", positionInfoList=" + this.AYXKKw + ", claimParams=" + this.KWHzl + ", extraAssetList=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestBaseDefiTokenInfo> list = this.gEmmrt;
        parcel.writeInt(list.size());
        Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<InvestBaseDefiTokenInfo> list2 = this.copydefault;
        parcel.writeInt(list2.size());
        Iterator<InvestBaseDefiTokenInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InvestUserRewardInfoByInvestment> list3 = this.djBIcL;
        parcel.writeInt(list3.size());
        Iterator<InvestUserRewardInfoByInvestment> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        Map<RewardType, List<InvestUserRewardInfoByInvestment>> map = this.EZpvd;
        parcel.writeInt(map.size());
        for (Map.Entry<RewardType, List<InvestUserRewardInfoByInvestment>> entry : map.entrySet()) {
            parcel.writeString(entry.getKey().name());
            List<InvestUserRewardInfoByInvestment> value = entry.getValue();
            parcel.writeInt(value.size());
            Iterator<InvestUserRewardInfoByInvestment> it4 = value.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<InvestUserRewardInfoByInvestment> list4 = this.AhwBna;
        parcel.writeInt(list4.size());
        Iterator<InvestUserRewardInfoByInvestment> it5 = list4.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        List<PositionInfo> list5 = this.AYXKKw;
        parcel.writeInt(list5.size());
        Iterator<PositionInfo> it6 = list5.iterator();
        while (it6.hasNext()) {
            it6.next().writeToParcel(parcel, i);
        }
        AssetRawData assetRawData = this.KWHzl;
        if (assetRawData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assetRawData.writeToParcel(parcel, i);
        }
        List<InvestExtraAssetData> list6 = this.valueOf;
        parcel.writeInt(list6.size());
        Iterator<InvestExtraAssetData> it7 = list6.iterator();
        while (it7.hasNext()) {
            it7.next().writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.okinc.business.invest_biz.data.bean.RewardType, ? extends java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>> */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestmentAssetDetails(@NotNull List<InvestBaseDefiTokenInfo> list, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull List<InvestUserRewardInfoByInvestment> list3, @NotNull Map<RewardType, ? extends List<InvestUserRewardInfoByInvestment>> map, @NotNull List<InvestUserRewardInfoByInvestment> list4, @NotNull List<PositionInfo> list5, AssetRawData assetRawData, @NotNull List<InvestExtraAssetData> list6) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        this.gEmmrt = list;
        this.copydefault = list2;
        this.djBIcL = list3;
        this.EZpvd = map;
        this.AhwBna = list4;
        this.AYXKKw = list5;
        this.KWHzl = assetRawData;
        this.valueOf = list6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:73)) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:74)) : (r11v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:75)) : (r12v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:76)) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0034: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:77)) : (r14v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData:?: TERNARY null = ((wrap:int:0x003e: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData) : (r15v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0045: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:79)) : (r16v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.util.Map<com.okinc.business.invest_biz.data.bean.RewardType, ? extends java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.util.List<com.okinc.business.invest_biz.data.bean.response.PositionInfo>, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, java.util.List<com.okinc.business.invest_biz.data.bean.response.InvestExtraAssetData>):void (m)] (LINE:71) call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.<init>(java.util.List, java.util.List, java.util.List, java.util.Map, java.util.List, java.util.List, com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData, java.util.List):void type: THIS */
    public /* synthetic */ InvestmentAssetDetails(List list, List list2, List list3, Map map, List list4, List list5, AssetRawData assetRawData, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? C56424yEw.KWHzl() : map, (i & 16) != 0 ? yDY.AhwBna() : list4, (i & 32) != 0 ? yDY.AhwBna() : list5, (i & 64) != 0 ? null : assetRawData, (i & 128) != 0 ? yDY.AhwBna() : list6);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final InvestmentAssetDetails OLrzqt() {
            return InvestmentAssetDetails.AEQbTJ;
        }
    }
}
