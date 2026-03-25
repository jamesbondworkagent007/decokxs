package com.okinc.business.market.features.holders.ui.detail;

import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26249jXl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jZR;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$loadHistory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lastItemId;
    int I$0;
    int label;
    final /* synthetic */ HolderDetailsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$loadHistory$1(String str, HolderDetailsViewModel holderDetailsViewModel, Continuation<? super HolderDetailsViewModel$loadHistory$1> continuation) {
        super(2, continuation);
        this.$lastItemId = str;
        this.this$0 = holderDetailsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HolderDetailsViewModel$loadHistory$1(this.$lastItemId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HolderDetailsViewModel$loadHistory$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jZR jzr;
        int i;
        Object objM7386unboximpl;
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$lastItemId.length() > 0 && (this.this$0.gEmmrt.getValue() instanceof jZR.ActionBar)) {
                return Unit.INSTANCE;
            }
            int i3 = this.$lastItemId.length() == 0 ? 1 : 0;
            if (i3 != 0 && this.this$0.copydefault() == null) {
                jzr = jZR.TaskDescription.EZpvd;
            } else {
                jzr = jZR.ActionBar.copydefault;
            }
            this.this$0.gEmmrt.setValue(jzr);
            C26249jXl c26249jXl = this.this$0.values;
            String str = this.$lastItemId;
            TokenFilter tokenFilterKWHzl = this.this$0.KWHzl();
            this.I$0 = i3;
            this.label = 1;
            Object objKWHzl = c26249jXl.KWHzl(str, tokenFilterKWHzl, false, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            i = i3;
            objM7386unboximpl = objKWHzl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        HolderDetailsViewModel holderDetailsViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            boolean zBooleanValue = ((Boolean) objM7386unboximpl).booleanValue();
            MutableStateFlow mutableStateFlow = holderDetailsViewModel.AEQbTJ;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, Pair.copy$default((Pair) value2, C56443yFo.KWHzl(zBooleanValue), null, 2, null)));
            if (i != 0) {
                holderDetailsViewModel.AEQbTJ(holderDetailsViewModel.KWHzl());
            }
            holderDetailsViewModel.gEmmrt.setValue(jZR.StateListAnimator.EZpvd);
        }
        HolderDetailsViewModel holderDetailsViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow2 = holderDetailsViewModel2.AEQbTJ;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, Pair.copy$default((Pair) value, C56443yFo.KWHzl(false), null, 2, null)));
            if (i != 0) {
                holderDetailsViewModel2.gEmmrt.setValue(new jZR.Activity(thM7380exceptionOrNullimpl));
            } else {
                holderDetailsViewModel2.gEmmrt.setValue(jZR.StateListAnimator.EZpvd);
            }
        }
        return Unit.INSTANCE;
    }
}
