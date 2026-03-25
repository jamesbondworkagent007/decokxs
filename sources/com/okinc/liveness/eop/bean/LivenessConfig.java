package com.okinc.liveness.eop.bean;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LivenessConfig implements Parcelable {
    public static final int $stable = 0;
    private final LcaLivenessConfigCollectedVideoConfig collectedVideoConfig;
    private final EFRConfig efrConfig;
    private final String encryptionData;
    private final LcaLivenessConfigFaceDetectionConfig faceDetectionConfig;
    private final LcaLivenessConfigFaceQcConfig faceQcConfig;
    private final LcaLivenessConfigFaceQcConfig freshnessQcConfig;
    private final Boolean needProxy;
    private final LcaLivenessConfigOvalParameters ovalParameters;
    private final LcaLivenessConfigSensorConfig sensor;
    private final String wssProxyPath;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LivenessConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LivenessConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LivenessConfig(boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : LcaLivenessConfigCollectedVideoConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LcaLivenessConfigOvalParameters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LcaLivenessConfigFaceDetectionConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LcaLivenessConfigFaceQcConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LcaLivenessConfigFaceQcConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LcaLivenessConfigSensorConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EFRConfig.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessConfig[] newArray(int i) {
            return new LivenessConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessConfig() {
        this((Boolean) null, (String) null, (LcaLivenessConfigCollectedVideoConfig) null, (LcaLivenessConfigOvalParameters) null, (LcaLivenessConfigFaceDetectionConfig) null, (LcaLivenessConfigFaceQcConfig) null, (LcaLivenessConfigFaceQcConfig) null, (LcaLivenessConfigSensorConfig) null, (EFRConfig) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.wssProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigCollectedVideoConfig component3() {
        return this.collectedVideoConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigOvalParameters component4() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceDetectionConfig component5() {
        return this.faceDetectionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceQcConfig component6() {
        return this.faceQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceQcConfig component7() {
        return this.freshnessQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigSensorConfig component8() {
        return this.sensor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EFRConfig component9() {
        return this.efrConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessConfig copy(Boolean bool, String str, LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2, LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, EFRConfig eFRConfig, String str2) {
        return new LivenessConfig(bool, str, lcaLivenessConfigCollectedVideoConfig, lcaLivenessConfigOvalParameters, lcaLivenessConfigFaceDetectionConfig, lcaLivenessConfigFaceQcConfig, lcaLivenessConfigFaceQcConfig2, lcaLivenessConfigSensorConfig, eFRConfig, str2);
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
        if (!(obj instanceof LivenessConfig)) {
            return false;
        }
        LivenessConfig livenessConfig = (LivenessConfig) obj;
        return Intrinsics.EZpvd(this.needProxy, livenessConfig.needProxy) && Intrinsics.EZpvd((Object) this.wssProxyPath, (Object) livenessConfig.wssProxyPath) && Intrinsics.EZpvd(this.collectedVideoConfig, livenessConfig.collectedVideoConfig) && Intrinsics.EZpvd(this.ovalParameters, livenessConfig.ovalParameters) && Intrinsics.EZpvd(this.faceDetectionConfig, livenessConfig.faceDetectionConfig) && Intrinsics.EZpvd(this.faceQcConfig, livenessConfig.faceQcConfig) && Intrinsics.EZpvd(this.freshnessQcConfig, livenessConfig.freshnessQcConfig) && Intrinsics.EZpvd(this.sensor, livenessConfig.sensor) && Intrinsics.EZpvd(this.efrConfig, livenessConfig.efrConfig) && Intrinsics.EZpvd((Object) this.encryptionData, (Object) livenessConfig.encryptionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigCollectedVideoConfig getCollectedVideoConfig() {
        return this.collectedVideoConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EFRConfig getEfrConfig() {
        return this.efrConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptionData() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceDetectionConfig getFaceDetectionConfig() {
        return this.faceDetectionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceQcConfig getFaceQcConfig() {
        return this.faceQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceQcConfig getFreshnessQcConfig() {
        return this.freshnessQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedProxy() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigOvalParameters getOvalParameters() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigSensorConfig getSensor() {
        return this.sensor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWssProxyPath() {
        return this.wssProxyPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.needProxy;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.wssProxyPath;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig = this.collectedVideoConfig;
        int iHashCode3 = lcaLivenessConfigCollectedVideoConfig == null ? 0 : lcaLivenessConfigCollectedVideoConfig.hashCode();
        LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters = this.ovalParameters;
        int iHashCode4 = lcaLivenessConfigOvalParameters == null ? 0 : lcaLivenessConfigOvalParameters.hashCode();
        LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig = this.faceDetectionConfig;
        int iHashCode5 = lcaLivenessConfigFaceDetectionConfig == null ? 0 : lcaLivenessConfigFaceDetectionConfig.hashCode();
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig = this.faceQcConfig;
        int iHashCode6 = lcaLivenessConfigFaceQcConfig == null ? 0 : lcaLivenessConfigFaceQcConfig.hashCode();
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2 = this.freshnessQcConfig;
        int iHashCode7 = lcaLivenessConfigFaceQcConfig2 == null ? 0 : lcaLivenessConfigFaceQcConfig2.hashCode();
        LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig = this.sensor;
        int iHashCode8 = lcaLivenessConfigSensorConfig == null ? 0 : lcaLivenessConfigSensorConfig.hashCode();
        EFRConfig eFRConfig = this.efrConfig;
        int iHashCode9 = eFRConfig == null ? 0 : eFRConfig.hashCode();
        String str2 = this.encryptionData;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessConfig(needProxy=" + this.needProxy + ", wssProxyPath=" + this.wssProxyPath + ", collectedVideoConfig=" + this.collectedVideoConfig + ", ovalParameters=" + this.ovalParameters + ", faceDetectionConfig=" + this.faceDetectionConfig + ", faceQcConfig=" + this.faceQcConfig + ", freshnessQcConfig=" + this.freshnessQcConfig + ", sensor=" + this.sensor + ", efrConfig=" + this.efrConfig + ", encryptionData=" + this.encryptionData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.needProxy;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.wssProxyPath);
        LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig = this.collectedVideoConfig;
        if (lcaLivenessConfigCollectedVideoConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigCollectedVideoConfig.writeToParcel(parcel, i);
        }
        LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters = this.ovalParameters;
        if (lcaLivenessConfigOvalParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigOvalParameters.writeToParcel(parcel, i);
        }
        LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig = this.faceDetectionConfig;
        if (lcaLivenessConfigFaceDetectionConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigFaceDetectionConfig.writeToParcel(parcel, i);
        }
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig = this.faceQcConfig;
        if (lcaLivenessConfigFaceQcConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigFaceQcConfig.writeToParcel(parcel, i);
        }
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2 = this.freshnessQcConfig;
        if (lcaLivenessConfigFaceQcConfig2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigFaceQcConfig2.writeToParcel(parcel, i);
        }
        LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig = this.sensor;
        if (lcaLivenessConfigSensorConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lcaLivenessConfigSensorConfig.writeToParcel(parcel, i);
        }
        EFRConfig eFRConfig = this.efrConfig;
        if (eFRConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eFRConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.encryptionData);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LivenessConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LivenessConfig> serializer() {
            return LivenessConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LivenessConfig(int i, Boolean bool, String str, LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2, LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, EFRConfig eFRConfig, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.needProxy = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.wssProxyPath = null;
        } else {
            this.wssProxyPath = str;
        }
        if ((i & 4) == 0) {
            this.collectedVideoConfig = null;
        } else {
            this.collectedVideoConfig = lcaLivenessConfigCollectedVideoConfig;
        }
        if ((i & 8) == 0) {
            this.ovalParameters = null;
        } else {
            this.ovalParameters = lcaLivenessConfigOvalParameters;
        }
        if ((i & 16) == 0) {
            this.faceDetectionConfig = null;
        } else {
            this.faceDetectionConfig = lcaLivenessConfigFaceDetectionConfig;
        }
        if ((i & 32) == 0) {
            this.faceQcConfig = null;
        } else {
            this.faceQcConfig = lcaLivenessConfigFaceQcConfig;
        }
        if ((i & 64) == 0) {
            this.freshnessQcConfig = null;
        } else {
            this.freshnessQcConfig = lcaLivenessConfigFaceQcConfig2;
        }
        if ((i & 128) == 0) {
            this.sensor = null;
        } else {
            this.sensor = lcaLivenessConfigSensorConfig;
        }
        if ((i & 256) == 0) {
            this.efrConfig = null;
        } else {
            this.efrConfig = eFRConfig;
        }
        if ((i & 512) == 0) {
            this.encryptionData = null;
        } else {
            this.encryptionData = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LivenessConfig livenessConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(livenessConfig.needProxy, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, livenessConfig.needProxy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || livenessConfig.wssProxyPath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, livenessConfig.wssProxyPath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || livenessConfig.collectedVideoConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE, livenessConfig.collectedVideoConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || livenessConfig.ovalParameters != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LcaLivenessConfigOvalParameters$$serializer.INSTANCE, livenessConfig.ovalParameters);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || livenessConfig.faceDetectionConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE, livenessConfig.faceDetectionConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || livenessConfig.faceQcConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE, livenessConfig.faceQcConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || livenessConfig.freshnessQcConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE, livenessConfig.freshnessQcConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || livenessConfig.sensor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LcaLivenessConfigSensorConfig$$serializer.INSTANCE, livenessConfig.sensor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || livenessConfig.efrConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, EFRConfig$$serializer.INSTANCE, livenessConfig.efrConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && livenessConfig.encryptionData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, livenessConfig.encryptionData);
    }

    public LivenessConfig(Boolean bool, String str, LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2, LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, EFRConfig eFRConfig, String str2) {
        this.needProxy = bool;
        this.wssProxyPath = str;
        this.collectedVideoConfig = lcaLivenessConfigCollectedVideoConfig;
        this.ovalParameters = lcaLivenessConfigOvalParameters;
        this.faceDetectionConfig = lcaLivenessConfigFaceDetectionConfig;
        this.faceQcConfig = lcaLivenessConfigFaceQcConfig;
        this.freshnessQcConfig = lcaLivenessConfigFaceQcConfig2;
        this.sensor = lcaLivenessConfigSensorConfig;
        this.efrConfig = eFRConfig;
        this.encryptionData = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig) : (r14v0 com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters) : (r15v0 com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig) : (r16v0 com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig) : (r17v0 com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig) : (r18v0 com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig))
  (wrap:com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig) : (r19v0 com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig))
  (wrap:com.okinc.liveness.eop.bean.EFRConfig:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.EFRConfig) : (r20v0 com.okinc.liveness.eop.bean.EFRConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig, com.okinc.liveness.eop.bean.EFRConfig, java.lang.String):void (m)] (LINE:40) call: com.okinc.liveness.eop.bean.LivenessConfig.<init>(java.lang.Boolean, java.lang.String, com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig, com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig, com.okinc.liveness.eop.bean.EFRConfig, java.lang.String):void type: THIS */
    public /* synthetic */ LivenessConfig(Boolean bool, String str, LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig2, LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, EFRConfig eFRConfig, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : lcaLivenessConfigCollectedVideoConfig, (i & 8) != 0 ? null : lcaLivenessConfigOvalParameters, (i & 16) != 0 ? null : lcaLivenessConfigFaceDetectionConfig, (i & 32) != 0 ? null : lcaLivenessConfigFaceQcConfig, (i & 64) != 0 ? null : lcaLivenessConfigFaceQcConfig2, (i & 128) != 0 ? null : lcaLivenessConfigSensorConfig, (i & 256) != 0 ? null : eFRConfig, (i & 512) == 0 ? str2 : null);
    }
}
