package com.okinc.business.market.features.holders.ui.detail;

import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C29123knh;
import o.C56391yDq;
import o.C56442yFn;
import o.jZR;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$loadPnLDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$loadPnLDetails$1(HolderDetailsViewModel holderDetailsViewModel, Continuation<? super HolderDetailsViewModel$loadPnLDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = holderDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$loadPnLDetails$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$loadPnLDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PositionDetailsParam positionDetailsParam;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PositionDetailsParam positionDetailsParam2 = new PositionDetailsParam(this.this$0.EZpvd().valueOf(), this.this$0.EZpvd().AEQbTJ(), false, (String) null, (String) null, false, (String) null, false, 252, (DefaultConstructorMarker) null);
            C29123knh c29123knh = this.this$0.AkhnZx;
            String chainId = positionDetailsParam2.getChainId();
            String tokenAddress = positionDetailsParam2.getTokenAddress();
            String strKWHzl = this.this$0.EZpvd().KWHzl();
            this.L$0 = positionDetailsParam2;
            this.label = 1;
            Object objEZpvd = c29123knh.EZpvd(chainId, tokenAddress, strKWHzl, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            positionDetailsParam = positionDetailsParam2;
            objM7386unboximpl = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            positionDetailsParam = (PositionDetailsParam) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        HolderDetailsViewModel holderDetailsViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            holderDetailsViewModel.EZpvd.setValue((PnLDetailsUiModel) objM7386unboximpl);
            holderDetailsViewModel.gEmmrt.setValue(jZR.StateListAnimator.EZpvd);
            holderDetailsViewModel.AkhnZx.copydefault(positionDetailsParam.getChainId(), positionDetailsParam.getTokenAddress(), holderDetailsViewModel.EZpvd().KWHzl());
        }
        HolderDetailsViewModel holderDetailsViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            holderDetailsViewModel2.gEmmrt.setValue(new jZR.Activity(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
