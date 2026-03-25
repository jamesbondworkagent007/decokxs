package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27494jwJ {
    public static final C27494jwJ AEQbTJ = new C27494jwJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean KWHzl(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return java.lang.Boolean.TRUE;
    }

    private C27494jwJ() {
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.jwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27494jwJ.KWHzl((xXO) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AhwBna(new InterfaceC58229yxO() { // from class: o.jwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C27494jwJ.gEmmrt(function1, obj);
            }
        }).AEQbTJ(java.lang.Boolean.FALSE);
        final Function1 function12 = new Function1() { // from class: o.jwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27494jwJ.AEQbTJ(function0, (java.lang.Boolean) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.jwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27494jwJ.AhwBna(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd KWHzl(xXO xxo) {
        Intrinsics.checkNotNullParameter(xxo, "");
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = C23580iBq.AEQbTJ.KWHzl();
        final Function1 function1 = new Function1() { // from class: o.jwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27494jwJ.OLrzqt((java.lang.Boolean) obj);
            }
        };
        return abstractC58185ywXKWHzl.valueOf(new InterfaceC58229yxO() { // from class: o.jwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C27494jwJ.valueOf(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtEZpvd = C23580iBq.AEQbTJ.EZpvd();
            final Function1 function1 = new Function1() { // from class: o.jwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27494jwJ.KWHzl((InterfaceC9738bbJ) obj);
                }
            };
            return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.jwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C27494jwJ.copydefault(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
    }

    public static final java.lang.Boolean copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function0 function0, java.lang.Boolean bool) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
