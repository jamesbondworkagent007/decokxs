package com.okinc.planet.biz_positions;

import androidx.lifecycle.Lifecycle;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.AbstractC46197tLk;
import o.C46055tGd;
import o.C46074tGw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46072tGu;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsViewModel$loadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $this_loadData;
    final /* synthetic */ String $uniqueName;
    Object L$0;
    int label;
    final /* synthetic */ C46055tGd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsViewModel$loadData$2(C46055tGd c46055tGd, String str, Lifecycle lifecycle, Continuation<? super ProfilePositionsViewModel$loadData$2> continuation) {
        super(2, continuation);
        this.this$0 = c46055tGd;
        this.$uniqueName = str;
        this.$this_loadData = lifecycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfilePositionsViewModel$loadData$2(this.this$0, this.$uniqueName, this.$this_loadData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsViewModel$loadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C46055tGd c46055tGd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46074tGw c46074tGw = this.this$0.values;
            C46074tGw.Application application = new C46074tGw.Application(this.$uniqueName, null);
            this.label = 1;
            obj = c46074tGw.KWHzl(application, (Continuation) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c46055tGd = (C46055tGd) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c46055tGd.AkhnZx = (Job) obj;
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        InterfaceC46072tGu.StateListAnimator stateListAnimator = (InterfaceC46072tGu.StateListAnimator) pair.component1();
        List list = (List) pair.component2();
        this.this$0.AEQbTJ = stateListAnimator;
        this.this$0.EZpvd.setValue(AbstractC46197tLk.Companion.KWHzl(list));
        if (this.this$0.isConnected.gEmmrt() && this.this$0.AkhnZx == null) {
            C46055tGd c46055tGd2 = this.this$0;
            Lifecycle lifecycle = this.$this_loadData;
            this.L$0 = c46055tGd2;
            this.label = 2;
            Object objKWHzl = c46055tGd2.KWHzl(lifecycle, (Continuation<? super Job>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c46055tGd = c46055tGd2;
            obj = objKWHzl;
            c46055tGd.AkhnZx = (Job) obj;
        }
        return Unit.INSTANCE;
    }
}
