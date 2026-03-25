package com.okinc.okimcore.model.im.inhouseim.ws;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MediaMessageContentType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MediaMessageContentType[] $VALUES;
    private final int apiValue;
    public static final MediaMessageContentType IMAGE = new MediaMessageContentType("IMAGE", 0, 1);
    public static final MediaMessageContentType VIDEO = new MediaMessageContentType("VIDEO", 1, 2);
    public static final MediaMessageContentType FILE = new MediaMessageContentType("FILE", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MediaMessageContentType[] $values() {
        return new MediaMessageContentType[]{IMAGE, VIDEO, FILE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MediaMessageContentType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getApiValue() {
        return this.apiValue;
    }

    private MediaMessageContentType(String str, int i, int i2) {
        this.apiValue = i2;
    }

    static {
        MediaMessageContentType[] mediaMessageContentTypeArr$values = $values();
        $VALUES = mediaMessageContentTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mediaMessageContentTypeArr$values);
    }

    public static MediaMessageContentType valueOf(String str) {
        return (MediaMessageContentType) Enum.valueOf(MediaMessageContentType.class, str);
    }

    public static MediaMessageContentType[] values() {
        return (MediaMessageContentType[]) $VALUES.clone();
    }
}
