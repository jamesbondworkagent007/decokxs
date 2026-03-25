package o;

import android.view.View;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33072mpZ {
    public static final InterfaceC58217yxC AEQbTJ(@NotNull final android.view.View view, long j, final int i, @NotNull final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.mqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C33072mpZ.AEQbTJ(view, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).OLrzqt(j, java.util.concurrent.TimeUnit.SECONDS, i);
        final Function1 function1 = new Function1() { // from class: o.mqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33072mpZ.KWHzl(i, onClickListener, view, (java.util.List) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C33072mpZ.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void AEQbTJ(android.view.View view, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.mqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C33072mpZ.copydefault(interfaceC58184ywW, view2);
            }
        });
    }

    public static final void copydefault(InterfaceC58184ywW interfaceC58184ywW, android.view.View view) {
        interfaceC58184ywW.onNext(Unit.INSTANCE);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(int i, View.OnClickListener onClickListener, android.view.View view, java.util.List list) {
        if (list.size() == i) {
            onClickListener.onClick(view);
        }
        return Unit.INSTANCE;
    }
}
