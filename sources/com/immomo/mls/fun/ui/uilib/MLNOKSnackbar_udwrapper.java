package com.immomo.mls.fun.ui.uilib;

import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class MLNOKSnackbar_udwrapper extends LuaUserdata {
    public static final String[] methods = {TtmlNode.TAG_STYLE, "descriptionText", "button", "setCloseAction", "setAnchor", "showSnackbar", "dismiss"};

    public MLNOKSnackbar_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public MLNOKSnackbar_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new MLNOKSnackbar(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public MLNOKSnackbar getJavaUserdata() {
        return (MLNOKSnackbar) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] style(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).style(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] descriptionText(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).descriptionText((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] button(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).button((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (LuaFunction) (luaValueArr.length > 1 ? luaValueArr[1] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCloseAction(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).setCloseAction((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setAnchor(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).setAnchor((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showSnackbar(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).showSnackbar();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismiss(LuaValue[] luaValueArr) {
        ((MLNOKSnackbar) this.javaUserdata).dismiss();
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
}
