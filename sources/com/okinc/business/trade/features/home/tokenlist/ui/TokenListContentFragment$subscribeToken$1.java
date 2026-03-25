package com.okinc.business.trade.features.home.tokenlist.ui;

import android.graphics.drawable.Drawable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.kZJ;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentFragment$subscribeToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $item;
    int label;
    final /* synthetic */ kZJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentFragment$subscribeToken$1(kZJ kzj, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super TokenListContentFragment$subscribeToken$1> continuation) {
        super(2, continuation);
        this.this$0 = kzj;
        this.$item = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentFragment$subscribeToken$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentFragment$subscribeToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<Pair<Boolean, DexMultiTokenInfoBean>> flowKWHzl = this.this$0.values().KWHzl(this.$item);
            final kZJ kzj = this.this$0;
            FlowCollector<? super Pair<Boolean, DexMultiTokenInfoBean>> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$subscribeToken$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<Boolean, DexMultiTokenInfoBean> pair, Continuation<? super Unit> continuation) {
                    Function1 function1;
                    if (pair.getFirst().booleanValue()) {
                        DexMultiTokenInfoBean second = pair.getSecond();
                        if (second != null && (function1 = kzj.AEQbTJ) != null) {
                            function1.invoke(second);
                        }
                    } else {
                        C55326xho.toast$default(C23274hvD.Fragment.UscePu, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
