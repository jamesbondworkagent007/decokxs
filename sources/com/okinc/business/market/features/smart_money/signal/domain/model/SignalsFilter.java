package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalsFilter implements Parcelable {
    public static final Parcelable.Creator<SignalsFilter> CREATOR = new Creator();
    public final PriceRangeFilter AEQbTJ;
    public final PriceRangeFilter EZpvd;
    public final PriceRangeFilter KWHzl;
    public final PriceRangeFilter copydefault;

    public static final class Creator implements Parcelable.Creator<SignalsFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalsFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<PriceRangeFilter> creator = PriceRangeFilter.CREATOR;
            return new SignalsFilter(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalsFilter[] newArray(int i) {
            return new SignalsFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalsFilter() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalsFilter copy$default(SignalsFilter signalsFilter, PriceRangeFilter priceRangeFilter, PriceRangeFilter priceRangeFilter2, PriceRangeFilter priceRangeFilter3, PriceRangeFilter priceRangeFilter4, int i, Object obj) {
        if ((i & 1) != 0) {
            priceRangeFilter = signalsFilter.AEQbTJ;
        }
        if ((i & 2) != 0) {
            priceRangeFilter2 = signalsFilter.KWHzl;
        }
        if ((i & 4) != 0) {
            priceRangeFilter3 = signalsFilter.EZpvd;
        }
        if ((i & 8) != 0) {
            priceRangeFilter4 = signalsFilter.copydefault;
        }
        return signalsFilter.copydefault(priceRangeFilter, priceRangeFilter2, priceRangeFilter3, priceRangeFilter4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalsFilter copydefault(@NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull PriceRangeFilter priceRangeFilter4) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        return new SignalsFilter(priceRangeFilter, priceRangeFilter2, priceRangeFilter3, priceRangeFilter4);
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
        if (!(obj instanceof SignalsFilter)) {
            return false;
        }
        SignalsFilter signalsFilter = (SignalsFilter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, signalsFilter.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, signalsFilter.KWHzl) && Intrinsics.EZpvd(this.EZpvd, signalsFilter.EZpvd) && Intrinsics.EZpvd(this.copydefault, signalsFilter.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalsFilter(numAddresses=" + this.AEQbTJ + ", turnover=" + this.KWHzl + ", alertMarketCap=" + this.EZpvd + ", alertLiquidity=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AEQbTJ.writeToParcel(parcel, i);
        this.KWHzl.writeToParcel(parcel, i);
        this.EZpvd.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
    }

    public SignalsFilter(@NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull PriceRangeFilter priceRangeFilter4) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        this.AEQbTJ = priceRangeFilter;
        this.KWHzl = priceRangeFilter2;
        this.EZpvd = priceRangeFilter3;
        this.copydefault = priceRangeFilter4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005d: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0016: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x002d: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0044: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void (m)] (LINE:12) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void type: THIS */
    public /* synthetic */ SignalsFilter(PriceRangeFilter priceRangeFilter, PriceRangeFilter priceRangeFilter2, PriceRangeFilter priceRangeFilter3, PriceRangeFilter priceRangeFilter4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter, (i & 2) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter2, (i & 4) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter3, (i & 8) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter4);
    }
}
