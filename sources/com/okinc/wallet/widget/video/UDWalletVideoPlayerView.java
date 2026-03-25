package com.okinc.wallet.widget.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.camera.video.AudioStats;
import cn.jzvd.JZDataSource;
import cn.jzvd.Jzvd;
import com.immomo.mls.fun.ud.JZMediaExo;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.okinc.wallet.widget.video.LuaWalletVideoPlayerView;
import com.okinc.wallet.widget.video.UDWalletVideoPlayerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o.C7322ahe;
import o.C7323ahf;
import o.C7823arB;
import o.C7840arS;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWalletVideoPlayerView<T extends LuaWalletVideoPlayerView> extends UDViewGroup<T> {
    public static final String[] KWHzl = {"setThumbImage", "setVideoUrl", "setLocalVideoName", "setLocalVideoPath", "pause", "resume", "stop", "play", "mute", "setPlayerVolume", "currentTime", "loop", "setVideoGravity", "hiddenBottomProgressIndicator", "seekToTime", "setPlayerProgress", "frameImageAtTime"};
    public String EZpvd;
    public LuaWalletVideoPlayerView OLrzqt;

    @InterfaceC60044zuT
    public UDWalletVideoPlayerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDWalletVideoPlayerView(Globals globals, T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDWalletVideoPlayerView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        T t = (T) new LuaWalletVideoPlayerView(AubY(), this);
        this.OLrzqt = t;
        return t;
    }

    @InterfaceC60044zuT
    public LuaValue[] setThumbImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        UDImageInfo uDImageInfo = (UDImageInfo) luaValue;
        OLrzqt(uDImageInfo.EZpvd(), this.OLrzqt.posterImageView);
        uDImageInfo.destroy();
        if (luaValueArr.length != 2 || (luaValue2 = luaValueArr[1]) == null) {
            return null;
        }
        this.OLrzqt.posterImageView.setBackgroundColor(((UDColor) luaValue2).copydefault());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setVideoUrl(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        String javaString = luaValue.toJavaString();
        this.EZpvd = javaString;
        this.OLrzqt.setUp(javaString, "", 0, JZMediaExo.class);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLocalVideoName(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return null;
        }
        String strKWHzl = C7823arB.KWHzl(luaValueArr[0].toJavaString(), (C7322ahe) this.globals.AuCTel());
        this.EZpvd = strKWHzl;
        this.OLrzqt.setUp(strKWHzl, "", 0, JZMediaExo.class);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLocalVideoPath(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return null;
        }
        String javaString = luaValueArr[0].toJavaString();
        this.EZpvd = javaString;
        this.OLrzqt.setUp(javaString, "", 0, JZMediaExo.class);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] pause(LuaValue[] luaValueArr) {
        Jzvd.goOnPlayOnPause();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] resume(LuaValue[] luaValueArr) {
        Jzvd.goOnPlayOnResume();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        try {
            this.OLrzqt.release();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] play(LuaValue[] luaValueArr) {
        this.OLrzqt.play();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] mute(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].toBoolean()) {
                this.OLrzqt.setPlayerVolume(0.0f);
                return null;
            }
            this.OLrzqt.setPlayerVolume(1.0f);
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.OLrzqt.getPlayerVolume() == 0.0f));
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayerVolume(LuaValue[] luaValueArr) {
        try {
            this.OLrzqt.setPlayerVolume(luaValueArr[0].toFloat());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] currentTime(LuaValue[] luaValueArr) {
        long currentTime = this.OLrzqt.getCurrentTime();
        return currentTime >= 0 ? LuaValue.varargsOf(LuaNumber.copydefault(currentTime)) : LuaValue.varargsOf(LuaNumber.valueOf(0));
    }

    @InterfaceC60044zuT
    public LuaValue[] loop(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            boolean z = luaValueArr[0].toBoolean();
            JZDataSource jZDataSource = this.OLrzqt.jzDataSource;
            if (jZDataSource == null) {
                return null;
            }
            jZDataSource.looping = z;
            return null;
        }
        JZDataSource jZDataSource2 = this.OLrzqt.jzDataSource;
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(jZDataSource2 != null ? jZDataSource2.looping : false));
    }

    @InterfaceC60044zuT
    public LuaValue[] setVideoGravity(LuaValue[] luaValueArr) {
        try {
            this.OLrzqt.setVideoGravity(luaValueArr[0].toInt());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] hiddenBottomProgressIndicator(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return null;
        }
        this.OLrzqt.hideAllControl(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] seekToTime(LuaValue[] luaValueArr) {
        try {
            this.OLrzqt.seekToTime(luaValueArr[0].toLong());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayerProgress(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        this.OLrzqt.setPlayerProgressCallback(new LuaWalletVideoPlayerView.Activity() { // from class: o.yfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.wallet.widget.video.LuaWalletVideoPlayerView.Activity
            public final void EZpvd(int i, long j, long j2) {
                UDWalletVideoPlayerView.EZpvd(luaFunction, i, j, j2);
            }
        });
        return LuaValue.rNil();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void EZpvd(LuaFunction luaFunction, int i, long j, long j2) {
        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(j), LuaNumber.copydefault(j2)));
    }

    public void OLrzqt(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            EZpvd(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.okinc.wallet.widget.video.UDWalletVideoPlayerView.1
                @Override // java.lang.Runnable
                public void run() {
                    UDWalletVideoPlayerView.this.EZpvd(jDImageInfo, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EZpvd(JDImageInfo jDImageInfo, ImageView imageView) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            KWHzl(C7323ahf.AYXKKw().KWHzl(contextAubY, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            KWHzl((Drawable) null, imageView);
        }
    }

    private void KWHzl(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    @InterfaceC60044zuT
    public LuaValue[] frameImageAtTime(LuaValue[] luaValueArr) throws Throwable {
        String str;
        if (luaValueArr == null || luaValueArr.length == 0 || (str = this.EZpvd) == null || str.isEmpty()) {
            return LuaValue.rNil();
        }
        double d = luaValueArr[0].toDouble();
        if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return LuaValue.rNil();
        }
        try {
            Bitmap bitmapFrameImageAtTime = this.OLrzqt.frameImageAtTime(d, this.EZpvd);
            if (bitmapFrameImageAtTime == null) {
                return LuaValue.rNil();
            }
            try {
                File file = new File(AubY().getCacheDir(), "video_frame_temp_" + System.currentTimeMillis() + ".jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmapFrameImageAtTime.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
                bitmapFrameImageAtTime.recycle();
                String absolutePath = file.getAbsolutePath();
                JDImageInfo jDImageInfo = new JDImageInfo(absolutePath, true, true, false, null);
                jDImageInfo.setAbsolutePath(absolutePath);
                return LuaValue.varargsOf(new UDImageInfo(this.globals, jDImageInfo));
            } catch (IOException e) {
                e.printStackTrace();
                if (!bitmapFrameImageAtTime.isRecycled()) {
                    bitmapFrameImageAtTime.recycle();
                }
                return LuaValue.rNil();
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                if (!bitmapFrameImageAtTime.isRecycled()) {
                    bitmapFrameImageAtTime.recycle();
                }
                return LuaValue.rNil();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return LuaValue.rNil();
        }
    }
}
