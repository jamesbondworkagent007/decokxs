package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AACancelApprovalSignData extends AAContractSignData {
    public static final int $stable = 0;
    private final String approvalAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAmount() {
        return this.approvalAmount;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:121)) : (r1v0 java.util.List))
  (r2v0 java.lang.String)
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.AASubSignData>, java.lang.String):void (m)] (LINE:120) call: com.okinc.business.defi.api.model.tx.signdata.AACancelApprovalSignData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AACancelApprovalSignData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AACancelApprovalSignData(@NotNull List<AASubSignData> list, @NotNull String str) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.approvalAmount = str;
    }
}
