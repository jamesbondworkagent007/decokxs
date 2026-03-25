package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import o.InterfaceC59307zea;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59231zdD {
    public static final C59231zdD OLrzqt = new C59231zdD();
    public static final Function1<AbstractC59287zeG, AbstractC59242zdO> copydefault = Activity.AEQbTJ;

    /* JADX INFO: renamed from: o.zdD$Activity */
    public static final class Activity implements Function1 {
        public static final Activity AEQbTJ = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void invoke(AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC59242zdO EZpvd(@NotNull C59308zeb c59308zeb, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        return simpleType$default(c59308zeb, interfaceC59315zei, list, z, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    private C59231zdD() {
    }

    public final InterfaceC59098zad OLrzqt(InterfaceC59315zei interfaceC59315zei, java.util.List<? extends InterfaceC59317zek> list, AbstractC59287zeG abstractC59287zeG) {
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.OLrzqt();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
            return ((InterfaceC56691yOt) interfaceC56663yNsKWHzl).bQ_().OLrzqt();
        }
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
            if (abstractC59287zeG == null) {
                abstractC59287zeG = yZE.OLrzqt(yZE.AhwBna(interfaceC56663yNsKWHzl));
            }
            if (list.isEmpty()) {
                return C56720yPv.KWHzl((InterfaceC56658yNn) interfaceC56663yNsKWHzl, abstractC59287zeG);
            }
            return C56720yPv.EZpvd((InterfaceC56658yNn) interfaceC56663yNsKWHzl, AbstractC59316zej.AEQbTJ.copydefault(interfaceC59315zei, list), abstractC59287zeG);
        }
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56690yOs) {
            return C59370zfk.copydefault(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, ((InterfaceC56690yOs) interfaceC56663yNsKWHzl).bR_().toString());
        }
        if (interfaceC59315zei instanceof C59228zdA) {
            return ((C59228zdA) interfaceC59315zei).AEQbTJ();
        }
        throw new java.lang.IllegalStateException("Unsupported classifier: " + interfaceC56663yNsKWHzl + " for constructor: " + interfaceC59315zei);
    }

    public static /* synthetic */ AbstractC59242zdO simpleType$default(C59308zeb c59308zeb, InterfaceC59315zei interfaceC59315zei, java.util.List list, boolean z, AbstractC59287zeG abstractC59287zeG, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            abstractC59287zeG = null;
        }
        return copydefault(c59308zeb, interfaceC59315zei, (java.util.List<? extends InterfaceC59317zek>) list, z, abstractC59287zeG);
    }

    public static final AbstractC59242zdO copydefault(@NotNull C59308zeb c59308zeb, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z, AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (c59308zeb.OLrzqt() && list.isEmpty() && !z && interfaceC59315zei.OLrzqt() != null) {
            InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.OLrzqt();
            Intrinsics.copydefault(interfaceC56663yNsKWHzl);
            AbstractC59242zdO abstractC59242zdOBQ_ = interfaceC56663yNsKWHzl.bQ_();
            Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
            return abstractC59242zdOBQ_;
        }
        return KWHzl(c59308zeb, interfaceC59315zei, list, z, OLrzqt.OLrzqt(interfaceC59315zei, list, abstractC59287zeG), new C59236zdI(interfaceC59315zei, list, c59308zeb, z));
    }

    public static final AbstractC59242zdO EZpvd(InterfaceC59315zei interfaceC59315zei, java.util.List list, C59308zeb c59308zeb, boolean z, AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        Application applicationOLrzqt = OLrzqt.OLrzqt(interfaceC59315zei, abstractC59287zeG, (java.util.List<? extends InterfaceC59317zek>) list);
        if (applicationOLrzqt == null) {
            return null;
        }
        AbstractC59242zdO abstractC59242zdOEZpvd = applicationOLrzqt.EZpvd();
        if (abstractC59242zdOEZpvd != null) {
            return abstractC59242zdOEZpvd;
        }
        InterfaceC59315zei interfaceC59315zeiKWHzl = applicationOLrzqt.KWHzl();
        Intrinsics.copydefault(interfaceC59315zeiKWHzl);
        return copydefault(c59308zeb, interfaceC59315zeiKWHzl, (java.util.List<? extends InterfaceC59317zek>) list, z, abstractC59287zeG);
    }

    public static final AbstractC59242zdO KWHzl(@NotNull InterfaceC56690yOs interfaceC56690yOs, @NotNull java.util.List<? extends InterfaceC59317zek> list) {
        Intrinsics.checkNotNullParameter(interfaceC56690yOs, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C59253zdZ(InterfaceC59307zea.ActionBar.KWHzl, false).AEQbTJ(C59310zed.KWHzl.EZpvd(null, interfaceC56690yOs, list), C59308zeb.OLrzqt.copydefault());
    }

    public final Application OLrzqt(InterfaceC59315zei interfaceC59315zei, AbstractC59287zeG abstractC59287zeG, java.util.List<? extends InterfaceC59317zek> list) {
        InterfaceC56663yNs interfaceC56663yNsAEQbTJ;
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zei.OLrzqt();
        if (interfaceC56663yNsKWHzl == null || (interfaceC56663yNsAEQbTJ = abstractC59287zeG.AEQbTJ(interfaceC56663yNsKWHzl)) == null) {
            return null;
        }
        if (interfaceC56663yNsAEQbTJ instanceof InterfaceC56690yOs) {
            return new Application(KWHzl((InterfaceC56690yOs) interfaceC56663yNsAEQbTJ, list), null);
        }
        InterfaceC59315zei interfaceC59315zeiAEQbTJ = interfaceC56663yNsAEQbTJ.fJNWhG().AEQbTJ(abstractC59287zeG);
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiAEQbTJ, "");
        return new Application(null, interfaceC59315zeiAEQbTJ);
    }

    /* JADX INFO: renamed from: o.zdD$Application */
    public static final class Application {
        public final InterfaceC59315zei AEQbTJ;
        public final AbstractC59242zdO EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC59242zdO EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC59315zei KWHzl() {
            return this.AEQbTJ;
        }

        public Application(AbstractC59242zdO abstractC59242zdO, InterfaceC59315zei interfaceC59315zei) {
            this.EZpvd = abstractC59242zdO;
            this.AEQbTJ = interfaceC59315zei;
        }
    }

    public static final AbstractC59242zdO KWHzl(InterfaceC59315zei interfaceC59315zei, java.util.List list, C59308zeb c59308zeb, boolean z, InterfaceC59098zad interfaceC59098zad, AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        Application applicationOLrzqt = OLrzqt.OLrzqt(interfaceC59315zei, abstractC59287zeG, (java.util.List<? extends InterfaceC59317zek>) list);
        if (applicationOLrzqt == null) {
            return null;
        }
        AbstractC59242zdO abstractC59242zdOEZpvd = applicationOLrzqt.EZpvd();
        if (abstractC59242zdOEZpvd != null) {
            return abstractC59242zdOEZpvd;
        }
        InterfaceC59315zei interfaceC59315zeiKWHzl = applicationOLrzqt.KWHzl();
        Intrinsics.copydefault(interfaceC59315zeiKWHzl);
        return OLrzqt(c59308zeb, interfaceC59315zeiKWHzl, list, z, interfaceC59098zad);
    }

    public static final AbstractC59242zdO OLrzqt(@NotNull C59308zeb c59308zeb, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z, @NotNull InterfaceC59098zad interfaceC59098zad) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        C59247zdT c59247zdT = new C59247zdT(interfaceC59315zei, list, z, interfaceC59098zad, new C59237zdJ(interfaceC59315zei, list, c59308zeb, z, interfaceC59098zad));
        return c59308zeb.OLrzqt() ? c59247zdT : new C59244zdQ(c59247zdT, c59308zeb);
    }

    public static final AbstractC59242zdO KWHzl(@NotNull C59308zeb c59308zeb, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z, @NotNull InterfaceC59098zad interfaceC59098zad, @NotNull Function1<? super AbstractC59287zeG, ? extends AbstractC59242zdO> function1) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC59098zad, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C59247zdT c59247zdT = new C59247zdT(interfaceC59315zei, list, z, interfaceC59098zad, function1);
        return c59308zeb.OLrzqt() ? c59247zdT : new C59244zdQ(c59247zdT, c59308zeb);
    }

    public static final AbstractC59242zdO KWHzl(@NotNull C59308zeb c59308zeb, @NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.util.List<? extends InterfaceC59317zek> list) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC59315zei interfaceC59315zeiFJNWhG = interfaceC56658yNn.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return simpleType$default(c59308zeb, interfaceC59315zeiFJNWhG, (java.util.List) list, false, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    public static /* synthetic */ AbstractC59242zdO simpleType$default(AbstractC59242zdO abstractC59242zdO, C59308zeb c59308zeb, InterfaceC59315zei interfaceC59315zei, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c59308zeb = abstractC59242zdO.bX_();
        }
        if ((i & 4) != 0) {
            interfaceC59315zei = abstractC59242zdO.djBIcL();
        }
        if ((i & 8) != 0) {
            list = abstractC59242zdO.bY_();
        }
        if ((i & 16) != 0) {
            z = abstractC59242zdO.AEQbTJ();
        }
        return copydefault(abstractC59242zdO, c59308zeb, interfaceC59315zei, (java.util.List<? extends InterfaceC59317zek>) list, z);
    }

    public static final AbstractC59242zdO copydefault(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull C59308zeb c59308zeb, @NotNull InterfaceC59315zei interfaceC59315zei, @NotNull java.util.List<? extends InterfaceC59317zek> list, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(interfaceC59315zei, "");
        Intrinsics.checkNotNullParameter(list, "");
        return simpleType$default(c59308zeb, interfaceC59315zei, list, z, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
    }

    public static final AbstractC59331zey copydefault(@NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
        return Intrinsics.EZpvd(abstractC59242zdO, abstractC59242zdO2) ? abstractC59242zdO : new C59279zdz(abstractC59242zdO, abstractC59242zdO2);
    }

    public static final AbstractC59242zdO EZpvd(@NotNull C59308zeb c59308zeb, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        Intrinsics.checkNotNullParameter(integerLiteralTypeConstructor, "");
        return OLrzqt(c59308zeb, integerLiteralTypeConstructor, yDY.AhwBna(), z, C59370zfk.copydefault(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }
}
