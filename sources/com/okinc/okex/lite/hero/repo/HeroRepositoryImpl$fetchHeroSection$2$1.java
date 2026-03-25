package com.okinc.okex.lite.hero.repo;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.hero.data.model.HeroResponseRootModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45724svg;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45675suX;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroRepositoryImpl$fetchHeroSection$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<HeroResponseRootModel>>, Object> {
    final /* synthetic */ C45724svg $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroRepositoryImpl$fetchHeroSection$2$1(C45724svg c45724svg, Continuation<? super HeroRepositoryImpl$fetchHeroSection$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45724svg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeroRepositoryImpl$fetchHeroSection$2$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<HeroResponseRootModel>> continuation) {
        return ((HeroRepositoryImpl$fetchHeroSection$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45675suX interfaceC45675suX = this.$this_runOrErrorResponse.copydefault;
            this.label = 1;
            obj = interfaceC45675suX.KWHzl("FIRST_CACHE", 600, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.copydefault("LiteHeroPage", "fetchHeroSection " + ((ResponseData) obj));
        return obj;
    }
}
