package com.okinc.tradingbot.impl.botList.ui.shared;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class MetricStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MetricStyle[] $VALUES;
    public static final MetricStyle NORMAL = new MetricStyle("NORMAL", 0);
    public static final MetricStyle LARGE = new MetricStyle("LARGE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MetricStyle[] $values() {
        return new MetricStyle[]{NORMAL, LARGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MetricStyle> getEntries() {
        return $ENTRIES;
    }

    private MetricStyle(String str, int i) {
    }

    static {
        MetricStyle[] metricStyleArr$values = $values();
        $VALUES = metricStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(metricStyleArr$values);
    }

    public static MetricStyle valueOf(String str) {
        return (MetricStyle) Enum.valueOf(MetricStyle.class, str);
    }

    public static MetricStyle[] values() {
        return (MetricStyle[]) $VALUES.clone();
    }
}
