package com.okinc.mln_ui.ui;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.ArrayList;
import java.util.Map;
import o.C33134mqi;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class OkexLuaNav {
    public int AEQbTJ = 101;

    @LuaBridge
    public int EZpvd;
    public Globals OLrzqt;

    public OkexLuaNav(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.OLrzqt = globals;
    }

    @LuaBridge
    public void methodA() {
        C33134mqi.AEQbTJ("methodA:");
    }

    @LuaBridge(alias = "methodC")
    public String[] methodB(int i, boolean z, String str, InterfaceC8029auy interfaceC8029auy, LuaValue luaValue) {
        C33134mqi.AEQbTJ("methodB:");
        return null;
    }

    @LuaBridge
    public void gotoPage(String str, Map map, int i) {
        if (str.equals("Support") || str.equals("LoginVC") || str.equals("UserCenterVC") || !str.equals("About")) {
            return;
        }
        new ArrayList().add(Uri.parse("android.resource://com.okinc.okex/raw/about_okex_cn"));
    }
}
