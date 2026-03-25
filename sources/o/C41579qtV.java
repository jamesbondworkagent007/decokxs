package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41579qtV implements InterfaceC49405unt<java.util.List<? extends SpotInstrument>, java.util.List<? extends SpotInstrument>> {
    public final C41577qtT<SpotInstrument> EZpvd;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41579qtV(@NotNull C41577qtT<SpotInstrument> c41577qtT) {
        Intrinsics.checkNotNullParameter(c41577qtT, "");
        this.EZpvd = c41577qtT;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* bridge */ /* synthetic */ java.util.List<? extends SpotInstrument> AEQbTJ(java.util.List<? extends SpotInstrument> list) {
        return AEQbTJ2((java.util.List<SpotInstrument>) list);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<SpotInstrument> EZpvd(@NotNull java.util.List<SpotInstrument> list) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, list);
    }

    public static final CountDownInfo copydefault(SpotInstrument spotInstrument) {
        Intrinsics.checkNotNullParameter(spotInstrument, "");
        return spotInstrument.getCountDownInfo();
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public java.util.List<SpotInstrument> AEQbTJ2(@NotNull java.util.List<SpotInstrument> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (java.util.List) this.EZpvd.copydefault(C56390yDp.OLrzqt(list, new Function1() { // from class: o.qtY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41579qtV.copydefault((SpotInstrument) obj);
            }
        }));
    }
}
