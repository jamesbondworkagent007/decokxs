package com.okinc.liveness.lca.ui;

import androidx.lifecycle.MutableLiveData;
import com.okinc.liveness.lca.ai.FaceDetector;
import com.okinc.liveness.lca.data.FaceCheckState;
import com.okinc.liveness.lca.data.ScoreData;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.ui.LivenessProcessState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaLivenessScanViewModel$initCaptchaState$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Float $distancePercentage;
    final /* synthetic */ FaceCheckState $face;
    final /* synthetic */ FaceDetector.QCLabel $qcLabel;
    final /* synthetic */ Float $qcScore;
    int label;
    final /* synthetic */ LcaLivenessScanViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessScanViewModel$initCaptchaState$4$1(LcaLivenessScanViewModel lcaLivenessScanViewModel, FaceCheckState faceCheckState, FaceDetector.QCLabel qCLabel, Float f, Float f2, Continuation<? super LcaLivenessScanViewModel$initCaptchaState$4$1> continuation) {
        super(2, continuation);
        this.this$0 = lcaLivenessScanViewModel;
        this.$face = faceCheckState;
        this.$qcLabel = qCLabel;
        this.$distancePercentage = f;
        this.$qcScore = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaLivenessScanViewModel$initCaptchaState$4$1(this.this$0, this.$face, this.$qcLabel, this.$distancePercentage, this.$qcScore, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LcaLivenessScanViewModel$initCaptchaState$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Float f;
        ScoreData qcScoreResult;
        ArrayList<ColorEvent> colorDisplayList;
        ColorEvent colorEvent;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LcaSdkManager.Companion companion = LcaSdkManager.Companion;
            if (companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl(this.this$0.TAG, "onLivenessCheckStateChanged, faceState: " + this.$face + ", qcLabel: " + this.$qcLabel + ", distancePercentage: " + this.$distancePercentage);
            }
            MutableLiveData mutableLiveData = this.this$0._processState;
            FaceCheckState faceCheckState = this.$face;
            FaceDetector.QCLabel qCLabel = this.$qcLabel;
            mutableLiveData.setValue(new LivenessProcessState.FaceStateChanged(faceCheckState, qCLabel != null ? qCLabel.toString() : null, this.$qcScore, this.$distancePercentage));
            FaceCheckState faceCheckState2 = this.$face;
            if (faceCheckState2 instanceof FaceCheckState.Initial) {
                Integer instructionId = faceCheckState2.getInstructionId();
                int instructionStringRes = FaceDetector.FaceOvalPosition.MATCHED.getInstructionStringRes();
                if (instructionId != null && instructionId.intValue() == instructionStringRes) {
                    if (!this.this$0.initFarFaceChecking) {
                        pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - far face oval match");
                        this.this$0.initFarFaceChecking = true;
                        this.this$0._processState.setValue(LivenessProcessState.FarFaceOvalMatched.INSTANCE);
                        FaceCaptchaManager faceCaptchaManager = this.this$0.getFaceCaptchaManager();
                        if (faceCaptchaManager != null) {
                            faceCaptchaManager.onHolding(true);
                        }
                    }
                } else {
                    if (this.this$0.initFarFaceChecking) {
                        pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - far face oval matching stopped");
                        this.this$0._processState.setValue(LivenessProcessState.FarFaceOvalAborted.INSTANCE);
                    }
                    this.this$0.initFarFaceChecking = false;
                    FaceCaptchaManager faceCaptchaManager2 = this.this$0.getFaceCaptchaManager();
                    if (faceCaptchaManager2 != null) {
                        faceCaptchaManager2.onHolding(false);
                    }
                }
            } else if (faceCheckState2 instanceof FaceCheckState.Running) {
                Integer instructionId2 = faceCheckState2.getInstructionId();
                int instructionStringRes2 = FaceDetector.FaceOvalPosition.MATCHED.getInstructionStringRes();
                if (instructionId2 != null && instructionId2.intValue() == instructionStringRes2) {
                    if (!this.this$0.colorChallenging) {
                        pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - close face oval match");
                        this.this$0._processState.setValue(LivenessProcessState.CloseFaceOvalMatched.INSTANCE);
                        if (!this.this$0.freshnessTriggeredBefore) {
                            this.this$0.freshnessTriggeredBefore = true;
                            pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - freshness first triggered");
                            this.this$0._processState.setValue(LivenessProcessState.FreshnessFirstTriggered.INSTANCE);
                        }
                    } else if (companion.getInstance().getConfiguration().getDebugMode() && (f = this.$qcScore) != null) {
                        LcaLivenessScanViewModel lcaLivenessScanViewModel = this.this$0;
                        float fFloatValue = f.floatValue();
                        FaceCaptchaManager faceCaptchaManager3 = lcaLivenessScanViewModel.getFaceCaptchaManager();
                        if (faceCaptchaManager3 != null && (colorDisplayList = faceCaptchaManager3.getColorDisplayList()) != null && (colorEvent = (ColorEvent) CollectionsKt___CollectionsKt.wlaJM(colorDisplayList)) != null) {
                            if (colorEvent.getQcScores() == null) {
                                colorEvent.setQcScores(new ArrayList());
                            }
                            List<Double> qcScores = colorEvent.getQcScores();
                            if (qcScores != null) {
                                C56443yFo.KWHzl(qcScores.add(C56443yFo.AEQbTJ(f.floatValue())));
                            }
                        }
                        FaceCaptchaManager faceCaptchaManager4 = lcaLivenessScanViewModel.getFaceCaptchaManager();
                        if (faceCaptchaManager4 != null && (qcScoreResult = faceCaptchaManager4.getQcScoreResult()) != null) {
                            C56529yIt c56529yIt = C56529yIt.KWHzl;
                            String str = String.format(Locale.US, "%.3f", Arrays.copyOf(new Object[]{C56443yFo.AEQbTJ(fFloatValue)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            qcScoreResult.addScore(Double.parseDouble(str));
                        }
                    }
                    FaceCaptchaManager faceCaptchaManager5 = this.this$0.getFaceCaptchaManager();
                    if (faceCaptchaManager5 != null) {
                        faceCaptchaManager5.onHolding(true);
                    }
                } else if (this.this$0.colorChallenging) {
                    pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - close face stopped color challenge");
                    this.this$0._processState.setValue(LivenessProcessState.CloseFaceOvalAborted.INSTANCE);
                    FaceCaptchaManager faceCaptchaManager6 = this.this$0.getFaceCaptchaManager();
                    if (faceCaptchaManager6 != null) {
                        faceCaptchaManager6.onHolding(false);
                    }
                } else {
                    FaceCaptchaManager faceCaptchaManager7 = this.this$0.getFaceCaptchaManager();
                    if (faceCaptchaManager7 != null) {
                        faceCaptchaManager7.onHolding(false);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
