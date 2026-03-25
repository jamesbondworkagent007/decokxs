package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AddressRegisterStatusReq {
    public static final int $stable = 8;
    private final long bannerId;
    private final List<AddressRegisterBean> queryAddressList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.AddressRegisterStatusReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressRegisterStatusReq copy$default(AddressRegisterStatusReq addressRegisterStatusReq, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addressRegisterStatusReq.bannerId;
        }
        if ((i & 2) != 0) {
            list = addressRegisterStatusReq.queryAddressList;
        }
        return addressRegisterStatusReq.copy(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterBean> component2() {
        return this.queryAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressRegisterStatusReq copy(long j, @NotNull List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AddressRegisterStatusReq(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressRegisterStatusReq)) {
            return false;
        }
        AddressRegisterStatusReq addressRegisterStatusReq = (AddressRegisterStatusReq) obj;
        return this.bannerId == addressRegisterStatusReq.bannerId && Intrinsics.EZpvd(this.queryAddressList, addressRegisterStatusReq.queryAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBannerId() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterBean> getQueryAddressList() {
        return this.queryAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.bannerId) * 31) + this.queryAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressRegisterStatusReq(bannerId=" + this.bannerId + ", queryAddressList=" + this.queryAddressList + ")";
    }

    public AddressRegisterStatusReq(long j, @NotNull List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.bannerId = j;
        this.queryAddressList = list;
    }
}
