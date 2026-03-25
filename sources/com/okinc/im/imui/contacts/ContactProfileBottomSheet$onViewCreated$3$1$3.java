package com.okinc.im.imui.contacts;

import androidx.fragment.app.FragmentActivity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.contacts.ContactProfileFragment;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33764nEz;
import o.C35626nys;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileBottomSheet$onViewCreated$3$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContactProfileFragment.Action $action;
    int label;
    final /* synthetic */ C35626nys this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileBottomSheet$onViewCreated$3$1$3(C35626nys c35626nys, ContactProfileFragment.Action action, Continuation<? super ContactProfileBottomSheet$onViewCreated$3$1$3> continuation) {
        super(2, continuation);
        this.this$0 = c35626nys;
        this.$action = action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactProfileBottomSheet$onViewCreated$3$1$3(this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileBottomSheet$onViewCreated$3$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            OKConversation oKConversationEZpvd = ((ContactProfileFragment.Action.SendMessage) this.$action).EZpvd();
            String contactsId = ((ContactProfileFragment.Action.SendMessage) this.$action).copydefault().getContactsId();
            ChatOrigin chatOrigin = ChatOrigin.CONTACT_INFO;
            String strValueOf = this.this$0.valueOf();
            this.label = 1;
            obj = c33764nEz.KWHzl(fragmentActivityRequireActivity, (22 & 2) != 0 ? null : contactsId, (22 & 4) != 0 ? null : chatOrigin, (22 & 8) != 0 ? null : strValueOf, (22 & 16) != 0 ? null : null, oKConversationEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.dismiss();
            this.this$0.requireActivity().setResult(1001);
        }
        return Unit.INSTANCE;
    }
}
