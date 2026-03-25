package com.okinc.business.defi.wallet.home.cryptoreads;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C18035fam;
import o.C18192fdk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CryptoReadsViewModel$fetchArticleList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18035fam this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoReadsViewModel$fetchArticleList$1(C18035fam c18035fam, Continuation<? super CryptoReadsViewModel$fetchArticleList$1> continuation) {
        super(2, continuation);
        this.this$0 = c18035fam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoReadsViewModel$fetchArticleList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoReadsViewModel$fetchArticleList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object obj2;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18192fdk c18192fdk = this.this$0.OLrzqt;
            this.label = 1;
            obj = c18192fdk.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        C18035fam c18035fam = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            MutableStateFlow mutableStateFlow = c18035fam.copydefault;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, new C18035fam.ActionBar.Activity(list)));
        }
        C18035fam c18035fam2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            MutableStateFlow mutableStateFlow2 = c18035fam2.copydefault;
            do {
                value = mutableStateFlow2.getValue();
                obj2 = (C18035fam.ActionBar) value;
                if (obj2 == C18035fam.ActionBar.C0847ActionBar.EZpvd) {
                    obj2 = C18035fam.ActionBar.StateListAnimator.OLrzqt;
                }
            } while (!mutableStateFlow2.compareAndSet(value, obj2));
        }
        return Unit.INSTANCE;
    }
}
