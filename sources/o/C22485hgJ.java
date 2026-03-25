package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.ExecutionHistory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hgJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22485hgJ {
    public final java.util.List<hMR> AEQbTJ(@NotNull java.util.List<ExecutionHistory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ExecutionHistory executionHistory = (ExecutionHistory) obj;
            arrayList.add(new hMR(executionHistory.getExploreUrl(), executionHistory.getExecutionTime(), executionHistory.getDetail(), executionHistory.getCode()));
            i++;
        }
        return arrayList;
    }
}
