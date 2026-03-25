package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SendMsg4WithdrawReq {
    public static final int $stable = 8;
    private String address;
    private String amount;
    private Integer currencyId;
    private Boolean enablePasskey;
    private Integer internalAddressType;
    private Boolean invalidAsset;
    private String invoice;
    public Integer isWithdrawal;
    private Integer subCurrencyId;
    private String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.invoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.isWithdrawal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.enablePasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendMsg4WithdrawReq copy(Integer num, Integer num2, String str, String str2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, String str4) {
        return new SendMsg4WithdrawReq(num, num2, str, str2, str3, bool, num3, num4, bool2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMsg4WithdrawReq)) {
            return false;
        }
        SendMsg4WithdrawReq sendMsg4WithdrawReq = (SendMsg4WithdrawReq) obj;
        return Intrinsics.EZpvd(this.currencyId, sendMsg4WithdrawReq.currencyId) && Intrinsics.EZpvd(this.isWithdrawal, sendMsg4WithdrawReq.isWithdrawal) && Intrinsics.EZpvd((Object) this.amount, (Object) sendMsg4WithdrawReq.amount) && Intrinsics.EZpvd((Object) this.address, (Object) sendMsg4WithdrawReq.address) && Intrinsics.EZpvd((Object) this.tag, (Object) sendMsg4WithdrawReq.tag) && Intrinsics.EZpvd(this.invalidAsset, sendMsg4WithdrawReq.invalidAsset) && Intrinsics.EZpvd(this.subCurrencyId, sendMsg4WithdrawReq.subCurrencyId) && Intrinsics.EZpvd(this.internalAddressType, sendMsg4WithdrawReq.internalAddressType) && Intrinsics.EZpvd(this.enablePasskey, sendMsg4WithdrawReq.enablePasskey) && Intrinsics.EZpvd((Object) this.invoice, (Object) sendMsg4WithdrawReq.invoice);
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
    public final Boolean getEnablePasskey() {
        return this.enablePasskey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInternalAddressType() {
        return this.internalAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getInvalidAsset() {
        return this.invalidAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvoice() {
        return this.invoice;
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
        String str = this.amount;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.invalidAsset;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.subCurrencyId;
        int iHashCode7 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.internalAddressType;
        int iHashCode8 = num4 == null ? 0 : num4.hashCode();
        Boolean bool2 = this.enablePasskey;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.invoice;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
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
    public final void setEnablePasskey(Boolean bool) {
        this.enablePasskey = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInternalAddressType(Integer num) {
        this.internalAddressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidAsset(Boolean bool) {
        this.invalidAsset = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvoice(String str) {
        this.invoice = str;
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
        return "SendMsg4WithdrawReq(currencyId=" + this.currencyId + ", isWithdrawal=" + this.isWithdrawal + ", amount=" + this.amount + ", address=" + this.address + ", tag=" + this.tag + ", invalidAsset=" + this.invalidAsset + ", subCurrencyId=" + this.subCurrencyId + ", internalAddressType=" + this.internalAddressType + ", enablePasskey=" + this.enablePasskey + ", invoice=" + this.invoice + ")";
    }

    public SendMsg4WithdrawReq(Integer num, Integer num2, String str, String str2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, String str4) {
        this.currencyId = num;
        this.isWithdrawal = num2;
        this.amount = str;
        this.address = str2;
        this.tag = str3;
        this.invalidAsset = bool;
        this.subCurrencyId = num3;
        this.internalAddressType = num4;
        this.enablePasskey = bool2;
        this.invoice = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r15v0 java.lang.Integer)
  (r16v0 java.lang.Integer)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.Boolean)
  (r21v0 java.lang.Integer)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String):void (m)] (LINE:139) call: com.okinc.assets.backend.api.model.SendMsg4WithdrawReq.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SendMsg4WithdrawReq(Integer num, Integer num2, String str, String str2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, str, str2, str3, bool, num3, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? Boolean.FALSE : bool2, (i & 512) != 0 ? null : str4);
    }
}
