package com.okinc.im.menu;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class IMMenuItem {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IMMenuItem[] $VALUES;
    public static final IMMenuItem SCAN = new IMMenuItem("SCAN", 0);
    public static final IMMenuItem NEW_CHAT = new IMMenuItem("NEW_CHAT", 1);
    public static final IMMenuItem ADD_CONTACTS = new IMMenuItem("ADD_CONTACTS", 2);
    public static final IMMenuItem MARK_ALL_READ = new IMMenuItem("MARK_ALL_READ", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IMMenuItem[] $values() {
        return new IMMenuItem[]{SCAN, NEW_CHAT, ADD_CONTACTS, MARK_ALL_READ};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IMMenuItem> getEntries() {
        return $ENTRIES;
    }

    private IMMenuItem(String str, int i) {
    }

    static {
        IMMenuItem[] iMMenuItemArr$values = $values();
        $VALUES = iMMenuItemArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iMMenuItemArr$values);
    }

    public static IMMenuItem valueOf(String str) {
        return (IMMenuItem) Enum.valueOf(IMMenuItem.class, str);
    }

    public static IMMenuItem[] values() {
        return (IMMenuItem[]) $VALUES.clone();
    }
}
