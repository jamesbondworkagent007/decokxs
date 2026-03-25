package com.okinc.business.market.features.scanner.surge.trending.ui.filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TrendingFilter implements Parcelable {
    public static final Parcelable.Creator<TrendingFilter> CREATOR = new Creator();
    public final String AEQbTJ;
    public final TokenAgeType AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final boolean copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<TrendingFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrendingFilter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), TokenAgeType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingFilter[] newArray(int i) {
            return new TrendingFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingFilter() {
        this(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingFilter copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull TokenAgeType tokenAgeType, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TrendingFilter(str, str2, str3, str4, str5, str6, tokenAgeType, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof TrendingFilter)) {
            return false;
        }
        TrendingFilter trendingFilter = (TrendingFilter) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) trendingFilter.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) trendingFilter.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) trendingFilter.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) trendingFilter.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) trendingFilter.AhwBna) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) trendingFilter.KWHzl) && this.AYXKKw == trendingFilter.AYXKKw && Intrinsics.EZpvd((Object) this.EZpvd, (Object) trendingFilter.EZpvd) && this.copydefault == trendingFilter.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingFilter(marketCapMin=" + this.OLrzqt + ", marketCapMax=" + this.AEQbTJ + ", volumeMin=" + this.gEmmrt + ", volumeMax=" + this.djBIcL + ", tokenAgeMin=" + this.AhwBna + ", tokenAgeMax=" + this.KWHzl + ", tokenAgeType=" + this.AYXKKw + ", keyword=" + this.EZpvd + ", needSocialLink=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public TrendingFilter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull TokenAgeType tokenAgeType, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.gEmmrt = str3;
        this.djBIcL = str4;
        this.AhwBna = str5;
        this.KWHzl = str6;
        this.AYXKKw = tokenAgeType;
        this.EZpvd = str7;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.filter.domain.TokenAgeType:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.features.meme.filter.domain.TokenAgeType.m com.okinc.business.market.features.meme.filter.domain.TokenAgeType) : (r17v0 com.okinc.business.market.features.meme.filter.domain.TokenAgeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TrendingFilter(String str, String str2, String str3, String str4, String str5, String str6, TokenAgeType tokenAgeType, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? TokenAgeType.m : tokenAgeType, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? false : z);
    }
}
