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
public final class LivenessRouterResp implements Parcelable {
    private String faceCheckType;
    private final LivenessConfig livenessConfig;
    private Boolean needProxy;
    private final String riskVendorType;
    private String sdkConnectHost;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LivenessRouterResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LivenessRouterResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessRouterResp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LivenessRouterResp(string, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? LivenessConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivenessRouterResp[] newArray(int i) {
            return new LivenessRouterResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessRouterResp() {
        this((String) null, (Boolean) null, (String) null, (String) null, (LivenessConfig) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivenessRouterResp copy$default(LivenessRouterResp livenessRouterResp, String str, Boolean bool, String str2, String str3, LivenessConfig livenessConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessRouterResp.faceCheckType;
        }
        if ((i & 2) != 0) {
            bool = livenessRouterResp.needProxy;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            str2 = livenessRouterResp.sdkConnectHost;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = livenessRouterResp.riskVendorType;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            livenessConfig = livenessRouterResp.livenessConfig;
        }
        return livenessRouterResp.copy(str, bool2, str4, str5, livenessConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.faceCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sdkConnectHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.riskVendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessConfig component5() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessRouterResp copy(String str, Boolean bool, String str2, String str3, LivenessConfig livenessConfig) {
        return new LivenessRouterResp(str, bool, str2, str3, livenessConfig);
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
        if (!(obj instanceof LivenessRouterResp)) {
            return false;
        }
        LivenessRouterResp livenessRouterResp = (LivenessRouterResp) obj;
        return Intrinsics.EZpvd((Object) this.faceCheckType, (Object) livenessRouterResp.faceCheckType) && Intrinsics.EZpvd(this.needProxy, livenessRouterResp.needProxy) && Intrinsics.EZpvd((Object) this.sdkConnectHost, (Object) livenessRouterResp.sdkConnectHost) && Intrinsics.EZpvd((Object) this.riskVendorType, (Object) livenessRouterResp.riskVendorType) && Intrinsics.EZpvd(this.livenessConfig, livenessRouterResp.livenessConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceCheckType() {
        return this.faceCheckType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessConfig getLivenessConfig() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedProxy() {
        return this.needProxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskVendorType() {
        return this.riskVendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSdkConnectHost() {
        return this.sdkConnectHost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.faceCheckType;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.needProxy;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str2 = this.sdkConnectHost;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.riskVendorType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        LivenessConfig livenessConfig = this.livenessConfig;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (livenessConfig != null ? livenessConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceCheckType(String str) {
        this.faceCheckType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedProxy(Boolean bool) {
        this.needProxy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSdkConnectHost(String str) {
        this.sdkConnectHost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessRouterResp(faceCheckType=" + this.faceCheckType + ", needProxy=" + this.needProxy + ", sdkConnectHost=" + this.sdkConnectHost + ", riskVendorType=" + this.riskVendorType + ", livenessConfig=" + this.livenessConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.faceCheckType);
        Boolean bool = this.needProxy;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.sdkConnectHost);
        parcel.writeString(this.riskVendorType);
        LivenessConfig livenessConfig = this.livenessConfig;
        if (livenessConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livenessConfig.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LivenessRouterResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LivenessRouterResp> serializer() {
            return LivenessRouterResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LivenessRouterResp(int i, String str, Boolean bool, String str2, String str3, LivenessConfig livenessConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.faceCheckType = "";
        } else {
            this.faceCheckType = str;
        }
        if ((i & 2) == 0) {
            this.needProxy = Boolean.FALSE;
        } else {
            this.needProxy = bool;
        }
        if ((i & 4) == 0) {
            this.sdkConnectHost = "";
        } else {
            this.sdkConnectHost = str2;
        }
        if ((i & 8) == 0) {
            this.riskVendorType = "";
        } else {
            this.riskVendorType = str3;
        }
        if ((i & 16) == 0) {
            this.livenessConfig = null;
        } else {
            this.livenessConfig = livenessConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LivenessRouterResp livenessRouterResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) livenessRouterResp.faceCheckType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, livenessRouterResp.faceCheckType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(livenessRouterResp.needProxy, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, livenessRouterResp.needProxy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) livenessRouterResp.sdkConnectHost, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, livenessRouterResp.sdkConnectHost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) livenessRouterResp.riskVendorType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, livenessRouterResp.riskVendorType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && livenessRouterResp.livenessConfig == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LivenessConfig$$serializer.INSTANCE, livenessRouterResp.livenessConfig);
    }

    public LivenessRouterResp(String str, Boolean bool, String str2, String str3, LivenessConfig livenessConfig) {
        this.faceCheckType = str;
        this.needProxy = bool;
        this.sdkConnectHost = str2;
        this.riskVendorType = str3;
        this.livenessConfig = livenessConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.liveness.eop.bean.LivenessConfig:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.liveness.eop.bean.LivenessConfig) : (r8v0 com.okinc.liveness.eop.bean.LivenessConfig))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.liveness.eop.bean.LivenessConfig):void (m)] (LINE:19) call: com.okinc.liveness.eop.bean.LivenessRouterResp.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.liveness.eop.bean.LivenessConfig):void type: THIS */
    public /* synthetic */ LivenessRouterResp(String str, Boolean bool, String str2, String str3, LivenessConfig livenessConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : livenessConfig);
    }
}
