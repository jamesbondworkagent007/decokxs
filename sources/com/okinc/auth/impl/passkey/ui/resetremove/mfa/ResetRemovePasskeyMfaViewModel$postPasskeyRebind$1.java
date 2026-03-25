package com.okinc.auth.impl.passkey.ui.resetremove.mfa;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.api.passkey.PasskeyRebindState;
import com.okinc.auth.impl.passkey.ui.resetremove.mfa.ResetRemovePasskeyMfaViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyRebindState $passkeyRebindState;
    int label;
    final /* synthetic */ ResetRemovePasskeyMfaViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1(PasskeyRebindState passkeyRebindState, ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel, Continuation<? super ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1> continuation) {
        super(2, continuation);
        this.$passkeyRebindState = passkeyRebindState;
        this.this$0 = resetRemovePasskeyMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1(this.$passkeyRebindState, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeyMfaViewModel$postPasskeyRebind$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PasskeyRebindState passkeyRebindState = this.$passkeyRebindState;
            if (passkeyRebindState instanceof PasskeyRebindState.Success) {
                C5922aFc c5922aFc = C5922aFc.KWHzl;
                ResetRemovePasskeyMfaViewModel.Application application = ResetRemovePasskeyMfaViewModel.Companion;
                C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " resetInit() rebind nextStep: " + ((PasskeyRebindState.Success) this.$passkeyRebindState).OLrzqt(), 2, null);
                String strOLrzqt = ((PasskeyRebindState.Success) this.$passkeyRebindState).OLrzqt();
                if (Intrinsics.EZpvd((Object) strOLrzqt, (Object) "SUCCESS")) {
                    this.this$0.DbNXlk.setValue(new C32989mnw(Unit.INSTANCE));
                } else if (Intrinsics.EZpvd((Object) strOLrzqt, (Object) "UPLOAD_DOCUMENTS")) {
                    MutableLiveData mutableLiveData = this.this$0.AkhnZx;
                    String str = (String) this.this$0.OLrzqt.getValue();
                    if (str == null) {
                        str = "";
                    }
                    mutableLiveData.setValue(new C32989mnw(C56390yDp.OLrzqt(str, ((PasskeyRebindState.Success) this.$passkeyRebindState).copydefault())));
                } else {
                    String str2 = "postPasskeyRebind nextStep is " + ((PasskeyRebindState.Success) this.$passkeyRebindState).OLrzqt();
                    ResetRemovePasskeyMfaViewModel resetRemovePasskeyMfaViewModel = this.this$0;
                    C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, application.EZpvd() + " " + str2, 2, null);
                    resetRemovePasskeyMfaViewModel.djBIcL.setValue(str2);
                }
            } else if (passkeyRebindState instanceof PasskeyRebindState.AlreadyExisted) {
                this.this$0.EZpvd.setValue(new C32989mnw(Unit.INSTANCE));
            } else {
                this.this$0.djBIcL.setValue(null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
