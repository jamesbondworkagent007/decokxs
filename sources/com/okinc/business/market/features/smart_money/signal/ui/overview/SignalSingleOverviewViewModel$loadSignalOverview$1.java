package com.okinc.business.market.features.smart_money.signal.ui.overview;

import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29509kuw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29663kxr;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalSingleOverviewViewModel$loadSignalOverview$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ SignalSingleOverviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalSingleOverviewViewModel$loadSignalOverview$1(SignalSingleOverviewViewModel signalSingleOverviewViewModel, String str, String str2, Continuation<? super SignalSingleOverviewViewModel$loadSignalOverview$1> continuation) {
        super(2, continuation);
        this.this$0 = signalSingleOverviewViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalSingleOverviewViewModel$loadSignalOverview$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalSingleOverviewViewModel$loadSignalOverview$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt.setValue(InterfaceC29663kxr.ActionBar.EZpvd);
            C29509kuw c29509kuw = this.this$0.copydefault;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            objEZpvd = c29509kuw.EZpvd(str, str2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        SignalSingleOverviewViewModel signalSingleOverviewViewModel = this.this$0;
        String str3 = this.$chainId;
        String str4 = this.$tokenContractAddress;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) objEZpvd;
            if (signalOverviewUiModel == null) {
                signalSingleOverviewViewModel.OLrzqt.setValue(new InterfaceC29663kxr.TaskDescription());
                return Unit.INSTANCE;
            }
            signalSingleOverviewViewModel.OLrzqt.setValue(new InterfaceC29663kxr.StateListAnimator(signalOverviewUiModel));
            signalSingleOverviewViewModel.copydefault(str3, str4);
        }
        SignalSingleOverviewViewModel signalSingleOverviewViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            signalSingleOverviewViewModel2.OLrzqt.setValue(new InterfaceC29663kxr.TaskDescription());
        }
        return Unit.INSTANCE;
    }
}
