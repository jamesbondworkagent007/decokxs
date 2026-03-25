package com.reown.foundation.di;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class FoundationDITags {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FoundationDITags[] $VALUES;
    public static final FoundationDITags MOSHI = new FoundationDITags("MOSHI", 0);
    public static final FoundationDITags INTERCEPTOR = new FoundationDITags("INTERCEPTOR", 1);
    public static final FoundationDITags OK_HTTP = new FoundationDITags("OK_HTTP", 2);
    public static final FoundationDITags RELAY_SERVICE = new FoundationDITags("RELAY_SERVICE", 3);
    public static final FoundationDITags SCARLET = new FoundationDITags("SCARLET", 4);
    public static final FoundationDITags MSG_ADAPTER = new FoundationDITags("MSG_ADAPTER", 5);
    public static final FoundationDITags MANUAL_CONNECTION_CONTROLLER = new FoundationDITags("MANUAL_CONNECTION_CONTROLLER", 6);
    public static final FoundationDITags MANUAL_LIFECYCLE = new FoundationDITags("MANUAL_LIFECYCLE", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FoundationDITags[] $values() {
        return new FoundationDITags[]{MOSHI, INTERCEPTOR, OK_HTTP, RELAY_SERVICE, SCARLET, MSG_ADAPTER, MANUAL_CONNECTION_CONTROLLER, MANUAL_LIFECYCLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FoundationDITags> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static FoundationDITags valueOf(String str) {
        return (FoundationDITags) Enum.valueOf(FoundationDITags.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static FoundationDITags[] values() {
        return (FoundationDITags[]) $VALUES.clone();
    }

    private FoundationDITags(String str, int i) {
    }

    static {
        FoundationDITags[] foundationDITagsArr$values = $values();
        $VALUES = foundationDITagsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(foundationDITagsArr$values);
    }
}
