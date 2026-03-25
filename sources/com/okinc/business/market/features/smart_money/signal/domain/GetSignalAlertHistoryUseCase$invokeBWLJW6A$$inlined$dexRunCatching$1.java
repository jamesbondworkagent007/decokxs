package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29504kur;
import o.C29584kwR;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29466kuF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertHistoryUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C29584kwR>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ List $signalLabels$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ C29504kur this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C29504kur c29504kur, String str, String str2, List list) {
        super(2, continuation);
        this.this$0 = c29504kur;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$signalLabels$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$signalLabels$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C29584kwR>> continuation) {
        return ((GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC29466kuF interfaceC29466kuF = this.this$0.EZpvd;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                List<Integer> list = this.$signalLabels$inlined;
                this.label = 1;
                obj = interfaceC29466kuF.copydefault(str, str2, list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(this.this$0.OLrzqt.copydefault((SignalAlertHistoryData) ((AbstractC43419rot) obj).AEQbTJ()));
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
