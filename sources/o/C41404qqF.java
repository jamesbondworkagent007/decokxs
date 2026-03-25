package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41583qtZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41404qqF extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.Map<java.lang.String, ? extends TickersData>>, java.util.List<? extends InterfaceC41583qtZ>> {
    public final C41609qtz KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.Map<java.lang.String, TickersData>>) obj, (Continuation<? super java.util.List<? extends InterfaceC41583qtZ>>) continuation);
    }

    @yCM
    public C41404qqF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41609qtz c41609qtz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41609qtz, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c41609qtz;
    }

    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.Map<java.lang.String, TickersData>> pair, @NotNull Continuation<? super java.util.List<? extends InterfaceC41583qtZ>> continuation) {
        java.util.List<? extends InterfaceC41583qtZ> listComponent1 = pair.component1();
        final java.util.Map<java.lang.String, TickersData> mapComponent2 = pair.component2();
        C41434qqj.KWHzl.AEQbTJ("ApplyCoinTickerUseCase", "input size: " + listComponent1.size() + ", tickers size: " + mapComponent2.size());
        return C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41404qqF.copydefault(this.EZpvd, mapComponent2, (InterfaceC41583qtZ) obj);
            }
        });
    }

    public static final InterfaceC41583qtZ copydefault(C41404qqF c41404qqF, java.util.Map map, InterfaceC41583qtZ interfaceC41583qtZ) {
        Intrinsics.checkNotNullParameter(interfaceC41583qtZ, "");
        return c41404qqF.OLrzqt(interfaceC41583qtZ, map);
    }

    public final InterfaceC41583qtZ OLrzqt(InterfaceC41583qtZ interfaceC41583qtZ, java.util.Map<java.lang.String, TickersData> map) {
        TickersData tickersData = map.get(interfaceC41583qtZ.djBIcL().getSymbol());
        return tickersData == null ? interfaceC41583qtZ : InterfaceC41583qtZ.Activity.onCopy$default(interfaceC41583qtZ, (java.lang.Double) this.KWHzl.OLrzqt(tickersData), C33129mqd.EZpvd(tickersData.getLast()), null, 4, null);
    }
}
