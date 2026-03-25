package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import com.okinc.auth.api.passkey.PasskeyScenario;
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
import o.C5944aFy;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyScenario $scenario;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyPromotionServiceWIthPasskeyStepperViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1(PasskeyScenario passkeyScenario, PasskeyPromotionServiceWIthPasskeyStepperViewModel passkeyPromotionServiceWIthPasskeyStepperViewModel, Continuation<? super PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1> continuation) {
        super(2, continuation);
        this.$scenario = passkeyScenario;
        this.this$0 = passkeyPromotionServiceWIthPasskeyStepperViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1(this.$scenario, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5944aFy.ActionBar actionBar;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeyScenario passkeyScenario = this.$scenario;
                if (!Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Pay.EZpvd)) {
                    if ((passkeyScenario instanceof PasskeyScenario.Asset) || Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Account.AEQbTJ)) {
                        this.this$0.djBIcL();
                    } else if (passkeyScenario instanceof PasskeyScenario.CedefiWallet) {
                        MutableSharedFlow mutableSharedFlow2 = this.this$0.EZpvd;
                        Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                        this.label = 1;
                        if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        C5944aFy c5944aFy = this.this$0.fetchVPNInfo;
                        this.label = 2;
                        obj = c5944aFy.OLrzqt(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        actionBar = (C5944aFy.ActionBar) obj;
                        mutableSharedFlow = this.this$0.EZpvd;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = actionBar;
                        this.label = 3;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        if (!Intrinsics.EZpvd(actionBar, C5944aFy.ActionBar.StateListAnimator.EZpvd)) {
                            this.this$0.djBIcL();
                        } else if (actionBar instanceof C5944aFy.ActionBar.Application) {
                            MutableSharedFlow mutableSharedFlow3 = this.this$0.OLrzqt;
                            String strEZpvd = ((C5944aFy.ActionBar.Application) actionBar).EZpvd();
                            this.L$0 = null;
                            this.label = 4;
                            if (mutableSharedFlow3.emit(strEZpvd, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else if (actionBar instanceof C5944aFy.ActionBar.TaskDescription) {
                            MutableSharedFlow mutableSharedFlow4 = this.this$0.KWHzl;
                            String strAEQbTJ = ((C5944aFy.ActionBar.TaskDescription) actionBar).AEQbTJ();
                            this.L$0 = null;
                            this.label = 5;
                            if (mutableSharedFlow4.emit(strAEQbTJ, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else if (actionBar instanceof C5944aFy.ActionBar.C0820ActionBar) {
                            MutableSharedFlow mutableSharedFlow5 = this.this$0.AYXKKw;
                            String message = ((C5944aFy.ActionBar.C0820ActionBar) actionBar).OLrzqt().getMessage();
                            if (message == null) {
                                message = "";
                            }
                            this.L$0 = null;
                            this.label = 6;
                            if (mutableSharedFlow5.emit(message, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                C5944aFy c5944aFy2 = this.this$0.fetchVPNInfo;
                this.label = 2;
                obj = c5944aFy2.OLrzqt(this);
                if (obj == objCopydefault) {
                }
                actionBar = (C5944aFy.ActionBar) obj;
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = actionBar;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (!Intrinsics.EZpvd(actionBar, C5944aFy.ActionBar.StateListAnimator.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                actionBar = (C5944aFy.ActionBar) obj;
                mutableSharedFlow = this.this$0.EZpvd;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = actionBar;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (!Intrinsics.EZpvd(actionBar, C5944aFy.ActionBar.StateListAnimator.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 3:
                actionBar = (C5944aFy.ActionBar) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!Intrinsics.EZpvd(actionBar, C5944aFy.ActionBar.StateListAnimator.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
