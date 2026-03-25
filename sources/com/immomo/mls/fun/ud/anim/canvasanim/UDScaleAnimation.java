package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDScaleAnimation extends UDBaseAnimation {
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float fIwbmz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromX(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromY(float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToX(float f) {
        this.fIwbmz = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToY(float f) {
        this.KWHzl = f;
    }

    public UDScaleAnimation(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return;
        }
        this.EZpvd = (float) luaValueArr[0].toDouble();
        this.fIwbmz = (float) luaValueArr[1].toDouble();
        this.OLrzqt = (float) luaValueArr[2].toDouble();
        this.KWHzl = (float) luaValueArr[3].toDouble();
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        return new ScaleAnimation(this.EZpvd, this.fIwbmz, this.OLrzqt, this.KWHzl, 1, 0.5f, 1, 0.5f);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public UDBaseAnimation KWHzl() {
        UDScaleAnimation uDScaleAnimation = new UDScaleAnimation(this.AhwBna, null);
        uDScaleAnimation.EZpvd = this.EZpvd;
        uDScaleAnimation.fIwbmz = this.fIwbmz;
        uDScaleAnimation.OLrzqt = this.OLrzqt;
        uDScaleAnimation.KWHzl = this.KWHzl;
        return uDScaleAnimation;
    }
}
