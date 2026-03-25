package com.immomo.mls.fun.ud.anim;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDAnimator_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setRepeat", "setDuration", "setDelay", TtmlNode.START, "stop", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "setStartCallback", "setStopCallback", "setCancelCallback", "setRepeatCallback", "setOnAnimationUpdateCallback", "isRunning", "clone", "setBezierPath"};

    public UDAnimator_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDAnimator_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDAnimator();
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDAnimator getJavaUserdata() {
        return (UDAnimator) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRepeat(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setRepeat(luaValueArr[0].toInt(), luaValueArr[1].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDuration(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setDuration((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDelay(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setDelay((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] start(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).start();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).stop();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).cancel();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setStartCallback(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setStartCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setStopCallback(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setStopCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCancelCallback(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setCancelCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRepeatCallback(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setRepeatCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOnAnimationUpdateCallback(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setOnAnimationUpdateCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isRunning(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((UDAnimator) this.javaUserdata).isRunning() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clone(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDAnimator) this.javaUserdata).clone()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setBezierPath(LuaValue[] luaValueArr) {
        ((UDAnimator) this.javaUserdata).setBezierPath((float) luaValueArr[0].toDouble(), (float) luaValueArr[1].toDouble(), (float) luaValueArr[2].toDouble(), (float) luaValueArr[3].toDouble());
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return String.valueOf(this.javaUserdata);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        T t = this.javaUserdata;
        if (t != 0) {
            return t.equals(((LuaUserdata) obj).getJavaUserdata());
        }
        return ((LuaUserdata) obj).getJavaUserdata() == null;
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        T t = this.javaUserdata;
        if (t != 0) {
            this.javaUserdata = null;
            ((UDAnimator) t).KWHzl();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
