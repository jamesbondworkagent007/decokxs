package com.okinc.business.defi.wallet.common.tonconnect;

import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.tonconnect.network.SSEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C16058eck;
import o.C16066ecs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$startEventsListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$startEventsListener$1(C16058eck c16058eck, Continuation<? super TonConnectManager$startEventsListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$startEventsListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TonConnectManager$startEventsListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
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
        C16066ecs c16066ecs = this.this$0.AuCTel;
        List listQOLQEE = C56403yEb.QOLQEE(this.this$0.fARcdN.AhwBna().values());
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listQOLQEE, 10));
        Iterator it = listQOLQEE.iterator();
        while (it.hasNext()) {
            arrayList.add(((DAppSession) it.next()).getKeyPair().getPubKey());
        }
        Flow<SSEvent> flowCopydefault = c16066ecs.copydefault(arrayList, this.this$0.fARcdN.copydefault());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        this.label = 2;
        if (flowCopydefault.collect(anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.tonconnect.TonConnectManager$startEventsListener$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements FlowCollector, InterfaceC56514yIe {
        public final /* synthetic */ C16058eck KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(C16058eck c16058eck) {
            this.KWHzl = c16058eck;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.KWHzl, C16058eck.class, "handleIncomingSSEvent", "handleIncomingSSEvent(Lcom/okinc/business/defi/wallet/common/tonconnect/network/SSEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(SSEvent sSEvent, Continuation<? super Unit> continuation) throws Throwable {
            Object objAEQbTJ = this.KWHzl.AEQbTJ(sSEvent, (Continuation<? super Unit>) continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }
    }
}
