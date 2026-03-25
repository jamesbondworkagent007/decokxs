package com.okinc.business.market.features.watch_list_groups.ui.viewmodel;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27764kCm;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC26239jXb;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WatchlistGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupViewModel$loadData$1(WatchlistGroupViewModel watchlistGroupViewModel, Continuation<? super WatchlistGroupViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = watchlistGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistGroupViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27764kCm c27764kCm = this.this$0.djBIcL;
            this.label = 1;
            objCopydefault = c27764kCm.copydefault(true, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        WatchlistGroupViewModel watchlistGroupViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            List list = (List) objCopydefault;
            if (!(true ^ list.isEmpty())) {
                watchlistGroupViewModel.EZpvd.setValue(InterfaceC26239jXb.TaskDescription.KWHzl);
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(watchlistGroupViewModel.AhwBna.OLrzqt((CommonGroupData) it.next()));
                }
                watchlistGroupViewModel.EZpvd.setValue(new InterfaceC26239jXb.ActionBar(arrayList));
            }
        }
        WatchlistGroupViewModel watchlistGroupViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            watchlistGroupViewModel2.EZpvd.setValue(InterfaceC26239jXb.Application.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
