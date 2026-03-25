package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.bean.NostrSignType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NostrMessageSignData extends MessageSignData {
    public static final int $stable = 0;
    private final NostrSignType nostrSignType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NostrSignType getNostrSignType() {
        return this.nostrSignType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.business.defi.api.bean.NostrSignType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.api.bean.NostrSignType:0x0004: SGET  A[WRAPPED] (LINE:54) com.okinc.business.defi.api.bean.NostrSignType.MESSAGE com.okinc.business.defi.api.bean.NostrSignType) : (r2v0 com.okinc.business.defi.api.bean.NostrSignType))
 A[MD:(java.lang.String, com.okinc.business.defi.api.bean.NostrSignType):void (m)] (LINE:52) call: com.okinc.business.defi.api.model.tx.signdata.NostrMessageSignData.<init>(java.lang.String, com.okinc.business.defi.api.bean.NostrSignType):void type: THIS */
    public /* synthetic */ NostrMessageSignData(String str, NostrSignType nostrSignType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? NostrSignType.MESSAGE : nostrSignType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NostrMessageSignData(@NotNull String str, @NotNull NostrSignType nostrSignType) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nostrSignType, "");
        this.nostrSignType = nostrSignType;
    }
}
