package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C6268aMD;
import o.C6307aMq;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$clickEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C6268aMD $fragment;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$clickEnable$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseViewModel$clickEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
        this.$fragment = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$clickEnable$1(this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$clickEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v24, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyVersionState passkeyVersionState;
        MutableSharedFlow mutableSharedFlow;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C6307aMq.EZpvd.OLrzqt();
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel = this.this$0;
                this.label = 1;
                obj = passkeyPromotionServiceBaseViewModel.AEQbTJ(true, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                passkeyVersionState = (PasskeyVersionState) obj;
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.DeviceIncompatible.INSTANCE) || Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1HardwareIncompatible.INSTANCE) || Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1AndroidVersionIncompatible.INSTANCE)) {
                    mutableSharedFlow = this.this$0.ejfBZ;
                    unit = Unit.INSTANCE;
                    this.label = 2;
                    if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ScreenLockDisabled.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.fJNWhG;
                    Unit unit2 = Unit.INSTANCE;
                    this.label = 3;
                    if (mutableSharedFlow2.emit(unit2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1BiometricNotEnrolled.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.values;
                    Unit unit3 = Unit.INSTANCE;
                    this.label = 4;
                    if (mutableSharedFlow3.emit(unit3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ChinaIp.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.AkhnZx;
                    Unit unit4 = Unit.INSTANCE;
                    this.label = 5;
                    if (mutableSharedFlow4.emit(unit4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1NotInGreyScale.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.uzCIH;
                    this.label = 6;
                    if (mutableSharedFlow5.emit("Fido1NotInGreyScale", this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v1Compatible.INSTANCE) || Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                    if (Intrinsics.EZpvd(this.this$0.EZpvd.getValue(), C56443yFo.KWHzl(true))) {
                        PasskeyPromotionServiceBaseViewModel.Request request = (PasskeyPromotionServiceBaseViewModel.Request) this.this$0.isConnected.getValue();
                        if (request != null) {
                            this.this$0.copydefault(request, this.$fragment);
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow6 = this.this$0.ejfBZ;
                        Unit unit5 = Unit.INSTANCE;
                        this.label = 7;
                        if (mutableSharedFlow6.emit(unit5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE)) {
                    PasskeyPromotionServiceBaseViewModel.Request request2 = (PasskeyPromotionServiceBaseViewModel.Request) this.this$0.isConnected.getValue();
                    if (request2 != null) {
                        this.this$0.copydefault(request2, this.$fragment);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                passkeyVersionState = (PasskeyVersionState) obj;
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.DeviceIncompatible.INSTANCE)) {
                    mutableSharedFlow = this.this$0.ejfBZ;
                    unit = Unit.INSTANCE;
                    this.label = 2;
                    if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
