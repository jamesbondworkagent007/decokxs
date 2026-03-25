package o;

import com.okinc.business.invest_biz.data.bean.CandleResultInfo;
import com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C23951iPj {

    /* JADX INFO: renamed from: o.iPj$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestKLineDataPoint.Type.values().length];
            try {
                iArr[InvestKLineDataPoint.Type.NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestKLineDataPoint.Type.BONUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static /* synthetic */ InvestKLineDataPoint toDataPoint$default(CandleResultInfo candleResultInfo, int i, InvestKLineDataPoint.Type type, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            int i3 = ActionBar.EZpvd[type.ordinal()];
            if (i3 == 1) {
                str = candleResultInfo.getRate();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = candleResultInfo.getBonusRate();
            }
        }
        return EZpvd(candleResultInfo, i, type, str);
    }

    public static final InvestKLineDataPoint EZpvd(CandleResultInfo candleResultInfo, int i, InvestKLineDataPoint.Type type, java.lang.String str) {
        return new InvestKLineDataPoint(i, type, C33129mqd.djBIcL(str), C33129mqd.valueOf(candleResultInfo.getTimestamp()), EZpvd(candleResultInfo), candleResultInfo.getTotalReward());
    }

    public static final InvestKLineCandleInfo EZpvd(@NotNull CandleResultInfo candleResultInfo) {
        Intrinsics.checkNotNullParameter(candleResultInfo, "");
        return new InvestKLineCandleInfo(candleResultInfo.getRate(), candleResultInfo.getTimestamp(), candleResultInfo.getLimitValue(), candleResultInfo.getBonusRate());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C23949iPh EZpvd(@NotNull java.util.List<CandleResultInfo> list) {
        java.lang.String bonusRate;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        CandleResultInfo candleResultInfo = null;
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            CandleResultInfo candleResultInfo2 = (CandleResultInfo) obj;
            if (candleResultInfo == null || (bonusRate = candleResultInfo.getBonusRate()) == null) {
                if (candleResultInfo2.getBonusRate().length() == 0) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    if (candleResultInfo != null) {
                        arrayList4.add(toDataPoint$default(candleResultInfo, i - 1, InvestKLineDataPoint.Type.BONUS, null, 4, null));
                    }
                    arrayList4.add(toDataPoint$default(candleResultInfo2, i, InvestKLineDataPoint.Type.NORMAL, null, 4, null));
                    arrayList.add(arrayList4);
                } else {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    if (candleResultInfo != null) {
                        int i2 = i - 1;
                        InvestKLineDataPoint.Type type = InvestKLineDataPoint.Type.NORMAL;
                        arrayList5.add(toDataPoint$default(candleResultInfo, i2, type, null, 4, null));
                        arrayList6.add(toDataPoint$default(candleResultInfo, i2, type, null, 4, null));
                    }
                    int i3 = i;
                    arrayList5.add(toDataPoint$default(candleResultInfo2, i3, InvestKLineDataPoint.Type.BONUS, null, 4, null));
                    arrayList2.add(arrayList5);
                    arrayList6.add(toDataPoint$default(candleResultInfo2, i3, InvestKLineDataPoint.Type.NORMAL, null, 4, null));
                    arrayList3.add(arrayList6);
                }
            } else if ((candleResultInfo2.getBonusRate().length() == 0) == (bonusRate.length() == 0)) {
                if (candleResultInfo2.getBonusRate().length() == 0) {
                    java.util.List list2 = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                    if (list2 != null) {
                        list2.add(toDataPoint$default(candleResultInfo2, i, InvestKLineDataPoint.Type.NORMAL, null, 4, null));
                    }
                } else {
                    java.util.List list3 = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(arrayList2);
                    if (list3 != null) {
                        list3.add(toDataPoint$default(candleResultInfo2, i, InvestKLineDataPoint.Type.BONUS, null, 4, null));
                    }
                    java.util.List list4 = (java.util.List) CollectionsKt___CollectionsKt.wlaJM(arrayList3);
                    if (list4 != null) {
                        list4.add(toDataPoint$default(candleResultInfo2, i, InvestKLineDataPoint.Type.NORMAL, null, 4, null));
                    }
                }
            }
            i++;
            candleResultInfo = candleResultInfo2;
        }
        return new C23949iPh(arrayList, arrayList2, arrayList3);
    }

    public static final java.util.List<InvestKLineDataPoint> copydefault(@NotNull java.util.List<CandleResultInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((CandleResultInfo) obj).getTotalReward())) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        for (java.lang.Object obj2 : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(toDataPoint$default((CandleResultInfo) obj2, i, InvestKLineDataPoint.Type.NORMAL, null, 4, null));
            i++;
        }
        return arrayList;
    }
}
