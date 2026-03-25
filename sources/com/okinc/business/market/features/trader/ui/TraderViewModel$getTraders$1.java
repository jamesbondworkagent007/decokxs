package com.okinc.business.market.features.trader.ui;

import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C29777kzz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27701kAd;

/* JADX INFO: loaded from: classes7.dex */
public final class TraderViewModel$getTraders$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TraderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderViewModel$getTraders$1(TraderViewModel traderViewModel, Continuation<? super TraderViewModel$getTraders$1> continuation) {
        super(2, continuation);
        this.this$0 = traderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderViewModel$getTraders$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TraderViewModel$getTraders$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(InterfaceC27701kAd.StateListAnimator.OLrzqt);
            TradersRequestParam tradersRequestParam = new TradersRequestParam(this.this$0.AkhnZx.OLrzqt(), this.this$0.AkhnZx.AYXKKw(), this.this$0.fARcdN, this.this$0.gEmmrt().getValue().KWHzl().copydefault(), this.this$0.gEmmrt().getValue().EZpvd(), (String) null, 32, (DefaultConstructorMarker) null);
            C29777kzz c29777kzz = this.this$0.DbNXlk;
            this.label = 1;
            objEZpvd = c29777kzz.EZpvd(tradersRequestParam, this);
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
        TraderViewModel traderViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            traderViewModel.fetchVPNInfo = (List) objEZpvd;
            traderViewModel.copydefault();
            traderViewModel.DbNXlk();
        }
        TraderViewModel traderViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            traderViewModel2.copydefault.setValue(InterfaceC27701kAd.ActionBar.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
