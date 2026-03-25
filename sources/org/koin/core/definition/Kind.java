package org.koin.core.definition;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class Kind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Kind[] $VALUES;
    public static final Kind Singleton = new Kind("Singleton", 0);
    public static final Kind Factory = new Kind("Factory", 1);
    public static final Kind Scoped = new Kind("Scoped", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Kind[] $values() {
        return new Kind[]{Singleton, Factory, Scoped};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Kind> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Kind valueOf(String str) {
        return (Kind) Enum.valueOf(Kind.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Kind[] values() {
        return (Kind[]) $VALUES.clone();
    }

    private Kind(String str, int i) {
    }

    static {
        Kind[] kindArr$values = $values();
        $VALUES = kindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kindArr$values);
    }
}
