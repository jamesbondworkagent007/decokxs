package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AssetRawData implements Parcelable {
    public static final Parcelable.Creator<AssetRawData> CREATOR = new Creator();
    public final ProductDetailsByChain AEQbTJ;
    public final InvestUserRewardsAction AYXKKw;
    public final Long AhwBna;
    public final String AkhnZx;
    public final Long EZpvd;
    public final InvestAction KWHzl;
    public final String OLrzqt;
    public final List<InvestUserRewardElementInfo> copydefault;
    public final boolean djBIcL;
    public final RewardType gEmmrt;
    public final boolean valueOf;

    public static final class Creator implements Parcelable.Creator<AssetRawData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRawData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            InvestAction investActionValueOf = parcel.readInt() == 0 ? null : InvestAction.valueOf(parcel.readString());
            InvestUserRewardsAction investUserRewardsActionValueOf = parcel.readInt() == 0 ? null : InvestUserRewardsAction.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestUserRewardElementInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetRawData(investActionValueOf, investUserRewardsActionValueOf, string, arrayList, parcel.readInt() == 0 ? null : ProductDetailsByChain.CREATOR.createFromParcel(parcel), parcel.readString(), RewardType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetRawData[] newArray(int i) {
            return new AssetRawData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetRawData() {
        this(null, null, null, null, null, null, null, false, null, null, false, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsByChain AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardType AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardElementInfo> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAction copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetRawData copydefault(InvestAction investAction, InvestUserRewardsAction investUserRewardsAction, String str, List<InvestUserRewardElementInfo> list, ProductDetailsByChain productDetailsByChain, String str2, @NotNull RewardType rewardType, boolean z, Long l, Long l2, boolean z2) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        return new AssetRawData(investAction, investUserRewardsAction, str, list, productDetailsByChain, str2, rewardType, z, l, l2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetRawData)) {
            return false;
        }
        AssetRawData assetRawData = (AssetRawData) obj;
        return this.KWHzl == assetRawData.KWHzl && this.AYXKKw == assetRawData.AYXKKw && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) assetRawData.OLrzqt) && Intrinsics.EZpvd(this.copydefault, assetRawData.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, assetRawData.AEQbTJ) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) assetRawData.AkhnZx) && this.gEmmrt == assetRawData.gEmmrt && this.djBIcL == assetRawData.djBIcL && Intrinsics.EZpvd(this.AhwBna, assetRawData.AhwBna) && Intrinsics.EZpvd(this.EZpvd, assetRawData.EZpvd) && this.valueOf == assetRawData.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardsAction gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestAction investAction = this.KWHzl;
        int iHashCode = investAction == null ? 0 : investAction.hashCode();
        InvestUserRewardsAction investUserRewardsAction = this.AYXKKw;
        int iHashCode2 = investUserRewardsAction == null ? 0 : investUserRewardsAction.hashCode();
        String str = this.OLrzqt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<InvestUserRewardElementInfo> list = this.copydefault;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        ProductDetailsByChain productDetailsByChain = this.AEQbTJ;
        int iHashCode5 = productDetailsByChain == null ? 0 : productDetailsByChain.hashCode();
        String str2 = this.AkhnZx;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = this.gEmmrt.hashCode();
        int iHashCode8 = Boolean.hashCode(this.djBIcL);
        Long l = this.AhwBna;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Long l2 = this.EZpvd;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + Boolean.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetRawData(action=" + this.KWHzl + ", mode=" + this.AYXKKw + ", callDataExtJson=" + this.OLrzqt + ", claimingTokens=" + this.copydefault + ", chainDetails=" + this.AEQbTJ + ", tokenId=" + this.AkhnZx + ", rewardType=" + this.gEmmrt + ", showIncreaseLiquidity=" + this.djBIcL + ", protocolId=" + this.AhwBna + ", chainId=" + this.EZpvd + ", isFeeRewards=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestAction investAction = this.KWHzl;
        if (investAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(investAction.name());
        }
        InvestUserRewardsAction investUserRewardsAction = this.AYXKKw;
        if (investUserRewardsAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(investUserRewardsAction.name());
        }
        parcel.writeString(this.OLrzqt);
        List<InvestUserRewardElementInfo> list = this.copydefault;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestUserRewardElementInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        ProductDetailsByChain productDetailsByChain = this.AEQbTJ;
        if (productDetailsByChain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productDetailsByChain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AkhnZx);
        parcel.writeString(this.gEmmrt.name());
        parcel.writeInt(this.djBIcL ? 1 : 0);
        Long l = this.AhwBna;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.EZpvd;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.valueOf ? 1 : 0);
    }

    public AssetRawData(InvestAction investAction, InvestUserRewardsAction investUserRewardsAction, String str, List<InvestUserRewardElementInfo> list, ProductDetailsByChain productDetailsByChain, String str2, @NotNull RewardType rewardType, boolean z, Long l, Long l2, boolean z2) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        this.KWHzl = investAction;
        this.AYXKKw = investUserRewardsAction;
        this.OLrzqt = str;
        this.copydefault = list;
        this.AEQbTJ = productDetailsByChain;
        this.AkhnZx = str2;
        this.gEmmrt = rewardType;
        this.djBIcL = z;
        this.AhwBna = l;
        this.EZpvd = l2;
        this.valueOf = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.contants.InvestAction:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.contants.InvestAction) : (r14v0 com.okinc.business.invest_biz.data.contants.InvestAction))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction) : (r15v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain) : (r18v0 com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.RewardType:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] (LINE:129) com.okinc.business.invest_biz.data.bean.RewardType.OKX_BONUS com.okinc.business.invest_biz.data.bean.RewardType) : (r20v0 com.okinc.business.invest_biz.data.bean.RewardType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0043: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004b: ARITH (r25v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.Long) : (null java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0052: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
 A[MD:(com.okinc.business.invest_biz.data.contants.InvestAction, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo>, com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain, java.lang.String, com.okinc.business.invest_biz.data.bean.RewardType, boolean, java.lang.Long, java.lang.Long, boolean):void (m)] (LINE:122) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData.<init>(com.okinc.business.invest_biz.data.contants.InvestAction, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain, java.lang.String, com.okinc.business.invest_biz.data.bean.RewardType, boolean, java.lang.Long, java.lang.Long, boolean):void type: THIS */
    public /* synthetic */ AssetRawData(InvestAction investAction, InvestUserRewardsAction investUserRewardsAction, String str, List list, ProductDetailsByChain productDetailsByChain, String str2, RewardType rewardType, boolean z, Long l, Long l2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investAction, (i & 2) != 0 ? null : investUserRewardsAction, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : productDetailsByChain, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? RewardType.OKX_BONUS : rewardType, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : l, (i & 512) == 0 ? l2 : null, (i & 1024) == 0 ? z2 : false);
    }
}
