package com.okinc.auth.impl.mfa.ui.passkey;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5764aCd;
import o.InterfaceC58891zTf;
import o.pUU;
import o.zSM;

/* JADX INFO: loaded from: classes23.dex */
public final class VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MfaScenario $mfaScenario;
    int label;
    final /* synthetic */ VerifyMfaPasskeyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, MfaScenario mfaScenario, Continuation<? super VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = verifyMfaPasskeyViewModel;
        this.$mfaScenario = mfaScenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1(this.this$0, this.$mfaScenario, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final MfaResult mfaResult;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 5;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                mfaResult = (MfaResult) obj;
                if (!(mfaResult instanceof MfaResult.Success)) {
                    MfaResult.Success success = (MfaResult.Success) mfaResult;
                    String strAhwBna = success.KWHzl().AhwBna();
                    if (strAhwBna == null || StringsKt__StringsKt.fARcdN((CharSequence) strAhwBna)) {
                        MutableSharedFlow mutableSharedFlow3 = this.this$0.valueOf;
                        MfaResponse mfaResponseKWHzl = success.KWHzl();
                        this.label = 3;
                        if (mutableSharedFlow3.emit(mfaResponseKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        InterfaceC58891zTf interfaceC58891zTf = this.this$0.djSkpj;
                        String strValues = success.KWHzl().values();
                        String str = strValues != null ? strValues : "";
                        final VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel = this.this$0;
                        interfaceC58891zTf.KWHzl(strAhwBna, str, new zSM() { // from class: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1.2
                            @Override // o.zSM
                            public void copydefault() {
                                pUU.KWHzl("VerifyMfaPasskeyViewModel", "crossDeviceVerify: confirmSync: encryptedPasskey stored successfully");
                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(verifyMfaPasskeyViewModel), null, null, new VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1$1$onSuccess$1(verifyMfaPasskeyViewModel, mfaResult, null), 3, null);
                            }

                            @Override // o.zSM
                            public void EZpvd(String str2) {
                                Intrinsics.checkNotNullParameter(str2, "");
                                pUU.copydefault("VerifyMfaPasskeyViewModel", "crossDeviceVerify: confirmSync: Failed to store encryptedPasskey: " + str2);
                                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(verifyMfaPasskeyViewModel), null, null, new VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1$1$onFailure$1(verifyMfaPasskeyViewModel, mfaResult, null), 3, null);
                            }
                        });
                    }
                } else if (mfaResult instanceof MfaResult.Failure) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.djBIcL;
                    MfaFailure mfaFailureKWHzl = ((MfaResult.Failure) mfaResult).KWHzl();
                    this.label = 4;
                    if (mutableSharedFlow4.emit(mfaFailureKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 5;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5764aCd c5764aCd = this.this$0.zsXlph;
        String str2 = (String) this.this$0.values.getValue();
        String str3 = str2 == null ? "" : str2;
        SubdomainStrategy value = this.this$0.iwGUEr().getValue();
        MfaScenario mfaScenario = this.$mfaScenario;
        this.label = 2;
        obj = c5764aCd.AEQbTJ(str3, null, value, mfaScenario, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        mfaResult = (MfaResult) obj;
        if (!(mfaResult instanceof MfaResult.Success)) {
        }
        mutableSharedFlow = this.this$0.gEmmrt;
        boolKWHzl = C56443yFo.KWHzl(false);
        this.label = 5;
        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
