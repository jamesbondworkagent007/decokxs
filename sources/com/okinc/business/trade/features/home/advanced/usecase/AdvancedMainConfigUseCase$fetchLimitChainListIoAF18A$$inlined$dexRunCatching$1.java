package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
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

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMainConfigUseCase$fetchLimitChainList-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends DefiChainInfo>>>, Object> {
    int label;
    final /* synthetic */ C28165kRh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, C28165kRh c28165kRh) {
        super(2, continuation);
        this.this$0 = c28165kRh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends DefiChainInfo>>> continuation) {
        return ((AdvancedMainConfigUseCase$fetchLimitChainListIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x006c, CancellationException -> 0x0083, TryCatch #2 {CancellationException -> 0x0083, all -> 0x006c, blocks: (B:6:0x000e, B:21:0x0049, B:23:0x004f, B:24:0x0061, B:25:0x0067, B:10:0x001a, B:13:0x0021, B:15:0x002f, B:18:0x003a), top: B:33:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                if (this.this$0.valueOf.copydefault()) {
                    C28165kRh c28165kRh = this.this$0;
                    this.label = 1;
                    obj = c28165kRh.KWHzl((Continuation<? super List<DefiChainInfo>>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(obj);
                } else {
                    InterfaceC28150kQt interfaceC28150kQt = this.this$0.AhwBna;
                    this.label = 2;
                    obj = interfaceC28150kQt.KWHzl(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) obj;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    obj = (List) abstractC43419rot.AEQbTJ();
                    objM7377constructorimpl = Result.m7377constructorimpl(obj);
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    this.this$0.EZpvd.setValue((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                }
                obj = (List) abstractC43419rot.AEQbTJ();
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
            }
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
