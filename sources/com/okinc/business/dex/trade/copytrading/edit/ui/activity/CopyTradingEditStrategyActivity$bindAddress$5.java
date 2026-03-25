package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C23428hxz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyActivity$bindAddress$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C23428hxz $this_bindAddress;
    int label;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$bindAddress$5(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super CopyTradingEditStrategyActivity$bindAddress$5> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyActivity;
        this.$this_bindAddress = c23428hxz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyActivity$bindAddress$5(this.this$0, this.$this_bindAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyActivity$bindAddress$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity$bindAddress$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C23428hxz $this_bindAddress;
        int label;
        final /* synthetic */ CopyTradingEditStrategyActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, C23428hxz c23428hxz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingEditStrategyActivity;
            this.$this_bindAddress = c23428hxz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$this_bindAddress, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.gEmmrt().gEmmrt());
                final C23428hxz c23428hxz = this.$this_bindAddress;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.activity.CopyTradingEditStrategyActivity.bindAddress.5.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(DefiChainInfo defiChainInfo, Continuation<? super Unit> continuation) {
                        c23428hxz.OLrzqt.setChainInfo(defiChainInfo.getChainName(), defiChainInfo.getLogoUrl());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CopyTradingEditStrategyActivity copyTradingEditStrategyActivity = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(copyTradingEditStrategyActivity, this.$this_bindAddress, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(copyTradingEditStrategyActivity, state, anonymousClass1, this) == objCopydefault) {
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
