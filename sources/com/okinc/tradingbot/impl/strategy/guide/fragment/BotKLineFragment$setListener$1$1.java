package com.okinc.tradingbot.impl.strategy.guide.fragment;

import com.okinc.tradeapi.bean.ParamBuilder;
import java.util.List;
import kotlin.Pair;
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
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.wLF;

/* JADX INFO: loaded from: classes11.dex */
public final class BotKLineFragment$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Pair<Boolean, ParamBuilder> $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ wLF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotKLineFragment$setListener$1$1(Pair<Boolean, ParamBuilder> pair, wLF wlf, Continuation<? super BotKLineFragment$setListener$1$1> continuation) {
        super(2, continuation);
        this.$it = pair;
        this.this$0 = wlf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotKLineFragment$setListener$1$1 botKLineFragment$setListener$1$1 = new BotKLineFragment$setListener$1$1(this.$it, this.this$0, continuation);
        botKLineFragment$setListener$1$1.L$0 = obj;
        return botKLineFragment$setListener$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotKLineFragment$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.$it.getFirst().booleanValue()) {
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new BotKLineFragment$setListener$1$1$newData$1(this.this$0, null), 2, null);
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            C55173xeu c55173xeu = this.this$0.gGvvIC().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(!(this.$it.getFirst().booleanValue() ^ true) ? 0 : 8);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        List list = (List) obj;
        if (!Intrinsics.EZpvd(this.this$0.copydefault.getItems(), list) && this.this$0.gGvvIC().copydefault.getScrollState() == 0) {
            C33064mpR.OLrzqt(this.this$0.copydefault, (List<? extends Object>) list);
        }
        C55173xeu c55173xeu2 = this.this$0.gGvvIC().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(!(this.$it.getFirst().booleanValue() ^ true) ? 0 : 8);
        return Unit.INSTANCE;
    }
}
