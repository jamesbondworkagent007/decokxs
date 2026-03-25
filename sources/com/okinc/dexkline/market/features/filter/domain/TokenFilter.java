package com.okinc.dexkline.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.market.common.constants.TokenAgeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TokenFilter implements Parcelable {
    public static final Parcelable.Creator<TokenFilter> CREATOR = new Creator();
    public final List<String> AEQbTJ;
    public final boolean AYXKKw;
    public final PriceRangeFilter AhwBna;
    public final String AkhnZx;
    public final String DbNXlk;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public final TimeRangeFilter fetchVPNInfo;
    public final PriceRangeFilter gEmmrt;
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
            return new TokenFilter(string, string2, string3, creator.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, creator.createFromParcel(parcel), TimeRangeFilter.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
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
        this(null, null, null, null, null, false, false, null, false, false, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PriceRangeFilter priceRangeFilter, @NotNull List<String> list, boolean z, boolean z2, @NotNull String str4, boolean z3, boolean z4, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull TimeRangeFilter timeRangeFilter, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TokenFilter(str, str2, str3, priceRangeFilter, list, z, z2, str4, z3, z4, priceRangeFilter2, timeRangeFilter, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeRangeFilter djBIcL() {
        return this.fetchVPNInfo;
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
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) tokenFilter.copydefault) && Intrinsics.EZpvd((Object) this.isConnected, (Object) tokenFilter.isConnected) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) tokenFilter.DbNXlk) && Intrinsics.EZpvd(this.AhwBna, tokenFilter.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, tokenFilter.AEQbTJ) && this.valueOf == tokenFilter.valueOf && this.djBIcL == tokenFilter.djBIcL && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tokenFilter.EZpvd) && this.AYXKKw == tokenFilter.AYXKKw && this.OLrzqt == tokenFilter.OLrzqt && Intrinsics.EZpvd(this.gEmmrt, tokenFilter.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, tokenFilter.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tokenFilter.KWHzl) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) tokenFilter.AkhnZx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.copydefault.hashCode() * 31) + this.isConnected.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.gEmmrt.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AkhnZx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenFilter(chainId=" + this.copydefault + ", tokenAddress=" + this.isConnected + ", type=" + this.DbNXlk + ", priceRange=" + this.AhwBna + ", addressList=" + this.AEQbTJ + ", showTurnoverTitle=" + this.valueOf + ", showAddress=" + this.djBIcL + ", addressLabel=" + this.EZpvd + ", showTimeRange=" + this.AYXKKw + ", historyIsPrice=" + this.OLrzqt + ", historyPriceRange=" + this.gEmmrt + ", timeRange=" + this.fetchVPNInfo + ", chainName=" + this.KWHzl + ", tokenSymbol=" + this.AkhnZx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.DbNXlk);
        this.AhwBna.writeToParcel(parcel, i);
        parcel.writeStringList(this.AEQbTJ);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        this.gEmmrt.writeToParcel(parcel, i);
        this.fetchVPNInfo.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AkhnZx);
    }

    public TokenFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull PriceRangeFilter priceRangeFilter, @NotNull List<String> list, boolean z, boolean z2, @NotNull String str4, boolean z3, boolean z4, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull TimeRangeFilter timeRangeFilter, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(timeRangeFilter, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.isConnected = str2;
        this.DbNXlk = str3;
        this.AhwBna = priceRangeFilter;
        this.AEQbTJ = list;
        this.valueOf = z;
        this.djBIcL = z2;
        this.EZpvd = str4;
        this.AYXKKw = z3;
        this.OLrzqt = z4;
        this.gEmmrt = priceRangeFilter2;
        this.fetchVPNInfo = timeRangeFilter;
        this.KWHzl = str5;
        this.AkhnZx = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x001c: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.dexkline.market.common.constants.TokenAgeType:?: CAST (com.okinc.dexkline.market.common.constants.TokenAgeType) (null com.okinc.dexkline.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0033: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r27v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r37v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : true)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r37v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r32v0 boolean) : false)
  (wrap:com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0066: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.dexkline.market.common.constants.TokenAgeType:?: CAST (com.okinc.dexkline.market.common.constants.TokenAgeType) (null com.okinc.dexkline.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.dexkline.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r33v0 com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter:?: TERNARY null = ((wrap:int:0x0095: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00af: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter.<init>(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r34v0 com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bd: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r36v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter, java.util.List<java.lang.String>, boolean, boolean, java.lang.String, boolean, boolean, com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter, com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.dexkline.market.features.filter.domain.TokenFilter.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter, java.util.List, boolean, boolean, java.lang.String, boolean, boolean, com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter, com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenFilter(String str, String str2, String str3, PriceRangeFilter priceRangeFilter, List list, boolean z, boolean z2, String str4, boolean z3, boolean z4, PriceRangeFilter priceRangeFilter2, TimeRangeFilter timeRangeFilter, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? true : z, (i & 64) == 0 ? z2 : true, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? false : z3, (i & 512) == 0 ? z4 : false, (i & 1024) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter2, (i & 2048) != 0 ? new TimeRangeFilter((String) null, (String) null, false, 7, (DefaultConstructorMarker) null) : timeRangeFilter, (i & 4096) != 0 ? "" : str5, (i & 8192) == 0 ? str6 : "");
    }
}
