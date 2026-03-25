package o;

import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderApiModel;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31385lsy {
    public static final C31342lsH OLrzqt(@NotNull PendingClaimOrderResponse pendingClaimOrderResponse) {
        Intrinsics.checkNotNullParameter(pendingClaimOrderResponse, "");
        java.lang.String nextCursor = pendingClaimOrderResponse.getNextCursor();
        java.lang.String total = pendingClaimOrderResponse.getTotal();
        java.util.List<PendingClaimOrderApiModel> orderList = pendingClaimOrderResponse.getOrderList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(orderList, 10));
        java.util.Iterator<T> it = orderList.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingClaimOrderApiModel) it.next()).toDomainModel());
        }
        return new C31342lsH(nextCursor, total, arrayList);
    }
}
