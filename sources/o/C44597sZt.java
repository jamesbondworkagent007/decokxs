package o;

import com.okinc.p2p.api.OtcRouteConst;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44597sZt implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (C33216msK.KWHzl.KWHzl()) {
            java.lang.String str = ((tWL) C43251rlk.copydefault(tWL.class)).djBIcL().get(interfaceC43233rlS.OLrzqt());
            pUU.KWHzl("qjf", "newDeeplink = " + str);
            if (str != null) {
                ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, "pro/" + str, map, new Function1() { // from class: o.sZz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C44597sZt.KWHzl((AbstractC43238rlX) obj);
                    }
                });
                return;
            }
            return;
        }
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            return;
        }
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("path", "main/market");
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/opportunities/feeds");
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.copydefault(context, bundle);
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
