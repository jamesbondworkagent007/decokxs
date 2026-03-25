package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel$loadData$4$4 extends SuspendLambda implements Function2<ArrayList<CoinQuote>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupWatchListChildViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListChildViewModel$loadData$4$4(GroupWatchListChildViewModel groupWatchListChildViewModel, Continuation<? super GroupWatchListChildViewModel$loadData$4$4> continuation) {
        super(2, continuation);
        this.this$0 = groupWatchListChildViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupWatchListChildViewModel$loadData$4$4 groupWatchListChildViewModel$loadData$4$4 = new GroupWatchListChildViewModel$loadData$4$4(this.this$0, continuation);
        groupWatchListChildViewModel$loadData$4$4.L$0 = obj;
        return groupWatchListChildViewModel$loadData$4$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ArrayList<CoinQuote> arrayList, Continuation<? super Unit> continuation) {
        return ((GroupWatchListChildViewModel$loadData$4$4) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = (ArrayList) this.L$0;
            GroupWatchListChildViewModel groupWatchListChildViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel$loadData$4$4.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((GroupWatchListChildViewModel.TaskDescription) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((GroupWatchListChildViewModel.TaskDescription) obj2).EZpvd((InterfaceC49371unL<? extends List<CoinQuote>>) obj3);
                }
            };
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(arrayList);
            this.label = 1;
            if (groupWatchListChildViewModel.KWHzl(anonymousClass1, activity, this) == objCopydefault) {
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
}
