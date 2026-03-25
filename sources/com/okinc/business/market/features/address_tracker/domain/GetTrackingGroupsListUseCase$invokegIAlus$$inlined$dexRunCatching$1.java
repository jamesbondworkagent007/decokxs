package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC25651jBh;
import o.jAL;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.domain.GetTrackingGroupsListUseCase$invoke-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupUiModel>>>, Object> {
    final /* synthetic */ String $walletAddress$inlined;
    int label;
    final /* synthetic */ jAL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1(Continuation continuation, jAL jal, String str) {
        super(2, continuation);
        this.this$0 = jal;
        this.$walletAddress$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends CommonGroupUiModel>>> continuation) {
        return ((GetTrackingGroupsListUseCase$invokegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                InterfaceC25651jBh interfaceC25651jBh = this.this$0.AEQbTJ;
                String str = this.$walletAddress$inlined;
                this.label = 1;
                objOLrzqt = interfaceC25651jBh.OLrzqt(str, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
                objOLrzqt = yDY.AhwBna();
            }
            List listEZpvd = CollectionsKt___CollectionsKt.EZpvd((Iterable) objOLrzqt, new jAL.TaskDescription());
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            Iterator it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(this.this$0.copydefault.OLrzqt((CommonGroupData) it.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
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
