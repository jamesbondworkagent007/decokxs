package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TransferHistory {
    public static final int $stable = 0;
    private final String amount;
    private final long createDate;
    private final String currency;
    private final int currencyId;
    private final Integer customizedBillType;
    private final String statusStr;
    private final String targetFrom;
    private final String targetTo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.targetFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.targetTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.customizedBillType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferHistory copy(String str, long j, String str2, int i, String str3, String str4, String str5, Integer num) {
        return new TransferHistory(str, j, str2, i, str3, str4, str5, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferHistory)) {
            return false;
        }
        TransferHistory transferHistory = (TransferHistory) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) transferHistory.amount) && this.createDate == transferHistory.createDate && Intrinsics.EZpvd((Object) this.currency, (Object) transferHistory.currency) && this.currencyId == transferHistory.currencyId && Intrinsics.EZpvd((Object) this.statusStr, (Object) transferHistory.statusStr) && Intrinsics.EZpvd((Object) this.targetFrom, (Object) transferHistory.targetFrom) && Intrinsics.EZpvd((Object) this.targetTo, (Object) transferHistory.targetTo) && Intrinsics.EZpvd(this.customizedBillType, transferHistory.customizedBillType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCustomizedBillType() {
        return this.customizedBillType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatusStr() {
        return this.statusStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetFrom() {
        return this.targetFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTo() {
        return this.targetTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.createDate);
        String str2 = this.currency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Integer.hashCode(this.currencyId);
        String str3 = this.statusStr;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.targetFrom;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.targetTo;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.customizedBillType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferHistory(amount=" + this.amount + ", createDate=" + this.createDate + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", statusStr=" + this.statusStr + ", targetFrom=" + this.targetFrom + ", targetTo=" + this.targetTo + ", customizedBillType=" + this.customizedBillType + ")";
    }

    public TransferHistory(String str, long j, String str2, int i, String str3, String str4, String str5, Integer num) {
        this.amount = str;
        this.createDate = j;
        this.currency = str2;
        this.currencyId = i;
        this.statusStr = str3;
        this.targetFrom = str4;
        this.targetTo = str5;
        this.customizedBillType = num;
    }
}
