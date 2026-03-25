package com.okinc.liveness.eop.bean;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class StorageService {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StorageService[] $VALUES;
    public static final StorageService AWS = new StorageService("AWS", 0, "aws");
    public static final StorageService OSS = new StorageService("OSS", 1, OSSConstants.RESOURCE_NAME_OSS);
    private final String service;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StorageService[] $values() {
        return new StorageService[]{AWS, OSS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StorageService> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getService() {
        return this.service;
    }

    private StorageService(String str, int i, String str2) {
        this.service = str2;
    }

    static {
        StorageService[] storageServiceArr$values = $values();
        $VALUES = storageServiceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(storageServiceArr$values);
    }

    public static StorageService valueOf(String str) {
        return (StorageService) Enum.valueOf(StorageService.class, str);
    }

    public static StorageService[] values() {
        return (StorageService[]) $VALUES.clone();
    }
}
