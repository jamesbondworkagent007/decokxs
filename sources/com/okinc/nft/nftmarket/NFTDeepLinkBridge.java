package com.okinc.nft.nftmarket;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.ContainerUtils;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.HashMap;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class NFTDeepLinkBridge {
    public static final String LUA_CLASS_NAME = "OKIOSDeepLink";
    public static boolean isShowPending = false;
    public static String lastUrl = null;
    public static String txHash = "";
    public Globals globals;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void copydefault(String str) {
        lastUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public void clearData() {
        lastUrl = null;
    }

    public NFTDeepLinkBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public String getUrl() {
        return TextUtils.isEmpty(lastUrl) ? "" : lastUrl;
    }

    @LuaBridge
    public int getDeepLinkType() {
        if (TextUtils.isEmpty(lastUrl)) {
            return -1;
        }
        if (lastUrl.contains("nft/ranking")) {
            return 1;
        }
        if (lastUrl.contains("nft/creation")) {
            return 2;
        }
        if (lastUrl.contains("nft/search")) {
            return 3;
        }
        if (lastUrl.contains("nft/market/details")) {
            return 4;
        }
        if (lastUrl.contains("nft/primary/details")) {
            return 5;
        }
        if (lastUrl.contains("nft/collection")) {
            return 6;
        }
        if (lastUrl.contains("nft/market")) {
            return 7;
        }
        if (lastUrl.contains("nft/primary")) {
            return 8;
        }
        return lastUrl.contains("nft/featured") ? 9 : 0;
    }

    @LuaBridge
    public HashMap<String, String> getDeepLinkParams() {
        int iIndexOf;
        HashMap<String, String> map = new HashMap<>();
        if (TextUtils.isEmpty(lastUrl) || (iIndexOf = lastUrl.indexOf("?")) < 0) {
            return map;
        }
        for (String str : lastUrl.substring(iIndexOf + 1).split(ContainerUtils.FIELD_DELIMITER)) {
            String[] strArrSplit = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map;
    }
}
