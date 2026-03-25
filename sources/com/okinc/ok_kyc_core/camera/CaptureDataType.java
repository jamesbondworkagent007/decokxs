package com.okinc.ok_kyc_core.camera;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CaptureDataType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CaptureDataType[] $VALUES;
    public static final CaptureDataType URI = new CaptureDataType("URI", 0);
    public static final CaptureDataType FileName = new CaptureDataType("FileName", 1);
    public static final CaptureDataType FileType = new CaptureDataType("FileType", 2);
    public static final CaptureDataType PreviewerMode = new CaptureDataType("PreviewerMode", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CaptureDataType[] $values() {
        return new CaptureDataType[]{URI, FileName, FileType, PreviewerMode};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CaptureDataType> getEntries() {
        return $ENTRIES;
    }

    private CaptureDataType(String str, int i) {
    }

    static {
        CaptureDataType[] captureDataTypeArr$values = $values();
        $VALUES = captureDataTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(captureDataTypeArr$values);
    }

    public static CaptureDataType valueOf(String str) {
        return (CaptureDataType) Enum.valueOf(CaptureDataType.class, str);
    }

    public static CaptureDataType[] values() {
        return (CaptureDataType[]) $VALUES.clone();
    }
}
