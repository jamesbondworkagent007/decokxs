package com.okinc.business.market.features.smart_money.signal.domain;

import com.okinc.business.market.data.model.smart_money.SignalStatusUpdate;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C29503kuq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC29466kuF;

/* JADX INFO: loaded from: classes7.dex */
public final class GetSignalActivityListUseCase$subscribeWs$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $chains;
    int label;
    final /* synthetic */ C29503kuq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSignalActivityListUseCase$subscribeWs$3(C29503kuq c29503kuq, List<String> list, Continuation<? super GetSignalActivityListUseCase$subscribeWs$3> continuation) {
        super(2, continuation);
        this.this$0 = c29503kuq;
        this.$chains = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSignalActivityListUseCase$subscribeWs$3(this.this$0, this.$chains, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetSignalActivityListUseCase$subscribeWs$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC29466kuF interfaceC29466kuF = this.this$0.OLrzqt;
            List<String> list = this.$chains;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C33129mqd.gEmmrt((String) it.next()));
            }
            this.label = 1;
            obj = interfaceC29466kuF.AEQbTJ(arrayList, this);
            if (obj == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
        }
        final C29503kuq c29503kuq = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$3.4

            /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$3$4$Application */
            public final /* synthetic */ class Application {
                public static final /* synthetic */ int[] EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[SignalStatusUpdate.Type.values().length];
                    try {
                        iArr[SignalStatusUpdate.Type.UPDATE_EXPIRE_STATUS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SignalStatusUpdate.Type.UPDATE_SELL_RATIO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    EZpvd = iArr;
                }
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
            
                r6 = r6.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
            
                if (r6.hasNext() == false) goto L76;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
            
                r7 = (com.okinc.business.market.data.model.smart_money.SignalStatusUpdate) r6.next();
                r8 = com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$3.AnonymousClass4.Application.EZpvd[r7.EZpvd().ordinal()];
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
            
                if (r8 == 1) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
            
                if (r8 != 2) goto L61;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
            
                r7 = r7.AEQbTJ().OLrzqt();
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
            
                if (r7 == null) goto L87;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
            
                r12 = r5;
                r7 = r12.EZpvd((29360127 & 1) != 0 ? r12.isConnected : null, (29360127 & 2) != 0 ? r12.fJNWhG : null, (29360127 & 4) != 0 ? r12.AYXKKw : null, (29360127 & 8) != 0 ? r12.KWHzl : null, (29360127 & 16) != 0 ? r12.OLrzqt : null, (29360127 & 32) != 0 ? r12.EZpvd : null, (29360127 & 64) != 0 ? r12.copydefault : null, (29360127 & 128) != 0 ? r12.getNewProxyInstance : null, (29360127 & 256) != 0 ? r12.valueOf : null, (29360127 & 512) != 0 ? r12.uzCIH : null, (29360127 & 1024) != 0 ? r12.djBIcL : null, (29360127 & 2048) != 0 ? r12.AEQbTJ : null, (29360127 & 4096) != 0 ? r12.ejfBZ : 0, (29360127 & 8192) != 0 ? r12.iwGUEr : null, (29360127 & 16384) != 0 ? r12.hDKMBd : null, (29360127 & 32768) != 0 ? r12.getFieldNames : null, (29360127 & 65536) != 0 ? r12.gEmmrt : null, (29360127 & 131072) != 0 ? r12.DbNXlk : null, (29360127 & 262144) != 0 ? r12.AuCTel : null, (29360127 & 524288) != 0 ? r12.AhwBna : null, (29360127 & 1048576) != 0 ? r12.fetchVPNInfo : null, (29360127 & 2097152) != 0 ? r12.fARcdN : o.C33129mqd.djBIcL(r7), (29360127 & 4194304) != 0 ? r12.values : false, (29360127 & 8388608) != 0 ? r12.AkhnZx : null, (29360127 & 16777216) != 0 ? r12.fIwbmz : null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
            
                if (r7 != null) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
            
                r5 = r7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
            
                throw new kotlin.NoWhenBranchMatchedException();
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
            
                r7 = r7.AEQbTJ().EZpvd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0121, code lost:
            
                if (r7 == null) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
            
                if (o.C33129mqd.valueOf(r5.KWHzl()) > r7.longValue()) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
            
                r35 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
            
                r35 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
            
                r12 = r5;
                r7 = r12.EZpvd((29360127 & 1) != 0 ? r12.isConnected : null, (29360127 & 2) != 0 ? r12.fJNWhG : null, (29360127 & 4) != 0 ? r12.AYXKKw : null, (29360127 & 8) != 0 ? r12.KWHzl : null, (29360127 & 16) != 0 ? r12.OLrzqt : null, (29360127 & 32) != 0 ? r12.EZpvd : null, (29360127 & 64) != 0 ? r12.copydefault : null, (29360127 & 128) != 0 ? r12.getNewProxyInstance : null, (29360127 & 256) != 0 ? r12.valueOf : null, (29360127 & 512) != 0 ? r12.uzCIH : null, (29360127 & 1024) != 0 ? r12.djBIcL : null, (29360127 & 2048) != 0 ? r12.AEQbTJ : null, (29360127 & 4096) != 0 ? r12.ejfBZ : 0, (29360127 & 8192) != 0 ? r12.iwGUEr : null, (29360127 & 16384) != 0 ? r12.hDKMBd : null, (29360127 & 32768) != 0 ? r12.getFieldNames : null, (29360127 & 65536) != 0 ? r12.gEmmrt : null, (29360127 & 131072) != 0 ? r12.DbNXlk : null, (29360127 & 262144) != 0 ? r12.AuCTel : null, (29360127 & 524288) != 0 ? r12.AhwBna : null, (29360127 & 1048576) != 0 ? r12.fetchVPNInfo : null, (29360127 & 2097152) != 0 ? r12.fARcdN : 0.0f, (29360127 & 4194304) != 0 ? r12.values : r35, (29360127 & 8388608) != 0 ? r12.AkhnZx : null, (29360127 & 16777216) != 0 ? r12.fIwbmz : null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x016f, code lost:
            
                if (r7 != null) goto L82;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
            
                r4.add(r5);
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(List<SignalStatusUpdate> list2, Continuation<? super Unit> continuation) {
                Object value;
                ArrayList arrayList2;
                MutableStateFlow mutableStateFlow = c29503kuq.copydefault;
                do {
                    value = mutableStateFlow.getValue();
                    List<SignalUiModel> list3 = (List) value;
                    if (list3 != null) {
                        arrayList2 = new ArrayList(C56403yEb.AYXKKw(list3, 10));
                        for (SignalUiModel signalUiModel : list3) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it2 = list2.iterator();
                            while (true) {
                                boolean z = false;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                T next = it2.next();
                                SignalStatusUpdate signalStatusUpdate = (SignalStatusUpdate) next;
                                if (Intrinsics.EZpvd((Object) C33129mqd.gEmmrt(C56443yFo.KWHzl(signalStatusUpdate.AEQbTJ().KWHzl())), (Object) signalUiModel.EZpvd()) && Intrinsics.EZpvd((Object) signalStatusUpdate.AEQbTJ().AEQbTJ(), (Object) signalUiModel.isConnected())) {
                                    z = true;
                                }
                                int i2 = Application.EZpvd[signalStatusUpdate.EZpvd().ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    InfluencerType.TaskDescription taskDescription = InfluencerType.Companion;
                                    String strCopydefault = signalStatusUpdate.AEQbTJ().copydefault();
                                    if (strCopydefault == null) {
                                        strCopydefault = "";
                                    }
                                    InfluencerType influencerTypeAEQbTJ = taskDescription.AEQbTJ(strCopydefault);
                                    if (z && influencerTypeAEQbTJ == signalUiModel.valueOf()) {
                                        arrayList3.add(next);
                                    }
                                } else if (z) {
                                    arrayList3.add(next);
                                }
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList2));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
