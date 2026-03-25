package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40428qVm implements InterfaceC49405unt<java.util.List<? extends java.lang.String>, Flow<? extends java.util.List<? extends TickersData>>> {
    public final C40425qVj OLrzqt;

    @yCM
    public C40428qVm(@NotNull C40425qVj c40425qVj) {
        Intrinsics.checkNotNullParameter(c40425qVj, "");
        this.OLrzqt = c40425qVj;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Flow<java.util.List<TickersData>> OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        return (Flow) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Flow<java.util.List<TickersData>> AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return this.OLrzqt.AEQbTJ(list, "tickers-3s");
    }
}
