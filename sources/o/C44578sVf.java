package o;

import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.video.VideoListener;
import com.okinc.oklive.app.ui.player.ILivePlayer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44578sVf implements ILivePlayer {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public ILivePlayer.PlayerState AEQbTJ;
    public android.view.View AYXKKw;
    public android.view.TextureView AhwBna;
    public java.lang.String EZpvd;
    public SimpleExoPlayer KWHzl;
    public final android.content.Context copydefault;
    public ILivePlayer.Activity djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(ILivePlayer.Activity activity) {
        this.djBIcL = activity;
    }

    public C44578sVf(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.AEQbTJ = ILivePlayer.PlayerState.IDLE;
        copydefault();
    }

    /* JADX INFO: renamed from: o.sVf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sVf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void copydefault() {
        try {
            android.view.TextureView textureView = new android.view.TextureView(this.copydefault);
            this.AhwBna = textureView;
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.copydefault);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(textureView, new FrameLayout.LayoutParams(-1, -1));
            this.AYXKKw = frameLayout;
            SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(this.copydefault).build();
            simpleExoPlayerBuild.addListener(OLrzqt());
            simpleExoPlayerBuild.addVideoListener(KWHzl());
            simpleExoPlayerBuild.setVideoTextureView(textureView);
            simpleExoPlayerBuild.setPlayWhenReady(false);
            this.KWHzl = simpleExoPlayerBuild;
            pUU.EZpvd("ExoPlayerLiveWrapper", "ExoPlayer initialized successfully with TextureView");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "Failed to initialize ExoPlayer", e);
            OLrzqt(ILivePlayer.PlayerState.ERROR);
        }
    }

    /* JADX INFO: renamed from: o.sVf$TaskDescription */
    public static final class TaskDescription implements Player.EventListener {
        public TaskDescription() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            if (i == 1) {
                pUU.EZpvd("ExoPlayerLiveWrapper", "ExoPlayer state: IDLE");
                C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.IDLE);
                return;
            }
            if (i == 2) {
                pUU.EZpvd("ExoPlayerLiveWrapper", "ExoPlayer state: BUFFERING");
                C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.PREPARING);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                pUU.EZpvd("ExoPlayerLiveWrapper", "ExoPlayer state: ENDED");
                C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.COMPLETED);
                return;
            }
            pUU.EZpvd("ExoPlayerLiveWrapper", "ExoPlayer state: READY, playWhenReady=" + z);
            if (z) {
                C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.PLAYING);
            } else {
                C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.PAUSED);
            }
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "ExoPlayer error: " + exoPlaybackException.getMessage(), exoPlaybackException);
            C44578sVf.this.OLrzqt(ILivePlayer.PlayerState.ERROR);
            ILivePlayer.Activity activity = C44578sVf.this.djBIcL;
            if (activity != null) {
                activity.KWHzl(exoPlaybackException.type, exoPlaybackException.getMessage());
            }
        }
    }

    public final Player.EventListener OLrzqt() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.sVf$StateListAnimator */
    public static final class StateListAnimator implements VideoListener {
        public StateListAnimator() {
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
            if (C44578sVf.this.gEmmrt) {
                return;
            }
            C44578sVf.this.gEmmrt = true;
            pUU.EZpvd("ExoPlayerLiveWrapper", "First video frame rendered");
            ILivePlayer.Activity activity = C44578sVf.this.djBIcL;
            if (activity != null) {
                activity.EZpvd();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            pUU.EZpvd("ExoPlayerLiveWrapper", "Video size changed: " + i + "x" + i2);
            ILivePlayer.Activity activity = C44578sVf.this.djBIcL;
            if (activity != null) {
                activity.OLrzqt(i, i2);
            }
        }
    }

    public final VideoListener KWHzl() {
        return new StateListAnimator();
    }

    public final void OLrzqt(ILivePlayer.PlayerState playerState) {
        if (this.AEQbTJ != playerState) {
            this.AEQbTJ = playerState;
            ILivePlayer.Activity activity = this.djBIcL;
            if (activity != null) {
                activity.OLrzqt(playerState);
            }
        }
    }

    public android.view.View EZpvd() {
        android.view.View view = this.AYXKKw;
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException("Player view not initialized");
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.gEmmrt = false;
        pUU.EZpvd("ExoPlayerLiveWrapper", "Setting video URL: " + str);
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public void AYXKKw() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.KWHzl;
            if (simpleExoPlayer == null) {
                return;
            }
            if (this.AEQbTJ == ILivePlayer.PlayerState.PAUSED && simpleExoPlayer.getPlaybackState() == 3) {
                pUU.EZpvd("ExoPlayerLiveWrapper", "Resuming from paused state");
                simpleExoPlayer.setPlayWhenReady(true);
                return;
            }
            java.lang.String str = this.EZpvd;
            if (str != null) {
                pUU.EZpvd("ExoPlayerLiveWrapper", "Starting playback: " + str);
                OLrzqt(ILivePlayer.PlayerState.PREPARING);
                MediaItem mediaItemFromUri = MediaItem.fromUri(str);
                Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "");
                simpleExoPlayer.setMediaItem(mediaItemFromUri);
                simpleExoPlayer.prepare();
                simpleExoPlayer.setPlayWhenReady(true);
                return;
            }
            pUU.valueOf("ExoPlayerLiveWrapper", "Cannot play: URL not set");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "Failed to start playback", e);
            OLrzqt(ILivePlayer.PlayerState.ERROR);
            ILivePlayer.Activity activity = this.djBIcL;
            if (activity != null) {
                activity.KWHzl(-1, e.getMessage());
            }
        }
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public void AhwBna() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.KWHzl;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(false);
            }
            if (this.AEQbTJ == ILivePlayer.PlayerState.PLAYING) {
                OLrzqt(ILivePlayer.PlayerState.PAUSED);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "Failed to pause", e);
        }
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public void valueOf() {
        try {
            SimpleExoPlayer simpleExoPlayer = this.KWHzl;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.stop();
            }
            OLrzqt(ILivePlayer.PlayerState.IDLE);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "Failed to stop", e);
        }
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public void djBIcL() {
        try {
            pUU.EZpvd("ExoPlayerLiveWrapper", "Releasing ExoPlayer");
            SimpleExoPlayer simpleExoPlayer = this.KWHzl;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.release();
            }
            this.KWHzl = null;
            this.AhwBna = null;
            this.AYXKKw = null;
            this.djBIcL = null;
            this.gEmmrt = false;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ExoPlayerLiveWrapper", "Failed to release player", e);
        }
    }

    public void OLrzqt(float f) {
        SimpleExoPlayer simpleExoPlayer = this.KWHzl;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVolume(f);
        }
    }

    @Override // com.okinc.oklive.app.ui.player.ILivePlayer
    public boolean AEQbTJ() {
        SimpleExoPlayer simpleExoPlayer = this.KWHzl;
        return simpleExoPlayer != null && simpleExoPlayer.isPlaying();
    }
}
