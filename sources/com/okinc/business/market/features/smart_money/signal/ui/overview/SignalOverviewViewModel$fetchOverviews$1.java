package com.okinc.business.market.features.smart_money.signal.ui.overview;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29481kuU;
import o.C29508kuv;
import o.C29558kvs;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalOverviewViewModel$fetchOverviews$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $allChainIds;
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ C29481kuU $signalFilter;
    int label;
    final /* synthetic */ SignalOverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalOverviewViewModel$fetchOverviews$1(SignalOverviewViewModel signalOverviewViewModel, boolean z, List<String> list, C29481kuU c29481kuU, Continuation<? super SignalOverviewViewModel$fetchOverviews$1> continuation) {
        super(2, continuation);
        this.this$0 = signalOverviewViewModel;
        this.$isFirstPage = z;
        this.$allChainIds = list;
        this.$signalFilter = c29481kuU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalOverviewViewModel$fetchOverviews$1(this.this$0, this.$isFirstPage, this.$allChainIds, this.$signalFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalOverviewViewModel$fetchOverviews$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(this.$isFirstPage ? new C29558kvs(false, true, false, null, 13, null) : new C29558kvs(false, false, true, null, 11, null));
            C29508kuv c29508kuv = this.this$0.AhwBna;
            List<String> list = this.$allChainIds;
            boolean z = this.$isFirstPage;
            C29481kuU c29481kuU = this.$signalFilter;
            this.label = 1;
            Object objCopydefault2 = c29508kuv.copydefault(list, z, c29481kuU, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        SignalOverviewViewModel signalOverviewViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            signalOverviewViewModel.KWHzl.setValue(new C29558kvs(((Boolean) objM7386unboximpl).booleanValue(), false, false, null, 14, null));
        }
        SignalOverviewViewModel signalOverviewViewModel2 = this.this$0;
        boolean z2 = this.$isFirstPage;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            signalOverviewViewModel2.KWHzl.setValue(z2 ? new C29558kvs(false, false, false, thM7380exceptionOrNullimpl, 7, null) : new C29558kvs(false, false, false, null, 15, null));
            pUU.AEQbTJ("SignalOverviewViewModel", "Failed to fetch signal overviews", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
