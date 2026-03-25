package com.immomo.mls.fun.ud.anim.canvasanim;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class UDAnimationSet extends UDBaseAnimation {
    public final AnimationSet EZpvd;
    public final boolean KWHzl;
    public final List<UDBaseAnimation> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation EZpvd() {
        return this.EZpvd;
    }

    public UDAnimationSet(Globals globals, LuaValue[] luaValueArr) {
        super(globals, luaValueArr);
        boolean z = false;
        if (luaValueArr != null && luaValueArr.length == 1) {
            z = luaValueArr[0].toBoolean();
        }
        this.KWHzl = z;
        this.EZpvd = new AnimationSet(this.KWHzl);
        this.OLrzqt = new ArrayList();
    }

    public UDAnimationSet(Globals globals, UDAnimationSet uDAnimationSet) {
        super(globals, null);
        boolean z = uDAnimationSet.KWHzl;
        this.KWHzl = z;
        this.EZpvd = new AnimationSet(z);
        this.OLrzqt = new ArrayList(uDAnimationSet.OLrzqt.size());
        Iterator<UDBaseAnimation> it = uDAnimationSet.OLrzqt.iterator();
        while (it.hasNext()) {
            addAnimation(it.next().m6331clone());
        }
    }

    @LuaBridge
    public void addAnimation(UDBaseAnimation uDBaseAnimation) {
        this.OLrzqt.add(uDBaseAnimation);
        this.EZpvd.addAnimation(uDBaseAnimation.OLrzqt());
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public Animation OLrzqt() {
        this.AYXKKw = false;
        if (this.copydefault == null) {
            this.copydefault = EZpvd();
        }
        this.copydefault.setRepeatMode(this.values);
        this.copydefault.setRepeatCount(this.DbNXlk);
        this.copydefault.setFillAfter(!this.AEQbTJ);
        this.copydefault.setFillEnabled(false);
        this.copydefault.setFillBefore(false);
        this.copydefault.setInterpolator(this.isConnected);
        this.copydefault.setStartOffset(this.djBIcL);
        this.copydefault.setAnimationListener(this);
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lcom/immomo/mls/fun/ud/anim/canvasanim/UDBaseAnimation; */
    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public UDAnimationSet KWHzl() {
        return new UDAnimationSet(this.AhwBna, this);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation
    public void cancel() {
        Iterator<UDBaseAnimation> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        super.cancel();
    }
}
