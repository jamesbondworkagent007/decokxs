package com.okinc.liveness.lca.manager;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.interop.Camera2Interop;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.amplifyframework.ui.liveness.camera.OpenGLRenderer;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.camera.FrameAnalyzer;
import com.okinc.liveness.lca.camera.TimeFrameSynchronizationManager;
import com.okinc.liveness.lca.camera.VideoEncoder;
import com.okinc.liveness.lca.components.PreviewTextureView;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.exception.LcaBindCameraFailException;
import com.okinc.liveness.lca.exception.LcaFrontCameraUnavailableException;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C42459rTq;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.C59442zhC;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CameraManager {
    public static final String KYC_LOG_TAG = "kyc_in_house";
    public static final String TAG = "CameraManager";
    public final MutableLiveData<CameraState> _cameraState;
    public ImageAnalysis analysis;
    public ExecutorService analysisExecutor;
    public FrameAnalyzer analyzer;
    public Camera bindedCamera;
    public final AtomicBoolean cameraInitialized;
    public final CameraManagerListener cameraManagerListener;
    public final Observer<CameraState> cameraObserver;
    public ProcessCameraProvider cameraProvider;
    public final LiveData<CameraState> cameraState;
    public TimeFrameSynchronizationManager colorFrameSynchronizer;
    public final LcaSdkLivenessConfig config;
    public final AppCompatActivity context;
    public Handler diagnosticHandler;
    public final long diagnosticIntervalMs;
    public Runnable diagnosticRunnable;
    public VideoEncoder encoder;
    public int encoderFrameCount;
    public final FaceCaptchaManager faceCaptchaManager;
    public int frameAnalysisCount;
    public final AtomicBoolean isReleasingCamera;
    public long lastEncoderFrameTime;
    public long lastFrameAnalysisTime;
    public Preview preview;
    public OpenGLRenderer renderer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CameraState.Type.values().length];
            try {
                iArr[CameraState.Type.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraState.Type.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraState.Type.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraState.Type.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraState.Type.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<CameraState> getCameraState() {
        return this.cameraState;
    }

    public CameraManager(@NotNull AppCompatActivity appCompatActivity, @NotNull FaceCaptchaManager faceCaptchaManager, @NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig, @NotNull CameraManagerListener cameraManagerListener) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(faceCaptchaManager, "");
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
        Intrinsics.checkNotNullParameter(cameraManagerListener, "");
        this.context = appCompatActivity;
        this.faceCaptchaManager = faceCaptchaManager;
        this.config = lcaSdkLivenessConfig;
        this.cameraManagerListener = cameraManagerListener;
        this.isReleasingCamera = new AtomicBoolean(false);
        this.cameraInitialized = new AtomicBoolean(false);
        this.diagnosticIntervalMs = 3000L;
        MutableLiveData<CameraState> mutableLiveData = new MutableLiveData<>();
        this._cameraState = mutableLiveData;
        this.cameraState = mutableLiveData;
        this.cameraObserver = new Observer() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CameraManager.cameraObserver$lambda$0(this.f$0, (CameraState) obj);
            }
        };
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.manager.CameraManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final void cameraObserver$lambda$0(CameraManager cameraManager, CameraState cameraState) {
        Intrinsics.checkNotNullParameter(cameraState, "");
        cameraManager._cameraState.setValue(cameraState);
        int i = WhenMappings.$EnumSwitchMapping$0[cameraState.getType().ordinal()];
        if (i == 1) {
            pUU.EZpvd("kyc_in_house", "Lca liveness - Camera pending open");
            return;
        }
        if (i == 2) {
            pUU.EZpvd("kyc_in_house", "Lca liveness - Camera opening");
            return;
        }
        if (i == 3) {
            pUU.EZpvd("kyc_in_house", "Lca liveness - Camera open");
        } else if (i == 4) {
            pUU.EZpvd("kyc_in_house", "Lca liveness - Camera closing");
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.EZpvd("kyc_in_house", "Lca liveness - Camera closed");
        }
    }

    public final void initCamera() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - init camera components");
        if (this.cameraInitialized.get()) {
            pUU.KWHzl(TAG, "initCamera skipped - already initialized");
            return;
        }
        try {
            Preview.Builder builder = new Preview.Builder();
            Camera2Interop.Extender extender = new Camera2Interop.Extender(builder);
            Integer fps = this.config.getCollectedVideoConfig().getFps();
            if (fps != null) {
                int iIntValue = fps.intValue();
                extender.setCaptureRequestOption(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue)));
            }
            if (C42459rTq.KWHzl.djBIcL()) {
                ResolutionSelector.Builder aspectRatioStrategy = new ResolutionSelector.Builder().setAspectRatioStrategy(new AspectRatioStrategy(0, 1));
                Integer resolutionWidth = this.config.getCollectedVideoConfig().getResolutionWidth();
                Intrinsics.copydefault(resolutionWidth);
                int iIntValue2 = resolutionWidth.intValue();
                Integer resolutionHeight = this.config.getCollectedVideoConfig().getResolutionHeight();
                Intrinsics.copydefault(resolutionHeight);
                builder.setResolutionSelector(aspectRatioStrategy.setResolutionStrategy(new ResolutionStrategy(new Size(iIntValue2, resolutionHeight.intValue()), 3)).build());
            } else {
                Integer resolutionWidth2 = this.config.getCollectedVideoConfig().getResolutionWidth();
                Intrinsics.copydefault(resolutionWidth2);
                int iIntValue3 = resolutionWidth2.intValue();
                Integer resolutionHeight2 = this.config.getCollectedVideoConfig().getResolutionHeight();
                Intrinsics.copydefault(resolutionHeight2);
                builder.setTargetResolution(new Size(iIntValue3, resolutionHeight2.intValue()));
            }
            this.preview = builder.build();
            this.analyzer = new FrameAnalyzer(this.context, this.faceCaptchaManager, LcaSdkManager.Companion.getInstance().getConfiguration().getEnableQc(), this.config);
            this.analysisExecutor = Executors.newSingleThreadExecutor();
            ImageAnalysis.Builder builder2 = new ImageAnalysis.Builder();
            Camera2Interop.Extender extender2 = new Camera2Interop.Extender(builder2);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Integer fps2 = this.config.getCollectedVideoConfig().getFps();
            Intrinsics.copydefault(fps2);
            Integer fps3 = this.config.getCollectedVideoConfig().getFps();
            Intrinsics.copydefault(fps3);
            extender2.setCaptureRequestOption(key, new Range(fps2, fps3));
            builder2.setOutputImageFormat(2);
            Integer resolutionWidth3 = this.config.getCollectedVideoConfig().getResolutionWidth();
            Intrinsics.copydefault(resolutionWidth3);
            int iIntValue4 = resolutionWidth3.intValue();
            Integer resolutionHeight3 = this.config.getCollectedVideoConfig().getResolutionHeight();
            Intrinsics.copydefault(resolutionHeight3);
            builder2.setTargetResolution(new Size(iIntValue4, resolutionHeight3.intValue()));
            ImageAnalysis imageAnalysisBuild = builder2.build();
            ExecutorService executorService = this.analysisExecutor;
            Intrinsics.copydefault(executorService);
            FrameAnalyzer frameAnalyzer = this.analyzer;
            Intrinsics.copydefault(frameAnalyzer);
            imageAnalysisBuild.setAnalyzer(executorService, frameAnalyzer);
            this.analysis = imageAnalysisBuild;
            String bestSupportedCodec = LcaMediaUtils.INSTANCE.getBestSupportedCodec();
            pUU.KWHzl(TAG, "Using codec: " + bestSupportedCodec);
            VideoEncoder.Companion companion = VideoEncoder.Companion;
            AppCompatActivity appCompatActivity = this.context;
            Integer resolutionWidth4 = this.config.getCollectedVideoConfig().getResolutionWidth();
            Intrinsics.copydefault(resolutionWidth4);
            int iIntValue5 = resolutionWidth4.intValue();
            Integer resolutionHeight4 = this.config.getCollectedVideoConfig().getResolutionHeight();
            Intrinsics.copydefault(resolutionHeight4);
            int iIntValue6 = resolutionHeight4.intValue();
            Integer bitrate = this.config.getCollectedVideoConfig().getBitrate();
            Intrinsics.copydefault(bitrate);
            int iIntValue7 = bitrate.intValue();
            Integer fps4 = this.config.getCollectedVideoConfig().getFps();
            Intrinsics.copydefault(fps4);
            this.encoder = companion.create(appCompatActivity, iIntValue5, iIntValue6, bestSupportedCodec, iIntValue7, fps4.intValue(), 1, new Function1() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraManager.initCamera$lambda$7(this.f$0, ((Long) obj).longValue());
                }
            }, new Function2() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraManager.initCamera$lambda$8(this.f$0, (byte[]) obj, ((Long) obj2).longValue());
                }
            }, new Function2() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraManager.initCamera$lambda$9(this.f$0, ((Long) obj).longValue(), (File) obj2);
                }
            });
            pUU.KWHzl("kyc_in_house", "Lca liveness - Creating OpenGLRenderer...");
            OpenGLRenderer openGLRenderer = new OpenGLRenderer(new Function2() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CameraManager.initCamera$lambda$10(this.f$0, (String) obj, (Exception) obj2);
                }
            }, new Function1() { // from class: com.okinc.liveness.lca.manager.CameraManager$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CameraManager.initCamera$lambda$11((String) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "Lca liveness - Attaching input preview to renderer...");
            Preview preview = this.preview;
            Intrinsics.copydefault(preview);
            openGLRenderer.attachInputPreview(preview);
            pUU.KWHzl("kyc_in_house", "Lca liveness - Input preview attached successfully");
            Integer resolutionWidth5 = this.config.getCollectedVideoConfig().getResolutionWidth();
            if (resolutionWidth5 != null) {
                int iIntValue8 = resolutionWidth5.intValue();
                Integer resolutionHeight5 = this.config.getCollectedVideoConfig().getResolutionHeight();
                if (resolutionHeight5 != null) {
                    int iIntValue9 = resolutionHeight5.intValue();
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Attaching output surface to renderer (" + iIntValue8 + "x" + iIntValue9 + ")...");
                    VideoEncoder videoEncoder = this.encoder;
                    Intrinsics.copydefault(videoEncoder);
                    Surface inputSurface = videoEncoder.getInputSurface();
                    Intrinsics.copydefault(inputSurface);
                    openGLRenderer.attachOutputSurface(inputSurface, new Size(iIntValue8, iIntValue9), 0);
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Output surface attached successfully");
                    this.renderer = openGLRenderer;
                    this.colorFrameSynchronizer = new TimeFrameSynchronizationManager();
                    this.cameraInitialized.set(true);
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Camera components initialized successfully");
                }
            }
        } catch (Exception e) {
            pUU.AEQbTJ("kyc_in_house", "Lca liveness - Failed to initialize camera components", e);
            this.cameraManagerListener.onError(LcaSdkConfiguration.Companion.getRETRY_REASON_CAMERA_BIND(), e);
        }
    }

    public static final Unit initCamera$lambda$7(CameraManager cameraManager, long j) {
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = cameraManager.colorFrameSynchronizer;
        if (timeFrameSynchronizationManager != null) {
            timeFrameSynchronizationManager.onCameraFrame(j);
        }
        cameraManager.lastEncoderFrameTime = j;
        cameraManager.encoderFrameCount++;
        return Unit.INSTANCE;
    }

    public static final Unit initCamera$lambda$8(CameraManager cameraManager, byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (LcaSdkManager.Companion.getInstance().getConfiguration().getSegmentUpload()) {
            pUU.KWHzl("kyc_in_house", "Lca liveness - send video segment at " + j);
            cameraManager.cameraManagerListener.onVideoSegmentReady(bArr, j);
        }
        pUU.KWHzl("realtime", "videoTime=" + j);
        return Unit.INSTANCE;
    }

    public static final Unit initCamera$lambda$9(CameraManager cameraManager, long j, File file) {
        Intrinsics.checkNotNullParameter(file, "");
        pUU.KWHzl("kyc_in_house", "Lca liveness - whole video muxer complete, endTime=" + j);
        cameraManager.cameraManagerListener.onVideoMuxerComplete(j, file);
        return Unit.INSTANCE;
    }

    public static final Unit initCamera$lambda$10(CameraManager cameraManager, String str, Exception exc) {
        pUU.AEQbTJ("kyc_in_house", "Lca liveness - OpenGL Renderer ERROR: " + str, exc);
        cameraManager.cameraManagerListener.onError(LcaSdkConfiguration.Companion.getRETRY_REASON_CAMERA_BIND(), exc);
        return Unit.INSTANCE;
    }

    public static final Unit initCamera$lambda$11(String str) {
        Intrinsics.copydefault((Object) str);
        if (StringsKt__StringsKt.AhwBna((CharSequence) str, (CharSequence) Constants.IPC_BUNDLE_KEY_SEND_ERROR, true) || StringsKt__StringsKt.AhwBna((CharSequence) str, (CharSequence) "fail", true) || StringsKt__StringsKt.AhwBna((CharSequence) str, (CharSequence) "surface", true)) {
            pUU.KWHzl("kyc_in_house", "Lca liveness - OpenGL: " + str);
        } else {
            pUU.EZpvd(TAG, "OpenGL: " + str);
        }
        return Unit.INSTANCE;
    }

    public final void initPreview(@NotNull PreviewTextureView previewTextureView) {
        Intrinsics.checkNotNullParameter(previewTextureView, "");
        OpenGLRenderer openGLRenderer = this.renderer;
        if (openGLRenderer != null) {
            Intrinsics.copydefault(openGLRenderer);
            previewTextureView.initPreview(openGLRenderer);
        } else {
            pUU.copydefault(TAG, "Cannot initialize preview, renderer is null");
        }
    }

    public final void bindCamera() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - binding camera");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.context), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$bindCamera$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraManager.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0159 A[Catch: Exception -> 0x0173, TRY_LEAVE, TryCatch #1 {Exception -> 0x0173, blocks: (B:6:0x0013, B:15:0x0035, B:17:0x0042, B:25:0x005f, B:27:0x0067, B:29:0x008f, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:36:0x00b8, B:38:0x00c0, B:40:0x00d0, B:42:0x00e0, B:44:0x0137, B:46:0x013d, B:47:0x0140, B:49:0x0148, B:51:0x014e, B:52:0x0153, B:24:0x005a, B:53:0x0159, B:11:0x0022, B:19:0x004d, B:21:0x0055), top: B:61:0x000b, inners: #0 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CameraManager cameraManager;
            Camera cameraBindToLifecycle;
            CameraControl cameraControl;
            CameraControl cameraControl2;
            CameraInfo cameraInfo;
            LiveData<CameraState> cameraState;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    CameraManager cameraManager2 = CameraManager.this;
                    AppCompatActivity appCompatActivity = cameraManager2.context;
                    this.L$0 = cameraManager2;
                    this.label = 1;
                    Object cameraProvider = cameraManager2.getCameraProvider(appCompatActivity, this);
                    if (cameraProvider == objCopydefault) {
                        return objCopydefault;
                    }
                    cameraManager = cameraManager2;
                    obj = cameraProvider;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cameraManager = (CameraManager) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                }
                cameraManager.cameraProvider = (ProcessCameraProvider) obj;
                ProcessCameraProvider processCameraProvider = CameraManager.this.cameraProvider;
                if (processCameraProvider != null) {
                    CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
                    Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                    if (processCameraProvider.hasCamera(cameraSelector)) {
                        try {
                            ProcessCameraProvider processCameraProvider2 = CameraManager.this.cameraProvider;
                            if (processCameraProvider2 != null) {
                                processCameraProvider2.unbindAll();
                            }
                        } catch (Exception e) {
                            pUU.OLrzqt("kyc_in_house", "Error unbinding camera", e);
                        }
                        CameraManager cameraManager3 = CameraManager.this;
                        ProcessCameraProvider processCameraProvider3 = cameraManager3.cameraProvider;
                        if (processCameraProvider3 != null) {
                            AppCompatActivity appCompatActivity2 = CameraManager.this.context;
                            Intrinsics.copydefault(appCompatActivity2, "");
                            CameraSelector cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
                            Intrinsics.checkNotNullExpressionValue(cameraSelector2, "");
                            cameraBindToLifecycle = processCameraProvider3.bindToLifecycle(appCompatActivity2, cameraSelector2, CameraManager.this.preview, CameraManager.this.analysis);
                        } else {
                            cameraBindToLifecycle = null;
                        }
                        cameraManager3.bindedCamera = cameraBindToLifecycle;
                        Camera camera = CameraManager.this.bindedCamera;
                        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null && (cameraState = cameraInfo.getCameraState()) != null) {
                            AppCompatActivity appCompatActivity3 = CameraManager.this.context;
                            Intrinsics.copydefault(appCompatActivity3, "");
                            cameraState.observe(appCompatActivity3, CameraManager.this.cameraObserver);
                        }
                        if (C42459rTq.KWHzl.AYXKKw() && CameraManager.this.config.getCollectedVideoConfig().getResolutionWidth() != null && CameraManager.this.config.getCollectedVideoConfig().getResolutionHeight() != null) {
                            Integer resolutionWidth = CameraManager.this.config.getCollectedVideoConfig().getResolutionWidth();
                            Intrinsics.copydefault(resolutionWidth);
                            float fIntValue = resolutionWidth.intValue();
                            Intrinsics.copydefault(CameraManager.this.config.getCollectedVideoConfig().getResolutionHeight());
                            MeteringPoint meteringPointCreatePoint = new SurfaceOrientedMeteringPointFactory(fIntValue, r2.intValue()).createPoint(0.5f, 0.5f);
                            Intrinsics.checkNotNullExpressionValue(meteringPointCreatePoint, "");
                            FocusMeteringAction focusMeteringActionBuild = new FocusMeteringAction.Builder(meteringPointCreatePoint, 3).setAutoCancelDuration(5L, TimeUnit.SECONDS).build();
                            Intrinsics.checkNotNullExpressionValue(focusMeteringActionBuild, "");
                            Camera camera2 = CameraManager.this.bindedCamera;
                            if (camera2 != null && (cameraControl2 = camera2.getCameraControl()) != null) {
                                cameraControl2.startFocusAndMetering(focusMeteringActionBuild);
                            }
                            Camera camera3 = CameraManager.this.bindedCamera;
                            if (camera3 != null && (cameraControl = camera3.getCameraControl()) != null) {
                                cameraControl.setZoomRatio(1.0f);
                            }
                        }
                        pUU.KWHzl("kyc_in_house", "Lca liveness - Camera successfully bound to lifecycle");
                    } else {
                        pUU.valueOf("kyc_in_house", "Lca liveness - Front camera not available");
                        CameraManager.this.cameraManagerListener.onError(LcaSdkConfiguration.Companion.getRETRY_REASON_FRONT_CAMERA_UNAVAILABLE(), new LcaFrontCameraUnavailableException());
                    }
                }
            } catch (Exception e2) {
                pUU.AEQbTJ("kyc_in_house", "Lca liveness - Error occurred while binding camera", e2);
                CameraManager.this.cameraManagerListener.onError(LcaSdkConfiguration.Companion.getRETRY_REASON_CAMERA_BIND(), new LcaBindCameraFailException(e2.getMessage(), e2.getCause()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$getCameraProvider$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProcessCameraProvider>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ProcessCameraProvider> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Context context = this.$context;
                this.L$0 = context;
                this.label = 1;
                final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(this));
                try {
                    final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(context);
                    companion.addListener(new Runnable() { // from class: com.okinc.liveness.lca.manager.CameraManager$getCameraProvider$2$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object objM7377constructorimpl;
                            try {
                                Continuation<ProcessCameraProvider> continuation = c56434yFf;
                                Result.Application application = Result.Companion;
                                try {
                                    objM7377constructorimpl = Result.m7377constructorimpl(companion.get());
                                } catch (Throwable th) {
                                    Result.Application application2 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                }
                                continuation.resumeWith(objM7377constructorimpl);
                            } catch (Exception e) {
                                pUU.AEQbTJ("kyc_in_house", "Failed to get camera provider", e);
                                Continuation<ProcessCameraProvider> continuation2 = c56434yFf;
                                Result.Application application3 = Result.Companion;
                                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                            }
                        }
                    }, ContextCompat.getMainExecutor(context));
                } catch (Exception e) {
                    pUU.AEQbTJ("kyc_in_house", "Failed to get camera provider instance", e);
                    Result.Application application = Result.Companion;
                    c56434yFf.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(e)));
                }
                obj = c56434yFf.KWHzl();
                if (obj == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    public final Object getCameraProvider(Context context, Continuation<? super ProcessCameraProvider> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(context, null), continuation);
    }

    public final void unbindCamera() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - unbinding camera");
        if (this.isReleasingCamera.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.context), Dispatchers.getMain(), null, new C17101(null), 2, null);
        } else {
            pUU.KWHzl("kyc_in_house", "Lca liveness - Camera is already being released");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$unbindCamera$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17101(Continuation<? super C17101> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraManager.this.new C17101(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CameraInfo cameraInfo;
            LiveData<CameraState> cameraState;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    try {
                        ImageAnalysis imageAnalysis = CameraManager.this.analysis;
                        if (imageAnalysis != null) {
                            imageAnalysis.clearAnalyzer();
                        }
                        Camera camera = CameraManager.this.bindedCamera;
                        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null && (cameraState = cameraInfo.getCameraState()) != null) {
                            cameraState.removeObserver(CameraManager.this.cameraObserver);
                        }
                        try {
                            ProcessCameraProvider processCameraProvider = CameraManager.this.cameraProvider;
                            if (processCameraProvider != null) {
                                processCameraProvider.unbindAll();
                            }
                        } catch (Exception e) {
                            pUU.OLrzqt("kyc_in_house", "Error unbinding camera use cases", e);
                        }
                        CameraManager.this.bindedCamera = null;
                        CameraManager.this.cameraProvider = null;
                        pUU.KWHzl("kyc_in_house", "Lca liveness - Camera successfully unbound");
                    } catch (Exception e2) {
                        pUU.AEQbTJ("kyc_in_house", "Lca liveness - Error unbinding camera", e2);
                    }
                    CameraManager.this.isReleasingCamera.set(false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    CameraManager.this.isReleasingCamera.set(false);
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void startVideoRecording() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Starting video recording");
        VideoEncoder videoEncoder = this.encoder;
        if (videoEncoder != null) {
            videoEncoder.start();
        }
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = this.colorFrameSynchronizer;
        if (timeFrameSynchronizationManager != null) {
            timeFrameSynchronizationManager.start();
        }
        startDiagnosticLogging();
    }

    public final void endVideoRecordingAsComplete() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - End video recording as complete");
        VideoEncoder videoEncoder = this.encoder;
        if (videoEncoder != null) {
            videoEncoder.stop();
        }
    }

    public final void startColorChallenge() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Starting color challenge (analyzer)");
        this.cameraManagerListener.onColorChallengeStart();
    }

    public final void stopColorChallenge() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Stopping color challenge (analyzer)");
        stopColorFreshness(false);
        this.cameraManagerListener.onColorChallengeStop();
    }

    public final void startColorFreshness() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Starting color freshness (analyzer)");
        FrameAnalyzer frameAnalyzer = this.analyzer;
        if (frameAnalyzer != null) {
            frameAnalyzer.startFreshness();
        }
    }

    public static /* synthetic */ void stopColorFreshness$default(CameraManager cameraManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        cameraManager.stopColorFreshness(z);
    }

    public final void stopColorFreshness(boolean z) {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Stop color freshness (analyzer)");
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.context), null, null, new C17091(null), 3, null);
            return;
        }
        FrameAnalyzer frameAnalyzer = this.analyzer;
        if (frameAnalyzer != null) {
            frameAnalyzer.stopFreshness();
        }
        pUU.EZpvd("kyc_in_house", "Lca liveness - Executed resume QC analyze with no delay");
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$stopColorFreshness$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17091(Continuation<? super C17091> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraManager.this.new C17091(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C05031 c05031 = new C05031(CameraManager.this, null);
                    this.label = 1;
                    if (BuildersKt.withContext(io2, c05031, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                pUU.AEQbTJ("kyc_in_house", "Error during delayed stopFreshness execution", e);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$stopColorFreshness$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CameraManager this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05031(CameraManager cameraManager, Continuation<? super C05031> continuation) {
                super(2, continuation);
                this.this$0 = cameraManager;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05031(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Integer freshnessQcDelayDuration = this.this$0.config.getFaceDetectionConfig().getFreshnessQcDelayDuration();
                    int iIntValue = freshnessQcDelayDuration != null ? freshnessQcDelayDuration.intValue() : 200;
                    this.label = 1;
                    if (DelayKt.delay(iIntValue, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                FrameAnalyzer frameAnalyzer = this.this$0.analyzer;
                if (frameAnalyzer != null) {
                    frameAnalyzer.stopFreshness();
                }
                pUU.EZpvd("kyc_in_house", "Lca liveness - Executed resume QC analyze after freshness delay");
                return Unit.INSTANCE;
            }
        }
    }

    public final void onActionChange(long j) {
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = this.colorFrameSynchronizer;
        if (timeFrameSynchronizationManager != null) {
            timeFrameSynchronizationManager.onActionChange(j);
        }
    }

    public final void onColorChallengeEnd(long j) {
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = this.colorFrameSynchronizer;
        if (timeFrameSynchronizationManager != null) {
            timeFrameSynchronizationManager.onEnd(j);
        }
    }

    public final int getFrameIndex(long j) {
        Integer frameIndex;
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = this.colorFrameSynchronizer;
        if (timeFrameSynchronizationManager == null || (frameIndex = timeFrameSynchronizationManager.getFrameIndex(j)) == null) {
            return 0;
        }
        return frameIndex.intValue();
    }

    public final void updateFrameIndices() {
        Integer frameIndex;
        Integer frameIndex2;
        Integer frameIndex3;
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        TimeFrameSynchronizationManager timeFrameSynchronizationManager = this.colorFrameSynchronizer;
        int i = 0;
        faceCaptchaManager.setFaceDistanceCheckStartIndex((timeFrameSynchronizationManager == null || (frameIndex3 = timeFrameSynchronizationManager.getFrameIndex(faceCaptchaManager.getFaceDistanceCheckStartTime())) == null) ? 0 : frameIndex3.intValue());
        FaceCaptchaManager faceCaptchaManager2 = this.faceCaptchaManager;
        TimeFrameSynchronizationManager timeFrameSynchronizationManager2 = this.colorFrameSynchronizer;
        faceCaptchaManager2.setFaceDistanceCheckEndIndex((timeFrameSynchronizationManager2 == null || (frameIndex2 = timeFrameSynchronizationManager2.getFrameIndex(faceCaptchaManager2.getFaceDistanceCheckEndTime())) == null) ? 0 : frameIndex2.intValue());
        Iterator<T> it = this.faceCaptchaManager.getColorDisplayList().iterator();
        while (true) {
            Long lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i < 0) {
                yDY.AYXKKw();
            }
            ColorEvent colorEvent = (ColorEvent) next;
            TimeFrameSynchronizationManager timeFrameSynchronizationManager3 = this.colorFrameSynchronizer;
            if (timeFrameSynchronizationManager3 != null) {
                Long colorStartTimestamp = colorEvent.getColorStartTimestamp();
                frameIndex = timeFrameSynchronizationManager3.getFrameIndex(colorStartTimestamp != null ? colorStartTimestamp.longValue() : 0L);
            } else {
                frameIndex = null;
            }
            colorEvent.setColorStartIndex(frameIndex);
            ColorEvent colorEvent2 = (ColorEvent) CollectionsKt___CollectionsKt.AkhnZx(this.faceCaptchaManager.getColorDisplayList(), i - 1);
            if (colorEvent2 != null) {
                colorEvent2.setColorEndIndex(colorEvent.getColorStartIndex() != null ? Integer.valueOf(r5.intValue() - 1) : null);
                Long colorStartTimestamp2 = colorEvent.getColorStartTimestamp();
                if (colorStartTimestamp2 != null) {
                    long jLongValue = colorStartTimestamp2.longValue();
                    Long colorStartTimestamp3 = colorEvent2.getColorStartTimestamp();
                    Intrinsics.copydefault(colorStartTimestamp3);
                    lValueOf = Long.valueOf(jLongValue - colorStartTimestamp3.longValue());
                }
                colorEvent2.setStayTime(lValueOf);
            }
            i++;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ColorEvent colorEvent3 = (ColorEvent) CollectionsKt___CollectionsKt.wlaJM(this.faceCaptchaManager.getColorDisplayList());
        if (colorEvent3 != null) {
            TimeFrameSynchronizationManager timeFrameSynchronizationManager4 = this.colorFrameSynchronizer;
            colorEvent3.setColorEndIndex(timeFrameSynchronizationManager4 != null ? Integer.valueOf(timeFrameSynchronizationManager4.getCurrentFrameIndex()) : null);
        }
        ColorEvent colorEvent4 = (ColorEvent) CollectionsKt___CollectionsKt.wlaJM(this.faceCaptchaManager.getColorDisplayList());
        if (colorEvent4 != null) {
            Long colorStartTimestamp4 = colorEvent4.getColorStartTimestamp();
            colorEvent4.setStayTime(Long.valueOf(jCurrentTimeMillis - (colorStartTimestamp4 != null ? colorStartTimestamp4.longValue() : 0L)));
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$releaseAsStop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17071(Continuation<? super C17071> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17071 c17071 = CameraManager.this.new C17071(continuation);
            c17071.L$0 = obj;
            return c17071;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:6:0x0011, B:21:0x006a, B:23:0x007c, B:24:0x007f, B:35:0x00b3, B:34:0x00ab, B:10:0x001d, B:18:0x004c, B:15:0x002c, B:26:0x008c, B:28:0x0099, B:30:0x00a2, B:31:0x00a7), top: B:42:0x000b, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            VideoEncoder videoEncoder;
            ExecutorService executorService;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                pUU.AEQbTJ("kyc_in_house", "Error releasing camera resources", e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                pUU.KWHzl("kyc_in_house", "Lca liveness - Detaching output surface...");
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new CameraManager$releaseAsStop$1$detachOutput$1(CameraManager.this, null), 2, null);
                this.label = 1;
                if (deferredAsync$default.await(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Preview surface detached");
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Stopping encoder...");
                    videoEncoder = CameraManager.this.encoder;
                    if (videoEncoder != null) {
                        videoEncoder.stop();
                    }
                    CameraManager.this.unbindCamera();
                    executorService = CameraManager.this.analysisExecutor;
                    if (executorService != null) {
                        try {
                            executorService.shutdown();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            if (!executorService.awaitTermination(300L, timeUnit)) {
                                executorService.shutdownNow();
                                if (!executorService.awaitTermination(300L, timeUnit)) {
                                    pUU.valueOf("kyc_in_house", "Analysis executor did not terminate");
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Exception e2) {
                            pUU.AEQbTJ("kyc_in_house", "Error shutting down analysis executor", e2);
                            executorService.shutdownNow();
                        }
                    }
                    CameraManager.this.analysisExecutor = null;
                    CameraManager.this.colorFrameSynchronizer = null;
                    CameraManager.this.analysis = null;
                    CameraManager.this.encoder = null;
                    CameraManager.this.renderer = null;
                    CameraManager.this.analyzer = null;
                    CameraManager.this.preview = null;
                    CameraManager.this.cameraInitialized.set(false);
                    CameraManager.this.stopDiagnosticLogging();
                    pUU.KWHzl("kyc_in_house", "Lca liveness - Camera resources released successfully");
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            pUU.KWHzl("kyc_in_house", "Lca liveness - Output surface detached");
            pUU.KWHzl("kyc_in_house", "Lca liveness - Detaching preview surface...");
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C05021 c05021 = new C05021(CameraManager.this, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c05021, this) == objCopydefault) {
                return objCopydefault;
            }
            pUU.KWHzl("kyc_in_house", "Lca liveness - Preview surface detached");
            pUU.KWHzl("kyc_in_house", "Lca liveness - Stopping encoder...");
            videoEncoder = CameraManager.this.encoder;
            if (videoEncoder != null) {
            }
            CameraManager.this.unbindCamera();
            executorService = CameraManager.this.analysisExecutor;
            if (executorService != null) {
            }
            CameraManager.this.analysisExecutor = null;
            CameraManager.this.colorFrameSynchronizer = null;
            CameraManager.this.analysis = null;
            CameraManager.this.encoder = null;
            CameraManager.this.renderer = null;
            CameraManager.this.analyzer = null;
            CameraManager.this.preview = null;
            CameraManager.this.cameraInitialized.set(false);
            CameraManager.this.stopDiagnosticLogging();
            pUU.KWHzl("kyc_in_house", "Lca liveness - Camera resources released successfully");
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.manager.CameraManager$releaseAsStop$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableFuture<Void>>, Object> {
            int label;
            final /* synthetic */ CameraManager this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05021(CameraManager cameraManager, Continuation<? super C05021> continuation) {
                super(2, continuation);
                this.this$0 = cameraManager;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05021(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableFuture<Void>> continuation) {
                return ((C05021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    OpenGLRenderer openGLRenderer = this.this$0.renderer;
                    if (openGLRenderer != null) {
                        return openGLRenderer.detachPreviewSurface();
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void releaseAsStop() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - releasing camera resources as stop (renderer=" + (this.renderer != null) + ", encoder=" + (this.encoder != null) + ", analyzer=" + (this.analyzer != null) + ")");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.context), null, null, new C17071(null), 3, null);
    }

    public final void startDiagnosticLogging() {
        pUU.KWHzl("kyc_in_house", "Lca liveness - Starting diagnostic logging");
        this.frameAnalysisCount = 0;
        this.encoderFrameCount = 0;
        this.lastFrameAnalysisTime = System.currentTimeMillis();
        this.lastEncoderFrameTime = System.currentTimeMillis();
        if (this.diagnosticHandler == null) {
            this.diagnosticHandler = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = new Runnable() { // from class: com.okinc.liveness.lca.manager.CameraManager.startDiagnosticLogging.1
            @Override // java.lang.Runnable
            public void run() {
                CameraManager.this.logDiagnostics();
                Handler handler = CameraManager.this.diagnosticHandler;
                if (handler != null) {
                    handler.postDelayed(this, CameraManager.this.diagnosticIntervalMs);
                }
            }
        };
        this.diagnosticRunnable = runnable;
        Handler handler = this.diagnosticHandler;
        if (handler != null) {
            Intrinsics.copydefault(runnable);
            handler.postDelayed(runnable, this.diagnosticIntervalMs);
        }
    }

    public final void stopDiagnosticLogging() {
        Handler handler;
        Runnable runnable = this.diagnosticRunnable;
        if (runnable != null && (handler = this.diagnosticHandler) != null) {
            handler.removeCallbacks(runnable);
        }
        this.diagnosticRunnable = null;
        this.diagnosticHandler = null;
        pUU.KWHzl("kyc_in_house", "Lca liveness - Stopped diagnostic logging");
    }

    public final void logDiagnostics() {
        String strName;
        CameraInfo cameraInfo;
        LiveData<CameraState> cameraState;
        CameraState value;
        CameraState.Type type;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastEncoderFrameTime;
        long j2 = jCurrentTimeMillis - this.lastFrameAnalysisTime;
        Camera camera = this.bindedCamera;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (cameraState = cameraInfo.getCameraState()) == null || (value = cameraState.getValue()) == null || (type = value.getType()) == null || (strName = type.name()) == null) {
            strName = "UNKNOWN";
        }
        boolean zEZpvd = Intrinsics.EZpvd((Object) strName, (Object) "OPEN");
        boolean z = this.renderer != null;
        boolean z2 = this.encoder != null;
        boolean z3 = this.analyzer != null;
        ExecutorService executorService = this.analysisExecutor;
        boolean z4 = (executorService == null || executorService.isShutdown() || executorService.isTerminated()) ? false : true;
        pUU.KWHzl("kyc_in_house", C59442zhC.fJNWhG("\n            Lca liveness - DIAGNOSTIC HEARTBEAT:\n            - Camera state: " + strName + "\n            - Encoder frames: " + this.encoderFrameCount + " (last: " + j + "ms ago)\n            - Analysis frames: " + this.frameAnalysisCount + " (last: " + j2 + "ms ago)\n            - Renderer active: " + z + "\n            - Encoder active: " + z2 + "\n            - Analyzer active: " + z3 + "\n            - Analysis executor healthy: " + z4 + "\n            - Camera initialized: " + this.cameraInitialized.get() + "\n            - Is releasing: " + this.isReleasingCamera.get() + "\n        "));
        if (!zEZpvd || this.isReleasingCamera.get()) {
            if (Intrinsics.EZpvd((Object) strName, (Object) "CLOSED")) {
                pUU.EZpvd("kyc_in_house", "Lca liveness - Camera is CLOSED (normal completion state), stopping diagnostic logging");
                stopDiagnosticLogging();
                return;
            }
            return;
        }
        if (j > 2000 && this.encoderFrameCount > 0) {
            pUU.valueOf("kyc_in_house", "Lca liveness - WARNING: No encoder frames for " + j + "ms - possible FREEZE detected!");
            pUU.valueOf("kyc_in_house", "Lca liveness - FREEZE CONTEXT: renderer=" + z + ", encoder=" + z2 + ", executorHealthy=" + z4);
        }
        if (j2 > 2000 && this.frameAnalysisCount > 0) {
            pUU.valueOf("kyc_in_house", "Lca liveness - WARNING: No analysis frames for " + j2 + "ms - possible FREEZE detected!");
            pUU.valueOf("kyc_in_house", "Lca liveness - FREEZE CONTEXT: analyzer=" + z3 + ", executorHealthy=" + z4 + ", renderer=" + z);
        }
        if (z4 || !z3) {
            return;
        }
        pUU.valueOf("kyc_in_house", "Lca liveness - WARNING: Analysis executor is not healthy but analyzer is active!");
    }

    public final void onFrameAnalyzed() {
        this.lastFrameAnalysisTime = System.currentTimeMillis();
        this.frameAnalysisCount++;
    }
}
