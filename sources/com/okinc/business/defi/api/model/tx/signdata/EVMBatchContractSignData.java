package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EVMBatchContractSignData extends EVMContractSignData {
    public static final int $stable = 8;
    private final List<EVMContractSignDataInBatch> multiSignData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMContractSignDataInBatch> getMultiSignData() {
        return this.multiSignData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003b: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMContractSignDataInBatch>, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:76) call: com.okinc.business.defi.api.model.tx.signdata.EVMBatchContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EVMBatchContractSignData(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVMBatchContractSignData(String str, String str2, String str3, String str4, String str5, @NotNull List<EVMContractSignDataInBatch> list, @NotNull String str6, String str7, Integer num) {
        super(str, str2, str5, null, null, null, str6, str7, num, str3, str4, null, null, null, 14392, null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.multiSignData = list;
    }
}
