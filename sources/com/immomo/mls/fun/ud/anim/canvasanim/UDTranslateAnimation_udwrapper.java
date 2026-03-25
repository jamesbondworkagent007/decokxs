package com.immomo.mls.fun.ud.anim.canvasanim;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDTranslateAnimation_udwrapper extends UDBaseAnimation_udwrapper {
    public static final String[] methods = {"setFromXType", "setFromX", "setToXType", "setToX", "setFromYType", "setFromY", "setToYType", "setToY"};

    public UDTranslateAnimation_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    public UDTranslateAnimation_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation_udwrapper
    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDTranslateAnimation(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Lcom/immomo/mls/fun/ud/anim/canvasanim/UDBaseAnimation; */
    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation_udwrapper, org.luaj.vm2.LuaUserdata
    public UDTranslateAnimation getJavaUserdata() {
        return (UDTranslateAnimation) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFromXType(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setFromXType(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFromX(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setFromX((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setToXType(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setToXType(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setToX(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setToX((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFromYType(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setFromYType(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFromY(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setFromY((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setToYType(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setToYType(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setToY(LuaValue[] luaValueArr) {
        ((UDTranslateAnimation) this.javaUserdata).setToY((float) luaValueArr[0].toDouble());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation_udwrapper, org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return String.valueOf(this.javaUserdata);
    }

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation_udwrapper, org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
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

    @Override // com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation_udwrapper, org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }
}
