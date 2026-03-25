package o;

import com.okinc.kline.data.KlineCoinInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pxY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39713pxY extends AbstractC49408unw<C39713pxY> {
    public InterfaceC49371unL<C39703pxO> AEQbTJ;
    public InterfaceC49371unL<? extends java.util.List<C39708pxT>> AhwBna;
    public java.lang.String EZpvd;
    public InterfaceC49371unL<C39705pxQ> KWHzl;
    public InterfaceC49371unL<C39706pxR> OLrzqt;
    public InterfaceC49371unL<KlineCoinInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.pxY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39713pxY copy$default(C39713pxY c39713pxY, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC49371unL = c39713pxY.copydefault;
        }
        if ((i & 2) != 0) {
            interfaceC49371unL2 = c39713pxY.OLrzqt;
        }
        InterfaceC49371unL interfaceC49371unL6 = interfaceC49371unL2;
        if ((i & 4) != 0) {
            interfaceC49371unL3 = c39713pxY.KWHzl;
        }
        InterfaceC49371unL interfaceC49371unL7 = interfaceC49371unL3;
        if ((i & 8) != 0) {
            interfaceC49371unL4 = c39713pxY.AhwBna;
        }
        InterfaceC49371unL interfaceC49371unL8 = interfaceC49371unL4;
        if ((i & 16) != 0) {
            interfaceC49371unL5 = c39713pxY.AEQbTJ;
        }
        InterfaceC49371unL interfaceC49371unL9 = interfaceC49371unL5;
        if ((i & 32) != 0) {
            str = c39713pxY.EZpvd;
        }
        return c39713pxY.KWHzl(interfaceC49371unL, interfaceC49371unL6, interfaceC49371unL7, interfaceC49371unL8, interfaceC49371unL9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<C39703pxO> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.copydefault = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.pxT>>, o.unL<java.util.List<o.pxT>> */
    public final InterfaceC49371unL<java.util.List<C39708pxT>> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<C39706pxR> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC49371unL<C39703pxO> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AEQbTJ = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39713pxY KWHzl(@NotNull InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL, @NotNull InterfaceC49371unL<C39706pxR> interfaceC49371unL2, @NotNull InterfaceC49371unL<C39705pxQ> interfaceC49371unL3, @NotNull InterfaceC49371unL<? extends java.util.List<C39708pxT>> interfaceC49371unL4, @NotNull InterfaceC49371unL<C39703pxO> interfaceC49371unL5, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C39713pxY(interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, interfaceC49371unL4, interfaceC49371unL5, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<C39705pxQ> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC49371unL<C39706pxR> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.OLrzqt = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC49371unL<? extends java.util.List<C39708pxT>> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.AhwBna = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<KlineCoinInfo> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC49371unL<C39705pxQ> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39713pxY)) {
            return false;
        }
        C39713pxY c39713pxY = (C39713pxY) obj;
        return Intrinsics.EZpvd(this.copydefault, c39713pxY.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c39713pxY.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c39713pxY.KWHzl) && Intrinsics.EZpvd(this.AhwBna, c39713pxY.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, c39713pxY.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c39713pxY.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnlockTokensUIState(tokenInfo=" + this.copydefault + ", lockProgressInfo=" + this.OLrzqt + ", allUnlockTokenStages=" + this.KWHzl + ", unlockAllocationData=" + this.AhwBna + ", scheduleInfos=" + this.AEQbTJ + ", period=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (r8v0 o.unL)
  (r9v0 o.unL)
  (r10v0 o.unL)
  (r11v0 o.unL)
  (r12v0 o.unL)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("1W") : (r13v0 java.lang.String))
 A[MD:(o.unL<com.okinc.kline.data.KlineCoinInfo>, o.unL<o.pxR>, o.unL<o.pxQ>, o.unL<? extends java.util.List<o.pxT>>, o.unL<o.pxO>, java.lang.String):void (m)] (LINE:181) call: o.pxY.<init>(o.unL, o.unL, o.unL, o.unL, o.unL, java.lang.String):void type: THIS */
    public /* synthetic */ C39713pxY(InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, InterfaceC49371unL interfaceC49371unL4, InterfaceC49371unL interfaceC49371unL5, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, interfaceC49371unL4, interfaceC49371unL5, (i & 32) != 0 ? "1W" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39713pxY(@NotNull InterfaceC49371unL<KlineCoinInfo> interfaceC49371unL, @NotNull InterfaceC49371unL<C39706pxR> interfaceC49371unL2, @NotNull InterfaceC49371unL<C39705pxQ> interfaceC49371unL3, @NotNull InterfaceC49371unL<? extends java.util.List<C39708pxT>> interfaceC49371unL4, @NotNull InterfaceC49371unL<C39703pxO> interfaceC49371unL5, @NotNull java.lang.String str) {
        super(new Function1() { // from class: o.pyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39713pxY.OLrzqt((C39713pxY) obj);
            }
        });
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL4, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL5, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = interfaceC49371unL;
        this.OLrzqt = interfaceC49371unL2;
        this.KWHzl = interfaceC49371unL3;
        this.AhwBna = interfaceC49371unL4;
        this.AEQbTJ = interfaceC49371unL5;
        this.EZpvd = str;
    }

    public static final C39713pxY OLrzqt(C39713pxY c39713pxY) {
        Intrinsics.checkNotNullParameter(c39713pxY, "");
        return copy$default(c39713pxY, null, null, null, null, null, null, 63, null);
    }
}
