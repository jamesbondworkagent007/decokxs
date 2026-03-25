package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PluginRefreshSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PluginRefreshSource[] $VALUES;
    public static final PluginRefreshSource ON_RESUME = new PluginRefreshSource("ON_RESUME", 0);
    public static final PluginRefreshSource PULL_TO_REFRESH = new PluginRefreshSource("PULL_TO_REFRESH", 1);
    public static final PluginRefreshSource RETRY_FROM_ERROR = new PluginRefreshSource("RETRY_FROM_ERROR", 2);
    public static final PluginRefreshSource REFRESH_FROM_QUICK_CONVERT_CARD = new PluginRefreshSource("REFRESH_FROM_QUICK_CONVERT_CARD", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PluginRefreshSource[] $values() {
        return new PluginRefreshSource[]{ON_RESUME, PULL_TO_REFRESH, RETRY_FROM_ERROR, REFRESH_FROM_QUICK_CONVERT_CARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PluginRefreshSource> getEntries() {
        return $ENTRIES;
    }

    private PluginRefreshSource(String str, int i) {
    }

    static {
        PluginRefreshSource[] pluginRefreshSourceArr$values = $values();
        $VALUES = pluginRefreshSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pluginRefreshSourceArr$values);
    }

    public static PluginRefreshSource valueOf(String str) {
        return (PluginRefreshSource) Enum.valueOf(PluginRefreshSource.class, str);
    }

    public static PluginRefreshSource[] values() {
        return (PluginRefreshSource[]) $VALUES.clone();
    }
}
