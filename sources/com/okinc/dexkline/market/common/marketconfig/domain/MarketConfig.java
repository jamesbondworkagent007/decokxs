package com.okinc.dexkline.market.common.marketconfig.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketConfig implements Parcelable {
    public static final Parcelable.Creator<MarketConfig> CREATOR = new Creator();
    public final List<String> AEQbTJ;
    public final BannerConfig KWHzl;
    public final List<String> OLrzqt;
    public final List<String> copydefault;

    public static final class Creator implements Parcelable.Creator<MarketConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketConfig(parcel.createStringArrayList(), parcel.readInt() == 0 ? null : BannerConfig.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketConfig[] newArray(int i) {
            return new MarketConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketConfig copy$default(MarketConfig marketConfig, List list, BannerConfig bannerConfig, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketConfig.AEQbTJ;
        }
        if ((i & 2) != 0) {
            bannerConfig = marketConfig.KWHzl;
        }
        if ((i & 4) != 0) {
            list2 = marketConfig.OLrzqt;
        }
        if ((i & 8) != 0) {
            list3 = marketConfig.copydefault;
        }
        return marketConfig.AEQbTJ(list, bannerConfig, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketConfig AEQbTJ(@NotNull List<String> list, BannerConfig bannerConfig, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new MarketConfig(list, bannerConfig, list2, list3);
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
        if (!(obj instanceof MarketConfig)) {
            return false;
        }
        MarketConfig marketConfig = (MarketConfig) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, marketConfig.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, marketConfig.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, marketConfig.OLrzqt) && Intrinsics.EZpvd(this.copydefault, marketConfig.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        BannerConfig bannerConfig = this.KWHzl;
        return (((((iHashCode * 31) + (bannerConfig == null ? 0 : bannerConfig.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketConfig(supportChainsHolderDesc=" + this.AEQbTJ + ", bannerConfig=" + this.KWHzl + ", expandV2DataSupportedChains=" + this.OLrzqt + ", supportRugPull=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.AEQbTJ);
        BannerConfig bannerConfig = this.KWHzl;
        if (bannerConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bannerConfig.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.OLrzqt);
        parcel.writeStringList(this.copydefault);
    }

    public MarketConfig(@NotNull List<String> list, BannerConfig bannerConfig, @NotNull List<String> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.AEQbTJ = list;
        this.KWHzl = bannerConfig;
        this.OLrzqt = list2;
        this.copydefault = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:8)) : (r1v0 java.util.List))
  (wrap:com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig) : (r2v0 com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0019: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r4v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:7) call: com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig.<init>(java.util.List, com.okinc.dexkline.market.common.marketconfig.domain.BannerConfig, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ MarketConfig(List list, BannerConfig bannerConfig, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : bannerConfig, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? yDY.AhwBna() : list3);
    }
}
