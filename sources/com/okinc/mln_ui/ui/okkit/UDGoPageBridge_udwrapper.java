package com.okinc.mln_ui.ui.okkit;

import android.view.View;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.HashMap;
import java.util.Map;
import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class UDGoPageBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"gotoPage", "dismissAllPageExcept", "closeSelf", "push", "pushWithLifeCycle", "navigate", "presentNavigationVC", EopTrackEvent.CLOSE, "pop", "showSheet", "present", "dropDown", "dropDownWithOffset", "dismiss", "showAnchor", "navigateToMiniApp", "presentToMiniApp", "property"};

    public UDGoPageBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDGoPageBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDGoPageBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDGoPageBridge getJavaUserdata() {
        return (UDGoPageBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] gotoPage(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).gotoPage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (HashMap) C8017aul.AEQbTJ(luaValueArr[1], HashMap.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismissAllPageExcept(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).dismissAllPageExcept((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] closeSelf(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).closeSelf(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] push(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).push(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] pushWithLifeCycle(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).pushWithLifeCycle(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] navigate(LuaValue[] luaValueArr) {
        Map map = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            map = (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).navigate(javaString, map)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] presentNavigationVC(LuaValue[] luaValueArr) {
        Map map = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            map = (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).presentNavigationVC(javaString, map)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] close(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).close(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] pop(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).pop((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class), luaValueArr[1].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showSheet(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).showSheet(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] present(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).present(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dropDown(LuaValue[] luaValueArr) {
        View view = null;
        View view2 = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            view = (View) C8017aul.AEQbTJ(luaValueArr[1], View.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).dropDown(view2, view, luaValueArr[2].toBoolean())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dropDownWithOffset(LuaValue[] luaValueArr) {
        View view = null;
        View view2 = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            view = (View) C8017aul.AEQbTJ(luaValueArr[1], View.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).dropDownWithOffset(view2, view, luaValueArr[2].toBoolean(), luaValueArr[3].toInt(), luaValueArr[4].toInt(), luaValueArr[5].toInt(), luaValueArr[6].toInt(), luaValueArr[7].toInt())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismiss(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).dismiss((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toBoolean(), luaValueArr.length > 2 ? luaValueArr[2] : null);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showAnchor(LuaValue[] luaValueArr) {
        View view = null;
        View view2 = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (View) C8017aul.AEQbTJ(luaValueArr[0], View.class);
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            view = (View) C8017aul.AEQbTJ(luaValueArr[1], View.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).showAnchor(view2, view, luaValueArr[2].toInt(), luaValueArr[3].toInt(), luaValueArr[4].toInt(), luaValueArr[5].toBoolean())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] navigateToMiniApp(LuaValue[] luaValueArr) {
        Map map = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        if (luaValueArr.length > 2 && !luaValueArr[2].isNil()) {
            map = (Map) C8017aul.AEQbTJ(luaValueArr[2], Map.class);
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDGoPageBridge) this.javaUserdata).navigateToMiniApp(javaString, javaString2, map)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] presentToMiniApp(LuaValue[] luaValueArr) {
        ((UDGoPageBridge) this.javaUserdata).presentToMiniApp((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[2], Map.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] property(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((UDGoPageBridge) this.javaUserdata).property));
        }
        ((UDGoPageBridge) this.javaUserdata).property = luaValueArr[0].toInt();
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
