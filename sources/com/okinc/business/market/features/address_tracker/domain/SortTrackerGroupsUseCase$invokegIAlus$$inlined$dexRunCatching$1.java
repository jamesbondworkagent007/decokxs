package com.okinc.business.market.features.address_tracker.domain;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25651jBh;
import o.jAP;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.SortTrackerGroupsUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ List $sortedGroupIds$inlined;
    int label;
    final /* synthetic */ jAP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, jAP jap, List list) {
        super(2, continuation);
        this.this$0 = jap;
        this.$sortedGroupIds$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$sortedGroupIds$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((SortTrackerGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            kKG kkg = this.this$0.EZpvd;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((AbstractC43419rot) obj).AEQbTJ();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        String strCopydefault = this.this$0.EZpvd.copydefault();
        InterfaceC25651jBh interfaceC25651jBh = this.this$0.AEQbTJ;
        List<Integer> list = this.$sortedGroupIds$inlined;
        this.label = 2;
        obj = interfaceC25651jBh.copydefault((String) obj, strCopydefault, list, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        ((AbstractC43419rot) obj).AEQbTJ();
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
