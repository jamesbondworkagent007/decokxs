package o;

import com.okinc.planet.biz_content.publisher.ToolFragmentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47754twA {
    public final ToolFragmentType AEQbTJ;
    public final boolean EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47754twA() {
        this(null, false, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47754twA copy$default(C47754twA c47754twA, ToolFragmentType toolFragmentType, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            toolFragmentType = c47754twA.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c47754twA.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = c47754twA.OLrzqt;
        }
        return c47754twA.OLrzqt(toolFragmentType, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToolFragmentType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47754twA OLrzqt(@NotNull ToolFragmentType toolFragmentType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(toolFragmentType, "");
        return new C47754twA(toolFragmentType, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47754twA)) {
            return false;
        }
        C47754twA c47754twA = (C47754twA) obj;
        return this.AEQbTJ == c47754twA.AEQbTJ && this.EZpvd == c47754twA.EZpvd && this.OLrzqt == c47754twA.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToolFragmentState(type=" + this.AEQbTJ + ", hideToolbar=" + this.EZpvd + ", clearInputFocus=" + this.OLrzqt + ")";
    }

    public C47754twA(@NotNull ToolFragmentType toolFragmentType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(toolFragmentType, "");
        this.AEQbTJ = toolFragmentType;
        this.EZpvd = z;
        this.OLrzqt = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.planet.biz_content.publisher.ToolFragmentType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.planet.biz_content.publisher.ToolFragmentType:0x0004: SGET  A[WRAPPED] (LINE:19) com.okinc.planet.biz_content.publisher.ToolFragmentType.NONE com.okinc.planet.biz_content.publisher.ToolFragmentType) : (r2v0 com.okinc.planet.biz_content.publisher.ToolFragmentType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.planet.biz_content.publisher.ToolFragmentType, boolean, boolean):void (m)] (LINE:18) call: o.twA.<init>(com.okinc.planet.biz_content.publisher.ToolFragmentType, boolean, boolean):void type: THIS */
    public /* synthetic */ C47754twA(ToolFragmentType toolFragmentType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ToolFragmentType.NONE : toolFragmentType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
