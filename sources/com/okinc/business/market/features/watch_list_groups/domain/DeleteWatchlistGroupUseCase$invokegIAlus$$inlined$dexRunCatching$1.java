package com.okinc.business.market.features.watch_list_groups.domain;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27765kCn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27771kCt;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.domain.DeleteWatchlistGroupUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ int $groupId$inlined;
    int label;
    final /* synthetic */ C27765kCn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, C27765kCn c27765kCn, int i) {
        super(2, continuation);
        this.this$0 = c27765kCn;
        this.$groupId$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$groupId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Integer>> continuation) {
        return ((DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            kKG kkg = this.this$0.AEQbTJ;
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
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        String strCopydefault = this.this$0.AEQbTJ.copydefault();
        InterfaceC27771kCt interfaceC27771kCt = this.this$0.KWHzl;
        int i2 = this.$groupId$inlined;
        this.label = 2;
        obj = interfaceC27771kCt.EZpvd((String) obj, strCopydefault, i2, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(obj);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
