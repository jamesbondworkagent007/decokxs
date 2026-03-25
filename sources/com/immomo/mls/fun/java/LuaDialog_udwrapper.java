package com.immomo.mls.fun.java;

import android.view.View;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class LuaDialog_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setContent", "dialogAppear", "dialogDisAppear", "setDimAmount", "setContentGravity", "show", "dismiss", "autoContentWidth", "cancelable"};

    public LuaDialog_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public LuaDialog_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new LuaDialog(this.globals);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public LuaDialog getJavaUserdata() {
        return (LuaDialog) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setContent(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).setContent((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dialogAppear(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).dialogAppear((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dialogDisAppear(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).dialogDisAppear((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDimAmount(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).setDimAmount((float) luaValueArr[0].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setContentGravity(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).setContentGravity(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] show(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).show();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismiss(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).dismiss();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] autoContentWidth(LuaValue[] luaValueArr) {
        ((LuaDialog) this.javaUserdata).autoContentWidth(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancelable(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            LuaValue[] luaValueArr2 = new LuaValue[1];
            luaValueArr2[0] = ((LuaDialog) this.javaUserdata).getCancelable() ? LuaValue.True() : LuaValue.False();
            return LuaValue.varargsOf(luaValueArr2);
        }
        ((LuaDialog) this.javaUserdata).setCancelable(luaValueArr[0].toBoolean());
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
            ((LuaDialog) t).EZpvd();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
