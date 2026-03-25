package com.okinc.kyc.api.biz.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AlifaceVersion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlifaceVersion[] $VALUES;
    public static final AlifaceVersion CN = new AlifaceVersion("CN", 0);
    public static final AlifaceVersion GLOBAL = new AlifaceVersion("GLOBAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlifaceVersion[] $values() {
        return new AlifaceVersion[]{CN, GLOBAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlifaceVersion> getEntries() {
        return $ENTRIES;
    }

    private AlifaceVersion(String str, int i) {
    }

    static {
        AlifaceVersion[] alifaceVersionArr$values = $values();
        $VALUES = alifaceVersionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alifaceVersionArr$values);
    }

    public static AlifaceVersion valueOf(String str) {
        return (AlifaceVersion) Enum.valueOf(AlifaceVersion.class, str);
    }

    public static AlifaceVersion[] values() {
        return (AlifaceVersion[]) $VALUES.clone();
    }
}
