package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17006eue;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fKG;
import o.fKK;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePasskeyWalletSignActivity$observeUIState$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fKK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePasskeyWalletSignActivity$observeUIState$4(fKK fkk, Continuation<? super EscapePasskeyWalletSignActivity$observeUIState$4> continuation) {
        super(2, continuation);
        this.this$0 = fkk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePasskeyWalletSignActivity$observeUIState$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePasskeyWalletSignActivity$observeUIState$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePasskeyWalletSignActivity$observeUIState$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends Long>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fKK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fKK fkk, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fkk;
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
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends Long>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return invoke2((InterfaceC49371unL<? extends List<Long>>) interfaceC49371unL, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC49371unL<? extends List<Long>> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    AbstractC17006eue abstractC17006eue = this.this$0.copydefault;
                    if (abstractC17006eue == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17006eue = null;
                    }
                    C52794wYp.startLoading$default(abstractC17006eue.OLrzqt, 0L, 1, null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC17006eue abstractC17006eue2 = this.this$0.copydefault;
                    if (abstractC17006eue2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17006eue2 = null;
                    }
                    abstractC17006eue2.OLrzqt.fIwbmz();
                    fKG.Companion.AEQbTJ(this.this$0, new EscapeStatusInput(ProjectSource.CeDeFi, (String) null, 2, (DefaultConstructorMarker) null));
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    AbstractC17006eue abstractC17006eue3 = this.this$0.copydefault;
                    if (abstractC17006eue3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17006eue3 = null;
                    }
                    abstractC17006eue3.OLrzqt.fIwbmz();
                    InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
                    String message = application.AEQbTJ().getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                    }
                    pUU.AEQbTJ("EscapePasskeyWalletSignActivity", "batchAllEscapeTransactionFlow error: ", application.AEQbTJ());
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
            StateFlow<InterfaceC49371unL<List<Long>>> stateFlowCopydefault = this.this$0.gEmmrt().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
