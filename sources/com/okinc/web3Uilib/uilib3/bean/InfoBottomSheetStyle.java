package com.okinc.web3Uilib.uilib3.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class InfoBottomSheetStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InfoBottomSheetStyle[] $VALUES;
    public static final InfoBottomSheetStyle INFO_LIST = new InfoBottomSheetStyle("INFO_LIST", 0);
    public static final InfoBottomSheetStyle DATA_CONTENT = new InfoBottomSheetStyle("DATA_CONTENT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InfoBottomSheetStyle[] $values() {
        return new InfoBottomSheetStyle[]{INFO_LIST, DATA_CONTENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InfoBottomSheetStyle> getEntries() {
        return $ENTRIES;
    }

    private InfoBottomSheetStyle(String str, int i) {
    }

    static {
        InfoBottomSheetStyle[] infoBottomSheetStyleArr$values = $values();
        $VALUES = infoBottomSheetStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(infoBottomSheetStyleArr$values);
    }

    public static InfoBottomSheetStyle valueOf(String str) {
        return (InfoBottomSheetStyle) Enum.valueOf(InfoBottomSheetStyle.class, str);
    }

    public static InfoBottomSheetStyle[] values() {
        return (InfoBottomSheetStyle[]) $VALUES.clone();
    }
}
