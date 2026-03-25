package com.immomo.mls.fun.ud.okhttp.upload;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
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
public class OKMediaUploader_udwrapper extends JavaUserdata {
    public static final String[] methods = {"cancelUploadFile", "uploadFileToTargetUrl", "uploadFile", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "configIgnoreAuthorization", "setSubdomainStrategy"};

    public OKMediaUploader_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OKMediaUploader_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OKMediaUploader(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OKMediaUploader getJavaUserdata() {
        return (OKMediaUploader) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancelUploadFile(LuaValue[] luaValueArr) {
        ((OKMediaUploader) this.javaUserdata).cancelUploadFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] uploadFileToTargetUrl(LuaValue[] luaValueArr) {
        ((OKMediaUploader) this.javaUserdata).uploadFileToTargetUrl((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[3], Map.class), (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[4], InterfaceC7835arN.class), (luaValueArr.length <= 5 || luaValueArr[5].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[5], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] uploadFile(LuaValue[] luaValueArr) {
        ((OKMediaUploader) this.javaUserdata).uploadFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        return ((OKMediaUploader) this.javaUserdata).cancel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] configIgnoreAuthorization(LuaValue[] luaValueArr) {
        ((OKMediaUploader) this.javaUserdata).configIgnoreAuthorization();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setSubdomainStrategy(LuaValue[] luaValueArr) {
        return ((OKMediaUploader) this.javaUserdata).setSubdomainStrategy((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
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
            ((OKMediaUploader) t).KWHzl();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
