package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TronMessageSignData extends MessageSignData {
    public static final int $stable = 0;
    private final boolean addPrefix;
    private final TronSignMethodVersion version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddPrefix() {
        return this.addPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignMethodVersion getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:com.okinc.business.defi.api.bean.TronSignMethodVersion:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.TronSignMethodVersion) : (r3v0 com.okinc.business.defi.api.bean.TronSignMethodVersion))
 A[MD:(java.lang.String, boolean, com.okinc.business.defi.api.bean.TronSignMethodVersion):void (m)] (LINE:64) call: com.okinc.business.defi.api.model.tx.signdata.TronMessageSignData.<init>(java.lang.String, boolean, com.okinc.business.defi.api.bean.TronSignMethodVersion):void type: THIS */
    public /* synthetic */ TronMessageSignData(String str, boolean z, TronSignMethodVersion tronSignMethodVersion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : tronSignMethodVersion);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TronMessageSignData(@NotNull String str, boolean z, TronSignMethodVersion tronSignMethodVersion) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.addPrefix = z;
        this.version = tronSignMethodVersion;
    }
}
