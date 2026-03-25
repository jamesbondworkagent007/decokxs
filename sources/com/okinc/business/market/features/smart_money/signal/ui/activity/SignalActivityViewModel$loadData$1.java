package com.okinc.business.market.features.smart_money.signal.ui.activity;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29481kuU;
import o.C29503kuq;
import o.C29558kvs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalActivityViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $allChainIds;
    final /* synthetic */ String $eventTime;
    final /* synthetic */ boolean $isFirstPage;
    final /* synthetic */ String $latestId;
    final /* synthetic */ C29481kuU $signalFilter;
    int label;
    final /* synthetic */ SignalActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalActivityViewModel$loadData$1(boolean z, SignalActivityViewModel signalActivityViewModel, List<String> list, String str, String str2, C29481kuU c29481kuU, Continuation<? super SignalActivityViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.$isFirstPage = z;
        this.this$0 = signalActivityViewModel;
        this.$allChainIds = list;
        this.$latestId = str;
        this.$eventTime = str2;
        this.$signalFilter = c29481kuU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalActivityViewModel$loadData$1(this.$isFirstPage, this.this$0, this.$allChainIds, this.$latestId, this.$eventTime, this.$signalFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalActivityViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C29558kvs c29558kvs;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isFirstPage) {
                c29558kvs = new C29558kvs(false, true, false, null, 13, null);
            } else {
                c29558kvs = new C29558kvs(false, false, true, null, 11, null);
            }
            this.this$0.OLrzqt.setValue(c29558kvs);
            C29503kuq c29503kuq = this.this$0.AhwBna;
            List<String> list = this.$allChainIds;
            String str = this.$latestId;
            String str2 = this.$eventTime;
            C29481kuU c29481kuU = this.$signalFilter;
            this.label = 1;
            objCopydefault = c29503kuq.copydefault(list, str, str2, c29481kuU, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        SignalActivityViewModel signalActivityViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            signalActivityViewModel.OLrzqt.setValue(new C29558kvs(((Boolean) objCopydefault).booleanValue(), false, false, null, 14, null));
        }
        SignalActivityViewModel signalActivityViewModel2 = this.this$0;
        boolean z = this.$isFirstPage;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            signalActivityViewModel2.OLrzqt.setValue(z ? new C29558kvs(false, false, false, thM7380exceptionOrNullimpl, 7, null) : new C29558kvs(false, false, false, null, 15, null));
        }
        return Unit.INSTANCE;
    }
}
