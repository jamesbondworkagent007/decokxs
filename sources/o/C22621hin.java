package o;

import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22621hin implements InterfaceC22618hik {
    public final java.util.List<TagWrapper> AEQbTJ;
    public final java.lang.String AhwBna;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;
    public final int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.hin */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22621hin copy$default(C22621hin c22621hin, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c22621hin.EZpvd;
        }
        if ((i4 & 2) != 0) {
            i2 = c22621hin.djBIcL;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = c22621hin.KWHzl;
        }
        java.lang.String str4 = str;
        if ((i4 & 8) != 0) {
            str2 = c22621hin.AhwBna;
        }
        java.lang.String str5 = str2;
        if ((i4 & 16) != 0) {
            str3 = c22621hin.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i4 & 32) != 0) {
            i3 = c22621hin.copydefault;
        }
        int i6 = i3;
        if ((i4 & 64) != 0) {
            list = c22621hin.AEQbTJ;
        }
        return c22621hin.OLrzqt(i, i5, str4, str5, str6, i6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22621hin OLrzqt(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i3, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C22621hin(i, i2, str, str2, str3, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TagWrapper> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22621hin)) {
            return false;
        }
        C22621hin c22621hin = (C22621hin) obj;
        return this.EZpvd == c22621hin.EZpvd && this.djBIcL == c22621hin.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c22621hin.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c22621hin.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c22621hin.OLrzqt) && this.copydefault == c22621hin.copydefault && Intrinsics.EZpvd(this.AEQbTJ, c22621hin.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavigateEventHolderDetail(primaryTab=" + this.EZpvd + ", secondaryTab=" + this.djBIcL + ", holderWalletAddress=" + this.KWHzl + ", tokenContractAddress=" + this.AhwBna + ", chainId=" + this.OLrzqt + ", ranking=" + this.copydefault + ", newTagList=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.copydefault;
    }

    public C22621hin(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i3, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = i;
        this.djBIcL = i2;
        this.KWHzl = str;
        this.AhwBna = str2;
        this.OLrzqt = str3;
        this.copydefault = i3;
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r16v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:112)) : (r17v0 java.util.List))
 A[MD:(int, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List<com.okinc.business.market.features.tag.domain.TagWrapper>):void (m)] (LINE:105) call: o.hin.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ C22621hin(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, java.util.List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? 1 : i3, (i4 & 64) != 0 ? yDY.AhwBna() : list);
    }
}
