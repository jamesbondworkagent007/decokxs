package com.okinc.liveness.lca.manager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.gson.Gson;
import com.ibm.icu.text.DateFormat;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.liveness.lca.ai.FaceDetector;
import com.okinc.liveness.lca.data.FaceCheckState;
import com.okinc.liveness.lca.data.ScoreData;
import com.okinc.liveness.lca.data.VideoViewportSize;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.manager.MotionSensorManager;
import com.okinc.liveness.lca.utils.FaceOvalUtils;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigSensor;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FaceCaptchaManager {
    public static final String TAG = "kyc_in_house";
    public long VideoEndTimestamp;
    public long VideoStartTimestamp;
    public int _splashCount;
    public int _splashInterruptCount;
    public RectF closeFaceOvalRect;
    public String colorDisplayInfo;
    public ArrayList<ColorEvent> colorDisplayList;
    public LcaSdkLivenessConfig config;
    public int consecutiveProcessedFrames;
    public int consecutiveSkippedFrames;
    public final Context context;
    public String currentEvent;
    public final DetectionInfoData detectionInfo;
    public String deviceToken;
    public final Map<String, Object> extras;
    public FaceCheckState faceCheckState;
    public int faceDistanceCheckEndIndex;
    public long faceDistanceCheckEndTime;
    public int faceDistanceCheckStartIndex;
    public long faceDistanceCheckStartTime;
    public boolean faceMatched;
    public Long faceMatchedEndTime;
    public Long faceMatchedStartTime;
    public boolean farFaceMatched;
    public Long farFaceMatchedEndTime;
    public Long farFaceMatchedStartTime;
    public RectF farFaceOvalRect;
    public final Gson gson;
    public boolean initialFaceDistanceCheckPassed;
    public boolean initialLocalFaceFound;
    public long lastProcessedLogTime;
    public long lastSkipLogTime;
    public final MotionSensorManager motionSensorManager;
    public final Function0<Unit> onFaceDistanceCheckStarted;
    public final Function0<Unit> onFaceModelLoadFiled;
    public final Function1<Long, Unit> onFaceShow;
    public final Function0<Unit> onFarFaceCheckPassed;
    public boolean onHolding;
    public final yHT<FaceCheckState, FaceDetector.QCLabel, Float, Float, Unit> onLivenessCheckStateChanged;
    public final ScoreData qcScoreResult;
    public boolean runningFreshness;
    public Job sensorCollectionJob;
    public final CoroutineScope sensorCollectionScope;
    public final List<MotionSensorManager.SensorReading> sensorReadingsWithEvent;
    public File tempOutputFile;
    public long totalFramesProcessed;
    public long totalFramesReceived;
    public long videoStartTime;
    public VideoViewportSize videoViewportSize;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FaceDetector.FaceOvalPosition.values().length];
            try {
                iArr[FaceDetector.FaceOvalPosition.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_FAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_FAR_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_FAR_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_FAR_TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.TOO_FAR_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.NOT_FRONTAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.BLUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.BLOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.BRIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FaceDetector.FaceOvalPosition.DARK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void addSensorReadingWithEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currentEvent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getCloseFaceOvalRect() {
        return this.closeFaceOvalRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColorDisplayInfo() {
        return this.colorDisplayInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ColorEvent> getColorDisplayList() {
        return this.colorDisplayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DetectionInfoData getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceToken() {
        return this.deviceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceCheckState getFaceCheckState() {
        return this.faceCheckState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFaceDistanceCheckEndIndex() {
        return this.faceDistanceCheckEndIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFaceDistanceCheckEndTime() {
        return this.faceDistanceCheckEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFaceDistanceCheckStartIndex() {
        return this.faceDistanceCheckStartIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFaceDistanceCheckStartTime() {
        return this.faceDistanceCheckStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFaceMatchedEndTime() {
        return this.faceMatchedEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFaceMatchedStartTime() {
        return this.faceMatchedStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFarFaceMatchedEndTime() {
        return this.farFaceMatchedEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFarFaceMatchedStartTime() {
        return this.farFaceMatchedStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getFarFaceOvalRect() {
        return this.farFaceOvalRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInitialFaceDistanceCheckPassed() {
        return this.initialFaceDistanceCheckPassed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInitialLocalFaceFound() {
        return this.initialLocalFaceFound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnFaceDistanceCheckStarted() {
        return this.onFaceDistanceCheckStarted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnFaceModelLoadFiled() {
        return this.onFaceModelLoadFiled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<Long, Unit> getOnFaceShow() {
        return this.onFaceShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnFarFaceCheckPassed() {
        return this.onFarFaceCheckPassed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<FaceCheckState, FaceDetector.QCLabel, Float, Float, Unit> getOnLivenessCheckStateChanged() {
        return this.onLivenessCheckStateChanged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScoreData getQcScoreResult() {
        return this.qcScoreResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRunningFreshness() {
        return this.runningFreshness;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSplashCount() {
        return this._splashCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSplashInterruptCount() {
        return this._splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final File getTempOutputFile() {
        return this.tempOutputFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVideoEndTimestamp() {
        return this.VideoEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVideoStartTime() {
        return this.videoStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getVideoStartTimestamp() {
        return this.VideoStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoViewportSize getVideoViewportSize() {
        return this.videoViewportSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void onHolding(boolean z) {
        this.onHolding = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseFaceOvalRect(RectF rectF) {
        this.closeFaceOvalRect = rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorDisplayInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.colorDisplayInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorDisplayList(@NotNull ArrayList<ColorEvent> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.colorDisplayList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfig(LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        this.config = lcaSdkLivenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceDistanceCheckEndIndex(int i) {
        this.faceDistanceCheckEndIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceDistanceCheckEndTime(long j) {
        this.faceDistanceCheckEndTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceDistanceCheckStartIndex(int i) {
        this.faceDistanceCheckStartIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceDistanceCheckStartTime(long j) {
        this.faceDistanceCheckStartTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceMatchedEndTime(Long l) {
        this.faceMatchedEndTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceMatchedStartTime(Long l) {
        this.faceMatchedStartTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFarFaceMatchedEndTime(Long l) {
        this.farFaceMatchedEndTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFarFaceMatchedStartTime(Long l) {
        this.farFaceMatchedStartTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFarFaceOvalRect(RectF rectF) {
        this.farFaceOvalRect = rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialFaceDistanceCheckPassed(boolean z) {
        this.initialFaceDistanceCheckPassed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialLocalFaceFound(boolean z) {
        this.initialLocalFaceFound = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunningFreshness(boolean z) {
        this.runningFreshness = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTempOutputFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        this.tempOutputFile = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoEndTimestamp(long j) {
        this.VideoEndTimestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoStartTime(long j) {
        this.videoStartTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoStartTimestamp(long j) {
        this.VideoStartTimestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoViewportSize(VideoViewportSize videoViewportSize) {
        this.videoViewportSize = videoViewportSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void splash() {
        this._splashCount++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: o.yHT<? super com.okinc.liveness.lca.data.FaceCheckState, ? super com.okinc.liveness.lca.ai.FaceDetector$QCLabel, ? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceCaptchaManager(@NotNull Context context, @NotNull Function1<? super Long, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull yHT<? super FaceCheckState, ? super FaceDetector.QCLabel, ? super Float, ? super Float, Unit> yht, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.context = context;
        this.onFaceShow = function1;
        this.onFaceDistanceCheckStarted = function0;
        this.onFarFaceCheckPassed = function02;
        this.onLivenessCheckStateChanged = yht;
        this.onFaceModelLoadFiled = function03;
        this.colorDisplayInfo = "";
        this.colorDisplayList = new ArrayList<>();
        this.qcScoreResult = new ScoreData();
        this.tempOutputFile = new File("");
        this.deviceToken = "";
        this.motionSensorManager = new MotionSensorManager(context);
        this.sensorReadingsWithEvent = new ArrayList();
        this.extras = new LinkedHashMap();
        this.gson = new Gson();
        this.sensorCollectionScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
        this.currentEvent = "initial";
        this.detectionInfo = new DetectionInfoData(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191, null);
        this.videoStartTime = -1L;
    }

    public final void setFaceCheckState(FaceCheckState faceCheckState) {
        FaceCheckState faceCheckState2 = this.faceCheckState;
        String simpleName = AbstractJsonLexerKt.NULL;
        String simpleName2 = faceCheckState2 != null ? faceCheckState2.getClass().getSimpleName() : AbstractJsonLexerKt.NULL;
        if (faceCheckState != null) {
            simpleName = faceCheckState.getClass().getSimpleName();
        }
        if (!Intrinsics.EZpvd((Object) simpleName2, (Object) simpleName)) {
            pUU.KWHzl("kyc_in_house", "Lca liveness - STATE TRANSITION: " + simpleName2 + " -> " + simpleName);
        }
        this.faceCheckState = faceCheckState;
    }

    public static final class SensorDataResponse {
        public static final int $stable = 8;
        private final List<MotionSensorManager.SensorReading> sensor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.manager.FaceCaptchaManager$SensorDataResponse */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SensorDataResponse copy$default(SensorDataResponse sensorDataResponse, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = sensorDataResponse.sensor;
            }
            return sensorDataResponse.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<MotionSensorManager.SensorReading> component1() {
            return this.sensor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SensorDataResponse copy(@NotNull List<MotionSensorManager.SensorReading> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new SensorDataResponse(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SensorDataResponse) && Intrinsics.EZpvd(this.sensor, ((SensorDataResponse) obj).sensor);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<MotionSensorManager.SensorReading> getSensor() {
            return this.sensor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.sensor.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SensorDataResponse(sensor=" + this.sensor + ")";
        }

        public SensorDataResponse(@NotNull List<MotionSensorManager.SensorReading> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.sensor = list;
        }
    }

    public static final class DetectionInfoData {
        public static final int $stable = 8;
        private int angle;
        private int block;
        private int blur;
        private int bottom;
        private int bright;
        private int close;
        private int dark;
        private int far;
        private int left;
        private int mulFace;
        private String noFace;
        private int right;
        private int top;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DetectionInfoData() {
            this(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8191, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.noFace;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component10() {
            return this.bright;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component11() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component12() {
            return this.close;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component13() {
            return this.far;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.mulFace;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.top;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component4() {
            return this.bottom;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.left;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.right;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component7() {
            return this.angle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component8() {
            return this.blur;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component9() {
            return this.block;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DetectionInfoData copy(@NotNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DetectionInfoData(str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DetectionInfoData)) {
                return false;
            }
            DetectionInfoData detectionInfoData = (DetectionInfoData) obj;
            return Intrinsics.EZpvd((Object) this.noFace, (Object) detectionInfoData.noFace) && this.mulFace == detectionInfoData.mulFace && this.top == detectionInfoData.top && this.bottom == detectionInfoData.bottom && this.left == detectionInfoData.left && this.right == detectionInfoData.right && this.angle == detectionInfoData.angle && this.blur == detectionInfoData.blur && this.block == detectionInfoData.block && this.bright == detectionInfoData.bright && this.dark == detectionInfoData.dark && this.close == detectionInfoData.close && this.far == detectionInfoData.far;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getAngle() {
            return this.angle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBlock() {
            return this.block;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBlur() {
            return this.blur;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBottom() {
            return this.bottom;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBright() {
            return this.bright;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getClose() {
            return this.close;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getDark() {
            return this.dark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getFar() {
            return this.far;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLeft() {
            return this.left;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMulFace() {
            return this.mulFace;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNoFace() {
            return this.noFace;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getRight() {
            return this.right;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTop() {
            return this.top;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((this.noFace.hashCode() * 31) + Integer.hashCode(this.mulFace)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.angle)) * 31) + Integer.hashCode(this.blur)) * 31) + Integer.hashCode(this.block)) * 31) + Integer.hashCode(this.bright)) * 31) + Integer.hashCode(this.dark)) * 31) + Integer.hashCode(this.close)) * 31) + Integer.hashCode(this.far);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAngle(int i) {
            this.angle = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBlock(int i) {
            this.block = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBlur(int i) {
            this.blur = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBottom(int i) {
            this.bottom = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBright(int i) {
            this.bright = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setClose(int i) {
            this.close = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDark(int i) {
            this.dark = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFar(int i) {
            this.far = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLeft(int i) {
            this.left = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMulFace(int i) {
            this.mulFace = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNoFace(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.noFace = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRight(int i) {
            this.right = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTop(int i) {
            this.top = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DetectionInfoData(noFace=" + this.noFace + ", mulFace=" + this.mulFace + ", top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ", angle=" + this.angle + ", blur=" + this.blur + ", block=" + this.block + ", bright=" + this.bright + ", dark=" + this.dark + ", close=" + this.close + ", far=" + this.far + ")";
        }

        public DetectionInfoData(@NotNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(str, "");
            this.noFace = str;
            this.mulFace = i;
            this.top = i2;
            this.bottom = i3;
            this.left = i4;
            this.right = i5;
            this.angle = i6;
            this.blur = i7;
            this.block = i8;
            this.bright = i9;
            this.dark = i10;
            this.close = i11;
            this.far = i12;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("no") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 int) : (0 int))
 A[MD:(java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int):void (m)] (LINE:95) call: com.okinc.liveness.lca.manager.FaceCaptchaManager.DetectionInfoData.<init>(java.lang.String, int, int, int, int, int, int, int, int, int, int, int, int):void type: THIS */
        public /* synthetic */ DetectionInfoData(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "no" : str, (i13 & 2) != 0 ? 0 : i, (i13 & 4) != 0 ? 0 : i2, (i13 & 8) != 0 ? 0 : i3, (i13 & 16) != 0 ? 0 : i4, (i13 & 32) != 0 ? 0 : i5, (i13 & 64) != 0 ? 0 : i6, (i13 & 128) != 0 ? 0 : i7, (i13 & 256) != 0 ? 0 : i8, (i13 & 512) != 0 ? 0 : i9, (i13 & 1024) != 0 ? 0 : i10, (i13 & 2048) != 0 ? 0 : i11, (i13 & 4096) == 0 ? i12 : 0);
        }
    }

    /* JADX INFO: renamed from: getDetectionInfo, reason: collision with other method in class */
    public final String m6783getDetectionInfo() {
        this.detectionInfo.setNoFace(!this.initialLocalFaceFound ? "yes" : "no");
        String json = new Gson().toJson(this.detectionInfo);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final void updateVideoViewportSize(@NotNull VideoViewportSize videoViewportSize, @NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        Intrinsics.checkNotNullParameter(videoViewportSize, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
        if (!Intrinsics.EZpvd(videoViewportSize, this.videoViewportSize)) {
            this.videoViewportSize = videoViewportSize;
        }
        this.config = lcaSdkLivenessConfig;
        if (this.farFaceOvalRect == null) {
            FaceOvalUtils faceOvalUtils = FaceOvalUtils.INSTANCE;
            Integer resolutionWidth = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionWidth();
            Intrinsics.copydefault(resolutionWidth);
            int iIntValue = resolutionWidth.intValue();
            Integer resolutionHeight = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionHeight();
            Intrinsics.copydefault(resolutionHeight);
            int iIntValue2 = resolutionHeight.intValue();
            Float farOvalWidthScreenRatio = lcaSdkLivenessConfig.getOvalParameters().getFarOvalWidthScreenRatio();
            Intrinsics.copydefault(farOvalWidthScreenRatio);
            float fFloatValue = farOvalWidthScreenRatio.floatValue();
            Float farOvalHeightRatio = lcaSdkLivenessConfig.getOvalParameters().getFarOvalHeightRatio();
            Intrinsics.copydefault(farOvalHeightRatio);
            this.farFaceOvalRect = faceOvalUtils.createBoundingRect(iIntValue, iIntValue2, fFloatValue, farOvalHeightRatio.floatValue());
        }
        if (this.closeFaceOvalRect == null) {
            FaceOvalUtils faceOvalUtils2 = FaceOvalUtils.INSTANCE;
            Integer resolutionWidth2 = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionWidth();
            Intrinsics.copydefault(resolutionWidth2);
            int iIntValue3 = resolutionWidth2.intValue();
            Integer resolutionHeight2 = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionHeight();
            Intrinsics.copydefault(resolutionHeight2);
            int iIntValue4 = resolutionHeight2.intValue();
            Float faceOvalWidthScreenRatio = lcaSdkLivenessConfig.getOvalParameters().getFaceOvalWidthScreenRatio();
            Intrinsics.copydefault(faceOvalWidthScreenRatio);
            float fFloatValue2 = faceOvalWidthScreenRatio.floatValue();
            Float faceOvalHeightRatio = lcaSdkLivenessConfig.getOvalParameters().getFaceOvalHeightRatio();
            Intrinsics.copydefault(faceOvalHeightRatio);
            this.closeFaceOvalRect = faceOvalUtils2.createBoundingRect(iIntValue3, iIntValue4, fFloatValue2, faceOvalHeightRatio.floatValue());
        }
    }

    public final void onCaptchaReady() {
        setFaceCheckState(new FaceCheckState.Initial(null, 0, 0, 7, null));
        MotionSensorManager.startCollecting$default(this.motionSensorManager, 0, 1, null);
        startCollectingSensorReadings();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startCollectingSensorReadings() {
        LcaSdkLivenessConfigSensor sensorConfig;
        Long motionSamplingIntervalMs;
        long jLongValue;
        LcaSdkLivenessConfigSensor sensorConfig2;
        Long motionSamplingIntervalFarToCloseMs;
        if (Intrinsics.EZpvd((Object) this.currentEvent, (Object) "selfie_far")) {
            LcaSdkLivenessConfig lcaSdkLivenessConfig = this.config;
            jLongValue = (lcaSdkLivenessConfig == null || (sensorConfig2 = lcaSdkLivenessConfig.getSensorConfig()) == null || (motionSamplingIntervalFarToCloseMs = sensorConfig2.getMotionSamplingIntervalFarToCloseMs()) == null) ? 100L : motionSamplingIntervalFarToCloseMs.longValue();
        } else {
            LcaSdkLivenessConfig lcaSdkLivenessConfig2 = this.config;
            if (lcaSdkLivenessConfig2 != null && (sensorConfig = lcaSdkLivenessConfig2.getSensorConfig()) != null && (motionSamplingIntervalMs = sensorConfig.getMotionSamplingIntervalMs()) != null) {
                jLongValue = motionSamplingIntervalMs.longValue();
            }
        }
        pUU.KWHzl("kyc_in_house", "Motion sensor sampling interval: " + jLongValue + DateFormat.MINUTE_SECOND);
        this.sensorCollectionJob = FlowKt.launchIn(FlowKt.onEach(FlowKt.sample(this.motionSensorManager.getSensorReadingFlow(), jLongValue), new AnonymousClass1(null)), this.sensorCollectionScope);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.FaceCaptchaManager$startCollectingSensorReadings$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<MotionSensorManager.SensorReading, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = FaceCaptchaManager.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MotionSensorManager.SensorReading sensorReading, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sensorReading, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                MotionSensorManager.SensorReading sensorReading = (MotionSensorManager.SensorReading) this.L$0;
                sensorReading.setEvent(FaceCaptchaManager.this.currentEvent);
                FaceCaptchaManager.this.sensorReadingsWithEvent.add(sensorReading);
                FaceCaptchaManager.this.updateExtrasWithSensorData();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onFaceReady() {
        if (this.videoStartTime < 0) {
            this.videoStartTime = System.currentTimeMillis();
            setFaceCheckState(new FaceCheckState.Running(null, 0, 0, 7, null));
            this.onFaceShow.invoke(Long.valueOf(this.videoStartTime));
        }
    }

    public final void onFreshnessComplete() {
        FaceCheckState success;
        RectF rectF = this.closeFaceOvalRect;
        this.farFaceOvalRect = null;
        this.closeFaceOvalRect = null;
        this.runningFreshness = false;
        if (this.faceMatchedEndTime == null) {
            this.faceMatchedEndTime = Long.valueOf(new Date().getTime());
        }
        stopCollectingSensorReadings();
        this.motionSensorManager.stopCollecting();
        if (rectF != null) {
            success = new FaceCheckState.Success(0, 1, null);
        } else {
            success = FaceCheckState.Error.INSTANCE;
        }
        setFaceCheckState(success);
        FaceCheckState faceCheckState = this.faceCheckState;
        if (faceCheckState != null) {
            this.onLivenessCheckStateChanged.invoke(faceCheckState, null, null, null);
        }
    }

    public final void stopCollectingSensorReadings() {
        Job job = this.sensorCollectionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.sensorCollectionJob = null;
    }

    public final boolean onFrameAvailable() {
        Long l;
        this.totalFramesReceived++;
        FaceCheckState faceCheckState = this.faceCheckState;
        boolean z = false;
        if (faceCheckState == null) {
            logFrameSkipped("null_state");
            return false;
        }
        Intrinsics.copydefault(faceCheckState);
        if (faceCheckState instanceof FaceCheckState.Error) {
            logFrameSkipped("error_state");
        } else if ((faceCheckState instanceof FaceCheckState.Initial) || (faceCheckState instanceof FaceCheckState.Running)) {
            this.consecutiveSkippedFrames = 0;
            this.totalFramesProcessed++;
            z = true;
            this.consecutiveProcessedFrames++;
            logFrameProcessed();
            if (!this.runningFreshness && (l = this.faceMatchedStartTime) != null) {
                if (new Date().getTime() - l.longValue() > 1000) {
                    this.runningFreshness = true;
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Freshness check started via onFrameAvailable");
                }
            }
        } else {
            if (!(faceCheckState instanceof FaceCheckState.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            logFrameSkipped("success_state");
        }
        return z;
    }

    public final void logFrameSkipped(String str) {
        this.consecutiveSkippedFrames++;
        this.consecutiveProcessedFrames = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastSkipLogTime > 3000) {
            int i = this.consecutiveSkippedFrames;
            FaceCheckState faceCheckState = this.faceCheckState;
            String simpleName = faceCheckState != null ? faceCheckState.getClass().getSimpleName() : null;
            pUU.valueOf("kyc_in_house", "Lca liveness - FRAME SKIP WARNING: reason=" + str + ", consecutiveSkipped=" + i + ", state=" + simpleName + ", total received=" + this.totalFramesReceived + ", total processed=" + this.totalFramesProcessed);
            this.lastSkipLogTime = jCurrentTimeMillis;
            this.consecutiveSkippedFrames = 0;
        }
    }

    public final void logFrameProcessed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastProcessedLogTime > 5000) {
            long j = this.totalFramesReceived;
            long j2 = j > 0 ? (this.totalFramesProcessed * ((long) 100)) / j : 0L;
            FaceCheckState faceCheckState = this.faceCheckState;
            String simpleName = faceCheckState != null ? faceCheckState.getClass().getSimpleName() : null;
            pUU.KWHzl("kyc_in_house", "Lca liveness - FaceCaptchaManager HEARTBEAT: state=" + simpleName + ", consecutiveProcessed=" + this.consecutiveProcessedFrames + ", processRate=" + j2 + "%, runningFreshness=" + this.runningFreshness + ", farCheckPassed=" + this.initialFaceDistanceCheckPassed);
            this.lastProcessedLogTime = jCurrentTimeMillis;
            this.consecutiveProcessedFrames = 0;
        }
    }

    public final void onFaceModelLoadFiled() {
        this.onFaceModelLoadFiled.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void onFramePreFaceUpdate(int i) {
        Float fValueOf = Float.valueOf(0.0f);
        if (i == 0) {
            if (this.initialFaceDistanceCheckPassed) {
                FaceCheckState faceCheckState = this.faceCheckState;
                if (!(faceCheckState instanceof FaceCheckState.Initial)) {
                    if (faceCheckState instanceof FaceCheckState.Running) {
                        this.onLivenessCheckStateChanged.invoke(FaceCheckState.Running.Companion.withMoveFaceMessage(), null, null, fValueOf);
                        return;
                    }
                    return;
                }
            }
            this.onLivenessCheckStateChanged.invoke(FaceCheckState.Initial.Companion.withMoveFaceMessage(), null, null, fValueOf);
            return;
        }
        if (i == 1) {
            if (this.initialLocalFaceFound) {
                return;
            }
            this.initialLocalFaceFound = true;
            onFaceReady();
            return;
        }
        DetectionInfoData detectionInfoData = this.detectionInfo;
        detectionInfoData.setMulFace(detectionInfoData.getMulFace() + 1);
        if (this.initialLocalFaceFound) {
            FaceCheckState faceCheckState2 = this.faceCheckState;
            if (!(faceCheckState2 instanceof FaceCheckState.Initial)) {
                if (faceCheckState2 instanceof FaceCheckState.Running) {
                    this.onLivenessCheckStateChanged.invoke(FaceCheckState.Running.Companion.withMultipleFaceMessage(), null, null, fValueOf);
                    return;
                }
                return;
            }
        }
        this.onLivenessCheckStateChanged.invoke(FaceCheckState.Initial.Companion.withMultipleFaceMessage(), null, null, fValueOf);
    }

    public final boolean onFrameFaceUpdate(@NotNull RectF rectF, @NotNull PointF pointF, @NotNull PointF pointF2, @NotNull PointF pointF3, @NotNull PointF pointF4, @NotNull FaceDetector.QCLabel qCLabel, float f) {
        RectF rectF2;
        boolean z;
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(pointF, "");
        Intrinsics.checkNotNullParameter(pointF2, "");
        Intrinsics.checkNotNullParameter(pointF3, "");
        Intrinsics.checkNotNullParameter(pointF4, "");
        Intrinsics.checkNotNullParameter(qCLabel, "");
        RectF rectF3 = this.closeFaceOvalRect;
        if (rectF3 != null && (rectF2 = this.farFaceOvalRect) != null) {
            long time = new Date().getTime();
            if (!this.initialFaceDistanceCheckPassed) {
                FaceDetector.Companion companion = FaceDetector.Companion;
                LcaSdkLivenessConfig lcaSdkLivenessConfig = this.config;
                Intrinsics.copydefault(lcaSdkLivenessConfig);
                FaceDetector.FaceOvalPosition faceOvalPositionCalculateFaceOvalPosition = companion.calculateFaceOvalPosition(rectF, rectF2, lcaSdkLivenessConfig, pointF2, pointF, pointF3, pointF4, qCLabel, true, this.onHolding);
                if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                    pUU.KWHzl("kyc_in_house", "Initial, faceOvalPosition: " + faceOvalPositionCalculateFaceOvalPosition);
                    pUU.KWHzl("kyc_in_house", "qcLabel: " + qCLabel + ", qcScore: " + f);
                }
                updateDetectionInfo(faceOvalPositionCalculateFaceOvalPosition);
                this.farFaceMatched = faceOvalPositionCalculateFaceOvalPosition == FaceDetector.FaceOvalPosition.MATCHED;
                this.onLivenessCheckStateChanged.invoke(FaceCheckState.Initial.Companion.withFaceOvalPosition(faceOvalPositionCalculateFaceOvalPosition), qCLabel, Float.valueOf(f), Float.valueOf(0.0f));
                if (this.farFaceMatched) {
                    if (this.farFaceMatchedStartTime == null) {
                        this.farFaceMatchedStartTime = Long.valueOf(time);
                        this.onFaceDistanceCheckStarted.invoke();
                    }
                    this.farFaceMatchedEndTime = Long.valueOf(time);
                    Long l = this.farFaceMatchedStartTime;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        LcaSdkLivenessConfig lcaSdkLivenessConfig2 = this.config;
                        Intrinsics.copydefault(lcaSdkLivenessConfig2);
                        Intrinsics.copydefault(lcaSdkLivenessConfig2.getFaceDetectionConfig().getFarHoldDuration());
                        z = true;
                        if (time - jLongValue >= r3.intValue()) {
                            this.initialFaceDistanceCheckPassed = true;
                            this.onFarFaceCheckPassed.invoke();
                            addSensorReadingWithEvent(EopTrackEvent.FAR);
                        }
                    }
                } else {
                    z = true;
                    if (this.farFaceMatchedStartTime != null) {
                        this.farFaceMatchedStartTime = null;
                    }
                }
                return z;
            }
            FaceDetector.Companion companion2 = FaceDetector.Companion;
            LcaSdkLivenessConfig lcaSdkLivenessConfig3 = this.config;
            Intrinsics.copydefault(lcaSdkLivenessConfig3);
            FaceDetector.FaceOvalPosition faceOvalPositionCalculateFaceOvalPosition2 = companion2.calculateFaceOvalPosition(rectF, rectF3, lcaSdkLivenessConfig3, pointF2, pointF, pointF3, pointF4, qCLabel, false, this.onHolding);
            updateDetectionInfo(faceOvalPositionCalculateFaceOvalPosition2);
            LcaSdkLivenessConfig lcaSdkLivenessConfig4 = this.config;
            Intrinsics.copydefault(lcaSdkLivenessConfig4);
            float fCalculateFaceOvalDistancePercentage = companion2.calculateFaceOvalDistancePercentage(rectF, rectF3, lcaSdkLivenessConfig4, false);
            if (LcaSdkManager.Companion.getInstance().getConfiguration().getDebugMode()) {
                pUU.KWHzl("kyc_in_house", "Running, faceOvalPosition: " + faceOvalPositionCalculateFaceOvalPosition2);
                pUU.KWHzl("kyc_in_house", "qcLabel: " + qCLabel + ", qcScore: " + f);
            }
            this.faceMatched = faceOvalPositionCalculateFaceOvalPosition2 == FaceDetector.FaceOvalPosition.MATCHED;
            yHT<FaceCheckState, FaceDetector.QCLabel, Float, Float, Unit> yht = this.onLivenessCheckStateChanged;
            FaceCheckState.Running runningWithFaceOvalPosition = FaceCheckState.Running.Companion.withFaceOvalPosition(faceOvalPositionCalculateFaceOvalPosition2);
            if (this.faceMatched) {
                fCalculateFaceOvalDistancePercentage = 1.0f;
            }
            yht.invoke(runningWithFaceOvalPosition, qCLabel, Float.valueOf(f), Float.valueOf(fCalculateFaceOvalDistancePercentage));
            if (this.faceMatched) {
                if (this.faceMatchedStartTime == null) {
                    this.faceMatchedStartTime = Long.valueOf(time);
                }
                this.faceMatchedEndTime = Long.valueOf(time);
                return true;
            }
            if (this.faceMatchedStartTime == null) {
                return true;
            }
            this.faceMatchedStartTime = null;
            return true;
        }
        return true;
    }

    public final void updateDetectionInfo(FaceDetector.FaceOvalPosition faceOvalPosition) {
        switch (WhenMappings.$EnumSwitchMapping$0[faceOvalPosition.ordinal()]) {
            case 1:
                return;
            case 2:
                DetectionInfoData detectionInfoData = this.detectionInfo;
                detectionInfoData.setClose(detectionInfoData.getClose() + 1);
                return;
            case 3:
                DetectionInfoData detectionInfoData2 = this.detectionInfo;
                detectionInfoData2.setFar(detectionInfoData2.getFar() + 1);
                return;
            case 4:
                DetectionInfoData detectionInfoData3 = this.detectionInfo;
                detectionInfoData3.setLeft(detectionInfoData3.getLeft() + 1);
                return;
            case 5:
                DetectionInfoData detectionInfoData4 = this.detectionInfo;
                detectionInfoData4.setRight(detectionInfoData4.getRight() + 1);
                return;
            case 6:
                DetectionInfoData detectionInfoData5 = this.detectionInfo;
                detectionInfoData5.setTop(detectionInfoData5.getTop() + 1);
                return;
            case 7:
                DetectionInfoData detectionInfoData6 = this.detectionInfo;
                detectionInfoData6.setBottom(detectionInfoData6.getBottom() + 1);
                return;
            case 8:
                DetectionInfoData detectionInfoData7 = this.detectionInfo;
                detectionInfoData7.setAngle(detectionInfoData7.getAngle() + 1);
                return;
            case 9:
                DetectionInfoData detectionInfoData8 = this.detectionInfo;
                detectionInfoData8.setBlur(detectionInfoData8.getBlur() + 1);
                return;
            case 10:
                DetectionInfoData detectionInfoData9 = this.detectionInfo;
                detectionInfoData9.setBlock(detectionInfoData9.getBlock() + 1);
                return;
            case 11:
                DetectionInfoData detectionInfoData10 = this.detectionInfo;
                detectionInfoData10.setBright(detectionInfoData10.getBright() + 1);
                return;
            case 12:
                DetectionInfoData detectionInfoData11 = this.detectionInfo;
                detectionInfoData11.setDark(detectionInfoData11.getDark() + 1);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void updateExtrasWithSensorData() {
        this.extras.put("sensor", this.gson.toJson(new SensorDataResponse(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.sensorReadingsWithEvent))));
    }

    public final void splashInterrupt() {
        this._splashInterruptCount++;
        this.colorDisplayList.clear();
        this.qcScoreResult.clear();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.manager.FaceCaptchaManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
