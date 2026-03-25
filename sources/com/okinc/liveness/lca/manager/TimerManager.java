package com.okinc.liveness.lca.manager;

import android.os.CountDownTimer;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class TimerManager {
    public static final int $stable = 8;
    public final String KYC_LOG_TAG;
    public final String TAG;
    public final long TIMER_INTERVAL;
    public final LcaSdkLivenessConfig config;
    public CountDownTimer countDownTimer;
    public final Function0<Unit> onTimeout;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeoutType.values().length];
            try {
                iArr[TimeoutType.LIVENESS_TIMEOUT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeoutType.FLASH_TIMEOUT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TimerManager(LcaSdkLivenessConfig lcaSdkLivenessConfig, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.config = lcaSdkLivenessConfig;
        this.onTimeout = function0;
        this.TAG = "TimerHandler";
        this.KYC_LOG_TAG = "kyc_in_house";
        this.TIMER_INTERVAL = 1000L;
    }

    public final void startTimer(@NotNull TimeoutType timeoutType) {
        Intrinsics.checkNotNullParameter(timeoutType, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - starting timeout timer");
        cancelTimer();
        this.countDownTimer = new CountDownTimer(calculateTimerTimeout(timeoutType), this.TIMER_INTERVAL) { // from class: com.okinc.liveness.lca.manager.TimerManager.startTimer.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                pUU.KWHzl(this.TAG, "Lca liveness - Time remaining: " + (j / ((long) 1000)) + " s");
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - Timer finished, triggering timeout");
                this.onTimeout.invoke();
            }
        }.start();
    }

    public final long calculateTimerTimeout(TimeoutType timeoutType) {
        LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig;
        Integer ovalFitTimeout;
        LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig2;
        Integer ovalFitTimeout2;
        LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig3;
        LcaSdkLivenessConfigFaceDetectionConfig faceDetectionConfig4;
        Long colorFlashingTimeout;
        int i = WhenMappings.$EnumSwitchMapping$0[timeoutType.ordinal()];
        Long lValueOf = null;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            LcaSdkLivenessConfig livenessConfig = LcaSdkManager.Companion.getInstance().getConfiguration().getLivenessConfig();
            if (livenessConfig != null && (faceDetectionConfig4 = livenessConfig.getFaceDetectionConfig()) != null && (colorFlashingTimeout = faceDetectionConfig4.getColorFlashingTimeout()) != null) {
                return colorFlashingTimeout.longValue();
            }
            LcaSdkLivenessConfig lcaSdkLivenessConfig = this.config;
            if (lcaSdkLivenessConfig != null && (faceDetectionConfig3 = lcaSdkLivenessConfig.getFaceDetectionConfig()) != null) {
                lValueOf = faceDetectionConfig3.getColorFlashingTimeout();
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            return 15000L;
        }
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        Long forceTimeoutDuration = companion.getInstance().getConfiguration().getForceTimeoutDuration();
        if (forceTimeoutDuration != null) {
            return forceTimeoutDuration.longValue();
        }
        LcaSdkLivenessConfig livenessConfig2 = companion.getInstance().getConfiguration().getLivenessConfig();
        Long lValueOf2 = (livenessConfig2 == null || (faceDetectionConfig2 = livenessConfig2.getFaceDetectionConfig()) == null || (ovalFitTimeout2 = faceDetectionConfig2.getOvalFitTimeout()) == null) ? null : Long.valueOf(ovalFitTimeout2.intValue());
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        LcaSdkLivenessConfig lcaSdkLivenessConfig2 = this.config;
        if (lcaSdkLivenessConfig2 != null && (faceDetectionConfig = lcaSdkLivenessConfig2.getFaceDetectionConfig()) != null && (ovalFitTimeout = faceDetectionConfig.getOvalFitTimeout()) != null) {
            lValueOf = Long.valueOf(ovalFitTimeout.intValue());
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 60000L;
    }

    public final void cancelTimer() {
        pUU.KWHzl(this.KYC_LOG_TAG, "Lca liveness - cancel timeout timer");
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = null;
    }
}
