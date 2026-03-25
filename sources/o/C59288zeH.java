package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59288zeH extends AbstractC59242zdO implements InterfaceC59377zfr {
    public final boolean AEQbTJ;
    public final AbstractC59331zey AhwBna;
    public final C59285zeE EZpvd;
    public final CaptureStatus KWHzl;
    public final C59308zeb OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/zei; */
    @Override // o.AbstractC59233zdF
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public C59285zeE djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59233zdF
    public C59308zeb bX_() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59331zey gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CaptureStatus valueOf() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r8v0 kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus)
  (r9v0 o.zeE)
  (r10v0 o.zey)
  (wrap:o.zeb:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zeb:0x0006: INVOKE (wrap:o.zeb$Activity:0x0004: SGET  A[WRAPPED] (LINE:203) o.zeb.OLrzqt o.zeb$Activity) VIRTUAL call: o.zeb.Activity.copydefault():o.zeb A[MD:():o.zeb (m), WRAPPED] (LINE:203)) : (r11v0 o.zeb))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus, o.zeE, o.zey, o.zeb, boolean, boolean):void (m)] (LINE:199) call: o.zeH.<init>(kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus, o.zeE, o.zey, o.zeb, boolean, boolean):void type: THIS */
    public /* synthetic */ C59288zeH(CaptureStatus captureStatus, C59285zeE c59285zeE, AbstractC59331zey abstractC59331zey, C59308zeb c59308zeb, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, c59285zeE, abstractC59331zey, (i & 8) != 0 ? C59308zeb.OLrzqt.copydefault() : c59308zeb, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public C59288zeH(@NotNull CaptureStatus captureStatus, @NotNull C59285zeE c59285zeE, AbstractC59331zey abstractC59331zey, @NotNull C59308zeb c59308zeb, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(captureStatus, "");
        Intrinsics.checkNotNullParameter(c59285zeE, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        this.KWHzl = captureStatus;
        this.EZpvd = c59285zeE;
        this.AhwBna = abstractC59331zey;
        this.OLrzqt = c59308zeb;
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59288zeH(@NotNull CaptureStatus captureStatus, AbstractC59331zey abstractC59331zey, @NotNull InterfaceC59317zek interfaceC59317zek, @NotNull InterfaceC56691yOt interfaceC56691yOt) {
        this(captureStatus, new C59285zeE(interfaceC59317zek, null, null, interfaceC56691yOt, 6, null), abstractC59331zey, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(captureStatus, "");
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
    }

    @Override // o.AbstractC59233zdF
    public java.util.List<InterfaceC59317zek> bY_() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC59233zdF
    public InterfaceC59098zad OLrzqt() {
        return C59370zfk.copydefault(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new java.lang.String[0]);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault */
    public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return new C59288zeH(this.KWHzl, djBIcL(), this.AhwBna, c59308zeb, AEQbTJ(), this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Z)Lo/zdO; */
    @Override // o.AbstractC59242zdO
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C59288zeH AEQbTJ(boolean z) {
        return new C59288zeH(this.KWHzl, djBIcL(), this.AhwBna, bX_(), z, false, 32, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
    @Override // o.AbstractC59331zey
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59288zeH KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        CaptureStatus captureStatus = this.KWHzl;
        C59285zeE c59285zeEAEQbTJ = djBIcL().AEQbTJ(abstractC59287zeG);
        AbstractC59331zey abstractC59331zey = this.AhwBna;
        return new C59288zeH(captureStatus, c59285zeEAEQbTJ, abstractC59331zey != null ? abstractC59287zeG.AEQbTJ(abstractC59331zey).AkhnZx() : null, bX_(), AEQbTJ(), false, 32, null);
    }
}
