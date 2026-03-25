package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C27953kJl;
import o.C55052xcf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.kIH;
import o.kIJ;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$onVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$onVisible$1(kIH kih, Continuation<? super WatchListNewQuoteFragment$onVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = kih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$onVisible$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$onVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.DbNXlk();
            kIH kih = this.this$0;
            kIJ kijEZpvd = kih.EZpvd();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (kih.EZpvd(kijEZpvd, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C55052xcf c55052xcf = this.this$0.values;
        if (c55052xcf != null) {
            List<Pair<String, String>> listOLrzqt = C27953kJl.OLrzqt();
            kIH kih2 = this.this$0;
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd(((Pair) next).getFirst(), (Object) kih2.EZpvd().KWHzl())) {
                    obj2 = next;
                    break;
                }
            }
            Pair pair = (Pair) obj2;
            if (pair == null || (str = (String) pair.getSecond()) == null) {
                str = (String) ((Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(C27953kJl.OLrzqt())).getSecond();
            }
            c55052xcf.setTitle(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.WatchListNewQuoteFragment$onVisible$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<kIJ.StateListAnimator, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ kIH this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kIH kih, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kih;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kIJ.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl((InterfaceC49371unL<? extends List<? extends Pair<CoinQuote, ? extends MarketDataSource>>>) ((kIJ.StateListAnimator) this.L$0).copydefault());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
