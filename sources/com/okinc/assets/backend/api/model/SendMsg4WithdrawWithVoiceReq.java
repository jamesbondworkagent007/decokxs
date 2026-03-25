package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SendMsg4WithdrawWithVoiceReq {
    public static final int $stable = 8;
    private String address;
    private String amount;
    private Integer currencyId;
    private Boolean invalidAsset;
    public int isVoice;
    public Integer isWithdrawal;
    private Integer subCurrencyId;
    private String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.isWithdrawal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.isVoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendMsg4WithdrawWithVoiceReq copy(Integer num, Integer num2, int i, String str, String str2, String str3, Boolean bool, Integer num3) {
        return new SendMsg4WithdrawWithVoiceReq(num, num2, i, str, str2, str3, bool, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMsg4WithdrawWithVoiceReq)) {
            return false;
        }
        SendMsg4WithdrawWithVoiceReq sendMsg4WithdrawWithVoiceReq = (SendMsg4WithdrawWithVoiceReq) obj;
        return Intrinsics.EZpvd(this.currencyId, sendMsg4WithdrawWithVoiceReq.currencyId) && Intrinsics.EZpvd(this.isWithdrawal, sendMsg4WithdrawWithVoiceReq.isWithdrawal) && this.isVoice == sendMsg4WithdrawWithVoiceReq.isVoice && Intrinsics.EZpvd((Object) this.amount, (Object) sendMsg4WithdrawWithVoiceReq.amount) && Intrinsics.EZpvd((Object) this.address, (Object) sendMsg4WithdrawWithVoiceReq.address) && Intrinsics.EZpvd((Object) this.tag, (Object) sendMsg4WithdrawWithVoiceReq.tag) && Intrinsics.EZpvd(this.invalidAsset, sendMsg4WithdrawWithVoiceReq.invalidAsset) && Intrinsics.EZpvd(this.subCurrencyId, sendMsg4WithdrawWithVoiceReq.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.isWithdrawal;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int iHashCode3 = Integer.hashCode(this.isVoice);
        String str = this.amount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.invalidAsset;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.subCurrencyId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(Boolean bool) {
        this.invalidAsset = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(Integer num) {
        this.subCurrencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendMsg4WithdrawWithVoiceReq(currencyId=" + this.currencyId + ", isWithdrawal=" + this.isWithdrawal + ", isVoice=" + this.isVoice + ", amount=" + this.amount + ", address=" + this.address + ", tag=" + this.tag + ", invalidAsset=" + this.invalidAsset + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    public SendMsg4WithdrawWithVoiceReq(Integer num, Integer num2, int i, String str, String str2, String str3, Boolean bool, Integer num3) {
        this.currencyId = num;
        this.isWithdrawal = num2;
        this.isVoice = i;
        this.amount = str;
        this.address = str2;
        this.tag = str3;
        this.invalidAsset = bool;
        this.subCurrencyId = num3;
    }
}
