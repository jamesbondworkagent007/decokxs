package com.okinc.unify_trade.utils.sky_log;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.okinc.base.uploadlog.UpLoadLogException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SkyLog {
    public static final SkyLog copydefault = new SkyLog();

    private SkyLog() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.utils.sky_log.SkyLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i$default(SkyLog skyLog, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        skyLog.EZpvd(str, str2, map);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl(str, str2, map, "I");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.utils.sky_log.SkyLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void w$default(SkyLog skyLog, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        skyLog.KWHzl(str, str2, map);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl(str, str2, map, ExifInterface.LONGITUDE_WEST);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.utils.sky_log.SkyLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e$default(SkyLog skyLog, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        skyLog.OLrzqt(str, str2, map);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl(str, str2, map, "E");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.utils.sky_log.SkyLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void postLog$default(SkyLog skyLog, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        skyLog.KWHzl(str, str2, map, str3);
    }

    public final void KWHzl(String str, String str2, Map<String, String> map, String str3) {
        try {
            C6777aVl.Companion.EZpvd(new UpLoadLogException(copydefault(str, str2, map, str3)));
        } catch (Exception e) {
            e.printStackTrace();
            pUU.valueOf("SkyLog", String.valueOf(e.getMessage()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.utils.sky_log.SkyLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String formatMessage$default(SkyLog skyLog, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return skyLog.copydefault(str, str2, map, str3);
    }

    public final String copydefault(String str, String str2, Map<String, String> map, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", str);
        linkedHashMap.put("report_key", str + "_" + str2);
        linkedHashMap.put("log_params", String.valueOf(map));
        linkedHashMap.put("log_level", str3);
        String json = new Gson().toJson(linkedHashMap);
        Intrinsics.copydefault((Object) json);
        pUU.valueOf("SkyLog", json);
        return json;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class SkyLogException extends Exception {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkyLogException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
