package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class AAContractSignData extends ContractSignData {
    public static final int $stable = 8;
    private List<AASubSignData> dataList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAContractSignData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AASubSignData> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataList(@NotNull List<AASubSignData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dataList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:116)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.AASubSignData>):void (m)] (LINE:115) call: com.okinc.business.defi.api.model.tx.signdata.AAContractSignData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ AAContractSignData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAContractSignData(@NotNull List<AASubSignData> list) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.dataList = list;
    }
}
