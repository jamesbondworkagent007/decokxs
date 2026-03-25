package com.okinc.business.market.features.address_tracker.repo;

import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25653jBj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$batchEnableOrDisableNotification-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ResponseData<Object>>>, Object> {
    final /* synthetic */ String $jwt$inlined;
    final /* synthetic */ List $monitorAddressList$inlined;
    final /* synthetic */ int $operationType$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25653jBj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C25653jBj c25653jBj, String str, String str2, List list, int i) {
        super(2, continuation);
        this.this$0 = c25653jBj;
        this.$jwt$inlined = str;
        this.$walletAddress$inlined = str2;
        this.$monitorAddressList$inlined = list;
        this.$operationType$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$jwt$inlined, this.$walletAddress$inlined, this.$monitorAddressList$inlined, this.$operationType$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ResponseData<Object>>> continuation) {
        return ((TrackingAddressRepo$batchEnableOrDisableNotificationyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
                String str = this.$jwt$inlined;
                BatchEnableOrDisableNotificationRequest batchEnableOrDisableNotificationRequest = new BatchEnableOrDisableNotificationRequest(this.$walletAddress$inlined, this.$monitorAddressList$inlined, this.$operationType$inlined);
                this.label = 1;
                obj = interfaceC27595jyE.KWHzl(str, batchEnableOrDisableNotificationRequest, this);
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
