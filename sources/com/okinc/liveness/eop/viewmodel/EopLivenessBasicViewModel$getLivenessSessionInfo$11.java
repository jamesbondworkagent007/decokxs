package com.okinc.liveness.eop.viewmodel;

import com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig;
import com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig;
import com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig;
import com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters;
import com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig;
import com.okinc.liveness.eop.bean.LivenessConfig;
import com.okinc.liveness.eop.bean.LivenessSessionInfoResp;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigOvalParameters;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessBasicViewModel$getLivenessSessionInfo$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lcaSessionId;
    final /* synthetic */ LivenessConfig $livenessConfig;
    final /* synthetic */ LivenessSessionInfoResp $result;
    int label;
    final /* synthetic */ EopLivenessBasicViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessBasicViewModel$getLivenessSessionInfo$11(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, LivenessSessionInfoResp livenessSessionInfoResp, LivenessConfig livenessConfig, Continuation<? super EopLivenessBasicViewModel$getLivenessSessionInfo$11> continuation) {
        super(2, continuation);
        this.this$0 = eopLivenessBasicViewModel;
        this.$lcaSessionId = str;
        this.$result = livenessSessionInfoResp;
        this.$livenessConfig = livenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessBasicViewModel$getLivenessSessionInfo$11(this.this$0, this.$lcaSessionId, this.$result, this.$livenessConfig, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessBasicViewModel$getLivenessSessionInfo$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AhwBna(this.$lcaSessionId);
            EopLivenessBasicViewModel eopLivenessBasicViewModel = this.this$0;
            String encryptionData = this.$result.getEncryptionData();
            Intrinsics.copydefault((Object) encryptionData);
            eopLivenessBasicViewModel.valueOf(encryptionData);
            EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.this$0;
            LcaLivenessConfigCollectedVideoConfig collectedVideoConfig = this.$livenessConfig.getCollectedVideoConfig();
            Integer bitrate = collectedVideoConfig != null ? collectedVideoConfig.getBitrate() : null;
            LcaLivenessConfigCollectedVideoConfig collectedVideoConfig2 = this.$livenessConfig.getCollectedVideoConfig();
            Integer resolutionHeight = collectedVideoConfig2 != null ? collectedVideoConfig2.getResolutionHeight() : null;
            LcaLivenessConfigCollectedVideoConfig collectedVideoConfig3 = this.$livenessConfig.getCollectedVideoConfig();
            Integer resolutionWidth = collectedVideoConfig3 != null ? collectedVideoConfig3.getResolutionWidth() : null;
            LcaLivenessConfigCollectedVideoConfig collectedVideoConfig4 = this.$livenessConfig.getCollectedVideoConfig();
            LcaSdkLivenessConfigCollectedVideoConfig lcaSdkLivenessConfigCollectedVideoConfig = new LcaSdkLivenessConfigCollectedVideoConfig(bitrate, resolutionHeight, resolutionWidth, collectedVideoConfig4 != null ? collectedVideoConfig4.getFps() : null);
            LcaLivenessConfigOvalParameters ovalParameters = this.$livenessConfig.getOvalParameters();
            Float farOvalWidthScreenRatio = ovalParameters != null ? ovalParameters.getFarOvalWidthScreenRatio() : null;
            LcaLivenessConfigOvalParameters ovalParameters2 = this.$livenessConfig.getOvalParameters();
            Float farOvalHeightRatio = ovalParameters2 != null ? ovalParameters2.getFarOvalHeightRatio() : null;
            LcaLivenessConfigOvalParameters ovalParameters3 = this.$livenessConfig.getOvalParameters();
            Float faceOvalWidthScreenRatio = ovalParameters3 != null ? ovalParameters3.getFaceOvalWidthScreenRatio() : null;
            LcaLivenessConfigOvalParameters ovalParameters4 = this.$livenessConfig.getOvalParameters();
            LcaSdkLivenessConfigOvalParameters lcaSdkLivenessConfigOvalParameters = new LcaSdkLivenessConfigOvalParameters(farOvalWidthScreenRatio, farOvalHeightRatio, faceOvalWidthScreenRatio, ovalParameters4 != null ? ovalParameters4.getFaceOvalHeightRatio() : null);
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig = this.$livenessConfig.getFaceDetectionConfig();
            Float faceDetectionScoreThreshold = faceDetectionConfig != null ? faceDetectionConfig.getFaceDetectionScoreThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig2 = this.$livenessConfig.getFaceDetectionConfig();
            Float initialFaceDistanceThresholdMax = faceDetectionConfig2 != null ? faceDetectionConfig2.getInitialFaceDistanceThresholdMax() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig3 = this.$livenessConfig.getFaceDetectionConfig();
            Float initialFaceDistanceThresholdMin = faceDetectionConfig3 != null ? faceDetectionConfig3.getInitialFaceDistanceThresholdMin() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig4 = this.$livenessConfig.getFaceDetectionConfig();
            Float freshFaceDistanceThresholdMax = faceDetectionConfig4 != null ? faceDetectionConfig4.getFreshFaceDistanceThresholdMax() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig5 = this.$livenessConfig.getFaceDetectionConfig();
            Float freshFaceDistanceThresholdMin = faceDetectionConfig5 != null ? faceDetectionConfig5.getFreshFaceDistanceThresholdMin() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig6 = this.$livenessConfig.getFaceDetectionConfig();
            Integer ovalFitTimeout = faceDetectionConfig6 != null ? faceDetectionConfig6.getOvalFitTimeout() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig7 = this.$livenessConfig.getFaceDetectionConfig();
            Integer farHoldDuration = faceDetectionConfig7 != null ? faceDetectionConfig7.getFarHoldDuration() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig8 = this.$livenessConfig.getFaceDetectionConfig();
            Float onHoldThresholdMaxRatio = faceDetectionConfig8 != null ? faceDetectionConfig8.getOnHoldThresholdMaxRatio() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig9 = this.$livenessConfig.getFaceDetectionConfig();
            Float onHoldThresholdMinRatio = faceDetectionConfig9 != null ? faceDetectionConfig9.getOnHoldThresholdMinRatio() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig10 = this.$livenessConfig.getFaceDetectionConfig();
            Float positionTopThreshold = faceDetectionConfig10 != null ? faceDetectionConfig10.getPositionTopThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig11 = this.$livenessConfig.getFaceDetectionConfig();
            Float positionBottomThreshold = faceDetectionConfig11 != null ? faceDetectionConfig11.getPositionBottomThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig12 = this.$livenessConfig.getFaceDetectionConfig();
            Float notFrontalFaceHeadTiltAngelThreshold = faceDetectionConfig12 != null ? faceDetectionConfig12.getNotFrontalFaceHeadTiltAngelThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig13 = this.$livenessConfig.getFaceDetectionConfig();
            Float notFrontalFaceHeadPitchAngelThreshold = faceDetectionConfig13 != null ? faceDetectionConfig13.getNotFrontalFaceHeadPitchAngelThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig14 = this.$livenessConfig.getFaceDetectionConfig();
            Float notFrontalFaceEyeDistanceRatioThreshold = faceDetectionConfig14 != null ? faceDetectionConfig14.getNotFrontalFaceEyeDistanceRatioThreshold() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig15 = this.$livenessConfig.getFaceDetectionConfig();
            Integer freshnessQcDelayDuration = faceDetectionConfig15 != null ? faceDetectionConfig15.getFreshnessQcDelayDuration() : null;
            LcaLivenessConfigFaceDetectionConfig faceDetectionConfig16 = this.$livenessConfig.getFaceDetectionConfig();
            LcaSdkLivenessConfigFaceDetectionConfig lcaSdkLivenessConfigFaceDetectionConfig = new LcaSdkLivenessConfigFaceDetectionConfig(faceDetectionScoreThreshold, initialFaceDistanceThresholdMax, initialFaceDistanceThresholdMin, freshFaceDistanceThresholdMax, freshFaceDistanceThresholdMin, ovalFitTimeout, farHoldDuration, onHoldThresholdMaxRatio, onHoldThresholdMinRatio, positionTopThreshold, positionBottomThreshold, notFrontalFaceHeadTiltAngelThreshold, notFrontalFaceHeadPitchAngelThreshold, notFrontalFaceEyeDistanceRatioThreshold, freshnessQcDelayDuration, faceDetectionConfig16 != null ? faceDetectionConfig16.getColorFlashingTimeout() : null);
            LcaLivenessConfigFaceQcConfig faceQcConfig = this.$livenessConfig.getFaceQcConfig();
            Float faceQcOkThreshold = faceQcConfig != null ? faceQcConfig.getFaceQcOkThreshold() : null;
            LcaLivenessConfigFaceQcConfig faceQcConfig2 = this.$livenessConfig.getFaceQcConfig();
            Float faceQcBlurThreshold = faceQcConfig2 != null ? faceQcConfig2.getFaceQcBlurThreshold() : null;
            LcaLivenessConfigFaceQcConfig faceQcConfig3 = this.$livenessConfig.getFaceQcConfig();
            Float faceQcBlockThreshold = faceQcConfig3 != null ? faceQcConfig3.getFaceQcBlockThreshold() : null;
            LcaLivenessConfigFaceQcConfig faceQcConfig4 = this.$livenessConfig.getFaceQcConfig();
            Float faceQcBrightThreshold = faceQcConfig4 != null ? faceQcConfig4.getFaceQcBrightThreshold() : null;
            LcaLivenessConfigFaceQcConfig faceQcConfig5 = this.$livenessConfig.getFaceQcConfig();
            LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig = new LcaSdkLivenessConfigFaceQcConfig(faceQcOkThreshold, faceQcBlurThreshold, faceQcBlockThreshold, faceQcBrightThreshold, faceQcConfig5 != null ? faceQcConfig5.getFaceQcDarkThreshold() : null);
            LcaLivenessConfigFaceQcConfig freshnessQcConfig = this.$livenessConfig.getFreshnessQcConfig();
            Float faceQcOkThreshold2 = freshnessQcConfig != null ? freshnessQcConfig.getFaceQcOkThreshold() : null;
            LcaLivenessConfigFaceQcConfig freshnessQcConfig2 = this.$livenessConfig.getFreshnessQcConfig();
            Float faceQcBlurThreshold2 = freshnessQcConfig2 != null ? freshnessQcConfig2.getFaceQcBlurThreshold() : null;
            LcaLivenessConfigFaceQcConfig freshnessQcConfig3 = this.$livenessConfig.getFreshnessQcConfig();
            Float faceQcBlockThreshold2 = freshnessQcConfig3 != null ? freshnessQcConfig3.getFaceQcBlockThreshold() : null;
            LcaLivenessConfigFaceQcConfig freshnessQcConfig4 = this.$livenessConfig.getFreshnessQcConfig();
            Float faceQcBrightThreshold2 = freshnessQcConfig4 != null ? freshnessQcConfig4.getFaceQcBrightThreshold() : null;
            LcaLivenessConfigFaceQcConfig freshnessQcConfig5 = this.$livenessConfig.getFreshnessQcConfig();
            LcaSdkLivenessConfigFaceQcConfig lcaSdkLivenessConfigFaceQcConfig2 = new LcaSdkLivenessConfigFaceQcConfig(faceQcOkThreshold2, faceQcBlurThreshold2, faceQcBlockThreshold2, faceQcBrightThreshold2, freshnessQcConfig5 != null ? freshnessQcConfig5.getFaceQcDarkThreshold() : null);
            LcaLivenessConfigSensorConfig sensor = this.$livenessConfig.getSensor();
            Long motionSamplingIntervalMs = sensor != null ? sensor.getMotionSamplingIntervalMs() : null;
            LcaLivenessConfigSensorConfig sensor2 = this.$livenessConfig.getSensor();
            eopLivenessBasicViewModel2.copydefault(new LcaSdkLivenessConfig(lcaSdkLivenessConfigCollectedVideoConfig, lcaSdkLivenessConfigOvalParameters, lcaSdkLivenessConfigFaceDetectionConfig, lcaSdkLivenessConfigFaceQcConfig, lcaSdkLivenessConfigFaceQcConfig2, new LcaSdkLivenessConfigSensor(motionSamplingIntervalMs, sensor2 != null ? sensor2.getMotionSamplingIntervalFarToCloseMs() : null)));
            this.this$0.OLrzqt(EopLivenessBasicViewModel.Companion.OLrzqt());
            EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.this$0;
            eopLivenessBasicViewModel3.AYXKKw(eopLivenessBasicViewModel3.uzCIH());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
