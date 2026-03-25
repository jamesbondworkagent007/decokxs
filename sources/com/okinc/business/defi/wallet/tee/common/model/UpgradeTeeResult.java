package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class UpgradeTeeResult {
    public static final int $stable = 8;
    private final List<UpgradeTeeResultItem> teeResultList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpgradeTeeResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpgradeTeeResult copy$default(UpgradeTeeResult upgradeTeeResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = upgradeTeeResult.teeResultList;
        }
        return upgradeTeeResult.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UpgradeTeeResultItem> component1() {
        return this.teeResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpgradeTeeResult copy(List<UpgradeTeeResultItem> list) {
        return new UpgradeTeeResult(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpgradeTeeResult) && Intrinsics.EZpvd(this.teeResultList, ((UpgradeTeeResult) obj).teeResultList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UpgradeTeeResultItem> getTeeResultList() {
        return this.teeResultList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<UpgradeTeeResultItem> list = this.teeResultList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpgradeTeeResult(teeResultList=" + this.teeResultList + ")";
    }

    public UpgradeTeeResult(List<UpgradeTeeResultItem> list) {
        this.teeResultList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResultItem>):void (m)] (LINE:107) call: com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResult.<init>(java.util.List):void type: THIS */
    public /* synthetic */ UpgradeTeeResult(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
