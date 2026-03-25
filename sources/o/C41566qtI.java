package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41566qtI implements InterfaceC49405unt<java.util.List<? extends SwapInstrument>, kotlin.Pair<? extends java.util.List<? extends SwapInstrument>, ? extends java.util.List<? extends SwapInstrument>>> {
    public final C41563qtF<SwapInstrument> AEQbTJ;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41566qtI(@NotNull C41563qtF<SwapInstrument> c41563qtF) {
        Intrinsics.checkNotNullParameter(c41563qtF, "");
        this.AEQbTJ = c41563qtF;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public kotlin.Pair<java.util.List<SwapInstrument>, java.util.List<SwapInstrument>> KWHzl(@NotNull java.util.List<SwapInstrument> list) {
        return (kotlin.Pair) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    public static final CountDownInfo OLrzqt(SwapInstrument swapInstrument) {
        Intrinsics.checkNotNullParameter(swapInstrument, "");
        return swapInstrument.getCountDownInfo();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.util.List<SwapInstrument>, java.util.List<SwapInstrument>> AEQbTJ(@NotNull java.util.List<SwapInstrument> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (kotlin.Pair) this.AEQbTJ.OLrzqt((java.lang.Object) C56390yDp.OLrzqt(list, new Function1() { // from class: o.qtG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41566qtI.OLrzqt((SwapInstrument) obj);
            }
        }));
    }
}
