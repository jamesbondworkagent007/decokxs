package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25646jBc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25647jBd;
import o.InterfaceC25651jBh;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.UpdateTrackerAliasUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC25647jBd>>, Object> {
    final /* synthetic */ String $collectAddress$inlined;
    final /* synthetic */ String $newAlias$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25646jBc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C25646jBc c25646jBc, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c25646jBc;
        this.$walletAddress$inlined = str;
        this.$collectAddress$inlined = str2;
        this.$newAlias$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined, this.$collectAddress$inlined, this.$newAlias$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC25647jBd>> continuation) {
        return ((UpdateTrackerAliasUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC25651jBh interfaceC25651jBh = this.this$0.OLrzqt;
                String str = this.$walletAddress$inlined;
                String str2 = this.$collectAddress$inlined;
                String str3 = this.$newAlias$inlined;
                this.label = 1;
                objKWHzl = interfaceC25651jBh.KWHzl(str, str2, str3, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
            if (thM7380exceptionOrNullimpl != null) {
                objKWHzl = thM7380exceptionOrNullimpl instanceof OKServerException ? InterfaceC25647jBd.Companion.copydefault(C56443yFo.AEQbTJ(((OKServerException) thM7380exceptionOrNullimpl).getCode())) : InterfaceC25647jBd.Application.AEQbTJ;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC25647jBd) objKWHzl);
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
