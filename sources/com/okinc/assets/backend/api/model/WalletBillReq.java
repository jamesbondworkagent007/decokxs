package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WalletBillReq {
    public static final int $stable = 8;
    private int currencyId;
    private String end;
    private int pageIndex;
    private int pageSize;
    private String start;
    private int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletBillReq copy$default(WalletBillReq walletBillReq, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = walletBillReq.currencyId;
        }
        if ((i5 & 2) != 0) {
            i2 = walletBillReq.pageIndex;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = walletBillReq.pageSize;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = walletBillReq.type;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = walletBillReq.start;
        }
        String str3 = str;
        if ((i5 & 32) != 0) {
            str2 = walletBillReq.end;
        }
        return walletBillReq.copy(i, i6, i7, i8, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBillReq copy(int i, int i2, int i3, int i4, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletBillReq(i, i2, i3, i4, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletBillReq)) {
            return false;
        }
        WalletBillReq walletBillReq = (WalletBillReq) obj;
        return this.currencyId == walletBillReq.currencyId && this.pageIndex == walletBillReq.pageIndex && this.pageSize == walletBillReq.pageSize && this.type == walletBillReq.type && Intrinsics.EZpvd((Object) this.start, (Object) walletBillReq.start) && Intrinsics.EZpvd((Object) this.end, (Object) walletBillReq.end);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Integer.hashCode(this.currencyId) * 31) + Integer.hashCode(this.pageIndex)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.type)) * 31) + this.start.hashCode()) * 31) + this.end.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.end = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.start = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletBillReq(currencyId=" + this.currencyId + ", pageIndex=" + this.pageIndex + ", pageSize=" + this.pageSize + ", type=" + this.type + ", start=" + this.start + ", end=" + this.end + ")";
    }

    public WalletBillReq(int i, int i2, int i3, int i4, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.currencyId = i;
        this.pageIndex = i2;
        this.pageSize = i3;
        this.type = i4;
        this.start = str;
        this.end = str2;
    }
}
