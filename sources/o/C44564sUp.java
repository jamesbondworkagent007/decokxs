package o;

import android.os.Build;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.WindowManager;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.video.VideoListener;
import com.okinc.oklive.app.domain.model.sdk.VeLivePlayerFormat;
import com.okinc.oklive.app.domain.model.sdk.VeLivePlayerResolution;
import com.okinc.oklive.app.ui.floatingwindow.LiveFloatingWindowManager$resumeLiveActivity$2;
import com.okinc.oklive.app.ui.list.displaymodel.LiveFloatingWindowUIState;
import com.okinc.oklive.app.ui.service.LiveFloatingWindowService;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C44564sUp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44564sUp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public sWs AEQbTJ;
    public LiveFloatingWindowUIState AYXKKw;
    public final StateFlow<java.lang.Boolean> AhwBna;
    public android.content.Context AkhnZx;
    public android.view.WindowManager DbNXlk;
    public C44561sUm EZpvd;
    public final MutableStateFlow<java.lang.Boolean> KWHzl;
    public SimpleExoPlayer OLrzqt;
    public InterfaceC44551sUc djBIcL;
    public android.view.View gEmmrt;
    public java.lang.Runnable valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> AYXKKw() {
        return this.AhwBna;
    }

    @yCM
    public C44564sUp() {
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.KWHzl = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: renamed from: o.sUp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final boolean valueOf() {
        return this.KWHzl.getValue().booleanValue();
    }

    public final void EZpvd(boolean z) {
        this.KWHzl.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o.sUp$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C44564sUp AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C44564sUp c44564sUp) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c44564sUp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.EZpvd("LiveFloatingWindowManager", "Enlarge button clicked");
                this.AEQbTJ.gEmmrt();
                LiveFloatingWindowService.TaskDescription taskDescription = LiveFloatingWindowService.Companion;
                android.content.Context context = this.AEQbTJ.AkhnZx;
                if (context == null) {
                    Intrinsics.gEmmrt("");
                    context = null;
                }
                taskDescription.EZpvd(context);
            }
        }
    }

    /* JADX INFO: renamed from: o.sUp$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C44564sUp KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C44564sUp c44564sUp) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c44564sUp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                pUU.EZpvd("LiveFloatingWindowManager", "Close button clicked");
                LiveFloatingWindowService.TaskDescription taskDescription = LiveFloatingWindowService.Companion;
                android.content.Context context = this.KWHzl.AkhnZx;
                if (context == null) {
                    Intrinsics.gEmmrt("");
                    context = null;
                }
                taskDescription.EZpvd(context);
            }
        }
    }

    public final void AEQbTJ(@NotNull android.content.Context context, @NotNull LiveFloatingWindowUIState liveFloatingWindowUIState) {
        android.widget.FrameLayout root;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(liveFloatingWindowUIState, "");
        if (valueOf()) {
            pUU.valueOf("LiveFloatingWindowManager", "Floating window already shown, skipping");
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        this.AkhnZx = applicationContext;
        try {
            this.AYXKKw = liveFloatingWindowUIState;
            pUU.EZpvd("LiveFloatingWindowManager", "Showing floating window (uiState=" + liveFloatingWindowUIState + ")");
            java.lang.Object systemService = applicationContext.getSystemService("window");
            Intrinsics.copydefault(systemService, "");
            this.DbNXlk = (android.view.WindowManager) systemService;
            sWs swsAEQbTJ = sWs.AEQbTJ(android.view.LayoutInflater.from(applicationContext));
            this.AEQbTJ = swsAEQbTJ;
            this.gEmmrt = swsAEQbTJ != null ? swsAEQbTJ.getRoot() : null;
            Intrinsics.copydefault(applicationContext);
            WindowManager.LayoutParams layoutParamsOLrzqt = OLrzqt(applicationContext);
            OLrzqt(applicationContext, layoutParamsOLrzqt);
            djBIcL();
            DbNXlk();
            if (liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.LiveStream) {
                OLrzqt(applicationContext, (LiveFloatingWindowUIState.LiveStream) liveFloatingWindowUIState);
            } else {
                if (!(liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.Recording)) {
                    throw new NoWhenBranchMatchedException();
                }
                KWHzl((LiveFloatingWindowUIState.Recording) liveFloatingWindowUIState);
            }
            KWHzl(liveFloatingWindowUIState);
            sWs sws = this.AEQbTJ;
            if (sws != null && (root = sws.getRoot()) != null) {
                android.view.WindowManager windowManager = this.DbNXlk;
                if (windowManager != null) {
                    windowManager.addView(root, layoutParamsOLrzqt);
                }
                pUU.EZpvd("LiveFloatingWindowManager", "View added to WindowManager after player initialization");
            }
            EZpvd(true);
            pUU.EZpvd("LiveFloatingWindowManager", "Floating window shown successfully");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to show floating window - window will not be created", e);
            EZpvd(false);
            KWHzl();
        }
    }

    public final void OLrzqt(android.content.Context context, WindowManager.LayoutParams layoutParams) {
        android.widget.FrameLayout root;
        sWs sws = this.AEQbTJ;
        if (sws == null || (root = sws.getRoot()) == null) {
            return;
        }
        C44561sUm c44561sUm = this.EZpvd;
        if (c44561sUm != null) {
            c44561sUm.AEQbTJ();
        }
        android.view.WindowManager windowManager = this.DbNXlk;
        Intrinsics.copydefault(windowManager);
        this.EZpvd = new C44561sUm(context, windowManager);
        int i = (int) (((double) context.getResources().getDisplayMetrics().density) * 213.3d);
        C44561sUm c44561sUm2 = this.EZpvd;
        if (c44561sUm2 != null) {
            c44561sUm2.AEQbTJ(root, layoutParams, i);
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Drag listener setup complete");
    }

    public final void AEQbTJ() {
        if (!valueOf()) {
            pUU.valueOf("LiveFloatingWindowManager", "Floating window not shown, skipping hide");
            return;
        }
        EZpvd(false);
        pUU.EZpvd("LiveFloatingWindowManager", "Hiding floating window");
        try {
            android.view.View view = this.gEmmrt;
            if (view == null || this.DbNXlk == null || view == null || !view.isAttachedToWindow()) {
                pUU.valueOf("LiveFloatingWindowManager", "View not attached to window or references are null");
            } else {
                android.view.WindowManager windowManager = this.DbNXlk;
                if (windowManager != null) {
                    windowManager.removeView(this.gEmmrt);
                }
            }
            KWHzl();
        } catch (java.lang.IllegalArgumentException e) {
            pUU.OLrzqt("LiveFloatingWindowManager", "View was not attached to window manager", e);
            KWHzl();
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to hide floating window", e2);
            KWHzl();
        }
    }

    public final void AhwBna() {
        android.widget.ProgressBar progressBar;
        sWs sws = this.AEQbTJ;
        if (sws != null && (progressBar = sws.OLrzqt) != null) {
            progressBar.setVisibility(0);
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Loading indicator shown (recording playback)");
    }

    public final void OLrzqt() {
        android.widget.ProgressBar progressBar;
        sWs sws = this.AEQbTJ;
        if (sws != null && (progressBar = sws.OLrzqt) != null) {
            progressBar.setVisibility(8);
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Loading indicator hidden (recording playback)");
    }

    public final void DbNXlk() {
        android.view.View view;
        sWs sws = this.AEQbTJ;
        if (sws != null && (view = sws.AEQbTJ) != null) {
            view.setVisibility(0);
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Shutter view shown");
    }

    public final void EZpvd() {
        android.view.View view;
        sWs sws = this.AEQbTJ;
        if (sws != null && (view = sws.AEQbTJ) != null) {
            view.setVisibility(8);
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Shutter view hidden");
    }

    public final void djBIcL() {
        sWs sws = this.AEQbTJ;
        if (sws != null) {
            android.widget.ImageView imageView = sws.copydefault;
            imageView.setOnClickListener(new Application(imageView, 1000L, this));
            android.widget.ImageView imageView2 = sws.KWHzl;
            imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this));
        }
    }

    public final void gEmmrt() {
        LiveFloatingWindowUIState liveFloatingWindowUIState = this.AYXKKw;
        java.lang.String strEZpvd = liveFloatingWindowUIState != null ? liveFloatingWindowUIState.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            pUU.copydefault("LiveFloatingWindowManager", "resumeLiveActivity: shareCode is null or empty, cannot resume");
            return;
        }
        try {
            pUU.EZpvd("LiveFloatingWindowManager", "resumeLiveActivity: navigating with shareCode=" + strEZpvd);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("IS_MUTED", java.lang.Boolean.valueOf(liveFloatingWindowUIState.OLrzqt()));
            if (liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.Recording) {
                SimpleExoPlayer simpleExoPlayer = this.OLrzqt;
                linkedHashMap.put("RECORDING_POSITION", java.lang.Long.valueOf(simpleExoPlayer != null ? simpleExoPlayer.getCurrentPosition() : 0L));
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new LiveFloatingWindowManager$resumeLiveActivity$2(this, strEZpvd, liveFloatingWindowUIState, linkedHashMap, null), 3, null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "resumeLiveActivity: Failed to navigate", e);
        }
    }

    public final void OLrzqt(android.content.Context context, LiveFloatingWindowUIState.LiveStream liveStream) {
        if (this.djBIcL != null) {
            pUU.EZpvd("LiveFloatingWindowManager", "VeLivePlayer already initialized in floating window");
            return;
        }
        try {
            pUU.EZpvd("LiveFloatingWindowManager", "Initializing VeLivePlayer for floating window...");
            InterfaceC44560sUl interfaceC44560sUl = (InterfaceC44560sUl) C43251rlk.OLrzqt(InterfaceC44560sUl.class);
            if (interfaceC44560sUl == null) {
                pUU.copydefault("LiveFloatingWindowManager", "OKLiveService not available, cannot initialize player");
                return;
            }
            this.djBIcL = interfaceC44560sUl.EZpvd(context);
            java.lang.Object objCopydefault = interfaceC44560sUl.copydefault(false, false, 1);
            InterfaceC44551sUc interfaceC44551sUc = this.djBIcL;
            if (interfaceC44551sUc != null) {
                interfaceC44551sUc.KWHzl(objCopydefault);
            }
            InterfaceC44551sUc interfaceC44551sUc2 = this.djBIcL;
            if (interfaceC44551sUc2 != null) {
                interfaceC44551sUc2.EZpvd(interfaceC44560sUl.copydefault(copydefault()));
            }
            AEQbTJ(liveStream);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to initialize VeLivePlayer for floating window", e);
        }
    }

    public final void KWHzl(LiveFloatingWindowUIState liveFloatingWindowUIState) {
        android.view.SurfaceView surfaceView;
        android.view.SurfaceHolder holder;
        boolean z = liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.LiveStream;
        sWs sws = this.AEQbTJ;
        if (sws == null || (surfaceView = sws.AhwBna) == null || (holder = surfaceView.getHolder()) == null) {
            return;
        }
        holder.setFormat(1);
        holder.addCallback(new PendingIntent(z, this));
        android.view.Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            pUU.EZpvd("LiveFloatingWindowManager", "Surface already available, setting player surface immediately");
            if (z) {
                InterfaceC44551sUc interfaceC44551sUc = this.djBIcL;
                if (interfaceC44551sUc != null) {
                    interfaceC44551sUc.AEQbTJ(holder);
                    return;
                }
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.OLrzqt;
            if (simpleExoPlayer != null) {
                sWs sws2 = this.AEQbTJ;
                simpleExoPlayer.setVideoSurfaceView(sws2 != null ? sws2.AhwBna : null);
                return;
            }
            return;
        }
        pUU.EZpvd("LiveFloatingWindowManager", "Surface not yet available, will be set when surface is created");
    }

    /* JADX INFO: renamed from: o.sUp$PendingIntent */
    public static final class PendingIntent implements SurfaceHolder.Callback {
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ C44564sUp KWHzl;

        public PendingIntent(boolean z, C44564sUp c44564sUp) {
            this.EZpvd = z;
            this.KWHzl = c44564sUp;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            Intrinsics.checkNotNullParameter(surfaceHolder, "");
            pUU.EZpvd("LiveFloatingWindowManager", "Floating window surface created");
            android.view.Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            if (this.EZpvd) {
                InterfaceC44551sUc interfaceC44551sUc = this.KWHzl.djBIcL;
                if (interfaceC44551sUc != null) {
                    interfaceC44551sUc.AEQbTJ(surfaceHolder);
                    return;
                }
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.KWHzl.OLrzqt;
            if (simpleExoPlayer != null) {
                sWs sws = this.KWHzl.AEQbTJ;
                simpleExoPlayer.setVideoSurfaceView(sws != null ? sws.AhwBna : null);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            InterfaceC44551sUc interfaceC44551sUc;
            Intrinsics.checkNotNullParameter(surfaceHolder, "");
            pUU.EZpvd("LiveFloatingWindowManager", "Floating window surface changed: " + i2 + "x" + i3);
            android.view.Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid() || !this.EZpvd || (interfaceC44551sUc = this.KWHzl.djBIcL) == null) {
                return;
            }
            interfaceC44551sUc.AEQbTJ(surfaceHolder);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            Intrinsics.checkNotNullParameter(surfaceHolder, "");
            pUU.EZpvd("LiveFloatingWindowManager", "Floating window surface destroyed");
            if (this.EZpvd) {
                InterfaceC44551sUc interfaceC44551sUc = this.KWHzl.djBIcL;
                if (interfaceC44551sUc != null) {
                    interfaceC44551sUc.AEQbTJ(null);
                    return;
                }
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.KWHzl.OLrzqt;
            if (simpleExoPlayer != null) {
                sWs sws = this.KWHzl.AEQbTJ;
                simpleExoPlayer.clearVideoSurfaceView(sws != null ? sws.AhwBna : null);
            }
        }
    }

    /* JADX INFO: renamed from: o.sUp$Activity */
    public static final class Activity implements InterfaceC44549sUa {
        @Override // o.InterfaceC44549sUa
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC44549sUa
        public void AEQbTJ(long j) {
        }

        @Override // o.InterfaceC44549sUa
        public void AEQbTJ(android.graphics.Bitmap bitmap) {
        }

        @Override // o.InterfaceC44549sUa
        public void AEQbTJ(VeLivePlayerResolution veLivePlayerResolution, java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        }

        @Override // o.InterfaceC44549sUa
        public void EZpvd() {
        }

        @Override // o.InterfaceC44549sUa
        public void EZpvd(java.lang.Integer num, java.lang.String str) {
        }

        @Override // o.InterfaceC44549sUa
        public void KWHzl() {
        }

        @Override // o.InterfaceC44549sUa
        public void KWHzl(int i, int i2) {
        }

        @Override // o.InterfaceC44549sUa
        public void KWHzl(java.lang.Integer num, java.lang.String str) {
        }

        @Override // o.InterfaceC44549sUa
        public void KWHzl(java.lang.String str) {
        }

        @Override // o.InterfaceC44549sUa
        public void KWHzl(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        }

        @Override // o.InterfaceC44549sUa
        public void OLrzqt() {
        }

        @Override // o.InterfaceC44549sUa
        public void OLrzqt(long j) {
        }

        @Override // o.InterfaceC44549sUa
        public void copydefault(float f, long j, int i, int i2, java.lang.String str, long j2, long j3) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC44549sUa
        public void copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        public Activity() {
        }

        @Override // o.InterfaceC44549sUa
        public void OLrzqt(int i, java.lang.String str) {
            pUU.copydefault("LiveFloatingWindowManager", "Floating window player error: " + str);
        }

        @Override // o.InterfaceC44549sUa
        public void OLrzqt(boolean z) {
            android.widget.FrameLayout root;
            if (z) {
                pUU.EZpvd("LiveFloatingWindowManager", "First video frame rendered in floating window");
                sWs sws = C44564sUp.this.AEQbTJ;
                if (sws == null || (root = sws.getRoot()) == null) {
                    return;
                }
                final C44564sUp c44564sUp = C44564sUp.this;
                root.post(new java.lang.Runnable() { // from class: o.sUo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C44564sUp.Activity.AEQbTJ(c44564sUp);
                    }
                });
            }
        }

        public static final void AEQbTJ(C44564sUp c44564sUp) {
            c44564sUp.EZpvd();
        }

        @Override // o.InterfaceC44549sUa
        public void copydefault(boolean z) {
            LiveFloatingWindowUIState liveFloatingWindowUIState = C44564sUp.this.AYXKKw;
            LiveFloatingWindowUIState.LiveStream liveStream = liveFloatingWindowUIState instanceof LiveFloatingWindowUIState.LiveStream ? (LiveFloatingWindowUIState.LiveStream) liveFloatingWindowUIState : null;
            if (liveStream != null) {
                InterfaceC44551sUc interfaceC44551sUc = C44564sUp.this.djBIcL;
                if (interfaceC44551sUc != null) {
                    interfaceC44551sUc.OLrzqt(liveStream.OLrzqt() ? 0.0f : 1.0f);
                }
                pUU.EZpvd("LiveFloatingWindowManager", "Re-applied mute state after first frame: isMuted=" + liveStream.OLrzqt());
            }
        }
    }

    public final InterfaceC44549sUa copydefault() {
        return new Activity();
    }

    public final void AEQbTJ(LiveFloatingWindowUIState.LiveStream liveStream) {
        try {
            VeLivePlayerFormat veLivePlayerFormatCopydefault = sTC.KWHzl.copydefault(liveStream.KWHzl());
            pUU.EZpvd("LiveFloatingWindowManager", "Starting live stream in floating window: url=" + liveStream.KWHzl() + ", format=" + veLivePlayerFormatCopydefault);
            InterfaceC44560sUl interfaceC44560sUl = (InterfaceC44560sUl) C43251rlk.OLrzqt(InterfaceC44560sUl.class);
            if (interfaceC44560sUl == null) {
                pUU.copydefault("LiveFloatingWindowManager", "OKLiveService not available, cannot start stream");
                return;
            }
            java.lang.Object objCopydefault = interfaceC44560sUl.copydefault(liveStream.KWHzl(), veLivePlayerFormatCopydefault);
            InterfaceC44551sUc interfaceC44551sUc = this.djBIcL;
            if (interfaceC44551sUc != null) {
                interfaceC44551sUc.copydefault(objCopydefault);
            }
            InterfaceC44551sUc interfaceC44551sUc2 = this.djBIcL;
            if (interfaceC44551sUc2 != null) {
                interfaceC44551sUc2.copydefault();
            }
            pUU.EZpvd("LiveFloatingWindowManager", "Live stream started successfully in floating window");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to start live stream in floating window", e);
        }
    }

    public final void KWHzl(LiveFloatingWindowUIState.Recording recording) {
        AhwBna();
        if (this.AEQbTJ != null) {
            try {
                SimpleExoPlayer simpleExoPlayer = this.OLrzqt;
                if (simpleExoPlayer != null) {
                    simpleExoPlayer.release();
                }
                android.content.Context context = this.AkhnZx;
                if (context == null) {
                    Intrinsics.gEmmrt("");
                    context = null;
                }
                SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(context).build();
                MediaItem mediaItemFromUri = MediaItem.fromUri(recording.AYXKKw());
                Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "");
                simpleExoPlayerBuild.setMediaItem(mediaItemFromUri);
                simpleExoPlayerBuild.setVolume(recording.OLrzqt() ? 0.0f : 1.0f);
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer volume set: " + (recording.OLrzqt() ? "muted" : "unmuted"));
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer ready, duration=" + simpleExoPlayerBuild.getDuration() + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                if (recording.KWHzl() > 0) {
                    simpleExoPlayerBuild.seekTo(recording.KWHzl());
                    pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer seeked to saved position: " + recording.KWHzl() + " ms");
                }
                simpleExoPlayerBuild.addListener(new StateListAnimator());
                simpleExoPlayerBuild.addVideoListener(new LoaderManager());
                simpleExoPlayerBuild.prepare();
                simpleExoPlayerBuild.setPlayWhenReady(true);
                this.OLrzqt = simpleExoPlayerBuild;
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer setup complete, preparing...");
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to setup ExoPlayer", e);
                AhwBna();
                SimpleExoPlayer simpleExoPlayer2 = this.OLrzqt;
                if (simpleExoPlayer2 != null) {
                    simpleExoPlayer2.release();
                }
                this.OLrzqt = null;
            }
        }
    }

    /* JADX INFO: renamed from: o.sUp$StateListAnimator */
    public static final class StateListAnimator implements Player.EventListener {
        public StateListAnimator() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 1) {
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer idle");
                return;
            }
            if (i == 2) {
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer buffering");
                C44564sUp.this.AhwBna();
            } else if (i == 3) {
                C44564sUp.this.OLrzqt();
            } else {
                if (i != 4) {
                    return;
                }
                pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer playback ended");
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            pUU.AEQbTJ("LiveFloatingWindowManager", "ExoPlayer error: " + exoPlaybackException.getMessage(), exoPlaybackException);
            C44564sUp.this.AhwBna();
        }
    }

    /* JADX INFO: renamed from: o.sUp$LoaderManager */
    public static final class LoaderManager implements VideoListener {
        public LoaderManager() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            android.widget.FrameLayout root;
            pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer first frame rendered");
            C44564sUp.this.OLrzqt();
            final C44564sUp c44564sUp = C44564sUp.this;
            c44564sUp.valueOf = new java.lang.Runnable() { // from class: o.sUr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C44564sUp.LoaderManager.KWHzl(c44564sUp);
                }
            };
            sWs sws = C44564sUp.this.AEQbTJ;
            if (sws == null || (root = sws.getRoot()) == null) {
                return;
            }
            root.postDelayed(C44564sUp.this.valueOf, 200L);
        }

        public static final void KWHzl(C44564sUp c44564sUp) {
            c44564sUp.EZpvd();
        }
    }

    public final WindowManager.LayoutParams OLrzqt(android.content.Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (((double) f) * 213.3d);
        int i2 = (int) (120 * f);
        int i3 = (int) (24 * f);
        int i4 = (int) (4 * f);
        int i5 = Build.VERSION.SDK_INT >= 26 ? 2038 : MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED;
        pUU.EZpvd("LiveFloatingWindowManager", "Creating window params with flags for lock screen support: NOT_FOCUSABLE | LAYOUT_NO_LIMITS | KEEP_SCREEN_ON | SHOW_WHEN_LOCKED");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i, i2, i5, 524936, -3);
        layoutParams.gravity = 8388693;
        layoutParams.x = i4;
        layoutParams.y = i3;
        return layoutParams;
    }

    public final void KWHzl() {
        android.widget.FrameLayout root;
        android.widget.FrameLayout root2;
        pUU.EZpvd("LiveFloatingWindowManager", "Floating window is cleaning up");
        java.lang.Runnable runnable = this.valueOf;
        if (runnable != null) {
            sWs sws = this.AEQbTJ;
            if (sws != null && (root2 = sws.getRoot()) != null) {
                root2.removeCallbacks(runnable);
            }
            this.valueOf = null;
        }
        sWs sws2 = this.AEQbTJ;
        if (sws2 != null && (root = sws2.getRoot()) != null) {
            root.setVisibility(8);
        }
        try {
            InterfaceC44551sUc interfaceC44551sUc = this.djBIcL;
            if (interfaceC44551sUc != null) {
                interfaceC44551sUc.EZpvd();
            }
            InterfaceC44551sUc interfaceC44551sUc2 = this.djBIcL;
            if (interfaceC44551sUc2 != null) {
                interfaceC44551sUc2.AEQbTJ();
            }
            this.djBIcL = null;
            pUU.EZpvd("LiveFloatingWindowManager", "VeLivePlayer released");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to release VeLivePlayer", e);
        }
        try {
            SimpleExoPlayer simpleExoPlayer = this.OLrzqt;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.release();
            }
            this.OLrzqt = null;
            pUU.EZpvd("LiveFloatingWindowManager", "ExoPlayer released");
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("LiveFloatingWindowManager", "Failed to release ExoPlayer", e2);
        }
        C44561sUm c44561sUm = this.EZpvd;
        if (c44561sUm != null) {
            c44561sUm.AEQbTJ();
        }
        this.EZpvd = null;
        this.AEQbTJ = null;
        this.gEmmrt = null;
        this.DbNXlk = null;
        this.AYXKKw = null;
    }
}
