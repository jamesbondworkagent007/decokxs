package com.okinc.im.imui.widgets;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class FileMessageState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FileMessageState[] $VALUES;
    public static final FileMessageState UPLOADING = new FileMessageState("UPLOADING", 0);
    public static final FileMessageState UPLOAD_CANCELLED = new FileMessageState("UPLOAD_CANCELLED", 1);
    public static final FileMessageState UPLOAD_FAILED = new FileMessageState("UPLOAD_FAILED", 2);
    public static final FileMessageState SENT = new FileMessageState("SENT", 3);
    public static final FileMessageState PENDING_DOWNLOAD = new FileMessageState("PENDING_DOWNLOAD", 4);
    public static final FileMessageState DOWNLOADING = new FileMessageState("DOWNLOADING", 5);
    public static final FileMessageState DOWNLOAD_FAILED = new FileMessageState("DOWNLOAD_FAILED", 6);
    public static final FileMessageState DOWNLOADED = new FileMessageState("DOWNLOADED", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FileMessageState[] $values() {
        return new FileMessageState[]{UPLOADING, UPLOAD_CANCELLED, UPLOAD_FAILED, SENT, PENDING_DOWNLOAD, DOWNLOADING, DOWNLOAD_FAILED, DOWNLOADED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FileMessageState> getEntries() {
        return $ENTRIES;
    }

    private FileMessageState(String str, int i) {
    }

    static {
        FileMessageState[] fileMessageStateArr$values = $values();
        $VALUES = fileMessageStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fileMessageStateArr$values);
    }

    public static FileMessageState valueOf(String str) {
        return (FileMessageState) Enum.valueOf(FileMessageState.class, str);
    }

    public static FileMessageState[] values() {
        return (FileMessageState[]) $VALUES.clone();
    }
}
