package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawAddressInfoReq {
    public static final int $stable = 0;
    private final String address;
    private final int currencyId;
    private final boolean invalidAsset;
    private final int subCurrencyId;
    private final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawAddressInfoReq copy$default(WithdrawAddressInfoReq withdrawAddressInfoReq, String str, String str2, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = withdrawAddressInfoReq.address;
        }
        if ((i3 & 2) != 0) {
            str2 = withdrawAddressInfoReq.tag;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            z = withdrawAddressInfoReq.invalidAsset;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i = withdrawAddressInfoReq.currencyId;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = withdrawAddressInfoReq.subCurrencyId;
        }
        return withdrawAddressInfoReq.copy(str, str3, z2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawAddressInfoReq copy(@NotNull String str, String str2, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WithdrawAddressInfoReq(str, str2, z, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawAddressInfoReq)) {
            return false;
        }
        WithdrawAddressInfoReq withdrawAddressInfoReq = (WithdrawAddressInfoReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) withdrawAddressInfoReq.address) && Intrinsics.EZpvd((Object) this.tag, (Object) withdrawAddressInfoReq.tag) && this.invalidAsset == withdrawAddressInfoReq.invalidAsset && this.currencyId == withdrawAddressInfoReq.currencyId && this.subCurrencyId == withdrawAddressInfoReq.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        String str = this.tag;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.invalidAsset)) * 31) + Integer.hashCode(this.currencyId)) * 31) + Integer.hashCode(this.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawAddressInfoReq(address=" + this.address + ", tag=" + this.tag + ", invalidAsset=" + this.invalidAsset + ", currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    public WithdrawAddressInfoReq(@NotNull String str, String str2, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
        this.tag = str2;
        this.invalidAsset = z;
        this.currencyId = i;
        this.subCurrencyId = i2;
    }
}
