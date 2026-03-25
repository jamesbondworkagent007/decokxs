package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ZKSyncRegisterSignData extends ContractSignData {
    public static final int $stable = 8;
    private String coinId;
    private String from;
    private String to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZKSyncRegisterSignData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(String str) {
        this.to = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:414) call: com.okinc.business.defi.api.model.tx.signdata.ZKSyncRegisterSignData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ZKSyncRegisterSignData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZKSyncRegisterSignData(String str, String str2, @NotNull String str3) {
        super(null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.from = str;
        this.to = str2;
        this.coinId = str3;
    }
}
