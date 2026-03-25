package com.okinc.share.mln;

import java.util.Map;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class OKShareCustomParamsTransform extends LuaUserdata {
    public static final String[] copydefault = {"setCustomParamTransformCallback", "setLocalShareImagePath", "setShareImage", "updateShareParamExtras"};
    public String AEQbTJ;
    public LuaFunction EZpvd;
    public Map<String, Object> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void AEQbTJ(LuaValue[] luaValueArr) {
        this.AEQbTJ = null;
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, Object> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String copydefault() {
        return this.AEQbTJ;
    }

    @InterfaceC60044zuT
    public LuaValue[] setShareImage(LuaValue[] luaValueArr) {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.share.mln.OKShareCustomParamsTransform */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public OKShareCustomParamsTransform(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        AEQbTJ(luaValueArr);
        this.javaUserdata = this;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCustomParamTransformCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.EZpvd = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLocalShareImagePath(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1 || !luaValueArr[0].isString()) {
            return null;
        }
        this.AEQbTJ = luaValueArr[0].toJavaString();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] updateShareParamExtras(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        this.KWHzl = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
        return null;
    }

    public void copydefault(String str) {
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.copydefault(str);
        }
    }
}
