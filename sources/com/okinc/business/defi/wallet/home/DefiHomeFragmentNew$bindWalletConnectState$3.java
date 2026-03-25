package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$bindWalletConnectState$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C15572eNh;
import o.C16061ecn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58227yxM;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$bindWalletConnectState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$bindWalletConnectState$3(C15572eNh c15572eNh, Continuation<? super DefiHomeFragmentNew$bindWalletConnectState$3> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$bindWalletConnectState$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$bindWalletConnectState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C16061ecn> flowAYXKKw = this.this$0.QVAiDq().AYXKKw();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (flowAYXKKw.collect(anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$bindWalletConnectState$3$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ C15572eNh AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(C15572eNh c15572eNh) {
            this.AEQbTJ = c15572eNh;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(C16061ecn c16061ecn, Continuation<? super Unit> continuation) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final C15572eNh c15572eNh = this.AEQbTJ;
            final Function1 function1 = new Function1() { // from class: o.eOR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeFragmentNew$bindWalletConnectState$3.AnonymousClass1.EZpvd(c15572eNh, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eON
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DefiHomeFragmentNew$bindWalletConnectState$3.AnonymousClass1.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eOU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DefiHomeFragmentNew$bindWalletConnectState$3.AnonymousClass1.KWHzl((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eOS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DefiHomeFragmentNew$bindWalletConnectState$3.AnonymousClass1.OLrzqt(function12, obj);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(C15572eNh c15572eNh, AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.copydefault(abstractC12782ctV);
            c15572eNh.AhwBna(abstractC12782ctV);
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(Throwable th) {
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, Object obj) {
            function1.invoke(obj);
        }
    }
}
