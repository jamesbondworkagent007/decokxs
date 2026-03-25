package com.okinc.ok_kyc_core.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class NavOptions {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NavOptions[] $VALUES;
    public static final NavOptions Default = new NavOptions("Default", 0);
    public static final NavOptions CleanBackStack = new NavOptions("CleanBackStack", 1);
    public static final NavOptions CleanBackStackWithNoAmin = new NavOptions("CleanBackStackWithNoAmin", 2);
    public static final NavOptions NoAnimation = new NavOptions("NoAnimation", 3);
    public static final NavOptions PopUtilDifferentDestination = new NavOptions("PopUtilDifferentDestination", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NavOptions[] $values() {
        return new NavOptions[]{Default, CleanBackStack, CleanBackStackWithNoAmin, NoAnimation, PopUtilDifferentDestination};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NavOptions> getEntries() {
        return $ENTRIES;
    }

    private NavOptions(String str, int i) {
    }

    static {
        NavOptions[] navOptionsArr$values = $values();
        $VALUES = navOptionsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(navOptionsArr$values);
    }

    public static NavOptions valueOf(String str) {
        return (NavOptions) Enum.valueOf(NavOptions.class, str);
    }

    public static NavOptions[] values() {
        return (NavOptions[]) $VALUES.clone();
    }
}
