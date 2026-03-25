package com.okinc.business.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RangeFilterConfig implements Parcelable {
    public static final Parcelable.Creator<RangeFilterConfig> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String OLrzqt;
    public final TokenAgeType copydefault;

    public static final class Creator implements Parcelable.Creator<RangeFilterConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RangeFilterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RangeFilterConfig(parcel.readString(), parcel.readString(), parcel.readString(), TokenAgeType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RangeFilterConfig[] newArray(int i) {
            return new RangeFilterConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RangeFilterConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RangeFilterConfig copy$default(RangeFilterConfig rangeFilterConfig, String str, String str2, String str3, TokenAgeType tokenAgeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rangeFilterConfig.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = rangeFilterConfig.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = rangeFilterConfig.OLrzqt;
        }
        if ((i & 8) != 0) {
            tokenAgeType = rangeFilterConfig.copydefault;
        }
        return rangeFilterConfig.copydefault(str, str2, str3, tokenAgeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RangeFilterConfig copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TokenAgeType tokenAgeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        return new RangeFilterConfig(str, str2, str3, tokenAgeType);
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
        if (!(obj instanceof RangeFilterConfig)) {
            return false;
        }
        RangeFilterConfig rangeFilterConfig = (RangeFilterConfig) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) rangeFilterConfig.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) rangeFilterConfig.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) rangeFilterConfig.OLrzqt) && this.copydefault == rangeFilterConfig.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RangeFilterConfig(minValue=" + this.AEQbTJ + ", maxValue=" + this.EZpvd + ", defaultValue=" + this.OLrzqt + ", tokenAgeType=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.copydefault.name());
    }

    public RangeFilterConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TokenAgeType tokenAgeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        this.AEQbTJ = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.copydefault = tokenAgeType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.TokenAgeType:0x0015: SGET  A[WRAPPED] (LINE:12) com.okinc.business.market.common.constants.TokenAgeType.DEFAULT com.okinc.business.market.common.constants.TokenAgeType) : (r5v0 com.okinc.business.market.common.constants.TokenAgeType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType):void (m)] (LINE:8) call: com.okinc.business.market.features.filter.domain.RangeFilterConfig.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType):void type: THIS */
    public /* synthetic */ RangeFilterConfig(String str, String str2, String str3, TokenAgeType tokenAgeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? TokenAgeType.DEFAULT : tokenAgeType);
    }
}
