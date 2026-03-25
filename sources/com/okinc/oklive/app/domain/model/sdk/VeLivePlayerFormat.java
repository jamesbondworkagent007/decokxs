package com.okinc.oklive.app.domain.model.sdk;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class VeLivePlayerFormat {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VeLivePlayerFormat[] $VALUES;
    public static final VeLivePlayerFormat FLV = new VeLivePlayerFormat("FLV", 0);
    public static final VeLivePlayerFormat HLS = new VeLivePlayerFormat("HLS", 1);
    public static final VeLivePlayerFormat RTM = new VeLivePlayerFormat("RTM", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VeLivePlayerFormat[] $values() {
        return new VeLivePlayerFormat[]{FLV, HLS, RTM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VeLivePlayerFormat> getEntries() {
        return $ENTRIES;
    }

    private VeLivePlayerFormat(String str, int i) {
    }

    static {
        VeLivePlayerFormat[] veLivePlayerFormatArr$values = $values();
        $VALUES = veLivePlayerFormatArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(veLivePlayerFormatArr$values);
    }

    public static VeLivePlayerFormat valueOf(String str) {
        return (VeLivePlayerFormat) Enum.valueOf(VeLivePlayerFormat.class, str);
    }

    public static VeLivePlayerFormat[] values() {
        return (VeLivePlayerFormat[]) $VALUES.clone();
    }
}
