package com.okinc.liveness.eop.bean;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LivenessSessionInfoResp implements Parcelable {
    private AwsConfigResp awsConfig;
    private String encryptionData;
    private String faceCheckType;
    private String faceSessionId;
    private String httpProxyPath;
    private final LivenessConfig livenessConfig;
    private boolean needProxy;
    private String wssProxyPath;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LivenessSessionInfoResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LivenessSessionInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessSessionInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LivenessSessionInfoResp(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AwsConfigResp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LivenessConfig.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessSessionInfoResp[] newArray(int i) {
            return new LivenessSessionInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessSessionInfoResp() {
        this((String) null, (String) null, (AwsConfigResp) null, (LivenessConfig) null, (String) null, (String) null, false, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.faceCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsConfigResp component3() {
        return this.awsConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessConfig component4() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.httpProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.wssProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessSessionInfoResp copy(@NotNull String str, @NotNull String str2, AwsConfigResp awsConfigResp, LivenessConfig livenessConfig, @NotNull String str3, @NotNull String str4, boolean z, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LivenessSessionInfoResp(str, str2, awsConfigResp, livenessConfig, str3, str4, z, str5);
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
        if (!(obj instanceof LivenessSessionInfoResp)) {
            return false;
        }
        LivenessSessionInfoResp livenessSessionInfoResp = (LivenessSessionInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.faceSessionId, (Object) livenessSessionInfoResp.faceSessionId) && Intrinsics.EZpvd((Object) this.faceCheckType, (Object) livenessSessionInfoResp.faceCheckType) && Intrinsics.EZpvd(this.awsConfig, livenessSessionInfoResp.awsConfig) && Intrinsics.EZpvd(this.livenessConfig, livenessSessionInfoResp.livenessConfig) && Intrinsics.EZpvd((Object) this.httpProxyPath, (Object) livenessSessionInfoResp.httpProxyPath) && Intrinsics.EZpvd((Object) this.wssProxyPath, (Object) livenessSessionInfoResp.wssProxyPath) && this.needProxy == livenessSessionInfoResp.needProxy && Intrinsics.EZpvd((Object) this.encryptionData, (Object) livenessSessionInfoResp.encryptionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AwsConfigResp getAwsConfig() {
        return this.awsConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptionData() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceCheckType() {
        return this.faceCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceSessionId() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHttpProxyPath() {
        return this.httpProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessConfig getLivenessConfig() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedProxy() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWssProxyPath() {
        return this.wssProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.faceSessionId.hashCode();
        int iHashCode2 = this.faceCheckType.hashCode();
        AwsConfigResp awsConfigResp = this.awsConfig;
        int iHashCode3 = awsConfigResp == null ? 0 : awsConfigResp.hashCode();
        LivenessConfig livenessConfig = this.livenessConfig;
        int iHashCode4 = livenessConfig == null ? 0 : livenessConfig.hashCode();
        int iHashCode5 = this.httpProxyPath.hashCode();
        int iHashCode6 = this.wssProxyPath.hashCode();
        int iHashCode7 = Boolean.hashCode(this.needProxy);
        String str = this.encryptionData;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAwsConfig(AwsConfigResp awsConfigResp) {
        this.awsConfig = awsConfigResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEncryptionData(String str) {
        this.encryptionData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceCheckType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.faceCheckType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.faceSessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHttpProxyPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.httpProxyPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedProxy(boolean z) {
        this.needProxy = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWssProxyPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wssProxyPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessSessionInfoResp(faceSessionId=" + this.faceSessionId + ", faceCheckType=" + this.faceCheckType + ", awsConfig=" + this.awsConfig + ", livenessConfig=" + this.livenessConfig + ", httpProxyPath=" + this.httpProxyPath + ", wssProxyPath=" + this.wssProxyPath + ", needProxy=" + this.needProxy + ", encryptionData=" + this.encryptionData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.faceSessionId);
        parcel.writeString(this.faceCheckType);
        AwsConfigResp awsConfigResp = this.awsConfig;
        if (awsConfigResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            awsConfigResp.writeToParcel(parcel, i);
        }
        LivenessConfig livenessConfig = this.livenessConfig;
        if (livenessConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livenessConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.httpProxyPath);
        parcel.writeString(this.wssProxyPath);
        parcel.writeInt(this.needProxy ? 1 : 0);
        parcel.writeString(this.encryptionData);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LivenessSessionInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LivenessSessionInfoResp> serializer() {
            return LivenessSessionInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LivenessSessionInfoResp(int i, String str, String str2, AwsConfigResp awsConfigResp, LivenessConfig livenessConfig, String str3, String str4, boolean z, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.faceSessionId = "";
        } else {
            this.faceSessionId = str;
        }
        if ((i & 2) == 0) {
            this.faceCheckType = "";
        } else {
            this.faceCheckType = str2;
        }
        this.awsConfig = (i & 4) == 0 ? new AwsConfigResp((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : awsConfigResp;
        this.livenessConfig = (i & 8) == 0 ? null : livenessConfig;
        if ((i & 16) == 0) {
            this.httpProxyPath = "";
        } else {
            this.httpProxyPath = str3;
        }
        if ((i & 32) == 0) {
            this.wssProxyPath = "";
        } else {
            this.wssProxyPath = str4;
        }
        this.needProxy = (i & 64) == 0 ? false : z;
        if ((i & 128) == 0) {
            this.encryptionData = "";
        } else {
            this.encryptionData = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LivenessSessionInfoResp livenessSessionInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) livenessSessionInfoResp.faceSessionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, livenessSessionInfoResp.faceSessionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) livenessSessionInfoResp.faceCheckType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, livenessSessionInfoResp.faceCheckType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(livenessSessionInfoResp.awsConfig, new AwsConfigResp((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, AwsConfigResp$$serializer.INSTANCE, livenessSessionInfoResp.awsConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || livenessSessionInfoResp.livenessConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LivenessConfig$$serializer.INSTANCE, livenessSessionInfoResp.livenessConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) livenessSessionInfoResp.httpProxyPath, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, livenessSessionInfoResp.httpProxyPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) livenessSessionInfoResp.wssProxyPath, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, livenessSessionInfoResp.wssProxyPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || livenessSessionInfoResp.needProxy) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, livenessSessionInfoResp.needProxy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) livenessSessionInfoResp.encryptionData, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, livenessSessionInfoResp.encryptionData);
    }

    public LivenessSessionInfoResp(@NotNull String str, @NotNull String str2, AwsConfigResp awsConfigResp, LivenessConfig livenessConfig, @NotNull String str3, @NotNull String str4, boolean z, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.faceSessionId = str;
        this.faceCheckType = str2;
        this.awsConfig = awsConfigResp;
        this.livenessConfig = livenessConfig;
        this.httpProxyPath = str3;
        this.wssProxyPath = str4;
        this.needProxy = z;
        this.encryptionData = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:com.okinc.liveness.eop.bean.AwsConfigResp:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: com.okinc.liveness.eop.bean.AwsConfigResp.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r14v0 com.okinc.liveness.eop.bean.AwsConfigResp))
  (wrap:com.okinc.liveness.eop.bean.LivenessConfig:?: TERNARY null = ((wrap:int:0x0023: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LivenessConfig) : (r15v0 com.okinc.liveness.eop.bean.LivenessConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.liveness.eop.bean.AwsConfigResp, com.okinc.liveness.eop.bean.LivenessConfig, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:20) call: com.okinc.liveness.eop.bean.LivenessSessionInfoResp.<init>(java.lang.String, java.lang.String, com.okinc.liveness.eop.bean.AwsConfigResp, com.okinc.liveness.eop.bean.LivenessConfig, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ LivenessSessionInfoResp(String str, String str2, AwsConfigResp awsConfigResp, LivenessConfig livenessConfig, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new AwsConfigResp((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : awsConfigResp, (i & 8) != 0 ? null : livenessConfig, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z, (i & 128) == 0 ? str5 : "");
    }
}
