package com.okinc.ok_kyc_core.presentation.views;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FilePickerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FilePickerType[] $VALUES;
    public static final FilePickerType CAMERA = new FilePickerType("CAMERA", 0);
    public static final FilePickerType IMAGE = new FilePickerType("IMAGE", 1);
    public static final FilePickerType FILE = new FilePickerType("FILE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FilePickerType[] $values() {
        return new FilePickerType[]{CAMERA, IMAGE, FILE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FilePickerType> getEntries() {
        return $ENTRIES;
    }

    private FilePickerType(String str, int i) {
    }

    static {
        FilePickerType[] filePickerTypeArr$values = $values();
        $VALUES = filePickerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(filePickerTypeArr$values);
    }

    public static FilePickerType valueOf(String str) {
        return (FilePickerType) Enum.valueOf(FilePickerType.class, str);
    }

    public static FilePickerType[] values() {
        return (FilePickerType[]) $VALUES.clone();
    }
}
