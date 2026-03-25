package o;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Preview;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35292nsa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public ProcessCameraProvider AEQbTJ;
    public final java.util.concurrent.Executor AYXKKw;
    public final LifecycleOwner AhwBna;
    public ImageCapture KWHzl;
    public final android.content.Context OLrzqt;
    public int copydefault;
    public Recording djBIcL;
    public long gEmmrt;
    public final PreviewView valueOf;
    public VideoCapture<Recorder> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL != null;
    }

    public C35292nsa(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull PreviewView previewView) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(previewView, "");
        this.OLrzqt = context;
        this.AhwBna = lifecycleOwner;
        this.valueOf = previewView;
        this.copydefault = 1;
        java.util.concurrent.Executor mainExecutor = ContextCompat.getMainExecutor(context);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        this.AYXKKw = mainExecutor;
    }

    /* JADX INFO: renamed from: o.nsa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nsa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bindCamera$default(C35292nsa c35292nsa, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: o.nsf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35292nsa.KWHzl();
                }
            };
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.nsd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C35292nsa.KWHzl((java.lang.Exception) obj2);
                }
            };
        }
        c35292nsa.AEQbTJ((Function0<Unit>) function0, (Function1<? super java.lang.Exception, Unit>) function1);
    }

    public static final Unit KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final Function0<Unit> function0, @NotNull final Function1<? super java.lang.Exception, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(this.OLrzqt);
        companion.addListener(new java.lang.Runnable() { // from class: o.nsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35292nsa.KWHzl(this.EZpvd, companion, function0, function1);
            }
        }, this.AYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C35292nsa c35292nsa, ListenableFuture listenableFuture, Function0 function0, Function1 function1) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            c35292nsa.AEQbTJ = (ProcessCameraProvider) listenableFuture.get();
            c35292nsa.OLrzqt();
            function0.invoke();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKIMCameraManager", "Failed to bind camera", thM7380exceptionOrNullimpl);
            java.lang.Exception exc = thM7380exceptionOrNullimpl instanceof java.lang.Exception ? (java.lang.Exception) thM7380exceptionOrNullimpl : null;
            if (exc == null) {
                exc = new java.lang.Exception(thM7380exceptionOrNullimpl);
            }
            function1.invoke(exc);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        ProcessCameraProvider processCameraProvider = this.AEQbTJ;
        if (processCameraProvider == null) {
            pUU.copydefault("OKIMCameraManager", "Camera provider is null");
            return;
        }
        processCameraProvider.unbindAll();
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setAspectRatioStrategy(AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "");
        Preview previewBuild = new Preview.Builder().setResolutionSelector(resolutionSelectorBuild).build();
        previewBuild.setSurfaceProvider(this.valueOf.getSurfaceProvider());
        Intrinsics.checkNotNullExpressionValue(previewBuild, "");
        this.KWHzl = new ImageCapture.Builder().setResolutionSelector(resolutionSelectorBuild).setCaptureMode(1).build();
        QualitySelector qualitySelectorFrom = QualitySelector.from(Quality.HD, FallbackStrategy.higherQualityOrLowerThan(Quality.SD));
        Intrinsics.checkNotNullExpressionValue(qualitySelectorFrom, "");
        Recorder recorderBuild = new Recorder.Builder().setQualitySelector(qualitySelectorFrom).build();
        Intrinsics.checkNotNullExpressionValue(recorderBuild, "");
        this.values = VideoCapture.withOutput(recorderBuild);
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(this.copydefault).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "");
        try {
            Result.Application application = Result.Companion;
            processCameraProvider.bindToLifecycle(this.AhwBna, cameraSelectorBuild, previewBuild, this.KWHzl, this.values);
            pUU.KWHzl("OKIMCameraManager", "Camera bound successfully with lens facing: " + this.copydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("OKIMCameraManager", "Failed to bind camera use cases", thM7380exceptionOrNullimpl);
        }
    }

    public final void AEQbTJ(@NotNull java.io.File file, @NotNull Function1<? super Result<? extends java.io.File>, Unit> function1) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ImageCapture imageCapture = this.KWHzl;
        if (imageCapture == null) {
            Result.Application application = Result.Companion;
            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("ImageCapture not initialised")))));
        } else {
            ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
            Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, "");
            imageCapture.lambda$takePicture$2(outputFileOptionsBuild, this.AYXKKw, new TaskDescription(file, function1));
        }
    }

    /* JADX INFO: renamed from: o.nsa$TaskDescription */
    public static final class TaskDescription implements ImageCapture.OnImageSavedCallback {
        public final /* synthetic */ Function1<Result<? extends java.io.File>, Unit> AEQbTJ;
        public final /* synthetic */ java.io.File EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<? extends java.io.File>, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(java.io.File file, Function1<? super Result<? extends java.io.File>, Unit> function1) {
            this.EZpvd = file;
            this.AEQbTJ = function1;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            Intrinsics.checkNotNullParameter(outputFileResults, "");
            pUU.KWHzl("OKIMCameraManager", "Photo saved: " + this.EZpvd.getAbsolutePath());
            Function1<Result<? extends java.io.File>, Unit> function1 = this.AEQbTJ;
            Result.Application application = Result.Companion;
            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(this.EZpvd)));
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException imageCaptureException) {
            Intrinsics.checkNotNullParameter(imageCaptureException, "");
            pUU.AEQbTJ("OKIMCameraManager", "Photo capture failed", imageCaptureException);
            Function1<Result<? extends java.io.File>, Unit> function1 = this.AEQbTJ;
            Result.Application application = Result.Companion;
            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(imageCaptureException))));
        }
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nsa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startVideoRecording$default(C35292nsa c35292nsa, java.io.File file, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.nsb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35292nsa.copydefault();
                }
            };
        }
        c35292nsa.OLrzqt(file, function0, function1);
    }

    public final void OLrzqt(@NotNull final java.io.File file, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Result<? extends kotlin.Pair<? extends java.io.File, java.lang.Long>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        VideoCapture<Recorder> videoCapture = this.values;
        if (videoCapture == null) {
            Result.Application application = Result.Companion;
            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("VideoCapture not initialised")))));
            return;
        }
        Recording recording = this.djBIcL;
        if (recording != null) {
            recording.stop();
        }
        FileOutputOptions fileOutputOptionsBuild = new FileOutputOptions.Builder(file).build();
        Intrinsics.checkNotNullExpressionValue(fileOutputOptionsBuild, "");
        PendingRecording pendingRecordingPrepareRecording = ((Recorder) videoCapture.getOutput()).prepareRecording(this.OLrzqt, fileOutputOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(pendingRecordingPrepareRecording, "");
        if (ContextCompat.checkSelfPermission(this.OLrzqt, "android.permission.RECORD_AUDIO") == 0) {
            pendingRecordingPrepareRecording.withAudioEnabled();
        }
        this.djBIcL = pendingRecordingPrepareRecording.start(this.AYXKKw, new androidx.core.util.Consumer() { // from class: o.nrX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                C35292nsa.EZpvd(this.OLrzqt, function0, function1, file, (VideoRecordEvent) obj);
            }
        });
    }

    public static final void EZpvd(C35292nsa c35292nsa, Function0 function0, Function1 function1, java.io.File file, VideoRecordEvent videoRecordEvent) {
        if (videoRecordEvent instanceof VideoRecordEvent.Start) {
            c35292nsa.gEmmrt = java.lang.System.currentTimeMillis();
            pUU.KWHzl("OKIMCameraManager", "Video recording started");
            function0.invoke();
            return;
        }
        if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - c35292nsa.gEmmrt;
            VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
            if (finalize.hasError()) {
                pUU.copydefault("OKIMCameraManager", "Video recording error: " + finalize.getError());
                Result.Application application = Result.Companion;
                function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Recording failed with error: " + finalize.getError())))));
            } else {
                pUU.KWHzl("OKIMCameraManager", "Video saved: " + file.getAbsolutePath() + ", duration: " + jCurrentTimeMillis + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                Result.Application application2 = Result.Companion;
                function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56390yDp.OLrzqt(file, java.lang.Long.valueOf(jCurrentTimeMillis)))));
            }
            c35292nsa.djBIcL = null;
        }
    }

    public final void djBIcL() {
        Recording recording = this.djBIcL;
        if (recording != null) {
            recording.stop();
        }
    }

    public final void AhwBna() {
        int i = this.copydefault == 1 ? 0 : 1;
        this.copydefault = i;
        pUU.KWHzl("OKIMCameraManager", "Toggling camera to lens facing: " + i);
        OLrzqt();
    }

    public final void AYXKKw() {
        Recording recording = this.djBIcL;
        if (recording != null) {
            recording.stop();
        }
        this.djBIcL = null;
        ProcessCameraProvider processCameraProvider = this.AEQbTJ;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        pUU.KWHzl("OKIMCameraManager", "Camera resources released");
    }
}
