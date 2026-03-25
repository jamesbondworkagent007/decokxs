package com.okinc.dexkline.market.features.coincheck.domain;

import com.okinc.dexkline.market.data.model.CoinRiskData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C32299mWw;
import o.C32300mWx;
import o.C32302mWz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32301mWy;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.coincheck.domain.CoinCheckUsecase$getRiskCheck-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C32299mWw>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C32302mWz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C32302mWz c32302mWz, String str, String str2) {
        super(2, continuation);
        this.this$0 = c32302mWz;
        this.$tokenContractAddress$inlined = str;
        this.$chainId$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$tokenContractAddress$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C32299mWw>> continuation) {
        return ((CoinCheckUsecase$getRiskCheck0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC32301mWy interfaceC32301mWy = this.this$0.AEQbTJ;
                String str = this.$tokenContractAddress$inlined;
                String str2 = this.$chainId$inlined;
                this.label = 1;
                obj = interfaceC32301mWy.EZpvd(str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C32300mWx.KWHzl((CoinRiskData) ((AbstractC43419rot) obj).AEQbTJ()));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
