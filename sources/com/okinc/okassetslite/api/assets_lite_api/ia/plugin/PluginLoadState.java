package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PluginLoadState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PluginLoadState[] $VALUES;
    public static final PluginLoadState PENDING = new PluginLoadState(CardSyncResponse.PENDING, 0);
    public static final PluginLoadState SUCCESS = new PluginLoadState("SUCCESS", 1);
    public static final PluginLoadState ERROR = new PluginLoadState(EventType.ERROR, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PluginLoadState[] $values() {
        return new PluginLoadState[]{PENDING, SUCCESS, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PluginLoadState> getEntries() {
        return $ENTRIES;
    }

    private PluginLoadState(String str, int i) {
    }

    static {
        PluginLoadState[] pluginLoadStateArr$values = $values();
        $VALUES = pluginLoadStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pluginLoadStateArr$values);
    }

    public static PluginLoadState valueOf(String str) {
        return (PluginLoadState) Enum.valueOf(PluginLoadState.class, str);
    }

    public static PluginLoadState[] values() {
        return (PluginLoadState[]) $VALUES.clone();
    }
}
