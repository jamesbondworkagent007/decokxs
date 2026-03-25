package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C55810xqv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SmartEarnParam implements Parcelable, SmartEarnProperties {
    public static final int $stable = 0;
    private final String activeRegionHigh;
    private final String activeRegionLow;
    private final String earnBaseSz;
    private final String earnMaxLimit;
    private final String earnMinLimit;
    private final String earnQuoteSz;
    private final String earnSupport;
    private final String earnTotalProfit;
    private final String earnTotalProfitInSourceCcy;
    private final EarnType earnType;
    private final boolean enabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SmartEarnParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SmartEarnParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartEarnParam(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EarnType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartEarnParam[] newArray(int i) {
            return new SmartEarnParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartEarnParam() {
        this(false, (String) null, (String) null, (String) null, (EarnType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C55810xqv.class)
    public static /* synthetic */ void getEarnType$annotations() {
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.earnQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.earnBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnType component5() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.activeRegionLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.activeRegionHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.earnTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.earnTotalProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam copy(boolean z, String str, String str2, String str3, EarnType earnType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SmartEarnParam(z, str, str2, str3, earnType, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof SmartEarnParam)) {
            return false;
        }
        SmartEarnParam smartEarnParam = (SmartEarnParam) obj;
        return this.enabled == smartEarnParam.enabled && Intrinsics.EZpvd((Object) this.earnMinLimit, (Object) smartEarnParam.earnMinLimit) && Intrinsics.EZpvd((Object) this.earnMaxLimit, (Object) smartEarnParam.earnMaxLimit) && Intrinsics.EZpvd((Object) this.earnSupport, (Object) smartEarnParam.earnSupport) && this.earnType == smartEarnParam.earnType && Intrinsics.EZpvd((Object) this.activeRegionLow, (Object) smartEarnParam.activeRegionLow) && Intrinsics.EZpvd((Object) this.activeRegionHigh, (Object) smartEarnParam.activeRegionHigh) && Intrinsics.EZpvd((Object) this.earnTotalProfit, (Object) smartEarnParam.earnTotalProfit) && Intrinsics.EZpvd((Object) this.earnTotalProfitInSourceCcy, (Object) smartEarnParam.earnTotalProfitInSourceCcy) && Intrinsics.EZpvd((Object) this.earnQuoteSz, (Object) smartEarnParam.earnQuoteSz) && Intrinsics.EZpvd((Object) this.earnBaseSz, (Object) smartEarnParam.earnBaseSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveRegionHigh() {
        return this.activeRegionHigh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveRegionLow() {
        return this.activeRegionLow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnBaseSz() {
        return this.earnBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnMaxLimit() {
        return this.earnMaxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnMinLimit() {
        return this.earnMinLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnQuoteSz() {
        return this.earnQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public String getEarnSupport() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnTotalProfit() {
        return this.earnTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnTotalProfitInSourceCcy() {
        return this.earnTotalProfitInSourceCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public EarnType getEarnType() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled);
        String str = this.earnMinLimit;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.earnMaxLimit;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.earnSupport;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        EarnType earnType = this.earnType;
        int iHashCode5 = earnType == null ? 0 : earnType.hashCode();
        int iHashCode6 = this.activeRegionLow.hashCode();
        int iHashCode7 = this.activeRegionHigh.hashCode();
        int iHashCode8 = this.earnTotalProfit.hashCode();
        int iHashCode9 = this.earnTotalProfitInSourceCcy.hashCode();
        String str4 = this.earnQuoteSz;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.earnBaseSz;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartEarnParam(enabled=" + this.enabled + ", earnMinLimit=" + this.earnMinLimit + ", earnMaxLimit=" + this.earnMaxLimit + ", earnSupport=" + this.earnSupport + ", earnType=" + this.earnType + ", activeRegionLow=" + this.activeRegionLow + ", activeRegionHigh=" + this.activeRegionHigh + ", earnTotalProfit=" + this.earnTotalProfit + ", earnTotalProfitInSourceCcy=" + this.earnTotalProfitInSourceCcy + ", earnQuoteSz=" + this.earnQuoteSz + ", earnBaseSz=" + this.earnBaseSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.earnMinLimit);
        parcel.writeString(this.earnMaxLimit);
        parcel.writeString(this.earnSupport);
        EarnType earnType = this.earnType;
        if (earnType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.activeRegionLow);
        parcel.writeString(this.activeRegionHigh);
        parcel.writeString(this.earnTotalProfit);
        parcel.writeString(this.earnTotalProfitInSourceCcy);
        parcel.writeString(this.earnQuoteSz);
        parcel.writeString(this.earnBaseSz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.SmartEarnParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SmartEarnParam> serializer() {
            return SmartEarnParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SmartEarnParam(int i, boolean z, String str, String str2, String str3, EarnType earnType, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.earnMinLimit = null;
        } else {
            this.earnMinLimit = str;
        }
        if ((i & 4) == 0) {
            this.earnMaxLimit = null;
        } else {
            this.earnMaxLimit = str2;
        }
        if ((i & 8) == 0) {
            this.earnSupport = null;
        } else {
            this.earnSupport = str3;
        }
        if ((i & 16) == 0) {
            this.earnType = null;
        } else {
            this.earnType = earnType;
        }
        if ((i & 32) == 0) {
            this.activeRegionLow = "";
        } else {
            this.activeRegionLow = str4;
        }
        if ((i & 64) == 0) {
            this.activeRegionHigh = "";
        } else {
            this.activeRegionHigh = str5;
        }
        if ((i & 128) == 0) {
            this.earnTotalProfit = "";
        } else {
            this.earnTotalProfit = str6;
        }
        if ((i & 256) == 0) {
            this.earnTotalProfitInSourceCcy = "";
        } else {
            this.earnTotalProfitInSourceCcy = str7;
        }
        if ((i & 512) == 0) {
            this.earnQuoteSz = null;
        } else {
            this.earnQuoteSz = str8;
        }
        if ((i & 1024) == 0) {
            this.earnBaseSz = null;
        } else {
            this.earnBaseSz = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SmartEarnParam smartEarnParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || smartEarnParam.getEnabled()) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, smartEarnParam.getEnabled());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || smartEarnParam.getEarnMinLimit() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, smartEarnParam.getEarnMinLimit());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || smartEarnParam.getEarnMaxLimit() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, smartEarnParam.getEarnMaxLimit());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || smartEarnParam.getEarnSupport() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, smartEarnParam.getEarnSupport());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || smartEarnParam.getEarnType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, C55810xqv.copydefault, smartEarnParam.getEarnType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) smartEarnParam.activeRegionLow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, smartEarnParam.activeRegionLow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) smartEarnParam.activeRegionHigh, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, smartEarnParam.activeRegionHigh);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) smartEarnParam.earnTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, smartEarnParam.earnTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) smartEarnParam.earnTotalProfitInSourceCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, smartEarnParam.earnTotalProfitInSourceCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || smartEarnParam.earnQuoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, smartEarnParam.earnQuoteSz);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && smartEarnParam.earnBaseSz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, smartEarnParam.earnBaseSz);
    }

    @Override // com.okinc.unify_trade.biz.bot.SmartEarnProperties
    public boolean getHasParametersSet() {
        return SmartEarnProperties.StateListAnimator.EZpvd(this);
    }

    public boolean isEarnSupported() {
        return SmartEarnProperties.StateListAnimator.KWHzl(this);
    }

    public SmartEarnParam(boolean z, String str, String str2, String str3, EarnType earnType, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.enabled = z;
        this.earnMinLimit = str;
        this.earnMaxLimit = str2;
        this.earnSupport = str3;
        this.earnType = earnType;
        this.activeRegionLow = str4;
        this.activeRegionHigh = str5;
        this.earnTotalProfit = str6;
        this.earnTotalProfitInSourceCcy = str7;
        this.earnQuoteSz = str8;
        this.earnBaseSz = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.EarnType) : (r17v0 com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:50) call: com.okinc.unify_trade.biz.bot.SmartEarnParam.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartEarnParam(boolean z, String str, String str2, String str3, EarnType earnType, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : earnType, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
