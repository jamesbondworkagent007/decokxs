package com.okinc.business.market.features.trader.ui;

import com.okinc.business.market.features.filter_tag.domain.FilterTagType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27701kAd;
import o.jVY;

/* JADX INFO: loaded from: classes7.dex */
public final class TraderViewModel$getTagFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TraderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderViewModel$getTagFilter$1(TraderViewModel traderViewModel, Continuation<? super TraderViewModel$getTagFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = traderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TraderViewModel$getTagFilter$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TraderViewModel$getTagFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jVY jvy = this.this$0.valueOf;
            FilterTagType filterTagType = FilterTagType.TRADER;
            String strAYXKKw = this.this$0.AkhnZx.AYXKKw();
            String strOLrzqt = this.this$0.AkhnZx.OLrzqt();
            this.label = 1;
            objCopydefault = jvy.copydefault(filterTagType, strAYXKKw, strOLrzqt, this);
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
        TraderViewModel traderViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            traderViewModel.EZpvd.setValue((List) objCopydefault);
        }
        TraderViewModel traderViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            traderViewModel2.copydefault.setValue(InterfaceC27701kAd.ActionBar.KWHzl);
        }
        return Unit.INSTANCE;
    }
}
