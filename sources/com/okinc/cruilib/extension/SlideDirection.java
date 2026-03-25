package com.okinc.cruilib.extension;

import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SlideDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SlideDirection[] $VALUES;
    public static final SlideDirection LEFT = new SlideDirection("LEFT", 0);
    public static final SlideDirection RIGHT = new SlideDirection("RIGHT", 1);
    public static final SlideDirection TOP = new SlideDirection("TOP", 2);
    public static final SlideDirection BOTTOM = new SlideDirection(InvestPopUpData.POSITION_BOTTOM, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SlideDirection[] $values() {
        return new SlideDirection[]{LEFT, RIGHT, TOP, BOTTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SlideDirection> getEntries() {
        return $ENTRIES;
    }

    private SlideDirection(String str, int i) {
    }

    static {
        SlideDirection[] slideDirectionArr$values = $values();
        $VALUES = slideDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(slideDirectionArr$values);
    }

    public static SlideDirection valueOf(String str) {
        return (SlideDirection) Enum.valueOf(SlideDirection.class, str);
    }

    public static SlideDirection[] values() {
        return (SlideDirection[]) $VALUES.clone();
    }
}
