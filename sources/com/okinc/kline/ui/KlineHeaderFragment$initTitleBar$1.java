package com.okinc.kline.ui;

import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C37943pGl;
import o.C38353pVq;
import o.C38685peB;
import o.C56391yDq;
import o.C56442yFn;
import o.oOS;
import o.pWP;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineHeaderFragment$initTitleBar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C38685peB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineHeaderFragment$initTitleBar$1(C38685peB c38685peB, Continuation<? super KlineHeaderFragment$initTitleBar$1> continuation) {
        super(2, continuation);
        this.this$0 = c38685peB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineHeaderFragment$initTitleBar$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineHeaderFragment$initTitleBar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Group group;
        RecyclerView recyclerView;
        C38353pVq c38353pVq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        C38353pVq c38353pVq2 = null;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C37943pGl.OLrzqt.OLrzqt();
            KlineHeaderFragment$initTitleBar$1$instList$1 klineHeaderFragment$initTitleBar$1$instList$1 = new KlineHeaderFragment$initTitleBar$1$instList$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherOLrzqt, klineHeaderFragment$initTitleBar$1$instList$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        List<pWP> listFJNWhG = (List) obj;
        this.this$0.AhwBna = (listFJNWhG.isEmpty() ^ true) && listFJNWhG.size() > 1;
        if (this.this$0.AhwBna) {
            C38685peB c38685peB = this.this$0;
            if ((listFJNWhG instanceof Collection) && listFJNWhG.isEmpty()) {
                pWP pwp = new pWP(this.this$0.QKVWgx(), this.this$0.ORxRYg(), null, null, null, 28, null);
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listFJNWhG);
                listFJNWhG.add(pwp);
                this.this$0.fIwbmz = listFJNWhG;
                c38353pVq = this.this$0.uzCIH;
                if (c38353pVq != null) {
                }
                c38353pVq2.AEQbTJ(listFJNWhG);
                this.this$0.wlaJM();
            } else {
                for (pWP pwp2 : listFJNWhG) {
                    if (Intrinsics.EZpvd((Object) pwp2.AEQbTJ(), (Object) c38685peB.QKVWgx()) && Intrinsics.EZpvd((Object) pwp2.KWHzl(), (Object) c38685peB.ORxRYg())) {
                        break;
                    }
                }
                pWP pwp3 = new pWP(this.this$0.QKVWgx(), this.this$0.ORxRYg(), null, null, null, 28, null);
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) listFJNWhG);
                listFJNWhG.add(pwp3);
                this.this$0.fIwbmz = listFJNWhG;
                c38353pVq = this.this$0.uzCIH;
                if (c38353pVq != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c38353pVq2 = c38353pVq;
                }
                c38353pVq2.AEQbTJ(listFJNWhG);
                this.this$0.wlaJM();
            }
        }
        oOS oos = this.this$0.valueOf;
        if (oos != null && (recyclerView = oos.fetchVPNInfo) != null) {
            recyclerView.setVisibility(this.this$0.AhwBna ? 0 : 8);
        }
        oOS oos2 = this.this$0.valueOf;
        if (oos2 != null && (group = oos2.copydefault) != null) {
            group.setVisibility(this.this$0.AhwBna ^ true ? 0 : 8);
        }
        return Unit.INSTANCE;
    }
}
