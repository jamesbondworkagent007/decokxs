package com.okinc.okex.center.ui.fragment;

import android.content.Context;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45397soy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class PopupAnnouncementDialogFragment$onViewCreated$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelfServiceToolBean $ctaTool;
    int label;
    final /* synthetic */ PopupAnnouncementDialogFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupAnnouncementDialogFragment$onViewCreated$1$1$1(PopupAnnouncementDialogFragment popupAnnouncementDialogFragment, SelfServiceToolBean selfServiceToolBean, Continuation<? super PopupAnnouncementDialogFragment$onViewCreated$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = popupAnnouncementDialogFragment;
        this.$ctaTool = selfServiceToolBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PopupAnnouncementDialogFragment$onViewCreated$1$1$1(this.this$0, this.$ctaTool, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PopupAnnouncementDialogFragment$onViewCreated$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.this$0.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            C45397soy c45397soyDjBIcL = this.this$0.djBIcL();
            SelfServiceToolBean selfServiceToolBean = this.$ctaTool;
            this.label = 1;
            if (C45397soy.invoke$default(c45397soyDjBIcL, context, selfServiceToolBean, null, this, 4, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
