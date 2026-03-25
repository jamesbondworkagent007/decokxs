package com.okinc.business.defi.wallet.transaction.ui.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferConfig {
    public static final int $stable = 0;
    private final Boolean shouldShowTransferEditableData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferConfig copy$default(TransferConfig transferConfig, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = transferConfig.shouldShowTransferEditableData;
        }
        return transferConfig.copy(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.shouldShowTransferEditableData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferConfig copy(Boolean bool) {
        return new TransferConfig(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransferConfig) && Intrinsics.EZpvd(this.shouldShowTransferEditableData, ((TransferConfig) obj).shouldShowTransferEditableData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldShowTransferEditableData() {
        return this.shouldShowTransferEditableData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.shouldShowTransferEditableData;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferConfig(shouldShowTransferEditableData=" + this.shouldShowTransferEditableData + ")";
    }

    public TransferConfig(Boolean bool) {
        this.shouldShowTransferEditableData = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r1v0 java.lang.Boolean))
 A[MD:(java.lang.Boolean):void (m)] (LINE:1197) call: com.okinc.business.defi.wallet.transaction.ui.transfer.TransferConfig.<init>(java.lang.Boolean):void type: THIS */
    public /* synthetic */ TransferConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
