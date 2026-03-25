package com.okinc.ok_kyc_core.data.efr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class EFRData implements Parcelable {
    public static final int $stable = 0;
    private final long code;
    private final String configData;
    private final String expiry;
    private final String faceSessionId;
    private final String sessionId;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EFRData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EFRData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EFRData(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EFRData[] newArray(int i) {
            return new EFRData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EFRData copy$default(EFRData eFRData, String str, long j, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eFRData.configData;
        }
        if ((i & 2) != 0) {
            j = eFRData.code;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = eFRData.value;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = eFRData.expiry;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = eFRData.sessionId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = eFRData.faceSessionId;
        }
        return eFRData.copy(str, j2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.configData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EFRData copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new EFRData(str, j, str2, str3, str4, str5);
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
        if (!(obj instanceof EFRData)) {
            return false;
        }
        EFRData eFRData = (EFRData) obj;
        return Intrinsics.EZpvd((Object) this.configData, (Object) eFRData.configData) && this.code == eFRData.code && Intrinsics.EZpvd((Object) this.value, (Object) eFRData.value) && Intrinsics.EZpvd((Object) this.expiry, (Object) eFRData.expiry) && Intrinsics.EZpvd((Object) this.sessionId, (Object) eFRData.sessionId) && Intrinsics.EZpvd((Object) this.faceSessionId, (Object) eFRData.faceSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfigData() {
        return this.configData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceSessionId() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.configData.hashCode() * 31) + Long.hashCode(this.code)) * 31) + this.value.hashCode()) * 31) + this.expiry.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.faceSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EFRData(configData=" + this.configData + ", code=" + this.code + ", value=" + this.value + ", expiry=" + this.expiry + ", sessionId=" + this.sessionId + ", faceSessionId=" + this.faceSessionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.configData);
        parcel.writeLong(this.code);
        parcel.writeString(this.value);
        parcel.writeString(this.expiry);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.faceSessionId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.efr.EFRData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EFRData> serializer() {
            return EFRData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EFRData(int i, String str, long j, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, EFRData$$serializer.INSTANCE.getDescriptor());
        }
        this.configData = str;
        this.code = j;
        this.value = str2;
        this.expiry = str3;
        this.sessionId = str4;
        this.faceSessionId = str5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(EFRData eFRData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eFRData.configData);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, eFRData.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eFRData.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eFRData.expiry);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eFRData.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, eFRData.faceSessionId);
    }

    public EFRData(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.configData = str;
        this.code = j;
        this.value = str2;
        this.expiry = str3;
        this.sessionId = str4;
        this.faceSessionId = str5;
    }
}
