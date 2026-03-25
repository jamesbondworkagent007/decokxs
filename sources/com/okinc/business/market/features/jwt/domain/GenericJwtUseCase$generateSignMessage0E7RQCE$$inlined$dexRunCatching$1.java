package com.okinc.business.market.features.jwt.domain;

import com.okinc.business.defi.api.bean.DappSignArgs;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28601kdp;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$generateSignMessage-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DappSignArgs>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ long $chainId$inlined;
    int label;
    final /* synthetic */ C28603kdr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C28603kdr c28603kdr, String str, long j) {
        super(2, continuation);
        this.this$0 = c28603kdr;
        this.$address$inlined = str;
        this.$chainId$inlined = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$address$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DappSignArgs>> continuation) {
        return ((GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28601kdp c28601kdp = this.this$0.KWHzl;
                String str = this.$address$inlined;
                long j = this.$chainId$inlined;
                this.label = 1;
                objEZpvd = c28601kdp.EZpvd(str, j, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objEZpvd);
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
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
