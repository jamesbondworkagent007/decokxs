package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchListQueryUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40489qXt extends AbstractC49400uno<Unit, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C40489qXt(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qXt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qXt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> continuation) throws java.lang.Throwable {
        WatchListQueryUseCase$onExecute$1 watchListQueryUseCase$onExecute$1;
        C40489qXt c40489qXt;
        WatchListQueryUseCase$onExecute$1 watchListQueryUseCase$onExecute$12;
        C40489qXt c40489qXt2;
        java.util.Iterator it;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.Iterator it2;
        if (continuation instanceof WatchListQueryUseCase$onExecute$1) {
            watchListQueryUseCase$onExecute$1 = (WatchListQueryUseCase$onExecute$1) continuation;
            int i = watchListQueryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListQueryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListQueryUseCase$onExecute$1 = new WatchListQueryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object userFavoritesByUserId$default = watchListQueryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListQueryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(userFavoritesByUserId$default);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            watchListQueryUseCase$onExecute$1.L$0 = this;
            watchListQueryUseCase$onExecute$1.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, watchListQueryUseCase$onExecute$1, 3, null) == objCopydefault) {
                return objCopydefault;
            }
            c40489qXt = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(userFavoritesByUserId$default);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    it2 = ((java.util.List) userFavoritesByUserId$default).iterator();
                    while (it2.hasNext()) {
                        BizInstrument bizInstrumentKWHzl = qWJ.KWHzl(qWJ.EZpvd((MarketUserFavorite) it2.next()));
                        if (bizInstrumentKWHzl != null) {
                            arrayList.add(bizInstrumentKWHzl);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (java.lang.Object obj : arrayList) {
                        java.lang.String instType = ((BizInstrument) obj).getInstType();
                        java.lang.Object arrayList2 = linkedHashMap.get(instType);
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                            linkedHashMap.put(instType, arrayList2);
                        }
                        ((java.util.List) arrayList2).add(obj);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
                        for (java.lang.Object obj2 : iterable) {
                            linkedHashMap3.put(((BizInstrument) obj2).getInstId(), obj2);
                        }
                        linkedHashMap2.put(key, linkedHashMap3);
                    }
                    return linkedHashMap2;
                }
                it = (java.util.Iterator) watchListQueryUseCase$onExecute$1.L$1;
                c40489qXt2 = (C40489qXt) watchListQueryUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(userFavoritesByUserId$default);
                watchListQueryUseCase$onExecute$12 = watchListQueryUseCase$onExecute$1;
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) != null) {
                        watchListQueryUseCase$onExecute$12.L$0 = c40489qXt2;
                        watchListQueryUseCase$onExecute$12.L$1 = it;
                        watchListQueryUseCase$onExecute$12.label = 2;
                        if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, watchListQueryUseCase$onExecute$12) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                qWQ qwq = c40489qXt2.AEQbTJ;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                watchListQueryUseCase$onExecute$12.L$0 = null;
                watchListQueryUseCase$onExecute$12.L$1 = null;
                watchListQueryUseCase$onExecute$12.label = 3;
                userFavoritesByUserId$default = InterfaceC40459qWq.ActionBar.getUserFavoritesByUserId$default(qwq, strKWHzl, null, watchListQueryUseCase$onExecute$12, 2, null);
                if (userFavoritesByUserId$default == objCopydefault) {
                    return objCopydefault;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                it2 = ((java.util.List) userFavoritesByUserId$default).iterator();
                while (it2.hasNext()) {
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                while (r2.hasNext()) {
                }
                LinkedHashMap linkedHashMap22 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap4.size()));
                while (r1.hasNext()) {
                }
                return linkedHashMap22;
            }
            c40489qXt = (C40489qXt) watchListQueryUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(userFavoritesByUserId$default);
            ((Result) userFavoritesByUserId$default).m7386unboximpl();
        }
        watchListQueryUseCase$onExecute$12 = watchListQueryUseCase$onExecute$1;
        c40489qXt2 = c40489qXt;
        it = yDY.gEmmrt("SPOT", "FUTURES", "SWAP", "OPTION").iterator();
        while (it.hasNext()) {
        }
        qWQ qwq2 = c40489qXt2.AEQbTJ;
        java.lang.String strKWHzl2 = C55686xod.KWHzl();
        watchListQueryUseCase$onExecute$12.L$0 = null;
        watchListQueryUseCase$onExecute$12.L$1 = null;
        watchListQueryUseCase$onExecute$12.label = 3;
        userFavoritesByUserId$default = InterfaceC40459qWq.ActionBar.getUserFavoritesByUserId$default(qwq2, strKWHzl2, null, watchListQueryUseCase$onExecute$12, 2, null);
        if (userFavoritesByUserId$default == objCopydefault) {
        }
        java.util.ArrayList arrayList32 = new java.util.ArrayList();
        it2 = ((java.util.List) userFavoritesByUserId$default).iterator();
        while (it2.hasNext()) {
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
        while (r2.hasNext()) {
        }
        LinkedHashMap linkedHashMap222 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap42.size()));
        while (r1.hasNext()) {
        }
        return linkedHashMap222;
    }
}
