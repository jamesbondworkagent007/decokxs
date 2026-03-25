package o;

import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aYX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6922aYX {
    public final AbstractC58253yxm KWHzl;

    public C6922aYX(@NotNull AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        this.KWHzl = abstractC58253yxm;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.aYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C6922aYX.copydefault(function0, str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(this.KWHzl).KWHzl(this.KWHzl);
        final Function1 function1 = new Function1() { // from class: o.aYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6922aYX.AEQbTJ((java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.aYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6922aYX.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.aZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6922aYX.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.aZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C6922aYX.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void copydefault(Function0 function0, java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        try {
            function0.invoke();
            interfaceC58184ywW.onNext(str);
            interfaceC58184ywW.onComplete();
        } catch (java.lang.Throwable th) {
            interfaceC58184ywW.onError(th);
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
