package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xkm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55483xkm extends AbstractC49408unw<C55483xkm> {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55483xkm() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C55483xkm copy$default(C55483xkm c55483xkm, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c55483xkm.AEQbTJ;
        }
        return c55483xkm.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55483xkm KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C55483xkm(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C55483xkm) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((C55483xkm) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "KlineShareUiState(placeHolder=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:165) call: o.xkm.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C55483xkm(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55483xkm(@NotNull java.lang.String str) {
        super(new Function1() { // from class: o.xkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55483xkm.OLrzqt((C55483xkm) obj);
            }
        });
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public static final C55483xkm OLrzqt(C55483xkm c55483xkm) {
        Intrinsics.checkNotNullParameter(c55483xkm, "");
        return copy$default(c55483xkm, null, 1, null);
    }
}
