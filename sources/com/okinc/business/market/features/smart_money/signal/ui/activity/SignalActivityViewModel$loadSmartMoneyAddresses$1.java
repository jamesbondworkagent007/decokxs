package com.okinc.business.market.features.smart_money.signal.ui.activity;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28586kda;
import o.C29510kux;
import o.C29625kxF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalActivityViewModel$loadSmartMoneyAddresses$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SignalUiModel $signal;
    int label;
    final /* synthetic */ SignalActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalActivityViewModel$loadSmartMoneyAddresses$1(SignalActivityViewModel signalActivityViewModel, SignalUiModel signalUiModel, Continuation<? super SignalActivityViewModel$loadSmartMoneyAddresses$1> continuation) {
        super(2, continuation);
        this.this$0 = signalActivityViewModel;
        this.$signal = signalUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalActivityViewModel$loadSmartMoneyAddresses$1(this.this$0, this.$signal, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalActivityViewModel$loadSmartMoneyAddresses$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objEZpvd;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.djBIcL;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                SignalActivityViewModel signalActivityViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objEZpvd)) {
                    signalActivityViewModel.EZpvd.setValue(new C29625kxF(false, null, (List) objEZpvd, 3, null));
                }
                SignalActivityViewModel signalActivityViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl != null) {
                    signalActivityViewModel2.EZpvd.setValue(new C29625kxF(false, thM7380exceptionOrNullimpl, null, 5, null));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String strEZpvd = dexUserIdentity != null ? dexUserIdentity.EZpvd() : null;
        C29510kux c29510kux = this.this$0.copydefault;
        String strEZpvd2 = this.$signal.EZpvd();
        String strIsConnected = this.$signal.isConnected();
        String strKWHzl = this.$signal.KWHzl();
        String strOLrzqt = this.$signal.OLrzqt();
        this.label = 2;
        objEZpvd = c29510kux.EZpvd(strEZpvd2, strIsConnected, strKWHzl, strOLrzqt, strEZpvd, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        SignalActivityViewModel signalActivityViewModel3 = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
        }
        SignalActivityViewModel signalActivityViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
