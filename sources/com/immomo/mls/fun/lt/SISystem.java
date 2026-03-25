package com.immomo.mls.fun.lt;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.util.NetworkUtil;
import com.okinc.core.util.SPUtils;
import java.lang.ref.WeakReference;
import o.C32856mlV;
import o.C32935mmv;
import o.C34703nhO;
import o.C48787ucK;
import o.C7322ahe;
import o.C7326ahi;
import o.C7330ahm;
import o.C7350aiF;
import o.C7840arS;
import o.C7857arj;
import o.C7859arl;
import o.C7865arr;
import o.C7911ask;
import o.InterfaceC8029auy;
import o.pUU;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SISystem implements C7859arl.StateListAnimator {
    public static final int INVALIDA_BRIGHT_VALUE = -1;
    public static final String KEY = "System";
    public Context context;
    public Globals globals;
    public Activity mBrightnessObserver;
    public LuaFunction networkStateCallback;
    public final Object tag = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Object copydefault() {
        return this.tag;
    }

    @LuaBridge
    public boolean Android() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Context EZpvd() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public String SDKVersion() {
        return "1.6.0";
    }

    @LuaBridge
    public int SDKVersionInt() {
        return 43;
    }

    @LuaBridge
    @Deprecated
    public int homeIndicatorHeight() {
        return 0;
    }

    @LuaBridge
    public boolean iOS() {
        return false;
    }

    @LuaBridge
    @Deprecated
    public int tabBarHeight() {
        return 0;
    }

    public SISystem(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
        this.context = ((C7322ahe) globals.AuCTel()).AEQbTJ;
    }

    public void AEQbTJ() {
        C7840arS.EZpvd(copydefault());
        NetworkUtil.AEQbTJ(EZpvd(), this);
        this.globals = null;
        this.context = null;
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.networkStateCallback = null;
    }

    @LuaBridge
    public String OSVersion() {
        return C7857arj.copydefault();
    }

    @LuaBridge
    public int OSVersionInt() {
        return C7857arj.AYXKKw();
    }

    @LuaBridge(alias = "deviceInfo")
    public String platform() {
        return C7857arj.OLrzqt();
    }

    @LuaBridge
    public float scale() {
        return C7857arj.OLrzqt(EZpvd());
    }

    @LuaBridge
    public boolean isDebug() {
        return SPUtils.getBoolean("lua_debug_mode", false, "mln");
    }

    @LuaBridge
    public boolean isDebugKey() {
        return SPUtils.getBoolean("lua_debug_key_mode", false, "mln");
    }

    @LuaBridge
    public String getAppsflyerDeeplinkParam(String str) {
        return C32856mlV.OLrzqt.copydefault(str);
    }

    @LuaBridge
    public String getAppsflyerAttributionParam(String str) {
        return C32856mlV.OLrzqt.AEQbTJ(str);
    }

    @LuaBridge
    public LuaTable device() {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(this.globals);
        luaTableAEQbTJ.set("device", C7857arj.EZpvd());
        luaTableAEQbTJ.set("brand", C7857arj.KWHzl());
        luaTableAEQbTJ.set("product", C7857arj.valueOf());
        luaTableAEQbTJ.set("manufacturer", C7857arj.AEQbTJ());
        int[] iArrFetchVPNInfo = C7857arj.fetchVPNInfo(EZpvd());
        luaTableAEQbTJ.set("window_width", iArrFetchVPNInfo[0]);
        luaTableAEQbTJ.set("window_height", iArrFetchVPNInfo[1]);
        luaTableAEQbTJ.set("nav_height", C7857arj.EZpvd(EZpvd()));
        luaTableAEQbTJ.set("bottom_nav_height", C7857arj.gEmmrt(EZpvd()));
        luaTableAEQbTJ.set("status_bar_height", C7857arj.isConnected(EZpvd()));
        return luaTableAEQbTJ;
    }

    @LuaBridge
    public C7350aiF screenSize() {
        return new C7350aiF((int) C7865arr.AEQbTJ(C7857arj.djBIcL(EZpvd())), (int) C7865arr.AEQbTJ(C7857arj.AhwBna(EZpvd())));
    }

    @LuaBridge
    @Deprecated
    public int navBarHeight() {
        if (EZpvd() != null) {
            return C7857arj.gEmmrt(EZpvd());
        }
        return 0;
    }

    @LuaBridge
    @Deprecated
    public int stateBarHeight() {
        if (C7330ahm.isConnected || EZpvd() == null) {
            return 0;
        }
        return C7857arj.isConnected(EZpvd());
    }

    /* JADX INFO: renamed from: com.immomo.mls.fun.lt.SISystem$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[NetworkUtil.NetworkType.values().length];
            EZpvd = iArr;
            try {
                iArr[NetworkUtil.NetworkType.NETWORK_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[NetworkUtil.NetworkType.NETWORK_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[NetworkUtil.NetworkType.NETWORK_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[NetworkUtil.NetworkType.NETWORK_WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @LuaBridge
    public int networkState() {
        int i = AnonymousClass5.EZpvd[NetworkUtil.copydefault(EZpvd()).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 1 : 3;
    }

    @LuaBridge
    public boolean asyncDoInMain(final InterfaceC8029auy interfaceC8029auy) {
        return this.globals.AEQbTJ(new Runnable() { // from class: com.immomo.mls.fun.lt.SISystem.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    interfaceC8029auy.KWHzl(new Object[0]);
                } catch (Exception unused) {
                }
            }
        });
    }

    @LuaBridge
    public void setOnNetworkStateChange(LuaFunction luaFunction) {
        LuaFunction luaFunction2 = this.networkStateCallback;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.networkStateCallback = luaFunction;
        NetworkUtil.KWHzl(EZpvd(), this);
    }

    @LuaBridge
    public void setTimeOut(final InterfaceC8029auy interfaceC8029auy, float f) {
        this.globals.AEQbTJ(new Runnable() { // from class: com.immomo.mls.fun.lt.SISystem.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    interfaceC8029auy.KWHzl(new Object[0]);
                } catch (Exception unused) {
                }
            }
        }, (long) (f * 1000.0f));
    }

    @LuaBridge
    public int AppVersion() {
        return C7857arj.copydefault(EZpvd());
    }

    @LuaBridge
    public String AppVersionString() {
        return C34703nhO.valueOf(EZpvd());
    }

    @LuaBridge
    public long nanoTime() {
        return System.nanoTime();
    }

    @LuaBridge
    @Deprecated
    public void switchFullscreen(boolean z) {
        Context contextEZpvd = EZpvd();
        if (contextEZpvd instanceof android.app.Activity) {
            C7857arj.AEQbTJ((android.app.Activity) contextEZpvd, z);
        }
    }

    @LuaBridge
    public void hideStatusBar() {
        switchFullscreen(true);
    }

    @LuaBridge
    public void showStatusBar() {
        switchFullscreen(false);
    }

    @Override // o.C7859arl.StateListAnimator
    public void values() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(1.0d));
        }
    }

    @Override // o.C7859arl.StateListAnimator
    public void DbNXlk() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(2.0d));
        }
    }

    @Override // o.C7859arl.StateListAnimator
    public void isConnected() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(3.0d));
        }
    }

    @LuaBridge
    public void changeBright(int i, @Nullable Boolean bool) {
        int iEZpvd;
        Context contextEZpvd = EZpvd();
        if ((contextEZpvd instanceof android.app.Activity) && (iEZpvd = EZpvd(i)) != -1 && bool != null && bool.booleanValue()) {
            KWHzl(contextEZpvd, iEZpvd);
        }
    }

    @LuaBridge
    public int getBright() {
        WindowManager.LayoutParams attributes;
        int iKWHzl = KWHzl();
        Context contextEZpvd = EZpvd();
        if (!(contextEZpvd instanceof android.app.Activity) || (attributes = ((android.app.Activity) contextEZpvd).getWindow().getAttributes()) == null) {
            return iKWHzl;
        }
        float f = attributes.screenBrightness;
        if (f < 0.0f) {
            return iKWHzl;
        }
        int iAbs = Math.abs((int) (f * 255.0f));
        if (iAbs >= 255) {
            iAbs = 255;
        }
        if (iAbs <= 1) {
            return 1;
        }
        return iAbs;
    }

    @LuaBridge
    public boolean isDarkMode() {
        return C7911ask.OLrzqt(this.globals);
    }

    @LuaBridge
    public String appChannelId() {
        return C32935mmv.KWHzl.copydefault("channel_id");
    }

    @LuaBridge
    public String getConfig(String str) {
        JsonElement jsonElement;
        JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("mlnconfig");
        return (jsonObjectAEQbTJ == null || (jsonElement = jsonObjectAEQbTJ.get(str)) == null) ? "" : jsonElement.getAsString();
    }

    @LuaBridge
    public void runGC() {
        Runtime.getRuntime().gc();
    }

    public final void KWHzl(Context context, int i) {
        if (Settings.System.canWrite(context)) {
            OLrzqt(context, i);
        } else {
            OLrzqt(context);
        }
    }

    public final void OLrzqt(Context context, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriFor = Settings.System.getUriFor("screen_brightness");
        Settings.System.putInt(contentResolver, "screen_brightness", i);
        contentResolver.notifyChange(uriFor, null);
    }

    public final void OLrzqt(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public final int EZpvd(int i) {
        Window window;
        WindowManager.LayoutParams attributes;
        Context context = this.context;
        if (context == null || !(context instanceof android.app.Activity) || (attributes = (window = ((android.app.Activity) context).getWindow()).getAttributes()) == null) {
            return -1;
        }
        if (i <= 1) {
            i = 1;
        }
        if (i >= 255) {
            i = 255;
        }
        attributes.screenBrightness = i / 255.0f;
        window.setAttributes(attributes);
        return i;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Activity extends ContentObserver {
        public WeakReference<SISystem> OLrzqt;

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            WeakReference<SISystem> weakReference = this.OLrzqt;
            SISystem sISystem = weakReference != null ? weakReference.get() : null;
            if (sISystem == null) {
                SISystem.EZpvd(null, this);
            } else {
                sISystem.EZpvd(sISystem.KWHzl());
            }
        }
    }

    public final int KWHzl() {
        try {
            return Settings.System.getInt(EZpvd().getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            pUU.copydefault("mln", Log.getStackTraceString(e));
            return 0;
        }
    }

    public static void EZpvd(Context context, ContentObserver contentObserver) {
        if (contentObserver == null) {
            return;
        }
        if (context == null) {
            context = C7326ahi.OLrzqt();
        }
        context.getContentResolver().unregisterContentObserver(contentObserver);
    }
}
