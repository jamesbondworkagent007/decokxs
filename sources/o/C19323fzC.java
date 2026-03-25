package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19323fzC implements fDL<java.lang.Object> {
    public final C18877fqh AEQbTJ;
    public final boolean EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;

    @Override // o.fDL
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18877fqh KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    public C19323fzC(@NotNull C18877fqh c18877fqh, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c18877fqh, "");
        this.AEQbTJ = c18877fqh;
        this.copydefault = z;
        this.EZpvd = z2;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fzF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19323fzC.copydefault(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 o.fqh)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(o.fqh, boolean, boolean):void (m)] (LINE:6) call: o.fzC.<init>(o.fqh, boolean, boolean):void type: THIS */
    public /* synthetic */ C19323fzC(C18877fqh c18877fqh, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18877fqh, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }

    private final java.util.ArrayList<java.lang.Object> gEmmrt() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList copydefault(C19323fzC c19323fzC) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(c19323fzC.AEQbTJ.copydefault());
        return arrayList;
    }

    @Override // o.fDL
    public int OLrzqt() {
        return gEmmrt().size();
    }

    @Override // o.fDL
    public java.lang.Object copydefault(int i) {
        java.lang.Object obj = gEmmrt().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
