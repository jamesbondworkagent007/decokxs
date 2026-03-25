package o;

import com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfoDetail;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardTokenListUseCaseImpl$invoke$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24202iYr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26370jaz implements InterfaceC26365jau {
    public final C24212iZa AEQbTJ;
    public final iYX AhwBna;
    public final iDL EZpvd;
    public final iYZ KWHzl;
    public final iYW OLrzqt;
    public final iYY copydefault;
    public final C23580iBq gEmmrt;

    @yCM
    public C26370jaz(@NotNull iDL idl, @NotNull C23580iBq c23580iBq, @NotNull C24212iZa c24212iZa, @NotNull iYW iyw, @NotNull iYY iyy, @NotNull iYZ iyz, @NotNull iYX iyx) {
        Intrinsics.checkNotNullParameter(idl, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(c24212iZa, "");
        Intrinsics.checkNotNullParameter(iyw, "");
        Intrinsics.checkNotNullParameter(iyy, "");
        Intrinsics.checkNotNullParameter(iyz, "");
        Intrinsics.checkNotNullParameter(iyx, "");
        this.EZpvd = idl;
        this.gEmmrt = c23580iBq;
        this.AEQbTJ = c24212iZa;
        this.OLrzqt = iyw;
        this.copydefault = iyy;
        this.KWHzl = iyz;
        this.AhwBna = iyx;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC26365jau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull DashboardListMode dashboardListMode, long j, @NotNull Continuation<? super kotlin.Pair<? extends DashboardListMode, ? extends InterfaceC24202iYr>> continuation) throws java.lang.Throwable {
        DashboardTokenListUseCaseImpl$invoke$1 dashboardTokenListUseCaseImpl$invoke$1;
        java.lang.Object objCopydefault;
        C26370jaz c26370jaz;
        long j2;
        int i;
        DashboardListMode dashboardListMode2 = dashboardListMode;
        if (continuation instanceof DashboardTokenListUseCaseImpl$invoke$1) {
            dashboardTokenListUseCaseImpl$invoke$1 = (DashboardTokenListUseCaseImpl$invoke$1) continuation;
            int i2 = dashboardTokenListUseCaseImpl$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dashboardTokenListUseCaseImpl$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dashboardTokenListUseCaseImpl$invoke$1 = new DashboardTokenListUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardTokenListUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = dashboardTokenListUseCaseImpl$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.gEmmrt.OLrzqt();
            if (interfaceC9738bbJOLrzqt == null) {
                return new kotlin.Pair(dashboardListMode2, InterfaceC24202iYr.ActionBar.EZpvd);
            }
            iDL idl = this.EZpvd;
            java.lang.String strDbNXlk = interfaceC9738bbJOLrzqt.DbNXlk();
            dashboardTokenListUseCaseImpl$invoke$1.L$0 = this;
            dashboardTokenListUseCaseImpl$invoke$1.L$1 = dashboardListMode2;
            dashboardTokenListUseCaseImpl$invoke$1.J$0 = j;
            dashboardTokenListUseCaseImpl$invoke$1.label = 1;
            objCopydefault = idl.copydefault(strDbNXlk, dashboardTokenListUseCaseImpl$invoke$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c26370jaz = this;
            j2 = j;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = dashboardTokenListUseCaseImpl$invoke$1.J$0;
            dashboardListMode2 = (DashboardListMode) dashboardTokenListUseCaseImpl$invoke$1.L$1;
            c26370jaz = (C26370jaz) dashboardTokenListUseCaseImpl$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        DashboardTokenListResponse dashboardTokenListResponse = (DashboardTokenListResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objCopydefault);
        if (dashboardTokenListResponse == null) {
            return new kotlin.Pair(DashboardListMode.RECOMMEND, new InterfaceC24202iYr.Application(true, false, 2, null));
        }
        if (!dashboardTokenListResponse.copydefault()) {
            return new kotlin.Pair(DashboardListMode.PROTOCOL, new InterfaceC24202iYr.Application(true, false, 2, null));
        }
        DashboardTokenListResponse dashboardTokenListResponseCopydefault = c26370jaz.copydefault(j2, dashboardTokenListResponse);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!dashboardTokenListResponseCopydefault.AEQbTJ().EZpvd().isEmpty()) {
            arrayList.add(c26370jaz.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C25493ixk.FragmentManager.fLIjIY)));
            java.util.List<DashboardTokenInfoDetail> listEZpvd = dashboardTokenListResponseCopydefault.AEQbTJ().EZpvd();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList2.add(c26370jaz.AEQbTJ.KWHzl((DashboardTokenInfoDetail) it.next()));
            }
            arrayList.addAll(arrayList2);
            i = 1;
        } else {
            i = 0;
        }
        if (!dashboardTokenListResponseCopydefault.OLrzqt().EZpvd().isEmpty()) {
            i++;
            arrayList.add(c26370jaz.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C25493ixk.FragmentManager.apNbdB)));
            java.util.List<DashboardTokenInfoDetail> listEZpvd2 = dashboardTokenListResponseCopydefault.OLrzqt().EZpvd();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
            java.util.Iterator<T> it2 = listEZpvd2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(c26370jaz.OLrzqt.AEQbTJ((DashboardTokenInfoDetail) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (!dashboardTokenListResponseCopydefault.KWHzl().EZpvd().isEmpty()) {
            i++;
            arrayList.add(c26370jaz.KWHzl.AEQbTJ(C33070mpX.AYXKKw(C25493ixk.FragmentManager.UscePu)));
            java.util.List<DashboardTokenInfoDetail> listEZpvd3 = dashboardTokenListResponseCopydefault.KWHzl().EZpvd();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd3, 10));
            java.util.Iterator<T> it3 = listEZpvd3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(c26370jaz.copydefault.copydefault((DashboardTokenInfoDetail) it3.next()));
            }
            arrayList.addAll(arrayList4);
        }
        if (!arrayList.isEmpty()) {
            if (i == 1) {
                arrayList.remove(0);
            }
            if (arrayList.isEmpty()) {
                return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Application(true, dashboardTokenListResponseCopydefault.copydefault()));
            }
            arrayList.add(0, c26370jaz.AhwBna.EZpvd(dashboardTokenListResponseCopydefault.EZpvd(), dashboardTokenListResponseCopydefault.valueOf(), j2 != -1, dashboardTokenListResponseCopydefault.gEmmrt(), C33129mqd.OLrzqt((java.lang.CharSequence) dashboardTokenListResponseCopydefault.valueOf()) && C33129mqd.OLrzqt((java.lang.CharSequence) dashboardTokenListResponseCopydefault.gEmmrt())));
            arrayList.add(new C27433jvB(32.0f));
            return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Fragment(arrayList, dashboardTokenListResponseCopydefault.copydefault()));
        }
        if (j2 != -1) {
            return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Application(true, dashboardTokenListResponseCopydefault.copydefault()));
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = c26370jaz.gEmmrt.OLrzqt();
        if (interfaceC9738bbJOLrzqt2 != null && interfaceC9738bbJOLrzqt2.QfsBiF()) {
            return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Activity(true));
        }
        return new kotlin.Pair(DashboardListMode.RECOMMEND, new InterfaceC24202iYr.Application(true, false, 2, null));
    }

    public final DashboardTokenListResponse copydefault(long j, DashboardTokenListResponse dashboardTokenListResponse) {
        if (j == -1) {
            return dashboardTokenListResponse;
        }
        java.util.List<DashboardTokenInfoDetail> listEZpvd = dashboardTokenListResponse.AEQbTJ().EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (((DashboardTokenInfoDetail) obj).AEQbTJ() == j) {
                arrayList.add(obj);
            }
        }
        java.lang.String strAEQbTJ = C27491jwG.AEQbTJ(arrayList, new Function1() { // from class: o.jaC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26370jaz.values((DashboardTokenInfoDetail) obj2);
            }
        });
        java.lang.String strAEQbTJ2 = C27491jwG.AEQbTJ(arrayList, new Function1() { // from class: o.jaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26370jaz.AkhnZx((DashboardTokenInfoDetail) obj2);
            }
        });
        java.lang.String strAEQbTJ3 = C27491jwG.AEQbTJ(arrayList, new Function1() { // from class: o.jaB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26370jaz.fJNWhG((DashboardTokenInfoDetail) obj2);
            }
        });
        java.util.List<DashboardTokenInfoDetail> listEZpvd2 = dashboardTokenListResponse.OLrzqt().EZpvd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listEZpvd2) {
            if (((DashboardTokenInfoDetail) obj2).AEQbTJ() == j) {
                arrayList2.add(obj2);
            }
        }
        java.lang.String strAEQbTJ4 = C27491jwG.AEQbTJ(arrayList2, new Function1() { // from class: o.jay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C26370jaz.fARcdN((DashboardTokenInfoDetail) obj3);
            }
        });
        java.lang.String strAEQbTJ5 = C27491jwG.AEQbTJ(arrayList2, new Function1() { // from class: o.jaE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C26370jaz.ejfBZ((DashboardTokenInfoDetail) obj3);
            }
        });
        java.lang.String strAEQbTJ6 = C27491jwG.AEQbTJ(arrayList2, new Function1() { // from class: o.jaD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return C26370jaz.gEmmrt((DashboardTokenInfoDetail) obj3);
            }
        });
        java.util.List<DashboardTokenInfoDetail> listEZpvd3 = dashboardTokenListResponse.KWHzl().EZpvd();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : listEZpvd3) {
            if (((DashboardTokenInfoDetail) obj3).AEQbTJ() == j) {
                arrayList3.add(obj3);
            }
        }
        return dashboardTokenListResponse.OLrzqt((129 & 1) != 0 ? dashboardTokenListResponse.accountId : null, (129 & 2) != 0 ? dashboardTokenListResponse.totalAssets : C33129mqd.addS$default(C33129mqd.addS$default(strAEQbTJ, strAEQbTJ4, null, null, null, 14, null), C27491jwG.AEQbTJ(arrayList3, new Function1() { // from class: o.jaF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C26370jaz.isConnected((DashboardTokenInfoDetail) obj4);
            }
        }), null, null, null, 14, null), (129 & 4) != 0 ? dashboardTokenListResponse.yesterdayProfit : C33129mqd.addS$default(C33129mqd.addS$default(strAEQbTJ2, strAEQbTJ5, null, null, null, 14, null), C27491jwG.AEQbTJ(arrayList3, new Function1() { // from class: o.jaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C26370jaz.fetchVPNInfo((DashboardTokenInfoDetail) obj4);
            }
        }), null, null, null, 14, null), (129 & 8) != 0 ? dashboardTokenListResponse.totalEarnings : C33129mqd.addS$default(C33129mqd.addS$default(strAEQbTJ3, strAEQbTJ6, null, null, null, 14, null), C27491jwG.AEQbTJ(arrayList3, new Function1() { // from class: o.jaH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C26370jaz.DbNXlk((DashboardTokenInfoDetail) obj4);
            }
        }), null, null, null, 14, null), (129 & 16) != 0 ? dashboardTokenListResponse.single : dashboardTokenListResponse.AEQbTJ().KWHzl(arrayList), (129 & 32) != 0 ? dashboardTokenListResponse.dual : dashboardTokenListResponse.OLrzqt().KWHzl(arrayList2), (129 & 64) != 0 ? dashboardTokenListResponse.borrow : dashboardTokenListResponse.KWHzl().KWHzl(arrayList3), (129 & 128) != 0 ? dashboardTokenListResponse.showViewByToken : false);
    }

    public static final java.lang.String values(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.valueOf();
    }

    public static final java.lang.String AkhnZx(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.ejfBZ();
    }

    public static final java.lang.String fJNWhG(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.fIwbmz();
    }

    public static final java.lang.String fARcdN(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.valueOf();
    }

    public static final java.lang.String ejfBZ(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.ejfBZ();
    }

    public static final java.lang.String gEmmrt(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.fIwbmz();
    }

    public static final java.lang.String isConnected(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.valueOf();
    }

    public static final java.lang.String fetchVPNInfo(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.ejfBZ();
    }

    public static final java.lang.String DbNXlk(DashboardTokenInfoDetail dashboardTokenInfoDetail) {
        Intrinsics.checkNotNullParameter(dashboardTokenInfoDetail, "");
        return dashboardTokenInfoDetail.fIwbmz();
    }
}
