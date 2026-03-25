package o;

import com.google.zxing.pdf417.PDF417Common;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardProtocolListUseCaseImpl$fetchBatchDetails$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case.DashboardProtocolListUseCaseImpl$invoke$1;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC24202iYr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26367jaw implements InterfaceC26362jar {
    public final C24201iYq AEQbTJ;
    public final iDL EZpvd;
    public final iYX KWHzl;
    public final C23580iBq copydefault;

    @yCM
    public C26367jaw(@NotNull iDL idl, @NotNull C23580iBq c23580iBq, @NotNull C24201iYq c24201iYq, @NotNull iYX iyx) {
        Intrinsics.checkNotNullParameter(idl, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(c24201iYq, "");
        Intrinsics.checkNotNullParameter(iyx, "");
        this.EZpvd = idl;
        this.copydefault = c23580iBq;
        this.AEQbTJ = c24201iYq;
        this.KWHzl = iyx;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC26362jar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull DashboardListMode dashboardListMode, long j, boolean z, @NotNull Continuation<? super kotlin.Pair<? extends DashboardListMode, ? extends InterfaceC24202iYr>> continuation) throws java.lang.Throwable {
        DashboardProtocolListUseCaseImpl$invoke$1 dashboardProtocolListUseCaseImpl$invoke$1;
        java.lang.Object objEZpvd;
        C26367jaw c26367jaw;
        DashboardListMode dashboardListMode2;
        boolean z2;
        long j2;
        C23666iEv c23666iEvCopydefault;
        C23666iEv c23666iEv;
        java.util.Map<java.lang.String, iDV> mapKWHzl;
        C26367jaw c26367jaw2;
        long j3;
        DashboardListMode dashboardListMode3;
        C23666iEv c23666iEv2;
        C27364jtm c27364jtmCopydefault;
        if (continuation instanceof DashboardProtocolListUseCaseImpl$invoke$1) {
            dashboardProtocolListUseCaseImpl$invoke$1 = (DashboardProtocolListUseCaseImpl$invoke$1) continuation;
            int i = dashboardProtocolListUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardProtocolListUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardProtocolListUseCaseImpl$invoke$1 = new DashboardProtocolListUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardProtocolListUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardProtocolListUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iDL idl = this.EZpvd;
            dashboardProtocolListUseCaseImpl$invoke$1.L$0 = this;
            dashboardProtocolListUseCaseImpl$invoke$1.L$1 = dashboardListMode;
            dashboardProtocolListUseCaseImpl$invoke$1.J$0 = j;
            dashboardProtocolListUseCaseImpl$invoke$1.Z$0 = z;
            dashboardProtocolListUseCaseImpl$invoke$1.label = 1;
            objEZpvd = idl.EZpvd(j, dashboardProtocolListUseCaseImpl$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c26367jaw = this;
            dashboardListMode2 = dashboardListMode;
            z2 = z;
            j2 = j;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = dashboardProtocolListUseCaseImpl$invoke$1.Z$0;
                j3 = dashboardProtocolListUseCaseImpl$invoke$1.J$0;
                c23666iEv2 = (C23666iEv) dashboardProtocolListUseCaseImpl$invoke$1.L$3;
                c23666iEv = (C23666iEv) dashboardProtocolListUseCaseImpl$invoke$1.L$2;
                dashboardListMode3 = (DashboardListMode) dashboardProtocolListUseCaseImpl$invoke$1.L$1;
                c26367jaw2 = (C26367jaw) dashboardProtocolListUseCaseImpl$invoke$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mapKWHzl = (java.util.Map) obj;
                c23666iEvCopydefault = c23666iEv2;
                dashboardListMode2 = dashboardListMode3;
                j2 = j3;
                c26367jaw = c26367jaw2;
                if (!mapKWHzl.isEmpty()) {
                    c27364jtmCopydefault = c26367jaw.AEQbTJ.KWHzl(c23666iEvCopydefault, mapKWHzl);
                } else {
                    c27364jtmCopydefault = c26367jaw.AEQbTJ.copydefault(c23666iEvCopydefault);
                }
                if (!C24193iYi.OLrzqt.AEQbTJ()) {
                    java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c27364jtmCopydefault.EZpvd());
                    if ((!listFJNWhG.isEmpty()) && z2) {
                        listFJNWhG.add(0, c26367jaw.KWHzl.EZpvd(c27364jtmCopydefault.KWHzl(), c23666iEvCopydefault.AYXKKw(), j2 != -1, c23666iEvCopydefault.gEmmrt(), c23666iEvCopydefault.copydefault()));
                    }
                    if (listFJNWhG.isEmpty() && j2 != -1) {
                        return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Application(true, c23666iEv.EZpvd()));
                    }
                    return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.TaskDescription(C27364jtm.copy$default(c27364jtmCopydefault, null, listFJNWhG, 1, null), c23666iEv.EZpvd()));
                }
                return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.TaskDescription(c27364jtmCopydefault, c23666iEv.EZpvd()));
            }
            z2 = dashboardProtocolListUseCaseImpl$invoke$1.Z$0;
            j2 = dashboardProtocolListUseCaseImpl$invoke$1.J$0;
            dashboardListMode2 = (DashboardListMode) dashboardProtocolListUseCaseImpl$invoke$1.L$1;
            c26367jaw = (C26367jaw) dashboardProtocolListUseCaseImpl$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objEZpvd);
        C23666iEv c23666iEv3 = (C23666iEv) objEZpvd;
        if (C33129mqd.KWHzl((java.util.Collection) c23666iEv3.OLrzqt())) {
            c23666iEvCopydefault = c26367jaw.copydefault(j2, c23666iEv3);
            pUU.copydefault("zxf", "====" + c26367jaw.copydefault());
            int iCopydefault = c26367jaw.copydefault();
            int size = c23666iEvCopydefault.OLrzqt().size();
            if (1 <= size && size <= iCopydefault) {
                dashboardProtocolListUseCaseImpl$invoke$1.L$0 = c26367jaw;
                dashboardProtocolListUseCaseImpl$invoke$1.L$1 = dashboardListMode2;
                dashboardProtocolListUseCaseImpl$invoke$1.L$2 = c23666iEv3;
                dashboardProtocolListUseCaseImpl$invoke$1.L$3 = c23666iEvCopydefault;
                dashboardProtocolListUseCaseImpl$invoke$1.J$0 = j2;
                dashboardProtocolListUseCaseImpl$invoke$1.Z$0 = z2;
                dashboardProtocolListUseCaseImpl$invoke$1.label = 2;
                java.lang.Object objOLrzqt = c26367jaw.OLrzqt(c23666iEvCopydefault, dashboardProtocolListUseCaseImpl$invoke$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c23666iEv = c23666iEv3;
                obj = objOLrzqt;
                c26367jaw2 = c26367jaw;
                j3 = j2;
                dashboardListMode3 = dashboardListMode2;
                c23666iEv2 = c23666iEvCopydefault;
                mapKWHzl = (java.util.Map) obj;
                c23666iEvCopydefault = c23666iEv2;
                dashboardListMode2 = dashboardListMode3;
                j2 = j3;
                c26367jaw = c26367jaw2;
                if (!mapKWHzl.isEmpty()) {
                }
                if (!C24193iYi.OLrzqt.AEQbTJ()) {
                }
            } else {
                c23666iEv = c23666iEv3;
                mapKWHzl = C56424yEw.KWHzl();
                if (!mapKWHzl.isEmpty()) {
                }
                if (!C24193iYi.OLrzqt.AEQbTJ()) {
                }
            }
        } else {
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = c26367jaw.copydefault.OLrzqt();
            if ((interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.QfsBiF()) || C24193iYi.OLrzqt.AEQbTJ()) {
                return new kotlin.Pair(dashboardListMode2, new InterfaceC24202iYr.Activity(true));
            }
            return new kotlin.Pair(DashboardListMode.RECOMMEND, new InterfaceC24202iYr.Application(true, false, 2, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(C23666iEv c23666iEv, Continuation<? super java.util.Map<java.lang.String, iDV>> continuation) throws java.lang.Throwable {
        DashboardProtocolListUseCaseImpl$fetchBatchDetails$1 dashboardProtocolListUseCaseImpl$fetchBatchDetails$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof DashboardProtocolListUseCaseImpl$fetchBatchDetails$1) {
            dashboardProtocolListUseCaseImpl$fetchBatchDetails$1 = (DashboardProtocolListUseCaseImpl$fetchBatchDetails$1) continuation;
            int i = dashboardProtocolListUseCaseImpl$fetchBatchDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardProtocolListUseCaseImpl$fetchBatchDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardProtocolListUseCaseImpl$fetchBatchDetails$1 = new DashboardProtocolListUseCaseImpl$fetchBatchDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardProtocolListUseCaseImpl$fetchBatchDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardProtocolListUseCaseImpl$fetchBatchDetails$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<iEE> listOLrzqt = c23666iEv.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (iEE iee : listOLrzqt) {
                arrayList.add(new ProtocolParams(iee.AYXKKw(), iee.EZpvd()));
            }
            ProtocolDetailsParams protocolDetailsParams = new ProtocolDetailsParams(null, arrayList);
            iDL idl = this.EZpvd;
            dashboardProtocolListUseCaseImpl$fetchBatchDetails$1.label = 1;
            objOLrzqt = idl.OLrzqt(protocolDetailsParams, dashboardProtocolListUseCaseImpl$fetchBatchDetails$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        return Result.m7380exceptionOrNullimpl(objOLrzqt) == null ? objOLrzqt : C56424yEw.KWHzl();
    }

    public final C23666iEv copydefault(long j, C23666iEv c23666iEv) {
        java.lang.String strAEQbTJ;
        java.lang.String strAEQbTJ2;
        java.lang.String strAEQbTJ3;
        if (j == -1) {
            return c23666iEv;
        }
        java.util.List<iEE> listOLrzqt = c23666iEv.OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : listOLrzqt) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((iEE) obj).EZpvd());
            java.lang.Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.List list = (java.util.List) linkedHashMap.get(java.lang.Long.valueOf(j));
        return c23666iEv.OLrzqt((PDF417Common.NUMBER_OF_CODEWORDS & 1) != 0 ? c23666iEv.copydefault : null, (PDF417Common.NUMBER_OF_CODEWORDS & 2) != 0 ? c23666iEv.djBIcL : (list == null || (strAEQbTJ3 = C27491jwG.AEQbTJ(list, new Function1() { // from class: o.jat
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26367jaw.AEQbTJ((iEE) obj2);
            }
        })) == null) ? "0" : strAEQbTJ3, (PDF417Common.NUMBER_OF_CODEWORDS & 4) != 0 ? c23666iEv.DbNXlk : (list == null || (strAEQbTJ2 = C27491jwG.AEQbTJ(list, new Function1() { // from class: o.jav
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26367jaw.EZpvd((iEE) obj2);
            }
        })) == null) ? "0" : strAEQbTJ2, (PDF417Common.NUMBER_OF_CODEWORDS & 8) != 0 ? c23666iEv.isConnected : (list == null || (strAEQbTJ = C27491jwG.AEQbTJ(list, new Function1() { // from class: o.jax
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C26367jaw.djBIcL((iEE) obj2);
            }
        })) == null) ? "0" : strAEQbTJ, (PDF417Common.NUMBER_OF_CODEWORDS & 16) != 0 ? c23666iEv.OLrzqt : true, (PDF417Common.NUMBER_OF_CODEWORDS & 32) != 0 ? c23666iEv.valueOf : false, (PDF417Common.NUMBER_OF_CODEWORDS & 64) != 0 ? c23666iEv.gEmmrt : list == null ? yDY.AhwBna() : list, (PDF417Common.NUMBER_OF_CODEWORDS & 128) != 0 ? c23666iEv.AYXKKw : null, (PDF417Common.NUMBER_OF_CODEWORDS & 256) != 0 ? c23666iEv.AhwBna : null, (PDF417Common.NUMBER_OF_CODEWORDS & 512) != 0 ? c23666iEv.KWHzl : false);
    }

    public static final java.lang.String AEQbTJ(iEE iee) {
        Intrinsics.checkNotNullParameter(iee, "");
        return iee.AhwBna();
    }

    public static final java.lang.String EZpvd(iEE iee) {
        Intrinsics.checkNotNullParameter(iee, "");
        return iee.AkhnZx();
    }

    public static final java.lang.String djBIcL(iEE iee) {
        Intrinsics.checkNotNullParameter(iee, "");
        return iee.gEmmrt();
    }

    public final int copydefault() {
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_defi_dash_expand_cnt", AmplitudeName.WEB3);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
            return C33129mqd.AhwBna(strAEQbTJ);
        }
        return 3;
    }
}
