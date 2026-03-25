package com.immomo.mls.fun.ud.okhttp;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.util.List;
import java.util.Map;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class OkUDHttp_udwrapper extends JavaUserdata {
    public static final String[] methods = {"post", "get", "shouldUseTime", "download", "upload", "setCryptoUseBody", "setVerifyToken", "setSubdomainStrategy", "setExtHeader", "setTimeout", "configCache", "configIgnoreAuthorization", "loadFromCache", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "rawResponse", "isFromCache", "getOffsite", "postOffsite"};

    public OkUDHttp_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OkUDHttp_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OkUDHttp(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OkUDHttp getJavaUserdata() {
        return (OkUDHttp) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] post(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).post((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] get(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).get((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] shouldUseTime(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).shouldUseTime(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] download(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).download((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] upload(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).upload((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (List) C8017aul.AEQbTJ(luaValueArr[2], List.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (List) C8017aul.AEQbTJ(luaValueArr[3], List.class), (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[4], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCryptoUseBody(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).setCryptoUseBody(luaValueArr[0].toBoolean());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setVerifyToken(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).setVerifyToken((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setSubdomainStrategy(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).setSubdomainStrategy((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setExtHeader(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).setExtHeader((luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[0], Map.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setTimeout(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).setTimeout(luaValueArr[0].toInt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] configCache(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).configCache(luaValueArr[0].toInt(), luaValueArr[1].toInt(), luaValueArr[2].toBoolean(), luaValueArr[3].toBoolean());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] configIgnoreAuthorization(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).configIgnoreAuthorization();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] loadFromCache(LuaValue[] luaValueArr) {
        Map map = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && !luaValueArr[1].isNil()) {
            map = (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class);
        }
        return ((OkUDHttp) this.javaUserdata).loadFromCache(javaString, map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).cancel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] rawResponse(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).rawResponse();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isFromCache(LuaValue[] luaValueArr) {
        return ((OkUDHttp) this.javaUserdata).isFromCache();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getOffsite(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).getOffsite((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[2], Map.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] postOffsite(LuaValue[] luaValueArr) {
        ((OkUDHttp) this.javaUserdata).postOffsite((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[2], Map.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class));
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
            ((OkUDHttp) t).AEQbTJ();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
