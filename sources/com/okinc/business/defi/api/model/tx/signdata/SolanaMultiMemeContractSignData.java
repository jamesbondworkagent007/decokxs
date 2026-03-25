package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SolanaMultiMemeContractSignData extends SolanaMultiContractSignData {
    public static final int $stable = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolanaMultiMemeContractSignData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:263)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0017: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.util.List<? extends com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData>, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:262) call: com.okinc.business.defi.api.model.tx.signdata.SolanaMultiMemeContractSignData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ SolanaMultiMemeContractSignData(List list, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolanaMultiMemeContractSignData(@NotNull List<? extends SolanaContractSignData> list, String str, String str2, Boolean bool) {
        super(list, str, str2, bool, null, 16, null);
        Intrinsics.checkNotNullParameter(list, "");
    }
}
