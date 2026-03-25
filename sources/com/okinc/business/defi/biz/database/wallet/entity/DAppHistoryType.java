package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class DAppHistoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DAppHistoryType[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final DAppHistoryType SEARCH_HISTORY = new DAppHistoryType("SEARCH_HISTORY", 0, 0);
    public static final DAppHistoryType RECENT_BROWSE = new DAppHistoryType("RECENT_BROWSE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DAppHistoryType[] $values() {
        return new DAppHistoryType[]{SEARCH_HISTORY, RECENT_BROWSE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DAppHistoryType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private DAppHistoryType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        DAppHistoryType[] dAppHistoryTypeArr$values = $values();
        $VALUES = dAppHistoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dAppHistoryTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static DAppHistoryType valueOf(String str) {
        return (DAppHistoryType) Enum.valueOf(DAppHistoryType.class, str);
    }

    public static DAppHistoryType[] values() {
        return (DAppHistoryType[]) $VALUES.clone();
    }
}
