package com.okinc.auth.impl.passkey.ui.register.base;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5991aGs;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5913aFT;
import o.C5941aFv;
import o.C6307aMq;
import o.C6689aUA;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$postRegister$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeySdkResult $result;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$postRegister$1(PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, PasskeySdkResult passkeySdkResult, Continuation<? super PasskeyPromotionServiceBaseViewModel$postRegister$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceBaseViewModel;
        this.$result = passkeySdkResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$postRegister$1(this.this$0, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$postRegister$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v66, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeySdkResult passkeySdkResult;
        PasskeyScenario passkeyScenario;
        Object objKWHzl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        PasskeyScenario passkeyScenario2;
        Object objCopydefault;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl2;
        Object obj3;
        MutableSharedFlow mutableSharedFlow3;
        String strAYXKKw;
        PasskeyPromotionServiceBaseViewModel.Request request;
        PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel;
        AbstractC5991aGs abstractC5991aGs;
        MutableSharedFlow mutableSharedFlow4;
        Boolean boolKWHzl3;
        MutableSharedFlow mutableSharedFlow5;
        Object objCopydefault2 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow6 = this.this$0.gEmmrt;
                Boolean boolKWHzl4 = C56443yFo.KWHzl(false);
                this.label = 1;
                if (mutableSharedFlow6.emit(boolKWHzl4, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                passkeySdkResult = this.$result;
                if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
                    MutableSharedFlow mutableSharedFlow7 = this.this$0.gEmmrt;
                    Boolean boolKWHzl5 = C56443yFo.KWHzl(true);
                    this.label = 2;
                    if (mutableSharedFlow7.emit(boolKWHzl5, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    C5913aFT c5913aFT = this.this$0.AwvSrB;
                    String strCopydefault = ((PasskeySdkResult.SuccessWithJson) this.$result).copydefault();
                    passkeyScenario = (PasskeyScenario) this.this$0.fetchVPNInfo.getValue();
                    if (passkeyScenario == null) {
                        passkeyScenario = PasskeyScenario.Account.AEQbTJ;
                    }
                    this.label = 3;
                    objKWHzl = c5913aFT.KWHzl(strCopydefault, passkeyScenario, this);
                    if (objKWHzl == objCopydefault2) {
                        return objCopydefault2;
                    }
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objKWHzl;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    obj2 = objKWHzl;
                    this.this$0.OLrzqt(obj2);
                    C6689aUA.KWHzl.EZpvd();
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                    MutableSharedFlow mutableSharedFlow8 = this.this$0.gEmmrt;
                    Boolean boolKWHzl6 = C56443yFo.KWHzl(true);
                    this.label = 5;
                    if (mutableSharedFlow8.emit(boolKWHzl6, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    C5913aFT c5913aFT2 = this.this$0.AwvSrB;
                    PublicKeyCredential publicKeyCredentialOLrzqt = ((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt();
                    passkeyScenario2 = (PasskeyScenario) this.this$0.fetchVPNInfo.getValue();
                    if (passkeyScenario2 == null) {
                        passkeyScenario2 = PasskeyScenario.Account.AEQbTJ;
                    }
                    this.label = 6;
                    objCopydefault = c5913aFT2.copydefault(publicKeyCredentialOLrzqt, passkeyScenario2, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    mutableSharedFlow2 = this.this$0.gEmmrt;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = objCopydefault;
                    this.label = 7;
                    if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    obj3 = objCopydefault;
                    this.this$0.OLrzqt(obj3);
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                    if (((PasskeySdkResult.Failure) passkeySdkResult).AhwBna()) {
                        MutableSharedFlow mutableSharedFlow9 = this.this$0.valueOf;
                        Unit unit = Unit.INSTANCE;
                        this.label = 8;
                        if (mutableSharedFlow9.emit(unit, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).copydefault()) {
                        MutableSharedFlow mutableSharedFlow10 = this.this$0.copydefault;
                        Unit unit2 = Unit.INSTANCE;
                        this.label = 9;
                        if (mutableSharedFlow10.emit(unit2, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).djBIcL()) {
                        MutableSharedFlow mutableSharedFlow11 = this.this$0.KWHzl;
                        Unit unit3 = Unit.INSTANCE;
                        this.label = 10;
                        if (mutableSharedFlow11.emit(unit3, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        C5941aFv c5941aFv = this.this$0.getNewProxyInstance;
                        this.label = 11;
                        obj = c5941aFv.copydefault(this);
                        if (obj == objCopydefault2) {
                            return objCopydefault2;
                        }
                        if (((Boolean) obj).booleanValue() || !((PasskeySdkResult.Failure) this.$result).OLrzqt()) {
                            mutableSharedFlow3 = this.this$0.uzCIH;
                            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                            this.label = 16;
                            if (mutableSharedFlow3.emit(strAYXKKw, this) == objCopydefault2) {
                                return objCopydefault2;
                            }
                        } else {
                            request = (PasskeyPromotionServiceBaseViewModel.Request) this.this$0.isConnected.getValue();
                            if (request != null) {
                                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel2 = this.this$0;
                                MutableSharedFlow mutableSharedFlow12 = passkeyPromotionServiceBaseViewModel2.gEmmrt;
                                Boolean boolKWHzl7 = C56443yFo.KWHzl(true);
                                this.L$0 = passkeyPromotionServiceBaseViewModel2;
                                this.L$1 = request;
                                this.label = 12;
                                if (mutableSharedFlow12.emit(boolKWHzl7, this) == objCopydefault2) {
                                    return objCopydefault2;
                                }
                                passkeyPromotionServiceBaseViewModel = passkeyPromotionServiceBaseViewModel2;
                                this.L$0 = passkeyPromotionServiceBaseViewModel;
                                this.L$1 = null;
                                this.label = 13;
                                obj = passkeyPromotionServiceBaseViewModel.copydefault(request, (Continuation<? super AbstractC5991aGs>) this);
                                if (obj == objCopydefault2) {
                                    return objCopydefault2;
                                }
                                abstractC5991aGs = (AbstractC5991aGs) obj;
                                mutableSharedFlow4 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                                boolKWHzl3 = C56443yFo.KWHzl(false);
                                this.L$0 = passkeyPromotionServiceBaseViewModel;
                                this.L$1 = abstractC5991aGs;
                                this.label = 14;
                                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault2) {
                                    return objCopydefault2;
                                }
                                mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.AuCTel;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 15;
                                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault2) {
                                    return objCopydefault2;
                                }
                            }
                        }
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                    MutableSharedFlow mutableSharedFlow13 = this.this$0.AEQbTJ;
                    Unit unit4 = Unit.INSTANCE;
                    this.label = 17;
                    if (mutableSharedFlow13.emit(unit4, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                    if (this.this$0.DbNXlk.getValue() == PasskeyPromotionSource.SECURITY_CENTER) {
                        C6307aMq.EZpvd.KWHzl();
                    }
                } else if (!(passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                passkeySdkResult = this.$result;
                if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                C5913aFT c5913aFT3 = this.this$0.AwvSrB;
                String strCopydefault2 = ((PasskeySdkResult.SuccessWithJson) this.$result).copydefault();
                passkeyScenario = (PasskeyScenario) this.this$0.fetchVPNInfo.getValue();
                if (passkeyScenario == null) {
                }
                this.label = 3;
                objKWHzl = c5913aFT3.KWHzl(strCopydefault2, passkeyScenario, this);
                if (objKWHzl == objCopydefault2) {
                }
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objKWHzl;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objKWHzl;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
                }
                break;
            case 4:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(obj2);
                C6689aUA.KWHzl.EZpvd();
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                C5913aFT c5913aFT22 = this.this$0.AwvSrB;
                PublicKeyCredential publicKeyCredentialOLrzqt2 = ((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt();
                passkeyScenario2 = (PasskeyScenario) this.this$0.fetchVPNInfo.getValue();
                if (passkeyScenario2 == null) {
                }
                this.label = 6;
                objCopydefault = c5913aFT22.copydefault(publicKeyCredentialOLrzqt2, passkeyScenario2, this);
                if (objCopydefault == objCopydefault2) {
                }
                mutableSharedFlow2 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = objCopydefault;
                this.label = 7;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                mutableSharedFlow2 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = objCopydefault;
                this.label = 7;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
                }
                break;
            case 7:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt(obj3);
                return Unit.INSTANCE;
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 17:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 11:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    mutableSharedFlow3 = this.this$0.uzCIH;
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                    this.label = 16;
                    if (mutableSharedFlow3.emit(strAYXKKw, this) == objCopydefault2) {
                    }
                }
                return Unit.INSTANCE;
            case 12:
                request = (PasskeyPromotionServiceBaseViewModel.Request) this.L$1;
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = passkeyPromotionServiceBaseViewModel;
                this.L$1 = null;
                this.label = 13;
                obj = passkeyPromotionServiceBaseViewModel.copydefault(request, (Continuation<? super AbstractC5991aGs>) this);
                if (obj == objCopydefault2) {
                }
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow4 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = passkeyPromotionServiceBaseViewModel;
                this.L$1 = abstractC5991aGs;
                this.label = 14;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault2) {
                }
                mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.AuCTel;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            case 13:
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel3 = (PasskeyPromotionServiceBaseViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                passkeyPromotionServiceBaseViewModel = passkeyPromotionServiceBaseViewModel3;
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow4 = passkeyPromotionServiceBaseViewModel.gEmmrt;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = passkeyPromotionServiceBaseViewModel;
                this.L$1 = abstractC5991aGs;
                this.label = 14;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault2) {
                }
                mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.AuCTel;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            case 14:
                abstractC5991aGs = (AbstractC5991aGs) this.L$1;
                passkeyPromotionServiceBaseViewModel = (PasskeyPromotionServiceBaseViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow5 = passkeyPromotionServiceBaseViewModel.AuCTel;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
