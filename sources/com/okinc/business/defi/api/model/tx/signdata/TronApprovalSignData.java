package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TronApprovalSignData extends TronContractSignData {
    public static final int $stable = 8;
    private String approvalAddress;
    private String approveAmt;
    private String coinId;
    private Boolean isCancelApprove;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveAmt() {
        return this.approveAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCancelApprove() {
        return this.isCancelApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(String str) {
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApproveAmt(String str) {
        this.approveAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelApprove(Boolean bool) {
        this.isCancelApprove = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r13v0 com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData)
  (r14v0 java.lang.String)
  (r15v0 java.util.List)
  (r16v0 java.lang.String)
  (r17v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
 A[MD:(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:401) call: com.okinc.business.defi.api.model.tx.signdata.TronApprovalSignData.<init>(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ TronApprovalSignData(TronContractSignData.RawData rawData, String str, List list, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rawData, str, list, str2, bool, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TronApprovalSignData(TronContractSignData.RawData rawData, String str, List<String> list, String str2, Boolean bool, @NotNull String str3, String str4, String str5, Boolean bool2) {
        super(rawData, str, list, str2, bool, null, 32, null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.coinId = str3;
        this.approvalAddress = str4;
        this.approveAmt = str5;
        this.isCancelApprove = bool2;
    }
}
