package com.okinc.business.dexlogic.bean;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PresetRouteType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PresetRouteType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final PresetRouteType RouteTypeNotSupport = new PresetRouteType("RouteTypeNotSupport", 0, "0");
    public static final PresetRouteType RouteTypeAuto = new PresetRouteType("RouteTypeAuto", 1, "1");
    public static final PresetRouteType RouteTypeMev = new PresetRouteType("RouteTypeMev", 2, "2");
    public static final PresetRouteType RouteTypeFast = new PresetRouteType("RouteTypeFast", 3, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PresetRouteType[] $values() {
        return new PresetRouteType[]{RouteTypeNotSupport, RouteTypeAuto, RouteTypeMev, RouteTypeFast};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PresetRouteType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PresetRouteType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PresetRouteType[] presetRouteTypeArr$values = $values();
        $VALUES = presetRouteTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(presetRouteTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.PresetRouteType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final PresetRouteType EZpvd(@NotNull String str) {
            PresetRouteType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<PresetRouteType> it = PresetRouteType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            PresetRouteType presetRouteType = next;
            return presetRouteType == null ? PresetRouteType.RouteTypeAuto : presetRouteType;
        }
    }

    public static PresetRouteType valueOf(String str) {
        return (PresetRouteType) Enum.valueOf(PresetRouteType.class, str);
    }

    public static PresetRouteType[] values() {
        return (PresetRouteType[]) $VALUES.clone();
    }
}
