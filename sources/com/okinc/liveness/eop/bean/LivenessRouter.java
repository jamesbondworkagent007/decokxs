package com.okinc.liveness.eop.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LivenessRouter {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LivenessRouter[] $VALUES;
    private final String vendorName;
    public static final LivenessRouter AWS = new LivenessRouter("AWS", 0, "aws");
    public static final LivenessRouter ALI = new LivenessRouter("ALI", 1, "ali");
    public static final LivenessRouter LCA = new LivenessRouter("LCA", 2, "lca");
    public static final LivenessRouter EFR = new LivenessRouter("EFR", 3, "efr");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LivenessRouter[] $values() {
        return new LivenessRouter[]{AWS, ALI, LCA, EFR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LivenessRouter> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVendorName() {
        return this.vendorName;
    }

    private LivenessRouter(String str, int i, String str2) {
        this.vendorName = str2;
    }

    static {
        LivenessRouter[] livenessRouterArr$values = $values();
        $VALUES = livenessRouterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(livenessRouterArr$values);
    }

    public static LivenessRouter valueOf(String str) {
        return (LivenessRouter) Enum.valueOf(LivenessRouter.class, str);
    }

    public static LivenessRouter[] values() {
        return (LivenessRouter[]) $VALUES.clone();
    }
}
