package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.smart_money.SignalOverview;
import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C29481kuU;
import o.C29508kuv;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewListUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ List $allChainIds$inlined;
    final /* synthetic */ boolean $isFirstPage$inlined;
    final /* synthetic */ C29481kuU $signalFilterUserState$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C29508kuv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C29508kuv c29508kuv, C29481kuU c29481kuU, boolean z, List list) {
        super(2, continuation);
        this.this$0 = c29508kuv;
        this.$signalFilterUserState$inlined = c29481kuU;
        this.$isFirstPage$inlined = z;
        this.$allChainIds$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$signalFilterUserState$inlined, this.$isFirstPage$inlined, this.$allChainIds$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((GetSignalOverviewListUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x00f3, CancellationException -> 0x010a, TryCatch #2 {CancellationException -> 0x010a, all -> 0x00f3, blocks: (B:7:0x0013, B:31:0x008f, B:33:0x0095, B:34:0x00a2, B:36:0x00af, B:46:0x00e6, B:37:0x00b7, B:38:0x00bd, B:40:0x00d2, B:42:0x00d8, B:44:0x00e0, B:11:0x0020, B:27:0x006c, B:14:0x0027, B:16:0x0037, B:18:0x003f, B:20:0x0049, B:24:0x0050), top: B:54:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[Catch: all -> 0x00f3, CancellationException -> 0x010a, TryCatch #2 {CancellationException -> 0x010a, all -> 0x00f3, blocks: (B:7:0x0013, B:31:0x008f, B:33:0x0095, B:34:0x00a2, B:36:0x00af, B:46:0x00e6, B:37:0x00b7, B:38:0x00bd, B:40:0x00d2, B:42:0x00d8, B:44:0x00e0, B:11:0x0020, B:27:0x006c, B:14:0x0027, B:16:0x0037, B:18:0x003f, B:20:0x0049, B:24:0x0050), top: B:54:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        SignalOverviewUiModel signalOverviewUiModel;
        SignalOverviewResponse signalOverviewResponse;
        Object value;
        List<SignalOverviewUiModel> value2;
        List<SignalOverviewUiModel> listDjBIcL;
        Object value3;
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
            List<SignalOverviewUiModel> value4 = this.this$0.AEQbTJ().getValue();
            Long lKWHzl = (value4 == null || (signalOverviewUiModel = (SignalOverviewUiModel) CollectionsKt___CollectionsKt.wlaJM(value4)) == null) ? null : C56443yFo.KWHzl(signalOverviewUiModel.copydefault());
            if (!(!this.$isFirstPage$inlined)) {
                lKWHzl = null;
            }
            SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequestEZpvd = SignalOverviewOrActivityListRequest.Companion.EZpvd(C33129mqd.gEmmrt(lKWHzl), 6, this.$signalFilterUserState$inlined);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.AYXKKw;
            this.label = 1;
            obj = interfaceC29466kuF.copydefault(signalOverviewOrActivityListRequestEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                signalOverviewResponse = (SignalOverviewResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List list = (List) obj;
                if (this.$isFirstPage$inlined) {
                    MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                    do {
                        value = mutableStateFlow.getValue();
                        value2 = this.this$0.AEQbTJ().getValue();
                    } while (!mutableStateFlow.compareAndSet(value, (value2 == null || (listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) value2, (Iterable) list)) == null) ? null : this.this$0.KWHzl(listDjBIcL)));
                } else {
                    this.this$0.gEmmrt = this.$signalFilterUserState$inlined;
                    MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                    do {
                        value3 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value3, list));
                    this.this$0.OLrzqt(this.$allChainIds$inlined);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalOverviewResponse.EZpvd()));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        SignalOverviewResponse signalOverviewResponse2 = (SignalOverviewResponse) ((AbstractC43419rot) obj).AEQbTJ();
        C29508kuv c29508kuv = this.this$0;
        List<SignalOverview> listAEQbTJ = signalOverviewResponse2.AEQbTJ();
        Map<String, TokenInfo> mapKWHzl = signalOverviewResponse2.KWHzl();
        this.L$0 = signalOverviewResponse2;
        this.label = 2;
        Object objMapOverviewResponseToSignalOverviewUiModel$default = C29508kuv.mapOverviewResponseToSignalOverviewUiModel$default(c29508kuv, listAEQbTJ, mapKWHzl, false, this, 4, null);
        if (objMapOverviewResponseToSignalOverviewUiModel$default == objCopydefault) {
            return objCopydefault;
        }
        signalOverviewResponse = signalOverviewResponse2;
        obj = objMapOverviewResponseToSignalOverviewUiModel$default;
        List list2 = (List) obj;
        if (this.$isFirstPage$inlined) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalOverviewResponse.EZpvd()));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
