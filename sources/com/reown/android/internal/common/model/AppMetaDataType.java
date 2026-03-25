package com.reown.android.internal.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class AppMetaDataType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ AppMetaDataType[] $VALUES;
    public static final AppMetaDataType SELF = new AppMetaDataType("SELF", 0);
    public static final AppMetaDataType PEER = new AppMetaDataType("PEER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ AppMetaDataType[] $values() {
        return new AppMetaDataType[]{SELF, PEER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppMetaDataType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AppMetaDataType valueOf(String str) {
        return (AppMetaDataType) Enum.valueOf(AppMetaDataType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AppMetaDataType[] values() {
        return (AppMetaDataType[]) $VALUES.clone();
    }

    public AppMetaDataType(String str, int i) {
    }

    static {
        AppMetaDataType[] appMetaDataTypeArr$values = $values();
        $VALUES = appMetaDataTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appMetaDataTypeArr$values);
    }
}
