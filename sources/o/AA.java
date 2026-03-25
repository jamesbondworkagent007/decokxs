package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AA {
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AA copy$default(AA aa, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = aa.copydefault;
        }
        if ((i & 2) != 0) {
            num = aa.OLrzqt;
        }
        return aa.AEQbTJ(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AA AEQbTJ(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AA(str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AA)) {
            return false;
        }
        AA aa = (AA) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) aa.copydefault) && Intrinsics.EZpvd(this.OLrzqt, aa.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.Integer num = this.OLrzqt;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NoProxyHost(hostMatch=" + this.copydefault + ", port=" + this.OLrzqt + ')';
    }

    public AA(@NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.OLrzqt = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:99) call: o.AA.<init>(java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ AA(java.lang.String str, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }

    public final boolean KWHzl(@NotNull DL dl) {
        Intrinsics.checkNotNullParameter(dl, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "*")) {
            return true;
        }
        if (this.OLrzqt != null) {
            int iKWHzl = dl.KWHzl();
            java.lang.Integer num = this.OLrzqt;
            if (num == null || iKWHzl != num.intValue()) {
                return false;
            }
        }
        java.lang.String string = dl.OLrzqt().toString();
        if (this.copydefault.length() > string.length()) {
            return false;
        }
        boolean zEndsWith$default = C59449zhJ.endsWith$default(string, this.copydefault, false, 2, null);
        int length = (string.length() - this.copydefault.length()) - 1;
        return zEndsWith$default && (length < 0 || string.charAt(length) == '.');
    }
}
