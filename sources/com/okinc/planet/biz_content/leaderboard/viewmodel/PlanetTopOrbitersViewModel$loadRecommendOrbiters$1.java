package com.okinc.planet.biz_content.leaderboard.viewmodel;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47660tuM;
import o.C47669tuV;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetTopOrbitersViewModel$loadRecommendOrbiters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $size;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47669tuV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetTopOrbitersViewModel$loadRecommendOrbiters$1(C47669tuV c47669tuV, String str, Continuation<? super PlanetTopOrbitersViewModel$loadRecommendOrbiters$1> continuation) {
        super(2, continuation);
        this.this$0 = c47669tuV;
        this.$size = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetTopOrbitersViewModel$loadRecommendOrbiters$1 planetTopOrbitersViewModel$loadRecommendOrbiters$1 = new PlanetTopOrbitersViewModel$loadRecommendOrbiters$1(this.this$0, this.$size, continuation);
        planetTopOrbitersViewModel$loadRecommendOrbiters$1.L$0 = obj;
        return planetTopOrbitersViewModel$loadRecommendOrbiters$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetTopOrbitersViewModel$loadRecommendOrbiters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C47669tuV c47669tuV = this.this$0;
            String str = this.$size;
            Result.Application application2 = Result.Companion;
            C47660tuM c47660tuM = c47669tuV.OLrzqt;
            this.label = 1;
            obj = c47660tuM.AEQbTJ(str, this);
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
        objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("PlanetTopOrbitersViewModel", "getRecommendOrbitersUseCase failed " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
        this.label = 2;
        if (mutableSharedFlow.emit((List) objM7377constructorimpl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
