package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21999hUd {
    public final boolean AEQbTJ;
    public final DefiChainInfo EZpvd;
    public final java.lang.String KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C21999hUd() {
        this(null, false, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    public C21999hUd(DefiChainInfo defiChainInfo, boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = defiChainInfo;
        this.copydefault = z;
        this.KWHzl = str;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.DefiChainInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DefiChainInfo) : (r2v0 com.okinc.business.dexlogic.bean.DefiChainInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(com.okinc.business.dexlogic.bean.DefiChainInfo, boolean, java.lang.String, boolean):void (m)] (LINE:12) call: o.hUd.<init>(com.okinc.business.dexlogic.bean.DefiChainInfo, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C21999hUd(DefiChainInfo defiChainInfo, boolean z, java.lang.String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : defiChainInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z2);
    }
}
