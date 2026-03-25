package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEH {
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<iEG> OLrzqt;
    public final java.lang.String gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public static final iEH copydefault = new iEH(null, null, null, null, null, 31, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEH() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.iEH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ iEH copy$default(iEH ieh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ieh.gEmmrt;
        }
        if ((i & 2) != 0) {
            str2 = ieh.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = ieh.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = ieh.AhwBna;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = ieh.OLrzqt;
        }
        return ieh.copydefault(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEH copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<iEG> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new iEH(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEH)) {
            return false;
        }
        iEH ieh = (iEH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) ieh.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ieh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ieh.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) ieh.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, ieh.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.gEmmrt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolPoints(total=" + this.gEmmrt + ", count=" + this.KWHzl + ", logoUrl=" + this.EZpvd + ", webUrl=" + this.AhwBna + ", points=" + this.OLrzqt + ")";
    }

    public iEH(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<iEG> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.AhwBna = str4;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0023: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:56)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<o.iEG>):void (m)] (LINE:51) call: o.iEH.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ iEH(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) == 0 ? str2 : "0", (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? yDY.AhwBna() : list);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
