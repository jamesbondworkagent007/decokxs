package com.okinc.auth.impl.passkey.ui.start;

import com.okinc.auth.api.passkey.PasskeyRegisterState;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.ui.start.PasskeyStartForAssetWithdrawViewModel;
import com.okinc.okuser.data.UserInfo;
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
import o.InterfaceC8108awX;
import o.InterfaceC8196ayF;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PasskeyStartForAssetWithdrawViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1(PasskeyStartForAssetWithdrawViewModel passkeyStartForAssetWithdrawViewModel, Continuation<? super PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyStartForAssetWithdrawViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyStartForAssetWithdrawViewModel$runPreStartPasskeyChecking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCheckPasskeyCompatible$default;
        PasskeyStartForAssetWithdrawViewModel.ActionBar stateListAnimator;
        Object objAEQbTJ;
        MutableSharedFlow mutableSharedFlow;
        PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription taskDescription;
        Boolean boolKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
            PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription taskDescription2 = new PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription(true);
            this.label = 1;
            if (mutableSharedFlow3.emit(taskDescription2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objCheckPasskeyCompatible$default = obj;
                    if (!((Boolean) objCheckPasskeyCompatible$default).booleanValue()) {
                        InterfaceC8108awX interfaceC8108awX = this.this$0.OLrzqt;
                        this.label = 3;
                        objAEQbTJ = interfaceC8108awX.AEQbTJ(true, this);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        UserInfo userInfo = (UserInfo) objAEQbTJ;
                        if (userInfo == null) {
                            pUU.KWHzl("PasskeyStartForAssetWithdrawViewModel", "runPreStartPasskeyChecking userInfo.fidoReady: " + (userInfo == null && userInfo.getFidoReady()));
                            if (userInfo == null) {
                            }
                            if (!Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true))) {
                            }
                            mutableSharedFlow = this.this$0.KWHzl;
                            taskDescription = new PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription(false);
                            this.L$0 = stateListAnimator;
                            this.label = 4;
                            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                            }
                            mutableSharedFlow2 = this.this$0.KWHzl;
                            this.L$0 = null;
                            this.label = 5;
                            if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    stateListAnimator = new PasskeyStartForAssetWithdrawViewModel.ActionBar.StateListAnimator(PasskeyRegisterState.DeviceNotCompatible.KWHzl);
                    mutableSharedFlow = this.this$0.KWHzl;
                    taskDescription = new PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription(false);
                    this.L$0 = stateListAnimator;
                    this.label = 4;
                    if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                    }
                    mutableSharedFlow2 = this.this$0.KWHzl;
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    stateListAnimator = (PasskeyStartForAssetWithdrawViewModel.ActionBar) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow2 = this.this$0.KWHzl;
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                UserInfo userInfo2 = (UserInfo) objAEQbTJ;
                pUU.KWHzl("PasskeyStartForAssetWithdrawViewModel", "runPreStartPasskeyChecking userInfo.fidoReady: " + (userInfo2 == null && userInfo2.getFidoReady()));
                boolKWHzl = userInfo2 == null ? C56443yFo.KWHzl(userInfo2.getFidoReady()) : null;
                if (!Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(true))) {
                    stateListAnimator = PasskeyStartForAssetWithdrawViewModel.ActionBar.C0240ActionBar.copydefault;
                } else if (Intrinsics.EZpvd(boolKWHzl, C56443yFo.KWHzl(false))) {
                    stateListAnimator = PasskeyStartForAssetWithdrawViewModel.ActionBar.Application.copydefault;
                } else {
                    if (boolKWHzl != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stateListAnimator = new PasskeyStartForAssetWithdrawViewModel.ActionBar.StateListAnimator(PasskeyRegisterState.Failure.KWHzl);
                }
                mutableSharedFlow = this.this$0.KWHzl;
                taskDescription = new PasskeyStartForAssetWithdrawViewModel.ActionBar.TaskDescription(false);
                this.L$0 = stateListAnimator;
                this.label = 4;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow2 = this.this$0.KWHzl;
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow2.emit(stateListAnimator, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC8196ayF interfaceC8196ayF = this.this$0.copydefault;
        PasskeyScenario.Asset asset = new PasskeyScenario.Asset(false);
        this.label = 2;
        objCheckPasskeyCompatible$default = InterfaceC8196ayF.Activity.checkPasskeyCompatible$default(interfaceC8196ayF, asset, false, this, 2, null);
        if (objCheckPasskeyCompatible$default == objCopydefault) {
            return objCopydefault;
        }
        if (!((Boolean) objCheckPasskeyCompatible$default).booleanValue()) {
        }
    }
}
