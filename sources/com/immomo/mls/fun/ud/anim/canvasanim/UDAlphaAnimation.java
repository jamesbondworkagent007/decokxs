package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.immomo.mls.annotation.LuaClass;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDAlphaAnimation extends UDBaseAnimation {
    public float KWHzl;
    public float OLrzqt;

    public UDAlphaAnimation(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        this.OLrzqt = (float) luaValueArr[0].toDouble();
        this.KWHzl = (float) luaValueArr[1].toDouble();
    }

    public UDAlphaAnimation(Globals globals, float f, float f2) {
        super(globals, null);
        this.OLrzqt = f;
        this.KWHzl = f2;
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        return new AlphaAnimation(this.OLrzqt, this.KWHzl);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public UDBaseAnimation KWHzl() {
        return new UDAlphaAnimation(this.AhwBna, this.OLrzqt, this.KWHzl);
    }
}
