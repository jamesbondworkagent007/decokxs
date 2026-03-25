package com.okinc.business.dexlogic.main.swap.trade.bean;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CurrentChain {
    public static final int $stable = 8;
    private final DefiChainInfo data;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrentChain copy$default(CurrentChain currentChain, String str, DefiChainInfo defiChainInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentChain.title;
        }
        if ((i & 2) != 0) {
            defiChainInfo = currentChain.data;
        }
        return currentChain.copy(str, defiChainInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrentChain copy(@NotNull String str, @NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        return new CurrentChain(str, defiChainInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentChain)) {
            return false;
        }
        CurrentChain currentChain = (CurrentChain) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) currentChain.title) && Intrinsics.EZpvd(this.data, currentChain.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.title.hashCode() * 31) + this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrentChain(title=" + this.title + ", data=" + this.data + ")";
    }

    public CurrentChain(@NotNull String str, @NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        this.title = str;
        this.data = defiChainInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.dexlogic.bean.DefiChainInfo)
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DefiChainInfo):void (m)] (LINE:38) call: com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DefiChainInfo):void type: THIS */
    public /* synthetic */ CurrentChain(String str, DefiChainInfo defiChainInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, defiChainInfo);
    }
}
