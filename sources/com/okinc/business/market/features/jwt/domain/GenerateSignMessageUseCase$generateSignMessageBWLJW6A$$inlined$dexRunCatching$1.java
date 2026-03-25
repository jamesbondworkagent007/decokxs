package com.okinc.business.market.features.jwt.domain;

import com.okinc.business.market.data.model.GetSignMessageResponse;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28602kdq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9731bbC;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.jwt.domain.GenerateSignMessageUseCase$generateSignMessage-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $address$inlined;
    final /* synthetic */ long $chainId$inlined;
    final /* synthetic */ GetSignMessageResponse $response$inlined;
    int label;
    final /* synthetic */ C28602kdq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28602kdq c28602kdq, long j, GetSignMessageResponse getSignMessageResponse, String str) {
        super(2, continuation);
        this.this$0 = c28602kdq;
        this.$chainId$inlined = j;
        this.$response$inlined = getSignMessageResponse;
        this.$address$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$response$inlined, this.$address$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((GenerateSignMessageUseCase$generateSignMessageBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        String strKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                kKG kkg = this.this$0.AEQbTJ;
                long j = this.$chainId$inlined;
                this.label = 1;
                objAEQbTJ = kkg.AEQbTJ(j, true, (Continuation<? super Result<? extends InterfaceC9731bbC>>) this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            InterfaceC9731bbC interfaceC9731bbC = (InterfaceC9731bbC) objAEQbTJ;
            if (interfaceC9731bbC == null || !interfaceC9731bbC.fARcdN()) {
                long j2 = this.$chainId$inlined;
                strKWHzl = j2 == 784 ? this.$response$inlined.KWHzl() : j2 == 9004 ? this.this$0.OLrzqt(this.$response$inlined, this.$address$inlined) : (j2 == 0 || j2 == 70000061) ? this.this$0.KWHzl(this.$response$inlined, this.$address$inlined) : j2 == 607 ? this.this$0.OLrzqt(this.$response$inlined) : j2 == 195 ? this.this$0.EZpvd(this.$response$inlined) : this.this$0.copydefault(this.$response$inlined);
            } else {
                strKWHzl = this.this$0.EZpvd.copydefault(this.$response$inlined.KWHzl());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(strKWHzl);
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
