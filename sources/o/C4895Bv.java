package o;

import aws.smithy.kotlin.runtime.http.operation.AuthHandler$call$1;
import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4895Bv<Input, Output> implements CG<BP<C5036Cg>, Output> {
    public final BK EZpvd;
    public final C4706Bo<Input, Output> KWHzl;
    public final CG<BP<C5036Cg>, Output> OLrzqt;
    public final BD copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super o.BP<o.Cg>, ? extends Output> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4895Bv(@NotNull CG<? super BP<C5036Cg>, ? extends Output> cg, @NotNull C4706Bo<Input, Output> c4706Bo, @NotNull BK bk, BD bd) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        Intrinsics.checkNotNullParameter(bk, "");
        this.OLrzqt = cg;
        this.KWHzl = c4706Bo;
        this.EZpvd = bk;
        this.copydefault = bd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0312 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0313 A[PHI: r2
  0x0313: PHI (r2v50 java.lang.Object) = (r2v49 java.lang.Object), (r2v1 java.lang.Object) binds: [B:69:0x0310, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.CG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull BP<C5036Cg> bp, @NotNull Continuation<? super Output> continuation) throws java.lang.Throwable {
        AuthHandler$call$1 authHandler$call$1;
        C4895Bv<Input, Output> c4895Bv;
        java.util.Iterator it;
        java.lang.Object next;
        InterfaceC52616wS interfaceC52616wS;
        BP<C5036Cg> bp2;
        C4895Bv<Input, Output> c4895Bv2;
        GB<java.lang.Double> gb;
        InterfaceC2861Ab interfaceC2861Ab;
        InterfaceC57843yq interfaceC57843yq;
        long j;
        InterfaceC5047Cr interfaceC5047Cr;
        GB<java.lang.Double> gbAEQbTJ;
        long jEZpvd;
        InterfaceC57843yq interfaceC57843yq2;
        InterfaceC5047Cr interfaceC5047Cr2;
        InterfaceC2861Ab interfaceC2861Ab2;
        BP<C5036Cg> bp3;
        InterfaceC57843yq interfaceC57843yq3;
        C4895Bv<Input, Output> c4895Bv3;
        java.lang.String strGEmmrt;
        java.lang.Object next2;
        InterfaceC57843yq interfaceC57843yqCopydefault;
        C3126Ag c3126Ag;
        GB<java.lang.Double> gbDbNXlk;
        InterfaceC3179Ah interfaceC3179AhAEQbTJ;
        BP<C5036Cg> bp4;
        long j2;
        BP<C5036Cg> bp5 = bp;
        if (continuation instanceof AuthHandler$call$1) {
            authHandler$call$1 = (AuthHandler$call$1) continuation;
            int i = authHandler$call$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                authHandler$call$1.label = i - Integer.MIN_VALUE;
            } else {
                authHandler$call$1 = new AuthHandler$call$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = authHandler$call$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (authHandler$call$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC4949Bx interfaceC4949BxCopydefault = this.EZpvd.copydefault();
                authHandler$call$1.L$0 = this;
                authHandler$call$1.L$1 = bp5;
                authHandler$call$1.label = 1;
                objEZpvd = interfaceC4949BxCopydefault.EZpvd(bp5, authHandler$call$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c4895Bv = this;
                java.util.List list = (java.util.List) objEZpvd;
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (c4895Bv.EZpvd.EZpvd().containsKey(C52643wT.copydefault(((InterfaceC52616wS) next).copydefault()))) {
                        }
                    }
                }
                interfaceC52616wS = (InterfaceC52616wS) next;
                if (interfaceC52616wS != null) {
                    throw new java.lang.IllegalStateException(("no auth scheme found for operation; candidates: " + list).toString());
                }
                InterfaceC2861Ab interfaceC2861Ab3 = c4895Bv.EZpvd.EZpvd().get(C52643wT.copydefault(interfaceC52616wS.copydefault()));
                if (interfaceC2861Ab3 == null) {
                    throw new java.lang.IllegalStateException(("auth scheme " + ((java.lang.Object) C52643wT.AEQbTJ(interfaceC52616wS.copydefault())) + " not configured").toString());
                }
                C58002yt c58002yt = new C58002yt();
                c58002yt.AEQbTJ("auth.scheme_id", interfaceC2861Ab3.copydefault());
                InterfaceC56293yA interfaceC56293yAAEQbTJ = c58002yt.AEQbTJ();
                C58108yv.KWHzl(bp5.OLrzqt(), interfaceC52616wS.OLrzqt());
                InterfaceC5045Cp interfaceC5045CpKWHzl = interfaceC2861Ab3.KWHzl(c4895Bv.EZpvd.KWHzl());
                GB<java.lang.Double> gbOLrzqt = BF.copydefault(bp5.OLrzqt()).OLrzqt();
                long jEZpvd2 = InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd();
                DT dtOLrzqt = bp5.OLrzqt();
                authHandler$call$1.L$0 = c4895Bv;
                authHandler$call$1.L$1 = bp5;
                authHandler$call$1.L$2 = interfaceC2861Ab3;
                authHandler$call$1.L$3 = interfaceC56293yAAEQbTJ;
                authHandler$call$1.L$4 = gbOLrzqt;
                authHandler$call$1.J$0 = jEZpvd2;
                authHandler$call$1.label = 2;
                java.lang.Object objResolve = interfaceC5045CpKWHzl.resolve(dtOLrzqt, authHandler$call$1);
                if (objResolve == objCopydefault) {
                    return objCopydefault;
                }
                bp2 = bp5;
                c4895Bv2 = c4895Bv;
                gb = gbOLrzqt;
                interfaceC2861Ab = interfaceC2861Ab3;
                interfaceC57843yq = interfaceC56293yAAEQbTJ;
                objEZpvd = objResolve;
                j = jEZpvd2;
                C59525zig c59525zig = new C59525zig((InterfaceC5047Cr) objEZpvd, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(j), null);
                GF.copydefault(gb, c59525zig.AEQbTJ(), interfaceC57843yq, null);
                interfaceC5047Cr = (InterfaceC5047Cr) c59525zig.KWHzl();
                BX bx = new BX(bp2.OLrzqt(), C5034Ce.immutableView$default(bp2.EZpvd(), false, 1, null), interfaceC5047Cr);
                if (c4895Bv2.copydefault != null) {
                    gbAEQbTJ = BF.copydefault(bp2.OLrzqt()).AEQbTJ();
                    InterfaceC57843yq interfaceC57843yqKWHzl = BF.KWHzl(bp2.OLrzqt());
                    jEZpvd = InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd();
                    BD bd = c4895Bv2.copydefault;
                    authHandler$call$1.L$0 = c4895Bv2;
                    authHandler$call$1.L$1 = bp2;
                    authHandler$call$1.L$2 = interfaceC2861Ab;
                    authHandler$call$1.L$3 = interfaceC57843yq;
                    authHandler$call$1.L$4 = interfaceC5047Cr;
                    authHandler$call$1.L$5 = gbAEQbTJ;
                    authHandler$call$1.L$6 = interfaceC57843yqKWHzl;
                    authHandler$call$1.J$0 = jEZpvd;
                    authHandler$call$1.label = 3;
                    java.lang.Object objEZpvd2 = bd.EZpvd(bx, authHandler$call$1);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    objEZpvd = objEZpvd2;
                    interfaceC57843yq2 = interfaceC57843yqKWHzl;
                    C59525zig c59525zig2 = new C59525zig((C57631ym) objEZpvd, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(jEZpvd), null);
                    GF.copydefault(gbAEQbTJ, c59525zig2.AEQbTJ(), interfaceC57843yq2, null);
                    final C57631ym c57631ym = (C57631ym) c59525zig2.KWHzl();
                    CoroutineContext context = authHandler$call$1.getContext();
                    Function0<java.lang.String> function0 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.AuthHandler$call$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "resolved endpoint: " + c57631ym;
                        }
                    };
                    LogLevel logLevel = LogLevel.Debug;
                    strGEmmrt = C56524yIo.AEQbTJ(C4895Bv.class).gEmmrt();
                    if (strGEmmrt != null) {
                        throw new java.lang.IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    C5141Gh.copydefault(context, logLevel, strGEmmrt, null, function0);
                    BL.OLrzqt(bp2, c57631ym);
                    java.util.Iterator<T> it2 = C57684yn.OLrzqt(c57631ym).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (C52643wT.copydefault(((InterfaceC52616wS) next2).copydefault(), interfaceC2861Ab.copydefault())) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    InterfaceC52616wS interfaceC52616wS2 = (InterfaceC52616wS) next2;
                    if (interfaceC52616wS2 == null || (interfaceC57843yqCopydefault = interfaceC52616wS2.OLrzqt()) == null) {
                        interfaceC57843yqCopydefault = C58108yv.copydefault();
                    }
                    C58108yv.KWHzl(bp2.OLrzqt(), interfaceC57843yqCopydefault);
                }
                interfaceC5047Cr2 = interfaceC5047Cr;
                interfaceC2861Ab2 = interfaceC2861Ab;
                bp3 = bp2;
                C4706Bo<Input, Output> c4706Bo = c4895Bv2.KWHzl;
                InterfaceC5037Ch interfaceC5037ChOLrzqt = C5034Ce.OLrzqt(bp3.EZpvd(), true);
                authHandler$call$1.L$0 = c4895Bv2;
                authHandler$call$1.L$1 = bp3;
                authHandler$call$1.L$2 = interfaceC2861Ab2;
                authHandler$call$1.L$3 = interfaceC57843yq;
                authHandler$call$1.L$4 = interfaceC5047Cr2;
                authHandler$call$1.L$5 = null;
                authHandler$call$1.L$6 = null;
                authHandler$call$1.label = 4;
                objEZpvd = c4706Bo.KWHzl(interfaceC5037ChOLrzqt, authHandler$call$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                interfaceC57843yq3 = interfaceC57843yq;
                c4895Bv3 = c4895Bv2;
                BP<C5036Cg> bpCopy$default = BP.copy$default(bp3, null, C5043Cn.EZpvd((InterfaceC5037Ch) objEZpvd), 1, null);
                c4895Bv3.KWHzl.OLrzqt(C5034Ce.immutableView$default(bpCopy$default.EZpvd(), false, 1, null));
                c3126Ag = new C3126Ag(bpCopy$default.EZpvd(), interfaceC5047Cr2, bpCopy$default.OLrzqt());
                gbDbNXlk = BF.copydefault(bp3.OLrzqt()).DbNXlk();
                long jEZpvd3 = InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd();
                interfaceC3179AhAEQbTJ = interfaceC2861Ab2.AEQbTJ();
                authHandler$call$1.L$0 = c4895Bv3;
                authHandler$call$1.L$1 = interfaceC57843yq3;
                authHandler$call$1.L$2 = bpCopy$default;
                authHandler$call$1.L$3 = gbDbNXlk;
                authHandler$call$1.L$4 = null;
                authHandler$call$1.J$0 = jEZpvd3;
                authHandler$call$1.label = 5;
                if (interfaceC3179AhAEQbTJ.EZpvd(c3126Ag, authHandler$call$1) != objCopydefault) {
                    return objCopydefault;
                }
                bp4 = bpCopy$default;
                j2 = jEZpvd3;
                C59525zig c59525zig3 = new C59525zig(Unit.INSTANCE, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(j2), null);
                GF.copydefault(gbDbNXlk, c59525zig3.AEQbTJ(), interfaceC57843yq3, null);
                c59525zig3.KWHzl();
                c4895Bv3.KWHzl.KWHzl(C5034Ce.immutableView$default(bp4.EZpvd(), false, 1, null));
                CG<BP<C5036Cg>, Output> cg = c4895Bv3.OLrzqt;
                authHandler$call$1.L$0 = null;
                authHandler$call$1.L$1 = null;
                authHandler$call$1.L$2 = null;
                authHandler$call$1.L$3 = null;
                authHandler$call$1.label = 6;
                objEZpvd = cg.OLrzqt(bp4, authHandler$call$1);
                return objEZpvd != objCopydefault ? objCopydefault : objEZpvd;
            case 1:
                bp5 = (BP) authHandler$call$1.L$1;
                c4895Bv = (C4895Bv) authHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.List list2 = (java.util.List) objEZpvd;
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                interfaceC52616wS = (InterfaceC52616wS) next;
                if (interfaceC52616wS != null) {
                }
                break;
            case 2:
                j = authHandler$call$1.J$0;
                gb = (GB) authHandler$call$1.L$4;
                InterfaceC57843yq interfaceC57843yq4 = (InterfaceC57843yq) authHandler$call$1.L$3;
                InterfaceC2861Ab interfaceC2861Ab4 = (InterfaceC2861Ab) authHandler$call$1.L$2;
                BP<C5036Cg> bp6 = (BP) authHandler$call$1.L$1;
                C4895Bv<Input, Output> c4895Bv4 = (C4895Bv) authHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                bp2 = bp6;
                c4895Bv2 = c4895Bv4;
                interfaceC57843yq = interfaceC57843yq4;
                interfaceC2861Ab = interfaceC2861Ab4;
                C59525zig c59525zig4 = new C59525zig((InterfaceC5047Cr) objEZpvd, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(j), null);
                GF.copydefault(gb, c59525zig4.AEQbTJ(), interfaceC57843yq, null);
                interfaceC5047Cr = (InterfaceC5047Cr) c59525zig4.KWHzl();
                BX bx2 = new BX(bp2.OLrzqt(), C5034Ce.immutableView$default(bp2.EZpvd(), false, 1, null), interfaceC5047Cr);
                if (c4895Bv2.copydefault != null) {
                }
                interfaceC5047Cr2 = interfaceC5047Cr;
                interfaceC2861Ab2 = interfaceC2861Ab;
                bp3 = bp2;
                C4706Bo<Input, Output> c4706Bo2 = c4895Bv2.KWHzl;
                InterfaceC5037Ch interfaceC5037ChOLrzqt2 = C5034Ce.OLrzqt(bp3.EZpvd(), true);
                authHandler$call$1.L$0 = c4895Bv2;
                authHandler$call$1.L$1 = bp3;
                authHandler$call$1.L$2 = interfaceC2861Ab2;
                authHandler$call$1.L$3 = interfaceC57843yq;
                authHandler$call$1.L$4 = interfaceC5047Cr2;
                authHandler$call$1.L$5 = null;
                authHandler$call$1.L$6 = null;
                authHandler$call$1.label = 4;
                objEZpvd = c4706Bo2.KWHzl(interfaceC5037ChOLrzqt2, authHandler$call$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 3:
                jEZpvd = authHandler$call$1.J$0;
                interfaceC57843yq2 = (InterfaceC57843yq) authHandler$call$1.L$6;
                gbAEQbTJ = (GB) authHandler$call$1.L$5;
                interfaceC5047Cr = (InterfaceC5047Cr) authHandler$call$1.L$4;
                interfaceC57843yq = (InterfaceC57843yq) authHandler$call$1.L$3;
                interfaceC2861Ab = (InterfaceC2861Ab) authHandler$call$1.L$2;
                bp2 = (BP) authHandler$call$1.L$1;
                c4895Bv2 = (C4895Bv) authHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                C59525zig c59525zig22 = new C59525zig((C57631ym) objEZpvd, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(jEZpvd), null);
                GF.copydefault(gbAEQbTJ, c59525zig22.AEQbTJ(), interfaceC57843yq2, null);
                final C57631ym c57631ym2 = (C57631ym) c59525zig22.KWHzl();
                CoroutineContext context2 = authHandler$call$1.getContext();
                Function0<java.lang.String> function02 = new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.operation.AuthHandler$call$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(0);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "resolved endpoint: " + c57631ym2;
                    }
                };
                LogLevel logLevel2 = LogLevel.Debug;
                strGEmmrt = C56524yIo.AEQbTJ(C4895Bv.class).gEmmrt();
                if (strGEmmrt != null) {
                }
                break;
            case 4:
                interfaceC5047Cr2 = (InterfaceC5047Cr) authHandler$call$1.L$4;
                InterfaceC57843yq interfaceC57843yq5 = (InterfaceC57843yq) authHandler$call$1.L$3;
                interfaceC2861Ab2 = (InterfaceC2861Ab) authHandler$call$1.L$2;
                bp3 = (BP) authHandler$call$1.L$1;
                C4895Bv<Input, Output> c4895Bv5 = (C4895Bv) authHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c4895Bv3 = c4895Bv5;
                interfaceC57843yq3 = interfaceC57843yq5;
                BP<C5036Cg> bpCopy$default2 = BP.copy$default(bp3, null, C5043Cn.EZpvd((InterfaceC5037Ch) objEZpvd), 1, null);
                c4895Bv3.KWHzl.OLrzqt(C5034Ce.immutableView$default(bpCopy$default2.EZpvd(), false, 1, null));
                c3126Ag = new C3126Ag(bpCopy$default2.EZpvd(), interfaceC5047Cr2, bpCopy$default2.OLrzqt());
                gbDbNXlk = BF.copydefault(bp3.OLrzqt()).DbNXlk();
                long jEZpvd32 = InterfaceC59524zif.StateListAnimator.AEQbTJ.EZpvd();
                interfaceC3179AhAEQbTJ = interfaceC2861Ab2.AEQbTJ();
                authHandler$call$1.L$0 = c4895Bv3;
                authHandler$call$1.L$1 = interfaceC57843yq3;
                authHandler$call$1.L$2 = bpCopy$default2;
                authHandler$call$1.L$3 = gbDbNXlk;
                authHandler$call$1.L$4 = null;
                authHandler$call$1.J$0 = jEZpvd32;
                authHandler$call$1.label = 5;
                if (interfaceC3179AhAEQbTJ.EZpvd(c3126Ag, authHandler$call$1) != objCopydefault) {
                }
                break;
            case 5:
                j2 = authHandler$call$1.J$0;
                gbDbNXlk = (GB) authHandler$call$1.L$3;
                bp4 = (BP) authHandler$call$1.L$2;
                interfaceC57843yq3 = (InterfaceC57843yq) authHandler$call$1.L$1;
                c4895Bv3 = (C4895Bv) authHandler$call$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                C59525zig c59525zig32 = new C59525zig(Unit.INSTANCE, InterfaceC59524zif.StateListAnimator.Application.AEQbTJ(j2), null);
                GF.copydefault(gbDbNXlk, c59525zig32.AEQbTJ(), interfaceC57843yq3, null);
                c59525zig32.KWHzl();
                c4895Bv3.KWHzl.KWHzl(C5034Ce.immutableView$default(bp4.EZpvd(), false, 1, null));
                CG<BP<C5036Cg>, Output> cg2 = c4895Bv3.OLrzqt;
                authHandler$call$1.L$0 = null;
                authHandler$call$1.L$1 = null;
                authHandler$call$1.L$2 = null;
                authHandler$call$1.L$3 = null;
                authHandler$call$1.label = 6;
                objEZpvd = cg2.OLrzqt(bp4, authHandler$call$1);
                if (objEZpvd != objCopydefault) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(objEZpvd);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
