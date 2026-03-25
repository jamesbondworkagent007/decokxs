package o;

import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.mAQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33532myI {
    public C33533myJ AEQbTJ;
    public final ExecutorService EZpvd = Executors.newSingleThreadExecutor();
    public final Preview OLrzqt;
    public ProcessCameraProvider copydefault;

    @yCM
    public C33532myI() {
        Preview previewBuild = new Preview.Builder().build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "");
        this.OLrzqt = previewBuild;
    }

    public final void OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final PreviewView previewView, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(previewView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (AEQbTJ()) {
            return;
        }
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(abstractActivityC33041mov);
        companion.addListener(new java.lang.Runnable() { // from class: o.myL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C33532myI.KWHzl(this.KWHzl, previewView, abstractActivityC33041mov, companion, function1);
            }
        }, ContextCompat.getMainExecutor(abstractActivityC33041mov));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void KWHzl(C33532myI c33532myI, PreviewView previewView, AbstractActivityC33041mov abstractActivityC33041mov, ListenableFuture listenableFuture, final Function1 function1) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            c33532myI.copydefault = (ProcessCameraProvider) listenableFuture.get();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CameraxUtil", "Get available camera failed", thM7380exceptionOrNullimpl);
            C55326xho.toastWithFailedIcon$default(mAQ.Activity.KWHzl, 0, 1, (java.lang.Object) null);
        }
        CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
        c33532myI.OLrzqt.setSurfaceProvider(previewView.getSurfaceProvider());
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setTargetResolution(new android.util.Size(1280, 720)).build();
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "");
        C33533myJ c33533myJ = new C33533myJ(new Function1() { // from class: o.myK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33532myI.KWHzl(function1, (java.lang.String) obj);
            }
        });
        imageAnalysisBuild.setAnalyzer(c33532myI.EZpvd, c33533myJ);
        c33532myI.AEQbTJ = c33533myJ;
        try {
            ProcessCameraProvider processCameraProvider = c33532myI.copydefault;
            if (processCameraProvider != null) {
                processCameraProvider.unbindAll();
            }
            ProcessCameraProvider processCameraProvider2 = c33532myI.copydefault;
            if (processCameraProvider2 != null) {
                processCameraProvider2.bindToLifecycle(abstractActivityC33041mov, cameraSelector, c33532myI.OLrzqt, imageAnalysisBuild);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("CameraxUtil", "Use case binding failed", e);
        }
    }

    public static final Unit KWHzl(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C33533myJ c33533myJ = this.AEQbTJ;
        if (c33533myJ != null) {
            c33533myJ.copydefault(true);
        }
    }

    public final void copydefault() {
        ProcessCameraProvider processCameraProvider = this.copydefault;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        C33533myJ c33533myJ = this.AEQbTJ;
        if (c33533myJ != null) {
            c33533myJ.copydefault(false);
        }
        this.AEQbTJ = null;
    }

    public final boolean AEQbTJ() {
        ProcessCameraProvider processCameraProvider = this.copydefault;
        if (processCameraProvider != null) {
            return processCameraProvider.isBound(this.OLrzqt);
        }
        return false;
    }

    public final void OLrzqt() {
        ProcessCameraProvider processCameraProvider = this.copydefault;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        this.copydefault = null;
        if (this.EZpvd.isShutdown()) {
            return;
        }
        this.EZpvd.shutdown();
    }
}
