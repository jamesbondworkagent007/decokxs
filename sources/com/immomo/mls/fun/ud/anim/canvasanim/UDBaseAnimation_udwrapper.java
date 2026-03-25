package com.immomo.mls.fun.ud.anim.canvasanim;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDBaseAnimation_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setRepeat", "setAutoBack", "setDuration", "setDelay", "setInterpolator", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "setStartCallback", "setEndCallback", "setRepeatCallback", "clone"};

    public Object newUserdata(LuaValue[] luaValueArr) {
        return null;
    }

    public UDBaseAnimation_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDBaseAnimation_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDBaseAnimation getJavaUserdata() {
        return (UDBaseAnimation) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRepeat(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setRepeat(luaValueArr[0].toInt(), luaValueArr[1].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setAutoBack(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setAutoBack(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDuration(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setDuration(luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDelay(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setDelay(luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setInterpolator(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setInterpolator(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).cancel();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setStartCallback(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setStartCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setEndCallback(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setEndCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRepeatCallback(LuaValue[] luaValueArr) {
        ((UDBaseAnimation) this.javaUserdata).setRepeatCallback((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clone(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDBaseAnimation) this.javaUserdata).m6331clone()));
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
            ((UDBaseAnimation) t).AEQbTJ();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
