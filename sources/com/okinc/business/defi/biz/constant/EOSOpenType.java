package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EOSOpenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EOSOpenType[] $VALUES;
    public static final EOSOpenType SelfOpen = new EOSOpenType("SelfOpen", 0);
    public static final EOSOpenType FriendOpen = new EOSOpenType("FriendOpen", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EOSOpenType[] $values() {
        return new EOSOpenType[]{SelfOpen, FriendOpen};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EOSOpenType> getEntries() {
        return $ENTRIES;
    }

    private EOSOpenType(String str, int i) {
    }

    static {
        EOSOpenType[] eOSOpenTypeArr$values = $values();
        $VALUES = eOSOpenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eOSOpenTypeArr$values);
    }

    public static EOSOpenType valueOf(String str) {
        return (EOSOpenType) Enum.valueOf(EOSOpenType.class, str);
    }

    public static EOSOpenType[] values() {
        return (EOSOpenType[]) $VALUES.clone();
    }
}
