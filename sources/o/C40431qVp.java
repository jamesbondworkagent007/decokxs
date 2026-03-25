package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40431qVp implements InterfaceC49405unt<Flow<? extends java.util.List<? extends BizInstrument>>, Flow<? extends java.util.List<? extends TickersData>>> {
    public final C40423qVh EZpvd;

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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Flow<java.util.List<TickersData>> OLrzqt(@NotNull Flow<? extends java.util.List<? extends BizInstrument>> flow) {
        return (Flow) InterfaceC49405unt.Activity.EZpvd(this, flow);
    }

    @yCM
    public C40431qVp(@NotNull C40423qVh c40423qVh) {
        Intrinsics.checkNotNullParameter(c40423qVh, "");
        this.EZpvd = c40423qVh;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public Flow<java.util.List<TickersData>> AEQbTJ(@NotNull Flow<? extends java.util.List<? extends BizInstrument>> flow) {
        Intrinsics.checkNotNullParameter(flow, "");
        return this.EZpvd.AEQbTJ(flow);
    }
}
