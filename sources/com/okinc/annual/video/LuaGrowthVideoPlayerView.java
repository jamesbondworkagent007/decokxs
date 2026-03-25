package com.okinc.annual.video;

import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import cn.jzvd.JZMediaInterface;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import com.google.android.exoplayer2.util.MimeTypes;
import o.InterfaceC7383aim;

/* JADX INFO: loaded from: classes3.dex */
public class LuaGrowthVideoPlayerView extends JzvdStd implements InterfaceC7383aim<UDGrowthVideoPlayerView> {
    private boolean controlState;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private TaskDescription playerProgressCallback;
    private UDGrowthVideoPlayerView userdata;

    public interface TaskDescription {
        void OLrzqt(int i, long j, long j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDGrowthVideoPlayerView getUserdata() {
        return this.userdata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void hideAllControl(boolean z) {
        this.controlState = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPlayerProgressCallback(TaskDescription taskDescription) {
        this.playerProgressCallback = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaGrowthVideoPlayerView(Context context) {
        super(context);
        this.controlState = true;
    }

    public LuaGrowthVideoPlayerView(Context context, UDGrowthVideoPlayerView uDGrowthVideoPlayerView) {
        super(context);
        this.controlState = true;
        this.userdata = uDGrowthVideoPlayerView;
    }

    public LuaGrowthVideoPlayerView(Context context, AttributeSet attributeSet) {
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
        TaskDescription taskDescription = this.playerProgressCallback;
        if (taskDescription != null) {
            taskDescription.OLrzqt(i, j / 1000, j2 / 1000);
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
}
