package com.okinc.business.defi.wallet.transfer.receive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16541elq;
import o.C10854bwM;
import o.C13754dXa;
import o.C21050gsT;
import o.C21053gsW;
import o.C33064mpR;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C59534zip;

/* JADX INFO: loaded from: classes5.dex */
public final class SmartWalletChainInfoBottomSheet$renderContent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC16541elq $dataBinding;
    final /* synthetic */ C59534zip $mAdapter;
    int label;
    final /* synthetic */ C21053gsW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartWalletChainInfoBottomSheet$renderContent$1(C21053gsW c21053gsW, AbstractC16541elq abstractC16541elq, C59534zip c59534zip, Continuation<? super SmartWalletChainInfoBottomSheet$renderContent$1> continuation) {
        super(2, continuation);
        this.this$0 = c21053gsW;
        this.$dataBinding = abstractC16541elq;
        this.$mAdapter = c59534zip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartWalletChainInfoBottomSheet$renderContent$1(this.this$0, this.$dataBinding, this.$mAdapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartWalletChainInfoBottomSheet$renderContent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.transfer.receive.SmartWalletChainInfoBottomSheet$renderContent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C21050gsT, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractC16541elq $dataBinding;
        final /* synthetic */ C59534zip $mAdapter;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C21053gsW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC16541elq abstractC16541elq, C21053gsW c21053gsW, C59534zip c59534zip, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dataBinding = abstractC16541elq;
            this.this$0 = c21053gsW;
            this.$mAdapter = c59534zip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dataBinding, this.this$0, this.$mAdapter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C21050gsT c21050gsT, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c21050gsT, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C21050gsT c21050gsT = (C21050gsT) this.L$0;
                if (c21050gsT == null) {
                    return Unit.INSTANCE;
                }
                this.$dataBinding.AEQbTJ.setText(C33069mpW.copydefault(this.this$0, C13754dXa.FragmentManager.GravityInt, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C56443yFo.AEQbTJ(c21050gsT.AEQbTJ())))));
                C59534zip c59534zip = this.$mAdapter;
                List<C10854bwM> listOLrzqt = c21050gsT.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C10854bwM) it.next()).copydefault());
                }
                C33064mpR.OLrzqt(c59534zip, arrayList);
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
            StateFlow<C21050gsT> stateFlowAEQbTJ = this.this$0.EZpvd().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dataBinding, this.this$0, this.$mAdapter, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
