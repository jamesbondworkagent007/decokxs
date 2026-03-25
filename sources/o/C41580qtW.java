package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.SwapInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41580qtW implements InterfaceC49405unt<java.util.List<? extends BizInstrument>, java.util.List<? extends BizInstrument>> {
    public final C41577qtT<BizInstrument> copydefault;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41580qtW(@NotNull C41577qtT<BizInstrument> c41577qtT) {
        Intrinsics.checkNotNullParameter(c41577qtT, "");
        this.copydefault = c41577qtT;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizInstrument> KWHzl(@NotNull java.util.List<? extends BizInstrument> list) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    public static final CountDownInfo OLrzqt(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        if ((bizInstrument instanceof SpotInstrument) || (bizInstrument instanceof SwapInstrument)) {
            return bizInstrument.getCountDownInfo();
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.util.List<BizInstrument> AEQbTJ(@NotNull java.util.List<? extends BizInstrument> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (java.util.List) this.copydefault.copydefault(C56390yDp.OLrzqt(list, new Function1() { // from class: o.qtX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41580qtW.OLrzqt((BizInstrument) obj);
            }
        }));
    }
}
