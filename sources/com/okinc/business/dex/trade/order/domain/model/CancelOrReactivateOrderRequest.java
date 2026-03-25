package com.okinc.business.dex.trade.order.domain.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CancelOrReactivateOrderRequest {
    public static final int $stable = 8;
    private final String accountId;
    private final List<String> orderIds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelOrReactivateOrderRequest copy$default(CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelOrReactivateOrderRequest.accountId;
        }
        if ((i & 2) != 0) {
            list = cancelOrReactivateOrderRequest.orderIds;
        }
        return cancelOrReactivateOrderRequest.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.orderIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelOrReactivateOrderRequest copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new CancelOrReactivateOrderRequest(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelOrReactivateOrderRequest)) {
            return false;
        }
        CancelOrReactivateOrderRequest cancelOrReactivateOrderRequest = (CancelOrReactivateOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) cancelOrReactivateOrderRequest.accountId) && Intrinsics.EZpvd(this.orderIds, cancelOrReactivateOrderRequest.orderIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOrderIds() {
        return this.orderIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.accountId.hashCode() * 31) + this.orderIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CancelOrReactivateOrderRequest(accountId=" + this.accountId + ", orderIds=" + this.orderIds + ")";
    }

    public CancelOrReactivateOrderRequest(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.orderIds = list;
    }
}
