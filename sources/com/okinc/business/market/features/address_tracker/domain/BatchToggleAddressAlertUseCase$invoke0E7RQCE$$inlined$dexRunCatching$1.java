package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
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
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.jAD;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.BatchToggleAddressAlertUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ResponseData<Object>>>, Object> {
    final /* synthetic */ List $monitorAddressList$inlined;
    final /* synthetic */ int $operationType$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jAD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, jAD jad, List list, int i) {
        super(2, continuation);
        this.this$0 = jad;
        this.$monitorAddressList$inlined = list;
        this.$operationType$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$monitorAddressList$inlined, this.$operationType$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ResponseData<Object>>> continuation) {
        return ((BatchToggleAddressAlertUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        Object objAEQbTJ;
        Object objOLrzqt2;
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
            C28586kda c28586kda = this.this$0.copydefault;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt2 = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objOLrzqt2);
                    objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt2);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                dexUserIdentity = (DexUserIdentity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = "";
                }
                C25653jBj c25653jBj = this.this$0.AEQbTJ;
                String strEZpvd = dexUserIdentity.EZpvd();
                List<String> list = this.$monitorAddressList$inlined;
                int i2 = this.$operationType$inlined;
                this.L$0 = null;
                this.label = 3;
                objOLrzqt2 = c25653jBj.OLrzqt((String) objAEQbTJ, strEZpvd, list, i2, this);
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                C56391yDq.AEQbTJ(objOLrzqt2);
                objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt2);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        C28603kdr c28603kdr = this.this$0.OLrzqt;
        String strEZpvd2 = dexUserIdentity.EZpvd();
        this.L$0 = dexUserIdentity;
        this.label = 2;
        objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd2, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        C25653jBj c25653jBj2 = this.this$0.AEQbTJ;
        String strEZpvd3 = dexUserIdentity.EZpvd();
        List<String> list2 = this.$monitorAddressList$inlined;
        int i22 = this.$operationType$inlined;
        this.L$0 = null;
        this.label = 3;
        objOLrzqt2 = c25653jBj2.OLrzqt((String) objAEQbTJ, strEZpvd3, list2, i22, this);
        if (objOLrzqt2 == objCopydefault) {
        }
        C56391yDq.AEQbTJ(objOLrzqt2);
        objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt2);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
