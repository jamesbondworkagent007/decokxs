package com.okinc.business.invest_biz.mln.ui.kline;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C27393juO;
import o.C27398juT;
import o.C56391yDq;
import o.C56442yFn;
import o.iOB;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: loaded from: classes23.dex */
public final class DeFiMiniDetailPageKlineView$initializeChart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeFiMiniDetailPageKlineView this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailPageKlineView$initializeChart$1(DeFiMiniDetailPageKlineView deFiMiniDetailPageKlineView, Continuation<? super DeFiMiniDetailPageKlineView$initializeChart$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiMiniDetailPageKlineView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiMiniDetailPageKlineView$initializeChart$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiMiniDetailPageKlineView$initializeChart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailPageKlineView$initializeChart$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C27398juT, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DeFiMiniDetailPageKlineView this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeFiMiniDetailPageKlineView deFiMiniDetailPageKlineView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = deFiMiniDetailPageKlineView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C27398juT c27398juT, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c27398juT, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C27398juT c27398juT = (C27398juT) this.L$0;
                C27393juO c27393juO = this.this$0.valueOf;
                if (c27393juO == null) {
                    Intrinsics.gEmmrt("");
                    c27393juO = null;
                }
                c27393juO.setData(c27398juT);
                LuaFunction luaFunction = this.this$0.KWHzl;
                if (luaFunction != null) {
                    luaFunction.invoke(null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StateFlow<C27398juT> stateFlowEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iOB iob = this.this$0.AEQbTJ;
            if (iob != null && (stateFlowEZpvd = iob.EZpvd()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
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
