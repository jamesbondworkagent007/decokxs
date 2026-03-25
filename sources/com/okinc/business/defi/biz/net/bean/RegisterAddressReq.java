package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RegisterAddressReq {
    public static final int $stable = 8;
    private final long bannerId;
    private final List<AddressRegisterBean> registerAddressList;
    private final String uid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.RegisterAddressReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RegisterAddressReq copy$default(RegisterAddressReq registerAddressReq, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = registerAddressReq.uid;
        }
        if ((i & 2) != 0) {
            j = registerAddressReq.bannerId;
        }
        if ((i & 4) != 0) {
            list = registerAddressReq.registerAddressList;
        }
        return registerAddressReq.copy(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterBean> component3() {
        return this.registerAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RegisterAddressReq copy(@NotNull String str, long j, @NotNull List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RegisterAddressReq(str, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAddressReq)) {
            return false;
        }
        RegisterAddressReq registerAddressReq = (RegisterAddressReq) obj;
        return Intrinsics.EZpvd((Object) this.uid, (Object) registerAddressReq.uid) && this.bannerId == registerAddressReq.bannerId && Intrinsics.EZpvd(this.registerAddressList, registerAddressReq.registerAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBannerId() {
        return this.bannerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressRegisterBean> getRegisterAddressList() {
        return this.registerAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uid.hashCode() * 31) + Long.hashCode(this.bannerId)) * 31) + this.registerAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RegisterAddressReq(uid=" + this.uid + ", bannerId=" + this.bannerId + ", registerAddressList=" + this.registerAddressList + ")";
    }

    public RegisterAddressReq(@NotNull String str, long j, @NotNull List<AddressRegisterBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.uid = str;
        this.bannerId = j;
        this.registerAddressList = list;
    }
}
