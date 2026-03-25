package com.okinc.biz.util;

import com.okinc.core.util.SPUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SiteSPUtils {
    public static final int $stable = 0;
    public static final SiteSPUtils INSTANCE = new SiteSPUtils();

    private SiteSPUtils() {
    }

    public static /* synthetic */ void put$default(SiteSPUtils siteSPUtils, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        siteSPUtils.put(str, obj, str2, str3);
    }

    public final void put(@NotNull String str, Object obj, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, obj, getSiteFileName(str2, str3));
    }

    public static /* synthetic */ String getString$default(SiteSPUtils siteSPUtils, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return siteSPUtils.getString(str, str2, str3, str4);
    }

    public final String getString(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String string = SPUtils.getString(str, str2, getSiteFileName(str3, str4));
        return string == null ? str2 : string;
    }

    public final <ItemType> ArrayList<ItemType> getArrayList(@NotNull String str, @NotNull Class<ItemType> cls, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.getArrayList(str, cls, getSiteFileName(str2, str3));
    }

    public static /* synthetic */ boolean clear$default(SiteSPUtils siteSPUtils, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return siteSPUtils.clear(str, str2);
    }

    public final boolean clear(String str, String str2) {
        return SPUtils.clear(getSiteFileName(str, str2));
    }

    public static /* synthetic */ String getSiteFileName$default(SiteSPUtils siteSPUtils, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return siteSPUtils.getSiteFileName(str, str2);
    }

    private final String getSiteFileName(String str, String str2) {
        if (str2 == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            return str;
        }
        if (str == null) {
            str = "config";
        }
        return str + ":" + str2;
    }
}
