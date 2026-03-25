package com.okinc.business.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PathType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PathType[] $VALUES;
    public static final PathType SWAP = new PathType("SWAP", 0);
    public static final PathType BRIDGE = new PathType("BRIDGE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PathType[] $values() {
        return new PathType[]{SWAP, BRIDGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PathType> getEntries() {
        return $ENTRIES;
    }

    private PathType(String str, int i) {
    }

    static {
        PathType[] pathTypeArr$values = $values();
        $VALUES = pathTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pathTypeArr$values);
    }

    public static PathType valueOf(String str) {
        return (PathType) Enum.valueOf(PathType.class, str);
    }

    public static PathType[] values() {
        return (PathType[]) $VALUES.clone();
    }
}
