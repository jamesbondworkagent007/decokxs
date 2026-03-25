package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41609qtz implements InterfaceC49405unt<TickersData, java.lang.Double> {
    public final InterfaceC46557tYt OLrzqt;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Double OLrzqt(TickersData tickersData) {
        return (java.lang.Double) InterfaceC49405unt.Activity.EZpvd(this, tickersData);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    @yCM
    public C41609qtz(@NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.OLrzqt = interfaceC46557tYt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public java.lang.Double AEQbTJ(TickersData tickersData) {
        if (tickersData != null) {
            return EZpvd(tickersData);
        }
        return null;
    }

    public final java.lang.Double EZpvd(TickersData tickersData) {
        java.lang.String strOLrzqt = this.OLrzqt.OLrzqt(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8());
        if (tickersData.getLast().length() == 0) {
            return null;
        }
        return java.lang.Double.valueOf(C33129mqd.divD$default(C33129mqd.subS$default(tickersData.getLast(), strOLrzqt, null, null, null, 14, null), strOLrzqt, 4, null, RoundingMode.HALF_UP, 4, null));
    }
}
