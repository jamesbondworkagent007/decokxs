package com.okinc.liveness.lca;

import com.google.gson.Gson;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.ok_kyc_core.data.lca.LcaMissedKeyException;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LivenessSessionInfoLcaEncryptionData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43292rmY;
import o.C6777aVl;
import o.C6885aXn;
import o.C6887aXp;
import o.InterfaceC6884aXm;
import o.pUU;
import o.rTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaSdkConfiguration {
    public static final int API_MODE_JWST = 0;
    public static final int ENV_SWIMLANE = 0;
    public static final int FACE_OVAL_ANIMATION_DEFAULT = 0;
    public final int apiMode;
    public final String bizSessionId;
    public final boolean debugMode;
    public final boolean enableDataObfuscation;
    public final boolean enableDataSign;
    public final boolean enableQc;
    public final FacialExtParams extParams;
    public final int faceOvalGuideAnimation;
    public final String faceSessionId;
    public final LcaColorChallengeSequenceConfig forceColorSequence;
    public final Long forceTimeoutDuration;
    public String jwstHttpBaseUrl;
    public String jwstWsBaseUrl;
    public final LcaSdkLivenessConfig livenessConfig;
    public final boolean moveCloseShowOrNot;
    public final boolean segmentUpload;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final int API_MODEL_PREDICTION = 1;
    public static final int API_DATA_COLLECTION = 2;
    public static final int API_COMPLIANCE = 3;
    public static final int ENV_OKX = 1;
    public static final int FACE_OVAL_ANIMATION_A = 1;
    public static final int FACE_OVAL_ANIMATION_B = 2;
    public static final String RETRY_REASON_TIMEOUT = "opt_timeout";
    public static final String RETRY_REASON_CAMERA_PERMISSION = "camera_permission";
    public static final String RETRY_REASON_FRONT_CAMERA_UNAVAILABLE = "camera_fromt_unavailable";
    public static final String RETRY_REASON_CAMERA_BIND = "camera_fail";
    public static final String RETRY_REASON_BZ_SESSION_ID_INVALID = "bid_param_invalid";
    public static final String RETRY_REASON_WS_SESSION_ID_INVALID = "wid_param_invalid";
    public static final String RETRY_REASON_FINAL_PARAM_INVALID = "final_param_invalid";
    public static final String RETRY_REASON_FINAL_ENCRYPT_FAIL = "final_param_encrypt_fail";
    public static final String RETRY_REASON_RESUME_FROM_BACKGROUND = "from_background";
    public static final String RETRY_REASON_RESUME_FROM_PAUSE = "from_pause";
    public static final String RETRY_REASON_RESUME_CONFIG_CHANGE = "config_change";
    public static final String RETRY_REASON_LOAD_JNI_LIB_FAIL = "load_jni_library_fail";
    public static final String RETRY_REASON_WS_CLOSE = "ws_connection_close";
    public static final String RETRY_REASON_WS_ERROR = "ws_connection_error";
    public static final String RETRY_REASON_WS_RSP_FAIL = "ws_verify_fail";
    public static final String RETRY_REASON_AUTH_FAIL = "ws_auth_fail";
    public static final String RETRY_REASON_DECRYPT_FAIL = "ws_auth_decrypt_fail";
    public static final String RETRY_REASON_HTTP_ERROR = "http_fail";
    public static final String RETRY_REASON_UNKNOWN = "unknown";
    public static final String DEFAULT_PUB_KEY = "pubKey";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaSdkConfiguration() {
        this(0, null, null, null, null, null, false, false, null, null, false, false, false, 0, false, null, 65535, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.apiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.forceTimeoutDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.debugMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.enableDataSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.enableDataObfuscation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.faceOvalGuideAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.moveCloseShowOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialExtParams component16() {
        return this.extParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig component2() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.jwstHttpBaseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.jwstWsBaseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.enableQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.segmentUpload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaColorChallengeSequenceConfig component9() {
        return this.forceColorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkConfiguration copy(int i, LcaSdkLivenessConfig lcaSdkLivenessConfig, String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, LcaColorChallengeSequenceConfig lcaColorChallengeSequenceConfig, Long l, boolean z3, boolean z4, boolean z5, int i2, boolean z6, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LcaSdkConfiguration(i, lcaSdkLivenessConfig, str, str2, str3, str4, z, z2, lcaColorChallengeSequenceConfig, l, z3, z4, z5, i2, z6, facialExtParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaSdkConfiguration)) {
            return false;
        }
        LcaSdkConfiguration lcaSdkConfiguration = (LcaSdkConfiguration) obj;
        return this.apiMode == lcaSdkConfiguration.apiMode && Intrinsics.EZpvd(this.livenessConfig, lcaSdkConfiguration.livenessConfig) && Intrinsics.EZpvd((Object) this.bizSessionId, (Object) lcaSdkConfiguration.bizSessionId) && Intrinsics.EZpvd((Object) this.faceSessionId, (Object) lcaSdkConfiguration.faceSessionId) && Intrinsics.EZpvd((Object) this.jwstHttpBaseUrl, (Object) lcaSdkConfiguration.jwstHttpBaseUrl) && Intrinsics.EZpvd((Object) this.jwstWsBaseUrl, (Object) lcaSdkConfiguration.jwstWsBaseUrl) && this.enableQc == lcaSdkConfiguration.enableQc && this.segmentUpload == lcaSdkConfiguration.segmentUpload && Intrinsics.EZpvd(this.forceColorSequence, lcaSdkConfiguration.forceColorSequence) && Intrinsics.EZpvd(this.forceTimeoutDuration, lcaSdkConfiguration.forceTimeoutDuration) && this.debugMode == lcaSdkConfiguration.debugMode && this.enableDataSign == lcaSdkConfiguration.enableDataSign && this.enableDataObfuscation == lcaSdkConfiguration.enableDataObfuscation && this.faceOvalGuideAnimation == lcaSdkConfiguration.faceOvalGuideAnimation && this.moveCloseShowOrNot == lcaSdkConfiguration.moveCloseShowOrNot && Intrinsics.EZpvd(this.extParams, lcaSdkConfiguration.extParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiMode() {
        return this.apiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDebugMode() {
        return this.debugMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableDataObfuscation() {
        return this.enableDataObfuscation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableDataSign() {
        return this.enableDataSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableQc() {
        return this.enableQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialExtParams getExtParams() {
        return this.extParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFaceOvalGuideAnimation() {
        return this.faceOvalGuideAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceSessionId() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaColorChallengeSequenceConfig getForceColorSequence() {
        return this.forceColorSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getForceTimeoutDuration() {
        return this.forceTimeoutDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJwstHttpBaseUrl() {
        return this.jwstHttpBaseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJwstWsBaseUrl() {
        return this.jwstWsBaseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig getLivenessConfig() {
        return this.livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMoveCloseShowOrNot() {
        return this.moveCloseShowOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSegmentUpload() {
        return this.segmentUpload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.apiMode);
        LcaSdkLivenessConfig lcaSdkLivenessConfig = this.livenessConfig;
        int iHashCode2 = lcaSdkLivenessConfig == null ? 0 : lcaSdkLivenessConfig.hashCode();
        String str = this.bizSessionId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.faceSessionId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.jwstHttpBaseUrl.hashCode();
        int iHashCode6 = this.jwstWsBaseUrl.hashCode();
        int iHashCode7 = Boolean.hashCode(this.enableQc);
        int iHashCode8 = Boolean.hashCode(this.segmentUpload);
        LcaColorChallengeSequenceConfig lcaColorChallengeSequenceConfig = this.forceColorSequence;
        int iHashCode9 = lcaColorChallengeSequenceConfig == null ? 0 : lcaColorChallengeSequenceConfig.hashCode();
        Long l = this.forceTimeoutDuration;
        int iHashCode10 = l == null ? 0 : l.hashCode();
        int iHashCode11 = Boolean.hashCode(this.debugMode);
        int iHashCode12 = Boolean.hashCode(this.enableDataSign);
        int iHashCode13 = Boolean.hashCode(this.enableDataObfuscation);
        int iHashCode14 = Integer.hashCode(this.faceOvalGuideAnimation);
        int iHashCode15 = Boolean.hashCode(this.moveCloseShowOrNot);
        FacialExtParams facialExtParams = this.extParams;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (facialExtParams == null ? 0 : facialExtParams.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableDataObfuscation() {
        if (this.apiMode == API_COMPLIANCE) {
            return true;
        }
        return this.enableDataObfuscation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableDataSign() {
        if (this.apiMode == API_COMPLIANCE) {
            return true;
        }
        return this.enableDataSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJwstHttpBaseUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.jwstHttpBaseUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJwstWsBaseUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.jwstWsBaseUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaSdkConfiguration(apiMode=" + this.apiMode + ", livenessConfig=" + this.livenessConfig + ", bizSessionId=" + this.bizSessionId + ", faceSessionId=" + this.faceSessionId + ", jwstHttpBaseUrl=" + this.jwstHttpBaseUrl + ", jwstWsBaseUrl=" + this.jwstWsBaseUrl + ", enableQc=" + this.enableQc + ", segmentUpload=" + this.segmentUpload + ", forceColorSequence=" + this.forceColorSequence + ", forceTimeoutDuration=" + this.forceTimeoutDuration + ", debugMode=" + this.debugMode + ", enableDataSign=" + this.enableDataSign + ", enableDataObfuscation=" + this.enableDataObfuscation + ", faceOvalGuideAnimation=" + this.faceOvalGuideAnimation + ", moveCloseShowOrNot=" + this.moveCloseShowOrNot + ", extParams=" + this.extParams + ")";
    }

    public LcaSdkConfiguration(int i, LcaSdkLivenessConfig lcaSdkLivenessConfig, String str, String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, LcaColorChallengeSequenceConfig lcaColorChallengeSequenceConfig, Long l, boolean z3, boolean z4, boolean z5, int i2, boolean z6, FacialExtParams facialExtParams) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.apiMode = i;
        this.livenessConfig = lcaSdkLivenessConfig;
        this.bizSessionId = str;
        this.faceSessionId = str2;
        this.jwstHttpBaseUrl = str3;
        this.jwstWsBaseUrl = str4;
        this.enableQc = z;
        this.segmentUpload = z2;
        this.forceColorSequence = lcaColorChallengeSequenceConfig;
        this.forceTimeoutDuration = l;
        this.debugMode = z3;
        this.enableDataSign = z4;
        this.enableDataObfuscation = z5;
        this.faceOvalGuideAnimation = i2;
        this.moveCloseShowOrNot = z6;
        this.extParams = facialExtParams;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LcaSdkConfiguration(int i, LcaSdkLivenessConfig lcaSdkLivenessConfig, String str, String str2, String str3, String str4, boolean z, boolean z2, LcaColorChallengeSequenceConfig lcaColorChallengeSequenceConfig, Long l, boolean z3, boolean z4, boolean z5, int i2, boolean z6, FacialExtParams facialExtParams, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        int i4 = (i3 & 1) != 0 ? API_COMPLIANCE : i;
        LcaSdkLivenessConfig lcaSdkLivenessConfig2 = (i3 & 2) != 0 ? null : lcaSdkLivenessConfig;
        String str7 = (i3 & 4) != 0 ? null : str;
        String str8 = (i3 & 8) != 0 ? null : str2;
        if ((i3 & 16) != 0) {
            str5 = C43292rmY.OLrzqt.fJNWhG() + LcaNetworkConfig.JWST_HTTP_BASE_URL_PATH;
        } else {
            str5 = str3;
        }
        if ((i3 & 32) != 0) {
            str6 = C43292rmY.OLrzqt.zuBGHE() + LcaNetworkConfig.JWST_WS_BASE_URL_PATH;
        } else {
            str6 = str4;
        }
        this(i4, lcaSdkLivenessConfig2, str7, str8, str5, str6, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? true : z2, (i3 & 256) != 0 ? null : lcaColorChallengeSequenceConfig, (i3 & 512) != 0 ? null : l, (i3 & 1024) != 0 ? false : z3, (i3 & 2048) != 0 ? true : z4, (i3 & 4096) != 0 ? true : z5, (i3 & 8192) != 0 ? FACE_OVAL_ANIMATION_B : i2, (i3 & 16384) != 0 ? true : z6, (i3 & 32768) != 0 ? null : facialExtParams);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.LcaSdkConfiguration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getAPI_MODE_JWST() {
            return LcaSdkConfiguration.API_MODE_JWST;
        }

        public final int getAPI_MODEL_PREDICTION() {
            return LcaSdkConfiguration.API_MODEL_PREDICTION;
        }

        public final int getAPI_DATA_COLLECTION() {
            return LcaSdkConfiguration.API_DATA_COLLECTION;
        }

        public final int getAPI_COMPLIANCE() {
            return LcaSdkConfiguration.API_COMPLIANCE;
        }

        public final int getENV_SWIMLANE() {
            return LcaSdkConfiguration.ENV_SWIMLANE;
        }

        public final int getENV_OKX() {
            return LcaSdkConfiguration.ENV_OKX;
        }

        public final int getFACE_OVAL_ANIMATION_DEFAULT() {
            return LcaSdkConfiguration.FACE_OVAL_ANIMATION_DEFAULT;
        }

        public final int getFACE_OVAL_ANIMATION_A() {
            return LcaSdkConfiguration.FACE_OVAL_ANIMATION_A;
        }

        public final int getFACE_OVAL_ANIMATION_B() {
            return LcaSdkConfiguration.FACE_OVAL_ANIMATION_B;
        }

        public final String getRETRY_REASON_TIMEOUT() {
            return LcaSdkConfiguration.RETRY_REASON_TIMEOUT;
        }

        public final String getRETRY_REASON_CAMERA_PERMISSION() {
            return LcaSdkConfiguration.RETRY_REASON_CAMERA_PERMISSION;
        }

        public final String getRETRY_REASON_FRONT_CAMERA_UNAVAILABLE() {
            return LcaSdkConfiguration.RETRY_REASON_FRONT_CAMERA_UNAVAILABLE;
        }

        public final String getRETRY_REASON_CAMERA_BIND() {
            return LcaSdkConfiguration.RETRY_REASON_CAMERA_BIND;
        }

        public final String getRETRY_REASON_BZ_SESSION_ID_INVALID() {
            return LcaSdkConfiguration.RETRY_REASON_BZ_SESSION_ID_INVALID;
        }

        public final String getRETRY_REASON_WS_SESSION_ID_INVALID() {
            return LcaSdkConfiguration.RETRY_REASON_WS_SESSION_ID_INVALID;
        }

        public final String getRETRY_REASON_FINAL_PARAM_INVALID() {
            return LcaSdkConfiguration.RETRY_REASON_FINAL_PARAM_INVALID;
        }

        public final String getRETRY_REASON_FINAL_ENCRYPT_FAIL() {
            return LcaSdkConfiguration.RETRY_REASON_FINAL_ENCRYPT_FAIL;
        }

        public final String getRETRY_REASON_RESUME_FROM_BACKGROUND() {
            return LcaSdkConfiguration.RETRY_REASON_RESUME_FROM_BACKGROUND;
        }

        public final String getRETRY_REASON_RESUME_FROM_PAUSE() {
            return LcaSdkConfiguration.RETRY_REASON_RESUME_FROM_PAUSE;
        }

        public final String getRETRY_REASON_RESUME_CONFIG_CHANGE() {
            return LcaSdkConfiguration.RETRY_REASON_RESUME_CONFIG_CHANGE;
        }

        public final String getRETRY_REASON_LOAD_JNI_LIB_FAIL() {
            return LcaSdkConfiguration.RETRY_REASON_LOAD_JNI_LIB_FAIL;
        }

        public final String getRETRY_REASON_WS_CLOSE() {
            return LcaSdkConfiguration.RETRY_REASON_WS_CLOSE;
        }

        public final String getRETRY_REASON_WS_ERROR() {
            return LcaSdkConfiguration.RETRY_REASON_WS_ERROR;
        }

        public final String getRETRY_REASON_WS_RSP_FAIL() {
            return LcaSdkConfiguration.RETRY_REASON_WS_RSP_FAIL;
        }

        public final String getRETRY_REASON_AUTH_FAIL() {
            return LcaSdkConfiguration.RETRY_REASON_AUTH_FAIL;
        }

        public final String getRETRY_REASON_DECRYPT_FAIL() {
            return LcaSdkConfiguration.RETRY_REASON_DECRYPT_FAIL;
        }

        public final String getRETRY_REASON_HTTP_ERROR() {
            return LcaSdkConfiguration.RETRY_REASON_HTTP_ERROR;
        }

        public final String getRETRY_REASON_UNKNOWN() {
            return LcaSdkConfiguration.RETRY_REASON_UNKNOWN;
        }
    }

    public final String getPubKey() {
        C6885aXn c6885aXnAEQbTJ;
        String json;
        if (!isEnableDataSign()) {
            return DEFAULT_PUB_KEY;
        }
        InterfaceC6884aXm interfaceC6884aXmOLrzqt = C6887aXp.copydefault.OLrzqt();
        if (interfaceC6884aXmOLrzqt != null && (c6885aXnAEQbTJ = interfaceC6884aXmOLrzqt.AEQbTJ()) != null && (json = new Gson().toJson(rTL.OLrzqt.OLrzqt(new LivenessSessionInfoLcaEncryptionData(c6885aXnAEQbTJ.EZpvd())))) != null) {
            return json;
        }
        pUU.copydefault("kyc_in_house", "getPubKey getKey fail, is null");
        C6777aVl.Companion.EZpvd(new LcaMissedKeyException("no public key"));
        return "";
    }
}
