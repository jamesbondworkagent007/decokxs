package com.okinc.wholesale.picker;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import o.C60039zuO;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class GrowthImageUpload_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setImageUploadConfig", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, "cancelUploadFile", "uploadImage"};

    public GrowthImageUpload_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public GrowthImageUpload_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new GrowthImageUpload(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public GrowthImageUpload getJavaUserdata() {
        return (GrowthImageUpload) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setImageUploadConfig(LuaValue[] luaValueArr) {
        ((GrowthImageUpload) this.javaUserdata).setImageUploadConfig(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancel(LuaValue[] luaValueArr) {
        ((GrowthImageUpload) this.javaUserdata).cancel();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancelUploadFile(LuaValue[] luaValueArr) {
        ((GrowthImageUpload) this.javaUserdata).cancelUploadFile((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] uploadImage(LuaValue[] luaValueArr) {
        ((GrowthImageUpload) this.javaUserdata).uploadImage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (String[]) C60039zuO.EZpvd((luaValueArr.length <= 1 || !luaValueArr[1].isTable()) ? null : luaValueArr[1].toLuaTable(), String.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class));
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
            ((GrowthImageUpload) t).KWHzl();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
