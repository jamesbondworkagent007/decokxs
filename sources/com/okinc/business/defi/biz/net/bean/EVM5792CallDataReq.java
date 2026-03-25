package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EVM5792CallDataReq {
    public static final int $stable = 8;
    private final List<EVM5792Call> calls;
    private final long chainIndex;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.EVM5792CallDataReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EVM5792CallDataReq copy$default(EVM5792CallDataReq eVM5792CallDataReq, List list, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = eVM5792CallDataReq.calls;
        }
        if ((i2 & 2) != 0) {
            j = eVM5792CallDataReq.chainIndex;
        }
        if ((i2 & 4) != 0) {
            i = eVM5792CallDataReq.type;
        }
        return eVM5792CallDataReq.copy(list, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVM5792Call> component1() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792CallDataReq copy(@NotNull List<EVM5792Call> list, long j, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EVM5792CallDataReq(list, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EVM5792CallDataReq)) {
            return false;
        }
        EVM5792CallDataReq eVM5792CallDataReq = (EVM5792CallDataReq) obj;
        return Intrinsics.EZpvd(this.calls, eVM5792CallDataReq.calls) && this.chainIndex == eVM5792CallDataReq.chainIndex && this.type == eVM5792CallDataReq.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVM5792Call> getCalls() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.calls.hashCode() * 31) + Long.hashCode(this.chainIndex)) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVM5792CallDataReq(calls=" + this.calls + ", chainIndex=" + this.chainIndex + ", type=" + this.type + ")";
    }

    public EVM5792CallDataReq(@NotNull List<EVM5792Call> list, long j, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.calls = list;
        this.chainIndex = j;
        this.type = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r4v0 int))
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVM5792Call>, long, int):void (m)] (LINE:1972) call: com.okinc.business.defi.biz.net.bean.EVM5792CallDataReq.<init>(java.util.List, long, int):void type: THIS */
    public /* synthetic */ EVM5792CallDataReq(List list, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j, (i2 & 4) != 0 ? 1 : i);
    }
}
