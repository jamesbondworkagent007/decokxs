package com.okinc.im.imui.tracking.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class MediaType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final MediaType GIF = new MediaType("GIF", 0);
    public static final MediaType IMAGE = new MediaType("IMAGE", 1);
    public static final MediaType VIDEO = new MediaType("VIDEO", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{GIF, IMAGE, VIDEO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MediaType> getEntries() {
        return $ENTRIES;
    }

    private MediaType(String str, int i) {
    }

    static {
        MediaType[] mediaTypeArr$values = $values();
        $VALUES = mediaTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mediaTypeArr$values);
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }
}
