package com.okinc.im.imui.picker;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class CropShape {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CropShape[] $VALUES;
    public static final CropShape SQUARE = new CropShape("SQUARE", 0);
    public static final CropShape CIRCLE = new CropShape("CIRCLE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CropShape[] $values() {
        return new CropShape[]{SQUARE, CIRCLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CropShape> getEntries() {
        return $ENTRIES;
    }

    private CropShape(String str, int i) {
    }

    static {
        CropShape[] cropShapeArr$values = $values();
        $VALUES = cropShapeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cropShapeArr$values);
    }

    public static CropShape valueOf(String str) {
        return (CropShape) Enum.valueOf(CropShape.class, str);
    }

    public static CropShape[] values() {
        return (CropShape[]) $VALUES.clone();
    }
}
