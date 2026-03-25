package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterStatusResultBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class QueryAddressRegisterStatusRes {
    public static final int $stable = 8;
    private final List<AddressRegisterStatusResultBean> addressRegisterResultList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.QueryAddressRegisterStatusRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryAddressRegisterStatusRes copy$default(QueryAddressRegisterStatusRes queryAddressRegisterStatusRes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = queryAddressRegisterStatusRes.addressRegisterResultList;
        }
        return queryAddressRegisterStatusRes.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterStatusResultBean> component1() {
        return this.addressRegisterResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryAddressRegisterStatusRes copy(@NotNull List<AddressRegisterStatusResultBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new QueryAddressRegisterStatusRes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QueryAddressRegisterStatusRes) && Intrinsics.EZpvd(this.addressRegisterResultList, ((QueryAddressRegisterStatusRes) obj).addressRegisterResultList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterStatusResultBean> getAddressRegisterResultList() {
        return this.addressRegisterResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.addressRegisterResultList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryAddressRegisterStatusRes(addressRegisterResultList=" + this.addressRegisterResultList + ")";
    }

    public QueryAddressRegisterStatusRes(@NotNull List<AddressRegisterStatusResultBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.addressRegisterResultList = list;
    }
}
