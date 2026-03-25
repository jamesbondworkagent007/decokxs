package com.okinc.business.dexlogic.bean.track;

import kotlinx.coroutines.DebugKt;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EventTrackingRouteMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventTrackingRouteMode[] $VALUES;
    public static final EventTrackingRouteMode Auto = new EventTrackingRouteMode("Auto", 0, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
    public static final EventTrackingRouteMode Manual = new EventTrackingRouteMode("Manual", 1, "manual");
    private final String mode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventTrackingRouteMode[] $values() {
        return new EventTrackingRouteMode[]{Auto, Manual};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventTrackingRouteMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private EventTrackingRouteMode(String str, int i, String str2) {
        this.mode = str2;
    }

    static {
        EventTrackingRouteMode[] eventTrackingRouteModeArr$values = $values();
        $VALUES = eventTrackingRouteModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventTrackingRouteModeArr$values);
    }

    public static EventTrackingRouteMode valueOf(String str) {
        return (EventTrackingRouteMode) Enum.valueOf(EventTrackingRouteMode.class, str);
    }

    public static EventTrackingRouteMode[] values() {
        return (EventTrackingRouteMode[]) $VALUES.clone();
    }
}
