package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositWithdrawChainResp {
    public static final int $stable = 8;
    private String addressValidationMessage;
    private List<NetworkMethod> methods;
    private List<ChainData> networks;
    private List<SupportedEVM> supportedEvms;
    private WithdrawPromotionBanner withdrawPromotionBanner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositWithdrawChainResp() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.assets.backend.api.model.DepositWithdrawChainResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositWithdrawChainResp copy$default(DepositWithdrawChainResp depositWithdrawChainResp, List list, List list2, String str, WithdrawPromotionBanner withdrawPromotionBanner, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = depositWithdrawChainResp.methods;
        }
        if ((i & 2) != 0) {
            list2 = depositWithdrawChainResp.networks;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            str = depositWithdrawChainResp.addressValidationMessage;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            withdrawPromotionBanner = depositWithdrawChainResp.withdrawPromotionBanner;
        }
        WithdrawPromotionBanner withdrawPromotionBanner2 = withdrawPromotionBanner;
        if ((i & 16) != 0) {
            list3 = depositWithdrawChainResp.supportedEvms;
        }
        return depositWithdrawChainResp.copy(list, list4, str2, withdrawPromotionBanner2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkMethod> component1() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> component2() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.addressValidationMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawPromotionBanner component4() {
        return this.withdrawPromotionBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> component5() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositWithdrawChainResp copy(List<NetworkMethod> list, List<ChainData> list2, String str, WithdrawPromotionBanner withdrawPromotionBanner, List<SupportedEVM> list3) {
        return new DepositWithdrawChainResp(list, list2, str, withdrawPromotionBanner, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositWithdrawChainResp)) {
            return false;
        }
        DepositWithdrawChainResp depositWithdrawChainResp = (DepositWithdrawChainResp) obj;
        return Intrinsics.EZpvd(this.methods, depositWithdrawChainResp.methods) && Intrinsics.EZpvd(this.networks, depositWithdrawChainResp.networks) && Intrinsics.EZpvd((Object) this.addressValidationMessage, (Object) depositWithdrawChainResp.addressValidationMessage) && Intrinsics.EZpvd(this.withdrawPromotionBanner, depositWithdrawChainResp.withdrawPromotionBanner) && Intrinsics.EZpvd(this.supportedEvms, depositWithdrawChainResp.supportedEvms);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressValidationMessage() {
        return this.addressValidationMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkMethod> getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> getNetworks() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedEVM> getSupportedEvms() {
        return this.supportedEvms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawPromotionBanner getWithdrawPromotionBanner() {
        return this.withdrawPromotionBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<NetworkMethod> list = this.methods;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<ChainData> list2 = this.networks;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.addressValidationMessage;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        WithdrawPromotionBanner withdrawPromotionBanner = this.withdrawPromotionBanner;
        int iHashCode4 = withdrawPromotionBanner == null ? 0 : withdrawPromotionBanner.hashCode();
        List<SupportedEVM> list3 = this.supportedEvms;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressValidationMessage(String str) {
        this.addressValidationMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethods(List<NetworkMethod> list) {
        this.methods = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworks(List<ChainData> list) {
        this.networks = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedEvms(List<SupportedEVM> list) {
        this.supportedEvms = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawPromotionBanner(WithdrawPromotionBanner withdrawPromotionBanner) {
        this.withdrawPromotionBanner = withdrawPromotionBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositWithdrawChainResp(methods=" + this.methods + ", networks=" + this.networks + ", addressValidationMessage=" + this.addressValidationMessage + ", withdrawPromotionBanner=" + this.withdrawPromotionBanner + ", supportedEvms=" + this.supportedEvms + ")";
    }

    public DepositWithdrawChainResp(List<NetworkMethod> list, List<ChainData> list2, String str, WithdrawPromotionBanner withdrawPromotionBanner, List<SupportedEVM> list3) {
        this.methods = list;
        this.networks = list2;
        this.addressValidationMessage = str;
        this.withdrawPromotionBanner = withdrawPromotionBanner;
        this.supportedEvms = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.assets.backend.api.model.WithdrawPromotionBanner:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.WithdrawPromotionBanner) : (r8v0 com.okinc.assets.backend.api.model.WithdrawPromotionBanner))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.NetworkMethod>, java.util.List<com.okinc.assets.backend.api.model.ChainData>, java.lang.String, com.okinc.assets.backend.api.model.WithdrawPromotionBanner, java.util.List<com.okinc.assets.backend.api.model.SupportedEVM>):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.DepositWithdrawChainResp.<init>(java.util.List, java.util.List, java.lang.String, com.okinc.assets.backend.api.model.WithdrawPromotionBanner, java.util.List):void type: THIS */
    public /* synthetic */ DepositWithdrawChainResp(List list, List list2, String str, WithdrawPromotionBanner withdrawPromotionBanner, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : withdrawPromotionBanner, (i & 16) != 0 ? null : list3);
    }
}
