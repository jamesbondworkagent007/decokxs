package o;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30823liS implements InterfaceC25298iuA {
    public final Function1<PresetRouteType, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.bean.PresetRouteType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C30823liS(@NotNull Function1<? super PresetRouteType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    @Override // o.InterfaceC25298iuA
    public void OLrzqt(@NotNull PresetRouteType presetRouteType, @NotNull C25337iun c25337iun) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        Intrinsics.checkNotNullParameter(c25337iun, "");
        this.EZpvd.invoke(presetRouteType);
    }
}
