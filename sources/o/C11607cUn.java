package o;

import com.okinc.business.defi.biz.ext.RxExtKt$asFlow$1;
import com.okinc.business.defi.biz.ext.RxExtKt$asFlowNullable$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11607cUn {
    public static final Function1<java.lang.Object, Unit> EZpvd = new Function1() { // from class: o.cUo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C11607cUn.copydefault(obj);
        }
    };
    public static final Function1<java.lang.Throwable, Unit> OLrzqt = new Function1() { // from class: o.cUk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C11607cUn.OLrzqt((java.lang.Throwable) obj);
        }
    };
    public static final Function0<Unit> AEQbTJ = new Function0() { // from class: o.cUr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11607cUn.copydefault();
        }
    };

    public static final Unit copydefault(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static final <T> AbstractC58185ywX<T> AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58260yxt<T> valueOf(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.KWHzl(cUD.KWHzl.OLrzqt()).OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58260yxt abstractC58260yxt, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = OLrzqt;
        }
        if ((i & 2) != 0) {
            function12 = EZpvd;
        }
        return OLrzqt(abstractC58260yxt, (Function1<? super java.lang.Throwable, Unit>) function1, function12);
    }

    public static final <T> InterfaceC58217yxC OLrzqt(@NotNull AbstractC58260yxt<T> abstractC58260yxt, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function1<? super T, Unit> function12) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return yBI.KWHzl(valueOf(abstractC58260yxt), function1, function12);
    }

    public static final <T> AbstractC58260yxt<java.util.List<T>> KWHzl(@NotNull java.util.List<? extends AbstractC58260yxt<T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58260yxt<java.util.List<T>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(yDY.AhwBna());
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        final Function1 function1 = new Function1() { // from class: o.cUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11607cUn.AEQbTJ((java.lang.Object[]) obj);
            }
        };
        AbstractC58260yxt<java.util.List<T>> abstractC58260yxtEZpvd = AbstractC58260yxt.EZpvd(list, new InterfaceC58229yxO() { // from class: o.cUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11607cUn.copydefault(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtEZpvd);
        return abstractC58260yxtEZpvd;
    }

    public static final java.util.List copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return yDV.AwvSrB(objArr);
    }

    public static final <T> AbstractC58185ywX<java.util.List<T>> copydefault(@NotNull java.util.List<? extends AbstractC58185ywX<T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58185ywX<java.util.List<T>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        final Function1 function1 = new Function1() { // from class: o.cUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11607cUn.EZpvd((java.lang.Object[]) obj);
            }
        };
        AbstractC58185ywX<java.util.List<T>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(list, new InterfaceC58229yxO() { // from class: o.cUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11607cUn.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return yDV.AwvSrB(objArr);
    }

    public static final AbstractC58177ywP AEQbTJ(@NotNull AbstractC58177ywP abstractC58177ywP) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        AbstractC58177ywP abstractC58177ywPCopydefault = abstractC58177ywP.AEQbTJ(cUD.KWHzl.OLrzqt()).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPCopydefault, "");
        return abstractC58177ywPCopydefault;
    }

    public static /* synthetic */ InterfaceC58217yxC subscribeOnIO$default(AbstractC58177ywP abstractC58177ywP, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = OLrzqt;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        return OLrzqt(abstractC58177ywP, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0);
    }

    public static final InterfaceC58217yxC OLrzqt(@NotNull AbstractC58177ywP abstractC58177ywP, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractC58177ywP, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return yBI.KWHzl(AEQbTJ(abstractC58177ywP), function1, function0);
    }

    public static final <T> AbstractC58185ywX<T> EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(cUD.KWHzl.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> copydefault(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(yBP.KWHzl());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58185ywX<T> KWHzl(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ InterfaceC58217yxC observeOnMainThreadBy$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = OLrzqt;
        }
        if ((i & 2) != 0) {
            function0 = AEQbTJ;
        }
        return OLrzqt((AbstractC58185ywX<?>) abstractC58185ywX, (Function1<? super java.lang.Throwable, Unit>) function1, (Function0<Unit>) function0);
    }

    public static final InterfaceC58217yxC OLrzqt(@NotNull AbstractC58185ywX<?> abstractC58185ywX, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX<?> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return yBI.subscribeBy$default(abstractC58185ywXKWHzl, function1, function0, (Function1) null, 4, (java.lang.Object) null);
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX<T> abstractC58185ywXKWHzl = abstractC58185ywX.KWHzl(yBP.EZpvd());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final <T> AbstractC58260yxt<T> EZpvd(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.OLrzqt(cUD.KWHzl.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final <T> AbstractC58260yxt<T> AEQbTJ(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.OLrzqt(yBP.KWHzl());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final <T> AbstractC58260yxt<T> KWHzl(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        AbstractC58260yxt<T> abstractC58260yxtOLrzqt = abstractC58260yxt.OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final <T> Flow<T> copydefault(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        return FlowKt.callbackFlow(new RxExtKt$asFlow$1(abstractC58260yxt, null));
    }

    public static final <T> Flow<T> OLrzqt(@NotNull AbstractC58260yxt<T> abstractC58260yxt) {
        Intrinsics.checkNotNullParameter(abstractC58260yxt, "");
        return FlowKt.callbackFlow(new RxExtKt$asFlowNullable$1(abstractC58260yxt, null));
    }
}
