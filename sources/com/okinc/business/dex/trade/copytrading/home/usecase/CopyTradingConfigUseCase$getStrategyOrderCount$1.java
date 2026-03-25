package com.okinc.business.dex.trade.copytrading.home.usecase;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.trade.copytrading.home.data.CTStrategy;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.usecase.CopyTradingConfigUseCase$getStrategyOrderCount$1;
import com.okinc.business.dex.trade.order.domain.model.OrderListPagerResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC19701gMc;
import o.gWI;
import o.gWK;
import o.yDV;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingConfigUseCase$getStrategyOrderCount$1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gWI this$0;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TeeWsOriginData.EventType.values().length];
            try {
                iArr[TeeWsOriginData.EventType.StrategyCreateUpdate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TeeWsOriginData.EventType.StrategyOrderStatusChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingConfigUseCase$getStrategyOrderCount$1(gWI gwi, Continuation<? super CopyTradingConfigUseCase$getStrategyOrderCount$1> continuation) {
        super(2, continuation);
        this.this$0 = gwi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CopyTradingConfigUseCase$getStrategyOrderCount$1 copyTradingConfigUseCase$getStrategyOrderCount$1 = new CopyTradingConfigUseCase$getStrategyOrderCount$1(this.this$0, continuation);
        copyTradingConfigUseCase$getStrategyOrderCount$1.L$0 = obj;
        return copyTradingConfigUseCase$getStrategyOrderCount$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingConfigUseCase$getStrategyOrderCount$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final ProducerScope producerScope;
        Object objM8607getStrategiesBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            gWK gwk = this.this$0.copydefault;
            this.L$0 = producerScope;
            this.label = 1;
            objM8607getStrategiesBWLJW6A$default = gWK.m8607getStrategiesBWLJW6A$default(gwk, null, false, null, this, 5, null);
            if (objM8607getStrategiesBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8607getStrategiesBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8607getStrategiesBWLJW6A$default)) {
            Result.Application application = Result.Companion;
            List dataList = ((OrderListPagerResult) objM8607getStrategiesBWLJW6A$default).getDataList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dataList, 10));
            Iterator it = dataList.iterator();
            while (it.hasNext()) {
                arrayList.add(((CTStrategy) it.next()).getStrategyId());
            }
            objM8607getStrategiesBWLJW6A$default = CollectionsKt___CollectionsKt.QKudOq(arrayList);
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objM8607getStrategiesBWLJW6A$default);
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        final HashSet hashSet = (HashSet) objM7377constructorimpl;
        producerScope.mo5769trySendJP2dKIU(C56443yFo.AEQbTJ(hashSet.size()));
        final InterfaceC19701gMc interfaceC19701gMcEZpvd = this.this$0.OLrzqt.EZpvd(new Function1() { // from class: o.gWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CopyTradingConfigUseCase$getStrategyOrderCount$1.invokeSuspend$lambda$2(hashSet, producerScope, (TeeWsOriginData) obj2);
            }
        });
        Function0 function0 = new Function0() { // from class: o.gWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CopyTradingConfigUseCase$getStrategyOrderCount$1.invokeSuspend$lambda$3(interfaceC19701gMcEZpvd);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(HashSet hashSet, ProducerScope producerScope, TeeWsOriginData teeWsOriginData) {
        if (!yDV.valueOf(new TeeWsOriginData.EventType[]{TeeWsOriginData.EventType.StrategyOrderStatusChanged, TeeWsOriginData.EventType.StrategyCreateUpdate}, teeWsOriginData.getType())) {
            return Unit.INSTANCE;
        }
        TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
        if (teeWsData == null) {
            return Unit.INSTANCE;
        }
        String strategyId = teeWsData.getStrategyId();
        int i = TaskDescription.EZpvd[teeWsOriginData.getType().ordinal()];
        if (i == 1) {
            hashSet.add(strategyId);
            ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(Integer.valueOf(hashSet.size())));
        } else if (i == 2 && StrategyStatus.Companion.KWHzl(teeWsData.getStatus()).isTerminalState()) {
            hashSet.remove(strategyId);
            producerScope.mo5769trySendJP2dKIU(Integer.valueOf(hashSet.size()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(InterfaceC19701gMc interfaceC19701gMc) {
        interfaceC19701gMc.KWHzl();
        return Unit.INSTANCE;
    }
}
