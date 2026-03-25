package com.okinc.liveness.lca.ui;

import com.okinc.liveness.lca.components.FreshnessView;
import com.okinc.liveness.lca.data.ColorChallengeElement;
import com.okinc.liveness.lca.data.ColorChallengeSequence;
import com.okinc.liveness.lca.manager.CameraManager;
import com.okinc.liveness.lca.manager.CameraManagerListener;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.manager.TimerManager;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C45697sut;
import o.C45702suy;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaLivenessScanActivity$initCamera$1$1 implements CameraManagerListener {
    public final /* synthetic */ LcaLivenessScanActivity this$0;

    public LcaLivenessScanActivity$initCamera$1$1(LcaLivenessScanActivity lcaLivenessScanActivity) {
        this.this$0 = lcaLivenessScanActivity;
    }

    @Override // com.okinc.liveness.lca.manager.CameraManagerListener
    public void onColorChallengeStart() {
        C45702suy c45702suy = this.this$0.binding;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        FreshnessView freshnessView = c45702suy.KWHzl;
        final LcaLivenessScanActivity lcaLivenessScanActivity = this.this$0;
        ColorChallengeSequence value = lcaLivenessScanActivity.getViewModel().getColorChallengeSequence().getValue();
        if (value != null) {
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.EZpvd(lcaLivenessScanActivity.getTAG(), "colorDisplayList, startColorChallenge - colorChallengeSequence.challengeColors=" + value.getChallengeColors());
            }
            freshnessView.startColorChallenge(value.getChallengeColors(), new yHT() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$initCamera$1$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHT
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return LcaLivenessScanActivity$initCamera$1$1.onColorChallengeStart$lambda$5$lambda$4$lambda$0(lcaLivenessScanActivity, (ColorChallengeElement) obj, (ColorChallengeElement) obj2, ((Integer) obj3).intValue(), ((Long) obj4).longValue());
                }
            }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$initCamera$1$1$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LcaLivenessScanActivity$initCamera$1$1.onColorChallengeStart$lambda$5$lambda$4$lambda$1(lcaLivenessScanActivity);
                }
            }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$initCamera$1$1$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LcaLivenessScanActivity$initCamera$1$1.onColorChallengeStart$lambda$5$lambda$4$lambda$2(lcaLivenessScanActivity);
                }
            }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanActivity$initCamera$1$1$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LcaLivenessScanActivity$initCamera$1$1.onColorChallengeStart$lambda$5$lambda$4$lambda$3(lcaLivenessScanActivity);
                }
            });
        }
    }

    public static final Unit onColorChallengeStart$lambda$5$lambda$4$lambda$0(LcaLivenessScanActivity lcaLivenessScanActivity, ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2, int i, long j) {
        Intrinsics.checkNotNullParameter(colorChallengeElement, "");
        lcaLivenessScanActivity.getViewModel().onColorDisplayed(colorChallengeElement.getColor(), colorChallengeElement2 != null ? colorChallengeElement2.getColor() : null, i, j);
        return Unit.INSTANCE;
    }

    public static final Unit onColorChallengeStart$lambda$5$lambda$4$lambda$1(LcaLivenessScanActivity lcaLivenessScanActivity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = lcaLivenessScanActivity.cameraManager;
        if (cameraManager != null) {
            cameraManager.onColorChallengeEnd(jCurrentTimeMillis);
        }
        CameraManager cameraManager2 = lcaLivenessScanActivity.cameraManager;
        if (cameraManager2 != null) {
            cameraManager2.updateFrameIndices();
        }
        CameraManager cameraManager3 = lcaLivenessScanActivity.cameraManager;
        if (cameraManager3 != null) {
            cameraManager3.endVideoRecordingAsComplete();
        }
        TimerManager timerManager = lcaLivenessScanActivity.timerManager;
        if (timerManager != null) {
            timerManager.cancelTimer();
        }
        lcaLivenessScanActivity.getViewModel().onColorChallengeComplete(jCurrentTimeMillis);
        return Unit.INSTANCE;
    }

    public static final Unit onColorChallengeStart$lambda$5$lambda$4$lambda$2(LcaLivenessScanActivity lcaLivenessScanActivity) {
        lcaLivenessScanActivity.getViewModel().freshnessStarted();
        return Unit.INSTANCE;
    }

    public static final Unit onColorChallengeStart$lambda$5$lambda$4$lambda$3(LcaLivenessScanActivity lcaLivenessScanActivity) {
        lcaLivenessScanActivity.getViewModel().freshnessCompleted();
        return Unit.INSTANCE;
    }

    @Override // com.okinc.liveness.lca.manager.CameraManagerListener
    public void onColorChallengeStop() {
        C45702suy c45702suy = this.this$0.binding;
        if (c45702suy == null) {
            Intrinsics.gEmmrt("");
            c45702suy = null;
        }
        c45702suy.KWHzl.cancel();
    }

    @Override // com.okinc.liveness.lca.manager.CameraManagerListener
    public void onVideoSegmentReady(byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.this$0.getViewModel().onVideoSegmentReady(bArr, j);
    }

    @Override // com.okinc.liveness.lca.manager.CameraManagerListener
    public void onVideoMuxerComplete(long j, File file) {
        Intrinsics.checkNotNullParameter(file, "");
        this.this$0.getViewModel().onVideoRecordingComplete(j, file);
    }

    @Override // com.okinc.liveness.lca.manager.CameraManagerListener
    public void onError(String str, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        LcaLivenessScanActivity.displayRetry$default(this.this$0, C45697sut.Application.gEmmrt, C45697sut.Application.AYXKKw, str, th, false, 16, null);
    }
}
