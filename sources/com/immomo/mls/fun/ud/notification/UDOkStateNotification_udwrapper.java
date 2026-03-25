package com.immomo.mls.fun.ud.notification;

import com.okinc.liveness.lca.EopTrackEvent;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class UDOkStateNotification_udwrapper extends LuaUserdata {
    public static final String[] methods = {"title", "message", "setState", "addPrimaryAction", "addSecondaryAction", EopTrackEvent.CLOSE, "setTitleColor", "setMessageColor", "setMessageFont", "setTitleFont", "setMarginLeft", "setMarginRight", "setMarginTop", "setMarginBottom", "setVerticalCenter", "setHorizontalCenter", "setIconImage", "setCloseImage", "setPadding", "addButton", "show"};

    public UDOkStateNotification_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDOkStateNotification_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDOkStateNotification(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDOkStateNotification getJavaUserdata() {
        return (UDOkStateNotification) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] title(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).title(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] message(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).message(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setState(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setState(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addPrimaryAction(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).addPrimaryAction(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addSecondaryAction(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).addSecondaryAction(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] close(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).close(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setTitleColor(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setTitleColor(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMessageColor(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMessageColor(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMessageFont(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMessageFont(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setTitleFont(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setTitleFont(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMarginLeft(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMarginLeft(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMarginRight(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMarginRight(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMarginTop(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMarginTop(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMarginBottom(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setMarginBottom(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setVerticalCenter(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setVerticalCenter(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHorizontalCenter(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setHorizontalCenter(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setIconImage(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setIconImage(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCloseImage(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setCloseImage(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setPadding(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).setPadding(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addButton(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).addButton(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] show(LuaValue[] luaValueArr) {
        ((UDOkStateNotification) this.javaUserdata).show(luaValueArr);
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
