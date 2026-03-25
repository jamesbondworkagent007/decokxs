package com.immomo.mls.fun.ui.custom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import cn.jzvd.JZMediaInterface;
import cn.jzvd.JZUtils;
import cn.jzvd.Jzvd;
import cn.jzvd.JzvdStd;
import cn.jzvd.R;
import com.google.android.exoplayer2.util.MimeTypes;
import com.immomo.mls.fun.ud.UDVideoPlayerView;
import o.C33052mpF;
import o.C7343ahz;
import o.InterfaceC7383aim;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public class LuaVideoPlayerView extends JzvdStd implements InterfaceC7383aim<UDVideoPlayerView>, View.OnTouchListener {
    private static Boolean mPauseWhenAppDidEnterBackground = Boolean.TRUE;
    private static Boolean mResumePlayWhenAppDidEnterForeground = Boolean.FALSE;
    private ImageView bottomControlIv;
    private RelativeLayout bottomLayout;
    private InterfaceC7383aim.ActionBar cycleCallback;
    private boolean hideControlUI;
    private boolean isMusic;
    float lastMoveX;
    float lastMoveY;
    private View leftBlackView;
    private Boolean mDisableBrightness;
    private Boolean mDisableVolume;
    public FrameLayout maskView;
    private TaskDescription playerProgressCallback;
    private Application playerStatusChangedCallback;
    private View rightBlackView;
    private ConstraintLayout rootView;
    private UDVideoPlayerView userdata;

    public interface Application {
        void AEQbTJ();

        void EZpvd();

        void KWHzl();

        void OLrzqt();

        void copydefault();

        void valueOf();
    }

    public interface StateListAnimator {
        void OLrzqt(boolean z);
    }

    public interface TaskDescription {
        void AEQbTJ(long j, long j2, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public int getLayoutId() {
        return C7343ahz.Activity.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    public UDVideoPlayerView getUserdata() {
        return this.userdata;
    }

    @Override // cn.jzvd.Jzvd
    public void gotoNormalCompletion() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setHideControlUI(boolean z) {
        this.hideControlUI = z;
        Jzvd.WIFI_TIP_DIALOG_SHOWED = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPlayerProgressCallback(TaskDescription taskDescription) {
        this.playerProgressCallback = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPlayerStatusChangedCallback(Application application) {
        this.playerStatusChangedCallback = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.cycleCallback = actionBar;
    }

    public LuaVideoPlayerView(Context context) {
        super(context);
        this.isMusic = false;
        Boolean bool = Boolean.FALSE;
        this.mDisableBrightness = bool;
        this.mDisableVolume = bool;
        this.hideControlUI = false;
    }

    public LuaVideoPlayerView(Context context, UDVideoPlayerView uDVideoPlayerView) {
        super(context);
        this.isMusic = false;
        Boolean bool = Boolean.FALSE;
        this.mDisableBrightness = bool;
        this.mDisableVolume = bool;
        this.hideControlUI = false;
        this.userdata = uDVideoPlayerView;
    }

    public LuaVideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isMusic = false;
        Boolean bool = Boolean.FALSE;
        this.mDisableBrightness = bool;
        this.mDisableVolume = bool;
        this.hideControlUI = false;
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void init(Context context) {
        super.init(context);
        this.mAudioManager = (AudioManager) getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.maskView = (FrameLayout) findViewById(C7343ahz.TaskDescription.sSMYrx);
        ImageView imageView = (ImageView) findViewById(C7343ahz.TaskDescription.DbNXlk);
        this.bottomControlIv = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LuaVideoPlayerView.this.startButton.performClick();
            }
        });
        this.rootView = (ConstraintLayout) findViewById(C7343ahz.TaskDescription.QbewEr);
        this.bottomLayout = (RelativeLayout) findViewById(C7343ahz.TaskDescription.iwGUEr);
        this.textureViewContainer.setOnTouchListener(this);
        this.textureViewContainer.setOnClickListener(this);
        this.leftBlackView = new View(context);
        this.rightBlackView = new View(context);
        this.leftBlackView.setBackgroundColor(Color.parseColor("#000000"));
        this.rightBlackView.setBackgroundColor(Color.parseColor("#000000"));
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

    @Override // cn.jzvd.JzvdStd
    public void updateStartImage() {
        int i = this.state;
        if (i == 5) {
            if (!this.hideControlUI) {
                this.startButton.setVisibility(0);
            }
            this.startButton.setImageResource(R.drawable.jz_click_pause_selector);
            this.bottomControlIv.setImageResource(C7343ahz.StateListAnimator.gEmmrt);
            return;
        }
        if (i == 8) {
            this.startButton.setVisibility(4);
            return;
        }
        if (i == 7) {
            if (!this.hideControlUI) {
                this.startButton.setVisibility(0);
            }
            this.startButton.setImageResource(C7343ahz.StateListAnimator.AhwBna);
            this.bottomControlIv.setImageResource(C7343ahz.StateListAnimator.AYXKKw);
            return;
        }
        this.startButton.setImageResource(C7343ahz.StateListAnimator.AhwBna);
        this.bottomControlIv.setImageResource(C7343ahz.StateListAnimator.AYXKKw);
    }

    @Override // cn.jzvd.Jzvd
    public void gotoFullscreen() {
        this.gotoFullscreenTime = System.currentTimeMillis();
        ViewGroup viewGroup = (ViewGroup) getParent();
        this.jzvdContext = viewGroup.getContext();
        this.blockLayoutParams = getLayoutParams();
        this.blockIndex = viewGroup.indexOfChild(this);
        this.blockWidth = getWidth();
        this.blockHeight = getHeight();
        viewGroup.removeView(this);
        cloneAJzvd(viewGroup);
        Jzvd.CONTAINER_LIST.add(viewGroup);
        getRootViewGroup().addView(this, new FrameLayout.LayoutParams(-1, -1));
        setScreenFullscreen();
        JZUtils.hideStatusBar(this.jzvdContext);
        if (getContext() instanceof StateListAnimator) {
            ((StateListAnimator) getContext()).OLrzqt(true);
        }
        JZUtils.setRequestedOrientation(this.jzvdContext, Jzvd.FULLSCREEN_ORIENTATION);
        JZUtils.hideSystemUI(this.jzvdContext);
        ((RelativeLayout.LayoutParams) this.bottomControlIv.getLayoutParams()).setMarginStart(C33052mpF.AEQbTJ(41, getContext()));
        ((RelativeLayout.LayoutParams) this.fullscreenButton.getLayoutParams()).setMarginEnd(C33052mpF.AEQbTJ(41, getContext()));
    }

    @Override // cn.jzvd.Jzvd
    public void gotoNormalScreen() {
        this.gobakFullscreenTime = System.currentTimeMillis();
        getRootViewGroup().removeView(this);
        Jzvd.CONTAINER_LIST.getLast().removeViewAt(this.blockIndex);
        Jzvd.CONTAINER_LIST.getLast().addView(this, this.blockIndex, this.blockLayoutParams);
        Jzvd.CONTAINER_LIST.pop();
        setScreenNormal();
        JZUtils.showStatusBar(this.jzvdContext);
        if (getContext() instanceof StateListAnimator) {
            ((StateListAnimator) getContext()).OLrzqt(false);
        }
        JZUtils.setRequestedOrientation(this.jzvdContext, Jzvd.NORMAL_ORIENTATION);
        JZUtils.showSystemUI(this.jzvdContext);
        ((RelativeLayout.LayoutParams) this.bottomControlIv.getLayoutParams()).setMarginStart(C33052mpF.AEQbTJ(21, getContext()));
        ((RelativeLayout.LayoutParams) this.fullscreenButton.getLayoutParams()).setMarginEnd(C33052mpF.AEQbTJ(21, getContext()));
    }

    private ViewGroup getRootViewGroup() {
        Fragment fragmentFindFragmentByTag = ((FragmentActivity) this.jzvdContext).getSupportFragmentManager().findFragmentByTag("");
        if (fragmentFindFragmentByTag != null) {
            return (ViewGroup) fragmentFindFragmentByTag.getView();
        }
        return (ViewGroup) JZUtils.scanForActivity(this.jzvdContext).getWindow().getDecorView();
    }

    @Override // cn.jzvd.Jzvd
    public void setUp(String str, String str2) {
        super.setUp(str, str2);
        boolean z = str.endsWith(".mp3") || str.endsWith(".wav");
        this.isMusic = z;
        if (z) {
            this.posterImageView.setOnClickListener(this);
            this.posterImageView.setOnTouchListener(this);
        }
    }

    @Override // cn.jzvd.Jzvd
    public void setUp(String str, String str2, int i, Class cls) {
        super.setUp(str, str2, i, cls);
        boolean z = str.endsWith(".mp3") || str.endsWith(".wav");
        this.isMusic = z;
        if (z) {
            this.posterImageView.setOnClickListener(this);
            this.posterImageView.setOnTouchListener(this);
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        if (view == this.posterImageView || view == this.textureViewContainer) {
            onClickUiToggle();
            startDismissControlViewTimer();
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.hideControlUI) {
            return true;
        }
        ImageView imageView = this.posterImageView;
        if (view == imageView && this.state < 1) {
            return true;
        }
        if (view == imageView || view == this.textureViewContainer) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.lastMoveX == 0.0f && this.lastMoveY == 0.0f) {
                    this.lastMoveX = x;
                    this.lastMoveY = y;
                }
                touchActionDown(x, y);
            } else if (action == 1) {
                requestDisallowInterceptTouchEvent(false);
                touchActionUp();
            } else if (action == 2) {
                touchActionMove(x, y);
                if (Math.abs(x - this.lastMoveX) > Math.abs(y - this.lastMoveY)) {
                    this.lastMoveX = x;
                    this.lastMoveY = y;
                    requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                this.lastMoveX = x;
                this.lastMoveY = y;
            }
            return false;
        }
        return super.onTouch(view, motionEvent);
    }

    @Override // cn.jzvd.Jzvd
    public void touchActionMove(float f, float f2) {
        hashCode();
        float f3 = f - this.mDownX;
        float f4 = f2 - this.mDownY;
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        int i = this.screen;
        if (i == 1 || i == 0) {
            if (i == 1) {
                if (this.mDownX > JZUtils.getScreenHeight(getContext()) || this.mDownY < JZUtils.getStatusBarHeight(getContext())) {
                    return;
                }
            } else if (i == 0 && (this.mDownX > JZUtils.getScreenWidth(getContext()) || this.mDownY < JZUtils.getStatusBarHeight(getContext()))) {
                return;
            }
            if (!this.mChangePosition && !this.mChangeVolume && !this.mChangeBrightness && (fAbs > 80.0f || fAbs2 > 80.0f)) {
                cancelProgressTimer();
                if (fAbs >= 80.0f) {
                    if (this.mediaInterface != null && this.state != 8) {
                        this.mChangePosition = true;
                        this.mGestureDownPosition = getCurrentPositionWhenPlaying();
                    }
                } else if (this.mDownX < this.mScreenHeight * 0.5f) {
                    this.mChangeBrightness = true;
                    float f5 = JZUtils.getWindow(getContext()).getAttributes().screenBrightness;
                    if (f5 < 0.0f) {
                        try {
                            this.mGestureDownBrightness = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness");
                            float f6 = this.mGestureDownBrightness;
                        } catch (Settings.SettingNotFoundException e) {
                            pUU.copydefault("mln", Log.getStackTraceString(e));
                        }
                    } else {
                        this.mGestureDownBrightness = f5 * 255.0f;
                        float f7 = this.mGestureDownBrightness;
                    }
                } else {
                    this.mChangeVolume = true;
                    this.mGestureDownVolume = this.mAudioManager.getStreamVolume(3);
                }
            }
        }
        if (this.mChangePosition) {
            long duration = getDuration();
            if (Jzvd.PROGRESS_DRAG_RATE <= 0.0f) {
                Jzvd.PROGRESS_DRAG_RATE = 1.0f;
            }
            long j = (int) (this.mGestureDownPosition + ((duration * f3) / (this.mScreenWidth * Jzvd.PROGRESS_DRAG_RATE)));
            this.mSeekTimePosition = j;
            if (j > duration) {
                this.mSeekTimePosition = duration;
            }
            showProgressDialog(f3, JZUtils.stringForTime(this.mSeekTimePosition), this.mSeekTimePosition, JZUtils.stringForTime(duration), duration);
        }
        if (this.mChangeVolume && this.screen == 1 && !this.mDisableVolume.booleanValue()) {
            f4 = -f4;
            this.mAudioManager.setStreamVolume(3, this.mGestureDownVolume + ((int) (((this.mAudioManager.getStreamMaxVolume(3) * f4) * 3.0f) / this.mScreenHeight)), 0);
            showVolumeDialog(-f4, (int) (((this.mGestureDownVolume * 100) / r14) + (((f4 * 3.0f) * 100.0f) / this.mScreenHeight)));
        }
        if (this.mChangeBrightness && this.screen == 1 && !this.mDisableBrightness.booleanValue()) {
            float f8 = -f4;
            WindowManager.LayoutParams attributes = JZUtils.getWindow(getContext()).getAttributes();
            float f9 = (this.mGestureDownBrightness + ((int) (((f8 * 255.0f) * 3.0f) / this.mScreenHeight))) / 255.0f;
            if (f9 >= 1.0f) {
                attributes.screenBrightness = 1.0f;
            } else if (f9 <= 0.0f) {
                attributes.screenBrightness = 0.01f;
            } else {
                attributes.screenBrightness = f9;
            }
            JZUtils.getWindow(getContext()).setAttributes(attributes);
            showBrightnessDialog((int) (((this.mGestureDownBrightness * 100.0f) / 255.0f) + (((f8 * 3.0f) * 100.0f) / this.mScreenHeight)));
        }
    }

    @Override // cn.jzvd.JzvdStd
    public Dialog createDialogWithView(View view) {
        Dialog dialog = new Dialog(this.jzvdContext, R.style.jz_style_dialog_progress);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        window.addFlags(8);
        window.addFlags(32);
        window.addFlags(16);
        window.setLayout(-2, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.screen == 1) {
            attributes.gravity = 17;
        } else {
            attributes.gravity = 48;
            attributes.y = C33052mpF.AEQbTJ(100, getContext());
        }
        window.setAttributes(attributes);
        return dialog;
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void showProgressDialog(float f, String str, long j, String str2, long j2) {
        if (this.mProgressDialog == null) {
            View viewInflate = LayoutInflater.from(this.jzvdContext).inflate(R.layout.jz_dialog_progress, (ViewGroup) null);
            this.mDialogProgressBar = (ProgressBar) viewInflate.findViewById(R.id.duration_progressbar);
            this.mDialogSeekTime = (TextView) viewInflate.findViewById(R.id.tv_current);
            this.mDialogTotalTime = (TextView) viewInflate.findViewById(R.id.tv_duration);
            this.mDialogIcon = (ImageView) viewInflate.findViewById(R.id.duration_image_tip);
            this.mProgressDialog = createDialogWithView(viewInflate);
        }
        if (!this.mProgressDialog.isShowing()) {
            if (this.screen == 1) {
                this.mProgressDialog.getWindow().getAttributes().gravity = 17;
                this.mProgressDialog.getWindow().getAttributes().y = 0;
            } else {
                this.mProgressDialog.getWindow().getAttributes().gravity = 48;
                this.mProgressDialog.getWindow().getAttributes().y = C33052mpF.AEQbTJ(100, getContext());
            }
            this.mProgressDialog.show();
        }
        this.mDialogSeekTime.setText(str);
        this.mDialogTotalTime.setText(" / " + str2);
        this.mDialogProgressBar.setProgress(j2 > 0 ? (int) ((j * 100) / j2) : 0);
        if (f > 0.0f) {
            this.mDialogIcon.setBackgroundResource(R.drawable.jz_forward_icon);
        } else {
            this.mDialogIcon.setBackgroundResource(R.drawable.jz_backward_icon);
        }
        onCLickUiToggleToClear();
    }

    @Override // cn.jzvd.JzvdStd
    public void setAllControlsVisiblity(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.hideControlUI) {
            super.setAllControlsVisiblity(4, 4, 4, 4, 4, 4, 4);
            this.posterImageView.setVisibility(this.isMusic ? 0 : i5);
        } else {
            super.setAllControlsVisiblity(i, i2, i3, i4, i5, i6, i7);
            this.posterImageView.setVisibility(this.isMusic ? 0 : i5);
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void showWifiDialog() {
        if (this.hideControlUI) {
            Jzvd.WIFI_TIP_DIALOG_SHOWED = true;
        } else {
            super.showWifiDialog();
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void setScreenNormal() {
        super.setScreenNormal();
        this.fullscreenButton.setImageResource(C7343ahz.StateListAnimator.valueOf);
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void setScreenFullscreen() {
        super.setScreenFullscreen();
        this.fullscreenButton.setImageResource(C7343ahz.StateListAnimator.values);
    }

    public int getScreenHeight() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public void setPreParingUI(boolean z) {
        this.state = 3;
        setAllControlsVisiblity(0, 0, 4, 0, z ? 4 : 0, 4, 4);
        updateStartImage();
    }

    public static void goOnPlayOnPause() {
        if (mPauseWhenAppDidEnterBackground.booleanValue()) {
            Jzvd.goOnPlayOnPause();
        }
    }

    public static void goOnPlayOnResume() {
        if (mResumePlayWhenAppDidEnterForeground.booleanValue()) {
            Jzvd.goOnPlayOnResume();
        }
    }

    public void play() {
        this.startButton.performClick();
    }

    public void replay() {
        reset();
        play();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000b  */
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
                }
            }
        }
        Jzvd.setVideoImageDisplayType(i2);
    }

    public void setDisableBrightness(boolean z) {
        this.mDisableBrightness = Boolean.valueOf(z);
    }

    public void setBrightness(float f) {
        if (this.screen == 1) {
            WindowManager.LayoutParams attributes = JZUtils.getWindow(getContext()).getAttributes();
            if (f >= 1.0f) {
                attributes.screenBrightness = 1.0f;
            } else if (f <= 0.0f) {
                attributes.screenBrightness = 0.01f;
            } else {
                attributes.screenBrightness = f;
            }
            JZUtils.getWindow(getContext()).setAttributes(attributes);
            int i = (int) (f * 100.0f);
            if (i >= 100) {
                i = 100;
            }
            if (i <= 0) {
                i = 0;
            }
            showBrightnessDialog(i);
        }
    }

    public void setDisableVolume(boolean z) {
        this.mDisableVolume = Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[PHI: r1
  0x0017: PHI (r1v6 float) = (r1v1 float), (r1v2 float) binds: [B:9:0x0015, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayerVolume(float f) {
        AudioManager audioManager;
        if (this.screen != 1 || this.mDisableVolume.booleanValue() || (audioManager = this.mAudioManager) == null) {
            return;
        }
        float f2 = 1.0f;
        if (f >= 1.0f) {
            f = f2;
        } else {
            f2 = 0.0f;
            if (f <= 0.0f) {
            }
        }
        float streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = (int) (this.mAudioManager.getStreamMaxVolume(3) * f);
        this.mAudioManager.setStreamVolume(3, streamMaxVolume, 0);
        showVolumeDialog(-(streamMaxVolume - streamVolume), streamMaxVolume);
    }

    public void setPauseWhenAppDidEnterBackground(boolean z) {
        mPauseWhenAppDidEnterBackground = Boolean.valueOf(z);
    }

    public void setResumePlayWhenAppDidEnterForeground(boolean z) {
        mResumePlayWhenAppDidEnterForeground = Boolean.valueOf(z);
    }

    public void seekToTime(long j) {
        JZMediaInterface jZMediaInterface = this.mediaInterface;
        if (jZMediaInterface != null) {
            jZMediaInterface.seekTo(j);
        }
    }

    public void setPlayRate(float f) {
        JZMediaInterface jZMediaInterface = this.mediaInterface;
        if (jZMediaInterface != null) {
            jZMediaInterface.setSpeed(f);
        }
    }

    public void gotoFullScreenForLua() {
        if (this.screen == 0) {
            gotoFullscreen();
        }
    }

    public void backFullScreen() {
        if (this.screen == 1) {
            gotoNormalScreen();
        }
    }

    public void release() {
        mPauseWhenAppDidEnterBackground = Boolean.TRUE;
        mResumePlayWhenAppDidEnterForeground = Boolean.FALSE;
        Jzvd.setVideoImageDisplayType(0);
        reset();
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onProgress(int i, long j, long j2) {
        super.onProgress(i, j, j2);
        TaskDescription taskDescription = this.playerProgressCallback;
        if (taskDescription != null) {
            taskDescription.AEQbTJ(j / 1000, j2 / 1000, i);
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onStatePreparing() {
        super.onStatePreparing();
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onStatePlaying() {
        super.onStatePlaying();
        Application application = this.playerStatusChangedCallback;
        if (application != null) {
            application.valueOf();
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onStatePreparingPlaying() {
        super.onStatePreparingPlaying();
        if (this.playerStatusChangedCallback != null) {
            if (this.mediaInterface.isPlaying()) {
                this.playerStatusChangedCallback.copydefault();
            } else {
                this.playerStatusChangedCallback.AEQbTJ();
            }
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onStatePause() {
        super.onStatePause();
        Application application = this.playerStatusChangedCallback;
        if (application != null) {
            application.OLrzqt();
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void onStateError() {
        super.onStateError();
        if (this.playerStatusChangedCallback != null) {
            if (this.mediaInterface.isPlaying()) {
                this.playerStatusChangedCallback.EZpvd();
            } else {
                this.playerStatusChangedCallback.KWHzl();
            }
        }
    }

    @Override // cn.jzvd.JzvdStd, cn.jzvd.Jzvd
    public void startVideo() {
        super.startVideo();
        if (this.hideControlUI) {
            JZUtils.scanForActivity(getContext()).getWindow().clearFlags(128);
        }
    }

    public void setRootBackgroundColor(int i) {
        ConstraintLayout constraintLayout = this.rootView;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(i);
        }
    }
}
