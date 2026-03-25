package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountPreCheckResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC17010eui;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.fJX;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class EscapePassKeyWalletAccessActivity$initData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fJX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletAccessActivity$initData$2(fJX fjx, Continuation<? super EscapePassKeyWalletAccessActivity$initData$2> continuation) {
        super(2, continuation);
        this.this$0 = fjx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletAccessActivity$initData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletAccessActivity$initData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletAccessActivity$initData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends AccountPreCheckResult>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fJX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fJX fjx, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fjx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49371unL<? extends AccountPreCheckResult> interfaceC49371unL, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                AbstractC17010eui abstractC17010eui = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    AbstractC17010eui abstractC17010eui2 = this.this$0.OLrzqt;
                    if (abstractC17010eui2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17010eui2 = null;
                    }
                    C52794wYp.startLoading$default(abstractC17010eui2.AEQbTJ, 0L, 1, null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    InterfaceC49371unL.Activity activity = (InterfaceC49371unL.Activity) interfaceC49371unL;
                    if (!Intrinsics.EZpvd(activity.copydefault(), AccountPreCheckResult.Success.copydefault)) {
                        this.this$0.copydefault((AccountPreCheckResult) activity.copydefault());
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    AbstractC17010eui abstractC17010eui3 = this.this$0.OLrzqt;
                    if (abstractC17010eui3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17010eui = abstractC17010eui3;
                    }
                    abstractC17010eui.AEQbTJ.fIwbmz();
                    InterfaceC49371unL.Application application = (InterfaceC49371unL.Application) interfaceC49371unL;
                    pUU.AEQbTJ("EscapePassKeyWalletAccessActivity", "preCheckAccountStatus error: " + application.AEQbTJ().getMessage(), application.AEQbTJ());
                    this.this$0.copydefault(new AccountPreCheckResult.OtherFailure(application.AEQbTJ()));
                } else {
                    AbstractC17010eui abstractC17010eui4 = this.this$0.OLrzqt;
                    if (abstractC17010eui4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17010eui = abstractC17010eui4;
                    }
                    abstractC17010eui.AEQbTJ.fIwbmz();
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
            StateFlow<InterfaceC49371unL<AccountPreCheckResult>> stateFlowKWHzl = this.this$0.EZpvd().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
