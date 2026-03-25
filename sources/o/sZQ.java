package o;

import com.okinc.p2p.api.OtcRouteConst;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33172mrT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sZQ {
    public static final sZQ EZpvd = new sZQ();

    private sZQ() {
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT.TaskDescription.routeMain$default((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class), context, "main/market", null, 4, null);
    }

    public static /* synthetic */ void jumpToMarketSpot$default(sZQ szq, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        szq.EZpvd(context, str);
    }

    public final void EZpvd(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/spot");
        bundle.putString("rankTab", str);
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
    }

    public static /* synthetic */ void jumpToMarketFuture$default(sZQ szq, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        szq.AEQbTJ(context, str);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/future");
        bundle.putString("rankTab", str);
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/option");
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/dex");
        Unit unit = Unit.INSTANCE;
        interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C27563jxZ.OLrzqt.AYXKKw()) {
            InterfaceC33172mrT interfaceC33172mrT = (InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "main/market/overview");
            bundle.putString("chartId", str);
            Unit unit = Unit.INSTANCE;
            interfaceC33172mrT.AEQbTJ(context, "main/market", bundle);
        }
    }
}
