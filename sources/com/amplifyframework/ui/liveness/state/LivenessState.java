package com.amplifyframework.ui.liveness.state;

import android.content.Context;
import android.graphics.RectF;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.amplifyframework.predictions.aws.models.ColorChallenge;
import com.amplifyframework.predictions.aws.models.ColorChallengeType;
import com.amplifyframework.predictions.aws.models.FaceTargetChallenge;
import com.amplifyframework.predictions.aws.models.FaceTargetChallengeResponse;
import com.amplifyframework.predictions.aws.models.InitialFaceDetected;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import com.amplifyframework.predictions.models.VideoEvent;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.ml.FaceOval;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.model.LivenessCheckState;
import com.amplifyframework.ui.liveness.ui.helper.VideoViewportSize;
import com.amplifyframework.ui.liveness.util.WebSocketCloseCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessState {
    public static final int $stable = 8;
    private ColorChallenge colorChallenge;
    private final Context context;
    private boolean detectedFaceMatchedOval;
    private final boolean disableStartView;
    private final MutableState faceGuideRect$delegate;
    private Long faceMatchOvalEnd;
    private Long faceMatchOvalStart;
    private final MutableState faceMatchPercentage$delegate;
    private TimerTask faceOvalMatchTimer;
    private final MutableState faceTargetChallenge$delegate;
    private final MutableState initialFaceDistanceCheckPassed$delegate;
    private float initialFaceOvalIou;
    private final MutableState initialLocalFaceFound$delegate;
    private InitialStreamFace initialStreamFace;
    private MutableState<LivenessCheckState> livenessCheckState;
    private FaceLivenessSession livenessSessionInfo;
    private final Function0<Unit> onCaptureReady;
    private final Function0<Unit> onFaceDistanceCheckPassed;
    private final Function0<Unit> onFinalEventsSent;
    private final Function2<FaceLivenessDetectionException, Boolean, Unit> onSessionError;
    private boolean readyForOval;
    private boolean readyToSendFinalEvents;
    private final MutableState runningFreshness$delegate;
    private final String sessionId;
    private final MutableState showingStartView$delegate;
    private final MutableState videoViewportSize$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.amplifyframework.ui.liveness.state.LivenessState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LivenessState copy$default(LivenessState livenessState, String str, Context context, boolean z, Function0 function0, Function0 function02, Function2 function2, Function0 function03, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessState.sessionId;
        }
        if ((i & 2) != 0) {
            context = livenessState.context;
        }
        Context context2 = context;
        if ((i & 4) != 0) {
            z = livenessState.disableStartView;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function0 = livenessState.onCaptureReady;
        }
        Function0 function04 = function0;
        if ((i & 16) != 0) {
            function02 = livenessState.onFaceDistanceCheckPassed;
        }
        Function0 function05 = function02;
        if ((i & 32) != 0) {
            function2 = livenessState.onSessionError;
        }
        Function2 function22 = function2;
        if ((i & 64) != 0) {
            function03 = livenessState.onFinalEventsSent;
        }
        return livenessState.copy(str, context2, z2, function04, function05, function22, function03);
    }

    public static /* synthetic */ void getFaceMatchOvalEnd$annotations() {
    }

    public static /* synthetic */ void getFaceMatchOvalStart$annotations() {
    }

    public static /* synthetic */ void getReadyForOval$annotations() {
    }

    public static /* synthetic */ void getReadyToSendFinalEvents$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context component2() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.disableStartView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component4() {
        return this.onCaptureReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component5() {
        return this.onFaceDistanceCheckPassed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<FaceLivenessDetectionException, Boolean, Unit> component6() {
        return this.onSessionError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component7() {
        return this.onFinalEventsSent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessState copy(@NotNull String str, @NotNull Context context, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super FaceLivenessDetectionException, ? super Boolean, Unit> function2, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function03, "");
        return new LivenessState(str, context, z, function0, function02, function2, function03);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivenessState)) {
            return false;
        }
        LivenessState livenessState = (LivenessState) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) livenessState.sessionId) && Intrinsics.EZpvd(this.context, livenessState.context) && this.disableStartView == livenessState.disableStartView && Intrinsics.EZpvd(this.onCaptureReady, livenessState.onCaptureReady) && Intrinsics.EZpvd(this.onFaceDistanceCheckPassed, livenessState.onFaceDistanceCheckPassed) && Intrinsics.EZpvd(this.onSessionError, livenessState.onSessionError) && Intrinsics.EZpvd(this.onFinalEventsSent, livenessState.onFinalEventsSent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallenge getColorChallenge() {
        return this.colorChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisableStartView() {
        return this.disableStartView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFaceMatchOvalEnd() {
        return this.faceMatchOvalEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFaceMatchOvalStart() {
        return this.faceMatchOvalStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableState<LivenessCheckState> getLivenessCheckState() {
        return this.livenessCheckState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceLivenessSession getLivenessSessionInfo() {
        return this.livenessSessionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnCaptureReady() {
        return this.onCaptureReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnFaceDistanceCheckPassed() {
        return this.onFaceDistanceCheckPassed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnFinalEventsSent() {
        return this.onFinalEventsSent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<FaceLivenessDetectionException, Boolean, Unit> getOnSessionError() {
        return this.onSessionError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReadyForOval() {
        return this.readyForOval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReadyToSendFinalEvents() {
        return this.readyToSendFinalEvents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.sessionId.hashCode() * 31) + this.context.hashCode()) * 31) + Boolean.hashCode(this.disableStartView)) * 31) + this.onCaptureReady.hashCode()) * 31) + this.onFaceDistanceCheckPassed.hashCode()) * 31) + this.onSessionError.hashCode()) * 31) + this.onFinalEventsSent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void onFullChallengeComplete() {
        this.readyToSendFinalEvents = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorChallenge(ColorChallenge colorChallenge) {
        this.colorChallenge = colorChallenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceMatchOvalEnd(Long l) {
        this.faceMatchOvalEnd = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceMatchOvalStart(Long l) {
        this.faceMatchOvalStart = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLivenessCheckState(@NotNull MutableState<LivenessCheckState> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "");
        this.livenessCheckState = mutableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLivenessSessionInfo(FaceLivenessSession faceLivenessSession) {
        this.livenessSessionInfo = faceLivenessSession;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReadyForOval(boolean z) {
        this.readyForOval = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReadyToSendFinalEvents(boolean z) {
        this.readyToSendFinalEvents = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessState(sessionId=" + this.sessionId + ", context=" + this.context + ", disableStartView=" + this.disableStartView + ", onCaptureReady=" + this.onCaptureReady + ", onFaceDistanceCheckPassed=" + this.onFaceDistanceCheckPassed + ", onSessionError=" + this.onSessionError + ", onFinalEventsSent=" + this.onFinalEventsSent + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function2<? super com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public LivenessState(@NotNull String str, @NotNull Context context, boolean z, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function2<? super FaceLivenessDetectionException, ? super Boolean, Unit> function2, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.sessionId = str;
        this.context = context;
        this.disableStartView = z;
        this.onCaptureReady = function0;
        this.onFaceDistanceCheckPassed = function02;
        this.onSessionError = function2;
        this.onFinalEventsSent = function03;
        this.videoViewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.livenessCheckState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LivenessCheckState.Initial(null, false, 0, 7, null), null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.runningFreshness$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.faceGuideRect$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.faceMatchPercentage$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.25f), null, 2, null);
        this.initialFaceDistanceCheckPassed$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.initialLocalFaceFound$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showingStartView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!z), null, 2, null);
        this.initialFaceOvalIou = -1.0f;
        this.faceTargetChallenge$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final void updateVideoViewportSize(@NotNull VideoViewportSize videoViewportSize) {
        Intrinsics.checkNotNullParameter(videoViewportSize, "");
        if (Intrinsics.EZpvd(videoViewportSize, getVideoViewportSize())) {
            return;
        }
        setVideoViewportSize(videoViewportSize);
    }

    public final void onError(boolean z, @NotNull WebSocketCloseCode webSocketCloseCode) {
        Intrinsics.checkNotNullParameter(webSocketCloseCode, "");
        this.livenessCheckState.setValue(LivenessCheckState.Error.INSTANCE);
        onDestroy(z, webSocketCloseCode);
    }

    public static /* synthetic */ void onDestroy$default(LivenessState livenessState, boolean z, WebSocketCloseCode webSocketCloseCode, int i, Object obj) {
        if ((i & 2) != 0) {
            webSocketCloseCode = null;
        }
        livenessState.onDestroy(z, webSocketCloseCode);
    }

    public final void onDestroy(boolean z, WebSocketCloseCode webSocketCloseCode) {
        FaceLivenessSession faceLivenessSession;
        this.livenessCheckState.setValue(LivenessCheckState.Error.INSTANCE);
        TimerTask timerTask = this.faceOvalMatchTimer;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.readyForOval = false;
        setFaceGuideRect(null);
        setRunningFreshness(false);
        if (!z || (faceLivenessSession = this.livenessSessionInfo) == null) {
            return;
        }
        faceLivenessSession.stopSession(webSocketCloseCode != null ? Integer.valueOf(webSocketCloseCode.getCode()) : null);
    }

    public final void onLivenessSessionReady(@NotNull FaceLivenessSession faceLivenessSession) {
        Intrinsics.checkNotNullParameter(faceLivenessSession, "");
        this.livenessSessionInfo = faceLivenessSession;
        List<FaceLivenessSessionChallenge> challenges = faceLivenessSession.getChallenges();
        ArrayList arrayList = new ArrayList();
        for (Object obj : challenges) {
            if (obj instanceof FaceTargetChallenge) {
                arrayList.add(obj);
            }
        }
        setFaceTargetChallenge((FaceTargetChallenge) CollectionsKt___CollectionsKt.firstOrNull(arrayList));
        List<FaceLivenessSessionChallenge> challenges2 = faceLivenessSession.getChallenges();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : challenges2) {
            if (obj2 instanceof ColorChallenge) {
                arrayList2.add(obj2);
            }
        }
        this.colorChallenge = (ColorChallenge) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
        this.livenessCheckState.setValue(new LivenessCheckState.Running(null, 0, 3, 0 == true ? 1 : 0));
        this.readyForOval = true;
    }

    public final void onFreshnessComplete() {
        LivenessCheckState success;
        RectF faceGuideRect = getFaceGuideRect();
        int i = 0;
        this.readyForOval = false;
        DefaultConstructorMarker defaultConstructorMarker = null;
        setFaceGuideRect(null);
        setRunningFreshness(false);
        if (this.faceMatchOvalEnd == null) {
            this.faceMatchOvalEnd = Long.valueOf(new Date().getTime());
        }
        MutableState<LivenessCheckState> mutableState = this.livenessCheckState;
        if (faceGuideRect != null) {
            success = new LivenessCheckState.Success(faceGuideRect, i, 2, defaultConstructorMarker);
        } else {
            success = LivenessCheckState.Error.INSTANCE;
        }
        mutableState.setValue(success);
    }

    public final boolean onFrameAvailable() {
        Long l;
        boolean z = false;
        if (getShowingStartView()) {
            return false;
        }
        LivenessCheckState value = this.livenessCheckState.getValue();
        if (!(value instanceof LivenessCheckState.Error)) {
            if ((value instanceof LivenessCheckState.Initial) || (value instanceof LivenessCheckState.Running)) {
                z = true;
                if (!getRunningFreshness()) {
                    ColorChallenge colorChallenge = this.colorChallenge;
                    if ((colorChallenge != null ? colorChallenge.getChallengeType() : null) == ColorChallengeType.SEQUENTIAL && (l = this.faceMatchOvalStart) != null) {
                        if (new Date().getTime() - l.longValue() > 1000) {
                            setRunningFreshness(true);
                        }
                    }
                }
            } else {
                if (!(value instanceof LivenessCheckState.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.readyToSendFinalEvents) {
                    this.readyToSendFinalEvents = false;
                    FaceLivenessSession faceLivenessSession = this.livenessSessionInfo;
                    Intrinsics.copydefault(faceLivenessSession);
                    ColorChallenge colorChallenge2 = this.colorChallenge;
                    Intrinsics.copydefault(colorChallenge2);
                    String challengeId = colorChallenge2.getChallengeId();
                    RectF faceGuideRect = ((LivenessCheckState.Success) value).getFaceGuideRect();
                    Long l2 = this.faceMatchOvalStart;
                    Intrinsics.copydefault(l2);
                    Date date = new Date(l2.longValue());
                    Long l3 = this.faceMatchOvalEnd;
                    Intrinsics.copydefault(l3);
                    faceLivenessSession.sendChallengeResponseEvent(new FaceTargetChallengeResponse(challengeId, faceGuideRect, date, new Date(l3.longValue())));
                    pUU.KWHzl(LivenessVideoEncoder.TAG, "Send empty video event");
                    FaceLivenessSession faceLivenessSession2 = this.livenessSessionInfo;
                    Intrinsics.copydefault(faceLivenessSession2);
                    faceLivenessSession2.sendVideoEvent(new VideoEvent(new byte[0], new Date()));
                    this.onFinalEventsSent.invoke();
                }
            }
        }
        return z;
    }

    public final void onFrameFaceCountUpdate(int i) {
        if (this.detectedFaceMatchedOval) {
            return;
        }
        if (i == 0) {
            if (!getInitialLocalFaceFound() || (this.livenessCheckState.getValue() instanceof LivenessCheckState.Initial)) {
                this.livenessCheckState.setValue(LivenessCheckState.Initial.Companion.withMoveFaceMessage());
                return;
            } else {
                if (this.livenessCheckState.getValue() instanceof LivenessCheckState.Running) {
                    this.livenessCheckState.setValue(LivenessCheckState.Running.Companion.withMoveFaceMessage());
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (getInitialLocalFaceFound()) {
                return;
            }
            setInitialLocalFaceFound(true);
        } else if (!getInitialLocalFaceFound() || (this.livenessCheckState.getValue() instanceof LivenessCheckState.Initial)) {
            this.livenessCheckState.setValue(LivenessCheckState.Initial.Companion.withMultipleFaceMessage());
        } else if (this.livenessCheckState.getValue() instanceof LivenessCheckState.Running) {
            this.livenessCheckState.setValue(LivenessCheckState.Running.Companion.withMultipleFaceMessage());
        }
    }

    public final boolean onFrameFaceUpdate(@NotNull RectF rectF, @NotNull FaceDetector.Landmark landmark, @NotNull FaceDetector.Landmark landmark2, @NotNull FaceDetector.Landmark landmark3) {
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(landmark, "");
        Intrinsics.checkNotNullParameter(landmark2, "");
        Intrinsics.checkNotNullParameter(landmark3, "");
        if (getShowingStartView()) {
            return false;
        }
        if (!getInitialFaceDistanceCheckPassed()) {
            if (FaceDetector.Companion.calculateFaceDistance(landmark, landmark2, landmark3, LivenessCoordinator.TARGET_WIDTH, LivenessCoordinator.TARGET_HEIGHT) >= 0.32f) {
                this.livenessCheckState.setValue(LivenessCheckState.Initial.Companion.withMoveFaceFurtherAwayMessage());
            } else {
                setInitialFaceDistanceCheckPassed(true);
                this.onFaceDistanceCheckPassed.invoke();
            }
        }
        if (this.readyForOval) {
            if (this.initialStreamFace == null) {
                InitialStreamFace initialStreamFace = new InitialStreamFace(rectF, System.currentTimeMillis());
                this.onCaptureReady.invoke();
                FaceLivenessSession faceLivenessSession = this.livenessSessionInfo;
                Intrinsics.copydefault(faceLivenessSession);
                ColorChallenge colorChallenge = this.colorChallenge;
                Intrinsics.copydefault(colorChallenge);
                faceLivenessSession.sendChallengeResponseEvent(new InitialFaceDetected(colorChallenge.getChallengeId(), initialStreamFace.getFaceRect(), new Date(initialStreamFace.getTimestamp())));
                this.initialStreamFace = initialStreamFace;
            }
            if (getFaceGuideRect() == null) {
                FaceOval faceOval = FaceOval.INSTANCE;
                FaceTargetChallenge faceTargetChallenge = getFaceTargetChallenge();
                Intrinsics.copydefault(faceTargetChallenge);
                setFaceGuideRect(faceOval.createBoundingRect(faceTargetChallenge));
            }
        }
        RectF faceGuideRect = getFaceGuideRect();
        if (faceGuideRect != null) {
            FaceDetector.Companion companion = FaceDetector.Companion;
            FaceTargetChallenge faceTargetChallenge2 = getFaceTargetChallenge();
            Intrinsics.copydefault(faceTargetChallenge2);
            FaceDetector.FaceOvalPosition faceOvalPositionCalculateFaceOvalPosition = companion.calculateFaceOvalPosition(rectF, faceGuideRect, faceTargetChallenge2.getFaceTargetMatching());
            if (this.initialFaceOvalIou < 0.0f) {
                this.initialFaceOvalIou = companion.intersectionOverUnion(rectF, faceGuideRect);
            }
            FaceTargetChallenge faceTargetChallenge3 = getFaceTargetChallenge();
            Intrinsics.copydefault(faceTargetChallenge3);
            setFaceMatchPercentage(companion.calculateFaceMatchPercentage(rectF, faceGuideRect, faceTargetChallenge3.getFaceTargetMatching(), this.initialFaceOvalIou));
            boolean z = this.detectedFaceMatchedOval || faceOvalPositionCalculateFaceOvalPosition == FaceDetector.FaceOvalPosition.MATCHED;
            this.detectedFaceMatchedOval = z;
            if (z) {
                this.livenessCheckState.setValue(LivenessCheckState.Running.Companion.withFaceOvalPosition(FaceDetector.FaceOvalPosition.MATCHED));
            } else {
                this.livenessCheckState.setValue(LivenessCheckState.Running.Companion.withFaceOvalPosition(faceOvalPositionCalculateFaceOvalPosition));
            }
            boolean z2 = this.detectedFaceMatchedOval;
            if (z2 && this.faceMatchOvalStart == null) {
                this.faceMatchOvalStart = Long.valueOf(new Date().getTime());
            } else if (!z2 && this.faceMatchOvalStart != null && this.faceMatchOvalEnd == null) {
                this.faceMatchOvalEnd = Long.valueOf(new Date().getTime());
            }
            if (!this.detectedFaceMatchedOval && this.faceOvalMatchTimer == null) {
                Timer timer = new Timer();
                FaceTargetChallenge faceTargetChallenge4 = getFaceTargetChallenge();
                Intrinsics.copydefault(faceTargetChallenge4);
                long ovalFitTimeout = faceTargetChallenge4.getFaceTargetMatching().getOvalFitTimeout();
                TimerTask timerTask = new TimerTask() { // from class: com.amplifyframework.ui.liveness.state.LivenessState$onFrameFaceUpdate$lambda$2$$inlined$schedule$1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        if (!this.this$0.detectedFaceMatchedOval && this.this$0.getFaceGuideRect() != null) {
                            this.this$0.setReadyForOval(false);
                            this.this$0.getOnSessionError().invoke(new FaceLivenessDetectionException.FaceInOvalMatchExceededTimeLimitException(), Boolean.TRUE);
                        }
                        cancel();
                    }
                };
                timer.schedule(timerTask, ovalFitTimeout);
                this.faceOvalMatchTimer = timerTask;
            }
        }
        return true;
    }

    public final void onStartViewComplete() {
        setShowingStartView(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final VideoViewportSize getVideoViewportSize() {
        return (VideoViewportSize) this.videoViewportSize$delegate.getValue();
    }

    public final void setVideoViewportSize(VideoViewportSize videoViewportSize) {
        this.videoViewportSize$delegate.setValue(videoViewportSize);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getRunningFreshness() {
        return ((Boolean) this.runningFreshness$delegate.getValue()).booleanValue();
    }

    public final void setRunningFreshness(boolean z) {
        this.runningFreshness$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final RectF getFaceGuideRect() {
        return (RectF) this.faceGuideRect$delegate.getValue();
    }

    public final void setFaceGuideRect(RectF rectF) {
        this.faceGuideRect$delegate.setValue(rectF);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final float getFaceMatchPercentage() {
        return ((Number) this.faceMatchPercentage$delegate.getValue()).floatValue();
    }

    public final void setFaceMatchPercentage(float f) {
        this.faceMatchPercentage$delegate.setValue(Float.valueOf(f));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInitialFaceDistanceCheckPassed() {
        return ((Boolean) this.initialFaceDistanceCheckPassed$delegate.getValue()).booleanValue();
    }

    public final void setInitialFaceDistanceCheckPassed(boolean z) {
        this.initialFaceDistanceCheckPassed$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInitialLocalFaceFound() {
        return ((Boolean) this.initialLocalFaceFound$delegate.getValue()).booleanValue();
    }

    public final void setInitialLocalFaceFound(boolean z) {
        this.initialLocalFaceFound$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowingStartView() {
        return ((Boolean) this.showingStartView$delegate.getValue()).booleanValue();
    }

    public final void setShowingStartView(boolean z) {
        this.showingStartView$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final FaceTargetChallenge getFaceTargetChallenge() {
        return (FaceTargetChallenge) this.faceTargetChallenge$delegate.getValue();
    }

    public final void setFaceTargetChallenge(FaceTargetChallenge faceTargetChallenge) {
        this.faceTargetChallenge$delegate.setValue(faceTargetChallenge);
    }
}
