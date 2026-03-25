package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.planet.biz_content.leaderboard.bean.SpotlightArticle;
import com.okinc.planet.biz_content.leaderboard.bean.SpotlightListResponse;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47666tuS;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47658tuK;
import o.pUU;
import o.qTC;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetSpotlightViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $size;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47666tuS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetSpotlightViewModel$loadData$1(C47666tuS c47666tuS, Integer num, Continuation<? super PlanetSpotlightViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = c47666tuS;
        this.$size = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetSpotlightViewModel$loadData$1 planetSpotlightViewModel$loadData$1 = new PlanetSpotlightViewModel$loadData$1(this.this$0, this.$size, continuation);
        planetSpotlightViewModel$loadData$1.L$0 = obj;
        return planetSpotlightViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetSpotlightViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C47666tuS c47666tuS = this.this$0;
            Integer num = this.$size;
            Result.Application application2 = Result.Companion;
            InterfaceC47658tuK interfaceC47658tuK = c47666tuS.AEQbTJ;
            String strAEQbTJ = qTC.copydefault.AEQbTJ();
            this.label = 1;
            obj = interfaceC47658tuK.EZpvd(1, num, strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((SpotlightListResponse) obj);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("PlanetSpotlight", "getSpotlightUseCase failed " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            objM7377constructorimpl = null;
        }
        SpotlightListResponse spotlightListResponse = (SpotlightListResponse) objM7377constructorimpl;
        this.this$0.copydefault.setValue(spotlightListResponse != null ? spotlightListResponse.getUpdateTime() : null);
        MutableSharedFlow mutableSharedFlow = this.this$0.OLrzqt;
        List<SpotlightArticle> contentDataList = spotlightListResponse != null ? spotlightListResponse.getContentDataList() : null;
        this.label = 2;
        if (mutableSharedFlow.emit(contentDataList, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
