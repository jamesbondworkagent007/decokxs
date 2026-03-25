package com.okinc.environment;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AppSiteType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppSiteType[] $VALUES;
    public static final AppSiteType OKEX = new AppSiteType("OKEX", 0, "okex");
    public static final AppSiteType OKCOIN = new AppSiteType("OKCOIN", 1, "okcoin");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppSiteType[] $values() {
        return new AppSiteType[]{OKEX, OKCOIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppSiteType> getEntries() {
        return $ENTRIES;
    }

    private AppSiteType(String str, int i, String str2) {
    }

    static {
        AppSiteType[] appSiteTypeArr$values = $values();
        $VALUES = appSiteTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appSiteTypeArr$values);
    }

    public static AppSiteType valueOf(String str) {
        return (AppSiteType) Enum.valueOf(AppSiteType.class, str);
    }

    public static AppSiteType[] values() {
        return (AppSiteType[]) $VALUES.clone();
    }
}
