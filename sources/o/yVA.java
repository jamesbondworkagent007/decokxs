package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVA extends AbstractC56853yUt<yOJ> {
    public final boolean AEQbTJ;
    public final C56794ySo EZpvd;
    public final boolean KWHzl;
    public final yOB OLrzqt;
    public final AnnotationQualifierApplicabilityType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56853yUt
    public AnnotationQualifierApplicabilityType OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56853yUt
    public boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56853yUt
    public boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 o.yOB)
  (r8v0 boolean)
  (r9v0 o.ySo)
  (r10v0 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(o.yOB, boolean, o.ySo, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, boolean):void (m)] (LINE:233) call: o.yVA.<init>(o.yOB, boolean, o.ySo, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType, boolean):void type: THIS */
    public /* synthetic */ yVA(yOB yob, boolean z, C56794ySo c56794ySo, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yob, z, c56794ySo, annotationQualifierApplicabilityType, (i & 16) != 0 ? false : z2);
    }

    public yVA(yOB yob, boolean z, @NotNull C56794ySo c56794ySo, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(annotationQualifierApplicabilityType, "");
        this.OLrzqt = yob;
        this.AEQbTJ = z;
        this.EZpvd = c56794ySo;
        this.copydefault = annotationQualifierApplicabilityType;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yRa; */
    @Override // o.AbstractC56853yUt
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public yQX EZpvd() {
        return this.EZpvd.copydefault().AEQbTJ();
    }

    @Override // o.AbstractC56853yUt
    public boolean AhwBna() {
        return this.EZpvd.copydefault().fARcdN().EZpvd();
    }

    @Override // o.AbstractC56853yUt
    public java.lang.Iterable<yOJ> KWHzl() {
        yOL yolCopydefault;
        yOB yob = this.OLrzqt;
        return (yob == null || (yolCopydefault = yob.copydefault()) == null) ? yDY.AhwBna() : yolCopydefault;
    }

    @Override // o.AbstractC56853yUt
    public C56774yRv AEQbTJ() {
        return this.EZpvd.KWHzl();
    }

    @Override // o.AbstractC56853yUt
    public boolean copydefault() {
        yOB yob = this.OLrzqt;
        return (yob instanceof InterfaceC56695yOx) && ((InterfaceC56695yOx) yob).ejfBZ() != null;
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/zfy; */
    @Override // o.AbstractC56853yUt
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public InterfaceC59338zfE valueOf() {
        return C59295zeO.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lo/zfw;)Z */
    @Override // o.AbstractC56853yUt
    public boolean KWHzl(@NotNull yOJ yoj, InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(yoj, "");
        return ((yoj instanceof InterfaceC56787ySh) && ((InterfaceC56787ySh) yoj).valueOf()) || ((yoj instanceof ySD) && !AhwBna() && (((ySD) yoj).AhwBna() || OLrzqt() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) || (interfaceC59382zfw != null && AbstractC56640yMw.AYXKKw((AbstractC59233zdF) interfaceC59382zfw) && EZpvd().gEmmrt(yoj) && !this.EZpvd.copydefault().fARcdN().KWHzl());
    }

    @Override // o.AbstractC56853yUt
    public java.lang.Iterable<yOJ> KWHzl(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return ((AbstractC59233zdF) interfaceC59382zfw).copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/zfw;)Lo/zfw; */
    @Override // o.AbstractC56853yUt
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public AbstractC59233zdF OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return C59327zeu.OLrzqt((AbstractC59233zdF) interfaceC59382zfw);
    }

    @Override // o.AbstractC56853yUt
    public C56930yXp AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        InterfaceC56658yNn interfaceC56658yNnEZpvd = C59322zep.EZpvd((AbstractC59233zdF) interfaceC59382zfw);
        if (interfaceC56658yNnEZpvd != null) {
            return yYH.AEQbTJ((InterfaceC56665yNu) interfaceC56658yNnEZpvd);
        }
        return null;
    }

    @Override // o.AbstractC56853yUt
    public boolean gEmmrt(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return ((AbstractC59233zdF) interfaceC59382zfw).AkhnZx() instanceof C56856yUw;
    }

    @Override // o.AbstractC56853yUt
    public boolean AEQbTJ(@NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull InterfaceC59382zfw interfaceC59382zfw2) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw2, "");
        return this.EZpvd.copydefault().AkhnZx().OLrzqt((AbstractC59233zdF) interfaceC59382zfw, (AbstractC59233zdF) interfaceC59382zfw2);
    }

    @Override // o.AbstractC56853yUt
    public boolean valueOf(@NotNull InterfaceC59382zfw interfaceC59382zfw) {
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        return AbstractC56640yMw.AEQbTJ((AbstractC59233zdF) interfaceC59382zfw);
    }

    @Override // o.AbstractC56853yUt
    public boolean AEQbTJ(@NotNull InterfaceC59383zfx interfaceC59383zfx) {
        Intrinsics.checkNotNullParameter(interfaceC59383zfx, "");
        return interfaceC59383zfx instanceof C56830yTx;
    }

    @Override // o.AbstractC56853yUt
    public C56858yUy AEQbTJ(C56858yUy c56858yUy, C56766yRn c56766yRn) {
        C56858yUy c56858yUyCopy$default;
        if (c56858yUy != null && (c56858yUyCopy$default = C56858yUy.copy$default(c56858yUy, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return c56858yUyCopy$default;
        }
        if (c56766yRn != null) {
            return c56766yRn.OLrzqt();
        }
        return null;
    }
}
