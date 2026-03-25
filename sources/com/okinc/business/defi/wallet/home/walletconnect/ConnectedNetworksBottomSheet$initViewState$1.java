package com.okinc.business.defi.wallet.home.walletconnect;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C10854bwM;
import o.C13754dXa;
import o.C16526elb;
import o.C18286ffY;
import o.C18346fgf;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.pTD;

/* JADX INFO: loaded from: classes18.dex */
public final class ConnectedNetworksBottomSheet$initViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18286ffY.TaskDescription $adapter;
    int label;
    final /* synthetic */ C18286ffY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectedNetworksBottomSheet$initViewState$1(C18286ffY c18286ffY, C18286ffY.TaskDescription taskDescription, Continuation<? super ConnectedNetworksBottomSheet$initViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = c18286ffY;
        this.$adapter = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectedNetworksBottomSheet$initViewState$1(this.this$0, this.$adapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConnectedNetworksBottomSheet$initViewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.ConnectedNetworksBottomSheet$initViewState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C18346fgf, Continuation<? super Unit>, Object> {
        final /* synthetic */ C18286ffY.TaskDescription $adapter;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C18286ffY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C18286ffY c18286ffY, C18286ffY.TaskDescription taskDescription, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c18286ffY;
            this.$adapter = taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$adapter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C18346fgf c18346fgf, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c18346fgf, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<C10854bwM> listGEmmrt = ((C18346fgf) this.L$0).gEmmrt();
                C16526elb c16526elb = this.this$0.OLrzqt;
                if (c16526elb == null) {
                    Intrinsics.gEmmrt("");
                    c16526elb = null;
                }
                c16526elb.copydefault.setText(pTD.KWHzl(this.this$0, C13754dXa.Dialog.AhwBna, listGEmmrt.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(listGEmmrt.size())))));
                this.$adapter.KWHzl(listGEmmrt);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<C18346fgf> stateFlowOLrzqt = this.this$0.OLrzqt().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$adapter, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
