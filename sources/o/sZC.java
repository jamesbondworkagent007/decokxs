package o;

import com.okinc.p2p.api.OtcRouteConst;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZC implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        java.lang.String strGEmmrt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        C44600sZw.AEQbTJ.KWHzl(map);
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/dex");
        java.lang.Object obj = map.get("subTab");
        if (obj != null && (strGEmmrt = C33129mqd.gEmmrt(obj)) != null) {
            str = strGEmmrt;
        }
        bundle.putString("subTab", str);
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
    }
}
