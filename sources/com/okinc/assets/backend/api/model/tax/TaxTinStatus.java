package com.okinc.assets.backend.api.model.tax;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxTinStatus {
    public static final int $stable = 0;
    private final String displayStatus;
    private final String msg;
    private final Integer statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TaxTinStatus copy$default(TaxTinStatus taxTinStatus, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = taxTinStatus.statusCode;
        }
        if ((i & 2) != 0) {
            str = taxTinStatus.displayStatus;
        }
        if ((i & 4) != 0) {
            str2 = taxTinStatus.msg;
        }
        return taxTinStatus.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxTinStatus copy(Integer num, String str, String str2) {
        return new TaxTinStatus(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTinStatus)) {
            return false;
        }
        TaxTinStatus taxTinStatus = (TaxTinStatus) obj;
        return Intrinsics.EZpvd(this.statusCode, taxTinStatus.statusCode) && Intrinsics.EZpvd((Object) this.displayStatus, (Object) taxTinStatus.displayStatus) && Intrinsics.EZpvd((Object) this.msg, (Object) taxTinStatus.msg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.displayStatus;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.msg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxTinStatus(statusCode=" + this.statusCode + ", displayStatus=" + this.displayStatus + ", msg=" + this.msg + ")";
    }

    public TaxTinStatus(Integer num, String str, String str2) {
        this.statusCode = num;
        this.displayStatus = str;
        this.msg = str2;
    }
}
