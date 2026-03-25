package com.okinc.okex.lite.hero.usecase;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.svM;
import o.yDY;
import o.yHS;

/* JADX INFO: loaded from: classes10.dex */
public final class UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2 extends SuspendLambda implements yHS<svM, svM, svM, svM, Continuation<? super List<? extends svM>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2(Continuation<? super UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2> continuation) {
        super(5, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHS
    public final Object invoke(svM svm, svM svm2, svM svm3, svM svm4, Continuation<? super List<? extends svM>> continuation) {
        UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2 updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2 = new UpdateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2(continuation);
        updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2.L$0 = svm;
        updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2.L$1 = svm2;
        updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2.L$2 = svm3;
        updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2.L$3 = svm4;
        return updateHeroSectionCacheUseCase$processDownloadsAndUpdateCache$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return yDY.gEmmrt((svM) this.L$0, (svM) this.L$1, (svM) this.L$2, (svM) this.L$3);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
