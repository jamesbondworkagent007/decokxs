package o;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.compose.material3.TooltipKt;
import androidx.lifecycle.LifecycleOwner;
import com.bumptech.glide.Glide;
import com.okinc.im.camera.OKIMCaptureMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35298nsg;
import o.C35399nuc;
import o.InterfaceC35275nsJ;
import o.InterfaceC35317nsz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35298nsg extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C35292nsa AEQbTJ;
    public MediaPlayer AYXKKw;
    public java.io.File AhwBna;
    public InterfaceC35237nrY EZpvd;
    public final C34033nOy OLrzqt;
    public Function0<Unit> copydefault;
    public int djBIcL;
    public java.io.File fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35298nsg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35298nsg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCameraListener(@NotNull InterfaceC35237nrY interfaceC35237nrY) {
        Intrinsics.checkNotNullParameter(interfaceC35237nrY, "");
        this.EZpvd = interfaceC35237nrY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.nsg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35298nsg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35298nsg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C34033nOy c34033nOyCopydefault = C34033nOy.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c34033nOyCopydefault, "");
        this.OLrzqt = c34033nOyCopydefault;
        this.djBIcL = 10000;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C35399nuc.VoiceInteractor.uzCIH, i, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C35399nuc.VoiceInteractor.getFieldNames, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C35399nuc.VoiceInteractor.getNewProxyInstance, 0);
            this.djBIcL = typedArrayObtainStyledAttributes.getInteger(C35399nuc.VoiceInteractor.iwGUEr, 10000);
            AuCTel().setIconSrc(resourceId, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
            AuCTel().setDuration(this.djBIcL);
            setupCaptureListeners();
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: o.nsg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nsg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewView fIwbmz() {
        PreviewView previewView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(previewView, "");
        return previewView;
    }

    private final android.widget.ImageView fJNWhG() {
        android.widget.ImageView imageView = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    private final android.view.TextureView ejfBZ() {
        android.view.TextureView textureView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textureView, "");
        return textureView;
    }

    private final C35315nsx AuCTel() {
        C35315nsx c35315nsx = this.OLrzqt.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35315nsx, "");
        return c35315nsx;
    }

    public final void setupCaptureListeners() {
        AuCTel().setCaptureListener(new InterfaceC35317nsz() { // from class: o.nsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC35317nsz
            public final void OLrzqt(InterfaceC35317nsz.StateListAnimator stateListAnimator) {
                C35298nsg.setupCaptureListeners$lambda$1(this.OLrzqt, stateListAnimator);
            }
        });
        AuCTel().setTypeListener(new InterfaceC35275nsJ() { // from class: o.nsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC35275nsJ
            public final void EZpvd(InterfaceC35275nsJ.Activity activity) {
                C35298nsg.setupCaptureListeners$lambda$2(this.KWHzl, activity);
            }
        });
        AuCTel().setLeftClickListener(new Function0() { // from class: o.nsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35298nsg.copydefault(this.OLrzqt);
            }
        });
        AuCTel().setRightClickListener(new Function0() { // from class: o.nso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35298nsg.djBIcL(this.AEQbTJ);
            }
        });
    }

    public static final void setupCaptureListeners$lambda$1(C35298nsg c35298nsg, InterfaceC35317nsz.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.Fragment) {
            c35298nsg.fetchVPNInfo();
            return;
        }
        if (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.Application) {
            c35298nsg.isConnected();
            return;
        }
        if (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.C0897StateListAnimator) {
            c35298nsg.valueOf = ((InterfaceC35317nsz.StateListAnimator.C0897StateListAnimator) stateListAnimator).KWHzl();
            c35298nsg.AuCTel().AEQbTJ();
            C55326xho.toast$default(c35298nsg.getContext().getString(C35399nuc.LoaderManager.closeSocket), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            C35315nsx c35315nsxAuCTel = c35298nsg.AuCTel();
            java.lang.String string = c35298nsg.getContext().getString(C35399nuc.LoaderManager.closeSocket);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c35315nsxAuCTel.AEQbTJ(string);
            C35292nsa c35292nsa = c35298nsg.AEQbTJ;
            if (c35292nsa != null) {
                c35292nsa.djBIcL();
                return;
            }
            return;
        }
        if (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.ActionBar) {
            c35298nsg.valueOf = ((InterfaceC35317nsz.StateListAnimator.ActionBar) stateListAnimator).OLrzqt();
            C35292nsa c35292nsa2 = c35298nsg.AEQbTJ;
            if (c35292nsa2 != null) {
                c35292nsa2.djBIcL();
                return;
            }
            return;
        }
        if (stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.TaskDescription) {
            return;
        }
        if (!(stateListAnimator instanceof InterfaceC35317nsz.StateListAnimator.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC35237nrY interfaceC35237nrY = c35298nsg.EZpvd;
        if (interfaceC35237nrY != null) {
            java.lang.String string2 = c35298nsg.getContext().getString(C35399nuc.LoaderManager.addSocket);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            interfaceC35237nrY.copydefault(0, string2, null);
        }
    }

    public static final void setupCaptureListeners$lambda$2(C35298nsg c35298nsg, InterfaceC35275nsJ.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof InterfaceC35275nsJ.Activity.C0896Activity) {
            c35298nsg.AkhnZx();
            c35298nsg.DbNXlk();
        } else {
            if (!(activity instanceof InterfaceC35275nsJ.Activity.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            c35298nsg.gEmmrt();
        }
    }

    public static final Unit copydefault(C35298nsg c35298nsg) {
        Function0<Unit> function0 = c35298nsg.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C35298nsg c35298nsg) {
        Function0<Unit> function0 = c35298nsg.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        java.io.File fileAhwBna = AhwBna();
        C35292nsa c35292nsa = this.AEQbTJ;
        if (c35292nsa != null) {
            c35292nsa.AEQbTJ(fileAhwBna, new Function1() { // from class: o.nsk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35298nsg.KWHzl(this.KWHzl, (Result) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(C35298nsg c35298nsg, Result result) {
        java.lang.Object objM7386unboximpl = result.m7386unboximpl();
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl == null) {
            java.io.File file = (java.io.File) objM7386unboximpl;
            c35298nsg.AhwBna = file;
            c35298nsg.copydefault(file);
            c35298nsg.AuCTel().EZpvd();
        } else {
            pUU.AEQbTJ("OKIMCameraView", "Photo capture failed", thM7380exceptionOrNullimpl);
            InterfaceC35237nrY interfaceC35237nrY = c35298nsg.EZpvd;
            if (interfaceC35237nrY != null) {
                java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                interfaceC35237nrY.copydefault(0, message, thM7380exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        java.io.File fileDjBIcL = djBIcL();
        C35292nsa c35292nsa = this.AEQbTJ;
        if (c35292nsa != null) {
            c35292nsa.OLrzqt(fileDjBIcL, new Function0() { // from class: o.nsv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35298nsg.valueOf();
                }
            }, new Function1() { // from class: o.nsu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35298nsg.OLrzqt(this.EZpvd, (Result) obj);
                }
            });
        }
    }

    public static final Unit valueOf() {
        pUU.KWHzl("OKIMCameraView", "Recording started");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C35298nsg c35298nsg, Result result) {
        java.lang.Object objM7386unboximpl = result.m7386unboximpl();
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl == null) {
            kotlin.Pair pair = (kotlin.Pair) objM7386unboximpl;
            java.io.File file = (java.io.File) pair.component1();
            long jLongValue = ((java.lang.Number) pair.component2()).longValue();
            if (jLongValue < TooltipKt.TooltipDuration) {
                file.delete();
            } else {
                c35298nsg.fetchVPNInfo = file;
                c35298nsg.valueOf = jLongValue;
                c35298nsg.AuCTel().EZpvd();
                c35298nsg.EZpvd(file);
            }
        } else {
            pUU.AEQbTJ("OKIMCameraView", "Video recording failed", thM7380exceptionOrNullimpl);
            InterfaceC35237nrY interfaceC35237nrY = c35298nsg.EZpvd;
            if (interfaceC35237nrY != null) {
                java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                interfaceC35237nrY.copydefault(0, message, thM7380exceptionOrNullimpl);
            }
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        final InterfaceC35237nrY interfaceC35237nrY = this.EZpvd;
        if (interfaceC35237nrY != null) {
            interfaceC35237nrY.OLrzqt(new Function0() { // from class: o.nsl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35298nsg.EZpvd(this.copydefault, interfaceC35237nrY);
                }
            }, new Function0() { // from class: o.nsq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35298nsg.AEQbTJ();
                }
            });
            return;
        }
        if (this.fetchVPNInfo != null) {
            AkhnZx();
            OLrzqt(this.fetchVPNInfo);
        } else if (this.AhwBna != null) {
            fJNWhG().setVisibility(4);
            OLrzqt(this.AhwBna);
        }
    }

    public static final Unit EZpvd(C35298nsg c35298nsg, InterfaceC35237nrY interfaceC35237nrY) {
        if (c35298nsg.fetchVPNInfo != null) {
            c35298nsg.AkhnZx();
            java.io.File file = c35298nsg.fetchVPNInfo;
            Intrinsics.copydefault(file);
            interfaceC35237nrY.EZpvd(file, c35298nsg.valueOf);
            c35298nsg.OLrzqt(c35298nsg.fetchVPNInfo);
        } else if (c35298nsg.AhwBna != null) {
            c35298nsg.fJNWhG().setVisibility(4);
            java.io.File file2 = c35298nsg.AhwBna;
            Intrinsics.copydefault(file2);
            interfaceC35237nrY.OLrzqt(file2);
            c35298nsg.OLrzqt(c35298nsg.AhwBna);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        pUU.KWHzl("OKIMCameraView", "Confirm cancelled by listener");
        return Unit.INSTANCE;
    }

    public final void copydefault(java.io.File file) {
        android.content.Context context = getContext();
        android.app.Activity activity = null;
        android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity2 != null) {
            if (!activity2.isDestroyed() && !activity2.isFinishing()) {
                activity = activity2;
            }
            if (activity != null) {
                Glide.AEQbTJ(getContext()).OLrzqt(file).EZpvd(fJNWhG());
            }
        }
        fJNWhG().setVisibility(0);
    }

    public final void EZpvd(java.io.File file) {
        ejfBZ().setVisibility(0);
        if (ejfBZ().isAvailable()) {
            AEQbTJ(file, new Function0() { // from class: o.nsi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35298nsg.gEmmrt(this.AEQbTJ);
                }
            });
        } else {
            ejfBZ().setSurfaceTextureListener(new StateListAnimator(file));
        }
    }

    public static final Unit gEmmrt(C35298nsg c35298nsg) {
        c35298nsg.fIwbmz().setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.nsg$StateListAnimator */
    public static final class StateListAnimator implements TextureView.SurfaceTextureListener {
        public final /* synthetic */ java.io.File KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
        }

        public StateListAnimator(java.io.File file) {
            this.KWHzl = file;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "");
            final C35298nsg c35298nsg = C35298nsg.this;
            c35298nsg.AEQbTJ(this.KWHzl, (Function0<Unit>) new Function0() { // from class: o.nst
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35298nsg.StateListAnimator.copydefault(c35298nsg);
                }
            });
        }

        public static final Unit copydefault(C35298nsg c35298nsg) {
            c35298nsg.fIwbmz().setVisibility(8);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(java.io.File file, final Function0<Unit> function0) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.setSurface(new android.view.Surface(ejfBZ().getSurfaceTexture()));
            mediaPlayer.setLooping(true);
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o.nse
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    C35298nsg.OLrzqt(this.AEQbTJ, function0, mediaPlayer2);
                }
            });
            mediaPlayer.prepareAsync();
            this.AYXKKw = mediaPlayer;
        } catch (java.io.IOException e) {
            pUU.AEQbTJ("OKIMCameraView", "Failed to play video", e);
        }
    }

    public static final void OLrzqt(C35298nsg c35298nsg, Function0 function0, MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        float videoWidth = mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight();
        int width = c35298nsg.ejfBZ().getWidth();
        ViewGroup.LayoutParams layoutParams = c35298nsg.ejfBZ().getLayoutParams();
        layoutParams.height = (int) (width / videoWidth);
        c35298nsg.ejfBZ().setLayoutParams(layoutParams);
        function0.invoke();
    }

    public final void AkhnZx() {
        MediaPlayer mediaPlayer = this.AYXKKw;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        this.AYXKKw = null;
        ejfBZ().setVisibility(8);
    }

    public final void DbNXlk() {
        C35292nsa c35292nsa = this.AEQbTJ;
        if (c35292nsa != null && c35292nsa.gEmmrt()) {
            C35292nsa c35292nsa2 = this.AEQbTJ;
            if (c35292nsa2 != null) {
                c35292nsa2.djBIcL();
            }
            java.io.File file = this.fetchVPNInfo;
            if (file != null) {
                file.delete();
            }
            this.fetchVPNInfo = null;
        } else if (this.AhwBna != null) {
            fJNWhG().setVisibility(4);
            java.io.File file2 = this.AhwBna;
            if (file2 != null) {
                file2.delete();
            }
            this.AhwBna = null;
        }
        fIwbmz().setVisibility(0);
        AuCTel().AEQbTJ();
    }

    public final void OLrzqt(java.io.File file) {
        if (file == null) {
            return;
        }
        MediaScannerConnection.scanFile(getContext(), new java.lang.String[]{file.getAbsolutePath()}, new java.lang.String[]{android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(yFL.fetchVPNInfo(file))}, null);
    }

    public final java.io.File AhwBna() {
        java.io.File externalFilesDir = getContext().getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            externalFilesDir = getContext().getFilesDir();
        }
        return new java.io.File(externalFilesDir, java.lang.System.currentTimeMillis() + ".jpeg");
    }

    public final java.io.File djBIcL() {
        java.io.File externalFilesDir = getContext().getExternalFilesDir(android.os.Environment.DIRECTORY_MOVIES);
        if (externalFilesDir == null) {
            externalFilesDir = getContext().getFilesDir();
        }
        return new java.io.File(externalFilesDir, java.lang.System.currentTimeMillis() + ".mp4");
    }

    public final void setBindToLifecycle(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C35292nsa c35292nsa = new C35292nsa(context, lifecycleOwner, fIwbmz());
        this.AEQbTJ = c35292nsa;
        c35292nsa.AEQbTJ(new Function0() { // from class: o.nsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35298nsg.KWHzl();
            }
        }, new Function1() { // from class: o.nsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35298nsg.EZpvd(this.KWHzl, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit KWHzl() {
        pUU.KWHzl("OKIMCameraView", "Camera ready");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C35298nsg c35298nsg, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        InterfaceC35237nrY interfaceC35237nrY = c35298nsg.EZpvd;
        if (interfaceC35237nrY != null) {
            java.lang.String message = exc.getMessage();
            if (message == null) {
                message = "Camera error";
            }
            interfaceC35237nrY.copydefault(0, message, exc);
        }
        return Unit.INSTANCE;
    }

    public final void setCaptureMode(@NotNull OKIMCaptureMode oKIMCaptureMode) {
        Intrinsics.checkNotNullParameter(oKIMCaptureMode, "");
        AuCTel().setCaptureMode(oKIMCaptureMode);
    }

    public final void setRecordVideoMaxTime(int i) {
        AuCTel().setDuration(i * 1000);
    }

    public final void values() {
        C35292nsa c35292nsa = this.AEQbTJ;
        if (c35292nsa != null) {
            c35292nsa.AhwBna();
        }
    }

    public final void AYXKKw() {
        AkhnZx();
        C35292nsa c35292nsa = this.AEQbTJ;
        if (c35292nsa != null) {
            c35292nsa.AYXKKw();
        }
        this.AEQbTJ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AYXKKw();
    }
}
