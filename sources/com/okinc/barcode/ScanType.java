package com.okinc.barcode;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ScanType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ScanType[] $VALUES;
    public static final ScanType IMAGE = new ScanType("IMAGE", 0, TtmlNode.TAG_IMAGE);
    public static final ScanType IMAGE_ASYNC = new ScanType("IMAGE_ASYNC", 1, "image_async");
    public static final ScanType SCAN = new ScanType("SCAN", 2, "scan");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ScanType[] $values() {
        return new ScanType[]{IMAGE, IMAGE_ASYNC, SCAN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ScanType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ScanType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ScanType[] scanTypeArr$values = $values();
        $VALUES = scanTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(scanTypeArr$values);
    }

    public static ScanType valueOf(String str) {
        return (ScanType) Enum.valueOf(ScanType.class, str);
    }

    public static ScanType[] values() {
        return (ScanType[]) $VALUES.clone();
    }
}
