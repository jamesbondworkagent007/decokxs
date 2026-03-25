package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ReserveBean {
    public static final int $stable = 8;
    private boolean isNativeToken;
    private int precision;
    private String reservedAmount;
    private String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReserveBean copy$default(ReserveBean reserveBean, boolean z, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = reserveBean.isNativeToken;
        }
        if ((i2 & 2) != 0) {
            str = reserveBean.tokenContractAddress;
        }
        if ((i2 & 4) != 0) {
            str2 = reserveBean.reservedAmount;
        }
        if ((i2 & 8) != 0) {
            i = reserveBean.precision;
        }
        return reserveBean.copy(z, str, str2, i);
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
    public final int component4() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReserveBean copy(boolean z, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ReserveBean(z, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveBean)) {
            return false;
        }
        ReserveBean reserveBean = (ReserveBean) obj;
        return this.isNativeToken == reserveBean.isNativeToken && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) reserveBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.reservedAmount, (Object) reserveBean.reservedAmount) && this.precision == reserveBean.precision;
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
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.isNativeToken) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.reservedAmount.hashCode()) * 31) + Integer.hashCode(this.precision);
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
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReserveBean(isNativeToken=" + this.isNativeToken + ", tokenContractAddress=" + this.tokenContractAddress + ", reservedAmount=" + this.reservedAmount + ", precision=" + this.precision + ")";
    }

    public ReserveBean(boolean z, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.isNativeToken = z;
        this.tokenContractAddress = str;
        this.reservedAmount = str2;
        this.precision = i;
    }
}
