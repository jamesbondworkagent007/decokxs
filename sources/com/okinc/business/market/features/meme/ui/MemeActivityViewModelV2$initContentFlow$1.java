package com.okinc.business.market.features.meme.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC56415yEn;
import o.C28634keV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$initContentFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$initContentFlow$1(MemeActivityViewModelV2 memeActivityViewModelV2, Continuation<? super MemeActivityViewModelV2$initContentFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$initContentFlow$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$initContentFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strCopydefault = this.this$0.AEQbTJ(0).copydefault();
            IntRange intRange = new IntRange(0, 2);
            MemeActivityViewModelV2 memeActivityViewModelV2 = this.this$0;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(memeActivityViewModelV2.AEQbTJ(((AbstractC56415yEn) it).nextInt()).AEQbTJ().OLrzqt());
            }
            String strCopydefault2 = this.this$0.fJNWhG.copydefault();
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            List<StateFlow<C28634keV>> listOLrzqt = this.this$0.OLrzqt();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            Iterator<T> it2 = listOLrzqt.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C28634keV) ((StateFlow) it2.next()).getValue()).KWHzl());
            }
            this.label = 1;
            if (memePumpUseCase.copydefault(strCopydefault, strCopydefault2, arrayList, arrayList2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
