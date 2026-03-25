package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ReserveInfoBean {
    public static final int $stable = 8;
    private boolean isNativeToken;
    private int precision;
    private String reservedAmount;
    private String reservedFee;
    private String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReserveInfoBean copy$default(ReserveInfoBean reserveInfoBean, boolean z, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = reserveInfoBean.isNativeToken;
        }
        if ((i2 & 2) != 0) {
            str = reserveInfoBean.tokenContractAddress;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = reserveInfoBean.reservedAmount;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = reserveInfoBean.reservedFee;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = reserveInfoBean.precision;
        }
        return reserveInfoBean.copy(z, str4, str5, str6, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reservedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.reservedFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReserveInfoBean copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ReserveInfoBean(z, str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveInfoBean)) {
            return false;
        }
        ReserveInfoBean reserveInfoBean = (ReserveInfoBean) obj;
        return this.isNativeToken == reserveInfoBean.isNativeToken && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) reserveInfoBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.reservedAmount, (Object) reserveInfoBean.reservedAmount) && Intrinsics.EZpvd((Object) this.reservedFee, (Object) reserveInfoBean.reservedFee) && this.precision == reserveInfoBean.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReservedAmount() {
        return this.reservedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReservedFee() {
        return this.reservedFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isNativeToken) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.reservedAmount.hashCode()) * 31) + this.reservedFee.hashCode()) * 31) + Integer.hashCode(this.precision);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeToken(boolean z) {
        this.isNativeToken = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(int i) {
        this.precision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReservedAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reservedAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReservedFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reservedFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReserveInfoBean(isNativeToken=" + this.isNativeToken + ", tokenContractAddress=" + this.tokenContractAddress + ", reservedAmount=" + this.reservedAmount + ", reservedFee=" + this.reservedFee + ", precision=" + this.precision + ")";
    }

    public ReserveInfoBean(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isNativeToken = z;
        this.tokenContractAddress = str;
        this.reservedAmount = str2;
        this.reservedFee = str3;
        this.precision = i;
    }
}
