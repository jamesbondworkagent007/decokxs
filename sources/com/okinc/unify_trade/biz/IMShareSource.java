package com.okinc.unify_trade.biz;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class IMShareSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IMShareSource[] $VALUES;
    private final String module;
    private final String source;
    public static final IMShareSource TRADE_ASSET = new IMShareSource("TRADE_ASSET", 0, "oktrade", "trade_asset");
    public static final IMShareSource HISTORY_POSITION = new IMShareSource("HISTORY_POSITION", 1, "oktrade", "history_position");
    public static final IMShareSource POSITION = new IMShareSource("POSITION", 2, "oktrade", "position");
    public static final IMShareSource HISTORY_ORDER = new IMShareSource("HISTORY_ORDER", 3, "oktrade", "history_order");
    public static final IMShareSource HISTORY_ORDER_DETAIL = new IMShareSource("HISTORY_ORDER_DETAIL", 4, "oktrade", "history_order_detail");
    public static final IMShareSource ACCOUNT_ASSET = new IMShareSource("ACCOUNT_ASSET", 5, "oktrade", "account_asset");
    public static final IMShareSource ACCOUNT_POSITION = new IMShareSource("ACCOUNT_POSITION", 6, "oktrade", "account_position");
    public static final IMShareSource SIGNAL_ORDER = new IMShareSource("SIGNAL_ORDER", 7, "oktrade", "signal_order");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IMShareSource[] $values() {
        return new IMShareSource[]{TRADE_ASSET, HISTORY_POSITION, POSITION, HISTORY_ORDER, HISTORY_ORDER_DETAIL, ACCOUNT_ASSET, ACCOUNT_POSITION, SIGNAL_ORDER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IMShareSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModule() {
        return this.module;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private IMShareSource(String str, int i, String str2, String str3) {
        this.module = str2;
        this.source = str3;
    }

    static {
        IMShareSource[] iMShareSourceArr$values = $values();
        $VALUES = iMShareSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iMShareSourceArr$values);
    }

    public final String getBizName() {
        return this.module + "_" + this.source;
    }

    public static IMShareSource valueOf(String str) {
        return (IMShareSource) Enum.valueOf(IMShareSource.class, str);
    }

    public static IMShareSource[] values() {
        return (IMShareSource[]) $VALUES.clone();
    }
}
