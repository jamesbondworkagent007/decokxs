package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import o.AbstractC59281zeA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59298zeR implements InterfaceC59291zeK {
    public final OverridingUtil EZpvd;
    public final AbstractC59281zeA KWHzl;
    public final AbstractC59287zeG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59281zeA AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59291zeK
    public AbstractC59287zeG EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59291zeK
    public OverridingUtil KWHzl() {
        return this.EZpvd;
    }

    public C59298zeR(@NotNull AbstractC59287zeG abstractC59287zeG, @NotNull AbstractC59281zeA abstractC59281zeA) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        Intrinsics.checkNotNullParameter(abstractC59281zeA, "");
        this.copydefault = abstractC59287zeG;
        this.KWHzl = abstractC59281zeA;
        OverridingUtil overridingUtilOLrzqt = OverridingUtil.OLrzqt(EZpvd());
        Intrinsics.checkNotNullExpressionValue(overridingUtilOLrzqt, "");
        this.EZpvd = overridingUtilOLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.zeG)
  (wrap:o.zeA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zeA:0x0004: SGET  A[WRAPPED] (LINE:80) o.zeA.Application.copydefault o.zeA$Application) : (r2v0 o.zeA))
 A[MD:(o.zeG, o.zeA):void (m)] (LINE:78) call: o.zeR.<init>(o.zeG, o.zeA):void type: THIS */
    public /* synthetic */ C59298zeR(AbstractC59287zeG abstractC59287zeG, AbstractC59281zeA abstractC59281zeA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC59287zeG, (i & 2) != 0 ? AbstractC59281zeA.Application.copydefault : abstractC59281zeA);
    }

    @Override // o.InterfaceC59284zeD
    public boolean copydefault(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        return AEQbTJ(C59328zev.createClassicTypeCheckerState$default(true, false, null, AEQbTJ(), EZpvd(), 6, null), abstractC59233zdF.AkhnZx(), abstractC59233zdF2.AkhnZx());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zev.createClassicTypeCheckerState$default(boolean, boolean, o.zeB, o.zeA, o.zeG, int, java.lang.Object):kotlin.reflect.jvm.internal.impl.types.TypeCheckerState */
    @Override // o.InterfaceC59284zeD
    public boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF2, "");
        return OLrzqt(C59328zev.createClassicTypeCheckerState$default(false, false, null, AEQbTJ(), EZpvd(), 6, null), abstractC59233zdF.AkhnZx(), abstractC59233zdF2.AkhnZx());
    }

    public final boolean OLrzqt(@NotNull TypeCheckerState typeCheckerState, @NotNull AbstractC59331zey abstractC59331zey, @NotNull AbstractC59331zey abstractC59331zey2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        Intrinsics.checkNotNullParameter(abstractC59331zey2, "");
        return C59188zcN.EZpvd.KWHzl(typeCheckerState, abstractC59331zey, abstractC59331zey2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.zcN.isSubtypeOf$default(o.zcN, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, o.zfw, o.zfw, boolean, int, java.lang.Object):boolean */
    public final boolean AEQbTJ(@NotNull TypeCheckerState typeCheckerState, @NotNull AbstractC59331zey abstractC59331zey, @NotNull AbstractC59331zey abstractC59331zey2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(abstractC59331zey, "");
        Intrinsics.checkNotNullParameter(abstractC59331zey2, "");
        return C59188zcN.isSubtypeOf$default(C59188zcN.EZpvd, typeCheckerState, abstractC59331zey, abstractC59331zey2, false, 8, null);
    }
}
