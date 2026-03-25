package com.okinc.unify_trade.universal.data;

import com.okinc.trade.manager.common.position.TradePositionManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PositionLiveDataResp {
    public static final int $stable = 8;
    private final String errorMsg;
    private final boolean isNotError;
    private final List<TradePositionManager.PositionItem> positions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.universal.data.PositionLiveDataResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositionLiveDataResp copy$default(PositionLiveDataResp positionLiveDataResp, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = positionLiveDataResp.isNotError;
        }
        if ((i & 2) != 0) {
            list = positionLiveDataResp.positions;
        }
        if ((i & 4) != 0) {
            str = positionLiveDataResp.errorMsg;
        }
        return positionLiveDataResp.copy(z, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isNotError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradePositionManager.PositionItem> component2() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionLiveDataResp copy(boolean z, List<? extends TradePositionManager.PositionItem> list, String str) {
        return new PositionLiveDataResp(z, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionLiveDataResp)) {
            return false;
        }
        PositionLiveDataResp positionLiveDataResp = (PositionLiveDataResp) obj;
        return this.isNotError == positionLiveDataResp.isNotError && Intrinsics.EZpvd(this.positions, positionLiveDataResp.positions) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) positionLiveDataResp.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradePositionManager.PositionItem> getPositions() {
        return this.positions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNotError);
        List<TradePositionManager.PositionItem> list = this.positions;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.errorMsg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNotError() {
        return this.isNotError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionLiveDataResp(isNotError=" + this.isNotError + ", positions=" + this.positions + ", errorMsg=" + this.errorMsg + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.trade.manager.common.position.TradePositionManager$PositionItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public PositionLiveDataResp(boolean z, List<? extends TradePositionManager.PositionItem> list, String str) {
        this.isNotError = z;
        this.positions = list;
        this.errorMsg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(boolean, java.util.List<? extends com.okinc.trade.manager.common.position.TradePositionManager$PositionItem>, java.lang.String):void (m)] (LINE:17) call: com.okinc.unify_trade.universal.data.PositionLiveDataResp.<init>(boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ PositionLiveDataResp(boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, (i & 4) != 0 ? "" : str);
    }
}
