package com.okinc.okimcore.model.im;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class RequireAdminApprovalToJoin extends GroupSystemMessage {
    public static final int $stable = 0;
    private final boolean isEnabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RequireAdminApprovalToJoin() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public RequireAdminApprovalToJoin(boolean z) {
        this.isEnabled = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:93) call: com.okinc.okimcore.model.im.RequireAdminApprovalToJoin.<init>(boolean):void type: THIS */
    public /* synthetic */ RequireAdminApprovalToJoin(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
