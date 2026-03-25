package com.okinc.business.market.market.fragment.watchlist;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C27869kGi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListViewModel$selectType$1 extends SuspendLambda implements yHO<Pair<? extends Integer, ? extends String>, ArrayList<C27869kGi.ActionBar>, Continuation<? super Pair<? extends Integer, ? extends String>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListViewModel$selectType$1(Continuation<? super WatchListViewModel$selectType$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Integer, ? extends String> pair, ArrayList<C27869kGi.ActionBar> arrayList, Continuation<? super Pair<? extends Integer, ? extends String>> continuation) {
        return invoke2((Pair<Integer, String>) pair, arrayList, (Continuation<? super Pair<Integer, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<Integer, String> pair, ArrayList<C27869kGi.ActionBar> arrayList, Continuation<? super Pair<Integer, String>> continuation) {
        WatchListViewModel$selectType$1 watchListViewModel$selectType$1 = new WatchListViewModel$selectType$1(continuation);
        watchListViewModel$selectType$1.L$0 = pair;
        watchListViewModel$selectType$1.L$1 = arrayList;
        return watchListViewModel$selectType$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            ArrayList arrayList = (ArrayList) this.L$1;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(pair.getSecond(), (Object) ((C27869kGi.ActionBar) next).EZpvd())) {
                    break;
                }
            }
            C27869kGi.ActionBar actionBar = (C27869kGi.ActionBar) next;
            if (actionBar != null) {
                return new Pair(C56443yFo.AEQbTJ(arrayList.indexOf(actionBar)), actionBar.EZpvd());
            }
            return new Pair(C56443yFo.AEQbTJ(0), "ANY");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
