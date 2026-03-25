package com.amplifyframework.ui.liveness.camera;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2Interop;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.PredictionsException;
import com.amplifyframework.predictions.aws.AWSPredictionsPlugin;
import com.amplifyframework.predictions.aws.exceptions.AccessDeniedException;
import com.amplifyframework.predictions.aws.exceptions.FaceLivenessSessionNotFoundException;
import com.amplifyframework.predictions.aws.exceptions.FaceLivenessSessionTimeoutException;
import com.amplifyframework.predictions.aws.models.ColorChallenge;
import com.amplifyframework.predictions.aws.models.ColorChallengeResponse;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions;
import com.amplifyframework.predictions.models.FaceLivenessSession;
import com.amplifyframework.predictions.models.FaceLivenessSessionInformation;
import com.amplifyframework.predictions.models.VideoEvent;
import com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder;
import com.amplifyframework.ui.liveness.common.LivenessEvent;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.model.LivenessCheckState;
import com.amplifyframework.ui.liveness.state.LivenessState;
import com.amplifyframework.ui.liveness.util.AWSSubdomainInterceptor;
import com.amplifyframework.ui.liveness.util.WebSocketCloseCode;
import com.google.common.util.concurrent.ListenableFuture;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.dns.DohTypeEnum;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C32866mlf;
import o.C32868mlh;
import o.C43292rmY;
import o.C43334rnN;
import o.C43337rnQ;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;
import o.yHO;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessCoordinator {
    private static final String TAG = "awsLiveness";
    public static final float TARGET_ASPECT_RATIO = 0.75f;
    public static final int TARGET_ENCODE_BITRATE = 629145;
    public static final int TARGET_ENCODE_KEYFRAME_INTERVAL = 1;
    public static final int TARGET_FPS_MAX = 24;
    public static final int TARGET_FPS_MIN = 24;
    private final ImageAnalysis analysis;
    private final ExecutorService analysisExecutor;
    private final FrameAnalyzer analyzer;
    private final Context context;
    private final long coordinatorStartTime;
    private final AWSCredentialsProvider<AWSCredentials> credentialsProvider;
    private boolean disconnectEventReceived;
    private final LivenessVideoEncoder encoder;
    private final LivenessState livenessState;
    private final boolean needProxy;
    private final Function0<Unit> onChallengeComplete;
    private final Consumer<FaceLivenessDetectionException> onChallengeFailed;
    private final Preview preview;
    private final PreviewTextureView previewTextureView;
    private final String region;
    private final OpenGLRenderer renderer;
    private final String sessionId;
    private final String subdomainStrategy;
    private final String wssProxyPath;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final int TARGET_WIDTH = 480;
    public static final int TARGET_HEIGHT = 640;
    private static final Size TARGET_RESOLUTION_SIZE = new Size(TARGET_WIDTH, TARGET_HEIGHT);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessState getLivenessState() {
        return this.livenessState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Consumer<FaceLivenessDetectionException> getOnChallengeFailed() {
        return this.onChallengeFailed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreviewTextureView getPreviewTextureView() {
        return this.previewTextureView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r35v0, resolved type: com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials> */
    /* JADX WARN: Multi-variable type inference failed */
    public LivenessCoordinator(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull String str, @NotNull String str2, AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider, boolean z, @NotNull Function0<Unit> function0, @NotNull Consumer<FaceLivenessDetectionException> consumer, boolean z2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.context = context;
        this.sessionId = str;
        this.region = str2;
        this.credentialsProvider = aWSCredentialsProvider;
        this.onChallengeComplete = function0;
        this.onChallengeFailed = consumer;
        this.needProxy = z2;
        this.wssProxyPath = str3;
        this.subdomainStrategy = str4;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.analysisExecutor = executorServiceNewSingleThreadExecutor;
        LivenessState livenessState = new LivenessState(str, context, z, new LivenessCoordinator$livenessState$1(this), new LivenessCoordinator$livenessState$2(this), new LivenessCoordinator$livenessState$3(this), new LivenessCoordinator$livenessState$4(this));
        this.livenessState = livenessState;
        Preview.Builder builder = new Preview.Builder();
        Camera2Interop.Extender extender = new Camera2Interop.Extender(builder);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        extender.setCaptureRequestOption(key, new Range(24, 24));
        Size size = TARGET_RESOLUTION_SIZE;
        builder.setTargetResolution(size);
        Preview previewBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "");
        this.preview = previewBuild;
        FrameAnalyzer frameAnalyzer = new FrameAnalyzer(context, livenessState);
        this.analyzer = frameAnalyzer;
        ImageAnalysis.Builder builder2 = new ImageAnalysis.Builder();
        new Camera2Interop.Extender(builder2).setCaptureRequestOption(key, new Range(24, 24));
        builder2.setOutputImageFormat(2);
        builder2.setTargetResolution(size);
        ImageAnalysis imageAnalysisBuild = builder2.build();
        imageAnalysisBuild.setAnalyzer(executorServiceNewSingleThreadExecutor, frameAnalyzer);
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "");
        this.analysis = imageAnalysisBuild;
        LivenessVideoEncoder.Companion companion = LivenessVideoEncoder.Companion;
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        LivenessVideoEncoder livenessVideoEncoderCreate = companion.create(cacheDir, TARGET_WIDTH, TARGET_HEIGHT, TARGET_ENCODE_BITRATE, 24, 1, new Function2() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LivenessCoordinator.encoder$lambda$6(this.f$0, (byte[]) obj, ((Long) obj2).longValue());
            }
        }, new LivenessCoordinator$encoder$2(this), new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LivenessCoordinator.encoder$lambda$7(this.f$0, (MediaCodec.CodecException) obj);
            }
        }, new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LivenessCoordinator.encoder$lambda$8(this.f$0, (Exception) obj);
            }
        }, (1024 & 1024) != 0 ? new yHO() { // from class: com.amplifyframework.ui.liveness.camera.LivenessVideoEncoder$Companion$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LivenessVideoEncoder.Companion.create$lambda$0((File) obj, (MediaFormat) obj2, (Function2) obj3);
            }
        } : null);
        if (livenessVideoEncoderCreate == null) {
            throw new IllegalStateException("Failed to start the encoder.");
        }
        this.encoder = livenessVideoEncoderCreate;
        OpenGLRenderer openGLRenderer = new OpenGLRenderer(new Function2() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LivenessCoordinator.renderer$lambda$9(this.f$0, (String) obj, (Exception) obj2);
            }
        }, new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LivenessCoordinator.renderer$lambda$10((String) obj);
            }
        });
        openGLRenderer.attachInputPreview(previewBuild);
        openGLRenderer.attachOutputSurface(livenessVideoEncoderCreate.getInputSurface(), new Size(TARGET_WIDTH, TARGET_HEIGHT), 0);
        this.renderer = openGLRenderer;
        this.previewTextureView = new PreviewTextureView(context, openGLRenderer);
        this.coordinatorStartTime = System.currentTimeMillis();
        pUU.KWHzl("awsLiveness", "LivenessCoordinator initialized: sessionId=" + str + ", region=" + str2 + ", needProxy=" + z2);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass3(lifecycleOwner, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encoder$lambda$6(LivenessCoordinator livenessCoordinator, byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (livenessCoordinator.livenessState.getLivenessSessionInfo() == null) {
            pUU.KWHzl("awsLiveness", "livenessState.livenessSessionInfo = null");
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(LivenessEvent.AWS_LIVENESS_ERROR_LOG, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LivenessCoordinator.encoder$lambda$6$lambda$5((EventParamsList) obj);
                }
            });
        }
        FaceLivenessSession livenessSessionInfo = livenessCoordinator.livenessState.getLivenessSessionInfo();
        if (livenessSessionInfo != null) {
            livenessSessionInfo.sendVideoEvent(new VideoEvent(bArr, new Date(j)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encoder$lambda$6$lambda$5(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", "livenessState.livenessSessionInfo = null", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encoder$lambda$7(LivenessCoordinator livenessCoordinator, MediaCodec.CodecException codecException) {
        Intrinsics.checkNotNullParameter(codecException, "");
        livenessCoordinator.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(new FaceLivenessDetectionException.VideoEncodingException(null, null, codecException, 3, null), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit encoder$lambda$8(LivenessCoordinator livenessCoordinator, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        livenessCoordinator.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(new FaceLivenessDetectionException.VideoMuxingException(null, null, exc, 3, null), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderer$lambda$9(LivenessCoordinator livenessCoordinator, String str, Exception exc) {
        Intrinsics.copydefault((Object) str);
        livenessCoordinator.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(new FaceLivenessDetectionException.CrashCatchException(str, exc), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderer$lambda$10(String str) {
        Intrinsics.copydefault((Object) str);
        pUU.KWHzl("awsLiveness", str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LivenessCoordinator.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            LivenessCheckState value;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = this.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                i = 0;
                this.I$0 = i;
                this.label = 1;
                if (DelayKt.delay(5000L, this) == objCopydefault) {
                }
                i++;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = LivenessCoordinator.this.coordinatorStartTime;
                value = LivenessCoordinator.this.getLivenessState().getLivenessCheckState().getValue();
                String simpleName = value.getClass().getSimpleName();
                boolean hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl = LivenessCoordinator.this.getPreviewTextureView().getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl();
                if (LivenessCoordinator.this.getLivenessState().getLivenessSessionInfo() != null) {
                }
                pUU.KWHzl("awsLiveness", "Heartbeat #" + i + ": elapsed=" + (jCurrentTimeMillis - j) + "ms, state=" + simpleName + ", previewStarted=" + hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl + ", sessionReady=" + z + ", runningFreshness=" + LivenessCoordinator.this.getLivenessState().getRunningFreshness() + ", faceDistanceCheckPassed=" + LivenessCoordinator.this.getLivenessState().getInitialFaceDistanceCheckPassed());
                if (!(value instanceof LivenessCheckState.Success)) {
                }
                pUU.KWHzl("awsLiveness", "Heartbeat stopping: session ended with " + value.getClass().getSimpleName());
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
            i++;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j2 = LivenessCoordinator.this.coordinatorStartTime;
            value = LivenessCoordinator.this.getLivenessState().getLivenessCheckState().getValue();
            String simpleName2 = value.getClass().getSimpleName();
            boolean hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl2 = LivenessCoordinator.this.getPreviewTextureView().getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl();
            boolean z = LivenessCoordinator.this.getLivenessState().getLivenessSessionInfo() != null;
            pUU.KWHzl("awsLiveness", "Heartbeat #" + i + ": elapsed=" + (jCurrentTimeMillis2 - j2) + "ms, state=" + simpleName2 + ", previewStarted=" + hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl2 + ", sessionReady=" + z + ", runningFreshness=" + LivenessCoordinator.this.getLivenessState().getRunningFreshness() + ", faceDistanceCheckPassed=" + LivenessCoordinator.this.getLivenessState().getInitialFaceDistanceCheckPassed());
            if (!(value instanceof LivenessCheckState.Success) || (value instanceof LivenessCheckState.Error)) {
                pUU.KWHzl("awsLiveness", "Heartbeat stopping: session ended with " + value.getClass().getSimpleName());
                return Unit.INSTANCE;
            }
            this.I$0 = i;
            this.label = 1;
            if (DelayKt.delay(5000L, this) == objCopydefault) {
                return objCopydefault;
            }
            i++;
            long jCurrentTimeMillis22 = System.currentTimeMillis();
            long j22 = LivenessCoordinator.this.coordinatorStartTime;
            value = LivenessCoordinator.this.getLivenessState().getLivenessCheckState().getValue();
            String simpleName22 = value.getClass().getSimpleName();
            boolean hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl22 = LivenessCoordinator.this.getPreviewTextureView().getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl();
            if (LivenessCoordinator.this.getLivenessState().getLivenessSessionInfo() != null) {
            }
            pUU.KWHzl("awsLiveness", "Heartbeat #" + i + ": elapsed=" + (jCurrentTimeMillis22 - j22) + "ms, state=" + simpleName22 + ", previewStarted=" + hasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl22 + ", sessionReady=" + z + ", runningFreshness=" + LivenessCoordinator.this.getLivenessState().getRunningFreshness() + ", faceDistanceCheckPassed=" + LivenessCoordinator.this.getLivenessState().getInitialFaceDistanceCheckPassed());
            if (!(value instanceof LivenessCheckState.Success)) {
            }
            pUU.KWHzl("awsLiveness", "Heartbeat stopping: session ended with " + value.getClass().getSimpleName());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LivenessCoordinator.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.label = 1;
                if (DelayKt.delay(5000L, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            if (!LivenessCoordinator.this.getPreviewTextureView().getHasReceivedUpdate$OKCompliance_ok_compliance_dynamic_aws_impl()) {
                pUU.valueOf("awsLiveness", "Camera failed to open within 5s timeout");
                LivenessCoordinator.this.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(new FaceLivenessDetectionException("The camera failed to open within the allowed time limit.", "Ensure the camera is available to use and that no other apps are using it.", null, null, null, 28, null), true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LifecycleOwner lifecycleOwner, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$lifecycleOwner = lifecycleOwner;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LivenessCoordinator.this.new AnonymousClass3(this.$lifecycleOwner, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LivenessCoordinator livenessCoordinator = LivenessCoordinator.this;
                    Context context = livenessCoordinator.getContext();
                    this.label = 1;
                    obj = livenessCoordinator.getCameraProvider(context, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                LivenessCoordinator livenessCoordinator2 = LivenessCoordinator.this;
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) obj;
                if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    processCameraProvider.unbindAll();
                    CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
                    Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                    if (processCameraProvider.hasCamera(cameraSelector)) {
                        Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                        processCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, livenessCoordinator2.preview, livenessCoordinator2.analysis);
                    } else {
                        livenessCoordinator2.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(new FaceLivenessDetectionException("A front facing camera is required but no front facing camera detected.", "Enable a front facing camera.", null, null, null, 28, null), true);
                    }
                }
            } catch (Throwable th) {
                pUU.KWHzl("awsLiveness", "getCameraProvider init e=" + th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLivenessSession() {
        this.livenessState.getLivenessCheckState().setValue(LivenessCheckState.Initial.Companion.withConnectingMessage());
        FaceLivenessSessionInformation faceLivenessSessionInformation = new FaceLivenessSessionInformation(480.0f, 640.0f, "FaceMovementAndLightChallenge_1.0.0", this.region);
        AWSFaceLivenessSessionOptions.Builder builder = AWSFaceLivenessSessionOptions.Companion.builder();
        AWSCredentialsProvider<AWSCredentials> aWSCredentialsProvider = this.credentialsProvider;
        if (aWSCredentialsProvider != null) {
            builder.credentialsProvider(aWSCredentialsProvider);
        }
        AWSFaceLivenessSessionOptions aWSFaceLivenessSessionOptionsBuild = builder.build();
        AWSPredictionsPlugin.startFaceLivenessSession(this.sessionId, faceLivenessSessionInformation, aWSFaceLivenessSessionOptionsBuild, "liveness", new Consumer() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                LivenessCoordinator.startLivenessSession$lambda$14(this.f$0, (FaceLivenessSession) obj);
            }
        }, new Action() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Action
            public final void call() {
                LivenessCoordinator.startLivenessSession$lambda$15(this.f$0);
            }
        }, new Consumer() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                LivenessCoordinator.startLivenessSession$lambda$16(this.f$0, (PredictionsException) obj);
            }
        }, new Consumer() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                LivenessCoordinator.startLivenessSession$lambda$17(this.f$0, (OkHttpClient.Builder) obj);
            }
        }, C43292rmY.OLrzqt.zuBGHE() + this.wssProxyPath, Boolean.valueOf(this.needProxy));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLivenessSession$lambda$14(LivenessCoordinator livenessCoordinator, FaceLivenessSession faceLivenessSession) {
        Intrinsics.checkNotNullParameter(faceLivenessSession, "");
        livenessCoordinator.livenessState.onLivenessSessionReady(faceLivenessSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLivenessSession$lambda$15(LivenessCoordinator livenessCoordinator) {
        livenessCoordinator.disconnectEventReceived = true;
        livenessCoordinator.onChallengeComplete.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLivenessSession$lambda$16(LivenessCoordinator livenessCoordinator, PredictionsException predictionsException) {
        FaceLivenessDetectionException faceLivenessDetectionException;
        Intrinsics.checkNotNullParameter(predictionsException, "");
        if (predictionsException instanceof AccessDeniedException) {
            faceLivenessDetectionException = new FaceLivenessDetectionException.AccessDeniedException(null, null, predictionsException, 3, null);
        } else if (predictionsException instanceof FaceLivenessSessionNotFoundException) {
            faceLivenessDetectionException = new FaceLivenessDetectionException.SessionNotFoundException(null, null, predictionsException, 3, null);
        } else if (predictionsException instanceof FaceLivenessSessionTimeoutException) {
            faceLivenessDetectionException = new FaceLivenessDetectionException.SessionTimedOutException(null, null, predictionsException, 3, null);
        } else {
            String message = predictionsException.getMessage();
            if (message == null) {
                message = "Unknown error.";
            }
            String recoverySuggestion = predictionsException.getRecoverySuggestion();
            Intrinsics.checkNotNullExpressionValue(recoverySuggestion, "");
            faceLivenessDetectionException = new FaceLivenessDetectionException(message, recoverySuggestion, predictionsException, null, null, 24, null);
        }
        livenessCoordinator.processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(faceLivenessDetectionException, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLivenessSession$lambda$17(LivenessCoordinator livenessCoordinator, OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        if (livenessCoordinator.needProxy) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderAddInterceptor = builder.readTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true).addInterceptor(new AWSSubdomainInterceptor(livenessCoordinator.subdomainStrategy));
            DohTypeEnum dohTypeEnum = DohTypeEnum.V5;
            builderAddInterceptor.addInterceptor(new C43334rnN(dohTypeEnum)).dns(new C43337rnQ(dohTypeEnum));
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$unbindCamera$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16921(Context context, Continuation<? super C16921> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LivenessCoordinator.this.new C16921(this.$context, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LivenessCoordinator livenessCoordinator = LivenessCoordinator.this;
                Context context = this.$context;
                this.label = 1;
                obj = livenessCoordinator.getCameraProvider(context, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ((ProcessCameraProvider) obj).unbindAll();
            return Unit.INSTANCE;
        }
    }

    private final void unbindCamera(Context context) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new C16921(context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCaptureReady() {
        pUU.KWHzl("awsLiveness", "processCaptureReady");
        this.encoder.start();
    }

    public final void processSessionError$OKCompliance_ok_compliance_dynamic_aws_impl(@NotNull FaceLivenessDetectionException faceLivenessDetectionException, boolean z) {
        WebSocketCloseCode webSocketCloseCode;
        Intrinsics.checkNotNullParameter(faceLivenessDetectionException, "");
        if (faceLivenessDetectionException instanceof FaceLivenessDetectionException.UserCancelledException) {
            webSocketCloseCode = WebSocketCloseCode.CANCELED;
        } else {
            webSocketCloseCode = faceLivenessDetectionException instanceof FaceLivenessDetectionException.FaceInOvalMatchExceededTimeLimitException ? WebSocketCloseCode.TIMEOUT : WebSocketCloseCode.RUNTIME_ERROR;
        }
        this.livenessState.onError(z, webSocketCloseCode);
        unbindCamera(this.context);
        try {
            faceLivenessDetectionException.setLivenessCheckState(this.livenessState.getLivenessCheckState().getValue().getClass().getName());
            faceLivenessDetectionException.setRunningFreshness(Boolean.valueOf(this.livenessState.getRunningFreshness()));
        } catch (Exception unused) {
        }
        this.onChallengeFailed.accept(faceLivenessDetectionException);
    }

    public final void processColorDisplayed(@NotNull RgbColor rgbColor, @NotNull RgbColor rgbColor2, int i, long j) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        Intrinsics.checkNotNullParameter(rgbColor2, "");
        FaceLivenessSession livenessSessionInfo = this.livenessState.getLivenessSessionInfo();
        Intrinsics.copydefault(livenessSessionInfo);
        ColorChallenge colorChallenge = this.livenessState.getColorChallenge();
        Intrinsics.copydefault(colorChallenge);
        livenessSessionInfo.sendChallengeResponseEvent(new ColorChallengeResponse(colorChallenge.getChallengeId(), rgbColor, rgbColor2, new Date(j), i));
    }

    public final void processFreshnessChallengeComplete() {
        this.livenessState.onFreshnessComplete();
        stopEncoder(new Function0() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LivenessCoordinator.processFreshnessChallengeComplete$lambda$18(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processFreshnessChallengeComplete$lambda$18(LivenessCoordinator livenessCoordinator) {
        livenessCoordinator.livenessState.onFullChallengeComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFinalEventsSent() {
        unbindCamera(this.context);
    }

    private final void stopEncoder(final Function0<Unit> function0) {
        this.encoder.stop(new Function0() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LivenessCoordinator.stopEncoder$lambda$19(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopEncoder$lambda$19(Function0 function0) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new LivenessCoordinator$stopEncoder$1$1(function0, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void destroy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.coordinatorStartTime;
        pUU.KWHzl("awsLiveness", "Destroying coordinator: elapsed=" + (jCurrentTimeMillis - j) + "ms, disconnectReceived=" + this.disconnectEventReceived + ", state=" + this.livenessState.getLivenessCheckState().getValue().getClass().getSimpleName());
        this.encoder.stop(new Function0() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LivenessCoordinator.destroy$lambda$20(this.f$0);
            }
        });
        this.livenessState.onDestroy(true, !this.disconnectEventReceived ? WebSocketCloseCode.DISPOSED : null);
        unbindCamera(context);
        this.analysisExecutor.shutdown();
        pUU.KWHzl("awsLiveness", "Coordinator destroyed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$20(LivenessCoordinator livenessCoordinator) {
        livenessCoordinator.encoder.destroy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getCameraProvider(Context context, Continuation<? super ProcessCameraProvider> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        try {
            final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(context);
            companion.addListener(new Runnable() { // from class: com.amplifyframework.ui.liveness.camera.LivenessCoordinator$getCameraProvider$2$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    Continuation<ProcessCameraProvider> continuation2 = c56434yFf;
                    Result.Application application = Result.Companion;
                    continuation2.resumeWith(Result.m7377constructorimpl(companion.get()));
                }
            }, ContextCompat.getMainExecutor(context));
        } catch (Throwable th) {
            pUU.KWHzl("LivenessCoordinator", "getCameraProvider Error = " + th);
        }
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.camera.LivenessCoordinator.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Size getTARGET_RESOLUTION_SIZE() {
            return LivenessCoordinator.TARGET_RESOLUTION_SIZE;
        }
    }
}
