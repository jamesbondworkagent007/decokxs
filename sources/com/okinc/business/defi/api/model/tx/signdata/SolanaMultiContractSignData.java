package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class SolanaMultiContractSignData extends ContractSignData {
    public static final int $stable = 8;
    private List<? extends SolanaContractSignData> array;
    private Boolean signOnly;
    private String signer;
    private String solanaMethod;
    private String totalDataLength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SolanaMultiContractSignData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData> */
    public final List<SolanaContractSignData> getArray() {
        return this.array;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSignOnly() {
        return this.signOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSigner() {
        return this.signer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolanaMethod() {
        return this.solanaMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDataLength() {
        return this.totalDataLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArray(@NotNull List<? extends SolanaContractSignData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.array = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignOnly(Boolean bool) {
        this.signOnly = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigner(String str) {
        this.signer = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaMethod(String str) {
        this.solanaMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalDataLength(String str) {
        this.totalDataLength = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:254)) : (r4v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Boolean:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x001b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.util.List<? extends com.okinc.business.defi.api.model.tx.signdata.SolanaContractSignData>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:253) call: com.okinc.business.defi.api.model.tx.signdata.SolanaMultiContractSignData.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SolanaMultiContractSignData(List list, String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) == 0 ? str3 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolanaMultiContractSignData(@NotNull List<? extends SolanaContractSignData> list, String str, String str2, Boolean bool, String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        this.array = list;
        this.totalDataLength = str;
        this.signer = str2;
        this.signOnly = bool;
        this.solanaMethod = str3;
    }
}
