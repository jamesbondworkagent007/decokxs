package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yYW extends AbstractC59242zdO implements InterfaceC59377zfr {
    public final C59308zeb AEQbTJ;
    public final InterfaceC59317zek EZpvd;
    public final boolean OLrzqt;
    public final yYZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/zei; */
    @Override // o.AbstractC59233zdF
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public yYZ djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r1v0 o.zek)
  (wrap:o.yYZ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yYZ:0x0006: CONSTRUCTOR (r1v0 o.zek) A[MD:(o.zek):void (m), WRAPPED] (LINE:77) call: o.yYV.<init>(o.zek):void type: CONSTRUCTOR) : (r2v0 o.yYZ))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:o.zeb:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zeb:0x0014: INVOKE (wrap:o.zeb$Activity:0x0012: SGET  A[WRAPPED] (LINE:79) o.zeb.OLrzqt o.zeb$Activity) VIRTUAL call: o.zeb.Activity.copydefault():o.zeb A[MD:():o.zeb (m), WRAPPED] (LINE:79)) : (r4v0 o.zeb))
 A[MD:(o.zek, o.yYZ, boolean, o.zeb):void (m)] (LINE:75) call: o.yYW.<init>(o.zek, o.yYZ, boolean, o.zeb):void type: THIS */
    public /* synthetic */ yYW(InterfaceC59317zek interfaceC59317zek, yYZ yyz, boolean z, C59308zeb c59308zeb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59317zek, (i & 2) != 0 ? new yYV(interfaceC59317zek) : yyz, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C59308zeb.OLrzqt.copydefault() : c59308zeb);
    }

    public yYW(@NotNull InterfaceC59317zek interfaceC59317zek, @NotNull yYZ yyz, boolean z, @NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        Intrinsics.checkNotNullParameter(yyz, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        this.EZpvd = interfaceC59317zek;
        this.copydefault = yyz;
        this.OLrzqt = z;
        this.AEQbTJ = c59308zeb;
    }

    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return C59370zfk.copydefault(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }

    @Override // o.AbstractC59242zdO
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Captured(");
        sb.append(this.EZpvd);
        sb.append(')');
        sb.append(AEQbTJ() ? "?" : "");
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Z)Lo/zdO; */
    @Override // o.AbstractC59242zdO
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yYW AEQbTJ(boolean z) {
        return z == AEQbTJ() ? this : new yYW(this.EZpvd, djBIcL(), z, bX_());
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new yYW(this.EZpvd, djBIcL(), AEQbTJ(), c59308zeb);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yYW KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        InterfaceC59317zek interfaceC59317zekCopydefault = this.EZpvd.copydefault(abstractC59287zeG);
        Intrinsics.checkNotNullExpressionValue(interfaceC59317zekCopydefault, "");
        return new yYW(interfaceC59317zekCopydefault, djBIcL(), AEQbTJ(), bX_());
    }
}
