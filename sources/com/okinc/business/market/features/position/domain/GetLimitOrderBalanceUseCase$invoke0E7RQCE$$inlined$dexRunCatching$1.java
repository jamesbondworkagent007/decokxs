package com.okinc.business.market.features.position.domain;

import com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C27610jyT;
import o.C29124kni;
import o.C29136knu;
import o.C29183koo;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29130kno;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.position.domain.GetLimitOrderBalanceUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C29183koo>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    final /* synthetic */ String $userWalletAddress$inlined;
    int label;
    final /* synthetic */ C29124kni this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C29124kni c29124kni, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c29124kni;
        this.$chainId$inlined = str;
        this.$userWalletAddress$inlined = str2;
        this.$tokenAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$userWalletAddress$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C29183koo>> continuation) {
        return ((GetLimitOrderBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC29130kno interfaceC29130kno = this.this$0.EZpvd;
                C27610jyT c27610jyT = new C27610jyT(this.$chainId$inlined, this.$userWalletAddress$inlined, this.$tokenAddress$inlined);
                this.label = 1;
                obj = interfaceC29130kno.copydefault(c27610jyT, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C29136knu.EZpvd((LimitOrderBalanceData) ((AbstractC43419rot) obj).AEQbTJ()));
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
