package com.okinc.im.imui.contacts;

import com.okinc.im.imui.contacts.ContactProfileViewModel;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C44157sFk;
import o.C44269sJo;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$updatePaymentRequiredStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $memberId;
    final /* synthetic */ PaymentRequiredStatus $updatedStatus;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$updatePaymentRequiredStatus$1(ContactProfileViewModel contactProfileViewModel, String str, String str2, PaymentRequiredStatus paymentRequiredStatus, Continuation<? super ContactProfileViewModel$updatePaymentRequiredStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
        this.$groupId = str;
        this.$memberId = str2;
        this.$updatedStatus = paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactProfileViewModel$updatePaymentRequiredStatus$1 contactProfileViewModel$updatePaymentRequiredStatus$1 = new ContactProfileViewModel$updatePaymentRequiredStatus$1(this.this$0, this.$groupId, this.$memberId, this.$updatedStatus, continuation);
        contactProfileViewModel$updatePaymentRequiredStatus$1.L$0 = obj;
        return contactProfileViewModel$updatePaymentRequiredStatus$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$updatePaymentRequiredStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ContactProfileViewModel contactProfileViewModel = this.this$0;
            String str = this.$groupId;
            String str2 = this.$memberId;
            PaymentRequiredStatus paymentRequiredStatus = this.$updatedStatus;
            Result.Application application2 = Result.Companion;
            C44269sJo c44269sJo = contactProfileViewModel.ejfBZ;
            long j = Long.parseLong(str);
            long j2 = Long.parseLong(str2);
            this.label = 1;
            objAEQbTJ = c44269sJo.AEQbTJ(j, j2, paymentRequiredStatus, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl(ContactProfileViewModel.Activity.TaskDescription.EZpvd);
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ContactProfileViewModel", "Error updating payment required status", thM7380exceptionOrNullimpl);
            String strCopydefault = C44157sFk.copydefault(thM7380exceptionOrNullimpl);
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            objM7377constructorimpl = new ContactProfileViewModel.Activity.FragmentManager(strCopydefault);
        }
        MutableSharedFlow mutableSharedFlow = this.this$0.AEQbTJ;
        this.label = 2;
        if (mutableSharedFlow.emit((ContactProfileViewModel.Activity) objM7377constructorimpl, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
