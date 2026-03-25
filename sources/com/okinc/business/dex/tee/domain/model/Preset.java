package com.okinc.business.dex.tee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class Preset implements Parcelable {
    public static final int $stable = 0;
    private final String dexIds;
    private final String dynamicMaxSlippageValue;
    private final String feeLevel;
    private final String feeValue;
    private final String limitOrderFeeLevel;
    private final String limitOrderFeeValue;
    private final String routerModeType;
    private final String slippageLevel;
    private final String slippageType;
    private final String slippageValue;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Preset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Preset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Preset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Preset(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Preset[] newArray(int i) {
            return new Preset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Preset() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.limitOrderFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.limitOrderFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new Preset(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof Preset)) {
            return false;
        }
        Preset preset = (Preset) obj;
        return Intrinsics.EZpvd((Object) this.slippageType, (Object) preset.slippageType) && Intrinsics.EZpvd((Object) this.slippageLevel, (Object) preset.slippageLevel) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) preset.slippageValue) && Intrinsics.EZpvd((Object) this.dynamicMaxSlippageValue, (Object) preset.dynamicMaxSlippageValue) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) preset.routerModeType) && Intrinsics.EZpvd((Object) this.feeLevel, (Object) preset.feeLevel) && Intrinsics.EZpvd((Object) this.feeValue, (Object) preset.feeValue) && Intrinsics.EZpvd((Object) this.limitOrderFeeLevel, (Object) preset.limitOrderFeeLevel) && Intrinsics.EZpvd((Object) this.limitOrderFeeValue, (Object) preset.limitOrderFeeValue) && Intrinsics.EZpvd((Object) this.dexIds, (Object) preset.dexIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDynamicMaxSlippageValue() {
        return this.dynamicMaxSlippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderFeeLevel() {
        return this.limitOrderFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderFeeValue() {
        return this.limitOrderFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageLevel() {
        return this.slippageLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.slippageType.hashCode();
        int iHashCode2 = this.slippageLevel.hashCode();
        int iHashCode3 = this.slippageValue.hashCode();
        int iHashCode4 = this.dynamicMaxSlippageValue.hashCode();
        int iHashCode5 = this.routerModeType.hashCode();
        int iHashCode6 = this.feeLevel.hashCode();
        int iHashCode7 = this.feeValue.hashCode();
        int iHashCode8 = this.limitOrderFeeLevel.hashCode();
        int iHashCode9 = this.limitOrderFeeValue.hashCode();
        String str = this.dexIds;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Preset(slippageType=" + this.slippageType + ", slippageLevel=" + this.slippageLevel + ", slippageValue=" + this.slippageValue + ", dynamicMaxSlippageValue=" + this.dynamicMaxSlippageValue + ", routerModeType=" + this.routerModeType + ", feeLevel=" + this.feeLevel + ", feeValue=" + this.feeValue + ", limitOrderFeeLevel=" + this.limitOrderFeeLevel + ", limitOrderFeeValue=" + this.limitOrderFeeValue + ", dexIds=" + this.dexIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.slippageType);
        parcel.writeString(this.slippageLevel);
        parcel.writeString(this.slippageValue);
        parcel.writeString(this.dynamicMaxSlippageValue);
        parcel.writeString(this.routerModeType);
        parcel.writeString(this.feeLevel);
        parcel.writeString(this.feeValue);
        parcel.writeString(this.limitOrderFeeLevel);
        parcel.writeString(this.limitOrderFeeValue);
        parcel.writeString(this.dexIds);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.Preset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Preset> serializer() {
            return Preset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Preset(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str;
        }
        if ((i & 2) == 0) {
            this.slippageLevel = "";
        } else {
            this.slippageLevel = str2;
        }
        if ((i & 4) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str3;
        }
        if ((i & 8) == 0) {
            this.dynamicMaxSlippageValue = "";
        } else {
            this.dynamicMaxSlippageValue = str4;
        }
        if ((i & 16) == 0) {
            this.routerModeType = "";
        } else {
            this.routerModeType = str5;
        }
        if ((i & 32) == 0) {
            this.feeLevel = "";
        } else {
            this.feeLevel = str6;
        }
        if ((i & 64) == 0) {
            this.feeValue = "";
        } else {
            this.feeValue = str7;
        }
        if ((i & 128) == 0) {
            this.limitOrderFeeLevel = "";
        } else {
            this.limitOrderFeeLevel = str8;
        }
        if ((i & 256) == 0) {
            this.limitOrderFeeValue = "";
        } else {
            this.limitOrderFeeValue = str9;
        }
        if ((i & 512) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(Preset preset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) preset.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, preset.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) preset.slippageLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, preset.slippageLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) preset.slippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, preset.slippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) preset.dynamicMaxSlippageValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, preset.dynamicMaxSlippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) preset.routerModeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, preset.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) preset.feeLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, preset.feeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) preset.feeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, preset.feeValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) preset.limitOrderFeeLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, preset.limitOrderFeeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) preset.limitOrderFeeValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, preset.limitOrderFeeValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && preset.dexIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, preset.dexIds);
    }

    public Preset(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.slippageType = str;
        this.slippageLevel = str2;
        this.slippageValue = str3;
        this.dynamicMaxSlippageValue = str4;
        this.routerModeType = str5;
        this.feeLevel = str6;
        this.feeValue = str7;
        this.limitOrderFeeLevel = str8;
        this.limitOrderFeeValue = str9;
        this.dexIds = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:108) call: com.okinc.business.dex.tee.domain.model.Preset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Preset(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? null : str10);
    }
}
