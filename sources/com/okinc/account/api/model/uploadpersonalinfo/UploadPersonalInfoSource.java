package com.okinc.account.api.model.uploadpersonalinfo;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UploadPersonalInfoSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UploadPersonalInfoSource[] $VALUES;
    public static final UploadPersonalInfoSource RESET = new UploadPersonalInfoSource("RESET", 0);
    public static final UploadPersonalInfoSource REMOVE = new UploadPersonalInfoSource("REMOVE", 1);
    public static final UploadPersonalInfoSource FACE_MAX_OUT = new UploadPersonalInfoSource("FACE_MAX_OUT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UploadPersonalInfoSource[] $values() {
        return new UploadPersonalInfoSource[]{RESET, REMOVE, FACE_MAX_OUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UploadPersonalInfoSource> getEntries() {
        return $ENTRIES;
    }

    private UploadPersonalInfoSource(String str, int i) {
    }

    static {
        UploadPersonalInfoSource[] uploadPersonalInfoSourceArr$values = $values();
        $VALUES = uploadPersonalInfoSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uploadPersonalInfoSourceArr$values);
    }

    public static UploadPersonalInfoSource valueOf(String str) {
        return (UploadPersonalInfoSource) Enum.valueOf(UploadPersonalInfoSource.class, str);
    }

    public static UploadPersonalInfoSource[] values() {
        return (UploadPersonalInfoSource[]) $VALUES.clone();
    }
}
