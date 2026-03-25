package com.immomo.mls.fun.ud;

import android.graphics.Canvas;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDBaseDrawable_udwrapper extends LuaUserdata {
    public static final String[] methods = {"onAddedToViewTree", "onRemovedFromViewTree", "setRefreshFunction", "setLayoutFunction", "onMeasure", "onLayout", "onPadding", "draw"};

    public Object newUserdata(LuaValue[] luaValueArr) {
        return null;
    }

    public UDBaseDrawable_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDBaseDrawable_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDBaseDrawable getJavaUserdata() {
        return (UDBaseDrawable) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onAddedToViewTree(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).onAddedToViewTree(luaValueArr.length > 0 ? luaValueArr[0] : null);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onRemovedFromViewTree(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).onRemovedFromViewTree();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRefreshFunction(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).setRefreshFunction((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC8029auy) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC8029auy.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setLayoutFunction(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).setLayoutFunction((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC8029auy) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC8029auy.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onMeasure(LuaValue[] luaValueArr) {
        return ((UDBaseDrawable) this.javaUserdata).onMeasure(luaValueArr[0].toInt(), luaValueArr[1].toDouble(), luaValueArr[2].toInt(), luaValueArr[3].toDouble());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onLayout(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).onLayout(luaValueArr[0].toBoolean(), luaValueArr[1].toDouble(), luaValueArr[2].toDouble(), luaValueArr[3].toDouble(), luaValueArr[4].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] onPadding(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).onPadding(luaValueArr[0].toDouble(), luaValueArr[1].toDouble(), luaValueArr[2].toDouble(), luaValueArr[3].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] draw(LuaValue[] luaValueArr) {
        ((UDBaseDrawable) this.javaUserdata).draw((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (Canvas) C8017aul.AEQbTJ(luaValueArr[0], Canvas.class));
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
            ((UDBaseDrawable) t).copydefault();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
