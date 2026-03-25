package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59282zeB extends InterfaceC59324zer, InterfaceC59338zfE {
    /* JADX INFO: renamed from: AEQbTJ */
    InterfaceC59380zfu copydefault(@NotNull InterfaceC59381zfv interfaceC59381zfv, boolean z);

    @Override // o.InterfaceC59384zfy
    boolean AYXKKw(@NotNull InterfaceC59381zfv interfaceC59381zfv);

    /* JADX INFO: renamed from: EZpvd */
    InterfaceC59380zfu OLrzqt(@NotNull InterfaceC59374zfo interfaceC59374zfo);

    /* JADX INFO: renamed from: EZpvd */
    InterfaceC59380zfu OLrzqt(@NotNull InterfaceC59382zfw interfaceC59382zfw);

    @Override // o.InterfaceC59384zfy
    boolean EZpvd(@NotNull InterfaceC59334zfA interfaceC59334zfA);

    /* JADX INFO: renamed from: KWHzl */
    InterfaceC59380zfu copydefault(@NotNull InterfaceC59374zfo interfaceC59374zfo);

    @Override // o.InterfaceC59384zfy
    InterfaceC59377zfr copydefault(@NotNull InterfaceC59380zfu interfaceC59380zfu);

    InterfaceC59382zfw copydefault(@NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2);

    @Override // o.InterfaceC59384zfy
    InterfaceC59385zfz fetchVPNInfo(@NotNull InterfaceC59381zfv interfaceC59381zfv);

    /* JADX INFO: renamed from: o.zeB$Application */
    public static final class Application {
        public static boolean copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB) {
            return false;
        }

        public static boolean AYXKKw(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return ((InterfaceC59315zei) interfaceC59385zfz).gEmmrt();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean values(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return interfaceC59385zfz instanceof IntegerLiteralTypeConstructor;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static InterfaceC59383zfx KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59339zfF interfaceC59339zfF) {
            Intrinsics.checkNotNullParameter(interfaceC59339zfF, "");
            if (interfaceC59339zfF instanceof InterfaceC59297zeQ) {
                return ((InterfaceC59297zeQ) interfaceC59339zfF).AEQbTJ();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59339zfF + ", " + C56524yIo.AEQbTJ(interfaceC59339zfF.getClass())).toString());
        }

        public static java.util.Collection<InterfaceC59382zfw> AhwBna(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            InterfaceC59385zfz interfaceC59385zfzFetchVPNInfo = interfaceC59282zeB.fetchVPNInfo(interfaceC59381zfv);
            if (interfaceC59385zfzFetchVPNInfo instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) interfaceC59385zfzFetchVPNInfo).AEQbTJ();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static InterfaceC59380zfu copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return ((AbstractC59242zdO) interfaceC59381zfv).AEQbTJ(z);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static boolean gEmmrt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return C59238zdK.AEQbTJ((AbstractC59233zdF) interfaceC59382zfw);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zfv */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return C59336zfC.djBIcL((AbstractC59233zdF) interfaceC59381zfv);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zfv */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return C59336zfC.gEmmrt((AbstractC59233zdF) interfaceC59381zfv);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static InterfaceC59382zfw OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59377zfr interfaceC59377zfr) {
            Intrinsics.checkNotNullParameter(interfaceC59377zfr, "");
            if (interfaceC59377zfr instanceof C59288zeH) {
                return ((C59288zeH) interfaceC59377zfr).gEmmrt();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59377zfr + ", " + C56524yIo.AEQbTJ(interfaceC59377zfr.getClass())).toString());
        }

        public static boolean DbNXlk(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return interfaceC59385zfz instanceof C59228zdA;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            Intrinsics.checkNotNullParameter(interfaceC59381zfv2, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                if (interfaceC59381zfv2 instanceof AbstractC59242zdO) {
                    return ((AbstractC59242zdO) interfaceC59381zfv).bY_() == ((AbstractC59242zdO) interfaceC59381zfv2).bY_();
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv2 + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv2.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static InterfaceC59380zfu OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                AbstractC59331zey abstractC59331zeyAkhnZx = ((AbstractC59233zdF) interfaceC59382zfw).AkhnZx();
                if (abstractC59331zeyAkhnZx instanceof AbstractC59242zdO) {
                    return (AbstractC59242zdO) abstractC59331zeyAkhnZx;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59374zfo EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                AbstractC59331zey abstractC59331zeyAkhnZx = ((AbstractC59233zdF) interfaceC59382zfw).AkhnZx();
                if (abstractC59331zeyAkhnZx instanceof AbstractC59272zds) {
                    return (AbstractC59272zds) abstractC59331zeyAkhnZx;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59376zfq AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59374zfo interfaceC59374zfo) {
            Intrinsics.checkNotNullParameter(interfaceC59374zfo, "");
            if (interfaceC59374zfo instanceof AbstractC59272zds) {
                if (interfaceC59374zfo instanceof C59266zdm) {
                    return (C59266zdm) interfaceC59374zfo;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59374zfo + ", " + C56524yIo.AEQbTJ(interfaceC59374zfo.getClass())).toString());
        }

        public static boolean DbNXlk(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return interfaceC59382zfw instanceof InterfaceC59243zdP;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59380zfu KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59374zfo interfaceC59374zfo) {
            Intrinsics.checkNotNullParameter(interfaceC59374zfo, "");
            if (interfaceC59374zfo instanceof AbstractC59272zds) {
                return ((AbstractC59272zds) interfaceC59374zfo).AYXKKw();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59374zfo + ", " + C56524yIo.AEQbTJ(interfaceC59374zfo.getClass())).toString());
        }

        public static InterfaceC59380zfu EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59374zfo interfaceC59374zfo) {
            Intrinsics.checkNotNullParameter(interfaceC59374zfo, "");
            if (interfaceC59374zfo instanceof AbstractC59272zds) {
                return ((AbstractC59272zds) interfaceC59374zfo).valueOf();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59374zfo + ", " + C56524yIo.AEQbTJ(interfaceC59374zfo.getClass())).toString());
        }

        public static InterfaceC59377zfr OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59380zfu interfaceC59380zfu) {
            Intrinsics.checkNotNullParameter(interfaceC59380zfu, "");
            if (interfaceC59380zfu instanceof AbstractC59242zdO) {
                if (interfaceC59380zfu instanceof C59246zdS) {
                    return interfaceC59282zeB.copydefault((InterfaceC59380zfu) ((C59246zdS) interfaceC59380zfu).fetchVPNInfo());
                }
                if (interfaceC59380zfu instanceof C59288zeH) {
                    return (C59288zeH) interfaceC59380zfu;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59380zfu + ", " + C56524yIo.AEQbTJ(interfaceC59380zfu.getClass())).toString());
        }

        public static InterfaceC59373zfn EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                if (interfaceC59381zfv instanceof C59265zdl) {
                    return (C59265zdl) interfaceC59381zfv;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static boolean AYXKKw(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            return interfaceC59382zfw instanceof InterfaceC59239zdL;
        }

        public static boolean djBIcL(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            return (interfaceC59382zfw instanceof AbstractC59242zdO) && ((AbstractC59242zdO) interfaceC59382zfw).AEQbTJ();
        }

        public static InterfaceC59385zfz AYXKKw(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return ((AbstractC59242zdO) interfaceC59381zfv).djBIcL();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static InterfaceC59371zfl KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59377zfr interfaceC59377zfr) {
            Intrinsics.checkNotNullParameter(interfaceC59377zfr, "");
            if (interfaceC59377zfr instanceof C59288zeH) {
                return ((C59288zeH) interfaceC59377zfr).djBIcL();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59377zfr + ", " + C56524yIo.AEQbTJ(interfaceC59377zfr.getClass())).toString());
        }

        public static InterfaceC59334zfA EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59371zfl interfaceC59371zfl) {
            Intrinsics.checkNotNullParameter(interfaceC59371zfl, "");
            if (interfaceC59371zfl instanceof C59285zeE) {
                return ((C59285zeE) interfaceC59371zfl).AEQbTJ();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59371zfl + ", " + C56524yIo.AEQbTJ(interfaceC59371zfl.getClass())).toString());
        }

        public static int copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return ((AbstractC59233zdF) interfaceC59382zfw).bY_().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59334zfA EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw, int i) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return ((AbstractC59233zdF) interfaceC59382zfw).bY_().get(i);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static java.util.List<InterfaceC59334zfA> KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return ((AbstractC59233zdF) interfaceC59382zfw).bY_();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static boolean EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59334zfA interfaceC59334zfA) {
            Intrinsics.checkNotNullParameter(interfaceC59334zfA, "");
            if (interfaceC59334zfA instanceof InterfaceC59317zek) {
                return ((InterfaceC59317zek) interfaceC59334zfA).AEQbTJ();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59334zfA + ", " + C56524yIo.AEQbTJ(interfaceC59334zfA.getClass())).toString());
        }

        public static TypeVariance KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59334zfA interfaceC59334zfA) {
            Intrinsics.checkNotNullParameter(interfaceC59334zfA, "");
            if (interfaceC59334zfA instanceof InterfaceC59317zek) {
                Variance varianceEZpvd = ((InterfaceC59317zek) interfaceC59334zfA).EZpvd();
                Intrinsics.checkNotNullExpressionValue(varianceEZpvd, "");
                return C59340zfG.OLrzqt(varianceEZpvd);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59334zfA + ", " + C56524yIo.AEQbTJ(interfaceC59334zfA.getClass())).toString());
        }

        public static InterfaceC59382zfw copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59334zfA interfaceC59334zfA) {
            Intrinsics.checkNotNullParameter(interfaceC59334zfA, "");
            if (interfaceC59282zeB.EZpvd(interfaceC59334zfA)) {
                return null;
            }
            if (interfaceC59334zfA instanceof InterfaceC59317zek) {
                return ((InterfaceC59317zek) interfaceC59334zfA).OLrzqt().AkhnZx();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59334zfA + ", " + C56524yIo.AEQbTJ(interfaceC59334zfA.getClass())).toString());
        }

        public static int AkhnZx(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return ((InterfaceC59315zei) interfaceC59385zfz).copydefault().size();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static InterfaceC59383zfx OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz, int i) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56691yOt interfaceC56691yOt = ((InterfaceC59315zei) interfaceC59385zfz).copydefault().get(i);
                Intrinsics.checkNotNullExpressionValue(interfaceC56691yOt, "");
                return interfaceC56691yOt;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static java.util.List<InterfaceC59383zfx> EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                java.util.List<InterfaceC56691yOt> listCopydefault = ((InterfaceC59315zei) interfaceC59385zfz).copydefault();
                Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
                return listCopydefault;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static java.util.Collection<InterfaceC59382zfw> fJNWhG(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                java.util.Collection<AbstractC59233zdF> collectionBV_ = ((InterfaceC59315zei) interfaceC59385zfz).bV_();
                Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
                return collectionBV_;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static TypeVariance copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59383zfx interfaceC59383zfx) {
            Intrinsics.checkNotNullParameter(interfaceC59383zfx, "");
            if (interfaceC59383zfx instanceof InterfaceC56691yOt) {
                Variance varianceValues = ((InterfaceC56691yOt) interfaceC59383zfx).values();
                Intrinsics.checkNotNullExpressionValue(varianceValues, "");
                return C59340zfG.OLrzqt(varianceValues);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59383zfx + ", " + C56524yIo.AEQbTJ(interfaceC59383zfx.getClass())).toString());
        }

        public static java.util.List<InterfaceC59382zfw> AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59383zfx interfaceC59383zfx) {
            Intrinsics.checkNotNullParameter(interfaceC59383zfx, "");
            if (interfaceC59383zfx instanceof InterfaceC56691yOt) {
                java.util.List<AbstractC59233zdF> listDjBIcL = ((InterfaceC56691yOt) interfaceC59383zfx).djBIcL();
                Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
                return listDjBIcL;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59383zfx + ", " + C56524yIo.AEQbTJ(interfaceC59383zfx.getClass())).toString());
        }

        public static boolean EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59383zfx interfaceC59383zfx, InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59383zfx, "");
            if (interfaceC59383zfx instanceof InterfaceC56691yOt) {
                InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) interfaceC59383zfx;
                if (interfaceC59385zfz == null ? true : interfaceC59385zfz instanceof InterfaceC59315zei) {
                    return C59336zfC.hasTypeParameterRecursiveBounds$default(interfaceC56691yOt, (InterfaceC59315zei) interfaceC59385zfz, null, 4, null);
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC56691yOt + ", " + C56524yIo.AEQbTJ(interfaceC56691yOt.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59383zfx + ", " + C56524yIo.AEQbTJ(interfaceC59383zfx.getClass())).toString());
        }

        public static boolean AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz, @NotNull InterfaceC59385zfz interfaceC59385zfz2) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            Intrinsics.checkNotNullParameter(interfaceC59385zfz2, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                if (interfaceC59385zfz2 instanceof InterfaceC59315zei) {
                    return Intrinsics.EZpvd(interfaceC59385zfz, interfaceC59385zfz2);
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz2 + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz2.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean djBIcL(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt() instanceof InterfaceC56658yNn;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean AhwBna(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsOLrzqt : null;
                return (interfaceC56658yNn == null || !yNM.EZpvd(interfaceC56658yNn) || interfaceC56658yNn.DbNXlk() == ClassKind.ENUM_ENTRY || interfaceC56658yNn.DbNXlk() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static InterfaceC59378zfs OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return (InterfaceC59378zfs) interfaceC59381zfv;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static AbstractC59242zdO EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull CaptureStatus captureStatus) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            Intrinsics.checkNotNullParameter(captureStatus, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return C59293zeM.AEQbTJ((AbstractC59242zdO) interfaceC59381zfv, captureStatus);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static boolean gEmmrt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return AbstractC56640yMw.OLrzqt((InterfaceC59315zei) interfaceC59385zfz, yMB.Application.isConnected);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean isConnected(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                return AbstractC56640yMw.OLrzqt((InterfaceC59315zei) interfaceC59385zfz, yMB.Application.flVtFt);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static InterfaceC59334zfA AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return C59336zfC.EZpvd((AbstractC59233zdF) interfaceC59382zfw);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.zfv */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                if (!C59238zdK.AEQbTJ((AbstractC59233zdF) interfaceC59381zfv)) {
                    AbstractC59242zdO abstractC59242zdO = (AbstractC59242zdO) interfaceC59381zfv;
                    if (!(abstractC59242zdO.djBIcL().OLrzqt() instanceof InterfaceC56690yOs) && (abstractC59242zdO.djBIcL().OLrzqt() != null || (interfaceC59381zfv instanceof yYW) || (interfaceC59381zfv instanceof C59288zeH) || (interfaceC59381zfv instanceof C59265zdl) || (abstractC59242zdO.djBIcL() instanceof IntegerLiteralTypeConstructor) || copydefault(interfaceC59282zeB, (InterfaceC59380zfu) interfaceC59381zfv))) {
                        return true;
                    }
                }
                return false;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        public static boolean copydefault(InterfaceC59282zeB interfaceC59282zeB, InterfaceC59380zfu interfaceC59380zfu) {
            return (interfaceC59380zfu instanceof C59246zdS) && interfaceC59282zeB.AYXKKw((InterfaceC59381zfv) ((C59246zdS) interfaceC59380zfu).fetchVPNInfo());
        }

        public static InterfaceC59382zfw AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull java.util.Collection<? extends InterfaceC59382zfw> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            return C59332zez.copydefault(collection);
        }

        public static InterfaceC59382zfw copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            Intrinsics.checkNotNullParameter(interfaceC59381zfv2, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                if (interfaceC59381zfv2 instanceof AbstractC59242zdO) {
                    return C59231zdD.copydefault((AbstractC59242zdO) interfaceC59381zfv, (AbstractC59242zdO) interfaceC59381zfv2);
                }
                throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59282zeB + ", " + C56524yIo.AEQbTJ(interfaceC59282zeB.getClass())).toString());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59282zeB + ", " + C56524yIo.AEQbTJ(interfaceC59282zeB.getClass())).toString());
        }

        public static InterfaceC59382zfw copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof InterfaceC59381zfv) {
                return interfaceC59282zeB.copydefault((InterfaceC59381zfv) interfaceC59382zfw, z);
            }
            if (!(interfaceC59382zfw instanceof InterfaceC59374zfo)) {
                throw new java.lang.IllegalStateException("sealed".toString());
            }
            InterfaceC59374zfo interfaceC59374zfo = (InterfaceC59374zfo) interfaceC59382zfw;
            return interfaceC59282zeB.copydefault(interfaceC59282zeB.copydefault(interfaceC59282zeB.copydefault(interfaceC59374zfo), z), interfaceC59282zeB.copydefault(interfaceC59282zeB.OLrzqt(interfaceC59374zfo), z));
        }

        public static TypeCheckerState copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, boolean z, boolean z2) {
            return C59328zev.createClassicTypeCheckerState$default(z, z2, interfaceC59282zeB, null, null, 24, null);
        }

        public static InterfaceC59382zfw EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59331zey) {
                return C59283zeC.KWHzl((AbstractC59331zey) interfaceC59382zfw);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static boolean EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59377zfr interfaceC59377zfr) {
            Intrinsics.checkNotNullParameter(interfaceC59377zfr, "");
            if (interfaceC59377zfr instanceof C59288zeH) {
                return ((C59288zeH) interfaceC59377zfr).AYXKKw();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59377zfr + ", " + C56524yIo.AEQbTJ(interfaceC59377zfr.getClass())).toString());
        }

        public static CaptureStatus AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59377zfr interfaceC59377zfr) {
            Intrinsics.checkNotNullParameter(interfaceC59377zfr, "");
            if (interfaceC59377zfr instanceof C59288zeH) {
                return ((C59288zeH) interfaceC59377zfr).valueOf();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59377zfr + ", " + C56524yIo.AEQbTJ(interfaceC59377zfr.getClass())).toString());
        }

        public static boolean copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59377zfr interfaceC59377zfr) {
            Intrinsics.checkNotNullParameter(interfaceC59377zfr, "");
            return interfaceC59377zfr instanceof yYW;
        }

        public static boolean AhwBna(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return C59322zep.valueOf((AbstractC59233zdF) interfaceC59382zfw);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59380zfu KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59373zfn interfaceC59373zfn) {
            Intrinsics.checkNotNullParameter(interfaceC59373zfn, "");
            if (interfaceC59373zfn instanceof C59265zdl) {
                return ((C59265zdl) interfaceC59373zfn).AhwBna();
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59373zfn + ", " + C56524yIo.AEQbTJ(interfaceC59373zfn.getClass())).toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zfu */
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59380zfu interfaceC59380zfu) {
            Intrinsics.checkNotNullParameter(interfaceC59380zfu, "");
            if (interfaceC59380zfu instanceof AbstractC59233zdF) {
                return AbstractC56640yMw.fetchVPNInfo((AbstractC59233zdF) interfaceC59380zfu);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59380zfu + ", " + C56524yIo.AEQbTJ(interfaceC59380zfu.getClass())).toString());
        }

        public static boolean OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull C56933yXs c56933yXs) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            Intrinsics.checkNotNullParameter(c56933yXs, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return ((AbstractC59233zdF) interfaceC59382zfw).copydefault().copydefault(c56933yXs);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static InterfaceC59383zfx copydefault(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                if (interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt) {
                    return (InterfaceC56691yOt) interfaceC56663yNsOLrzqt;
                }
                return null;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean valueOf(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsOLrzqt : null;
                return (interfaceC56658yNn != null ? interfaceC56658yNn.iwGUEr() : null) instanceof yNL;
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static InterfaceC59382zfw EZpvd(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59383zfx interfaceC59383zfx) {
            Intrinsics.checkNotNullParameter(interfaceC59383zfx, "");
            if (interfaceC59383zfx instanceof InterfaceC56691yOt) {
                return C59336zfC.AEQbTJ((InterfaceC56691yOt) interfaceC59383zfx);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59383zfx + ", " + C56524yIo.AEQbTJ(interfaceC59383zfx.getClass())).toString());
        }

        public static InterfaceC59382zfw valueOf(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            if (interfaceC59382zfw instanceof AbstractC59233zdF) {
                return yYK.AEQbTJ((AbstractC59233zdF) interfaceC59382zfw);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59382zfw + ", " + C56524yIo.AEQbTJ(interfaceC59382zfw.getClass())).toString());
        }

        public static PrimitiveType AEQbTJ(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                Intrinsics.copydefault(interfaceC56663yNsOLrzqt, "");
                return AbstractC56640yMw.AEQbTJ(interfaceC56663yNsOLrzqt);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static PrimitiveType KWHzl(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                Intrinsics.copydefault(interfaceC56663yNsOLrzqt, "");
                return AbstractC56640yMw.OLrzqt(interfaceC56663yNsOLrzqt);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static boolean fetchVPNInfo(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                return interfaceC56663yNsOLrzqt != null && AbstractC56640yMw.KWHzl(interfaceC56663yNsOLrzqt);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        public static C56930yXp OLrzqt(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
            Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
            if (interfaceC59385zfz instanceof InterfaceC59315zei) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((InterfaceC59315zei) interfaceC59385zfz).OLrzqt();
                Intrinsics.copydefault(interfaceC56663yNsOLrzqt, "");
                return yZE.valueOf((InterfaceC56658yNn) interfaceC56663yNsOLrzqt);
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59385zfz + ", " + C56524yIo.AEQbTJ(interfaceC59385zfz.getClass())).toString());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.zfv */
        /* JADX WARN: Multi-variable type inference failed */
        public static TypeCheckerState.ActionBar valueOf(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59381zfv interfaceC59381zfv) {
            Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
            if (interfaceC59381zfv instanceof AbstractC59242zdO) {
                return new TaskDescription(interfaceC59282zeB, AbstractC59316zej.AEQbTJ.AEQbTJ((AbstractC59233zdF) interfaceC59381zfv).valueOf());
            }
            throw new java.lang.IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC59381zfv + ", " + C56524yIo.AEQbTJ(interfaceC59381zfv.getClass())).toString());
        }

        /* JADX INFO: renamed from: o.zeB$Application$TaskDescription */
        public static final class TaskDescription extends TypeCheckerState.ActionBar.Activity {
            public final /* synthetic */ InterfaceC59282zeB EZpvd;
            public final /* synthetic */ TypeSubstitutor copydefault;

            public TaskDescription(InterfaceC59282zeB interfaceC59282zeB, TypeSubstitutor typeSubstitutor) {
                this.EZpvd = interfaceC59282zeB;
                this.copydefault = typeSubstitutor;
            }

            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/reflect/jvm/internal/impl/types/TypeCheckerState;Lo/zfw;)Lo/zfv; */
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ActionBar
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public InterfaceC59380zfu OLrzqt(TypeCheckerState typeCheckerState, InterfaceC59382zfw interfaceC59382zfw) {
                Intrinsics.checkNotNullParameter(typeCheckerState, "");
                Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
                InterfaceC59282zeB interfaceC59282zeB = this.EZpvd;
                TypeSubstitutor typeSubstitutor = this.copydefault;
                java.lang.Object objFJNWhG = interfaceC59282zeB.fJNWhG(interfaceC59382zfw);
                Intrinsics.copydefault(objFJNWhG, "");
                AbstractC59233zdF abstractC59233zdFAEQbTJ = typeSubstitutor.AEQbTJ((AbstractC59233zdF) objFJNWhG, Variance.INVARIANT);
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
                InterfaceC59380zfu interfaceC59380zfuEZpvd = interfaceC59282zeB.OLrzqt(abstractC59233zdFAEQbTJ);
                Intrinsics.copydefault(interfaceC59380zfuEZpvd);
                return interfaceC59380zfuEZpvd;
            }
        }

        public static boolean values(@NotNull InterfaceC59282zeB interfaceC59282zeB, @NotNull InterfaceC59382zfw interfaceC59382zfw) {
            Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
            return (interfaceC59382zfw instanceof AbstractC59331zey) && (((AbstractC59331zey) interfaceC59382zfw).djBIcL() instanceof InterfaceC59297zeQ);
        }
    }
}
