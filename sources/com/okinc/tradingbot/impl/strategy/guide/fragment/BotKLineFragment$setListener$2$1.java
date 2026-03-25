package com.okinc.tradingbot.impl.strategy.guide.fragment;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.C33064mpR;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.wLF;

/* JADX INFO: loaded from: classes11.dex */
public final class BotKLineFragment$setListener$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wLF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotKLineFragment$setListener$2$1(wLF wlf, Continuation<? super BotKLineFragment$setListener$2$1> continuation) {
        super(2, continuation);
        this.this$0 = wlf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotKLineFragment$setListener$2$1 botKLineFragment$setListener$2$1 = new BotKLineFragment$setListener$2$1(this.this$0, continuation);
        botKLineFragment$setListener$2$1.L$0 = obj;
        return botKLineFragment$setListener$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotKLineFragment$setListener$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new BotKLineFragment$setListener$2$1$newData$1(this.this$0, null), 2, null);
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        if (!Intrinsics.EZpvd(this.this$0.copydefault.getItems(), list) && this.this$0.gGvvIC().copydefault.getScrollState() == 0) {
            C33064mpR.OLrzqt(this.this$0.copydefault, (List<? extends Object>) list);
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
