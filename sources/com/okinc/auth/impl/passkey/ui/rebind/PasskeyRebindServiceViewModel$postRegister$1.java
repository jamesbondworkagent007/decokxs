package com.okinc.auth.impl.passkey.ui.rebind;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeySdkResult;
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
import o.C5906aFM;
import o.C5914aFU;
import o.C5922aFc;
import o.C5941aFv;
import o.C8206ayP;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindServiceViewModel$postRegister$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyScenario $passkeyScenario;
    final /* synthetic */ PasskeySdkResult $result;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyRebindServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindServiceViewModel$postRegister$1(PasskeyScenario passkeyScenario, PasskeySdkResult passkeySdkResult, PasskeyRebindServiceViewModel passkeyRebindServiceViewModel, Continuation<? super PasskeyRebindServiceViewModel$postRegister$1> continuation) {
        super(2, continuation);
        this.$passkeyScenario = passkeyScenario;
        this.$result = passkeySdkResult;
        this.this$0 = passkeyRebindServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyRebindServiceViewModel$postRegister$1(this.$passkeyScenario, this.$result, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyRebindServiceViewModel$postRegister$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Type inference failed for r1v36. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v40. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r2v13. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r6v8. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0295 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v78 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r1;
        PasskeySdkResult passkeySdkResult;
        ?? r12;
        String str;
        boolean z;
        Object objEZpvd;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object obj2;
        ?? r13;
        Object objKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl2;
        Object obj3;
        MutableSharedFlow mutableSharedFlow3;
        String strAYXKKw;
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator;
        AbstractC5991aGs abstractC5991aGs;
        MutableSharedFlow mutableSharedFlow4;
        Boolean boolKWHzl3;
        MutableSharedFlow mutableSharedFlow5;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                PasskeyScenario passkeyScenario = this.$passkeyScenario;
                PasskeyScenario.CedefiWallet cedefiWallet = passkeyScenario instanceof PasskeyScenario.CedefiWallet ? (PasskeyScenario.CedefiWallet) passkeyScenario : null;
                ?? OLrzqt = cedefiWallet != null ? cedefiWallet.OLrzqt() : 0;
                C5922aFc.log$default(C5922aFc.KWHzl, "[REBIND]", null, "post register result: " + this.$result + " scenario: " + this.$passkeyScenario + " isWalletRecovery: " + OLrzqt, 2, null);
                MutableSharedFlow mutableSharedFlow6 = this.this$0.AYXKKw;
                Boolean boolKWHzl4 = C56443yFo.KWHzl(false);
                this.I$0 = OLrzqt;
                this.label = 1;
                if (mutableSharedFlow6.emit(boolKWHzl4, this) == objCopydefault) {
                    return objCopydefault;
                }
                r1 = OLrzqt;
                passkeySdkResult = this.$result;
                if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
                    MutableSharedFlow mutableSharedFlow7 = this.this$0.AYXKKw;
                    Boolean boolKWHzl5 = C56443yFo.KWHzl(true);
                    this.I$0 = r1;
                    this.label = 2;
                    r12 = r1;
                    if (mutableSharedFlow7.emit(boolKWHzl5, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5906aFM c5906aFM = this.this$0.getNewProxyInstance;
                    String strCopydefault = ((PasskeySdkResult.SuccessWithJson) this.$result).copydefault();
                    String str2 = (String) this.this$0.AuCTel.getValue();
                    str = str2 != null ? str2 : "";
                    z = r12 != 0;
                    this.label = 3;
                    objEZpvd = c5906aFM.EZpvd(strCopydefault, str, z, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow = this.this$0.AYXKKw;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = objEZpvd;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objEZpvd;
                    this.this$0.copydefault(obj2);
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.SuccessWithPublicKeyCredential) {
                    MutableSharedFlow mutableSharedFlow8 = this.this$0.AYXKKw;
                    Boolean boolKWHzl6 = C56443yFo.KWHzl(true);
                    this.I$0 = r1;
                    this.label = 5;
                    r13 = r1;
                    if (mutableSharedFlow8.emit(boolKWHzl6, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5914aFU c5914aFU = this.this$0.AwvSrB;
                    String str3 = (String) this.this$0.AuCTel.getValue();
                    str = str3 != null ? str3 : "";
                    PublicKeyCredential publicKeyCredentialOLrzqt = ((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt();
                    z = r13 != 0;
                    this.label = 6;
                    objKWHzl = c5914aFU.KWHzl(publicKeyCredentialOLrzqt, str, z, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow2 = this.this$0.AYXKKw;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = objKWHzl;
                    this.label = 7;
                    if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj3 = objKWHzl;
                    this.this$0.copydefault(obj3);
                    return Unit.INSTANCE;
                }
                if (passkeySdkResult instanceof PasskeySdkResult.Failure) {
                    if (((PasskeySdkResult.Failure) passkeySdkResult).AhwBna()) {
                        MutableSharedFlow mutableSharedFlow9 = this.this$0.gEmmrt;
                        Unit unit = Unit.INSTANCE;
                        this.label = 8;
                        if (mutableSharedFlow9.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).copydefault()) {
                        MutableSharedFlow mutableSharedFlow10 = this.this$0.EZpvd;
                        Unit unit2 = Unit.INSTANCE;
                        this.label = 9;
                        if (mutableSharedFlow10.emit(unit2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (((PasskeySdkResult.Failure) this.$result).djBIcL()) {
                        MutableSharedFlow mutableSharedFlow11 = this.this$0.AEQbTJ;
                        Unit unit3 = Unit.INSTANCE;
                        this.label = 10;
                        if (mutableSharedFlow11.emit(unit3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        C5941aFv c5941aFv = this.this$0.iwGUEr;
                        this.label = 11;
                        obj = c5941aFv.copydefault(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        if (((Boolean) obj).booleanValue() || !((PasskeySdkResult.Failure) this.$result).OLrzqt()) {
                            mutableSharedFlow3 = this.this$0.ejfBZ;
                            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                            this.label = 16;
                            if (mutableSharedFlow3.emit(strAYXKKw, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            MutableSharedFlow mutableSharedFlow12 = this.this$0.AYXKKw;
                            Boolean boolKWHzl7 = C56443yFo.KWHzl(true);
                            this.label = 12;
                            if (mutableSharedFlow12.emit(boolKWHzl7, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            C5914aFU c5914aFU2 = this.this$0.AwvSrB;
                            String str4 = (String) this.this$0.AuCTel.getValue();
                            str = str4 != null ? str4 : "";
                            passkeyPromotionAuthenticator = (PasskeyPromotionAuthenticator) this.this$0.OLrzqt.getValue();
                            if (passkeyPromotionAuthenticator == null) {
                                passkeyPromotionAuthenticator = PasskeyPromotionAuthenticator.All.KWHzl;
                            }
                            this.label = 13;
                            obj = c5914aFU2.copydefault(str, passkeyPromotionAuthenticator, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            abstractC5991aGs = (AbstractC5991aGs) obj;
                            mutableSharedFlow4 = this.this$0.AYXKKw;
                            boolKWHzl3 = C56443yFo.KWHzl(false);
                            this.L$0 = abstractC5991aGs;
                            this.label = 14;
                            if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow5 = this.this$0.fIwbmz;
                            this.L$0 = null;
                            this.label = 15;
                            if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                } else if (passkeySdkResult instanceof PasskeySdkResult.AlreadyExisted) {
                    MutableSharedFlow mutableSharedFlow13 = this.this$0.djBIcL;
                    Unit unit4 = Unit.INSTANCE;
                    this.label = 17;
                    if (mutableSharedFlow13.emit(unit4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (!(passkeySdkResult instanceof PasskeySdkResult.CancelledOrVerifiedFail) && !(passkeySdkResult instanceof PasskeySdkResult.NoValidPasskey)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 1:
                int i = this.I$0;
                C56391yDq.AEQbTJ(obj);
                r1 = i;
                passkeySdkResult = this.$result;
                if (!(passkeySdkResult instanceof PasskeySdkResult.SuccessWithJson)) {
                }
                break;
            case 2:
                int i2 = this.I$0;
                C56391yDq.AEQbTJ(obj);
                r12 = i2;
                C5906aFM c5906aFM2 = this.this$0.getNewProxyInstance;
                String strCopydefault2 = ((PasskeySdkResult.SuccessWithJson) this.$result).copydefault();
                String str22 = (String) this.this$0.AuCTel.getValue();
                if (str22 != null) {
                }
                if (r12 != 0) {
                }
                this.label = 3;
                objEZpvd = c5906aFM2.EZpvd(strCopydefault2, str, z, this);
                if (objEZpvd == objCopydefault) {
                }
                mutableSharedFlow = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objEZpvd;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                mutableSharedFlow = this.this$0.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = objEZpvd;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                break;
            case 4:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault(obj2);
                return Unit.INSTANCE;
            case 5:
                int i3 = this.I$0;
                C56391yDq.AEQbTJ(obj);
                r13 = i3;
                C5914aFU c5914aFU3 = this.this$0.AwvSrB;
                String str32 = (String) this.this$0.AuCTel.getValue();
                if (str32 != null) {
                }
                PublicKeyCredential publicKeyCredentialOLrzqt2 = ((PasskeySdkResult.SuccessWithPublicKeyCredential) this.$result).OLrzqt();
                if (r13 != 0) {
                }
                this.label = 6;
                objKWHzl = c5914aFU3.KWHzl(publicKeyCredentialOLrzqt2, str, z, this);
                if (objKWHzl == objCopydefault) {
                }
                mutableSharedFlow2 = this.this$0.AYXKKw;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = objKWHzl;
                this.label = 7;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                mutableSharedFlow2 = this.this$0.AYXKKw;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.L$0 = objKWHzl;
                this.label = 7;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                }
                break;
            case 7:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.copydefault(obj3);
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
                    break;
                }
                mutableSharedFlow3 = this.this$0.ejfBZ;
                strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.RcXXUw);
                this.label = 16;
                if (mutableSharedFlow3.emit(strAYXKKw, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 12:
                C56391yDq.AEQbTJ(obj);
                C5914aFU c5914aFU22 = this.this$0.AwvSrB;
                String str42 = (String) this.this$0.AuCTel.getValue();
                if (str42 != null) {
                }
                passkeyPromotionAuthenticator = (PasskeyPromotionAuthenticator) this.this$0.OLrzqt.getValue();
                if (passkeyPromotionAuthenticator == null) {
                }
                this.label = 13;
                obj = c5914aFU22.copydefault(str, passkeyPromotionAuthenticator, this);
                if (obj == objCopydefault) {
                }
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow4 = this.this$0.AYXKKw;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs;
                this.label = 14;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                }
                mutableSharedFlow5 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 13:
                C56391yDq.AEQbTJ(obj);
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow4 = this.this$0.AYXKKw;
                boolKWHzl3 = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs;
                this.label = 14;
                if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                }
                mutableSharedFlow5 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 14:
                abstractC5991aGs = (AbstractC5991aGs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow5 = this.this$0.fIwbmz;
                this.L$0 = null;
                this.label = 15;
                if (mutableSharedFlow5.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
