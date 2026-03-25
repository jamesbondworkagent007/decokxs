package com.immomo.mls.fun.lt;

import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class SISystem_udwrapper extends LuaUserdata {
    public static final String[] methods = {"iOS", "Android", "SDKVersion", "SDKVersionInt", "OSVersion", "OSVersionInt", "deviceInfo", "scale", "isDebug", "isDebugKey", "getAppsflyerDeeplinkParam", "getAppsflyerAttributionParam", "device", "screenSize", "navBarHeight", "stateBarHeight", "homeIndicatorHeight", "tabBarHeight", "networkState", "asyncDoInMain", "setOnNetworkStateChange", "setTimeOut", "AppVersion", "AppVersionString", "nanoTime", "switchFullscreen", "hideStatusBar", "showStatusBar", "changeBright", "getBright", "isDarkMode", "appChannelId", "getConfig", "runGC"};

    public SISystem_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public SISystem_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new SISystem(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public SISystem getJavaUserdata() {
        return (SISystem) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] iOS(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).iOS() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] Android(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).Android() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] SDKVersion(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).SDKVersion()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] SDKVersionInt(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).SDKVersionInt()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] OSVersion(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).OSVersion()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] OSVersionInt(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).OSVersionInt()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] deviceInfo(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).platform()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] scale(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(((SISystem) this.javaUserdata).scale()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isDebug(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).isDebug() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isDebugKey(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).isDebugKey() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAppsflyerDeeplinkParam(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).getAppsflyerDeeplinkParam((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAppsflyerAttributionParam(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).getAppsflyerAttributionParam((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] device(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((SISystem) this.javaUserdata).device());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] screenSize(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((SISystem) this.javaUserdata).screenSize()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] navBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).navBarHeight()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stateBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).stateBarHeight()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] homeIndicatorHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).homeIndicatorHeight()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] tabBarHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).tabBarHeight()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] networkState(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).networkState()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] asyncDoInMain(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).asyncDoInMain((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC8029auy) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC8029auy.class)) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOnNetworkStateChange(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).setOnNetworkStateChange((LuaFunction) (luaValueArr.length > 0 ? luaValueArr[0] : null));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setTimeOut(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).setTimeOut((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (InterfaceC8029auy) C8017aul.AEQbTJ(luaValueArr[0], InterfaceC8029auy.class), (float) luaValueArr[1].toDouble());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] AppVersion(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).AppVersion()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] AppVersionString(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).AppVersionString()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] nanoTime(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(((SISystem) this.javaUserdata).nanoTime()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] switchFullscreen(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).switchFullscreen(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] hideStatusBar(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).hideStatusBar();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showStatusBar(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).showStatusBar();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] changeBright(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).changeBright(luaValueArr[0].toInt(), (luaValueArr.length <= 1 || !luaValueArr[1].isBoolean()) ? null : Boolean.valueOf(luaValueArr[1].toBoolean()));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getBright(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.valueOf(((SISystem) this.javaUserdata).getBright()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isDarkMode(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((SISystem) this.javaUserdata).isDarkMode() ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] appChannelId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).appChannelId()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getConfig(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaString.copydefault(((SISystem) this.javaUserdata).getConfig((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] runGC(LuaValue[] luaValueArr) {
        ((SISystem) this.javaUserdata).runGC();
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
            ((SISystem) t).AEQbTJ();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
