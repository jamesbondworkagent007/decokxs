package o;

import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28666kfA {
    public final TokenAgeType AEQbTJ;
    public final C28717kfz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28666kfA() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28666kfA copy$default(C28666kfA c28666kfA, TokenAgeType tokenAgeType, C28717kfz c28717kfz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tokenAgeType = c28666kfA.AEQbTJ;
        }
        if ((i & 2) != 0) {
            c28717kfz = c28666kfA.copydefault;
        }
        return c28666kfA.KWHzl(tokenAgeType, c28717kfz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28666kfA KWHzl(@NotNull TokenAgeType tokenAgeType, @NotNull C28717kfz c28717kfz) {
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(c28717kfz, "");
        return new C28666kfA(tokenAgeType, c28717kfz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28717kfz KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAgeType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28666kfA)) {
            return false;
        }
        C28666kfA c28666kfA = (C28666kfA) obj;
        return this.AEQbTJ == c28666kfA.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c28666kfA.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenAgeGroupState(tokenAgeType=" + this.AEQbTJ + ", fieldGroupState=" + this.copydefault + ")";
    }

    public C28666kfA(@NotNull TokenAgeType tokenAgeType, @NotNull C28717kfz c28717kfz) {
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        Intrinsics.checkNotNullParameter(c28717kfz, "");
        this.AEQbTJ = tokenAgeType;
        this.copydefault = c28717kfz;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.filter.domain.TokenAgeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.meme.filter.domain.TokenAgeType:0x0004: SGET  A[WRAPPED] (LINE:30) com.okinc.business.market.features.meme.filter.domain.TokenAgeType.H com.okinc.business.market.features.meme.filter.domain.TokenAgeType) : (r7v0 com.okinc.business.market.features.meme.filter.domain.TokenAgeType))
  (wrap:o.kfz:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.kfz:0x0012: CONSTRUCTOR (null java.lang.String), (null java.lang.String), false, (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:31) call: o.kfz.<init>(java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 o.kfz))
 A[MD:(com.okinc.business.market.features.meme.filter.domain.TokenAgeType, o.kfz):void (m)] (LINE:29) call: o.kfA.<init>(com.okinc.business.market.features.meme.filter.domain.TokenAgeType, o.kfz):void type: THIS */
    public /* synthetic */ C28666kfA(TokenAgeType tokenAgeType, C28717kfz c28717kfz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TokenAgeType.H : tokenAgeType, (i & 2) != 0 ? new C28717kfz(null, null, false, 7, null) : c28717kfz);
    }
}
