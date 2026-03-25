package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17015eun;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fKV;

/* JADX INFO: loaded from: classes23.dex */
public final class EscapedPassKeyWalletListActivity$observeUIState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapedPassKeyWalletListActivity$observeUIState$1(fKV fkv, Continuation<? super EscapedPassKeyWalletListActivity$observeUIState$1> continuation) {
        super(2, continuation);
        this.this$0 = fkv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapedPassKeyWalletListActivity$observeUIState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapedPassKeyWalletListActivity$observeUIState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapedPassKeyWalletListActivity$observeUIState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKV fkv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Boolean> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<Boolean>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<Boolean> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                AbstractC17015eun abstractC17015eun = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC17015eun abstractC17015eun2 = this.this$0.EZpvd;
                    if (abstractC17015eun2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17015eun = abstractC17015eun2;
                    }
                    abstractC17015eun.AYXKKw.AhwBna(((Boolean) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).booleanValue());
                } else {
                    AbstractC17015eun abstractC17015eun3 = this.this$0.EZpvd;
                    if (abstractC17015eun3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17015eun = abstractC17015eun3;
                    }
                    abstractC17015eun.AYXKKw.AhwBna(false);
                }
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
            StateFlow<InterfaceC49371unL<Boolean>> stateFlowAEQbTJ = this.this$0.AEQbTJ().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
