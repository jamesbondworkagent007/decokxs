package com.okinc.share.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareData {
    public static final int $stable = 8;
    private final FootViewData footViewData;
    private final ShareFooterInfo referralFooterInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareData copy$default(ShareData shareData, FootViewData footViewData, ShareFooterInfo shareFooterInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            footViewData = shareData.footViewData;
        }
        if ((i & 2) != 0) {
            shareFooterInfo = shareData.referralFooterInfo;
        }
        return shareData.copy(footViewData, shareFooterInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FootViewData component1() {
        return this.footViewData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareFooterInfo component2() {
        return this.referralFooterInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareData copy(@NotNull FootViewData footViewData, ShareFooterInfo shareFooterInfo) {
        Intrinsics.checkNotNullParameter(footViewData, "");
        return new ShareData(footViewData, shareFooterInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareData)) {
            return false;
        }
        ShareData shareData = (ShareData) obj;
        return Intrinsics.EZpvd(this.footViewData, shareData.footViewData) && Intrinsics.EZpvd(this.referralFooterInfo, shareData.referralFooterInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FootViewData getFootViewData() {
        return this.footViewData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareFooterInfo getReferralFooterInfo() {
        return this.referralFooterInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.footViewData.hashCode();
        ShareFooterInfo shareFooterInfo = this.referralFooterInfo;
        return (iHashCode * 31) + (shareFooterInfo == null ? 0 : shareFooterInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareData(footViewData=" + this.footViewData + ", referralFooterInfo=" + this.referralFooterInfo + ")";
    }

    public ShareData(@NotNull FootViewData footViewData, ShareFooterInfo shareFooterInfo) {
        Intrinsics.checkNotNullParameter(footViewData, "");
        this.footViewData = footViewData;
        this.referralFooterInfo = shareFooterInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.share.bean.FootViewData)
  (wrap:com.okinc.share.bean.ShareFooterInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.ShareFooterInfo) : (r2v0 com.okinc.share.bean.ShareFooterInfo))
 A[MD:(com.okinc.share.bean.FootViewData, com.okinc.share.bean.ShareFooterInfo):void (m)] (LINE:9) call: com.okinc.share.bean.ShareData.<init>(com.okinc.share.bean.FootViewData, com.okinc.share.bean.ShareFooterInfo):void type: THIS */
    public /* synthetic */ ShareData(FootViewData footViewData, ShareFooterInfo shareFooterInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(footViewData, (i & 2) != 0 ? null : shareFooterInfo);
    }
}
