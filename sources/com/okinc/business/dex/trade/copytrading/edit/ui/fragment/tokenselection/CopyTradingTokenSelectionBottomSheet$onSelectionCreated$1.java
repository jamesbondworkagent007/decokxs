package com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection;

import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C19910gTw;
import o.C55198xfS;
import o.C55276xgr;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C55198xfS $selection;
    int label;
    final /* synthetic */ C19910gTw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1(C19910gTw c19910gTw, C55198xfS c55198xfS, Continuation<? super CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c19910gTw;
        this.$selection = c55198xfS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1(this.this$0, this.$selection, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<C55276xgr>> stateFlowEZpvd = this.this$0.AEQbTJ().EZpvd();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$selection, this.this$0);
            this.label = 1;
            if (stateFlowEZpvd.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.fragment.tokenselection.CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ C19910gTw EZpvd;
        public final /* synthetic */ C55198xfS KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(C55198xfS c55198xfS, C19910gTw c19910gTw) {
            this.KWHzl = c55198xfS;
            this.EZpvd = c19910gTw;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C55276xgr> list, Continuation<? super Unit> continuation) {
            C55198xfS c55198xfS = this.KWHzl;
            final C19910gTw c19910gTw = this.EZpvd;
            c55198xfS.setSingleOneColumnData(list, new yHO() { // from class: o.gTz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return CopyTradingTokenSelectionBottomSheet$onSelectionCreated$1.AnonymousClass4.OLrzqt(c19910gTw, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C19910gTw c19910gTw, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            Function2 function2 = c19910gTw.KWHzl;
            if (function2 != null) {
                Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
                Intrinsics.copydefault(objOLrzqt, "");
                function2.invoke((DexMultiTokenInfoBean) objOLrzqt, c19910gTw.AEQbTJ().copydefault());
            }
            c19910gTw.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }
}
