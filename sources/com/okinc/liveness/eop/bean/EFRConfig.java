package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class EFRConfig implements Parcelable {
    public static final int $stable = 0;
    private final Long code;
    private final String efrData;
    private final String expiry;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EFRConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EFRConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EFRConfig(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRConfig[] newArray(int i) {
            return new EFRConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EFRConfig() {
        this((String) null, (Long) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EFRConfig copy$default(EFRConfig eFRConfig, String str, Long l, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eFRConfig.efrData;
        }
        if ((i & 2) != 0) {
            l = eFRConfig.code;
        }
        if ((i & 4) != 0) {
            str2 = eFRConfig.expiry;
        }
        if ((i & 8) != 0) {
            str3 = eFRConfig.value;
        }
        return eFRConfig.copy(str, l, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.efrData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EFRConfig copy(String str, Long l, String str2, String str3) {
        return new EFRConfig(str, l, str2, str3);
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
        if (!(obj instanceof EFRConfig)) {
            return false;
        }
        EFRConfig eFRConfig = (EFRConfig) obj;
        return Intrinsics.EZpvd((Object) this.efrData, (Object) eFRConfig.efrData) && Intrinsics.EZpvd(this.code, eFRConfig.code) && Intrinsics.EZpvd((Object) this.expiry, (Object) eFRConfig.expiry) && Intrinsics.EZpvd((Object) this.value, (Object) eFRConfig.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEfrData() {
        return this.efrData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.efrData;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.code;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.expiry;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EFRConfig(efrData=" + this.efrData + ", code=" + this.code + ", expiry=" + this.expiry + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.efrData);
        Long l = this.code;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.expiry);
        parcel.writeString(this.value);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.EFRConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EFRConfig> serializer() {
            return EFRConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EFRConfig(int i, String str, Long l, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.efrData = "";
        } else {
            this.efrData = str;
        }
        if ((i & 2) == 0) {
            this.code = 0L;
        } else {
            this.code = l;
        }
        if ((i & 4) == 0) {
            this.expiry = "";
        } else {
            this.expiry = str2;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(EFRConfig eFRConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) eFRConfig.efrData, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eFRConfig.efrData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (l = eFRConfig.code) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, eFRConfig.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) eFRConfig.expiry, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eFRConfig.expiry);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) eFRConfig.value, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eFRConfig.value);
    }

    public EFRConfig(String str, Long l, String str2, String str3) {
        this.efrData = str;
        this.code = l;
        this.expiry = str2;
        this.value = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0007: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void (m)] (LINE:109) call: com.okinc.liveness.eop.bean.EFRConfig.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EFRConfig(String str, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
