package com.okinc.okimcore.model.im;

import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class GetMessageDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GetMessageDirection[] $VALUES;
    public static final GetMessageDirection TOP = new GetMessageDirection("TOP", 0);
    public static final GetMessageDirection BOTTOM = new GetMessageDirection(InvestPopUpData.POSITION_BOTTOM, 1);
    public static final GetMessageDirection BOTH = new GetMessageDirection("BOTH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GetMessageDirection[] $values() {
        return new GetMessageDirection[]{TOP, BOTTOM, BOTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GetMessageDirection> getEntries() {
        return $ENTRIES;
    }

    private GetMessageDirection(String str, int i) {
    }

    static {
        GetMessageDirection[] getMessageDirectionArr$values = $values();
        $VALUES = getMessageDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(getMessageDirectionArr$values);
    }

    public static GetMessageDirection valueOf(String str) {
        return (GetMessageDirection) Enum.valueOf(GetMessageDirection.class, str);
    }

    public static GetMessageDirection[] values() {
        return (GetMessageDirection[]) $VALUES.clone();
    }
}
