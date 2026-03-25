package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.data.model.BatchImportAddressListResponse;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25642jAz;
import o.C25653jBj;
import o.C28586kda;
import o.C28603kdr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jAB;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.BatchImportAddressListUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Integer>>, Object> {
    final /* synthetic */ List $addressList$inlined;
    final /* synthetic */ int $groupId$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jAB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, jAB jab, List list, int i) {
        super(2, continuation);
        this.this$0 = jab;
        this.$addressList$inlined = list;
        this.$groupId$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$addressList$inlined, this.$groupId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Integer>> continuation) {
        return ((BatchImportAddressListUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: all -> 0x00af, CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, all -> 0x00af, blocks: (B:7:0x0011, B:28:0x0091, B:30:0x0097, B:31:0x00a3, B:12:0x0028, B:22:0x006b, B:25:0x0073, B:13:0x0032, B:19:0x0050, B:16:0x003f), top: B:39:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        Object objAEQbTJ;
        Object objKWHzl;
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
            C28586kda c28586kda = this.this$0.OLrzqt;
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
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        Result.Application application3 = Result.Companion;
                        objKWHzl = C56443yFo.AEQbTJ(((BatchImportAddressListResponse) objKWHzl).AEQbTJ());
                    }
                    Object objM7377constructorimpl2 = Result.m7377constructorimpl(objKWHzl);
                    C56391yDq.AEQbTJ(objM7377constructorimpl2);
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl2);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                dexUserIdentity = (DexUserIdentity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = "";
                }
                C25653jBj c25653jBj = this.this$0.KWHzl;
                String strEZpvd = dexUserIdentity.EZpvd();
                List<C25642jAz> list = this.$addressList$inlined;
                int i2 = this.$groupId$inlined;
                this.L$0 = null;
                this.label = 3;
                objKWHzl = c25653jBj.KWHzl((String) objAEQbTJ, strEZpvd, list, i2, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7384isSuccessimpl(objKWHzl)) {
                }
                Object objM7377constructorimpl22 = Result.m7377constructorimpl(objKWHzl);
                C56391yDq.AEQbTJ(objM7377constructorimpl22);
                objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl22);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        C28603kdr c28603kdr = this.this$0.copydefault;
        String strEZpvd2 = dexUserIdentity.EZpvd();
        this.L$0 = dexUserIdentity;
        this.label = 2;
        objAEQbTJ = c28603kdr.AEQbTJ(strEZpvd2, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        C25653jBj c25653jBj2 = this.this$0.KWHzl;
        String strEZpvd3 = dexUserIdentity.EZpvd();
        List<C25642jAz> list2 = this.$addressList$inlined;
        int i22 = this.$groupId$inlined;
        this.L$0 = null;
        this.label = 3;
        objKWHzl = c25653jBj2.KWHzl((String) objAEQbTJ, strEZpvd3, list2, i22, this);
        if (objKWHzl == objCopydefault) {
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
        }
        Object objM7377constructorimpl222 = Result.m7377constructorimpl(objKWHzl);
        C56391yDq.AEQbTJ(objM7377constructorimpl222);
        objM7377constructorimpl = Result.m7377constructorimpl(objM7377constructorimpl222);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
