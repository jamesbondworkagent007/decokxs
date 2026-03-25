package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AptosMessageSignData extends MessageSignData {
    public static final int $stable = 0;
    private final String method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.defi.api.model.tx.signdata.AptosMessageSignData.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AptosMessageSignData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AptosMessageSignData(@NotNull String str, String str2) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.method = str2;
    }
}
