package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41008qih implements InterfaceC49405unt<Unit, java.util.List<? extends C40998qiX>> {
    @yCM
    public C41008qih() {
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

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<C40998qiX> KWHzl(@NotNull Unit unit) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, unit);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.util.List<C40998qiX> AEQbTJ(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new C40998qiX(TradingCalendarType.ALL));
        arrayList.add(new C40998qiX(TradingCalendarType.ECONOMIC));
        arrayList.add(new C40998qiX(TradingCalendarType.TOKEN_UNLOCK));
        return arrayList;
    }
}
