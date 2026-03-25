package com.okinc.components.security.scanner;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class AccessibilityAppType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccessibilityAppType[] $VALUES;
    private final String value;
    public static final AccessibilityAppType SUS_TROJAN = new AccessibilityAppType("SUS_TROJAN", 0, "sus_trojan");
    public static final AccessibilityAppType MAL_TROJAN = new AccessibilityAppType("MAL_TROJAN", 1, "mal_trojan");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccessibilityAppType[] $values() {
        return new AccessibilityAppType[]{SUS_TROJAN, MAL_TROJAN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccessibilityAppType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private AccessibilityAppType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AccessibilityAppType[] accessibilityAppTypeArr$values = $values();
        $VALUES = accessibilityAppTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accessibilityAppTypeArr$values);
    }

    public static AccessibilityAppType valueOf(String str) {
        return (AccessibilityAppType) Enum.valueOf(AccessibilityAppType.class, str);
    }

    public static AccessibilityAppType[] values() {
        return (AccessibilityAppType[]) $VALUES.clone();
    }
}
