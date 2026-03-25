package com.okinc.business.market.features.meme.filter.ui;

import com.okinc.business.market.features.meme.filter.domain.MemeBlacklist;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28669kfD;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28693kfb;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeFilterViewModel$getBlacklist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MemeFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeFilterViewModel$getBlacklist$1(MemeFilterViewModel memeFilterViewModel, Continuation<? super MemeFilterViewModel$getBlacklist$1> continuation) {
        super(2, continuation);
        this.this$0 = memeFilterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeFilterViewModel$getBlacklist$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeFilterViewModel$getBlacklist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.AhwBna;
            InterfaceC28693kfb interfaceC28693kfb = this.this$0.gHZMYf;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            Object objEZpvd = interfaceC28693kfb.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(C28669kfD.AEQbTJ((MemeBlacklist) it.next()));
        }
        mutableStateFlow.setValue(arrayList);
        return Unit.INSTANCE;
    }
}
