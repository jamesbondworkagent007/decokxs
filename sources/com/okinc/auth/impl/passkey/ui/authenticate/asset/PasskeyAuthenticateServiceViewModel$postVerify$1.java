package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5990aGr;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5941aFv;
import o.C5973aGa;
import o.C6617aSi;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyAuthenticateServiceViewModel$postVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeySdkResult $result;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyAuthenticateServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceViewModel$postVerify$1(PasskeySdkResult passkeySdkResult, PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModel, Continuation<? super PasskeyAuthenticateServiceViewModel$postVerify$1> continuation) {
        super(2, continuation);
        this.$result = passkeySdkResult;
        this.this$0 = passkeyAuthenticateServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateServiceViewModel$postVerify$1(this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceViewModel$postVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0237 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        String strKWHzl;
        PasskeyState.AuthenticateError authenticateError;
        AbstractC5990aGr abstractC5990aGr;
        MutableSharedFlow mutableSharedFlow3;
        Boolean boolKWHzl2;
        MutableSharedFlow mutableSharedFlow4;
        MutableSharedFlow mutableSharedFlow5;
        Boolean boolKWHzl3;
        MutableSharedFlow mutableSharedFlow6;
        String strAYXKKw;
        MutableSharedFlow mutableSharedFlow7;
        Boolean boolKWHzl4;
        MutableSharedFlow mutableSharedFlow8;
        Boolean boolKWHzl5;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeySdkResult passkeySdkResult = this.$result;
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson) {
                    MutableSharedFlow mutableSharedFlow9 = this.this$0.OLrzqt;
                    PasskeyState.Success success = new PasskeyState.Success(C6617aSi.copydefault(((PasskeySdkResult.SuccessWithJson) this.$result).copydefault()));
                    this.label = 1;
                    if (mutableSharedFlow9.emit(success, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                    MutableSharedFlow mutableSharedFlow10 = this.this$0.OLrzqt;
                    PasskeyState.Success success2 = new PasskeyState.Success(C6617aSi.EZpvd(((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt()));
                    this.label = 2;
                    if (mutableSharedFlow10.emit(success2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                    MutableSharedFlow mutableSharedFlow11 = this.this$0.KWHzl;
                    Boolean boolKWHzl6 = C56443yFo.KWHzl(false);
                    this.label = 3;
                    if (mutableSharedFlow11.emit(boolKWHzl6, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((PasskeySdkResult.Failure) this.$result).AhwBna()) {
                        MutableSharedFlow mutableSharedFlow12 = this.this$0.AEQbTJ;
                        Unit unit = Unit.INSTANCE;
                        this.label = 5;
                        if (mutableSharedFlow12.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).djBIcL()) {
                        MutableSharedFlow mutableSharedFlow13 = this.this$0.copydefault;
                        Unit unit2 = Unit.INSTANCE;
                        this.label = 6;
                        if (mutableSharedFlow13.emit(unit2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        C5941aFv c5941aFv = this.this$0.AhwBna;
                        this.label = 7;
                        obj = c5941aFv.copydefault(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        if (((Boolean) obj).booleanValue() || !((PasskeySdkResult.Failure) this.$result).OLrzqt()) {
                            mutableSharedFlow2 = this.this$0.OLrzqt;
                            strKWHzl = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                            if (strKWHzl == null) {
                                strKWHzl = "";
                            }
                            authenticateError = new PasskeyState.AuthenticateError(strKWHzl);
                            this.label = 12;
                            if (mutableSharedFlow2.emit(authenticateError, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow14 = this.this$0.gEmmrt;
                            Boolean boolKWHzl7 = C56443yFo.KWHzl(true);
                            this.label = 8;
                            if (mutableSharedFlow14.emit(boolKWHzl7, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            C5973aGa c5973aGa = this.this$0.fARcdN;
                            this.label = 9;
                            obj = c5973aGa.copydefault(this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            abstractC5990aGr = (AbstractC5990aGr) obj;
                            mutableSharedFlow3 = this.this$0.gEmmrt;
                            boolKWHzl2 = C56443yFo.KWHzl(false);
                            this.L$0 = abstractC5990aGr;
                            this.label = 10;
                            if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow4 = this.this$0.valueOf;
                            this.L$0 = null;
                            this.label = 11;
                            if (mutableSharedFlow4.emit(abstractC5990aGr, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                    MutableSharedFlow mutableSharedFlow15 = this.this$0.KWHzl;
                    Boolean boolKWHzl8 = C56443yFo.KWHzl(false);
                    this.label = 13;
                    if (mutableSharedFlow15.emit(boolKWHzl8, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow5 = this.this$0.gEmmrt;
                    boolKWHzl3 = C56443yFo.KWHzl(false);
                    this.label = 14;
                    if (mutableSharedFlow5.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow6 = this.this$0.AYXKKw;
                    strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                    this.label = 15;
                    if (mutableSharedFlow6.emit(strAYXKKw, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) {
                    MutableSharedFlow mutableSharedFlow16 = this.this$0.KWHzl;
                    Boolean boolKWHzl9 = C56443yFo.KWHzl(false);
                    this.label = 16;
                    if (mutableSharedFlow16.emit(boolKWHzl9, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow7 = this.this$0.gEmmrt;
                    boolKWHzl4 = C56443yFo.KWHzl(false);
                    this.label = 17;
                    if (mutableSharedFlow7.emit(boolKWHzl4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey) {
                    MutableSharedFlow mutableSharedFlow17 = this.this$0.KWHzl;
                    Boolean boolKWHzl10 = C56443yFo.KWHzl(false);
                    this.label = 18;
                    if (mutableSharedFlow17.emit(boolKWHzl10, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow8 = this.this$0.gEmmrt;
                    boolKWHzl5 = C56443yFo.KWHzl(false);
                    this.label = 19;
                    if (mutableSharedFlow8.emit(boolKWHzl5, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
            case 2:
            case 5:
            case 6:
            case 11:
            case 12:
            case 15:
            case 17:
            case 19:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                if (((PasskeySdkResult.Failure) this.$result).AhwBna()) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                if (((PasskeySdkResult.Failure) this.$result).AhwBna()) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    break;
                }
                mutableSharedFlow2 = this.this$0.OLrzqt;
                strKWHzl = ((PasskeySdkResult.Failure) this.$result).KWHzl();
                if (strKWHzl == null) {
                }
                authenticateError = new PasskeyState.AuthenticateError(strKWHzl);
                this.label = 12;
                if (mutableSharedFlow2.emit(authenticateError, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                C5973aGa c5973aGa2 = this.this$0.fARcdN;
                this.label = 9;
                obj = c5973aGa2.copydefault(this);
                if (obj == objCopydefault) {
                }
                abstractC5990aGr = (AbstractC5990aGr) obj;
                mutableSharedFlow3 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5990aGr;
                this.label = 10;
                if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                }
                mutableSharedFlow4 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 11;
                if (mutableSharedFlow4.emit(abstractC5990aGr, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 9:
                C56391yDq.AEQbTJ(obj);
                abstractC5990aGr = (AbstractC5990aGr) obj;
                mutableSharedFlow3 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5990aGr;
                this.label = 10;
                if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                }
                mutableSharedFlow4 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 11;
                if (mutableSharedFlow4.emit(abstractC5990aGr, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 10:
                abstractC5990aGr = (AbstractC5990aGr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow4 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 11;
                if (mutableSharedFlow4.emit(abstractC5990aGr, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 13:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow5 = this.this$0.gEmmrt;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.label = 14;
                if (mutableSharedFlow5.emit(boolKWHzl3, this) == objCopydefault) {
                }
                mutableSharedFlow6 = this.this$0.AYXKKw;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                this.label = 15;
                if (mutableSharedFlow6.emit(strAYXKKw, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 14:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow6 = this.this$0.AYXKKw;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                this.label = 15;
                if (mutableSharedFlow6.emit(strAYXKKw, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 16:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow7 = this.this$0.gEmmrt;
                boolKWHzl4 = C56443yFo.KWHzl(false);
                this.label = 17;
                if (mutableSharedFlow7.emit(boolKWHzl4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 18:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow8 = this.this$0.gEmmrt;
                boolKWHzl5 = C56443yFo.KWHzl(false);
                this.label = 19;
                if (mutableSharedFlow8.emit(boolKWHzl5, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
