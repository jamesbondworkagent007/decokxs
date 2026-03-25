package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class TargetDeviceVerificationInfo implements Parcelable {
    public final String deviceName;
    public final String ip;
    public final String ipRegion;
    public String lat;
    public final String lng;
    public final Boolean onCurrentDevice;
    public final String scenario;
    public final String time;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TargetDeviceVerificationInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<TargetDeviceVerificationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TargetDeviceVerificationInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TargetDeviceVerificationInfo(string, string2, string3, string4, string5, string6, string7, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TargetDeviceVerificationInfo[] newArray(int i) {
            return new TargetDeviceVerificationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TargetDeviceVerificationInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.ip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetDeviceVerificationInfo KWHzl(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        return new TargetDeviceVerificationInfo(str, str2, str3, str4, str5, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.deviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.ipRegion;
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
        if (!(obj instanceof TargetDeviceVerificationInfo)) {
            return false;
        }
        TargetDeviceVerificationInfo targetDeviceVerificationInfo = (TargetDeviceVerificationInfo) obj;
        return Intrinsics.EZpvd((Object) this.ip, (Object) targetDeviceVerificationInfo.ip) && Intrinsics.EZpvd((Object) this.lat, (Object) targetDeviceVerificationInfo.lat) && Intrinsics.EZpvd((Object) this.lng, (Object) targetDeviceVerificationInfo.lng) && Intrinsics.EZpvd((Object) this.ipRegion, (Object) targetDeviceVerificationInfo.ipRegion) && Intrinsics.EZpvd((Object) this.time, (Object) targetDeviceVerificationInfo.time) && Intrinsics.EZpvd((Object) this.deviceName, (Object) targetDeviceVerificationInfo.deviceName) && Intrinsics.EZpvd((Object) this.scenario, (Object) targetDeviceVerificationInfo.scenario) && Intrinsics.EZpvd(this.onCurrentDevice, targetDeviceVerificationInfo.onCurrentDevice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.ip;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.lat;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lng;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ipRegion;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.time;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.deviceName;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.scenario;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.onCurrentDevice;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ip);
        parcel.writeString(this.lat);
        parcel.writeString(this.lng);
        parcel.writeString(this.ipRegion);
        parcel.writeString(this.time);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.scenario);
        Boolean bool = this.onCurrentDevice;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.passkey.TargetDeviceVerificationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TargetDeviceVerificationInfo> serializer() {
            return TargetDeviceVerificationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TargetDeviceVerificationInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ip = null;
        } else {
            this.ip = str;
        }
        if ((i & 2) == 0) {
            this.lat = null;
        } else {
            this.lat = str2;
        }
        if ((i & 4) == 0) {
            this.lng = null;
        } else {
            this.lng = str3;
        }
        if ((i & 8) == 0) {
            this.ipRegion = null;
        } else {
            this.ipRegion = str4;
        }
        if ((i & 16) == 0) {
            this.time = null;
        } else {
            this.time = str5;
        }
        if ((i & 32) == 0) {
            this.deviceName = null;
        } else {
            this.deviceName = str6;
        }
        if ((i & 64) == 0) {
            this.scenario = null;
        } else {
            this.scenario = str7;
        }
        if ((i & 128) == 0) {
            this.onCurrentDevice = null;
        } else {
            this.onCurrentDevice = bool;
        }
    }

    public static final /* synthetic */ void OLrzqt(TargetDeviceVerificationInfo targetDeviceVerificationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || targetDeviceVerificationInfo.ip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, targetDeviceVerificationInfo.ip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || targetDeviceVerificationInfo.lat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, targetDeviceVerificationInfo.lat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || targetDeviceVerificationInfo.lng != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, targetDeviceVerificationInfo.lng);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || targetDeviceVerificationInfo.ipRegion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, targetDeviceVerificationInfo.ipRegion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || targetDeviceVerificationInfo.time != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, targetDeviceVerificationInfo.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || targetDeviceVerificationInfo.deviceName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, targetDeviceVerificationInfo.deviceName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || targetDeviceVerificationInfo.scenario != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, targetDeviceVerificationInfo.scenario);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && targetDeviceVerificationInfo.onCurrentDevice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, targetDeviceVerificationInfo.onCurrentDevice);
    }

    public TargetDeviceVerificationInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.ip = str;
        this.lat = str2;
        this.lng = str3;
        this.ipRegion = str4;
        this.time = str5;
        this.deviceName = str6;
        this.scenario = str7;
        this.onCurrentDevice = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:10) call: com.okinc.auth.api.passkey.TargetDeviceVerificationInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TargetDeviceVerificationInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? bool : null);
    }

    public String toString() {
        return "TargetDeviceVerificationInfo(ip=" + this.ip + ", ipRegion=" + this.ipRegion + ", time=" + this.time + ", deviceName=" + this.deviceName + ", scenario=" + this.scenario + ", currentDevice=" + this.onCurrentDevice + ")";
    }
}
