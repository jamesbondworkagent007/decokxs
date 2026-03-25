package com.immomo.mls.fun.lt;

import android.content.Context;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.HashMap;
import java.util.Map;
import o.C34703nhO;
import o.C7322ahe;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SIApplication implements Globals.Application {
    public static final String LUA_CLASS_NAME = "Application";
    public static int SITE_OKX = 0;
    public static int SITE_OKXTR = 1;
    public static final Map<Globals, SIApplication> instance = new HashMap();
    public static boolean isColdBoot = false;
    public Context context;
    public Globals globals;
    public LuaFunction mAppearFunction;
    public LuaFunction mDisappearFunction;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public boolean isColdBoot() {
        return isColdBoot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Application { setForeground2BackgroundCallback, setBackground2ForegroundCallback, isColdBoot}";
    }

    public SIApplication(Globals globals) {
        this.globals = globals;
        this.context = ((C7322ahe) globals.AuCTel()).AEQbTJ;
    }

    @Override // org.luaj.vm2.Globals.Application
    public void AEQbTJ(Globals globals) {
        instance.remove(globals);
    }

    @LuaBridge
    public void setForeground2BackgroundCallback(LuaFunction luaFunction) {
        LuaFunction luaFunction2 = this.mDisappearFunction;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.mDisappearFunction = luaFunction;
        if (luaFunction != null) {
            instance.put(this.globals, this);
            this.globals.AEQbTJ(this);
            this.globals.KWHzl(this);
        }
    }

    @LuaBridge
    public void setBackground2ForegroundCallback(LuaFunction luaFunction) {
        LuaFunction luaFunction2 = this.mAppearFunction;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.mAppearFunction = luaFunction;
        if (luaFunction != null) {
            instance.put(this.globals, this);
            this.globals.AEQbTJ(this);
            this.globals.KWHzl(this);
        }
    }

    public void EZpvd() {
        LuaFunction luaFunction = this.mAppearFunction;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void AEQbTJ() {
        LuaFunction luaFunction = this.mDisappearFunction;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public static void copydefault(boolean z) {
        for (SIApplication sIApplication : instance.values()) {
            if (z) {
                sIApplication.EZpvd();
            } else {
                sIApplication.AEQbTJ();
            }
        }
        if (z) {
            return;
        }
        isColdBoot = false;
    }

    @LuaBridge
    public boolean isRtl() {
        return this.context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @LuaBridge
    public int getCurrentSite() {
        return C34703nhO.AEQbTJ() ? SITE_OKXTR : SITE_OKX;
    }

    @LuaBridge
    public boolean isOKWalletApp() {
        return C34703nhO.copydefault();
    }

    @LuaBridge
    public String getPackageName() {
        return C34703nhO.KWHzl(this.context);
    }
}
