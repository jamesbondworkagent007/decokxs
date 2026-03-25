package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18898frB {
    public static final C18992fsq OLrzqt(@NotNull C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        java.lang.String strWlaJM = c10525bqB.wlaJM();
        java.lang.String strDbNXlk = c10525bqB.values().DbNXlk();
        long jGEmmrt = c10525bqB.gEmmrt();
        long jOLrzqt = c10525bqB.OLrzqt();
        java.lang.String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
        java.lang.String strDbNXlk2 = c10525bqB.KWHzl().DbNXlk();
        java.lang.String strHDKMBd = c10525bqB.hDKMBd();
        java.lang.String strAuCTelauCTel = c10525bqB.AuCTelauCTel();
        java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
        java.lang.String strOLrzqt = c10525bqB.OLrzqt(true);
        boolean newProxyInstance = c10525bqB.KWHzl().getNewProxyInstance();
        boolean zOuxcSI = c10525bqB.KWHzl().OuxcSI();
        C13852daR c13852daRODWQjV = c10525bqB.values().ODWQjV();
        return new C18992fsq(strWlaJM, strDbNXlk, jGEmmrt, jOLrzqt, strFJNWhG, strDbNXlk2, strHDKMBd, strAuCTelauCTel, displayAmount$default, strOLrzqt, newProxyInstance, (c10525bqB.KWHzl().giSNqX() || (c10854bwMKWHzl = c10525bqB.KWHzl().KWHzl()) == null) ? null : c10854bwMKWHzl.copydefault(), zOuxcSI, c13852daRODWQjV != null ? c13852daRODWQjV.valueOf() : null, c10525bqB.values().djSkpj(), c10525bqB.KWHzl().DBxZfM(), c10525bqB.zuBGHE(), c10525bqB.KWHzl().OLrzqt());
    }

    public static final C18978fsc EZpvd(@NotNull C10594brR c10594brR) {
        Intrinsics.checkNotNullParameter(c10594brR, "");
        java.lang.String strAkhnZx = c10594brR.fetchVPNInfo().AkhnZx();
        java.lang.String strDbNXlk = c10594brR.DbNXlk().DbNXlk();
        long jGEmmrt = c10594brR.gEmmrt();
        java.lang.String strFJNWhG = c10594brR.KWHzl().fJNWhG();
        java.lang.String strFetchVPNInfo = c10594brR.fetchVPNInfo().fetchVPNInfo();
        int iValueOf = c10594brR.KWHzl().valueOf();
        int iAkhnZx = c10594brR.KWHzl().AkhnZx();
        java.lang.String strValues = c10594brR.values();
        java.lang.String strAhwBna = c10594brR.AhwBna();
        CustomChainMeta customChainMetaOLrzqt = c10594brR.fetchVPNInfo().OLrzqt();
        return new C18978fsc(strAkhnZx, strDbNXlk, jGEmmrt, strFJNWhG, strFetchVPNInfo, iValueOf, iAkhnZx, strValues, strAhwBna, customChainMetaOLrzqt != null ? customChainMetaOLrzqt.valueOf() : null);
    }

    public static final C18999fsx EZpvd(@NotNull C10528bqE c10528bqE) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(c10528bqE, "");
        java.lang.String strDjBIcL = c10528bqE.djBIcL();
        java.lang.String strDbNXlk = c10528bqE.values().DbNXlk();
        long jGEmmrt = c10528bqE.gEmmrt();
        java.lang.String strFetchVPNInfo = c10528bqE.fetchVPNInfo();
        java.lang.String strAEQbTJ = c10528bqE.AEQbTJ();
        java.lang.String strOLrzqt = c10528bqE.OLrzqt();
        C10854bwM c10854bwMIsConnected = c10528bqE.isConnected();
        if (c10854bwMIsConnected == null || (strCopydefault = c10854bwMIsConnected.gEmmrt()) == null) {
            strCopydefault = c10528bqE.copydefault();
        }
        return new C18999fsx(strDjBIcL, strDbNXlk, jGEmmrt, strFetchVPNInfo, strAEQbTJ, strOLrzqt, strCopydefault, c10528bqE.copydefault(), c10528bqE.AkhnZx());
    }

    public static final C18990fso KWHzl(@NotNull C10527bqD c10527bqD) {
        Intrinsics.checkNotNullParameter(c10527bqD, "");
        return new C18990fso(c10527bqD.AhwBna(), c10527bqD.values().DbNXlk(), c10527bqD.gEmmrt(), C33129mqd.valueOf(c10527bqD.valueOf()), c10527bqD.AYXKKw(), c10527bqD.KWHzl(), c10527bqD.AEQbTJ(), c10527bqD.copydefault());
    }

    public static final java.util.List<C18992fsq> AEQbTJ(java.util.List<C10525bqB> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((C10525bqB) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<C18978fsc> EZpvd(java.util.List<C10594brR> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((C10594brR) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<C18999fsx> copydefault(java.util.List<C10528bqE> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((C10528bqE) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<C18990fso> OLrzqt(java.util.List<C10527bqD> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((C10527bqD) it.next()));
        }
        return arrayList;
    }
}
