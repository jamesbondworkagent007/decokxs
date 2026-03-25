package o;

import com.okinc.p2p.api.OtcRouteConst;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46407tTe implements Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Boolean> {
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean invoke(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        android.content.ComponentCallbacks2 componentCallbacks2AEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (((componentCallbacks2AEQbTJ instanceof InterfaceC35205nqt) && ((InterfaceC35205nqt) componentCallbacks2AEQbTJ).AwvSrB()) || (componentCallbacks2AEQbTJ instanceof InterfaceC32628mhF)) {
            pUU.KWHzl("qjf", "params:" + map);
            if (map.containsKey("pageurl")) {
                java.lang.Object obj = map.get("pageurl");
                Intrinsics.copydefault(obj, "");
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) obj, (java.lang.CharSequence) "feed/detail", false, 2, (java.lang.Object) null)) {
                    java.lang.Object obj2 = map.get("tab");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                        if (C33216msK.KWHzl.KWHzl()) {
                            InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/planet/feed");
                            bundle.putString("tab_value", str);
                            Unit unit = Unit.INSTANCE;
                            interfaceC33172mrT.AEQbTJ(context, "main/planet", bundle);
                        } else {
                            InterfaceC33172mrT interfaceC33172mrT2 = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/opportunities/feeds");
                            Unit unit2 = Unit.INSTANCE;
                            interfaceC33172mrT2.AEQbTJ(context, "main/market", bundle2);
                        }
                    }
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
