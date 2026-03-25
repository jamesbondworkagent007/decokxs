package com.okinc.mlnservice.sse;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class OKGrowthSSETool_udwrapper extends LuaUserdata {
    public static final String[] methods = {TtmlNode.START, "stop", "isActive", "connectionState"};

    public OKGrowthSSETool_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OKGrowthSSETool_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OKGrowthSSETool(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OKGrowthSSETool getJavaUserdata() {
        return (OKGrowthSSETool) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] start(LuaValue[] luaValueArr) {
        InterfaceC7835arN interfaceC7835arN = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        Map<String, Object> map = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class);
        InterfaceC7835arN interfaceC7835arN2 = (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class);
        if (luaValueArr.length > 3 && !luaValueArr[3].isNil()) {
            interfaceC7835arN = (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class);
        }
        return LuaValue.varargsOf(((OKGrowthSSETool) this.javaUserdata).start(javaString, map, interfaceC7835arN2, interfaceC7835arN));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stop(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthSSETool) this.javaUserdata).stop());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isActive(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthSSETool) this.javaUserdata).isActive());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] connectionState(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthSSETool) this.javaUserdata).connectionState());
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
            ((OKGrowthSSETool) t).copydefault();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
