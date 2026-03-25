package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRF {
    @yCM
    public kRF() {
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            return z;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            return true;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
            Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeNotSupport.getValue());
        }
        return false;
    }
}
