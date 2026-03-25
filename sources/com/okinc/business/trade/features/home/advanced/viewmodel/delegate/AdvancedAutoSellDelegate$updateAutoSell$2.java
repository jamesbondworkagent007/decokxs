package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30503lcQ;
import o.C28227kTp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellDelegate$updateAutoSell$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $saveToPrefs;
    final /* synthetic */ AbstractC30503lcQ $state;
    int label;
    final /* synthetic */ C28227kTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellDelegate$updateAutoSell$2(C28227kTp c28227kTp, AbstractC30503lcQ abstractC30503lcQ, boolean z, Continuation<? super AdvancedAutoSellDelegate$updateAutoSell$2> continuation) {
        super(2, continuation);
        this.this$0 = c28227kTp;
        this.$state = abstractC30503lcQ;
        this.$saveToPrefs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedAutoSellDelegate$updateAutoSell$2(this.this$0, this.$state, this.$saveToPrefs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedAutoSellDelegate$updateAutoSell$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Function2<AbstractC30503lcQ, Continuation<? super InterfaceC30595leC>, Object> function2OLrzqt = this.this$0.OLrzqt();
            if (function2OLrzqt != null) {
                AbstractC30503lcQ abstractC30503lcQ = this.$state;
                this.label = 1;
                obj = function2OLrzqt.invoke(abstractC30503lcQ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (this.$saveToPrefs) {
                return Unit.INSTANCE;
            }
            boolean z = this.$state instanceof AbstractC30503lcQ.Activity;
            InterfaceC28149kQs interfaceC28149kQs = this.this$0.gEmmrt;
            this.label = 2;
            if (interfaceC28149kQs.KWHzl(!z, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        if (this.$saveToPrefs) {
        }
    }
}
