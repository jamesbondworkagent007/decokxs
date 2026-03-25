package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterStatusResultBean;
import com.okinc.business.defi.wallet.home.usdgActivity.data.model.USDGActivityDetailBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HotActivityAddressStatusResp {
    public static final int $stable = 0;
    private final USDGActivityDetailBean activityDetail;
    private final AddressRegisterStatusResultBean addressRegisterDetail;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HotActivityAddressStatusResp copy$default(HotActivityAddressStatusResp hotActivityAddressStatusResp, AddressRegisterStatusResultBean addressRegisterStatusResultBean, USDGActivityDetailBean uSDGActivityDetailBean, int i, Object obj) {
        if ((i & 1) != 0) {
            addressRegisterStatusResultBean = hotActivityAddressStatusResp.addressRegisterDetail;
        }
        if ((i & 2) != 0) {
            uSDGActivityDetailBean = hotActivityAddressStatusResp.activityDetail;
        }
        return hotActivityAddressStatusResp.copy(addressRegisterStatusResultBean, uSDGActivityDetailBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressRegisterStatusResultBean component1() {
        return this.addressRegisterDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final USDGActivityDetailBean component2() {
        return this.activityDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HotActivityAddressStatusResp copy(@NotNull AddressRegisterStatusResultBean addressRegisterStatusResultBean, @NotNull USDGActivityDetailBean uSDGActivityDetailBean) {
        Intrinsics.checkNotNullParameter(addressRegisterStatusResultBean, "");
        Intrinsics.checkNotNullParameter(uSDGActivityDetailBean, "");
        return new HotActivityAddressStatusResp(addressRegisterStatusResultBean, uSDGActivityDetailBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotActivityAddressStatusResp)) {
            return false;
        }
        HotActivityAddressStatusResp hotActivityAddressStatusResp = (HotActivityAddressStatusResp) obj;
        return Intrinsics.EZpvd(this.addressRegisterDetail, hotActivityAddressStatusResp.addressRegisterDetail) && Intrinsics.EZpvd(this.activityDetail, hotActivityAddressStatusResp.activityDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final USDGActivityDetailBean getActivityDetail() {
        return this.activityDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressRegisterStatusResultBean getAddressRegisterDetail() {
        return this.addressRegisterDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.addressRegisterDetail.hashCode() * 31) + this.activityDetail.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HotActivityAddressStatusResp(addressRegisterDetail=" + this.addressRegisterDetail + ", activityDetail=" + this.activityDetail + ")";
    }

    public HotActivityAddressStatusResp(@NotNull AddressRegisterStatusResultBean addressRegisterStatusResultBean, @NotNull USDGActivityDetailBean uSDGActivityDetailBean) {
        Intrinsics.checkNotNullParameter(addressRegisterStatusResultBean, "");
        Intrinsics.checkNotNullParameter(uSDGActivityDetailBean, "");
        this.addressRegisterDetail = addressRegisterStatusResultBean;
        this.activityDetail = uSDGActivityDetailBean;
    }
}
