package com.okinc.share.mln;

import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class OKShareEditor extends LuaUserdata {
    public static final String[] copydefault = {"editorIdentifier", "editorAnalyticsName", "editorName", "editorCellStyle", "enabled", "selected", "setDoEditCallback", "setUndoEditCallback"};
    public LuaFunction AEQbTJ;
    public LuaFunction AYXKKw;
    public String AhwBna;
    public String EZpvd;
    public int KWHzl;
    public String OLrzqt;
    public boolean djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void AEQbTJ(LuaValue[] luaValueArr) {
        this.OLrzqt = "";
        this.EZpvd = "";
        this.AhwBna = "";
        this.KWHzl = 1;
        this.djBIcL = true;
        this.gEmmrt = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void copydefault(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.share.mln.OKShareEditor */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public OKShareEditor(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        AEQbTJ(luaValueArr);
        this.javaUserdata = this;
    }

    @InterfaceC60044zuT
    public LuaValue[] editorIdentifier(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            AEQbTJ(luaValueArr[0].toJavaString());
            return null;
        }
        return LuaValue.rString(EZpvd());
    }

    @InterfaceC60044zuT
    public LuaValue[] editorAnalyticsName(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            KWHzl(luaValueArr[0].toJavaString());
            return null;
        }
        return LuaValue.rString(OLrzqt());
    }

    @InterfaceC60044zuT
    public LuaValue[] editorName(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            copydefault(luaValueArr[0].toJavaString());
            return null;
        }
        return LuaValue.rString(AYXKKw());
    }

    @InterfaceC60044zuT
    public LuaValue[] editorCellStyle(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            AEQbTJ(luaValueArr[0].toInt());
            return null;
        }
        return LuaValue.rNumber(copydefault());
    }

    @InterfaceC60044zuT
    public LuaValue[] enabled(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            copydefault(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(gEmmrt());
    }

    @InterfaceC60044zuT
    public LuaValue[] selected(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 1) {
            EZpvd(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(AhwBna());
    }

    @InterfaceC60044zuT
    public LuaValue[] setDoEditCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setUndoEditCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1 || !luaValueArr[0].isFunction()) {
            return null;
        }
        this.AYXKKw = luaValueArr[0].toLuaFunction();
        return null;
    }

    public void AEQbTJ() {
        LuaFunction luaFunction = this.AEQbTJ;
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }

    public void KWHzl() {
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
    }
}
