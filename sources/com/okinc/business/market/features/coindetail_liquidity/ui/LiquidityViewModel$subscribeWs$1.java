package com.okinc.business.market.features.coindetail_liquidity.ui;

import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C26072jQx;
import o.C31199lpX;
import o.C56391yDq;
import o.C56442yFn;
import o.jPS;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityViewModel$subscribeWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenFilter $filter;
    int label;
    final /* synthetic */ LiquidityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityViewModel$subscribeWs$1(LiquidityViewModel liquidityViewModel, TokenFilter tokenFilter, Continuation<? super LiquidityViewModel$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = liquidityViewModel;
        this.$filter = tokenFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityViewModel$subscribeWs$1(this.this$0, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityViewModel$subscribeWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.fetchVPNInfo.EZpvd();
            jPS jps = this.this$0.fetchVPNInfo;
            TokenFilter tokenFilterOLrzqt = this.$filter;
            if (tokenFilterOLrzqt == null) {
                TokenFilter tokenFilterKWHzl = this.this$0.KWHzl();
                tokenFilterOLrzqt = tokenFilterKWHzl.OLrzqt((6143 & 1) != 0 ? tokenFilterKWHzl.AEQbTJ : this.this$0.values.KWHzl(), (6143 & 2) != 0 ? tokenFilterKWHzl.isConnected : this.this$0.values.copydefault(), (6143 & 4) != 0 ? tokenFilterKWHzl.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterKWHzl.AhwBna : null, (6143 & 16) != 0 ? tokenFilterKWHzl.KWHzl : null, (6143 & 32) != 0 ? tokenFilterKWHzl.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterKWHzl.valueOf : false, (6143 & 128) != 0 ? tokenFilterKWHzl.EZpvd : null, (6143 & 256) != 0 ? tokenFilterKWHzl.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterKWHzl.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterKWHzl.copydefault : null, (6143 & 2048) != 0 ? tokenFilterKWHzl.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterKWHzl.fetchVPNInfo : null);
            }
            Flow flowAEQbTJ = C31199lpX.AEQbTJ(FlowKt.onEach(jps.copydefault(tokenFilterOLrzqt), new AnonymousClass1(this.this$0, null)), 1000L);
            final LiquidityViewModel liquidityViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel$subscribeWs$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(LiquidityChange liquidityChange, Continuation<? super Unit> continuation) {
                    MutableStateFlow mutableStateFlow = liquidityViewModel.copydefault;
                    Collection<C26072jQx> collectionValues = liquidityViewModel.OLrzqt().values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                    mutableStateFlow.setValue(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel$subscribeWs$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiquidityChange, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LiquidityViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiquidityViewModel liquidityViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = liquidityViewModel;
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
        public final Object invoke(LiquidityChange liquidityChange, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liquidityChange, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            LiquidityChange liquidityChange = (LiquidityChange) this.L$0;
            this.this$0.OLrzqt().put(liquidityChange.OLrzqt(), this.this$0.isConnected.EZpvd(liquidityChange));
            return Unit.INSTANCE;
        }
    }
}
