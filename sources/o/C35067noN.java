package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35067noN {
    public final InterfaceC35073noT AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final boolean KWHzl;
    public final Function0<java.util.Map<java.lang.String, TickersData>> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.noN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35067noN copy$default(C35067noN c35067noN, java.lang.String str, InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c35067noN.copydefault;
        }
        if ((i & 2) != 0) {
            interfaceC35073noT = c35067noN.AEQbTJ;
        }
        InterfaceC35073noT interfaceC35073noT2 = interfaceC35073noT;
        if ((i & 4) != 0) {
            num = c35067noN.EZpvd;
        }
        java.lang.Integer num2 = num;
        if ((i & 8) != 0) {
            z = c35067noN.KWHzl;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function0 = c35067noN.OLrzqt;
        }
        return c35067noN.OLrzqt(str, interfaceC35073noT2, num2, z2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35067noN OLrzqt(@NotNull java.lang.String str, @NotNull InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, boolean z, Function0<? extends java.util.Map<java.lang.String, TickersData>> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC35073noT, "");
        return new C35067noN(str, interfaceC35073noT, num, z, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35073noT copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35067noN)) {
            return false;
        }
        C35067noN c35067noN = (C35067noN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35067noN.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c35067noN.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c35067noN.EZpvd) && this.KWHzl == c35067noN.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c35067noN.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.Integer num = this.EZpvd;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        Function0<java.util.Map<java.lang.String, TickersData>> function0 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35067noN(@NotNull java.lang.String str, @NotNull InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, boolean z, Function0<? extends java.util.Map<java.lang.String, TickersData>> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC35073noT, "");
        this.copydefault = str;
        this.AEQbTJ = interfaceC35073noT;
        this.EZpvd = num;
        this.KWHzl = z;
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 o.noT)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:boolean:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r12v0 kotlin.jvm.functions.Function0))
 A[MD:(java.lang.String, o.noT, java.lang.Integer, boolean, kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, com.okinc.unify_trade.biz.subscribe.TickersData>>):void (m)] (LINE:34) call: o.noN.<init>(java.lang.String, o.noT, java.lang.Integer, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C35067noN(java.lang.String str, InterfaceC35073noT interfaceC35073noT, java.lang.Integer num, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC35073noT, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : function0);
    }

    public java.lang.String toString() {
        return "GetStockVosPayload(bizType=" + this.copydefault + ", desireCount=" + this.EZpvd + ", useCache=" + this.KWHzl + ", hasCupTickerGetter=" + (this.OLrzqt != null) + ")";
    }
}
