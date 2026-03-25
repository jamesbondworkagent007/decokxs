package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.InitiateMfaSessionResponse;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C5905aFL;
import o.C5922aFc;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResetRemovePasskeySelectionActivity.ResetRemoveResponse $resetRemoveResponse;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1(ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponse, ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, Continuation<? super ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1> continuation) {
        super(2, continuation);
        this.$resetRemoveResponse = resetRemoveResponse;
        this.this$0 = resetRemovePasskeyMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1(this.$resetRemoveResponse, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$postResetRemoveSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel;
        Pair pairOLrzqt;
        PasskeyResetRemoveType passkeyResetRemoveType;
        Object objCopydefault;
        PasskeyMfaInitialOperation passkeyMfaInitialOperation;
        boolean zBooleanValue;
        Object objValueOf;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel2;
        Object objKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl2;
        Object obj2;
        ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel3;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ResetRemovePasskeySelectionActivity.ResetRemoveResponse resetRemoveResponse = this.$resetRemoveResponse;
            resetRemovePasskeyMfaViewModel = this.this$0;
            if (resetRemoveResponse instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleReset) {
                pairOLrzqt = C56390yDp.OLrzqt(new PasskeyResetRemoveType.Reset(null, null, false, 7, null), C56402yEa.EZpvd(((ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleReset) resetRemoveResponse).OLrzqt()));
            } else if (resetRemoveResponse instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleRemove) {
                pairOLrzqt = C56390yDp.OLrzqt(new PasskeyResetRemoveType.Remove(null, null, false, 7, null), C56402yEa.EZpvd(((ResetRemovePasskeySelectionActivity.ResetRemoveResponse.SingleRemove) resetRemoveResponse).EZpvd()));
            } else if (resetRemoveResponse instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchReset) {
                pairOLrzqt = C56390yDp.OLrzqt(PasskeyResetRemoveType.BatchReset.EZpvd, ((ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchReset) resetRemoveResponse).copydefault());
            } else {
                if (!(resetRemoveResponse instanceof ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchRemove)) {
                    throw new NoWhenBranchMatchedException();
                }
                pairOLrzqt = C56390yDp.OLrzqt(PasskeyResetRemoveType.BatchRemove.AEQbTJ, ((ResetRemovePasskeySelectionActivity.ResetRemoveResponse.BatchRemove) resetRemoveResponse).OLrzqt());
            }
            passkeyResetRemoveType = (PasskeyResetRemoveType) pairOLrzqt.component1();
            resetRemovePasskeyMfaViewModel.AEQbTJ.setValue(C56390yDp.OLrzqt(passkeyResetRemoveType, (List) pairOLrzqt.component2()));
            C5922aFc c5922aFc = C5922aFc.KWHzl;
            ResetRemovePasskeyMfaViewModel.Application application = ResetRemovePasskeyMfaViewModel.Companion;
            C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " cached: " + resetRemovePasskeyMfaViewModel.AEQbTJ.getValue(), 2, null);
            C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " isForceIncompatibleForPasskeyError: " + resetRemovePasskeyMfaViewModel.AkhnZx(), 2, null);
            if (!resetRemovePasskeyMfaViewModel.AkhnZx()) {
                InterfaceC8196ayF interfaceC8196ayF = resetRemovePasskeyMfaViewModel.fARcdN;
                PasskeyScenario.Account account = PasskeyScenario.Account.AEQbTJ;
                this.L$0 = resetRemovePasskeyMfaViewModel;
                this.L$1 = passkeyResetRemoveType;
                this.label = 1;
                objCopydefault = interfaceC8196ayF.copydefault(account, true, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                passkeyMfaInitialOperation = PasskeyMfaInitialOperation.RESET_NO_REBIND;
                C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " mfa init with operation: " + passkeyMfaInitialOperation, 2, null);
                mutableSharedFlow = resetRemovePasskeyMfaViewModel.AYXKKw;
                boolKWHzl = C56443yFo.KWHzl(true);
                this.L$0 = resetRemovePasskeyMfaViewModel;
                this.L$1 = passkeyMfaInitialOperation;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
                }
            }
        } else if (i == 1) {
            PasskeyResetRemoveType passkeyResetRemoveType2 = (PasskeyResetRemoveType) this.L$1;
            resetRemovePasskeyMfaViewModel = (ResetRemovePasskeyMfaViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            passkeyResetRemoveType = passkeyResetRemoveType2;
            objCopydefault = obj;
        } else if (i == 2) {
            zBooleanValue = this.Z$0;
            PasskeyResetRemoveType passkeyResetRemoveType3 = (PasskeyResetRemoveType) this.L$1;
            resetRemovePasskeyMfaViewModel = (ResetRemovePasskeyMfaViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            passkeyResetRemoveType = passkeyResetRemoveType3;
            objValueOf = obj;
            boolean zBooleanValue2 = ((Boolean) objValueOf).booleanValue();
            C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " isPasskeyAuthenticateSupported:" + zBooleanValue + " isPasskeyRegisterSupported:" + zBooleanValue2, 2, null);
            if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.Remove) {
                if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.BatchRemove) {
                    passkeyMfaInitialOperation = PasskeyMfaInitialOperation.RESET_NO_REBIND;
                } else {
                    if (!(passkeyResetRemoveType instanceof PasskeyResetRemoveType.Reset) && !(passkeyResetRemoveType instanceof PasskeyResetRemoveType.BatchReset)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zBooleanValue2) {
                        passkeyMfaInitialOperation = PasskeyMfaInitialOperation.RESET;
                    } else {
                        passkeyMfaInitialOperation = PasskeyMfaInitialOperation.RESET_NO_REBIND;
                    }
                }
            } else if (zBooleanValue) {
                passkeyMfaInitialOperation = PasskeyMfaInitialOperation.REMOVE;
            } else {
                passkeyMfaInitialOperation = PasskeyMfaInitialOperation.RESET_NO_REBIND;
            }
            C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " mfa init with operation: " + passkeyMfaInitialOperation, 2, null);
            mutableSharedFlow = resetRemovePasskeyMfaViewModel.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(true);
            this.L$0 = resetRemovePasskeyMfaViewModel;
            this.L$1 = passkeyMfaInitialOperation;
            this.label = 3;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
                return objCopydefault2;
            }
            resetRemovePasskeyMfaViewModel2 = resetRemovePasskeyMfaViewModel;
            C5905aFL c5905aFL = resetRemovePasskeyMfaViewModel2.iwGUEr;
            String string = passkeyMfaInitialOperation.toString();
            this.L$0 = resetRemovePasskeyMfaViewModel2;
            this.L$1 = null;
            this.label = 4;
            objKWHzl = c5905aFL.KWHzl(string, this);
            if (objKWHzl == objCopydefault2) {
            }
            mutableSharedFlow2 = resetRemovePasskeyMfaViewModel2.AYXKKw;
            boolKWHzl2 = C56443yFo.KWHzl(false);
            this.L$0 = resetRemovePasskeyMfaViewModel2;
            this.L$1 = objKWHzl;
            this.label = 5;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
            }
        } else {
            if (i != 3) {
                if (i == 4) {
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel4 = (ResetRemovePasskeyMfaViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    resetRemovePasskeyMfaViewModel2 = resetRemovePasskeyMfaViewModel4;
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    mutableSharedFlow2 = resetRemovePasskeyMfaViewModel2.AYXKKw;
                    boolKWHzl2 = C56443yFo.KWHzl(false);
                    this.L$0 = resetRemovePasskeyMfaViewModel2;
                    this.L$1 = objKWHzl;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    obj2 = objKWHzl;
                    resetRemovePasskeyMfaViewModel3 = resetRemovePasskeyMfaViewModel2;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$1;
                resetRemovePasskeyMfaViewModel3 = (ResetRemovePasskeyMfaViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7384isSuccessimpl(obj2)) {
                    InitiateMfaSessionResponse initiateMfaSessionResponse = (InitiateMfaSessionResponse) obj2;
                    C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " init mfa nextStep: " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), 2, null);
                    if (!Intrinsics.EZpvd((Object) (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null), (Object) "MFA_VERIFICATION")) {
                        resetRemovePasskeyMfaViewModel3.djBIcL.setValue("nextStep: " + (initiateMfaSessionResponse != null ? initiateMfaSessionResponse.getNextStep() : null));
                    } else {
                        String business = initiateMfaSessionResponse.getBusiness();
                        if (business == null) {
                            business = "";
                        }
                        resetRemovePasskeyMfaViewModel3.AEQbTJ(business);
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc c5922aFc2 = C5922aFc.KWHzl;
                    String strEZpvd = ResetRemovePasskeyMfaViewModel.Companion.EZpvd();
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C5922aFc.log$default(c5922aFc2, "[RESET/REMOVE]", null, strEZpvd + " checkResetStatus() mfaInitUseCase: " + message, 2, null);
                    MutableLiveData mutableLiveData = resetRemovePasskeyMfaViewModel3.djBIcL;
                    String message2 = thM7380exceptionOrNullimpl.getMessage();
                    mutableLiveData.setValue(message2 != null ? message2 : "");
                }
                return Unit.INSTANCE;
            }
            passkeyMfaInitialOperation = (PasskeyMfaInitialOperation) this.L$1;
            resetRemovePasskeyMfaViewModel2 = (ResetRemovePasskeyMfaViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C5905aFL c5905aFL2 = resetRemovePasskeyMfaViewModel2.iwGUEr;
            String string2 = passkeyMfaInitialOperation.toString();
            this.L$0 = resetRemovePasskeyMfaViewModel2;
            this.L$1 = null;
            this.label = 4;
            objKWHzl = c5905aFL2.KWHzl(string2, this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
            mutableSharedFlow2 = resetRemovePasskeyMfaViewModel2.AYXKKw;
            boolKWHzl2 = C56443yFo.KWHzl(false);
            this.L$0 = resetRemovePasskeyMfaViewModel2;
            this.L$1 = objKWHzl;
            this.label = 5;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault2) {
            }
        }
        zBooleanValue = ((Boolean) objCopydefault).booleanValue();
        InterfaceC8196ayF interfaceC8196ayF2 = resetRemovePasskeyMfaViewModel.fARcdN;
        this.L$0 = resetRemovePasskeyMfaViewModel;
        this.L$1 = passkeyResetRemoveType;
        this.Z$0 = zBooleanValue;
        this.label = 2;
        objValueOf = interfaceC8196ayF2.valueOf(this);
        if (objValueOf == objCopydefault2) {
            return objCopydefault2;
        }
        boolean zBooleanValue22 = ((Boolean) objValueOf).booleanValue();
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " isPasskeyAuthenticateSupported:" + zBooleanValue + " isPasskeyRegisterSupported:" + zBooleanValue22, 2, null);
        if (passkeyResetRemoveType instanceof PasskeyResetRemoveType.Remove) {
        }
        C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, ResetRemovePasskeyMfaViewModel.Companion.EZpvd() + " mfa init with operation: " + passkeyMfaInitialOperation, 2, null);
        mutableSharedFlow = resetRemovePasskeyMfaViewModel.AYXKKw;
        boolKWHzl = C56443yFo.KWHzl(true);
        this.L$0 = resetRemovePasskeyMfaViewModel;
        this.L$1 = passkeyMfaInitialOperation;
        this.label = 3;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault2) {
        }
    }
}
