package com.okinc.components.security.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class SecurityEventType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SecurityEventType[] $VALUES;
    public static final SecurityEventType ACCESSIBILITY_CLICK = new SecurityEventType("ACCESSIBILITY_CLICK", 0);
    public static final SecurityEventType GESTURE_CLICK = new SecurityEventType("GESTURE_CLICK", 1);
    public static final SecurityEventType OVERLAY_CLICK = new SecurityEventType("OVERLAY_CLICK", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SecurityEventType[] $values() {
        return new SecurityEventType[]{ACCESSIBILITY_CLICK, GESTURE_CLICK, OVERLAY_CLICK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SecurityEventType> getEntries() {
        return $ENTRIES;
    }

    private SecurityEventType(String str, int i) {
    }

    static {
        SecurityEventType[] securityEventTypeArr$values = $values();
        $VALUES = securityEventTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(securityEventTypeArr$values);
    }

    public static SecurityEventType valueOf(String str) {
        return (SecurityEventType) Enum.valueOf(SecurityEventType.class, str);
    }

    public static SecurityEventType[] values() {
        return (SecurityEventType[]) $VALUES.clone();
    }
}
