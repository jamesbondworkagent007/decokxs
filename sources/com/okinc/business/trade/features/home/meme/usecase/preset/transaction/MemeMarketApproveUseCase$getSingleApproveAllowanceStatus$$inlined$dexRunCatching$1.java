package com.okinc.business.trade.features.home.meme.usecase.preset.transaction;

import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.network.okg.response.OKServerException;
import java.util.Map;
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
import o.InterfaceC28282kVq;
import o.kWG;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends Map<String, ? extends DeFiPlatformTokenApprovalInfo>, ? extends OKServerException>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $toTokenContractAddress$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $userWalletAddress$inlined;
    int label;
    final /* synthetic */ kWG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1(Continuation continuation, kWG kwg, String str, String str2, String str3, String str4) {
        super(2, continuation);
        this.this$0 = kwg;
        this.$userWalletAddress$inlined = str;
        this.$chainId$inlined = str2;
        this.$tokenContractAddress$inlined = str3;
        this.$toTokenContractAddress$inlined = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$userWalletAddress$inlined, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$toTokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends Map<String, ? extends DeFiPlatformTokenApprovalInfo>, ? extends OKServerException>>> continuation) {
        return ((MemeMarketApproveUseCase$getSingleApproveAllowanceStatus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC28282kVq interfaceC28282kVq = this.this$0.KWHzl;
                String str = this.$userWalletAddress$inlined;
                String str2 = this.$chainId$inlined;
                String str3 = this.$tokenContractAddress$inlined;
                String str4 = this.$toTokenContractAddress$inlined;
                this.label = 1;
                obj = interfaceC28282kVq.OLrzqt(str, str2, str3, str4, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
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
