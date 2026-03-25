package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.network.okg.response.OKServerException;
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
import o.C56443yFo;
import o.jAC;
import o.jAF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.BatchUpdateTrackerGroupUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jAC>>, Object> {
    final /* synthetic */ String $collectAddress$inlined;
    final /* synthetic */ List $groupIds$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jAF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, jAF jaf, String str, List list) {
        super(2, continuation);
        this.this$0 = jaf;
        this.$collectAddress$inlined = str;
        this.$groupIds$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$collectAddress$inlined, this.$groupIds$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jAC>> continuation) {
        return ((BatchUpdateTrackerGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x00b4, CancellationException -> 0x00cb, TryCatch #2 {CancellationException -> 0x00cb, all -> 0x00b4, blocks: (B:7:0x0011, B:28:0x0091, B:35:0x00af, B:31:0x0098, B:33:0x009c, B:34:0x00ad, B:12:0x0028, B:22:0x006b, B:25:0x0073, B:13:0x0032, B:19:0x0050, B:16:0x003f), top: B:43:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        Object objAEQbTJ;
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
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
            C28586kda c28586kda = this.this$0.AEQbTJ;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = ((Result) obj).m7386unboximpl();
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                    if (thM7380exceptionOrNullimpl != null) {
                        objCopydefault = thM7380exceptionOrNullimpl instanceof OKServerException ? jAC.Companion.KWHzl(C56443yFo.AEQbTJ(((OKServerException) thM7380exceptionOrNullimpl).getCode())) : jAC.TaskDescription.EZpvd;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                dexUserIdentity = (DexUserIdentity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = "";
                }
                C25653jBj c25653jBj = this.this$0.OLrzqt;
                String strEZpvd = dexUserIdentity.EZpvd();
                String str = this.$collectAddress$inlined;
                List<Integer> list = this.$groupIds$inlined;
                this.L$0 = null;
                this.label = 3;
                objCopydefault = c25653jBj.copydefault((String) objAEQbTJ, strEZpvd, str, list, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
                if (thM7380exceptionOrNullimpl != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
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
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
        }
        C25653jBj c25653jBj2 = this.this$0.OLrzqt;
        String strEZpvd3 = dexUserIdentity.EZpvd();
        String str2 = this.$collectAddress$inlined;
        List<Integer> list2 = this.$groupIds$inlined;
        this.L$0 = null;
        this.label = 3;
        objCopydefault = c25653jBj2.copydefault((String) objAEQbTJ, strEZpvd3, str2, list2, this);
        if (objCopydefault == objCopydefault2) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
