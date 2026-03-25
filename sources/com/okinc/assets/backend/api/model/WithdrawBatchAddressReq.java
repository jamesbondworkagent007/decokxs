package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawBatchAddressReq {
    public static final int $stable = 8;
    private List<WithdrawBatchSubReq> addressInfoList;
    private int authFlag;
    private int currencyId;
    private String emailCode;
    private int generalType;
    private boolean includeAuth;
    private String phoneCode;
    private String sessionId;
    private boolean setExpireIfInactive;
    private int subCurrencyId;
    private int targetType;
    private String totpCode;
    private String tradePwd;
    private boolean validateOnly;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawBatchSubReq> component1() {
        return this.addressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.includeAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.validateOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.setExpireIfInactive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.authFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawBatchAddressReq copy(List<WithdrawBatchSubReq> list, int i, int i2, String str, String str2, String str3, int i3, int i4, String str4, boolean z, int i5, boolean z2, boolean z3, String str5) {
        return new WithdrawBatchAddressReq(list, i, i2, str, str2, str3, i3, i4, str4, z, i5, z2, z3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawBatchAddressReq)) {
            return false;
        }
        WithdrawBatchAddressReq withdrawBatchAddressReq = (WithdrawBatchAddressReq) obj;
        return Intrinsics.EZpvd(this.addressInfoList, withdrawBatchAddressReq.addressInfoList) && this.authFlag == withdrawBatchAddressReq.authFlag && this.currencyId == withdrawBatchAddressReq.currencyId && Intrinsics.EZpvd((Object) this.emailCode, (Object) withdrawBatchAddressReq.emailCode) && Intrinsics.EZpvd((Object) this.phoneCode, (Object) withdrawBatchAddressReq.phoneCode) && Intrinsics.EZpvd((Object) this.totpCode, (Object) withdrawBatchAddressReq.totpCode) && this.subCurrencyId == withdrawBatchAddressReq.subCurrencyId && this.targetType == withdrawBatchAddressReq.targetType && Intrinsics.EZpvd((Object) this.tradePwd, (Object) withdrawBatchAddressReq.tradePwd) && this.includeAuth == withdrawBatchAddressReq.includeAuth && this.generalType == withdrawBatchAddressReq.generalType && this.validateOnly == withdrawBatchAddressReq.validateOnly && this.setExpireIfInactive == withdrawBatchAddressReq.setExpireIfInactive && Intrinsics.EZpvd((Object) this.sessionId, (Object) withdrawBatchAddressReq.sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawBatchSubReq> getAddressInfoList() {
        return this.addressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAuthFlag() {
        return this.authFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmailCode() {
        return this.emailCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGeneralType() {
        return this.generalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIncludeAuth() {
        return this.includeAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneCode() {
        return this.phoneCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSetExpireIfInactive() {
        return this.setExpireIfInactive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTargetType() {
        return this.targetType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotpCode() {
        return this.totpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradePwd() {
        return this.tradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getValidateOnly() {
        return this.validateOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<WithdrawBatchSubReq> list = this.addressInfoList;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = Integer.hashCode(this.authFlag);
        int iHashCode3 = Integer.hashCode(this.currencyId);
        String str = this.emailCode;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.phoneCode;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totpCode;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = Integer.hashCode(this.subCurrencyId);
        int iHashCode8 = Integer.hashCode(this.targetType);
        String str4 = this.tradePwd;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        int iHashCode10 = Boolean.hashCode(this.includeAuth);
        int iHashCode11 = Integer.hashCode(this.generalType);
        int iHashCode12 = Boolean.hashCode(this.validateOnly);
        int iHashCode13 = Boolean.hashCode(this.setExpireIfInactive);
        String str5 = this.sessionId;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressInfoList(List<WithdrawBatchSubReq> list) {
        this.addressInfoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthFlag(int i) {
        this.authFlag = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmailCode(String str) {
        this.emailCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGeneralType(int i) {
        this.generalType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncludeAuth(boolean z) {
        this.includeAuth = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhoneCode(String str) {
        this.phoneCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSetExpireIfInactive(boolean z) {
        this.setExpireIfInactive = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetType(int i) {
        this.targetType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotpCode(String str) {
        this.totpCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradePwd(String str) {
        this.tradePwd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidateOnly(boolean z) {
        this.validateOnly = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawBatchAddressReq(addressInfoList=" + this.addressInfoList + ", authFlag=" + this.authFlag + ", currencyId=" + this.currencyId + ", emailCode=" + this.emailCode + ", phoneCode=" + this.phoneCode + ", totpCode=" + this.totpCode + ", subCurrencyId=" + this.subCurrencyId + ", targetType=" + this.targetType + ", tradePwd=" + this.tradePwd + ", includeAuth=" + this.includeAuth + ", generalType=" + this.generalType + ", validateOnly=" + this.validateOnly + ", setExpireIfInactive=" + this.setExpireIfInactive + ", sessionId=" + this.sessionId + ")";
    }

    public WithdrawBatchAddressReq(List<WithdrawBatchSubReq> list, int i, int i2, String str, String str2, String str3, int i3, int i4, String str4, boolean z, int i5, boolean z2, boolean z3, String str5) {
        this.addressInfoList = list;
        this.authFlag = i;
        this.currencyId = i2;
        this.emailCode = str;
        this.phoneCode = str2;
        this.totpCode = str3;
        this.subCurrencyId = i3;
        this.targetType = i4;
        this.tradePwd = str4;
        this.includeAuth = z;
        this.generalType = i5;
        this.validateOnly = z2;
        this.setExpireIfInactive = z3;
        this.sessionId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r18v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0038: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0040: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (r30v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0068: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.WithdrawBatchSubReq>, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean, int, boolean, boolean, java.lang.String):void (m)] (LINE:24) call: com.okinc.assets.backend.api.model.WithdrawBatchAddressReq.<init>(java.util.List, int, int, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean, int, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ WithdrawBatchAddressReq(List list, int i, int i2, String str, String str2, String str3, int i3, int i4, String str4, boolean z, int i5, boolean z2, boolean z3, String str5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? yDY.AhwBna() : list, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? null : str, (i6 & 16) != 0 ? null : str2, (i6 & 32) != 0 ? null : str3, (i6 & 64) != 0 ? -1 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? null : str4, (i6 & 512) != 0 ? false : z, (i6 & 1024) != 0 ? 0 : i5, (i6 & 2048) != 0 ? false : z2, z3, (i6 & 8192) != 0 ? null : str5);
    }
}
