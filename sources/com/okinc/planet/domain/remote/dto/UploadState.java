package com.okinc.planet.domain.remote.dto;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class UploadState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UploadState[] $VALUES;
    public static final UploadState Idle = new UploadState("Idle", 0);
    public static final UploadState Uploading = new UploadState("Uploading", 1);
    public static final UploadState Success = new UploadState("Success", 2);
    public static final UploadState Failed = new UploadState("Failed", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UploadState[] $values() {
        return new UploadState[]{Idle, Uploading, Success, Failed};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UploadState> getEntries() {
        return $ENTRIES;
    }

    static {
        UploadState[] uploadStateArr$values = $values();
        $VALUES = uploadStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uploadStateArr$values);
    }

    private UploadState(String str, int i) {
    }

    public static UploadState valueOf(String str) {
        return (UploadState) Enum.valueOf(UploadState.class, str);
    }

    public static UploadState[] values() {
        return (UploadState[]) $VALUES.clone();
    }
}
