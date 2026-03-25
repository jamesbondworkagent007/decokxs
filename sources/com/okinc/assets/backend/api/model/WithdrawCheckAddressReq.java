package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawCheckAddressReq {
    public static final int $stable = 0;
    private final String address;
    private final String areaCode;
    private final Integer currencyId;
    private final Integer internalAddressType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawCheckAddressReq copy$default(WithdrawCheckAddressReq withdrawCheckAddressReq, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawCheckAddressReq.address;
        }
        if ((i & 2) != 0) {
            str2 = withdrawCheckAddressReq.areaCode;
        }
        if ((i & 4) != 0) {
            num = withdrawCheckAddressReq.internalAddressType;
        }
        if ((i & 8) != 0) {
            num2 = withdrawCheckAddressReq.currencyId;
        }
        return withdrawCheckAddressReq.copy(str, str2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawCheckAddressReq copy(@NotNull String str, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WithdrawCheckAddressReq(str, str2, num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawCheckAddressReq)) {
            return false;
        }
        WithdrawCheckAddressReq withdrawCheckAddressReq = (WithdrawCheckAddressReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawCheckAddressReq.address) && Intrinsics.EZpvd((Object) this.areaCode, (Object) withdrawCheckAddressReq.areaCode) && Intrinsics.EZpvd(this.internalAddressType, withdrawCheckAddressReq.internalAddressType) && Intrinsics.EZpvd(this.currencyId, withdrawCheckAddressReq.currencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        String str = this.areaCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.internalAddressType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.currencyId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawCheckAddressReq(address=" + this.address + ", areaCode=" + this.areaCode + ", internalAddressType=" + this.internalAddressType + ", currencyId=" + this.currencyId + ")";
    }

    public WithdrawCheckAddressReq(@NotNull String str, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.areaCode = str2;
        this.internalAddressType = num;
        this.currencyId = num2;
    }
}
