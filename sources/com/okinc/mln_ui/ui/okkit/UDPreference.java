package com.okinc.mln_ui.ui.okkit;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.Locale;
import o.C33512mxp;
import o.C38303pTu;
import o.C43154rjt;
import o.C43251rlk;
import o.C7911ask;
import o.InterfaceC46557tYt;
import o.pSC;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDPreference {
    public static final String LUA_CLASS_NAME = "Preference";
    public Globals globals;

    @LuaBridge
    public int property;

    public UDPreference(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaValue[] themeDay(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(!C7911ask.OLrzqt(this.globals));
    }

    @LuaBridge
    public LuaValue[] riseFallCycle(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(((InterfaceC46557tYt) C43251rlk.copydefault(InterfaceC46557tYt.class)).EZpvd());
    }

    @LuaBridge
    public LuaValue[] languageType(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C43154rjt.OLrzqt.OLrzqt());
    }

    @LuaBridge
    public LuaValue[] isCH(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(C38303pTu.KWHzl(pSC.AEQbTJ.AEQbTJ()));
    }

    @LuaBridge
    public LuaValue[] isCHS(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(C38303pTu.OLrzqt(pSC.AEQbTJ.AEQbTJ()));
    }

    @LuaBridge
    public LuaValue[] isEN(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(C38303pTu.copydefault(Locale.getDefault()));
    }

    @LuaBridge
    public LuaValue[] riseRed(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(C33512mxp.AEQbTJ.isConnected() != 0);
    }

    @LuaBridge
    public LuaValue[] colorTheme(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C33512mxp.AEQbTJ.AYXKKw());
    }

    @LuaBridge
    public LuaValue[] getCurrentLanguage(LuaValue[] luaValueArr) {
        return LuaValue.rString(pSC.AEQbTJ.KWHzl());
    }
}
