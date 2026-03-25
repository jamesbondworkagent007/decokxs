package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C27953kJl;
import o.C55052xcf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.kIH;
import o.kIJ;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$onCreate$2(kIH kih, Continuation<? super WatchListNewQuoteFragment$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = kih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$onCreate$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ kIH this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kIH kih, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kih;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            String str;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str2 = (String) this.L$0;
                C55052xcf c55052xcf = this.this$0.values;
                if (c55052xcf != null) {
                    Iterator<T> it = C27953kJl.OLrzqt().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd(((Pair) next).getFirst(), (Object) str2)) {
                            break;
                        }
                    }
                    Pair pair = (Pair) next;
                    if (pair == null || (str = (String) pair.getSecond()) == null) {
                        str = (String) ((Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(C27953kJl.OLrzqt())).getSecond();
                    }
                    c55052xcf.setTitle(str);
                }
                kIH kih = this.this$0;
                kIJ kijEZpvd = kih.EZpvd();
                C03772 c03772 = new C03772(this.this$0, null);
                this.label = 1;
                if (kih.EZpvd(kijEZpvd, c03772, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$2$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C03772 extends SuspendLambda implements Function2<kIJ.StateListAnimator, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ kIH this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03772(kIH kih, Continuation<? super C03772> continuation) {
                super(2, continuation);
                this.this$0 = kih;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03772 c03772 = new C03772(this.this$0, continuation);
                c03772.L$0 = obj;
                return c03772;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kIJ.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                return ((C03772) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC49371unL<List<Pair<CoinQuote, MarketDataSource>>> interfaceC49371unLCopydefault = ((kIJ.StateListAnimator) this.L$0).copydefault();
                    InterfaceC49371unL.Activity activity = interfaceC49371unLCopydefault instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) interfaceC49371unLCopydefault : null;
                    List list = activity != null ? (List) activity.copydefault() : null;
                    if (list != null) {
                        this.this$0.EZpvd((ArrayList<Pair<CoinQuote, MarketDataSource>>) new ArrayList(list));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            kIH kih = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(kih, kih.EZpvd(), new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onCreate$2.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((kIJ.StateListAnimator) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((kIJ.StateListAnimator) obj2).OLrzqt((String) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
