package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDTranslateAnimation extends UDBaseAnimation {
    public float AuCTel;
    public int EZpvd;
    public float KWHzl;
    public int OLrzqt;
    public int ejfBZ;
    public float fARcdN;
    public int fIwbmz;
    public float fJNWhG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromX(float f) {
        this.KWHzl = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromXType(int i) {
        this.OLrzqt = this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromY(float f) {
        this.fARcdN = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setFromYType(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToX(float f) {
        this.fJNWhG = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToXType(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToY(float f) {
        this.AuCTel = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void setToYType(int i) {
        this.fIwbmz = i;
    }

    public UDTranslateAnimation(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        this.OLrzqt = 0;
        this.ejfBZ = 0;
        this.EZpvd = 0;
        this.fIwbmz = 0;
        int length = luaValueArr != null ? luaValueArr.length : 0;
        if (length == 4) {
            this.KWHzl = luaValueArr[0].toFloat();
            this.fJNWhG = luaValueArr[1].toFloat();
            this.fARcdN = luaValueArr[2].toFloat();
            this.AuCTel = luaValueArr[3].toFloat();
            return;
        }
        if (length == 8) {
            this.OLrzqt = luaValueArr[0].toInt();
            this.KWHzl = luaValueArr[1].toFloat();
            this.ejfBZ = luaValueArr[2].toInt();
            this.fJNWhG = luaValueArr[3].toFloat();
            this.EZpvd = luaValueArr[4].toInt();
            this.fARcdN = luaValueArr[5].toFloat();
            this.fIwbmz = luaValueArr[6].toInt();
            this.AuCTel = luaValueArr[7].toFloat();
        }
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        int i = this.OLrzqt;
        float fCopydefault = UDBaseAnimation.copydefault(i, this.KWHzl);
        int i2 = this.ejfBZ;
        float fCopydefault2 = UDBaseAnimation.copydefault(i2, this.fJNWhG);
        int i3 = this.EZpvd;
        float fCopydefault3 = UDBaseAnimation.copydefault(i3, this.fARcdN);
        int i4 = this.fIwbmz;
        return new TranslateAnimation(i, fCopydefault, i2, fCopydefault2, i3, fCopydefault3, i4, UDBaseAnimation.copydefault(i4, this.AuCTel));
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public UDBaseAnimation KWHzl() {
        UDTranslateAnimation uDTranslateAnimation = new UDTranslateAnimation(this.AhwBna, null);
        uDTranslateAnimation.OLrzqt = this.OLrzqt;
        uDTranslateAnimation.KWHzl = this.KWHzl;
        uDTranslateAnimation.ejfBZ = this.ejfBZ;
        uDTranslateAnimation.fJNWhG = this.fJNWhG;
        uDTranslateAnimation.EZpvd = this.EZpvd;
        uDTranslateAnimation.fARcdN = this.fARcdN;
        uDTranslateAnimation.fIwbmz = this.fIwbmz;
        uDTranslateAnimation.AuCTel = this.AuCTel;
        return uDTranslateAnimation;
    }
}
