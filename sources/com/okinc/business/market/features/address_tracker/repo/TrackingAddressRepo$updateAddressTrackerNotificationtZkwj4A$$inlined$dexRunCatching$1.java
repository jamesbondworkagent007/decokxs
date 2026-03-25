package com.okinc.business.market.features.address_tracker.repo;

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

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.repo.TrackingAddressRepo$updateAddressTrackerNotification-tZkwj4A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $collectAddress$inlined;
    final /* synthetic */ String $deviceId$inlined;
    final /* synthetic */ String $jwt$inlined;
    final /* synthetic */ int $notifyType$inlined;
    final /* synthetic */ List $userActionTypeList$inlined;
    final /* synthetic */ String $volumeMax$inlined;
    final /* synthetic */ String $volumeMin$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ C25653jBj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1(Continuation continuation, C25653jBj c25653jBj, String str, String str2, String str3, String str4, int i, String str5, String str6, List list) {
        super(2, continuation);
        this.this$0 = c25653jBj;
        this.$jwt$inlined = str;
        this.$deviceId$inlined = str2;
        this.$walletAddress$inlined = str3;
        this.$collectAddress$inlined = str4;
        this.$notifyType$inlined = i;
        this.$volumeMin$inlined = str5;
        this.$volumeMax$inlined = str6;
        this.$userActionTypeList$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$jwt$inlined, this.$deviceId$inlined, this.$walletAddress$inlined, this.$collectAddress$inlined, this.$notifyType$inlined, this.$volumeMin$inlined, this.$volumeMax$inlined, this.$userActionTypeList$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((TrackingAddressRepo$updateAddressTrackerNotificationtZkwj4A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                String str2 = this.$deviceId$inlined;
                UpdateAddressNotificationRequest updateAddressNotificationRequest = new UpdateAddressNotificationRequest(this.$walletAddress$inlined, this.$collectAddress$inlined, this.$notifyType$inlined, this.$volumeMin$inlined, this.$volumeMax$inlined, this.$userActionTypeList$inlined);
                this.label = 1;
                if (interfaceC27595jyE.copydefault(str, str2, updateAddressNotificationRequest, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
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
