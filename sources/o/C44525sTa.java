package o;

import com.okinc.okimcore.utils.RxUtil$createFlowableWithSuspend$1$1;
import io.reactivex.BackpressureStrategy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44525sTa {
    public static final C44525sTa copydefault = new C44525sTa();

    private C44525sTa() {
    }

    public final <T> AbstractC58185ywX<T> EZpvd(@NotNull final Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<T> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.sTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C44525sTa.OLrzqt(function1, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void OLrzqt(Function1 function1, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(sDN.copydefault.copydefault()), null, null, new RxUtil$createFlowableWithSuspend$1$1(function1, interfaceC58184ywW, null), 3, null);
    }
}
