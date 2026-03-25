package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.traderadar.ui.model.TradeRadarType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40905qgk implements InterfaceC49405unt<Unit, java.util.List<? extends TradeRadarType>> {
    @yCM
    public C40905qgk() {
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<TradeRadarType> EZpvd(@NotNull Unit unit) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, unit);
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
    public java.util.List<TradeRadarType> AEQbTJ(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(TradeRadarType.ALL);
        arrayList.add(TradeRadarType.WHALE);
        arrayList.add(TradeRadarType.PRICE_SURGE);
        arrayList.add(TradeRadarType.UNLOCKS);
        arrayList.add(TradeRadarType.TRADERS);
        return arrayList;
    }
}
