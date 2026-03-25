package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38066pKz implements InterfaceC38065pKy {
    public final Function2<java.lang.String, EventParamsList, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.okinc.components.track.bean.EventParamsList, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38066pKz(@NotNull Function2<? super java.lang.String, ? super EventParamsList, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    @Override // o.InterfaceC38065pKy
    public void OLrzqt(@NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        this.OLrzqt.invoke(str, eventParamsList);
    }
}
