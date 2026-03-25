package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SolanaMessageSignData extends MessageSignData {
    public static final int $stable = 0;
    private final String raw;
    private final boolean solSignDappMessages;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSolSignDappMessages() {
        return this.solSignDappMessages;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.defi.api.model.tx.signdata.SolanaMessageSignData.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SolanaMessageSignData(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolanaMessageSignData(@NotNull String str, boolean z, String str2) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.solSignDappMessages = z;
        this.raw = str2;
    }
}
