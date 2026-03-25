package com.okinc.auth.impl.passkey.ui.receive.info;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationInfoViewModel$startCountdownForApproveButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ VerificationInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInfoViewModel$startCountdownForApproveButton$1(VerificationInfoViewModel verificationInfoViewModel, Continuation<? super VerificationInfoViewModel$startCountdownForApproveButton$1> continuation) {
        super(2, continuation);
        this.this$0 = verificationInfoViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerificationInfoViewModel$startCountdownForApproveButton$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VerificationInfoViewModel$startCountdownForApproveButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        VerificationInfoViewModel verificationInfoViewModel;
        int i2;
        VerificationInfoViewModel verificationInfoViewModel2;
        int i3;
        int i4;
        MutableStateFlow mutableStateFlow;
        Integer numAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i5 = this.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = 5;
            this.this$0.EZpvd.setValue(C56443yFo.AEQbTJ(5));
            verificationInfoViewModel = this.this$0;
            i2 = 0;
            if (i2 >= i) {
            }
        } else if (i5 == 1) {
            i4 = this.I$1;
            i3 = this.I$0;
            verificationInfoViewModel2 = (VerificationInfoViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            int iIntValue = ((Number) verificationInfoViewModel2.EZpvd.getValue()).intValue();
            mutableStateFlow = verificationInfoViewModel2.EZpvd;
            numAEQbTJ = C56443yFo.AEQbTJ(iIntValue - 1);
            this.L$0 = verificationInfoViewModel2;
            this.I$0 = i3;
            this.I$1 = i4;
            this.label = 2;
            if (mutableStateFlow.emit(numAEQbTJ, this) == objCopydefault) {
            }
            verificationInfoViewModel = verificationInfoViewModel2;
            int i6 = i3;
            i2 = i4 + 1;
            i = i6;
            if (i2 >= i) {
            }
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.I$1;
            i3 = this.I$0;
            verificationInfoViewModel2 = (VerificationInfoViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            verificationInfoViewModel = verificationInfoViewModel2;
            int i62 = i3;
            i2 = i4 + 1;
            i = i62;
            if (i2 >= i) {
                this.L$0 = verificationInfoViewModel;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                verificationInfoViewModel2 = verificationInfoViewModel;
                int i7 = i2;
                i3 = i;
                i4 = i7;
                int iIntValue2 = ((Number) verificationInfoViewModel2.EZpvd.getValue()).intValue();
                mutableStateFlow = verificationInfoViewModel2.EZpvd;
                numAEQbTJ = C56443yFo.AEQbTJ(iIntValue2 - 1);
                this.L$0 = verificationInfoViewModel2;
                this.I$0 = i3;
                this.I$1 = i4;
                this.label = 2;
                if (mutableStateFlow.emit(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
                verificationInfoViewModel = verificationInfoViewModel2;
                int i622 = i3;
                i2 = i4 + 1;
                i = i622;
                if (i2 >= i) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
