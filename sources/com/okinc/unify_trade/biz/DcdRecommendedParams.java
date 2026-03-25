package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class DcdRecommendedParams implements Parcelable {
    public static final int $stable = 0;
    private static final String MAX_SETTLEMENT_DAY = "maxSettlementDay";
    private static final String MIN_YIELD = "minAnnualYieldPercentage";
    private static final String STRIKE = "strike";
    private static final String STRIKE_PERCENTAGE = "strikePercentage";
    private final String altCurrencyId;
    private final String currencyId;
    private final String maxSettlementDay;
    private final String minAnnualYieldPercentage;
    private final String refAnnualYieldPercentage;
    private final String strike;
    private final String strikePercentage;
    public static final Keys Keys = new Keys(null);
    public static final Parcelable.Creator<DcdRecommendedParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DcdRecommendedParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdRecommendedParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcdRecommendedParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdRecommendedParams[] newArray(int i) {
            return new DcdRecommendedParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdRecommendedParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DcdRecommendedParams copy$default(DcdRecommendedParams dcdRecommendedParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcdRecommendedParams.currencyId;
        }
        if ((i & 2) != 0) {
            str2 = dcdRecommendedParams.altCurrencyId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = dcdRecommendedParams.strikePercentage;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = dcdRecommendedParams.strike;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = dcdRecommendedParams.refAnnualYieldPercentage;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = dcdRecommendedParams.minAnnualYieldPercentage;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = dcdRecommendedParams.maxSettlementDay;
        }
        return dcdRecommendedParams.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.refAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdRecommendedParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new DcdRecommendedParams(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof DcdRecommendedParams)) {
            return false;
        }
        DcdRecommendedParams dcdRecommendedParams = (DcdRecommendedParams) obj;
        return Intrinsics.EZpvd((Object) this.currencyId, (Object) dcdRecommendedParams.currencyId) && Intrinsics.EZpvd((Object) this.altCurrencyId, (Object) dcdRecommendedParams.altCurrencyId) && Intrinsics.EZpvd((Object) this.strikePercentage, (Object) dcdRecommendedParams.strikePercentage) && Intrinsics.EZpvd((Object) this.strike, (Object) dcdRecommendedParams.strike) && Intrinsics.EZpvd((Object) this.refAnnualYieldPercentage, (Object) dcdRecommendedParams.refAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.minAnnualYieldPercentage, (Object) dcdRecommendedParams.minAnnualYieldPercentage) && Intrinsics.EZpvd((Object) this.maxSettlementDay, (Object) dcdRecommendedParams.maxSettlementDay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAltCurrencyId() {
        return this.altCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSettlementDay() {
        return this.maxSettlementDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAnnualYieldPercentage() {
        return this.minAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefAnnualYieldPercentage() {
        return this.refAnnualYieldPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrikePercentage() {
        return this.strikePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.currencyId.hashCode() * 31) + this.altCurrencyId.hashCode()) * 31) + this.strikePercentage.hashCode()) * 31) + this.strike.hashCode()) * 31) + this.refAnnualYieldPercentage.hashCode()) * 31) + this.minAnnualYieldPercentage.hashCode()) * 31) + this.maxSettlementDay.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcdRecommendedParams(currencyId=" + this.currencyId + ", altCurrencyId=" + this.altCurrencyId + ", strikePercentage=" + this.strikePercentage + ", strike=" + this.strike + ", refAnnualYieldPercentage=" + this.refAnnualYieldPercentage + ", minAnnualYieldPercentage=" + this.minAnnualYieldPercentage + ", maxSettlementDay=" + this.maxSettlementDay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currencyId);
        parcel.writeString(this.altCurrencyId);
        parcel.writeString(this.strikePercentage);
        parcel.writeString(this.strike);
        parcel.writeString(this.refAnnualYieldPercentage);
        parcel.writeString(this.minAnnualYieldPercentage);
        parcel.writeString(this.maxSettlementDay);
    }

    public /* synthetic */ DcdRecommendedParams(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str;
        }
        if ((i & 2) == 0) {
            this.altCurrencyId = "";
        } else {
            this.altCurrencyId = str2;
        }
        if ((i & 4) == 0) {
            this.strikePercentage = "";
        } else {
            this.strikePercentage = str3;
        }
        if ((i & 8) == 0) {
            this.strike = "";
        } else {
            this.strike = str4;
        }
        if ((i & 16) == 0) {
            this.refAnnualYieldPercentage = "";
        } else {
            this.refAnnualYieldPercentage = str5;
        }
        if ((i & 32) == 0) {
            this.minAnnualYieldPercentage = "";
        } else {
            this.minAnnualYieldPercentage = str6;
        }
        if ((i & 64) == 0) {
            this.maxSettlementDay = "";
        } else {
            this.maxSettlementDay = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcdRecommendedParams dcdRecommendedParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dcdRecommendedParams.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.altCurrencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dcdRecommendedParams.altCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.strikePercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dcdRecommendedParams.strikePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.strike, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dcdRecommendedParams.strike);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.refAnnualYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dcdRecommendedParams.refAnnualYieldPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dcdRecommendedParams.minAnnualYieldPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dcdRecommendedParams.minAnnualYieldPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) dcdRecommendedParams.maxSettlementDay, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dcdRecommendedParams.maxSettlementDay);
    }

    public DcdRecommendedParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.currencyId = str;
        this.altCurrencyId = str2;
        this.strikePercentage = str3;
        this.strike = str4;
        this.refAnnualYieldPercentage = str5;
        this.minAnnualYieldPercentage = str6;
        this.maxSettlementDay = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4882) call: com.okinc.unify_trade.biz.DcdRecommendedParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcdRecommendedParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    /* JADX INFO: loaded from: classes19.dex */
    @NamedCompanion
    public static final class Keys {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcdRecommendedParams.Keys.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Keys(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Keys() {
        }

        public final KSerializer<DcdRecommendedParams> serializer() {
            return DcdRecommendedParams$$serializer.INSTANCE;
        }

        public final DcdRecommendedParams copydefault(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new DcdRecommendedParams((String) null, (String) null, C33129mqd.gEmmrt(map.get(DcdRecommendedParams.STRIKE_PERCENTAGE)), C33129mqd.gEmmrt(map.get(DcdRecommendedParams.STRIKE)), (String) null, C33129mqd.gEmmrt(map.get(DcdRecommendedParams.MIN_YIELD)), C33129mqd.gEmmrt(map.get(DcdRecommendedParams.MAX_SETTLEMENT_DAY)), 19, (DefaultConstructorMarker) null);
        }
    }
}
