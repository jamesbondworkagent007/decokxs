package o;

import com.okinc.business.invest_biz.data.bean.response.DashboardResponse;
import com.okinc.business.invest_biz.data.bean.response.NetworkTotal;
import com.okinc.business.invest_biz.data.bean.response.PlatformDetails;
import com.okinc.business.invest_biz.data.bean.response.PlatformVO;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDW {
    public final C23662iEr EZpvd;
    public final iDR KWHzl;

    @yCM
    public iDW(@NotNull C23662iEr c23662iEr, @NotNull iDR idr) {
        Intrinsics.checkNotNullParameter(c23662iEr, "");
        Intrinsics.checkNotNullParameter(idr, "");
        this.EZpvd = c23662iEr;
        this.KWHzl = idr;
    }

    public final C23666iEv KWHzl(@NotNull DashboardResponse dashboardResponse) {
        Intrinsics.checkNotNullParameter(dashboardResponse, "");
        PlatformDetails platformDetails = (PlatformDetails) CollectionsKt___CollectionsKt.firstOrNull(dashboardResponse.EZpvd());
        if (platformDetails == null) {
            return C23666iEv.Companion.AEQbTJ();
        }
        java.lang.String strAEQbTJ = platformDetails.AEQbTJ();
        java.lang.String strCopydefault = platformDetails.copydefault();
        boolean zOLrzqt = platformDetails.OLrzqt();
        iEI iei = new iEI(dashboardResponse.copydefault(), dashboardResponse.AEQbTJ());
        java.util.List<PlatformVO> listEZpvd = platformDetails.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(this.EZpvd.KWHzl((PlatformVO) it.next()));
        }
        java.util.List<NetworkTotal> listKWHzl = dashboardResponse.KWHzl();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it2 = listKWHzl.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.KWHzl.copydefault((NetworkTotal) it2.next()));
        }
        return new C23666iEv(strAEQbTJ, strCopydefault, platformDetails.AhwBna(), platformDetails.djBIcL(), false, zOLrzqt, arrayList, arrayList2, iei, C33129mqd.OLrzqt((java.lang.CharSequence) platformDetails.AhwBna()) && C33129mqd.OLrzqt((java.lang.CharSequence) platformDetails.djBIcL()));
    }
}
