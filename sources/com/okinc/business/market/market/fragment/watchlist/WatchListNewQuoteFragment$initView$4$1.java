package com.okinc.business.market.market.fragment.watchlist;

import androidx.fragment.app.FragmentManager;
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
import o.kIH;
import o.kIJ;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$initView$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$initView$4$1(kIH kih, Continuation<? super WatchListNewQuoteFragment$initView$4$1> continuation) {
        super(2, continuation);
        this.this$0 = kih;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$initView$4$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$initView$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C55052xcf c55052xcf = this.this$0.values;
            if (c55052xcf != null) {
                c55052xcf.setSelected(true);
            }
            kIJ kijEZpvd = this.this$0.EZpvd();
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.label = 1;
            if (kijEZpvd.KWHzl(childFragmentManager, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C55052xcf c55052xcf2 = this.this$0.values;
        if (c55052xcf2 != null) {
            List<Pair<String, String>> listOLrzqt = C27953kJl.OLrzqt();
            kIH kih = this.this$0;
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(((Pair) next).getFirst(), (Object) kih.EZpvd().KWHzl())) {
                    break;
                }
            }
            Pair pair = (Pair) next;
            if (pair == null || (str = (String) pair.getSecond()) == null) {
                str = (String) ((Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(C27953kJl.OLrzqt())).getSecond();
            }
            c55052xcf2.setTitle(str);
        }
        C55052xcf c55052xcf3 = this.this$0.values;
        if (c55052xcf3 != null) {
            c55052xcf3.setSelected(false);
        }
        return Unit.INSTANCE;
    }
}
