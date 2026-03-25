package com.okinc.business.defi.dapp.bridge;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.HashMap;
import java.util.Objects;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@LuaClass
public class DappDeepLinkBridge {
    public static final String LUA_CLASS_NAME = "OKDAppDeepLink";
    public static HashMap<String, String> lastParams;
    public static String lastUrl;
    public Globals globals;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void KWHzl(String str, HashMap<String, String> map) {
        lastUrl = str;
        lastParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void clearData() {
        lastUrl = null;
    }

    public DappDeepLinkBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public int getDeepLinkType() {
        if (TextUtils.isEmpty(lastUrl)) {
            return -1;
        }
        if (Objects.equals(lastUrl, "dapp/details")) {
            return 1;
        }
        return lastUrl.equals("dapp") ? 2 : 0;
    }

    @LuaBridge
    public HashMap<String, String> getDeepLinkParams() {
        HashMap<String, String> map = lastParams;
        return map == null ? new HashMap<>() : map;
    }
}
