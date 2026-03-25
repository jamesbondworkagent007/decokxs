package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline;

import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mTF;

/* JADX INFO: loaded from: classes15.dex */
public final class KlineContainerFragment$setObserver$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LatestMarketInfoBean $bean;
    int label;
    final /* synthetic */ mTF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineContainerFragment$setObserver$1$1$1(mTF mtf, LatestMarketInfoBean latestMarketInfoBean, Continuation<? super KlineContainerFragment$setObserver$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mtf;
        this.$bean = latestMarketInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineContainerFragment$setObserver$1$1$1(this.this$0, this.$bean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineContainerFragment$setObserver$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TagViewModel tagViewModelAYXKKw = this.this$0.AYXKKw();
            LatestMarketInfoBean latestMarketInfoBean = this.$bean;
            this.label = 1;
            objKWHzl = tagViewModelAYXKKw.KWHzl(latestMarketInfoBean, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        TokenDetail tokenDetail = (TokenDetail) objKWHzl;
        if (tokenDetail != null) {
            this.this$0.copydefault(tokenDetail);
        }
        return Unit.INSTANCE;
    }
}
