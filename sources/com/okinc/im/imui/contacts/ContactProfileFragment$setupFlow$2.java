package com.okinc.im.imui.contacts;

import com.okinc.im.imui.contacts.ContactProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileFragment$setupFlow$2 extends SuspendLambda implements Function2<ContactProfileViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactProfileFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileFragment$setupFlow$2(ContactProfileFragment contactProfileFragment, Continuation<? super ContactProfileFragment$setupFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactProfileFragment$setupFlow$2 contactProfileFragment$setupFlow$2 = new ContactProfileFragment$setupFlow$2(this.this$0, continuation);
        contactProfileFragment$setupFlow$2.L$0 = obj;
        return contactProfileFragment$setupFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContactProfileViewModel.Activity activity, Continuation<? super Unit> continuation) {
        return ((ContactProfileFragment$setupFlow$2) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ((ContactProfileViewModel.Activity) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
