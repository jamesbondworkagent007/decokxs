package o;

import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tPD implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        PlanetNotificationCategory planetNotificationCategoryCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(java.lang.String.valueOf(map.get("type")));
        if (intOrNull != null) {
            planetNotificationCategoryCopydefault = PlanetNotificationCategory.Companion.copydefault(intOrNull.intValue());
        } else {
            planetNotificationCategoryCopydefault = null;
        }
        ((tWL) C43251rlk.copydefault(tWL.class)).KWHzl(context, planetNotificationCategoryCopydefault);
    }
}
