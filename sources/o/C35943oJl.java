package o;

import android.view.View;
import android.widget.SeekBar;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35943oJl extends android.widget.FrameLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final C34029nOu AEQbTJ;
    public boolean AYXKKw;
    public Function0<Unit> AhwBna;
    public final java.lang.StringBuilder AkhnZx;
    public final LoaderManager DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public final java.lang.Runnable copydefault;
    public Function1<? super ExoPlaybackException, Unit> djBIcL;
    public java.lang.String ejfBZ;
    public final StateListAnimator fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public Activity isConnected;
    public SimpleExoPlayer valueOf;
    public final java.util.Formatter values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35943oJl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35943oJl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.google.android.exoplayer2.ExoPlaybackException, kotlin.Unit>, kotlin.jvm.functions.Function1<com.google.android.exoplayer2.ExoPlaybackException, kotlin.Unit> */
    public final Function1<ExoPlaybackException, Unit> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCompletionListener(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnErrorListener(Function1<? super ExoPlaybackException, Unit> function1) {
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPreparedListener(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.oJl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35943oJl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35943oJl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C34029nOu c34029nOuAEQbTJ = C34029nOu.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c34029nOuAEQbTJ, "");
        this.AEQbTJ = c34029nOuAEQbTJ;
        this.isConnected = new Activity(0L, false, 3, null);
        this.EZpvd = true;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.AkhnZx = sb;
        this.values = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.DbNXlk = new LoaderManager();
        this.copydefault = new java.lang.Runnable() { // from class: o.oJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C35943oJl.AhwBna(this.KWHzl);
            }
        };
        this.fetchVPNInfo = new StateListAnimator();
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.zblBkD);
        c34029nOuAEQbTJ.fetchVPNInfo.setColorFilter(iCopydefault);
        c34029nOuAEQbTJ.AEQbTJ.setColorFilter(iCopydefault);
        setupClickListeners();
        setupSeekBar();
    }

    /* JADX INFO: renamed from: o.oJl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oJl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final android.widget.ImageView KWHzl() {
        android.widget.ImageView imageView = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        return imageView;
    }

    /* JADX INFO: renamed from: o.oJl$Activity */
    public static final class Activity {
        public final long EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(0L, false, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, long j, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                z = activity.OLrzqt;
            }
            return activity.OLrzqt(j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(long j, boolean z) {
            return new Activity(j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.EZpvd == activity.EZpvd && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Long.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlaybackState(position=" + this.EZpvd + ", wasPlaying=" + this.OLrzqt + ")";
        }

        public Activity(long j, boolean z) {
            this.EZpvd = j;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(long, boolean):void (m)] (LINE:73) call: o.oJl.Activity.<init>(long, boolean):void type: THIS */
        public /* synthetic */ Activity(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.oJl$LoaderManager */
    public static final class LoaderManager implements java.lang.Runnable {
        public LoaderManager() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35943oJl.this.AkhnZx();
            SimpleExoPlayer simpleExoPlayer = C35943oJl.this.valueOf;
            if (simpleExoPlayer == null || !simpleExoPlayer.isPlaying()) {
                return;
            }
            C35943oJl.this.postDelayed(this, 1000L);
        }
    }

    public static final void AhwBna(C35943oJl c35943oJl) {
        SimpleExoPlayer simpleExoPlayer = c35943oJl.valueOf;
        if (simpleExoPlayer == null || !simpleExoPlayer.isPlaying()) {
            return;
        }
        c35943oJl.EZpvd(false);
    }

    /* JADX INFO: renamed from: o.oJl$StateListAnimator */
    public static final class StateListAnimator implements Player.EventListener {
        public StateListAnimator() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i) {
            java.lang.String str;
            if (i == 1) {
                str = "IDLE";
            } else if (i == 2) {
                str = "BUFFERING";
            } else if (i == 3) {
                str = "READY";
            } else if (i != 4) {
                str = "UNKNOWN(" + i + ")";
            } else {
                str = "ENDED";
            }
            java.lang.String str2 = C35943oJl.this.ejfBZ;
            pUU.EZpvd("OKIMVideoPlayer", "onPlaybackStateChanged: " + str + ", url=" + (str2 != null ? C59454zhO.isConnected(str2, 30) : null));
            if (i == 2) {
                android.widget.ProgressBar progressBar = C35943oJl.this.AEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(progressBar, "");
                progressBar.setVisibility(0);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                C35943oJl.this.KWHzl(false);
                C35943oJl.this.EZpvd(true);
                C35943oJl.this.OLrzqt();
                C35943oJl.this.AEQbTJ.copydefault.setProgress(100);
                Function0<Unit> function0EZpvd = C35943oJl.this.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                    return;
                }
                return;
            }
            android.widget.ProgressBar progressBar2 = C35943oJl.this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "");
            progressBar2.setVisibility(4);
            android.widget.ImageView imageView = C35943oJl.this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(4);
            C35943oJl.this.EZpvd(true);
            android.widget.TextView textView = C35943oJl.this.AEQbTJ.isConnected;
            C35943oJl c35943oJl = C35943oJl.this;
            SimpleExoPlayer simpleExoPlayer = c35943oJl.valueOf;
            textView.setText(c35943oJl.OLrzqt(simpleExoPlayer != null ? simpleExoPlayer.getDuration() : 0L));
            Function0<Unit> function0Copydefault = C35943oJl.this.copydefault();
            if (function0Copydefault != null) {
                function0Copydefault.invoke();
            }
            if (C35943oJl.this.AYXKKw) {
                pUU.EZpvd("OKIMVideoPlayer", "onPlaybackStateChanged: STATE_READY with pendingResume, auto-playing");
                C35943oJl.this.AYXKKw = false;
                C35943oJl.this.gEmmrt();
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onIsPlayingChanged(boolean z) {
            java.lang.String str = C35943oJl.this.ejfBZ;
            pUU.EZpvd("OKIMVideoPlayer", "onIsPlayingChanged: isPlaying=" + z + ", url=" + (str != null ? C59454zhO.isConnected(str, 30) : null));
            C35943oJl.this.KWHzl(z);
            if (z) {
                C35943oJl c35943oJl = C35943oJl.this;
                c35943oJl.post(c35943oJl.DbNXlk);
                C35943oJl.this.values();
            } else {
                C35943oJl c35943oJl2 = C35943oJl.this;
                c35943oJl2.removeCallbacks(c35943oJl2.DbNXlk);
                C35943oJl.this.OLrzqt();
                C35943oJl.this.EZpvd(true);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            java.lang.String message = exoPlaybackException.getMessage();
            java.lang.String str = C35943oJl.this.ejfBZ;
            pUU.AEQbTJ("OKIMVideoPlayer", "onPlayerError: " + message + ", url=" + (str != null ? C59454zhO.isConnected(str, 30) : null), exoPlaybackException);
            android.widget.ProgressBar progressBar = C35943oJl.this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            progressBar.setVisibility(4);
            android.widget.ImageView imageView = C35943oJl.this.AEQbTJ.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(4);
            android.widget.FrameLayout frameLayout = C35943oJl.this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(4);
            android.widget.LinearLayout linearLayout = C35943oJl.this.AEQbTJ.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            Function1<ExoPlaybackException, Unit> function1AEQbTJ = C35943oJl.this.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(exoPlaybackException);
            }
        }
    }

    public final void setupClickListeners() {
        this.AEQbTJ.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.oJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35943oJl.setupClickListeners$lambda$1(this.KWHzl, view);
            }
        });
        this.AEQbTJ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oJo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35943oJl.setupClickListeners$lambda$2(this.OLrzqt, view);
            }
        });
        this.AEQbTJ.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.oJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35943oJl.setupClickListeners$lambda$4(this.EZpvd, view);
            }
        });
        this.AEQbTJ.values.setOnClickListener(new View.OnClickListener() { // from class: o.oJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.EZpvd.djBIcL();
            }
        });
        this.AEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.oJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.EZpvd.isConnected();
            }
        });
    }

    public static final void setupClickListeners$lambda$1(C35943oJl c35943oJl, android.view.View view) {
        c35943oJl.fetchVPNInfo();
        c35943oJl.values();
    }

    public static final void setupClickListeners$lambda$2(C35943oJl c35943oJl, android.view.View view) {
        c35943oJl.fetchVPNInfo();
        c35943oJl.values();
    }

    public static final void setupClickListeners$lambda$4(C35943oJl c35943oJl, android.view.View view) {
        android.widget.LinearLayout linearLayout = c35943oJl.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(4);
        java.lang.String str = c35943oJl.ejfBZ;
        if (str != null) {
            c35943oJl.setUp(str);
        }
    }

    public final void djBIcL() {
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer == null) {
            return;
        }
        if (simpleExoPlayer.isPlaying()) {
            if (this.EZpvd) {
                simpleExoPlayer.pause();
                OLrzqt();
                return;
            } else {
                isConnected();
                return;
            }
        }
        if (this.EZpvd) {
            EZpvd(false);
            simpleExoPlayer.play();
        } else {
            EZpvd(true);
        }
    }

    public final void isConnected() {
        EZpvd(true);
        values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        if (this.EZpvd == z) {
            return;
        }
        this.EZpvd = z;
        if (z) {
            android.widget.ImageView imageView = this.AEQbTJ.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            KWHzl(imageView);
            android.widget.FrameLayout frameLayout = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            KWHzl(frameLayout);
            return;
        }
        android.widget.ImageView imageView2 = this.AEQbTJ.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        EZpvd(imageView2);
        android.widget.FrameLayout frameLayout2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
        EZpvd(frameLayout2);
    }

    public final void KWHzl(android.view.View view) {
        view.animate().cancel();
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
    }

    public final void EZpvd(android.view.View view) {
        view.animate().cancel();
        if (view.getVisibility() != 0 || view.getAlpha() == 0.0f) {
            return;
        }
        view.animate().alpha(0.0f).setDuration(200L).setListener(new Application(view)).start();
    }

    /* JADX INFO: renamed from: o.oJl$Application */
    public static final class Application extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View copydefault;

        public Application(android.view.View view) {
            this.copydefault = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.copydefault.setVisibility(8);
        }
    }

    public final void values() {
        OLrzqt();
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer == null || !simpleExoPlayer.isPlaying()) {
            return;
        }
        postDelayed(this.copydefault, 2000L);
    }

    public final void OLrzqt() {
        removeCallbacks(this.copydefault);
    }

    /* JADX INFO: renamed from: o.oJl$ActionBar */
    public static final class ActionBar implements SeekBar.OnSeekBarChangeListener {
        public ActionBar() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            if (!z || C35943oJl.this.valueOf == null) {
                return;
            }
            SimpleExoPlayer simpleExoPlayer = C35943oJl.this.valueOf;
            C35943oJl.this.AEQbTJ.KWHzl.setText(C35943oJl.this.OLrzqt(((simpleExoPlayer != null ? simpleExoPlayer.getDuration() : 0L) * ((long) i)) / ((long) 100)));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            C35943oJl.this.KWHzl = true;
            C35943oJl.this.OLrzqt();
            C35943oJl c35943oJl = C35943oJl.this;
            c35943oJl.removeCallbacks(c35943oJl.DbNXlk);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            C35943oJl.this.KWHzl = false;
            int progress = seekBar != null ? seekBar.getProgress() : 0;
            SimpleExoPlayer simpleExoPlayer = C35943oJl.this.valueOf;
            long duration = ((simpleExoPlayer != null ? simpleExoPlayer.getDuration() : 0L) * ((long) progress)) / ((long) 100);
            SimpleExoPlayer simpleExoPlayer2 = C35943oJl.this.valueOf;
            if (simpleExoPlayer2 != null) {
                simpleExoPlayer2.seekTo(duration);
            }
            C35943oJl c35943oJl = C35943oJl.this;
            c35943oJl.post(c35943oJl.DbNXlk);
            C35943oJl.this.values();
        }
    }

    public final void setupSeekBar() {
        this.AEQbTJ.copydefault.setOnSeekBarChangeListener(new ActionBar());
    }

    public final void setUp(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strIsConnected = C59454zhO.isConnected(str, 50);
        java.lang.String str2 = this.ejfBZ;
        pUU.EZpvd("OKIMVideoPlayer", "setUp: url=" + strIsConnected + ", previousUrl=" + (str2 != null ? C59454zhO.isConnected(str2, 30) : null));
        this.ejfBZ = str;
        this.isConnected = new Activity(0L, false, 3, null);
        this.AYXKKw = false;
        AYXKKw();
        android.widget.ProgressBar progressBar = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(progressBar, "");
        progressBar.setVisibility(0);
        android.widget.ImageView imageView = this.AEQbTJ.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = this.AEQbTJ.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(4);
        android.widget.FrameLayout frameLayout = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(4);
        android.widget.LinearLayout linearLayout = this.AEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(4);
        this.EZpvd = false;
        createAndPreparePlayer$default(this, str, 0L, 2, null);
    }

    public static /* synthetic */ void createAndPreparePlayer$default(C35943oJl c35943oJl, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c35943oJl.EZpvd(str, j);
    }

    public final void EZpvd(java.lang.String str, long j) {
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(getContext()).build();
        this.AEQbTJ.AhwBna.setPlayer(simpleExoPlayerBuild);
        simpleExoPlayerBuild.addListener(this.fetchVPNInfo);
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        simpleExoPlayerBuild.setMediaItem(MediaItem.fromUri(uri));
        simpleExoPlayerBuild.prepare();
        if (j > 0) {
            simpleExoPlayerBuild.seekTo(j);
        }
        this.valueOf = simpleExoPlayerBuild;
    }

    public final void gEmmrt() {
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.play();
        }
    }

    public final void AhwBna() {
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            Activity activity = new Activity(simpleExoPlayer.getCurrentPosition(), simpleExoPlayer.isPlaying());
            this.isConnected = activity;
            long jEZpvd = activity.EZpvd();
            boolean zKWHzl = this.isConnected.KWHzl();
            java.lang.String str = this.ejfBZ;
            pUU.EZpvd("OKIMVideoPlayer", "pause: position=" + jEZpvd + ", wasPlaying=" + zKWHzl + ", url=" + (str != null ? C59454zhO.isConnected(str, 30) : null));
            simpleExoPlayer.pause();
            return;
        }
        java.lang.String str2 = this.ejfBZ;
        pUU.EZpvd("OKIMVideoPlayer", "pause: player is null, url=" + (str2 != null ? C59454zhO.isConnected(str2, 30) : null));
    }

    public final void DbNXlk() {
        java.lang.String str = this.ejfBZ;
        if (str == null) {
            pUU.EZpvd("OKIMVideoPlayer", "resume: videoUrl is null, skipping");
            return;
        }
        boolean z = this.valueOf != null;
        pUU.EZpvd("OKIMVideoPlayer", "resume: player=" + z + ", savedState=" + this.isConnected + ", url=" + C59454zhO.isConnected(str, 30));
        if (this.valueOf == null) {
            boolean zKWHzl = this.isConnected.KWHzl();
            this.AYXKKw = zKWHzl;
            pUU.EZpvd("OKIMVideoPlayer", "resume: recreating player, pendingResume=" + zKWHzl);
            android.widget.ProgressBar progressBar = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(progressBar, "");
            progressBar.setVisibility(0);
            android.widget.ImageView imageView = this.AEQbTJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            EZpvd(str, this.isConnected.EZpvd());
            return;
        }
        if (this.isConnected.KWHzl()) {
            pUU.EZpvd("OKIMVideoPlayer", "resume: player exists, resuming playback");
            SimpleExoPlayer simpleExoPlayer = this.valueOf;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.play();
            }
        }
    }

    public final void fetchVPNInfo() {
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            if (simpleExoPlayer.getPlaybackState() == 4) {
                simpleExoPlayer.seekTo(0L);
                simpleExoPlayer.play();
            } else if (simpleExoPlayer.isPlaying()) {
                simpleExoPlayer.pause();
            } else {
                simpleExoPlayer.play();
            }
        }
    }

    public final void valueOf() {
        AYXKKw();
    }

    public final void AYXKKw() {
        boolean z = this.valueOf != null;
        java.lang.String str = this.ejfBZ;
        pUU.EZpvd("OKIMVideoPlayer", "releasePlayer: player=" + z + ", url=" + (str != null ? C59454zhO.isConnected(str, 30) : null));
        OLrzqt();
        removeCallbacks(this.DbNXlk);
        this.AEQbTJ.fetchVPNInfo.animate().cancel();
        this.AEQbTJ.OLrzqt.animate().cancel();
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            Activity activity = new Activity(simpleExoPlayer.getCurrentPosition(), simpleExoPlayer.isPlaying());
            this.isConnected = activity;
            pUU.EZpvd("OKIMVideoPlayer", "releasePlayer: saving state=" + activity);
            simpleExoPlayer.removeListener(this.fetchVPNInfo);
            simpleExoPlayer.stop();
            simpleExoPlayer.release();
        }
        this.valueOf = null;
        this.AEQbTJ.AhwBna.setPlayer(null);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            this.AEQbTJ.fetchVPNInfo.setImageResource(C52761wXj.TaskDescription.iRgjgR);
            this.AEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.iRgjgR);
        } else {
            this.AEQbTJ.fetchVPNInfo.setImageResource(C52761wXj.TaskDescription.DGgkXd);
            this.AEQbTJ.AEQbTJ.setImageResource(C52761wXj.TaskDescription.HrFqwD);
        }
    }

    public final void AkhnZx() {
        SimpleExoPlayer simpleExoPlayer;
        if (this.KWHzl || (simpleExoPlayer = this.valueOf) == null) {
            return;
        }
        long duration = simpleExoPlayer.getDuration();
        long currentPosition = simpleExoPlayer.getCurrentPosition();
        if (duration > 0) {
            this.AEQbTJ.copydefault.setProgress((int) ((((long) 100) * currentPosition) / duration));
            this.AEQbTJ.KWHzl.setText(OLrzqt(currentPosition));
        }
    }

    public final java.lang.String OLrzqt(long j) {
        if (j <= 0) {
            return "00:00";
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        this.AkhnZx.setLength(0);
        if (j5 > 0) {
            this.values.format("%d:%02d:%02d", java.lang.Long.valueOf(j5), java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3));
            java.lang.String string = this.AkhnZx.toString();
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        this.values.format("%02d:%02d", java.lang.Long.valueOf(j4), java.lang.Long.valueOf(j3));
        java.lang.String string2 = this.AkhnZx.toString();
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }
}
