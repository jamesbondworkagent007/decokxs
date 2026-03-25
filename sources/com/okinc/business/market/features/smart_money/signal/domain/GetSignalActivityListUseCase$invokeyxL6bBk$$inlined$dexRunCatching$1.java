package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.smart_money.SignalActivityResponse;
import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.Collection;
import java.util.List;
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
import o.C29503kuq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ List $allChainIds$inlined;
    final /* synthetic */ boolean $isFirstPage$inlined;
    final /* synthetic */ SignalOverviewOrActivityListRequest $request$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C29503kuq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C29503kuq c29503kuq, SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, boolean z, List list) {
        super(2, continuation);
        this.this$0 = c29503kuq;
        this.$request$inlined = signalOverviewOrActivityListRequest;
        this.$isFirstPage$inlined = z;
        this.$allChainIds$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$request$inlined, this.$isFirstPage$inlined, this.$allChainIds$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        SignalActivityResponse signalActivityResponse;
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
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.OLrzqt;
            SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest = this.$request$inlined;
            this.label = 1;
            obj = interfaceC29466kuF.KWHzl(signalOverviewOrActivityListRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    signalActivityResponse = (SignalActivityResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.AEQbTJ(this.$allChainIds$inlined);
                    objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalActivityResponse.EZpvd()));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                signalActivityResponse = (SignalActivityResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalActivityResponse.EZpvd()));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        SignalActivityResponse signalActivityResponse2 = (SignalActivityResponse) ((AbstractC43419rot) obj).AEQbTJ();
        List<SignalUiModel> listKWHzl = this.this$0.AEQbTJ.KWHzl(signalActivityResponse2.OLrzqt(), signalActivityResponse2.AEQbTJ());
        if (this.$isFirstPage$inlined) {
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            this.L$0 = signalActivityResponse2;
            this.label = 2;
            if (mutableStateFlow.emit(listKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
            signalActivityResponse = signalActivityResponse2;
            this.this$0.AEQbTJ(this.$allChainIds$inlined);
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalActivityResponse.EZpvd()));
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        List<SignalUiModel> value = this.this$0.AEQbTJ().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) value);
        listFJNWhG.addAll(listKWHzl);
        MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
        this.L$0 = signalActivityResponse2;
        this.label = 3;
        if (mutableStateFlow2.emit(listFJNWhG, this) == objCopydefault) {
            return objCopydefault;
        }
        signalActivityResponse = signalActivityResponse2;
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(signalActivityResponse.EZpvd()));
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
