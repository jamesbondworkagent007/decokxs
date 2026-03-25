package com.okinc.wallet.widget.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.camera.video.AudioStats;
import cn.jzvd.JZMediaInterface;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import com.google.android.exoplayer2.util.MimeTypes;
import com.just.agentweb.DefaultWebClient;
import java.io.IOException;
import java.util.HashMap;
import o.InterfaceC7383aim;

/* JADX INFO: loaded from: classes12.dex */
public class LuaWalletVideoPlayerView extends JzvdStd implements InterfaceC7383aim<UDWalletVideoPlayerView> {
    private boolean controlState;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private Activity playerProgressCallback;
    private UDWalletVideoPlayerView userdata;

    public interface Activity {
        void EZpvd(int i, long j, long j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDWalletVideoPlayerView getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void hideAllControl(boolean z) {
        this.controlState = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPlayerProgressCallback(Activity activity) {
        this.playerProgressCallback = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaWalletVideoPlayerView(Context context) {
        super(context);
        this.controlState = true;
    }

    public LuaWalletVideoPlayerView(Context context, UDWalletVideoPlayerView uDWalletVideoPlayerView) {
        super(context);
        this.controlState = true;
        this.userdata = uDWalletVideoPlayerView;
    }

    public LuaWalletVideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.controlState = true;
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void init(Context context) {
        super.init(context);
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.cycleCallback;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    public void play() {
        clickStart();
    }

    public void seekToTime(long j) {
        JZMediaInterface jZMediaInterface = this.mediaInterface;
        if (jZMediaInterface != null) {
            jZMediaInterface.seekTo(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
  0x0006: PHI (r0v7 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayerVolume(float f) {
        float f2 = 1.0f;
        if (f >= 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f <= 0.0f) {
            }
        }
        this.mAudioManager.setStreamVolume(3, (int) (this.mAudioManager.getStreamMaxVolume(3) * f), 0);
    }

    public float getPlayerVolume() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        }
        return this.mAudioManager.getStreamVolume(3);
    }

    public long getCurrentTime() {
        JZMediaInterface jZMediaInterface = this.mediaInterface;
        if (jZMediaInterface != null) {
            return jZMediaInterface.getCurrentPosition();
        }
        return 0L;
    }

    @Override // cn.jzvd.JzvdStd
    public void setAllControlsVisiblity(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ViewGroup viewGroup = this.topContainer;
        if (this.controlState) {
            i = 4;
        }
        viewGroup.setVisibility(i);
        ViewGroup viewGroup2 = this.bottomContainer;
        if (this.controlState) {
            i2 = 4;
        }
        viewGroup2.setVisibility(i2);
        ImageView imageView = this.startButton;
        if (this.controlState) {
            i3 = 4;
        }
        imageView.setVisibility(i3);
        ProgressBar progressBar = this.loadingProgressBar;
        if (this.controlState) {
            i4 = 4;
        }
        progressBar.setVisibility(i4);
        ImageView imageView2 = this.posterImageView;
        if (this.controlState) {
            i5 = 4;
        }
        imageView2.setVisibility(i5);
        ProgressBar progressBar2 = this.bottomProgressBar;
        if (this.controlState) {
            i6 = 4;
        }
        progressBar2.setVisibility(i6);
        LinearLayout linearLayout = this.mRetryLayout;
        if (this.controlState) {
            i7 = 4;
        }
        linearLayout.setVisibility(i7);
    }

    @Override // cn.jzvd.JzvdStd
    public void updateStartImage() {
        if (this.controlState) {
            return;
        }
        super.updateStartImage();
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onProgress(int i, long j, long j2) {
        if (!this.controlState) {
            super.onProgress(i, j, j2);
        }
        Activity activity = this.playerProgressCallback;
        if (activity != null) {
            activity.EZpvd(i, j / 1000, j2 / 1000);
        }
    }

    @Override // cn.jzvd.JzvdStd
    public void startDismissControlViewTimer() {
        if (this.controlState) {
            return;
        }
        super.startDismissControlViewTimer();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setVideoGravity(int i) {
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                i2 = 0;
            } else {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                    }
                }
            }
        }
        Jzvd.setVideoImageDisplayType(i2);
    }

    public void release() {
        reset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [212=5, 214=5] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x0053 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.media.MediaMetadataRetriever */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: android.media.MediaMetadataRetriever */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: android.media.MediaMetadataRetriever */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap frameImageAtTime(double d, String str) throws Throwable {
        ?? IsEmpty;
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = 0;
        if (d < AudioStats.AUDIO_AMPLITUDE_NONE || str == null || (IsEmpty = str.isEmpty()) != 0) {
            return null;
        }
        long j = (long) (d * 1000000.0d);
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (IllegalArgumentException e) {
                e = e;
                mediaMetadataRetriever = null;
            } catch (OutOfMemoryError e2) {
                e = e2;
                mediaMetadataRetriever = null;
            } catch (RuntimeException e3) {
                e = e3;
                mediaMetadataRetriever = null;
            } catch (Throwable th) {
                th = th;
                if (mediaMetadataRetriever2 != 0) {
                }
                throw th;
            }
            try {
                if (str.startsWith(DefaultWebClient.HTTP_SCHEME) || str.startsWith(DefaultWebClient.HTTPS_SCHEME)) {
                    mediaMetadataRetriever.setDataSource(str, new HashMap());
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException | RuntimeException e4) {
                    e4.printStackTrace();
                }
                return frameAtTime;
            } catch (IllegalArgumentException e5) {
                e = e5;
                e.printStackTrace();
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException | RuntimeException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            } catch (OutOfMemoryError e7) {
                e = e7;
                e.printStackTrace();
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException | RuntimeException e8) {
                        e8.printStackTrace();
                    }
                }
                return null;
            } catch (RuntimeException e9) {
                e = e9;
                e.printStackTrace();
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException | RuntimeException e10) {
                        e10.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever2 = IsEmpty;
            if (mediaMetadataRetriever2 != 0) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException | RuntimeException e11) {
                    e11.printStackTrace();
                }
            }
            throw th;
        }
    }
}
