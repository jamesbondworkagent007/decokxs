package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import o.C5772aCl;
import o.C5882aEp;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceListViewModel$onContinueButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $challenge;
    Object L$0;
    int label;
    final /* synthetic */ DeviceListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceListViewModel$onContinueButtonClicked$1(String str, DeviceListViewModel deviceListViewModel, Continuation<? super DeviceListViewModel$onContinueButtonClicked$1> continuation) {
        super(2, continuation);
        this.$challenge = str;
        this.this$0 = deviceListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceListViewModel$onContinueButtonClicked$1(this.$challenge, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceListViewModel$onContinueButtonClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String credentialId;
        Object objKWHzl;
        Object obj2;
        C5772aCl.TaskDescription taskDescription;
        Throwable thM7380exceptionOrNullimpl;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C5882aEp.KWHzl.KWHzl("[Send verification request][Device list]", "on continue button clicked, challenge=" + this.$challenge);
                MutableSharedFlow mutableSharedFlow2 = this.this$0.OLrzqt;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow2.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                String str = this.$challenge;
                AuthenticationStartResponse.AdditionalData value = this.this$0.EZpvd().getValue();
                credentialId = value == null ? value.getCredentialId() : null;
                if (credentialId == null) {
                    credentialId = "";
                }
                C5772aCl.StateListAnimator stateListAnimator = new C5772aCl.StateListAnimator(str, credentialId, "[Send verification request][Device list]");
                C5772aCl c5772aCl = this.this$0.isConnected;
                this.label = 2;
                objKWHzl = c5772aCl.KWHzl(stateListAnimator, (Continuation) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objKWHzl;
                taskDescription = (C5772aCl.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                    DeviceListViewModel deviceListViewModel = this.this$0;
                    if (Intrinsics.EZpvd(taskDescription, C5772aCl.TaskDescription.C0816TaskDescription.AEQbTJ)) {
                        MutableSharedFlow mutableSharedFlow3 = deviceListViewModel.copydefault;
                        AuthenticationStartResponse.AdditionalData value2 = deviceListViewModel.EZpvd().getValue();
                        this.L$0 = obj2;
                        this.label = 3;
                        if (mutableSharedFlow3.emit(value2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (taskDescription instanceof C5772aCl.TaskDescription.ActionBar) {
                        MutableSharedFlow mutableSharedFlow4 = deviceListViewModel.EZpvd;
                        String strOLrzqt = ((C5772aCl.TaskDescription.ActionBar) taskDescription).OLrzqt();
                        this.L$0 = obj2;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(strOLrzqt, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (taskDescription instanceof C5772aCl.TaskDescription.StateListAnimator) {
                        MutableSharedFlow mutableSharedFlow5 = deviceListViewModel.AEQbTJ;
                        MfaFailure mfaFailureKWHzl = ((C5772aCl.TaskDescription.StateListAnimator) taskDescription).KWHzl();
                        this.L$0 = obj2;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(mfaFailureKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    DeviceListViewModel deviceListViewModel2 = this.this$0;
                    C5882aEp.KWHzl.KWHzl("[Send verification request][Device list]", "start cross device verification error, error=" + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow6 = deviceListViewModel2.EZpvd;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    this.L$0 = null;
                    this.label = 6;
                    if (mutableSharedFlow6.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                String str2 = this.$challenge;
                AuthenticationStartResponse.AdditionalData value3 = this.this$0.EZpvd().getValue();
                if (value3 == null) {
                }
                if (credentialId == null) {
                }
                C5772aCl.StateListAnimator stateListAnimator2 = new C5772aCl.StateListAnimator(str2, credentialId, "[Send verification request][Device list]");
                C5772aCl c5772aCl2 = this.this$0.isConnected;
                this.label = 2;
                objKWHzl = c5772aCl2.KWHzl(stateListAnimator2, (Continuation) this);
                if (objKWHzl == objCopydefault) {
                }
                obj2 = objKWHzl;
                taskDescription = (C5772aCl.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                obj2 = objKWHzl;
                taskDescription = (C5772aCl.TaskDescription) (Result.m7383isFailureimpl(obj2) ? null : obj2);
                if (taskDescription != null) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
            case 4:
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
