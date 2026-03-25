package o;

import com.okinc.business.invest_biz.data.bean.AggregateItem;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.PointsInfo;
import com.okinc.business.invest_biz.data.bean.PointsValueType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26521jdr {

    /* JADX INFO: renamed from: o.jdr$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PointsValueType.values().length];
            try {
                iArr[PointsValueType.DOLLAR_VALUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PointsValueType.QUANTITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public C26521jdr() {
    }

    public final C26522jds AEQbTJ(@NotNull AggregateItem aggregateItem) {
        java.util.List<PointInfo> listAhwBna;
        boolean z;
        java.lang.String currencyData$default;
        Intrinsics.checkNotNullParameter(aggregateItem, "");
        PointsInfo pointsInfoFJNWhG = aggregateItem.fJNWhG();
        if (pointsInfoFJNWhG == null || (listAhwBna = pointsInfoFJNWhG.copydefault()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        if ((listAhwBna instanceof java.util.Collection) && listAhwBna.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                java.lang.String strCopydefault = ((PointInfo) it.next()).copydefault();
                if (strCopydefault != null && strCopydefault.length() > 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (PointInfo pointInfo : listAhwBna) {
            int i = Activity.EZpvd[pointInfo.AhwBna().ordinal()];
            if (i == 1) {
                currencyData$default = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, pointInfo.KWHzl(), null, null, null, 14, null);
            } else if (i == 2) {
                currencyData$default = C27492jwH.limitFmtNoZeroAndUpWithKMB$default(C27492jwH.OLrzqt, pointInfo.KWHzl(), 0, 0, false, 14, null);
            } else {
                currencyData$default = pointInfo.KWHzl();
            }
            arrayList.add(new C26449jcY(currencyData$default, pointInfo.EZpvd(), pointInfo.copydefault(), z, Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AubY(listAhwBna), pointInfo)));
        }
        return new C26522jds(new C26526jdw(aggregateItem.EZpvd(), aggregateItem.AhwBna(), aggregateItem.fetchVPNInfo(), aggregateItem.AkhnZx(), aggregateItem.DbNXlk(), aggregateItem.values(), aggregateItem.iwGUEr(), aggregateItem.AuCTel(), aggregateItem.fARcdN(), aggregateItem.hDKMBd(), aggregateItem.getFieldNames(), aggregateItem.fIwbmz(), aggregateItem.djBIcL(), aggregateItem.isConnected(), false, false, null, 0, 245760, null), arrayList);
    }
}
