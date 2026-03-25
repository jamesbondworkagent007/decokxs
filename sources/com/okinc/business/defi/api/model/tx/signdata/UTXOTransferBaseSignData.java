package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class UTXOTransferBaseSignData extends TransferSignData {
    public static final int $stable = 8;
    private String feeRate;
    private boolean isNeedUTXOManagement;
    private boolean isSupportAnotherAddressPayFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedUTXOManagement() {
        return this.isNeedUTXOManagement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportAnotherAddressPayFee() {
        return this.isSupportAnotherAddressPayFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedUTXOManagement(boolean z) {
        this.isNeedUTXOManagement = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAnotherAddressPayFee(boolean z) {
        this.isSupportAnotherAddressPayFee = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r11v0 long)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 boolean)
  (r17v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.api.model.tx.signdata.UTXOTransferBaseSignData.<init>(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ UTXOTransferBaseSignData(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, z, z2, (i & 64) != 0 ? null : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTXOTransferBaseSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4) {
        super(j, str, str2, str3, null, null, 48, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.isSupportAnotherAddressPayFee = z;
        this.isNeedUTXOManagement = z2;
        this.feeRate = str4;
    }
}
