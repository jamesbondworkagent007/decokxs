package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaSdkLivenessConfig {
    public static final int $stable = 8;
    private final LcaSdkLivenessConfigCollectedVideoConfig collectedVideoConfig;
    private final LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig;
    private final LcaSdkLivenessConfigFaceQcConfig faceQcConfig;
    private final LcaSdkLivenessConfigFaceQcConfig freshnessQcConfig;
    private final LcaSdkLivenessConfigOvalParameters ovalParameters;
    private final LcaSdkLivenessConfigSensor sensorConfig;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaSdkLivenessConfig copy$default(LcaSdkLivenessConfig lcaSdkLivenessConfig, LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig, LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters, LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig2, LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor, int i, Object obj) {
        if ((i & 1) != 0) {
            lcaSdkLivenessConfigCollectedVideoConfig = lcaSdkLivenessConfig.collectedVideoConfig;
        }
        if ((i & 2) != 0) {
            lcaSdkLivenessConfigOvalParameters = lcaSdkLivenessConfig.ovalParameters;
        }
        LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters2 = lcaSdkLivenessConfigOvalParameters;
        if ((i & 4) != 0) {
            lcaSdkLivenessConfigFaceDetectionConfig = lcaSdkLivenessConfig.faceDetectionConfig;
        }
        LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig2 = lcaSdkLivenessConfigFaceDetectionConfig;
        if ((i & 8) != 0) {
            lcaSdkLivenessConfigFaceQcConfig = lcaSdkLivenessConfig.faceQcConfig;
        }
        LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig3 = lcaSdkLivenessConfigFaceQcConfig;
        if ((i & 16) != 0) {
            lcaSdkLivenessConfigFaceQcConfig2 = lcaSdkLivenessConfig.freshnessQcConfig;
        }
        LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig4 = lcaSdkLivenessConfigFaceQcConfig2;
        if ((i & 32) != 0) {
            lcaSdkLivenessConfigSensor = lcaSdkLivenessConfig.sensorConfig;
        }
        return lcaSdkLivenessConfig.copy(lcaSdkLivenessConfigCollectedVideoConfig, lcaSdkLivenessConfigOvalParameters2, lcaSdkLivenessConfigFaceDetectionConfig2, lcaSdkLivenessConfigFaceQcConfig3, lcaSdkLivenessConfigFaceQcConfig4, lcaSdkLivenessConfigSensor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigCollectedVideoConfig component1() {
        return this.collectedVideoConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigOvalParameters component2() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceDetectionConfig component3() {
        return this.faceDetectionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceQcConfig component4() {
        return this.faceQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceQcConfig component5() {
        return this.freshnessQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigSensor component6() {
        return this.sensorConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig copy(@NotNull LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig, @NotNull LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters, @NotNull LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig, @NotNull LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig2, LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor) {
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigCollectedVideoConfig, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigOvalParameters, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigFaceDetectionConfig, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigFaceQcConfig, "");
        return new LcaSdkLivenessConfig(lcaSdkLivenessConfigCollectedVideoConfig, lcaSdkLivenessConfigOvalParameters, lcaSdkLivenessConfigFaceDetectionConfig, lcaSdkLivenessConfigFaceQcConfig, lcaSdkLivenessConfigFaceQcConfig2, lcaSdkLivenessConfigSensor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkLivenessConfig)) {
            return false;
        }
        LcaSdkLivenessConfig lcaSdkLivenessConfig = (LcaSdkLivenessConfig) obj;
        return Intrinsics.EZpvd(this.collectedVideoConfig, lcaSdkLivenessConfig.collectedVideoConfig) && Intrinsics.EZpvd(this.ovalParameters, lcaSdkLivenessConfig.ovalParameters) && Intrinsics.EZpvd(this.faceDetectionConfig, lcaSdkLivenessConfig.faceDetectionConfig) && Intrinsics.EZpvd(this.faceQcConfig, lcaSdkLivenessConfig.faceQcConfig) && Intrinsics.EZpvd(this.freshnessQcConfig, lcaSdkLivenessConfig.freshnessQcConfig) && Intrinsics.EZpvd(this.sensorConfig, lcaSdkLivenessConfig.sensorConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigCollectedVideoConfig getCollectedVideoConfig() {
        return this.collectedVideoConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceDetectionConfig getFaceDetectionConfig() {
        return this.faceDetectionConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceQcConfig getFaceQcConfig() {
        return this.faceQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigFaceQcConfig getFreshnessQcConfig() {
        return this.freshnessQcConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigOvalParameters getOvalParameters() {
        return this.ovalParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfigSensor getSensorConfig() {
        return this.sensorConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.collectedVideoConfig.hashCode();
        int iHashCode2 = this.ovalParameters.hashCode();
        int iHashCode3 = this.faceDetectionConfig.hashCode();
        int iHashCode4 = this.faceQcConfig.hashCode();
        LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig = this.freshnessQcConfig;
        int iHashCode5 = lcaSdkLivenessConfigFaceQcConfig == null ? 0 : lcaSdkLivenessConfigFaceQcConfig.hashCode();
        LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor = this.sensorConfig;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (lcaSdkLivenessConfigSensor != null ? lcaSdkLivenessConfigSensor.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkLivenessConfig(collectedVideoConfig=" + this.collectedVideoConfig + ", ovalParameters=" + this.ovalParameters + ", faceDetectionConfig=" + this.faceDetectionConfig + ", faceQcConfig=" + this.faceQcConfig + ", freshnessQcConfig=" + this.freshnessQcConfig + ", sensorConfig=" + this.sensorConfig + ")";
    }

    public LcaSdkLivenessConfig(@NotNull LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig, @NotNull LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters, @NotNull LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig, @NotNull LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig2, LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor) {
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigCollectedVideoConfig, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigOvalParameters, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigFaceDetectionConfig, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfigFaceQcConfig, "");
        this.collectedVideoConfig = lcaSdkLivenessConfigCollectedVideoConfig;
        this.ovalParameters = lcaSdkLivenessConfigOvalParameters;
        this.faceDetectionConfig = lcaSdkLivenessConfigFaceDetectionConfig;
        this.faceQcConfig = lcaSdkLivenessConfigFaceQcConfig;
        this.freshnessQcConfig = lcaSdkLivenessConfigFaceQcConfig2;
        this.sensorConfig = lcaSdkLivenessConfigSensor;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig)
  (r11v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigOvalParameters)
  (r12v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig)
  (r13v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig)
  (wrap:com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig) : (r14v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig))
  (wrap:com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor) : (r15v0 com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor))
 A[MD:(com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigOvalParameters, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor):void (m)] (LINE:29) call: com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig.<init>(com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigOvalParameters, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig, com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor):void type: THIS */
    public /* synthetic */ LcaSdkLivenessConfig(LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig, LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters, LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig, LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig2, LcaSdkLivenessConfigSensor lcaSdkLivenessConfigSensor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lcaSdkLivenessConfigCollectedVideoConfig, lcaSdkLivenessConfigOvalParameters, lcaSdkLivenessConfigFaceDetectionConfig, lcaSdkLivenessConfigFaceQcConfig, (i & 16) != 0 ? null : lcaSdkLivenessConfigFaceQcConfig2, (i & 32) != 0 ? null : lcaSdkLivenessConfigSensor);
    }
}
