package com.okinc.business.invest_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RecommendedInvestment implements Parcelable {
    public static final int $stable = 0;
    public static final int INVESTMENT_TYPE_BORROW = 6;
    public static final int INVESTMENT_TYPE_FARM = 3;
    public static final int INVESTMENT_TYPE_POOL = 2;
    public static final int INVESTMENT_TYPE_SAVE = 1;
    public static final int INVESTMENT_TYPE_STAKE = 5;
    public static final int INVESTMENT_TYPE_VAULTS = 4;
    public static final int RATE_TYPE_APR = 1;
    public static final int RATE_TYPE_APY = 0;
    private final long aggregateId;
    private final String browserUrl;
    private final long investmentId;
    private final String label;
    private final String networkLogo;
    private final String nightNetworkLogo;
    private final String platformLogo;
    private final String platformName;
    private final String rate;
    private final int rateType;
    private final String rateTypeDesc;
    private final String tvl;
    private final int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecommendedInvestment> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecommendedInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedInvestment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecommendedInvestment(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendedInvestment[] newArray(int i) {
            return new RecommendedInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendedInvestment() {
        this(0L, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendedInvestment copy(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new RecommendedInvestment(j, str, j2, str2, str3, str4, str5, str6, str7, i, str8, str9, i2);
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
        if (!(obj instanceof RecommendedInvestment)) {
            return false;
        }
        RecommendedInvestment recommendedInvestment = (RecommendedInvestment) obj;
        return this.aggregateId == recommendedInvestment.aggregateId && Intrinsics.EZpvd((Object) this.browserUrl, (Object) recommendedInvestment.browserUrl) && this.investmentId == recommendedInvestment.investmentId && Intrinsics.EZpvd((Object) this.label, (Object) recommendedInvestment.label) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) recommendedInvestment.networkLogo) && Intrinsics.EZpvd((Object) this.nightNetworkLogo, (Object) recommendedInvestment.nightNetworkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) recommendedInvestment.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) recommendedInvestment.platformName) && Intrinsics.EZpvd((Object) this.rate, (Object) recommendedInvestment.rate) && this.rateType == recommendedInvestment.rateType && Intrinsics.EZpvd((Object) this.rateTypeDesc, (Object) recommendedInvestment.rateTypeDesc) && Intrinsics.EZpvd((Object) this.tvl, (Object) recommendedInvestment.tvl) && this.type == recommendedInvestment.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAggregateId() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightNetworkLogo() {
        return this.nightNetworkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateTypeDesc() {
        return this.rateTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvl() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.aggregateId) * 31) + this.browserUrl.hashCode()) * 31) + Long.hashCode(this.investmentId)) * 31) + this.label.hashCode()) * 31) + this.networkLogo.hashCode()) * 31) + this.nightNetworkLogo.hashCode()) * 31) + this.platformLogo.hashCode()) * 31) + this.platformName.hashCode()) * 31) + this.rate.hashCode()) * 31) + Integer.hashCode(this.rateType)) * 31) + this.rateTypeDesc.hashCode()) * 31) + this.tvl.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendedInvestment(aggregateId=" + this.aggregateId + ", browserUrl=" + this.browserUrl + ", investmentId=" + this.investmentId + ", label=" + this.label + ", networkLogo=" + this.networkLogo + ", nightNetworkLogo=" + this.nightNetworkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", rate=" + this.rate + ", rateType=" + this.rateType + ", rateTypeDesc=" + this.rateTypeDesc + ", tvl=" + this.tvl + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.aggregateId);
        parcel.writeString(this.browserUrl);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.label);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.nightNetworkLogo);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        parcel.writeString(this.rate);
        parcel.writeInt(this.rateType);
        parcel.writeString(this.rateTypeDesc);
        parcel.writeString(this.tvl);
        parcel.writeInt(this.type);
    }

    public /* synthetic */ RecommendedInvestment(int i, long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.aggregateId = 0L;
        } else {
            this.aggregateId = j;
        }
        if ((i & 2) == 0) {
            this.browserUrl = "";
        } else {
            this.browserUrl = str;
        }
        if ((i & 4) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j2;
        }
        if ((i & 8) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 16) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str3;
        }
        if ((i & 32) == 0) {
            this.nightNetworkLogo = "";
        } else {
            this.nightNetworkLogo = str4;
        }
        if ((i & 64) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str5;
        }
        if ((i & 128) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str6;
        }
        if ((i & 256) == 0) {
            this.rate = "";
        } else {
            this.rate = str7;
        }
        if ((i & 512) == 0) {
            this.rateType = 0;
        } else {
            this.rateType = i2;
        }
        if ((i & 1024) == 0) {
            this.rateTypeDesc = "";
        } else {
            this.rateTypeDesc = str8;
        }
        if ((i & 2048) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str9;
        }
        if ((i & 4096) == 0) {
            this.type = 0;
        } else {
            this.type = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_api(RecommendedInvestment recommendedInvestment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recommendedInvestment.aggregateId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, recommendedInvestment.aggregateId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) recommendedInvestment.browserUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, recommendedInvestment.browserUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || recommendedInvestment.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, recommendedInvestment.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recommendedInvestment.label, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recommendedInvestment.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recommendedInvestment.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recommendedInvestment.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recommendedInvestment.nightNetworkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recommendedInvestment.nightNetworkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recommendedInvestment.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recommendedInvestment.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) recommendedInvestment.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, recommendedInvestment.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recommendedInvestment.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recommendedInvestment.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || recommendedInvestment.rateType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, recommendedInvestment.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recommendedInvestment.rateTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recommendedInvestment.rateTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recommendedInvestment.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recommendedInvestment.tvl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && recommendedInvestment.type == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 12, recommendedInvestment.type);
    }

    public RecommendedInvestment(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.aggregateId = j;
        this.browserUrl = str;
        this.investmentId = j2;
        this.label = str2;
        this.networkLogo = str3;
        this.nightNetworkLogo = str4;
        this.platformLogo = str5;
        this.platformName = str6;
        this.rate = str7;
        this.rateType = i;
        this.rateTypeDesc = str8;
        this.tvl = str9;
        this.type = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r32v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r20v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
 A[MD:(long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int):void (m)] (LINE:10) call: com.okinc.business.invest_api.bean.RecommendedInvestment.<init>(long, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RecommendedInvestment(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? j2 : 0L, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? "" : str7, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) == 0 ? str9 : "", (i3 & 4096) != 0 ? 0 : i2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.RecommendedInvestment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecommendedInvestment> serializer() {
            return RecommendedInvestment$$serializer.INSTANCE;
        }
    }
}
