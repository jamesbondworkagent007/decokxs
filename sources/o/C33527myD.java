package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33527myD {
    public static final Function1<java.lang.Object, Unit> OLrzqt = new Function1() { // from class: o.myH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C33527myD.OLrzqt(obj);
        }
    };
    public static final Function1<java.lang.Throwable, Unit> copydefault = new Function1() { // from class: o.myF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C33527myD.EZpvd((java.lang.Throwable) obj);
        }
    };
    public static final Function0<Unit> EZpvd = new Function0() { // from class: o.myM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33527myD.OLrzqt();
        }
    };

    public static final Unit OLrzqt(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.KWHzl()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.EZpvd()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(yBP.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return KWHzl(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(KWHzl(abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnComputation$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return copydefault(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(EZpvd(abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnSingle$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return EZpvd(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(OLrzqt((AbstractC58185ywX) abstractC58185ywX), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnNewThread$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return OLrzqt(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(AEQbTJ(abstractC58185ywX), function1, function0, function12);
    }

    public static final <T> AbstractC58247yxg<T> KWHzl(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> EZpvd(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.KWHzl()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static final <T> AbstractC58247yxg<T> AEQbTJ(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.subscribeOn(yBP.OLrzqt()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return EZpvd(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC EZpvd(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(KWHzl(abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnComputation$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return OLrzqt(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(EZpvd(abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnSingle$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return copydefault(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC copydefault(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(copydefault((AbstractC58247yxg) abstractC58247yxg), function1, function0, function12);
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnNewThread$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return AEQbTJ(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC AEQbTJ(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(AEQbTJ(abstractC58247yxg), function1, function0, function12);
    }

    public static final <T> AbstractC58247yxg<T> OLrzqt(@NotNull AbstractC58247yxg<T> abstractC58247yxg) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        AbstractC58247yxg<T> abstractC58247yxgObserveOn = abstractC58247yxg.observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        return abstractC58247yxgObserveOn;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeByUI$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return KWHzl(abstractC58247yxg, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC KWHzl(@NotNull AbstractC58247yxg<T> abstractC58247yxg, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.copydefault(OLrzqt((AbstractC58247yxg) abstractC58247yxg), function1, function0, function12);
    }

    public static final <T> AbstractC58185ywX<T> copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeByUI$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = copydefault;
        }
        if ((i & 2) != 0) {
            function0 = EZpvd;
        }
        if ((i & 4) != 0) {
            function12 = OLrzqt;
        }
        return AEQbTJ(abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0, function12);
    }

    public static final <T> InterfaceC58217yxC AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(copydefault((AbstractC58185ywX) abstractC58185ywX), function1, function0, function12);
    }
}
