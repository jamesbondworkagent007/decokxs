package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59366zfg extends AbstractC59242zdO {
    public final java.lang.String[] AEQbTJ;
    public final InterfaceC59315zei EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<InterfaceC59317zek> copydefault;
    public final InterfaceC59098zad gEmmrt;
    public final ErrorTypeKind valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59366zfg KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public InterfaceC59315zei djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorTypeKind gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r8v0 o.zei)
  (r9v0 o.zad)
  (r10v0 kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind)
  (wrap:java.util.List:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r11v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (r13v0 java.lang.String[])
 A[MD:(o.zei, o.zad, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind, java.util.List<? extends o.zek>, boolean, java.lang.String[]):void VARARG (m), VARARG_CALL] (LINE:12) call: o.zfg.<init>(o.zei, o.zad, kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind, java.util.List, boolean, java.lang.String[]):void type: THIS */
    public /* synthetic */ C59366zfg(InterfaceC59315zei interfaceC59315zei, InterfaceC59098zad interfaceC59098zad, ErrorTypeKind errorTypeKind, java.util.List list, boolean z, java.lang.String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59315zei, interfaceC59098zad, errorTypeKind, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? false : z, strArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends o.zek> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59366zfg(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull InterfaceC59098zad interfaceC59098zad, @NotNull ErrorTypeKind errorTypeKind, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z, @NotNull java.lang.String... strArr) {
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        Intrinsics.checkNotNullParameter(errorTypeKind, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.EZpvd = interfaceC59315zei;
        this.gEmmrt = interfaceC59098zad;
        this.valueOf = errorTypeKind;
        this.copydefault = list;
        this.KWHzl = z;
        this.AEQbTJ = strArr;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String debugMessage = errorTypeKind.getDebugMessage();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(debugMessage, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "");
        this.OLrzqt = str;
    }

    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return C59308zeb.OLrzqt.copydefault();
    }

    public final C59366zfg KWHzl(@NotNull java.util.List<? extends InterfaceC59317zek> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC59315zei interfaceC59315zeiDjBIcL = djBIcL();
        InterfaceC59098zad interfaceC59098zadOLrzqt = OLrzqt();
        ErrorTypeKind errorTypeKind = this.valueOf;
        boolean zAEQbTJ = AEQbTJ();
        java.lang.String[] strArr = this.AEQbTJ;
        return new C59366zfg(interfaceC59315zeiDjBIcL, interfaceC59098zadOLrzqt, errorTypeKind, list, zAEQbTJ, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(boolean z) {
        InterfaceC59315zei interfaceC59315zeiDjBIcL = djBIcL();
        InterfaceC59098zad interfaceC59098zadOLrzqt = OLrzqt();
        ErrorTypeKind errorTypeKind = this.valueOf;
        java.util.List<InterfaceC59317zek> listBY_ = bY_();
        java.lang.String[] strArr = this.AEQbTJ;
        return new C59366zfg(interfaceC59315zeiDjBIcL, interfaceC59098zadOLrzqt, errorTypeKind, listBY_, z, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }
}
