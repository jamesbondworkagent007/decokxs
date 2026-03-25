package com.immomo.mls.fun.ud;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import cn.jzvd.JZMediaInterface;
import cn.jzvd.JZTextureView;
import cn.jzvd.Jzvd;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoListener;
import com.immomo.mls.fun.ud.JZMediaExo;
import o.C7343ahz;

/* JADX INFO: loaded from: classes14.dex */
public class JZMediaExo extends JZMediaInterface implements Player.EventListener, VideoListener {
    private String TAG;
    private Runnable callback;
    private long previousSeek;
    private SimpleExoPlayer simpleExoPlayer;

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i) {
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public JZMediaExo(Jzvd jzvd) {
        super(jzvd);
        this.TAG = "JZMediaExo";
        this.previousSeek = 0L;
    }

    @Override // cn.jzvd.JZMediaInterface
    public void start() {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(true);
        }
    }

    @Override // cn.jzvd.JZMediaInterface
    public void prepare() {
        final Context context = this.jzvd.getContext();
        release();
        HandlerThread handlerThread = new HandlerThread("JZVD");
        this.mMediaHandlerThread = handlerThread;
        handlerThread.start();
        this.mMediaHandler = new Handler(context.getMainLooper());
        this.handler = new Handler();
        this.mMediaHandler.post(new Runnable() { // from class: o.aiQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.KWHzl.lambda$prepare$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$0(Context context) {
        MediaSource mediaSourceCreateMediaSource;
        SurfaceTexture surfaceTexture;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        this.simpleExoPlayer = new SimpleExoPlayer.Builder(context, new DefaultRenderersFactory(context)).setTrackSelector(defaultTrackSelector).setLoadControl(new DefaultLoadControl.Builder().setAllocator(new DefaultAllocator(true, 65536)).setBufferDurationsMs(360000, 600000, 1000, 5000).setPrioritizeTimeOverSizeThresholds(false).setTargetBufferBytes(-1).createDefaultLoadControl()).setBandwidthMeter(new DefaultBandwidthMeter.Builder(context).build()).build();
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(context, Util.getUserAgent(context, context.getResources().getString(C7343ahz.Fragment.KWHzl)));
        String string = this.jzvd.jzDataSource.getCurrentUrl().toString();
        if (string.contains(".m3u8")) {
            mediaSourceCreateMediaSource = new HlsMediaSource.Factory(defaultDataSourceFactory).createMediaSource(Uri.parse(string));
        } else {
            mediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(Uri.parse(string));
        }
        this.simpleExoPlayer.addVideoListener(this);
        this.simpleExoPlayer.addListener(this);
        if (Boolean.valueOf(this.jzvd.jzDataSource.looping).booleanValue()) {
            this.simpleExoPlayer.setRepeatMode(1);
        } else {
            this.simpleExoPlayer.setRepeatMode(0);
        }
        this.simpleExoPlayer.prepare(mediaSourceCreateMediaSource);
        this.simpleExoPlayer.setPlayWhenReady(true);
        this.callback = new Application();
        JZTextureView jZTextureView = this.jzvd.textureView;
        if (jZTextureView == null || (surfaceTexture = jZTextureView.getSurfaceTexture()) == null) {
            return;
        }
        this.simpleExoPlayer.setVideoSurface(new Surface(surfaceTexture));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVideoSizeChanged$1(int i, float f, int i2) {
        this.jzvd.onVideoSizeChanged((int) (i * f), i2);
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public void onVideoSizeChanged(final int i, final int i2, int i3, final float f) {
        this.handler.post(new Runnable() { // from class: o.aiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.EZpvd.lambda$onVideoSizeChanged$1(i, f, i2);
            }
        });
    }

    @Override // cn.jzvd.JZMediaInterface
    public void pause() {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
    }

    @Override // cn.jzvd.JZMediaInterface
    public boolean isPlaying() {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getPlayWhenReady();
        }
        return false;
    }

    @Override // cn.jzvd.JZMediaInterface
    public void seekTo(long j) {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer == null || j == this.previousSeek) {
            return;
        }
        if (j >= simpleExoPlayer.getBufferedPosition()) {
            this.jzvd.onStatePreparingPlaying();
        }
        this.simpleExoPlayer.seekTo(j);
        this.previousSeek = j;
        this.jzvd.seekToInAdvance = j;
    }

    @Override // cn.jzvd.JZMediaInterface
    public void release() {
        final HandlerThread handlerThread;
        final SimpleExoPlayer simpleExoPlayer;
        Handler handler = this.mMediaHandler;
        if (handler == null || (handlerThread = this.mMediaHandlerThread) == null || (simpleExoPlayer = this.simpleExoPlayer) == null) {
            return;
        }
        JZMediaInterface.SAVED_SURFACE = null;
        handler.post(new Runnable() { // from class: o.aiL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                JZMediaExo.lambda$release$2(simpleExoPlayer, handlerThread);
            }
        });
        this.simpleExoPlayer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$2(SimpleExoPlayer simpleExoPlayer, HandlerThread handlerThread) {
        simpleExoPlayer.release();
        handlerThread.quit();
    }

    @Override // cn.jzvd.JZMediaInterface
    public long getCurrentPosition() {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getCurrentPosition();
        }
        return 0L;
    }

    @Override // cn.jzvd.JZMediaInterface
    public long getDuration() {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getDuration();
        }
        return 0L;
    }

    @Override // cn.jzvd.JZMediaInterface
    public void setVolume(float f, float f2) {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVolume(f);
            this.simpleExoPlayer.setVolume(f2);
        }
    }

    @Override // cn.jzvd.JZMediaInterface
    public void setSpeed(float f) {
        if (this.simpleExoPlayer != null) {
            this.simpleExoPlayer.setPlaybackParameters(new PlaybackParameters(f, 1.0f));
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(final boolean z, final int i) {
        String.valueOf(z);
        this.handler.post(new Runnable() { // from class: o.aiM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.copydefault.lambda$onPlayerStateChanged$3(i, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlayerStateChanged$3(int i, boolean z) {
        if (i == 2) {
            this.jzvd.onStatePreparingPlaying();
            this.handler.post(this.callback);
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            this.jzvd.onCompletion();
        } else if (z) {
            this.jzvd.onStatePlaying();
        } else {
            this.jzvd.onStatePause();
        }
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        exoPlaybackException.toString();
        this.handler.post(new Runnable() { // from class: o.aiO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.EZpvd.lambda$onPlayerError$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPlayerError$4() {
        this.jzvd.onError(1000, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSeekProcessed$5() {
        this.jzvd.onSeekComplete();
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
        this.handler.post(new Runnable() { // from class: o.aiK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.EZpvd.lambda$onSeekProcessed$5();
            }
        });
    }

    @Override // cn.jzvd.JZMediaInterface
    public void setSurface(Surface surface) {
        SimpleExoPlayer simpleExoPlayer = this.simpleExoPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVideoSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = JZMediaInterface.SAVED_SURFACE;
        if (surfaceTexture2 == null) {
            JZMediaInterface.SAVED_SURFACE = surfaceTexture;
            prepare();
        } else {
            this.jzvd.textureView.setSurfaceTexture(surfaceTexture2);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public class Application implements Runnable {
        public Application() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (JZMediaExo.this.simpleExoPlayer != null) {
                final int bufferedPercentage = JZMediaExo.this.simpleExoPlayer.getBufferedPercentage();
                JZMediaExo.this.handler.post(new Runnable() { // from class: o.aiS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.copydefault.copydefault(bufferedPercentage);
                    }
                });
                if (bufferedPercentage < 100) {
                    JZMediaExo jZMediaExo = JZMediaExo.this;
                    jZMediaExo.handler.postDelayed(jZMediaExo.callback, 300L);
                } else {
                    JZMediaExo jZMediaExo2 = JZMediaExo.this;
                    jZMediaExo2.handler.removeCallbacks(jZMediaExo2.callback);
                }
            }
        }

        public final /* synthetic */ void copydefault(int i) {
            JZMediaExo.this.jzvd.setBufferProgress(i);
        }
    }
}
