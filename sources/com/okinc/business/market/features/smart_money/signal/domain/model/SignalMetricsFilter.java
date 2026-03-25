package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalMetricsFilter implements Parcelable {
    public static final Parcelable.Creator<SignalMetricsFilter> CREATOR = new Creator();
    public final PriceRangeFilter AEQbTJ;
    public final PriceRangeFilter AYXKKw;
    public final String AhwBna;
    public final PriceRangeFilter EZpvd;
    public final PriceRangeFilter KWHzl;
    public final String OLrzqt;
    public final PriceRangeFilter copydefault;
    public final PriceRangeFilter djBIcL;
    public final TokenAgeType valueOf;

    public static final class Creator implements Parcelable.Creator<SignalMetricsFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMetricsFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<PriceRangeFilter> creator = PriceRangeFilter.CREATOR;
            return new SignalMetricsFilter(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), TokenAgeType.valueOf(parcel.readString()), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMetricsFilter[] newArray(int i) {
            return new SignalMetricsFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalMetricsFilter() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMetricsFilter EZpvd(@NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull String str, @NotNull String str2, @NotNull TokenAgeType tokenAgeType, @NotNull PriceRangeFilter priceRangeFilter4, @NotNull PriceRangeFilter priceRangeFilter5, @NotNull PriceRangeFilter priceRangeFilter6) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter5, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter6, "");
        return new SignalMetricsFilter(priceRangeFilter, priceRangeFilter2, priceRangeFilter3, str, str2, tokenAgeType, priceRangeFilter4, priceRangeFilter5, priceRangeFilter6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalMetricsFilter)) {
            return false;
        }
        SignalMetricsFilter signalMetricsFilter = (SignalMetricsFilter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, signalMetricsFilter.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, signalMetricsFilter.AYXKKw) && Intrinsics.EZpvd(this.EZpvd, signalMetricsFilter.EZpvd) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) signalMetricsFilter.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalMetricsFilter.OLrzqt) && this.valueOf == signalMetricsFilter.valueOf && Intrinsics.EZpvd(this.djBIcL, signalMetricsFilter.djBIcL) && Intrinsics.EZpvd(this.KWHzl, signalMetricsFilter.KWHzl) && Intrinsics.EZpvd(this.copydefault, signalMetricsFilter.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.AEQbTJ.hashCode() * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMetricsFilter(marketCapRange=" + this.AEQbTJ + ", volumeRange=" + this.AYXKKw + ", holdersRange=" + this.EZpvd + ", tokenAgeMin=" + this.AhwBna + ", tokenAgeMax=" + this.OLrzqt + ", tokenAgeType=" + this.valueOf + ", transactionsRange=" + this.djBIcL + ", buyTransactions=" + this.KWHzl + ", sellTransactions=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AEQbTJ.writeToParcel(parcel, i);
        this.AYXKKw.writeToParcel(parcel, i);
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.valueOf.name());
        this.djBIcL.writeToParcel(parcel, i);
        this.KWHzl.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
    }

    public SignalMetricsFilter(@NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull String str, @NotNull String str2, @NotNull TokenAgeType tokenAgeType, @NotNull PriceRangeFilter priceRangeFilter4, @NotNull PriceRangeFilter priceRangeFilter5, @NotNull PriceRangeFilter priceRangeFilter6) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter5, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter6, "");
        this.AEQbTJ = priceRangeFilter;
        this.AYXKKw = priceRangeFilter2;
        this.EZpvd = priceRangeFilter3;
        this.AhwBna = str;
        this.OLrzqt = str2;
        this.valueOf = tokenAgeType;
        this.djBIcL = priceRangeFilter4;
        this.KWHzl = priceRangeFilter5;
        this.copydefault = priceRangeFilter6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00d1: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0019: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:22) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0030: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r29v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:com.okinc.business.market.features.meme.filter.domain.TokenAgeType:?: TERNARY null = ((wrap:int:0x0058: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: SGET  A[WRAPPED] (LINE:26) com.okinc.business.market.features.meme.filter.domain.TokenAgeType.m com.okinc.business.market.features.meme.filter.domain.TokenAgeType) : (r25v0 com.okinc.business.market.features.meme.filter.domain.TokenAgeType))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0061: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:27) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0079: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:28) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0092: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b7: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r28v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void (m)] (LINE:20) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void type: THIS */
    public /* synthetic */ SignalMetricsFilter(PriceRangeFilter priceRangeFilter, PriceRangeFilter priceRangeFilter2, PriceRangeFilter priceRangeFilter3, String str, String str2, TokenAgeType tokenAgeType, PriceRangeFilter priceRangeFilter4, PriceRangeFilter priceRangeFilter5, PriceRangeFilter priceRangeFilter6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter, (i & 2) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter2, (i & 4) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter3, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? TokenAgeType.m : tokenAgeType, (i & 64) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter4, (i & 128) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter5, (i & 256) != 0 ? new PriceRangeFilter((String) null, (String) null, (com.okinc.business.market.common.constants.TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter6);
    }
}
