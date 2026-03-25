package com.immomo.mls.fun.ud;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import cn.jzvd.JZDataSource;
import cn.jzvd.Jzvd;
import com.bumptech.glide.Glide;
import com.immomo.mls.fun.ud.UDVideoPlayerView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.fun.ui.custom.LuaVideoPlayerView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import java.math.BigDecimal;
import java.util.HashMap;
import o.AbstractC58247yxg;
import o.C58266yxz;
import o.C7323ahf;
import o.C7840arS;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60044zuT;
import o.pUU;
import o.yBP;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDVideoPlayerView<T extends LuaVideoPlayerView> extends UDViewGroup<T> {
    public static final String[] copydefault = {"getAspectRatio", "setVideoUrl", "setThumbUrl", "setThumbImage", "pause", "stop", "play", "replay", "setVideoGravity", "setDisableBrightness", "setBrightness", "setDisableVolume", "setPlayerVolume", "setPauseWhenAppDidEnterBackground", "setResumePlayWhenAppDidEnterForeground", "seekToTime", "setPlayRate", "gotoFullScreen", "backFullScreen", "release", "autoReplay", "playerChangeStatus", "playerChangeTime", "seekToSecTime", "setAllVideoControlsHidden", "setPlayerViewBackgroundColor"};
    public LuaVideoPlayerView KWHzl;

    @InterfaceC60044zuT
    public UDVideoPlayerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDVideoPlayerView(Globals globals, T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDVideoPlayerView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        T t = (T) new LuaVideoPlayerView(AubY(), this);
        this.KWHzl = t;
        return t;
    }

    @InterfaceC60044zuT
    public LuaValue[] getAspectRatio(final LuaValue[] luaValueArr) {
        AbstractC58247yxg.just(0).map(new InterfaceC58229yxO<Integer, Float>() { // from class: com.immomo.mls.fun.ud.UDVideoPlayerView.4
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.InterfaceC58229yxO
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public Float apply(@NotNull Integer num) throws Exception {
                float fFloatValue;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                String javaString = luaValueArr[0].toJavaString();
                if (javaString != null) {
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(javaString, new HashMap());
                        } catch (Exception e) {
                            e.printStackTrace();
                            mediaMetadataRetriever.release();
                            fFloatValue = 0.0f;
                        }
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                }
                mediaMetadataRetriever.extractMetadata(9);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                pUU.EZpvd("peiyong", "width===" + strExtractMetadata + "   height===" + strExtractMetadata2);
                fFloatValue = new BigDecimal(strExtractMetadata).floatValue() / new BigDecimal(strExtractMetadata2).floatValue();
                pUU.EZpvd("peiyong", "radio===" + fFloatValue);
                return Float.valueOf(fFloatValue);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58227yxM<Float>() { // from class: com.immomo.mls.fun.ud.UDVideoPlayerView.5
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58227yxM
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void accept(Float f) throws Exception {
                luaValueArr[1].toLuaFunction().invoke(LuaValue.varargsOf(LuaNumber.copydefault(f.floatValue())));
            }
        }, new InterfaceC58227yxM<Throwable>() { // from class: com.immomo.mls.fun.ud.UDVideoPlayerView.1
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58227yxM
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public void accept(Throwable th) throws Exception {
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setVideoUrl(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.KWHzl.setUp(luaValue.toJavaString(), "", 0, JZMediaExo.class);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] autoReplay(LuaValue[] luaValueArr) {
        JZDataSource jZDataSource = this.KWHzl.jzDataSource;
        if (jZDataSource == null) {
            return null;
        }
        jZDataSource.looping = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setThumbUrl(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0 || luaValueArr[0] == null) {
            return null;
        }
        Glide.AEQbTJ(this.KWHzl.getContext()).EZpvd(luaValueArr[0].toJavaString()).EZpvd(this.KWHzl.posterImageView);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setThumbImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        UDImageInfo uDImageInfo = (UDImageInfo) luaValue;
        copydefault(uDImageInfo.EZpvd(), this.KWHzl.posterImageView);
        uDImageInfo.destroy();
        if (luaValueArr.length != 2 || (luaValue2 = luaValueArr[1]) == null) {
            return null;
        }
        this.KWHzl.maskView.setBackgroundColor(((UDColor) luaValue2).copydefault());
        this.KWHzl.posterImageView.setBackgroundColor(((UDColor) luaValueArr[1]).copydefault());
        return null;
    }

    public void copydefault(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            EZpvd(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ud.UDVideoPlayerView.3
                @Override // java.lang.Runnable
                public void run() {
                    UDVideoPlayerView.this.EZpvd(jDImageInfo, imageView);
                }
            });
        }
    }

    public final void EZpvd(JDImageInfo jDImageInfo, ImageView imageView) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            AEQbTJ(C7323ahf.AYXKKw().KWHzl(contextAubY, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            AEQbTJ((Drawable) null, imageView);
        }
    }

    public final void AEQbTJ(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    @InterfaceC60044zuT
    public LuaValue[] pause(LuaValue[] luaValueArr) {
        Jzvd.goOnPlayOnPause();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        this.KWHzl.reset();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] play(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.play();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] replay(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.replay();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setVideoGravity(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setVideoGravity(luaValueArr[0].toInt());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setDisableBrightness(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setDisableBrightness(luaValueArr[0].toBoolean());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setBrightness(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setBrightness(luaValueArr[0].toFloat());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setDisableVolume(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setDisableVolume(luaValueArr[0].toBoolean());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayerVolume(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setPlayerVolume(luaValueArr[0].toFloat());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setPauseWhenAppDidEnterBackground(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setPauseWhenAppDidEnterBackground(luaValueArr[0].toBoolean());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setResumePlayWhenAppDidEnterForeground(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setResumePlayWhenAppDidEnterForeground(luaValueArr[0].toBoolean());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] seekToTime(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.seekToTime(luaValueArr[0].toLong());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] seekToSecTime(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        try {
            this.KWHzl.seekToTime(luaValueArr[0].toLong() * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayRate(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.setPlayRate(luaValueArr[0].toFloat());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] gotoFullScreen(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.gotoFullScreenForLua();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] backFullScreen(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.backFullScreen();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] release(LuaValue[] luaValueArr) {
        try {
            this.KWHzl.release();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] playerChangeStatus(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        LuaVideoPlayerView luaVideoPlayerView = this.KWHzl;
        if (luaVideoPlayerView != null) {
            luaVideoPlayerView.setPlayerStatusChangedCallback(new LuaVideoPlayerView.Application() { // from class: com.immomo.mls.fun.ud.UDVideoPlayerView.2
                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void valueOf() {
                    luaFunction.invoke(LuaValue.rNumber(1.0d));
                }

                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void OLrzqt() {
                    luaFunction.invoke(LuaValue.rNumber(2.0d));
                }

                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void copydefault() {
                    luaFunction.invoke(LuaValue.rNumber(3.0d));
                }

                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void AEQbTJ() {
                    luaFunction.invoke(LuaValue.rNumber(4.0d));
                }

                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void EZpvd() {
                    luaFunction.invoke(LuaValue.rNumber(5.0d));
                }

                @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.Application
                public void KWHzl() {
                    luaFunction.invoke(LuaValue.rNumber(6.0d));
                }
            });
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] playerChangeTime(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        final LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        this.KWHzl.setPlayerProgressCallback(new LuaVideoPlayerView.TaskDescription() { // from class: o.aiU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ui.custom.LuaVideoPlayerView.TaskDescription
            public final void AEQbTJ(long j, long j2, int i) {
                UDVideoPlayerView.copydefault(luaFunction, j, j2, i);
            }
        });
        return LuaValue.rNil();
    }

    public static /* synthetic */ void copydefault(LuaFunction luaFunction, long j, long j2, int i) {
        luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(j), LuaNumber.copydefault(j2), LuaNumber.valueOf(i)));
    }

    @InterfaceC60044zuT
    public LuaValue[] setAllVideoControlsHidden(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        this.KWHzl.setHideControlUI(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlayerViewBackgroundColor(LuaValue[] luaValueArr) {
        UDColor uDColor = (UDColor) luaValueArr[0];
        JColor jColorAEQbTJ = uDColor.AEQbTJ();
        uDColor.destroy();
        this.KWHzl.setRootBackgroundColor(jColorAEQbTJ.getColor(this.globals));
        return null;
    }
}
