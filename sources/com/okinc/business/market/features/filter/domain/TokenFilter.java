package com.okinc.business.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TokenAgeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenFilter implements Parcelable {
    public static final Parcelable.Creator<TokenFilter> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AYXKKw;
    public final PriceRangeFilter AhwBna;
    public final String AkhnZx;
    public final String EZpvd;
    public final List<String> KWHzl;
    public final boolean OLrzqt;
    public final PriceRangeFilter copydefault;
    public final TimeRangeFilter djBIcL;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final String isConnected;
    public final boolean valueOf;

    public static final class Creator implements Parcelable.Creator<TokenFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<PriceRangeFilter> creator = PriceRangeFilter.CREATOR;
            return new TokenFilter(string, string2, string3, creator.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, creator.createFromParcel(parcel), TimeRangeFilter.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenFilter[] newArray(int i) {
            return new TokenFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenFilter() {
        this(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PriceRangeFilter priceRangeFilter, @NotNull List<String> list, boolean z, boolean z2, @NotNull String str4, boolean z3, boolean z4, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull TimeRangeFilter timeRangeFilter, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenFilter(str, str2, str3, priceRangeFilter, list, z, z2, str4, z3, z4, priceRangeFilter2, timeRangeFilter, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenFilter)) {
            return false;
        }
        TokenFilter tokenFilter = (TokenFilter) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tokenFilter.AEQbTJ) && Intrinsics.EZpvd((Object) this.isConnected, (Object) tokenFilter.isConnected) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) tokenFilter.AkhnZx) && Intrinsics.EZpvd(this.AhwBna, tokenFilter.AhwBna) && Intrinsics.EZpvd(this.KWHzl, tokenFilter.KWHzl) && this.AYXKKw == tokenFilter.AYXKKw && this.valueOf == tokenFilter.valueOf && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenFilter.EZpvd) && this.gEmmrt == tokenFilter.gEmmrt && this.OLrzqt == tokenFilter.OLrzqt && Intrinsics.EZpvd(this.copydefault, tokenFilter.copydefault) && Intrinsics.EZpvd(this.djBIcL, tokenFilter.djBIcL) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) tokenFilter.fetchVPNInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.AEQbTJ.hashCode() * 31) + this.isConnected.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.fetchVPNInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenFilter(chainId=" + this.AEQbTJ + ", tokenAddress=" + this.isConnected + ", type=" + this.AkhnZx + ", priceRange=" + this.AhwBna + ", addressList=" + this.KWHzl + ", showTurnoverTitle=" + this.AYXKKw + ", showAddress=" + this.valueOf + ", addressLabel=" + this.EZpvd + ", showTimeRange=" + this.gEmmrt + ", historyIsPrice=" + this.OLrzqt + ", historyPriceRange=" + this.copydefault + ", timeRange=" + this.djBIcL + ", walletAddress=" + this.fetchVPNInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeRangeFilter valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.AkhnZx);
        this.AhwBna.writeToParcel(parcel, i);
        parcel.writeStringList(this.KWHzl);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        this.copydefault.writeToParcel(parcel, i);
        this.djBIcL.writeToParcel(parcel, i);
        parcel.writeString(this.fetchVPNInfo);
    }

    public TokenFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PriceRangeFilter priceRangeFilter, @NotNull List<String> list, boolean z, boolean z2, @NotNull String str4, boolean z3, boolean z4, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull TimeRangeFilter timeRangeFilter, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ = str;
        this.isConnected = str2;
        this.AkhnZx = str3;
        this.AhwBna = priceRangeFilter;
        this.KWHzl = list;
        this.AYXKKw = z;
        this.valueOf = z2;
        this.EZpvd = str4;
        this.gEmmrt = z3;
        this.OLrzqt = z4;
        this.copydefault = priceRangeFilter2;
        this.djBIcL = timeRangeFilter;
        this.fetchVPNInfo = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0033: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r27v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r36v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : true)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r36v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r32v0 boolean) : false)
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0066: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r33v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.TimeRangeFilter:?: TERNARY null = ((wrap:int:0x0095: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00af: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.market.features.filter.domain.TimeRangeFilter.<init>(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.business.market.features.filter.domain.TimeRangeFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.util.List<java.lang.String>, boolean, boolean, java.lang.String, boolean, boolean, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.TimeRangeFilter, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.features.filter.domain.TokenFilter.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.util.List, boolean, boolean, java.lang.String, boolean, boolean, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.TimeRangeFilter, java.lang.String):void type: THIS */
    public /* synthetic */ TokenFilter(String str, String str2, String str3, PriceRangeFilter priceRangeFilter, List list, boolean z, boolean z2, String str4, boolean z3, boolean z4, PriceRangeFilter priceRangeFilter2, TimeRangeFilter timeRangeFilter, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? true : z, (i & 64) == 0 ? z2 : true, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? false : z3, (i & 512) == 0 ? z4 : false, (i & 1024) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter2, (i & 2048) != 0 ? new TimeRangeFilter((String) null, (String) null, false, 7, (DefaultConstructorMarker) null) : timeRangeFilter, (i & 4096) == 0 ? str5 : "");
    }
}
