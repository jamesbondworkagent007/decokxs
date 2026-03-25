package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SingleFileUploadAuthenticationResp implements Parcelable {
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String endpoint;
    private long id;
    private String imageStorageServiceProvider;
    private String path;
    private String region;
    private String securityToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SingleFileUploadAuthenticationResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SingleFileUploadAuthenticationResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleFileUploadAuthenticationResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SingleFileUploadAuthenticationResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleFileUploadAuthenticationResp[] newArray(int i) {
            return new SingleFileUploadAuthenticationResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleFileUploadAuthenticationResp() {
        this((String) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accessKeySecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.imageStorageServiceProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleFileUploadAuthenticationResp copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, String str6, @NotNull String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new SingleFileUploadAuthenticationResp(str, str2, str3, str4, j, str5, str6, str7, str8);
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
        if (!(obj instanceof SingleFileUploadAuthenticationResp)) {
            return false;
        }
        SingleFileUploadAuthenticationResp singleFileUploadAuthenticationResp = (SingleFileUploadAuthenticationResp) obj;
        return Intrinsics.EZpvd((Object) this.accessKeyId, (Object) singleFileUploadAuthenticationResp.accessKeyId) && Intrinsics.EZpvd((Object) this.accessKeySecret, (Object) singleFileUploadAuthenticationResp.accessKeySecret) && Intrinsics.EZpvd((Object) this.bucketName, (Object) singleFileUploadAuthenticationResp.bucketName) && Intrinsics.EZpvd((Object) this.endpoint, (Object) singleFileUploadAuthenticationResp.endpoint) && this.id == singleFileUploadAuthenticationResp.id && Intrinsics.EZpvd((Object) this.path, (Object) singleFileUploadAuthenticationResp.path) && Intrinsics.EZpvd((Object) this.region, (Object) singleFileUploadAuthenticationResp.region) && Intrinsics.EZpvd((Object) this.securityToken, (Object) singleFileUploadAuthenticationResp.securityToken) && Intrinsics.EZpvd((Object) this.imageStorageServiceProvider, (Object) singleFileUploadAuthenticationResp.imageStorageServiceProvider);
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
    public final String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accessKeyId.hashCode();
        int iHashCode2 = this.accessKeySecret.hashCode();
        int iHashCode3 = this.bucketName.hashCode();
        int iHashCode4 = this.endpoint.hashCode();
        int iHashCode5 = Long.hashCode(this.id);
        int iHashCode6 = this.path.hashCode();
        String str = this.region;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        int iHashCode8 = this.securityToken.hashCode();
        String str2 = this.imageStorageServiceProvider;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str2 != null ? str2.hashCode() : 0);
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
    public final void setImageStorageServiceProvider(String str) {
        this.imageStorageServiceProvider = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegion(String str) {
        this.region = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecurityToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.securityToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleFileUploadAuthenticationResp(accessKeyId=" + this.accessKeyId + ", accessKeySecret=" + this.accessKeySecret + ", bucketName=" + this.bucketName + ", endpoint=" + this.endpoint + ", id=" + this.id + ", path=" + this.path + ", region=" + this.region + ", securityToken=" + this.securityToken + ", imageStorageServiceProvider=" + this.imageStorageServiceProvider + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accessKeyId);
        parcel.writeString(this.accessKeySecret);
        parcel.writeString(this.bucketName);
        parcel.writeString(this.endpoint);
        parcel.writeLong(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.region);
        parcel.writeString(this.securityToken);
        parcel.writeString(this.imageStorageServiceProvider);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadAuthenticationResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SingleFileUploadAuthenticationResp> serializer() {
            return SingleFileUploadAuthenticationResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingleFileUploadAuthenticationResp(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accessKeyId = "";
        } else {
            this.accessKeyId = str;
        }
        if ((i & 2) == 0) {
            this.accessKeySecret = "";
        } else {
            this.accessKeySecret = str2;
        }
        if ((i & 4) == 0) {
            this.bucketName = "";
        } else {
            this.bucketName = str3;
        }
        if ((i & 8) == 0) {
            this.endpoint = "";
        } else {
            this.endpoint = str4;
        }
        if ((i & 16) == 0) {
            this.id = 0L;
        } else {
            this.id = j;
        }
        if ((i & 32) == 0) {
            this.path = "";
        } else {
            this.path = str5;
        }
        if ((i & 64) == 0) {
            this.region = null;
        } else {
            this.region = str6;
        }
        if ((i & 128) == 0) {
            this.securityToken = "";
        } else {
            this.securityToken = str7;
        }
        if ((i & 256) == 0) {
            this.imageStorageServiceProvider = "";
        } else {
            this.imageStorageServiceProvider = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SingleFileUploadAuthenticationResp singleFileUploadAuthenticationResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.accessKeyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, singleFileUploadAuthenticationResp.accessKeyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.accessKeySecret, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, singleFileUploadAuthenticationResp.accessKeySecret);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.bucketName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, singleFileUploadAuthenticationResp.bucketName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.endpoint, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, singleFileUploadAuthenticationResp.endpoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || singleFileUploadAuthenticationResp.id != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, singleFileUploadAuthenticationResp.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, singleFileUploadAuthenticationResp.path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || singleFileUploadAuthenticationResp.region != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, singleFileUploadAuthenticationResp.region);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.securityToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, singleFileUploadAuthenticationResp.securityToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) singleFileUploadAuthenticationResp.imageStorageServiceProvider, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, singleFileUploadAuthenticationResp.imageStorageServiceProvider);
    }

    public SingleFileUploadAuthenticationResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, String str6, @NotNull String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accessKeyId = str;
        this.accessKeySecret = str2;
        this.bucketName = str3;
        this.endpoint = str4;
        this.id = j;
        this.path = str5;
        this.region = str6;
        this.securityToken = str7;
        this.imageStorageServiceProvider = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadAuthenticationResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SingleFileUploadAuthenticationResp(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "");
    }
}
