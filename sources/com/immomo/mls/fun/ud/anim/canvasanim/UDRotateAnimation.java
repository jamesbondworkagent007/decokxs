package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDRotateAnimation extends UDBaseAnimation {
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float ejfBZ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromDegrees(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setPivotX(float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setPivotY(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToDegrees(float f) {
        this.ejfBZ = f;
    }

    public UDRotateAnimation(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        this.OLrzqt = 0.5f;
        this.EZpvd = 0.5f;
        int length = luaValueArr != null ? luaValueArr.length : 0;
        if (length > 0) {
            this.KWHzl = luaValueArr[0].toFloat();
            this.ejfBZ = luaValueArr[1].toFloat();
            if (length == 4) {
                this.OLrzqt = (float) luaValueArr[2].toDouble();
                this.EZpvd = (float) luaValueArr[3].toDouble();
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        return new RotateAnimation(this.KWHzl, this.ejfBZ, 1, this.OLrzqt, 1, this.EZpvd);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public UDBaseAnimation KWHzl() {
        UDRotateAnimation uDRotateAnimation = new UDRotateAnimation(this.AhwBna, null);
        uDRotateAnimation.KWHzl = this.KWHzl;
        uDRotateAnimation.ejfBZ = this.ejfBZ;
        uDRotateAnimation.OLrzqt = this.OLrzqt;
        uDRotateAnimation.EZpvd = this.EZpvd;
        return uDRotateAnimation;
    }
}
