package com.okinc.liveness.eop.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ClientImageAuth implements Parcelable {
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String endpoint;
    private long id;
    private String imageStorageServiceProvider;
    private String path;
    private String region;
    private String requestId;
    private String securityToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ClientImageAuth> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ClientImageAuth> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientImageAuth createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ClientImageAuth(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientImageAuth[] newArray(int i) {
            return new ClientImageAuth[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accessKeySecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.imageStorageServiceProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientImageAuth copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ClientImageAuth(str, str2, str3, str4, str5, str6, str7, j, str8, str9);
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
        if (!(obj instanceof ClientImageAuth)) {
            return false;
        }
        ClientImageAuth clientImageAuth = (ClientImageAuth) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) clientImageAuth.requestId) && Intrinsics.EZpvd((Object) this.accessKeyId, (Object) clientImageAuth.accessKeyId) && Intrinsics.EZpvd((Object) this.accessKeySecret, (Object) clientImageAuth.accessKeySecret) && Intrinsics.EZpvd((Object) this.securityToken, (Object) clientImageAuth.securityToken) && Intrinsics.EZpvd((Object) this.path, (Object) clientImageAuth.path) && Intrinsics.EZpvd((Object) this.bucketName, (Object) clientImageAuth.bucketName) && Intrinsics.EZpvd((Object) this.endpoint, (Object) clientImageAuth.endpoint) && this.id == clientImageAuth.id && Intrinsics.EZpvd((Object) this.imageStorageServiceProvider, (Object) clientImageAuth.imageStorageServiceProvider) && Intrinsics.EZpvd((Object) this.region, (Object) clientImageAuth.region);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageStorageServiceProvider() {
        return this.imageStorageServiceProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegion() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.requestId.hashCode() * 31) + this.accessKeyId.hashCode()) * 31) + this.accessKeySecret.hashCode()) * 31) + this.securityToken.hashCode()) * 31) + this.path.hashCode()) * 31) + this.bucketName.hashCode()) * 31) + this.endpoint.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.imageStorageServiceProvider.hashCode()) * 31) + this.region.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccessKeyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accessKeyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccessKeySecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accessKeySecret = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBucketName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndpoint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.endpoint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(long j) {
        this.id = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageStorageServiceProvider(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageStorageServiceProvider = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.region = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecurityToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.securityToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClientImageAuth(requestId=" + this.requestId + ", accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", securityToken=" + this.securityToken + ", path=" + this.path + ", bucketName=" + this.bucketName + ", endpoint=" + this.endpoint + ", id=" + this.id + ", imageStorageServiceProvider=" + this.imageStorageServiceProvider + ", region=" + this.region + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.requestId);
        parcel.writeString(this.accessKeyId);
        parcel.writeString(this.accessKeySecret);
        parcel.writeString(this.securityToken);
        parcel.writeString(this.path);
        parcel.writeString(this.bucketName);
        parcel.writeString(this.endpoint);
        parcel.writeLong(this.id);
        parcel.writeString(this.imageStorageServiceProvider);
        parcel.writeString(this.region);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.ClientImageAuth.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ClientImageAuth> serializer() {
            return ClientImageAuth$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClientImageAuth(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, ClientImageAuth$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.requestId = "";
        } else {
            this.requestId = str;
        }
        if ((i & 2) == 0) {
            this.accessKeyId = "";
        } else {
            this.accessKeyId = str2;
        }
        if ((i & 4) == 0) {
            this.accessKeySecret = "";
        } else {
            this.accessKeySecret = str3;
        }
        if ((i & 8) == 0) {
            this.securityToken = "";
        } else {
            this.securityToken = str4;
        }
        if ((i & 16) == 0) {
            this.path = "";
        } else {
            this.path = str5;
        }
        if ((i & 32) == 0) {
            this.bucketName = "";
        } else {
            this.bucketName = str6;
        }
        if ((i & 64) == 0) {
            this.endpoint = "";
        } else {
            this.endpoint = str7;
        }
        this.id = j;
        if ((i & 256) == 0) {
            this.imageStorageServiceProvider = "";
        } else {
            this.imageStorageServiceProvider = str8;
        }
        if ((i & 512) == 0) {
            this.region = "";
        } else {
            this.region = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(ClientImageAuth clientImageAuth, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) clientImageAuth.requestId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, clientImageAuth.requestId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) clientImageAuth.accessKeyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, clientImageAuth.accessKeyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) clientImageAuth.accessKeySecret, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, clientImageAuth.accessKeySecret);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) clientImageAuth.securityToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, clientImageAuth.securityToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) clientImageAuth.path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, clientImageAuth.path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) clientImageAuth.bucketName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, clientImageAuth.bucketName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) clientImageAuth.endpoint, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, clientImageAuth.endpoint);
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 7, clientImageAuth.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) clientImageAuth.imageStorageServiceProvider, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, clientImageAuth.imageStorageServiceProvider);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) clientImageAuth.region, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, clientImageAuth.region);
    }

    public ClientImageAuth(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.requestId = str;
        this.accessKeyId = str2;
        this.accessKeySecret = str3;
        this.securityToken = str4;
        this.path = str5;
        this.bucketName = str6;
        this.endpoint = str7;
        this.id = j;
        this.imageStorageServiceProvider = str8;
        this.region = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (r23v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.liveness.eop.bean.ClientImageAuth.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ClientImageAuth(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, j, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9);
    }
}
