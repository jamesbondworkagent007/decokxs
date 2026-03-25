package com.okinc.im.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ImEnabledStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImEnabledStatus[] $VALUES;
    public static final ImEnabledStatus Disabled = new ImEnabledStatus("Disabled", 0);
    public static final ImEnabledStatus Limited = new ImEnabledStatus("Limited", 1);
    public static final ImEnabledStatus Full = new ImEnabledStatus("Full", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImEnabledStatus[] $values() {
        return new ImEnabledStatus[]{Disabled, Limited, Full};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImEnabledStatus> getEntries() {
        return $ENTRIES;
    }

    private ImEnabledStatus(String str, int i) {
    }

    static {
        ImEnabledStatus[] imEnabledStatusArr$values = $values();
        $VALUES = imEnabledStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(imEnabledStatusArr$values);
    }

    public static ImEnabledStatus valueOf(String str) {
        return (ImEnabledStatus) Enum.valueOf(ImEnabledStatus.class, str);
    }

    public static ImEnabledStatus[] values() {
        return (ImEnabledStatus[]) $VALUES.clone();
    }
}
