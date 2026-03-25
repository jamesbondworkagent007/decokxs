package com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.model.RecoveryWarningType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC17078evx;
import o.C17632fMn;
import o.C17637fMs;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fLW;

/* JADX INFO: loaded from: classes18.dex */
public final class RecoverPassKeyWalletAccessActivity$observeState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fLW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecoverPassKeyWalletAccessActivity$observeState$3(fLW flw, Continuation<? super RecoverPassKeyWalletAccessActivity$observeState$3> continuation) {
        super(2, continuation);
        this.this$0 = flw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoverPassKeyWalletAccessActivity$observeState$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoverPassKeyWalletAccessActivity$observeState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.passkey.cedefi.recovery.ui.activity.RecoverPassKeyWalletAccessActivity$observeState$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fLW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fLW flw, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = flw;
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
            C17637fMs c17637fMs;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
                AbstractC17078evx abstractC17078evx = null;
                boolKWHzl = null;
                Boolean boolKWHzl = null;
                if (interfaceC49371unL instanceof InterfaceC49371unL.ActionBar) {
                    AbstractC17078evx abstractC17078evx2 = this.this$0.gEmmrt;
                    if (abstractC17078evx2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17078evx2 = null;
                    }
                    C52794wYp.startLoading$default(abstractC17078evx2.KWHzl, 0L, 1, null);
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Activity) {
                    AbstractC17078evx abstractC17078evx3 = this.this$0.gEmmrt;
                    if (abstractC17078evx3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC17078evx3 = null;
                    }
                    abstractC17078evx3.KWHzl.fIwbmz();
                    if (((Boolean) ((InterfaceC49371unL.Activity) interfaceC49371unL).copydefault()).booleanValue()) {
                        InterfaceC49371unL<C17637fMs> value = this.this$0.AYXKKw().copydefault().getValue();
                        InterfaceC49371unL.Activity activity = value instanceof InterfaceC49371unL.Activity ? (InterfaceC49371unL.Activity) value : null;
                        if (activity != null && (c17637fMs = (C17637fMs) activity.copydefault()) != null) {
                            boolKWHzl = C56443yFo.KWHzl(c17637fMs.copydefault());
                        }
                        if (!Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true))) {
                            this.this$0.AYXKKw().EZpvd();
                        } else {
                            C17632fMn.Companion.EZpvd(RecoveryWarningType.OVER_LIMIT.getValue()).show(this.this$0.getSupportFragmentManager(), "RecoverOverLimitBottomSheet");
                        }
                    } else {
                        C17632fMn.Companion.EZpvd(RecoveryWarningType.DEVICE_NOT_SUPPORT_PASSKEY.getValue()).show(this.this$0.getSupportFragmentManager(), "RecoverOverLimitBottomSheet");
                    }
                } else if (interfaceC49371unL instanceof InterfaceC49371unL.Application) {
                    AbstractC17078evx abstractC17078evx4 = this.this$0.gEmmrt;
                    if (abstractC17078evx4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17078evx = abstractC17078evx4;
                    }
                    abstractC17078evx.KWHzl.fIwbmz();
                    C55326xho.toast$default(((InterfaceC49371unL.Application) interfaceC49371unL).AEQbTJ().getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
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
            SharedFlow<InterfaceC49371unL<Boolean>> sharedFlowKWHzl = this.this$0.AYXKKw().KWHzl();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowKWHzl, anonymousClass1, this) == objCopydefault) {
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
