package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46811teH extends AbstractC49408unw<C46811teH> {
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46811teH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46811teH copy$default(C46811teH c46811teH, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46811teH.copydefault;
        }
        return c46811teH.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46811teH copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C46811teH(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46811teH) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C46811teH) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineAlertUiState(placeHolder=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:1479) call: o.teH.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C46811teH(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46811teH(@NotNull java.lang.String str) {
        super(new Function1() { // from class: o.teD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46811teH.EZpvd((C46811teH) obj);
            }
        });
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    public static final C46811teH EZpvd(C46811teH c46811teH) {
        Intrinsics.checkNotNullParameter(c46811teH, "");
        return copy$default(c46811teH, null, 1, null);
    }
}
