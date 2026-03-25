package com.okinc.business.market.features.meme.data.repo;

import com.okinc.business.market.features.meme.data.model.MemeFilterParam;
import com.okinc.business.market.features.meme.data.model.MemeTokenV2Data;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C28624keL;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23229huL;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeRepositoryImpl$getMemeRanking$2 extends SuspendLambda implements Function1<Continuation<? super ResponseData<List<? extends MemeTokenV2Data>>>, Object> {
    final /* synthetic */ MemeFilterParam $filterParam;
    int label;
    final /* synthetic */ C28624keL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeRepositoryImpl$getMemeRanking$2(C28624keL c28624keL, MemeFilterParam memeFilterParam, Continuation<? super MemeRepositoryImpl$getMemeRanking$2> continuation) {
        super(1, continuation);
        this.this$0 = c28624keL;
        this.$filterParam = memeFilterParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MemeRepositoryImpl$getMemeRanking$2(this.this$0, this.$filterParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super ResponseData<List<? extends MemeTokenV2Data>>> continuation) {
        return invoke2((Continuation<? super ResponseData<List<MemeTokenV2Data>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super ResponseData<List<MemeTokenV2Data>>> continuation) {
        return ((MemeRepositoryImpl$getMemeRanking$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23229huL interfaceC23229huL = this.this$0.OLrzqt;
            Map<String, String> queryMap = this.$filterParam.toQueryMap();
            this.label = 1;
            obj = interfaceC23229huL.OLrzqt(queryMap, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
