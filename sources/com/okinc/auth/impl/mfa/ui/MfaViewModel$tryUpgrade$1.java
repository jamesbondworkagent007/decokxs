package com.okinc.auth.impl.mfa.ui;

import android.content.Context;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C5945aFz;
import o.pUU;
import uniffi.account.UpgradeType;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel$tryUpgrade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $hasMultipleV1Passkeys;
    final /* synthetic */ RegistrationStartResponse $passkeyUpgradeOptions;
    Object L$0;
    int label;
    final /* synthetic */ MfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaViewModel$tryUpgrade$1(MfaViewModel mfaViewModel, Context context, RegistrationStartResponse registrationStartResponse, boolean z, Continuation<? super MfaViewModel$tryUpgrade$1> continuation) {
        super(2, continuation);
        this.this$0 = mfaViewModel;
        this.$context = context;
        this.$passkeyUpgradeOptions = registrationStartResponse;
        this.$hasMultipleV1Passkeys = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MfaViewModel$tryUpgrade$1(this.this$0, this.$context, this.$passkeyUpgradeOptions, this.$hasMultipleV1Passkeys, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MfaViewModel$tryUpgrade$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5945aFz c5945aFz = this.this$0.fJNWhG;
            Context context = this.$context;
            RegistrationStartResponse registrationStartResponse = this.$passkeyUpgradeOptions;
            this.label = 1;
            objAEQbTJ = c5945aFz.AEQbTJ(context, registrationStartResponse, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolean z = this.$hasMultipleV1Passkeys;
                MfaViewModel mfaViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("MfaViewModel", "finish upgrade error: " + thM7380exceptionOrNullimpl.getMessage() + ", hasMultipleV1Passkeys=" + z);
                    if (z) {
                        MutableSharedFlow mutableSharedFlow = mfaViewModel.values;
                        Unit unit = Unit.INSTANCE;
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableSharedFlow mutableSharedFlow2 = mfaViewModel.AYXKKw;
                        MfaState.Success success = MfaState.Success.AEQbTJ;
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow2.emit(success, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        obj2 = objAEQbTJ;
        boolean z2 = this.$hasMultipleV1Passkeys;
        MfaViewModel mfaViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            pUU.KWHzl("MfaViewModel", "finish upgrade success, hasMultipleV1Passkeys=" + z2);
            if (z2) {
                mfaViewModel2.getFieldNames.copydefault(UpgradeType.ON_DEVICE_MULTIPLE);
                MutableSharedFlow mutableSharedFlow3 = mfaViewModel2.values;
                Unit unit2 = Unit.INSTANCE;
                this.L$0 = obj2;
                this.label = 2;
                if (mutableSharedFlow3.emit(unit2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                mfaViewModel2.getFieldNames.copydefault(UpgradeType.ON_DEVICE_SINGLE);
                MutableSharedFlow mutableSharedFlow4 = mfaViewModel2.AYXKKw;
                MfaState.Success success2 = MfaState.Success.AEQbTJ;
                this.L$0 = obj2;
                this.label = 3;
                if (mutableSharedFlow4.emit(success2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        boolean z3 = this.$hasMultipleV1Passkeys;
        MfaViewModel mfaViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
