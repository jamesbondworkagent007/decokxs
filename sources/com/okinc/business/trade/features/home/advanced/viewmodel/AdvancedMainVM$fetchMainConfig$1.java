package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM$fetchMainConfig$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28209kSy;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM$fetchMainConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$fetchMainConfig$1(AdvancedMainVM advancedMainVM, boolean z, Continuation<? super AdvancedMainVM$fetchMainConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$forceRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedMainVM$fetchMainConfig$1 advancedMainVM$fetchMainConfig$1 = new AdvancedMainVM$fetchMainConfig$1(this.this$0, this.$forceRefresh, continuation);
        advancedMainVM$fetchMainConfig$1.L$0 = obj;
        return advancedMainVM$fetchMainConfig$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$fetchMainConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [141=4] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC28209kSy activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AdvancedMainVM$fetchMainConfig$1$results$1(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AdvancedMainVM$fetchMainConfig$1$results$2(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AdvancedMainVM$fetchMainConfig$1$results$3(this.this$0, null), 3, null)};
            this.label = 1;
            obj = AwaitKt.awaitAll(deferredArr, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
        if ((list instanceof Collection) && list.isEmpty()) {
            activity = new InterfaceC28209kSy.TaskDescription(this.$forceRefresh);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Result.m7383isFailureimpl(((Result) it.next()).m7386unboximpl())) {
                    final AdvancedMainVM advancedMainVM = this.this$0;
                    activity = new InterfaceC28209kSy.Activity(new InterfaceC30595leC.Intent(new Function0() { // from class: o.kSA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AdvancedMainVM$fetchMainConfig$1.invokeSuspend$lambda$1(advancedMainVM);
                        }
                    }));
                    break;
                }
            }
            activity = new InterfaceC28209kSy.TaskDescription(this.$forceRefresh);
        }
        mutableStateFlow.setValue(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AdvancedMainVM advancedMainVM) {
        AdvancedMainVM.fetchMainConfig$default(advancedMainVM, false, 1, null);
        return Unit.INSTANCE;
    }
}
