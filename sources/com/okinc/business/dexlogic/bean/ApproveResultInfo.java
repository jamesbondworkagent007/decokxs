package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ApproveResultInfo {
    public static final int $stable = 0;
    private final String saveApproveTxResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveResultInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApproveResultInfo copy$default(ApproveResultInfo approveResultInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = approveResultInfo.saveApproveTxResult;
        }
        return approveResultInfo.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.saveApproveTxResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveResultInfo copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ApproveResultInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApproveResultInfo) && Intrinsics.EZpvd((Object) this.saveApproveTxResult, (Object) ((ApproveResultInfo) obj).saveApproveTxResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSaveApproveTxResult() {
        return this.saveApproveTxResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.saveApproveTxResult.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveResultInfo(saveApproveTxResult=" + this.saveApproveTxResult + ")";
    }

    public ApproveResultInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.saveApproveTxResult = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:2350) call: com.okinc.business.dexlogic.bean.ApproveResultInfo.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ApproveResultInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
