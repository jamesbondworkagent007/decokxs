package com.okinc.business.market.features.module.ui.detail.list;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28896kjS;
import o.C28899kjV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleDetailListViewModel$startWebsocket$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channel;
    int label;
    final /* synthetic */ ModuleDetailListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDetailListViewModel$startWebsocket$1$1(ModuleDetailListViewModel moduleDetailListViewModel, String str, Continuation<? super ModuleDetailListViewModel$startWebsocket$1$1> continuation) {
        super(2, continuation);
        this.this$0 = moduleDetailListViewModel;
        this.$channel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModuleDetailListViewModel$startWebsocket$1$1(this.this$0, this.$channel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModuleDetailListViewModel$startWebsocket$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = Intrinsics.EZpvd((Object) this.this$0.gEmmrt, (Object) "all") ? "-100" : this.this$0.gEmmrt;
            C28896kjS c28896kjS = this.this$0.isConnected;
            String str2 = this.$channel;
            this.label = 1;
            obj = c28896kjS.copydefault(str2, str, this);
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
        final ModuleDetailListViewModel moduleDetailListViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListViewModel$startWebsocket$1$1.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(C28899kjV c28899kjV, Continuation<? super Unit> continuation) {
                if (c28899kjV != null) {
                    ModuleDetailListViewModel moduleDetailListViewModel2 = moduleDetailListViewModel;
                    C28899kjV c28899kjVOLrzqt = moduleDetailListViewModel2.OLrzqt();
                    String strValues = c28899kjVOLrzqt != null ? c28899kjVOLrzqt.values() : null;
                    String strValues2 = (strValues == null || strValues.length() == 0) ? c28899kjV.values() : strValues;
                    C28899kjV c28899kjVOLrzqt2 = moduleDetailListViewModel2.OLrzqt();
                    String strOLrzqt = c28899kjVOLrzqt2 != null ? c28899kjVOLrzqt2.OLrzqt() : null;
                    String strOLrzqt2 = (strOLrzqt == null || strOLrzqt.length() == 0) ? c28899kjV.OLrzqt() : strOLrzqt;
                    C28899kjV c28899kjVOLrzqt3 = moduleDetailListViewModel2.OLrzqt();
                    boolean zEjfBZ = c28899kjVOLrzqt3 != null ? c28899kjVOLrzqt3.ejfBZ() : false;
                    C28899kjV c28899kjVOLrzqt4 = moduleDetailListViewModel2.OLrzqt();
                    moduleDetailListViewModel2.AYXKKw = c28899kjV.EZpvd((1046527 & 1) != 0 ? c28899kjV.values : false, (1046527 & 2) != 0 ? c28899kjV.AuCTel : strValues2, (1046527 & 4) != 0 ? c28899kjV.AEQbTJ : strOLrzqt2, (1046527 & 8) != 0 ? c28899kjV.copydefault : null, (1046527 & 16) != 0 ? c28899kjV.fARcdN : null, (1046527 & 32) != 0 ? c28899kjV.AhwBna : null, (1046527 & 64) != 0 ? c28899kjV.fJNWhG : null, (1046527 & 128) != 0 ? c28899kjV.gEmmrt : null, (1046527 & 256) != 0 ? c28899kjV.djBIcL : null, (1046527 & 512) != 0 ? c28899kjV.OLrzqt : null, (1046527 & 1024) != 0 ? c28899kjV.EZpvd : null, (1046527 & 2048) != 0 ? c28899kjV.fIwbmz : null, (1046527 & 4096) != 0 ? c28899kjV.ejfBZ : null, (1046527 & 8192) != 0 ? c28899kjV.isConnected : null, (1046527 & 16384) != 0 ? c28899kjV.AkhnZx : null, (1046527 & 32768) != 0 ? c28899kjV.AYXKKw : null, (1046527 & 65536) != 0 ? c28899kjV.fetchVPNInfo : null, (1046527 & 131072) != 0 ? c28899kjV.valueOf : zEjfBZ, (1046527 & 262144) != 0 ? c28899kjV.DbNXlk : c28899kjVOLrzqt4 != null ? c28899kjVOLrzqt4.djBIcL() : null, (1046527 & 524288) != 0 ? c28899kjV.KWHzl : null);
                    ModuleDetailListViewModel.sortModule$default(moduleDetailListViewModel2, null, null, true, 3, null);
                }
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
