package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HotActivityAddressStatusReq {
    public static final int $stable = 0;
    private final long chainIndex;
    private final String tokenAddress;
    private final String userAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HotActivityAddressStatusReq copy$default(HotActivityAddressStatusReq hotActivityAddressStatusReq, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hotActivityAddressStatusReq.userAddress;
        }
        if ((i & 2) != 0) {
            j = hotActivityAddressStatusReq.chainIndex;
        }
        if ((i & 4) != 0) {
            str2 = hotActivityAddressStatusReq.tokenAddress;
        }
        return hotActivityAddressStatusReq.copy(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HotActivityAddressStatusReq copy(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HotActivityAddressStatusReq(str, j, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotActivityAddressStatusReq)) {
            return false;
        }
        HotActivityAddressStatusReq hotActivityAddressStatusReq = (HotActivityAddressStatusReq) obj;
        return Intrinsics.EZpvd((Object) this.userAddress, (Object) hotActivityAddressStatusReq.userAddress) && this.chainIndex == hotActivityAddressStatusReq.chainIndex && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) hotActivityAddressStatusReq.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.userAddress.hashCode() * 31) + Long.hashCode(this.chainIndex)) * 31) + this.tokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HotActivityAddressStatusReq(userAddress=" + this.userAddress + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public HotActivityAddressStatusReq(@NotNull String str, long j, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.userAddress = str;
        this.chainIndex = j;
        this.tokenAddress = str2;
    }
}
