package com.okinc.business.market.wallet.domain.usecase;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43248rlh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9731bbC;
import o.InterfaceC9852bdR;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getNetworkFromChainId-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ long $chainId$inlined;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1(Continuation continuation, long j) {
        super(2, continuation);
        this.$chainId$inlined = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1(continuation, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strDjBIcL;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().EZpvd(this.$chainId$inlined, false);
            if (interfaceC9731bbCEZpvd != null) {
                strDjBIcL = interfaceC9731bbCEZpvd.djBIcL();
            } else {
                long j = this.$chainId$inlined;
                strDjBIcL = j == 1 ? "Ethereum" : j == 56 ? "BSC" : "OKExChain";
            }
            objM7377constructorimpl = Result.m7377constructorimpl(strDjBIcL);
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
