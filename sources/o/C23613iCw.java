package o;

import com.okinc.business.invest_biz.data.bean.FilterCondition;
import com.okinc.business.invest_biz.data.bean.FiltersData;
import com.okinc.business.invest_biz.data.bean.SortCondition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23613iCw {
    public static /* synthetic */ java.util.List mapToAggregateFilter$default(FiltersData filtersData, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return copydefault(filtersData, function1);
    }

    public static final java.util.List<C24148iWr> copydefault(FiltersData filtersData, Function1<? super FilterCondition, java.lang.Boolean> function1) {
        if (filtersData == null || !filtersData.AYXKKw()) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!filtersData.KWHzl().isEmpty()) {
            arrayList.add(copydefault(filtersData.KWHzl(), 1, function1));
        }
        if (!filtersData.OLrzqt().isEmpty()) {
            arrayList.add(getFilter$default(filtersData.OLrzqt(), 5, null, 4, null));
        }
        if (!filtersData.djBIcL().isEmpty()) {
            arrayList.add(copydefault(filtersData.djBIcL()));
        }
        if (!filtersData.EZpvd().isEmpty()) {
            arrayList.add(getFilter$default(filtersData.EZpvd(), 3, null, 4, null));
        }
        if (!filtersData.AEQbTJ().isEmpty()) {
            arrayList.add(getFilter$default(filtersData.AEQbTJ(), 4, null, 4, null));
        }
        return arrayList;
    }

    public static /* synthetic */ C24148iWr getFilter$default(java.util.List list, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return copydefault(list, i, function1);
    }

    public static final C24148iWr copydefault(@NotNull java.util.List<FilterCondition> list, int i, Function1<? super FilterCondition, java.lang.Boolean> function1) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            FilterCondition filterCondition = (FilterCondition) obj;
            C55276xgr c55276xgr = new C55276xgr(filterCondition.AEQbTJ() != -1 ? filterCondition.EZpvd() + " (" + filterCondition.AEQbTJ() + ")" : filterCondition.EZpvd(), new iWQ(filterCondition.copydefault(), i), null, false, false, filterCondition.OLrzqt(), null, 92, null);
            boolean z = true;
            if (function1 != null) {
                zBooleanValue = function1.invoke(filterCondition).booleanValue();
            } else {
                zBooleanValue = i2 == 0;
            }
            c55276xgr.copydefault(zBooleanValue);
            if (filterCondition.AEQbTJ() == 0) {
                z = false;
            }
            c55276xgr.OLrzqt(z);
            arrayList.add(c55276xgr);
            i2++;
        }
        return new C24148iWr(arrayList);
    }

    public static final C24148iWr copydefault(@NotNull java.util.List<SortCondition> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SortCondition sortCondition = (SortCondition) obj;
            C55276xgr c55276xgr = new C55276xgr(sortCondition.AEQbTJ(), new iWQ(sortCondition.EZpvd(), 2), null, false, false, null, null, 124, null);
            c55276xgr.copydefault(i == 0);
            arrayList.add(c55276xgr);
            i++;
        }
        return new C24148iWr(arrayList);
    }
}
