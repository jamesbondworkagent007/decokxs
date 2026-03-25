package com.okinc.kline.ui;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C38685peB;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC40387qTz;
import o.pFP;
import o.pUU;
import o.pWP;
import o.qTB;
import o.qWJ;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineHeaderFragment$initTitleBar$1$instList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends pWP>>, Object> {
    int label;
    final /* synthetic */ C38685peB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHeaderFragment$initTitleBar$1$instList$1(C38685peB c38685peB, Continuation<? super KlineHeaderFragment$initTitleBar$1$instList$1> continuation) {
        super(2, continuation);
        this.this$0 = c38685peB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineHeaderFragment$initTitleBar$1$instList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends pWP>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<pWP>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<pWP>> continuation) {
        return ((KlineHeaderFragment$initTitleBar$1$instList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null) && this.this$0.RJOkX().OLrzqt()) {
                    InterfaceC40387qTz interfaceC40387qTzCopydefault = ((qTB) C43251rlk.copydefault(qTB.class)).copydefault();
                    this.label = 1;
                    obj = InterfaceC40387qTz.Activity.queryWatchList$default(interfaceC40387qTzCopydefault, false, false, this, 3, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return this.this$0.DbNXlk();
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (!Intrinsics.EZpvd((Object) ((WatchListData) obj2).getInstType(), (Object) "COIN")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BizInstrument bizInstrumentKWHzl = qWJ.KWHzl((WatchListData) it.next());
                pWP pwp = bizInstrumentKWHzl != null ? new pWP(bizInstrumentKWHzl.getInstId(), bizInstrumentKWHzl.getInstType(), null, null, null, 28, null) : null;
                if (pwp != null) {
                    arrayList2.add(pwp);
                }
            }
            return (arrayList2.size() >= 2 || Intrinsics.EZpvd((Object) this.this$0.ORxRYg(), (Object) "OPTION")) ? arrayList2 : this.this$0.fetchVPNInfo();
        } catch (Exception e) {
            pUU.copydefault(this.this$0.getTAG(), "initTitleBar: " + e.getMessage());
            return yDY.AhwBna();
        }
    }
}
