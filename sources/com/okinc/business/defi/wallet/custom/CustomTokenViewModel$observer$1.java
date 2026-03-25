package com.okinc.business.defi.wallet.custom;

import com.okinc.network.okg.response.ResponseData;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C10854bwM;
import o.C13924dbk;
import o.C16204efX;
import o.C16260ega;
import o.C16263egd;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC16201efU;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenViewModel$observer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16204efX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenViewModel$observer$1(C16204efX c16204efX, Continuation<? super CustomTokenViewModel$observer$1> continuation) {
        super(2, continuation);
        this.this$0 = c16204efX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomTokenViewModel$observer$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomTokenViewModel$observer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<C16263egd> {
        public final /* synthetic */ C16204efX EZpvd;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.CustomTokenViewModel$observer$1$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C16204efX OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C16204efX c16204efX) {
                this.KWHzl = flowCollector;
                this.OLrzqt = c16204efX;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:12|39|40)(2:13|14))(4:15|45|16|17))(4:21|41|22|(1:24)(1:25))|43|26|(1:28)|29|36|(1:38)|39|40|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0124 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CustomTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1 customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1;
                C13924dbk c13924dbk;
                C13924dbk c13924dbk2;
                FlowCollector flowCollector;
                long j;
                C16263egd c16263egd;
                if (continuation instanceof CustomTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1) {
                    customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1 = (CustomTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1 = new CustomTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object objEZpvd = customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objEZpvd);
                    FlowCollector flowCollector2 = this.KWHzl;
                    c13924dbk = (C13924dbk) obj;
                    long jFetchVPNInfo = c13924dbk.OLrzqt().fetchVPNInfo();
                    try {
                        InterfaceC16201efU interfaceC16201efU = this.OLrzqt.copydefault;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$0 = flowCollector2;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$1 = c13924dbk;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.J$0 = jFetchVPNInfo;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                        objEZpvd = interfaceC16201efU.EZpvd(jFetchVPNInfo, false, customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        flowCollector = flowCollector2;
                        j = jFetchVPNInfo;
                    } catch (Exception e) {
                        e = e;
                        c13924dbk2 = c13924dbk;
                        flowCollector = flowCollector2;
                        j = jFetchVPNInfo;
                        pUU.copydefault(">>>chain CustomTokenViewModel error  generalChainId :" + j + " - e:" + e);
                        c16263egd = new C16263egd(c13924dbk2, C16260ega.AEQbTJ().contains(C56443yFo.KWHzl(j)), false, null, null, false, 24, null);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objEZpvd);
                        return Unit.INSTANCE;
                    }
                    long j2 = customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.J$0;
                    c13924dbk = (C13924dbk) customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$1;
                    FlowCollector flowCollector3 = (FlowCollector) customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objEZpvd);
                        j = j2;
                        flowCollector = flowCollector3;
                    } catch (Exception e2) {
                        e = e2;
                        j = j2;
                        flowCollector = flowCollector3;
                        c13924dbk2 = c13924dbk;
                        pUU.copydefault(">>>chain CustomTokenViewModel error  generalChainId :" + j + " - e:" + e);
                        c16263egd = new C16263egd(c13924dbk2, C16260ega.AEQbTJ().contains(C56443yFo.KWHzl(j)), false, null, null, false, 24, null);
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                        customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                        if (flowCollector.emit(c16263egd, customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                ResponseData responseData = (ResponseData) objEZpvd;
                pUU.OLrzqt(">>>chain CustomTokenViewModel getCoinProtocolList generalChainId :" + j + " - protocolList:" + responseData);
                C10854bwM c10854bwMOLrzqt = c13924dbk.OLrzqt();
                StringBuilder sb = new StringBuilder();
                sb.append(">>>chain CustomTokenViewModel customCoin:");
                sb.append(c10854bwMOLrzqt);
                pUU.OLrzqt(sb.toString());
                boolean zContains = C16260ega.AEQbTJ().contains(C56443yFo.KWHzl(j));
                List listAhwBna = (List) responseData.getData();
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                c16263egd = new C16263egd(c13924dbk, zContains, C33129mqd.KWHzl((Collection) responseData.getData()), listAhwBna, null, false);
                customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(c16263egd, customTokenViewModel$observer$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, C16204efX c16204efX) {
            this.OLrzqt = flow;
            this.EZpvd = c16204efX;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super C16263egd> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActionBar actionBar = new ActionBar(FlowKt.distinctUntilChanged(this.this$0.copydefault()), this.this$0);
            final C16204efX c16204efX = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenViewModel$observer$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(C16263egd c16263egd, Continuation<? super Unit> continuation) {
                    MutableStateFlow<C16263egd> mutableStateFlowEZpvd = c16204efX.EZpvd();
                    while (!mutableStateFlowEZpvd.compareAndSet(mutableStateFlowEZpvd.getValue(), c16263egd)) {
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (actionBar.collect(flowCollector, this) == objCopydefault) {
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
