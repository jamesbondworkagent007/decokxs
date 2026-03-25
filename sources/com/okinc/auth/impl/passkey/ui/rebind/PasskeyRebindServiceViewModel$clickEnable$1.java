package com.okinc.auth.impl.passkey.ui.rebind;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5991aGs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5906aFM;
import o.C5912aFS;
import o.C5914aFU;
import o.C5922aFc;
import o.C5941aFv;
import o.C6254aLq;
import o.C6307aMq;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindServiceViewModel$clickEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyPromotionAuthenticator $authenticator;
    final /* synthetic */ C6254aLq $fragment;
    final /* synthetic */ PasskeyScenario $scenario;
    final /* synthetic */ String $workflowToken;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyRebindServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceViewModel$clickEnable$1(PasskeyRebindServiceViewModel passkeyRebindServiceViewModel, String str, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyScenario passkeyScenario, C6254aLq c6254aLq, Continuation<? super PasskeyRebindServiceViewModel$clickEnable$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyRebindServiceViewModel;
        this.$workflowToken = str;
        this.$authenticator = passkeyPromotionAuthenticator;
        this.$scenario = passkeyScenario;
        this.$fragment = c6254aLq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceViewModel$clickEnable$1(this.this$0, this.$workflowToken, this.$authenticator, this.$scenario, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceViewModel$clickEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v18, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0284 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        PasskeyVersionState passkeyVersionState;
        MutableSharedFlow mutableSharedFlow;
        Unit unit;
        Object objAEQbTJ;
        AbstractC5991aGs abstractC5991aGs;
        AbstractC5991aGs abstractC5991aGs2;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl;
        MutableSharedFlow mutableSharedFlow3;
        Throwable thM7380exceptionOrNullimpl;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C6307aMq.EZpvd.OLrzqt();
                this.this$0.AuCTel.setValue(this.$workflowToken);
                this.this$0.OLrzqt.setValue(this.$authenticator);
                PasskeyScenario passkeyScenario = this.$scenario;
                PasskeyScenario.CedefiWallet cedefiWallet = passkeyScenario instanceof PasskeyScenario.CedefiWallet ? (PasskeyScenario.CedefiWallet) passkeyScenario : null;
                boolean zOLrzqt = cedefiWallet != null ? cedefiWallet.OLrzqt() : false;
                C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "is wallet recovery: " + zOLrzqt, 2, null);
                mutableLiveData = this.this$0.valueOf;
                InterfaceC8196ayF interfaceC8196ayF = this.this$0.fJNWhG;
                PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
                this.L$0 = mutableLiveData;
                this.label = 1;
                obj = interfaceC8196ayF.AEQbTJ(account, !zOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                mutableLiveData.setValue(obj);
                passkeyVersionState = (PasskeyVersionState) this.this$0.valueOf.getValue();
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.DeviceIncompatible.INSTANCE) || Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1HardwareIncompatible.INSTANCE) || Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1AndroidVersionIncompatible.INSTANCE)) {
                    mutableSharedFlow = this.this$0.DbNXlk;
                    unit = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 2;
                    if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ScreenLockDisabled.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.AkhnZx;
                    Unit unit2 = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                    if (mutableSharedFlow4.emit(unit2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1BiometricNotEnrolled.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.values;
                    Unit unit3 = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlow5.emit(unit3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2ChinaIp.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow6 = this.this$0.fetchVPNInfo;
                    Unit unit4 = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow6.emit(unit4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1NotInGreyScale.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow7 = this.this$0.ejfBZ;
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlow7.emit("Fido1NotInGreyScale", this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow8 = this.this$0.AYXKKw;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.L$0 = null;
                    this.label = 7;
                    if (mutableSharedFlow8.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5941aFv c5941aFv = this.this$0.iwGUEr;
                    this.label = 8;
                    obj = c5941aFv.copydefault(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        C5906aFM c5906aFM = this.this$0.getNewProxyInstance;
                        String str = this.$workflowToken;
                        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator = this.$authenticator;
                        this.label = 9;
                        obj = c5906aFM.EZpvd(str, passkeyPromotionAuthenticator, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC5991aGs = (AbstractC5991aGs) obj;
                        abstractC5991aGs2 = abstractC5991aGs;
                        mutableSharedFlow2 = this.this$0.AYXKKw;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = abstractC5991aGs2;
                        this.label = 11;
                        if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow3 = this.this$0.fIwbmz;
                        this.L$0 = null;
                        this.label = 12;
                        if (mutableSharedFlow3.emit(abstractC5991aGs2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        C5914aFU c5914aFU = this.this$0.AwvSrB;
                        String str2 = this.$workflowToken;
                        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator2 = this.$authenticator;
                        this.label = 10;
                        obj = c5914aFU.copydefault(str2, passkeyPromotionAuthenticator2, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC5991aGs = (AbstractC5991aGs) obj;
                        abstractC5991aGs2 = abstractC5991aGs;
                        mutableSharedFlow2 = this.this$0.AYXKKw;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = abstractC5991aGs2;
                        this.label = 11;
                        if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                        }
                        mutableSharedFlow3 = this.this$0.fIwbmz;
                        this.L$0 = null;
                        this.label = 12;
                        if (mutableSharedFlow3.emit(abstractC5991aGs2, this) == objCopydefault) {
                        }
                    }
                } else if (Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                    C5912aFS c5912aFS = this.this$0.zLjUOn;
                    String str3 = this.$workflowToken;
                    C6254aLq c6254aLq = this.$fragment;
                    this.L$0 = null;
                    this.label = 13;
                    objAEQbTJ = c5912aFS.AEQbTJ(str3, c6254aLq, 2, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    PasskeyRebindServiceViewModel passkeyRebindServiceViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                        MutableSharedFlow mutableSharedFlow9 = passkeyRebindServiceViewModel.copydefault;
                        this.L$0 = objAEQbTJ;
                        this.label = 14;
                        if (mutableSharedFlow9.emit((ActivateGuardUseCase.TaskDescription) objAEQbTJ, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    PasskeyRebindServiceViewModel passkeyRebindServiceViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableSharedFlow mutableSharedFlow10 = passkeyRebindServiceViewModel2.ejfBZ;
                        String message = thM7380exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        this.L$0 = objAEQbTJ;
                        this.label = 15;
                        if (mutableSharedFlow10.emit(message, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objAEQbTJ;
                        objAEQbTJ = obj2;
                    }
                    Result.m7376boximpl(objAEQbTJ);
                } else {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "passkey version state: " + this.this$0.valueOf.getValue(), 2, null);
                }
                return Unit.INSTANCE;
            case 1:
                mutableLiveData = (MutableLiveData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveData.setValue(obj);
                passkeyVersionState = (PasskeyVersionState) this.this$0.valueOf.getValue();
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.DeviceIncompatible.INSTANCE)) {
                    mutableSharedFlow = this.this$0.DbNXlk;
                    unit = Unit.INSTANCE;
                    this.L$0 = null;
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
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                C5941aFv c5941aFv2 = this.this$0.iwGUEr;
                this.label = 8;
                obj = c5941aFv2.copydefault(this);
                if (obj == objCopydefault) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 8:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 9:
                C56391yDq.AEQbTJ(obj);
                abstractC5991aGs = (AbstractC5991aGs) obj;
                abstractC5991aGs2 = abstractC5991aGs;
                mutableSharedFlow2 = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs2;
                this.label = 11;
                if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 12;
                if (mutableSharedFlow3.emit(abstractC5991aGs2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
                C56391yDq.AEQbTJ(obj);
                abstractC5991aGs = (AbstractC5991aGs) obj;
                abstractC5991aGs2 = abstractC5991aGs;
                mutableSharedFlow2 = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs2;
                this.label = 11;
                if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 12;
                if (mutableSharedFlow3.emit(abstractC5991aGs2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 11:
                abstractC5991aGs2 = (AbstractC5991aGs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 12;
                if (mutableSharedFlow3.emit(abstractC5991aGs2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 13:
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                PasskeyRebindServiceViewModel passkeyRebindServiceViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(objAEQbTJ)) {
                }
                PasskeyRebindServiceViewModel passkeyRebindServiceViewModel22 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objAEQbTJ);
                return Unit.INSTANCE;
            case 14:
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj3;
                PasskeyRebindServiceViewModel passkeyRebindServiceViewModel222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objAEQbTJ);
                return Unit.INSTANCE;
            case 15:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj2;
                Result.m7376boximpl(objAEQbTJ);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
