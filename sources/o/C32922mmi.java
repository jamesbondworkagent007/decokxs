package o;

import android.os.Build;
import com.okinc.biz.statistics.util.ClientTimeIssue;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32935mmv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32922mmi implements InterfaceC32870mlj, C32935mmv.Application {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mmp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32922mmi.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mmq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32922mmi.copydefault();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mmo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32922mmi.AhwBna();
        }
    });

    public final EventParamsList djBIcL() {
        return (EventParamsList) this.EZpvd.getValue();
    }

    public static final EventParamsList AEQbTJ() {
        return new EventParamsList();
    }

    public final android.content.pm.PackageInfo AYXKKw() {
        return (android.content.pm.PackageInfo) this.copydefault.getValue();
    }

    public static final android.content.pm.PackageInfo copydefault() {
        android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        return applicationValueOf.getPackageManager().getPackageInfo(applicationValueOf.getPackageName(), 0);
    }

    public final java.util.List<InterfaceC35206nqu> gEmmrt() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List AhwBna() {
        return C43251rlk.KWHzl(InterfaceC35206nqu.class);
    }

    @Override // o.C32935mmv.Application
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        djBIcL().put(str, str2, str3 != null);
    }

    @Override // o.C32935mmv.Application
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        EventParam next;
        Intrinsics.checkNotNullParameter(str, "");
        EventParamsList eventParamsListDjBIcL = djBIcL();
        java.util.Iterator<EventParam> it = djBIcL().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) next.copydefault(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        C56532yIw.EZpvd(eventParamsListDjBIcL).remove(next);
    }

    public final void AEQbTJ(EventParamsList eventParamsList, EventParam eventParam) {
        EventParam next;
        java.util.Iterator<EventParam> it = eventParamsList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) next.copydefault(), (java.lang.Object) eventParam.copydefault())) {
                    break;
                }
            }
        }
        EventParam eventParam2 = next;
        if (eventParam2 != null) {
            eventParam2.OLrzqt(eventParam.KWHzl());
        } else {
            eventParamsList.add(eventParam);
        }
    }

    public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        map.put(str, str2);
    }

    @Override // o.InterfaceC32870mlj
    public void KWHzl(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.lang.String str, @NotNull EventParamsList eventParamsList) {
        EventParam next;
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AEQbTJ(eventParamsList, new EventParam("anchor_en_name", str, false));
        AEQbTJ(eventParamsList, new EventParam("client_ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), false));
        java.util.Iterator<EventParam> it = djBIcL().iterator();
        while (it.hasNext()) {
            AEQbTJ(eventParamsList, it.next());
        }
        java.util.Iterator<EventParam> it2 = eventParamsList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) next.copydefault(), (java.lang.Object) "client_ts")) {
                    break;
                }
            }
        }
        EventParam eventParam = next;
        if (eventParam != null) {
            ClientTimeIssue.AEQbTJ.EZpvd(str, eventParam.KWHzl(), "CommonEventInterceptor");
        }
        copydefault(interfaceC32874mln, eventParamsList);
    }

    @Override // o.InterfaceC32870mlj
    public void copydefault(@NotNull InterfaceC32874mln interfaceC32874mln, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        KWHzl(map, "anchor_en_name", str);
        KWHzl(map, "client_ts", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        for (EventParam eventParam : djBIcL()) {
            KWHzl(map, eventParam.copydefault(), eventParam.KWHzl());
        }
        ClientTimeIssue.AEQbTJ.EZpvd(str, map.get("client_ts"), "CommonEventInterceptor");
        KWHzl(interfaceC32874mln, map);
    }

    public final void copydefault(InterfaceC32874mln interfaceC32874mln, EventParamsList eventParamsList) {
        java.util.List<InterfaceC35206nqu> listGEmmrt;
        if (interfaceC32874mln instanceof C6862aXQ) {
            AEQbTJ(eventParamsList, new EventParam("_version_code", java.lang.String.valueOf(AYXKKw().versionCode), false));
            AEQbTJ(eventParamsList, new EventParam("_version_name", java.lang.String.valueOf(AYXKKw().versionName), false));
            java.lang.String strCopydefault = xVY.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            AEQbTJ(eventParamsList, new EventParam("_cid", strCopydefault, false));
            java.lang.String str = Build.VERSION.RELEASE;
            if (str == null) {
                str = "";
            }
            AEQbTJ(eventParamsList, new EventParam("_os_version", str, false));
            java.lang.String strKWHzl = C32924mmk.KWHzl.KWHzl(C32935mmv.KWHzl.EZpvd());
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            AEQbTJ(eventParamsList, new EventParam("_app_mode", strKWHzl, false));
            if (gEmmrt() == null || ((listGEmmrt = gEmmrt()) != null && listGEmmrt.isEmpty())) {
                AEQbTJ(eventParamsList, new EventParam("_user_id", "", false));
                return;
            }
            java.util.List<InterfaceC35206nqu> listGEmmrt2 = gEmmrt();
            if (listGEmmrt2 != null) {
                java.util.Iterator<T> it = listGEmmrt2.iterator();
                while (it.hasNext()) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : ((InterfaceC35206nqu) it.next()).KWHzl().entrySet()) {
                        AEQbTJ(eventParamsList, new EventParam(entry.getKey(), entry.getValue(), false));
                    }
                }
            }
        }
    }

    public final void KWHzl(InterfaceC32874mln interfaceC32874mln, java.util.Map<java.lang.String, java.lang.String> map) {
        if (interfaceC32874mln instanceof C6862aXQ) {
            KWHzl(map, "_version_code", java.lang.String.valueOf(AYXKKw().versionCode));
            KWHzl(map, "_version_name", java.lang.String.valueOf(AYXKKw().versionName));
            java.lang.String strCopydefault = xVY.copydefault();
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
            KWHzl(map, "_cid", strCopydefault);
            java.lang.String str = Build.VERSION.RELEASE;
            if (str == null) {
                str = "";
            }
            KWHzl(map, "_os_version", str);
            java.lang.String strKWHzl = C32924mmk.KWHzl.KWHzl(C32935mmv.KWHzl.EZpvd());
            KWHzl(map, "_app_mode", strKWHzl != null ? strKWHzl : "");
            java.util.List<InterfaceC35206nqu> listGEmmrt = gEmmrt();
            if (listGEmmrt != null) {
                java.util.Iterator<T> it = listGEmmrt.iterator();
                while (it.hasNext()) {
                    for (Map.Entry<java.lang.String, java.lang.String> entry : ((InterfaceC35206nqu) it.next()).KWHzl().entrySet()) {
                        KWHzl(map, entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC32870mlj
    public boolean copydefault(@NotNull InterfaceC32874mln interfaceC32874mln) {
        Intrinsics.checkNotNullParameter(interfaceC32874mln, "");
        return interfaceC32874mln.fJNWhG() != TrackChannel.Amplitude;
    }
}
