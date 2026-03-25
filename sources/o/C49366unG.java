package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49366unG {
    public static final <T extends InterfaceC49369unJ<T>, V> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull final InterfaceC56554yJr<T, V> interfaceC56554yJr, final V v, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = abstractC49411unz.copydefault(new Function1() { // from class: o.unP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49366unG.copydefault(interfaceC56554yJr, v, (InterfaceC49369unJ) obj);
            }
        }, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static final InterfaceC49369unJ copydefault(InterfaceC56554yJr interfaceC56554yJr, java.lang.Object obj, InterfaceC49369unJ interfaceC49369unJ) {
        Intrinsics.checkNotNullParameter(interfaceC49369unJ, "");
        InterfaceC49369unJ interfaceC49369unJ2 = (InterfaceC49369unJ) interfaceC49369unJ.replica();
        interfaceC56554yJr.set(interfaceC49369unJ2, obj);
        return interfaceC49369unJ2;
    }

    public static final <T extends InterfaceC49369unJ<T>, V1, V2> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull final kotlin.Pair<? extends InterfaceC56554yJr<T, V1>, ? extends V1> pair, @NotNull final kotlin.Pair<? extends InterfaceC56554yJr<T, V2>, ? extends V2> pair2, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = abstractC49411unz.copydefault(new Function1() { // from class: o.unO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49366unG.AEQbTJ(pair, pair2, (InterfaceC49369unJ) obj);
            }
        }, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static final InterfaceC49369unJ AEQbTJ(kotlin.Pair pair, kotlin.Pair pair2, InterfaceC49369unJ interfaceC49369unJ) {
        Intrinsics.checkNotNullParameter(interfaceC49369unJ, "");
        InterfaceC49369unJ interfaceC49369unJ2 = (InterfaceC49369unJ) interfaceC49369unJ.replica();
        ((InterfaceC56554yJr) pair.getFirst()).set(interfaceC49369unJ2, pair.getSecond());
        ((InterfaceC56554yJr) pair2.getFirst()).set(interfaceC49369unJ2, pair2.getSecond());
        return interfaceC49369unJ2;
    }

    public static final <T extends InterfaceC49369unJ<T>> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull final Function1<? super T, ? extends T> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = abstractC49411unz.copydefault(new Function1() { // from class: o.unI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49366unG.copydefault(function1, (InterfaceC49369unJ) obj);
            }
        }, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public static final InterfaceC49369unJ copydefault(Function1 function1, InterfaceC49369unJ interfaceC49369unJ) {
        Intrinsics.checkNotNullParameter(interfaceC49369unJ, "");
        return (InterfaceC49369unJ) function1.invoke(interfaceC49369unJ);
    }
}
