package o;

import com.okinc.components.report.EventAction;
import com.okinc.components.report.db.EventData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mhE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32627mhE {
    public static final boolean AEQbTJ(@NotNull EventData eventData, @NotNull EventAction eventAction) {
        Intrinsics.checkNotNullParameter(eventData, "");
        Intrinsics.checkNotNullParameter(eventAction, "");
        return Intrinsics.EZpvd((java.lang.Object) eventData.getAct(), (java.lang.Object) eventAction.getType());
    }

    public static final boolean KWHzl(@NotNull EventData eventData) {
        Intrinsics.checkNotNullParameter(eventData, "");
        EventAction eventAction = EventAction.APP_MEMORY;
        if (!AEQbTJ(eventData, eventAction)) {
            if (Intrinsics.EZpvd((java.lang.Object) eventData.getAct(), (java.lang.Object) "apm_events")) {
                java.util.Map<java.lang.String, java.lang.String> attrs = eventData.getAttrs();
                if (Intrinsics.EZpvd((java.lang.Object) (attrs != null ? attrs.get("attr_1") : null), (java.lang.Object) eventAction.getType())) {
                }
            }
            return false;
        }
        return true;
    }
}
