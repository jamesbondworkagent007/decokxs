package com.okinc.okex.search.viewmodel;

import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportSearchViewModel$initiateSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SupportSearchViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportSearchViewModel$initiateSearch$1(SupportSearchViewModel supportSearchViewModel, Continuation<? super SupportSearchViewModel$initiateSearch$1> continuation) {
        super(2, continuation);
        this.this$0 = supportSearchViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportSearchViewModel$initiateSearch$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportSearchViewModel$initiateSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        SupportSearchViewModel.StateListAnimator.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!StringsKt__StringsKt.fARcdN((CharSequence) this.this$0.OLrzqt())) {
                C44760scx.log$default("SupportSearchViewModel: initiateSearch > currentKeyword: " + this.this$0.OLrzqt() + " | currentIntentId: " + this.this$0.copydefault(), null, 2, null);
                SupportSearchViewModel.Activity activity = new SupportSearchViewModel.Activity(this.this$0.OLrzqt(), this.this$0.copydefault());
                MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
                this.label = 1;
                if (mutableStateFlow2.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableStateFlow = this.this$0.OLrzqt;
                actionBar = SupportSearchViewModel.StateListAnimator.ActionBar.OLrzqt;
                this.label = 2;
                if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = this.this$0.OLrzqt;
            actionBar = SupportSearchViewModel.StateListAnimator.ActionBar.OLrzqt;
            this.label = 2;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
