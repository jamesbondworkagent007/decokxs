package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ExtendTeeResult {
    public static final int $stable = 8;
    private final List<TeeExtendResultItemData> teeResultList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExtendTeeResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.tee.common.model.ExtendTeeResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendTeeResult copy$default(ExtendTeeResult extendTeeResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = extendTeeResult.teeResultList;
        }
        return extendTeeResult.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeExtendResultItemData> component1() {
        return this.teeResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendTeeResult copy(List<TeeExtendResultItemData> list) {
        return new ExtendTeeResult(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtendTeeResult) && Intrinsics.EZpvd(this.teeResultList, ((ExtendTeeResult) obj).teeResultList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TeeExtendResultItemData> getTeeResultList() {
        return this.teeResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TeeExtendResultItemData> list = this.teeResultList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtendTeeResult(teeResultList=" + this.teeResultList + ")";
    }

    public ExtendTeeResult(List<TeeExtendResultItemData> list) {
        this.teeResultList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.wallet.tee.common.model.TeeExtendResultItemData>):void (m)] (LINE:135) call: com.okinc.business.defi.wallet.tee.common.model.ExtendTeeResult.<init>(java.util.List):void type: THIS */
    public /* synthetic */ ExtendTeeResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
