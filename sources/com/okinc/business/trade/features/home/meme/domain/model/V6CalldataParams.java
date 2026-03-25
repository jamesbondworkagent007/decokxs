package com.okinc.business.trade.features.home.meme.domain.model;

import com.okinc.business.dex.trade.core.domain.model.CalldataPermit2;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class V6CalldataParams {
    public static final int $stable = 0;
    private final CalldataPermit2 permit2;
    private final PreSetConfig preSetConfig;
    private final String quoteId;
    private final SlippageConfig slippageConfig;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6CalldataParams copy$default(V6CalldataParams v6CalldataParams, CalldataPermit2 calldataPermit2, SlippageConfig slippageConfig, String str, PreSetConfig preSetConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            calldataPermit2 = v6CalldataParams.permit2;
        }
        if ((i & 2) != 0) {
            slippageConfig = v6CalldataParams.slippageConfig;
        }
        if ((i & 4) != 0) {
            str = v6CalldataParams.quoteId;
        }
        if ((i & 8) != 0) {
            preSetConfig = v6CalldataParams.preSetConfig;
        }
        return v6CalldataParams.copy(calldataPermit2, slippageConfig, str, preSetConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CalldataPermit2 component1() {
        return this.permit2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig component2() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig component4() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataParams copy(CalldataPermit2 calldataPermit2, @NotNull SlippageConfig slippageConfig, String str, @NotNull PreSetConfig preSetConfig) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        return new V6CalldataParams(calldataPermit2, slippageConfig, str, preSetConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6CalldataParams)) {
            return false;
        }
        V6CalldataParams v6CalldataParams = (V6CalldataParams) obj;
        return Intrinsics.EZpvd(this.permit2, v6CalldataParams.permit2) && Intrinsics.EZpvd(this.slippageConfig, v6CalldataParams.slippageConfig) && Intrinsics.EZpvd((Object) this.quoteId, (Object) v6CalldataParams.quoteId) && Intrinsics.EZpvd(this.preSetConfig, v6CalldataParams.preSetConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CalldataPermit2 getPermit2() {
        return this.permit2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreSetConfig getPreSetConfig() {
        return this.preSetConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfig getSlippageConfig() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CalldataPermit2 calldataPermit2 = this.permit2;
        int iHashCode = calldataPermit2 == null ? 0 : calldataPermit2.hashCode();
        int iHashCode2 = this.slippageConfig.hashCode();
        String str = this.quoteId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.preSetConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6CalldataParams(permit2=" + this.permit2 + ", slippageConfig=" + this.slippageConfig + ", quoteId=" + this.quoteId + ", preSetConfig=" + this.preSetConfig + ")";
    }

    public V6CalldataParams(CalldataPermit2 calldataPermit2, @NotNull SlippageConfig slippageConfig, String str, @NotNull PreSetConfig preSetConfig) {
        Intrinsics.checkNotNullParameter(slippageConfig, "");
        Intrinsics.checkNotNullParameter(preSetConfig, "");
        this.permit2 = calldataPermit2;
        this.slippageConfig = slippageConfig;
        this.quoteId = str;
        this.preSetConfig = preSetConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.core.domain.model.CalldataPermit2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.CalldataPermit2) : (r2v0 com.okinc.business.dex.trade.core.domain.model.CalldataPermit2))
  (r3v0 com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (r5v0 com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig)
 A[MD:(com.okinc.business.dex.trade.core.domain.model.CalldataPermit2, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig):void (m)] (LINE:18) call: com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams.<init>(com.okinc.business.dex.trade.core.domain.model.CalldataPermit2, com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig):void type: THIS */
    public /* synthetic */ V6CalldataParams(CalldataPermit2 calldataPermit2, SlippageConfig slippageConfig, String str, PreSetConfig preSetConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : calldataPermit2, slippageConfig, (i & 4) != 0 ? null : str, preSetConfig);
    }
}
