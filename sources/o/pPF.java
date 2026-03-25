package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pPF {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pPF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ pPF copy$default(pPF ppf, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ppf.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = ppf.copydefault;
        }
        if ((i & 4) != 0) {
            map = ppf.OLrzqt;
        }
        return ppf.copydefault(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pPF copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new pPF(str, str2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LegacyDeeplinkMappingData(path=" + this.AEQbTJ + ", v2Deeplink=" + this.copydefault + ", params=" + this.OLrzqt + ")";
    }

    public pPF(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.OLrzqt = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:41) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.Map))
 A[MD:(java.lang.String, java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:38) call: o.pPF.<init>(java.lang.String, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ pPF(java.lang.String str, java.lang.String str2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? new LinkedHashMap() : map);
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str = this.AEQbTJ;
        Intrinsics.copydefault(obj, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((pPF) obj).AEQbTJ);
    }
}
