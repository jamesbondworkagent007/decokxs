package com.immomo.mls.fun.lt;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class SIApplication_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setForeground2BackgroundCallback", "setBackground2ForegroundCallback", "isColdBoot", "isRtl", "getCurrentSite", "isOKWalletApp", "getPackageName"};

    public SIApplication_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public SIApplication_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new SIApplication(this.globals);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public SIApplication getJavaUserdata() {
        return (SIApplication) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setForeground2BackgroundCallback(LuaValue[] luaValueArr) {
        ((SIApplication) this.javaUserdata).setForeground2BackgroundCallback((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setBackground2ForegroundCallback(LuaValue[] luaValueArr) {
        ((SIApplication) this.javaUserdata).setBackground2ForegroundCallback((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isColdBoot(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SIApplication) this.javaUserdata).isColdBoot() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isRtl(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SIApplication) this.javaUserdata).isRtl() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentSite(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SIApplication) this.javaUserdata).getCurrentSite()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isOKWalletApp(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SIApplication) this.javaUserdata).isOKWalletApp() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getPackageName(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SIApplication) this.javaUserdata).getPackageName()));
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
