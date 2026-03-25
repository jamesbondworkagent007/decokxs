package com.okinc.business.trade.features.home.meme.usecase.chainlist;

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
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28276kVk;
import o.kVV;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.chainlist.MemeChainListUseCase$requestMemeChainList-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends DefiChainInfo>>>, Object> {
    int label;
    final /* synthetic */ kVV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, kVV kvv) {
        super(2, continuation);
        this.this$0 = kvv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends DefiChainInfo>>> continuation) {
        return ((MemeChainListUseCase$requestMemeChainListIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (this.this$0.EZpvd.copydefault()) {
                    kVV kvv = this.this$0;
                    this.label = 1;
                    obj = kvv.EZpvd((Continuation<? super List<DefiChainInfo>>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(obj);
                } else {
                    InterfaceC28276kVk interfaceC28276kVk = this.this$0.KWHzl;
                    this.label = 2;
                    obj = interfaceC28276kVk.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = (List) ((AbstractC43419rot) obj).AEQbTJ();
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
                obj = (List) ((AbstractC43419rot) obj).AEQbTJ();
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
