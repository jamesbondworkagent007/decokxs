package com.okinc.im.imui.glide.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AspectOrientation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AspectOrientation[] $VALUES;
    public static final AspectOrientation PORTRAIT = new AspectOrientation("PORTRAIT", 0);
    public static final AspectOrientation LANDSCAPE = new AspectOrientation("LANDSCAPE", 1);
    public static final AspectOrientation SQUARE = new AspectOrientation("SQUARE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AspectOrientation[] $values() {
        return new AspectOrientation[]{PORTRAIT, LANDSCAPE, SQUARE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AspectOrientation> getEntries() {
        return $ENTRIES;
    }

    private AspectOrientation(String str, int i) {
    }

    static {
        AspectOrientation[] aspectOrientationArr$values = $values();
        $VALUES = aspectOrientationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aspectOrientationArr$values);
    }

    public static AspectOrientation valueOf(String str) {
        return (AspectOrientation) Enum.valueOf(AspectOrientation.class, str);
    }

    public static AspectOrientation[] values() {
        return (AspectOrientation[]) $VALUES.clone();
    }
}
