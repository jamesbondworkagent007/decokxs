package com.okinc.business.market.features.address_tracker.repo;

import com.okinc.business.market.features.address_tracker.domain.UpdateTrackerRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25650jBg;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25647jBd;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.repo.TrackerGroupRepositoryImpl$updateTrackerAlias-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC25647jBd>>, Object> {
    final /* synthetic */ String $addressAlias$inlined;
    final /* synthetic */ String $collectAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C25650jBg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C25650jBg c25650jBg, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c25650jBg;
        this.$walletAddress$inlined = str;
        this.$collectAddress$inlined = str2;
        this.$addressAlias$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined, this.$collectAddress$inlined, this.$addressAlias$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC25647jBd>> continuation) {
        return ((TrackerGroupRepositoryImpl$updateTrackerAliasBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        InterfaceC25647jBd.TaskDescription taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C28603kdr c28603kdr = this.this$0.OLrzqt;
            String str = this.$walletAddress$inlined;
            this.label = 1;
            objAEQbTJ = c28603kdr.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                taskDescription = (InterfaceC25647jBd.TaskDescription) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(taskDescription.copydefault(C56443yFo.AEQbTJ(((ResponseData) obj).getCode())));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = "";
        }
        InterfaceC25647jBd.TaskDescription taskDescription2 = InterfaceC25647jBd.Companion;
        InterfaceC27595jyE interfaceC27595jyE = this.this$0.AEQbTJ;
        UpdateTrackerRequest updateTrackerRequest = new UpdateTrackerRequest(this.$walletAddress$inlined, this.$collectAddress$inlined, this.$addressAlias$inlined);
        this.L$0 = taskDescription2;
        this.label = 2;
        obj = interfaceC27595jyE.copydefault((String) objAEQbTJ, updateTrackerRequest, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        taskDescription = taskDescription2;
        objM7377constructorimpl = Result.m7377constructorimpl(taskDescription.copydefault(C56443yFo.AEQbTJ(((ResponseData) obj).getCode())));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
