package org.luaj.vm2;

import java.io.File;
import o.C7318aha;
import o.InterfaceC60044zuT;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class LuaFunction extends NLuaValue {
    public InvokeError KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ Globals getGlobals() {
        return super.getGlobals();
    }

    public native void nativeInvokeB(long j, long j2, boolean z);

    public native void nativeInvokeBB(long j, long j2, boolean z, boolean z2);

    public native void nativeInvokeN(long j, long j2, double d);

    public native void nativeInvokeNN(long j, long j2, double d, double d2);

    public native void nativeInvokeS(long j, long j2, String str);

    public native void nativeInvokeSS(long j, long j2, String str, String str2);

    public native void nativeInvokeT(long j, long j2, long j3);

    public native void nativeInvokeTT(long j, long j2, long j3, long j4);

    public native void nativeInvokeU(long j, long j2, long j3);

    public native void nativeInvokeUD(long j, long j2, LuaUserdata<?> luaUserdata);

    public native void nativeInvokeUDU(long j, long j2, LuaUserdata<?> luaUserdata, long j3);

    public native void nativeInvokeUDUD(long j, long j2, LuaUserdata<?> luaUserdata, LuaUserdata<?> luaUserdata2);

    public native void nativeInvokeUU(long j, long j2, long j3, long j4);

    public native void nativeInvokeUUD(long j, long j2, long j3, LuaUserdata<?> luaUserdata);

    public native void nativeInvokeV(long j, long j2);

    @Override // org.luaj.vm2.LuaValue
    public final LuaFunction toLuaFunction() {
        return this;
    }

    @Override // org.luaj.vm2.LuaValue
    public final int type() {
        return 6;
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // org.luaj.vm2.NLuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @InterfaceC60044zuT
    public LuaFunction(long j, long j2) {
        super(j, j2);
    }

    @Override // org.luaj.vm2.LuaValue
    public final LuaValue[] invoke(LuaValue[] luaValueArr, int i) throws InvokeError {
        try {
            if (!EZpvd()) {
                return LuaValue.empty();
            }
            LuaValue[] luaValueArr_invoke = LuaCApi._invoke(this.globals.AYXKKw, this.nativeGlobalKey, luaValueArr, i);
            this.globals.fetchVPNInfo--;
            return luaValueArr_invoke;
        } catch (InvokeError e) {
            OLrzqt(e);
            return LuaValue.empty();
        }
    }

    @Override // org.luaj.vm2.LuaValue
    public final LuaValue[] invoke(LuaValue[] luaValueArr) throws InvokeError {
        return invoke(luaValueArr, -1);
    }

    @Override // org.luaj.vm2.LuaValue
    public final int dump(String str) {
        if (this.globals.isDestroyed()) {
            return -2;
        }
        File parentFile = new File(str).getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            return LuaCApi._dumpFunction(this.globals.AYXKKw, this.nativeGlobalKey, str);
        }
        return -3;
    }

    public final void OLrzqt() {
        try {
            if (EZpvd()) {
                nativeInvokeV(this.globals.AYXKKw, this.nativeGlobalKey);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public final void KWHzl(boolean z) {
        try {
            if (EZpvd()) {
                nativeInvokeB(this.globals.AYXKKw, this.nativeGlobalKey, z);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public final void EZpvd(double d) {
        try {
            if (EZpvd()) {
                nativeInvokeN(this.globals.AYXKKw, this.nativeGlobalKey, d);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public final void copydefault(String str) {
        try {
            if (EZpvd()) {
                nativeInvokeS(this.globals.AYXKKw, this.nativeGlobalKey, str);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public final void AEQbTJ(LuaValue luaValue) {
        OLrzqt(luaValue);
        try {
            if (EZpvd()) {
                if (luaValue.isNil() || luaValue.isTable()) {
                    nativeInvokeT(this.globals.AYXKKw, this.nativeGlobalKey, luaValue.nativeGlobalKey);
                } else {
                    long j = luaValue.nativeGlobalKey;
                    if (j == -1) {
                        nativeInvokeUD(this.globals.AYXKKw, this.nativeGlobalKey, luaValue.toUserdata());
                    } else {
                        nativeInvokeU(this.globals.AYXKKw, this.nativeGlobalKey, j);
                    }
                }
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public void AEQbTJ(double d, double d2) {
        try {
            if (EZpvd()) {
                nativeInvokeNN(this.globals.AYXKKw, this.nativeGlobalKey, d, d2);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public void EZpvd(String str, String str2) {
        try {
            if (EZpvd()) {
                nativeInvokeSS(this.globals.AYXKKw, this.nativeGlobalKey, str, str2);
                this.globals.fetchVPNInfo--;
            }
        } catch (InvokeError e) {
            OLrzqt(e);
        }
    }

    public final void OLrzqt(LuaValue luaValue) {
        if (luaValue.isNil() || luaValue.isTable() || luaValue.isUserdata()) {
            return;
        }
        throw new IllegalArgumentException("只能传入table、userdata或nil，当前为:" + luaValue);
    }

    public boolean EZpvd() {
        if (this.globals.isDestroyed()) {
            this.KWHzl = new InvokeError("globals is destroyed.", 2);
            if (C7318aha.copydefault || this.globals.fIwbmz() == 100) {
                throw this.KWHzl;
            }
            return false;
        }
        if (!checkStateByNative()) {
            this.KWHzl = new InvokeError("function is destroyed.", 1);
            if (C7318aha.copydefault || this.globals.fIwbmz() == 100) {
                throw this.KWHzl;
            }
            return false;
        }
        this.globals.AkhnZx();
        this.KWHzl = null;
        this.globals.fetchVPNInfo++;
        return true;
    }

    @Override // org.luaj.vm2.LuaValue
    public final boolean isDestroyed() {
        return this.globals.isDestroyed() || !checkStateByNative();
    }

    public final void OLrzqt(InvokeError invokeError) {
        this.KWHzl = invokeError;
        Globals globals = this.globals;
        globals.fetchVPNInfo--;
        if (globals.fIwbmz() == 100 || !C7318aha.OLrzqt(invokeError, this.globals)) {
            throw invokeError;
        }
    }

    public String copydefault() {
        if (isDestroyed()) {
            return null;
        }
        return LuaCApi._getFunctionSource(this.globals.AYXKKw, this.nativeGlobalKey);
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        if (C7318aha.copydefault) {
            return super.toString() + "--" + copydefault();
        }
        return super.toString();
    }
}
