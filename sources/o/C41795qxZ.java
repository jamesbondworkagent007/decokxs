package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41791qxV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41795qxZ<T extends InterfaceC41791qxV<T>> extends AbstractC49400uno<Triple<? extends java.util.List<? extends T>, ? extends java.util.Map<java.lang.String, ? extends TickersData>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>, java.util.List<? extends T>> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41795qxZ(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Triple<? extends java.util.List<? extends T>, ? extends java.util.Map<java.lang.String, TickersData>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> triple, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        java.util.List<? extends T> listComponent1 = triple.component1();
        final java.util.Map<java.lang.String, TickersData> mapComponent2 = triple.component2();
        final java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> mapComponent3 = triple.component3();
        return C56390yDp.OLrzqt(C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41795qxZ.KWHzl(mapComponent2, mapComponent3, (InterfaceC41791qxV) obj);
            }
        }), C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis())).getFirst();
    }

    public static final InterfaceC41791qxV KWHzl(java.util.Map map, java.util.Map map2, InterfaceC41791qxV interfaceC41791qxV) {
        java.util.Map map3;
        java.util.Map map4;
        TickersData tickersData;
        Intrinsics.checkNotNullParameter(interfaceC41791qxV, "");
        BizInstrument bizInstrument = null;
        InterfaceC41791qxV interfaceC41791qxVCopydefault = C40376qTo.copydefault(interfaceC41791qxV, (map == null || (tickersData = (TickersData) map.get(interfaceC41791qxV.KWHzl().getInstId())) == null) ? null : C40378qTq.OLrzqt(tickersData));
        if (interfaceC41791qxVCopydefault instanceof C39994qFk) {
            C39994qFk c39994qFk = (C39994qFk) interfaceC41791qxVCopydefault;
            if (map2 != null && (map4 = (java.util.Map) map2.get(interfaceC41791qxV.KWHzl().getInstType())) != null) {
                bizInstrument = (BizInstrument) map4.get(interfaceC41791qxV.KWHzl().getInstId());
            }
            c39994qFk.valueOf(bizInstrument != null);
        } else if (interfaceC41791qxVCopydefault instanceof C40005qFv) {
            C40005qFv c40005qFv = (C40005qFv) interfaceC41791qxVCopydefault;
            if (map2 != null && (map3 = (java.util.Map) map2.get(interfaceC41791qxV.KWHzl().getInstType())) != null) {
                bizInstrument = (BizInstrument) map3.get(interfaceC41791qxV.KWHzl().getInstId());
            }
            c40005qFv.copydefault(bizInstrument != null);
        }
        return interfaceC41791qxVCopydefault;
    }
}
