package com.okinc.business.defi.wallet.tx.send.receiveAddress;

import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C19574gHk;
import o.C19586gHw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19585gHv;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSendCoinReceiveAddressViewModel$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19586gHw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSendCoinReceiveAddressViewModel$observeData$1(C19586gHw c19586gHw, Continuation<? super WalletSendCoinReceiveAddressViewModel$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = c19586gHw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSendCoinReceiveAddressViewModel$observeData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSendCoinReceiveAddressViewModel$observeData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC19585gHv interfaceC19585gHv = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC19585gHv.OLrzqt(this);
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
        TaskDescription taskDescription = new TaskDescription((Flow) obj, this.this$0);
        final C19586gHw c19586gHw = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.tx.send.receiveAddress.WalletSendCoinReceiveAddressViewModel$observeData$1.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArrayList<C19574gHk> arrayList, Continuation<? super Unit> continuation) {
                pUU.OLrzqt(">>>Revamp collect listData:" + arrayList.size());
                Object objEmit = c19586gHw.copydefault.emit(arrayList, continuation);
                return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (taskDescription.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements Flow<ArrayList<C19574gHk>> {
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ C19586gHw copydefault;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.send.receiveAddress.WalletSendCoinReceiveAddressViewModel$observeData$1$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C19586gHw AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C19586gHw c19586gHw) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = c19586gHw;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1 walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1;
                if (continuation instanceof WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1) {
                    walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1 = (WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1 = new WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    C19586gHw c19586gHw = this.AEQbTJ;
                    ArrayList arrayListOLrzqt = c19586gHw.OLrzqt((ArrayList) obj, SendCoinGroup.valueOf(c19586gHw.EZpvd()));
                    walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayListOLrzqt, walletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C19586gHw c19586gHw) {
            this.KWHzl = flow;
            this.copydefault = c19586gHw;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ArrayList<C19574gHk>> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
