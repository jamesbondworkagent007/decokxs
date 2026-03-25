package com.okinc.business.defi.wallet.hardware.onekey;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC15415eHm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.eGU;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletOneKeyScanningActivity$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eGU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletOneKeyScanningActivity$onCreate$1(eGU egu, Continuation<? super HardwareWalletOneKeyScanningActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = egu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletOneKeyScanningActivity$onCreate$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletOneKeyScanningActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$onCreate$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ eGU this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eGU egu, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = egu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyScanningActivity$onCreate$1$1$3, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass3 implements FlowCollector, InterfaceC56514yIe {
            public final /* synthetic */ eGU KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(eGU egu) {
                this.KWHzl = egu;
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
                return new AdaptedFunctionReference(2, this.KWHzl, eGU.class, "handleScanningState", "handleScanningState(Lcom/okinc/business/defi/wallet/hardware/onekey/OneKeyScanningUiState;)V", 4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC15415eHm interfaceC15415eHm, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleScanningState = AnonymousClass1.invokeSuspend$handleScanningState(this.KWHzl, interfaceC15415eHm, continuation);
                return objInvokeSuspend$handleScanningState == C56442yFn.copydefault() ? objInvokeSuspend$handleScanningState : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC15415eHm> stateFlowKWHzl = this.this$0.gEmmrt().KWHzl();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0);
                this.label = 1;
                if (stateFlowKWHzl.collect(anonymousClass3, this) == objCopydefault) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleScanningState(eGU egu, InterfaceC15415eHm interfaceC15415eHm, Continuation continuation) {
            egu.OLrzqt(interfaceC15415eHm);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eGU egu = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(egu, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(egu, state, anonymousClass1, this) == objCopydefault) {
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
