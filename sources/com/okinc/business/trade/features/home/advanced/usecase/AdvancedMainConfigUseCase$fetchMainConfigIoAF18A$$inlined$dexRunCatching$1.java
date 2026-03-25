package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28165kRh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28150kQt;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchMainConfig-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends AdvancedMainConfig>>>, Object> {
    int label;
    final /* synthetic */ C28165kRh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C28165kRh c28165kRh) {
        super(2, continuation);
        this.this$0 = c28165kRh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends AdvancedMainConfig>>> continuation) {
        return ((AdvancedMainConfigUseCase$fetchMainConfigIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC28150kQt interfaceC28150kQt = this.this$0.AhwBna;
                this.label = 1;
                obj = interfaceC28150kQt.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                this.this$0.EZpvd((List<AdvancedMainConfig>) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(abstractC43419rot.AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
