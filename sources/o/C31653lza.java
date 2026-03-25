package o;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31653lza {
    public final ConvertCurrencyBean AEQbTJ;
    public final java.util.List<ConvertCurrencyBean> EZpvd;
    public final java.util.List<ConvertCurrencyBean> KWHzl;
    public final ConvertCurrencyBean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.lza */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C31653lza copy$default(C31653lza c31653lza, ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, java.util.List list, java.util.List list2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            convertCurrencyBean = c31653lza.OLrzqt;
        }
        if ((i & 2) != 0) {
            convertCurrencyBean2 = c31653lza.AEQbTJ;
        }
        ConvertCurrencyBean convertCurrencyBean3 = convertCurrencyBean2;
        if ((i & 4) != 0) {
            list = c31653lza.EZpvd;
        }
        java.util.List list3 = list;
        if ((i & 8) != 0) {
            list2 = c31653lza.KWHzl;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            z = c31653lza.copydefault;
        }
        return c31653lza.KWHzl(convertCurrencyBean, convertCurrencyBean3, list3, list4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ConvertCurrencyBean> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31653lza KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull java.util.List<ConvertCurrencyBean> list, @NotNull java.util.List<ConvertCurrencyBean> list2, boolean z) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C31653lza(convertCurrencyBean, convertCurrencyBean2, list, list2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ConvertCurrencyBean> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertCurrencyBean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31653lza)) {
            return false;
        }
        C31653lza c31653lza = (C31653lza) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c31653lza.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c31653lza.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c31653lza.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c31653lza.KWHzl) && this.copydefault == c31653lza.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InitDataResult(fromToken=" + this.OLrzqt + ", toToken=" + this.AEQbTJ + ", fromList=" + this.EZpvd + ", toList=" + this.KWHzl + ", isPreselectedTokenSupported=" + this.copydefault + ")";
    }

    public C31653lza(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull java.util.List<ConvertCurrencyBean> list, @NotNull java.util.List<ConvertCurrencyBean> list2, boolean z) {
        Intrinsics.checkNotNullParameter(convertCurrencyBean, "");
        Intrinsics.checkNotNullParameter(convertCurrencyBean2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = convertCurrencyBean;
        this.AEQbTJ = convertCurrencyBean2;
        this.EZpvd = list;
        this.KWHzl = list2;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean)
  (r8v0 com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean)
  (r9v0 java.util.List)
  (r10v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, java.util.List<com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean>, boolean):void (m)] (LINE:126) call: o.lza.<init>(com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean, java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C31653lza(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, java.util.List list, java.util.List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(convertCurrencyBean, convertCurrencyBean2, list, list2, (i & 16) != 0 ? true : z);
    }
}
