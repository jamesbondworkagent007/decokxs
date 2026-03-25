package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C21668hHx;
import o.C30567ldb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$observeData$26 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$observeData$26(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, Continuation<? super AdvancedPlaceOrderFragment$observeData$26> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedPlaceOrderFragment$observeData$26 advancedPlaceOrderFragment$observeData$26 = new AdvancedPlaceOrderFragment$observeData$26(this.this$0, continuation);
        advancedPlaceOrderFragment$observeData$26.Z$0 = ((Boolean) obj).booleanValue();
        return advancedPlaceOrderFragment$observeData$26;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$observeData$26) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C30567ldb c30567ldb;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(this.this$0);
            if (c21668hHxDbNXlk != null && (c30567ldb = c21668hHxDbNXlk.OLrzqt) != null) {
                c30567ldb.setVisibility(z ? 0 : 8);
            }
            if (z) {
                this.this$0.AEQbTJ().fvQaOB();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
