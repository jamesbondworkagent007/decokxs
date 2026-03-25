package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pOH {
    public final boolean AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final java.util.List<C43240rlZ> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.pOH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pOH copy$default(pOH poh, java.lang.String str, java.util.List list, boolean z, java.util.Map map, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = poh.copydefault;
        }
        if ((i & 2) != 0) {
            list = poh.EZpvd;
        }
        java.util.List list3 = list;
        if ((i & 4) != 0) {
            z = poh.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            map = poh.KWHzl;
        }
        java.util.Map map2 = map;
        if ((i & 16) != 0) {
            list2 = poh.OLrzqt;
        }
        return poh.KWHzl(str, list3, z2, map2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pOH KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<C43240rlZ> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new pOH(str, list, z, map, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeepLinkItemData(path=" + this.copydefault + ", modes=" + this.EZpvd + ", requireAuth=" + this.AEQbTJ + ", params=" + this.KWHzl + ", actualInfo=" + this.OLrzqt + ")";
    }

    public pOH(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<C43240rlZ> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = str;
        this.EZpvd = list;
        this.AEQbTJ = z;
        this.KWHzl = map;
        this.OLrzqt = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.util.List)
  (r9v0 boolean)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:9) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r10v0 java.util.Map))
  (r11v0 java.util.List)
 A[MD:(java.lang.String, java.util.List<java.lang.String>, boolean, java.util.Map<java.lang.String, java.lang.String>, java.util.List<o.rlZ>):void (m)] (LINE:5) call: o.pOH.<init>(java.lang.String, java.util.List, boolean, java.util.Map, java.util.List):void type: THIS */
    public /* synthetic */ pOH(java.lang.String str, java.util.List list, boolean z, java.util.Map map, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, (i & 8) != 0 ? new LinkedHashMap() : map, list2);
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str = this.copydefault;
        Intrinsics.copydefault(obj, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((pOH) obj).copydefault);
    }
}
